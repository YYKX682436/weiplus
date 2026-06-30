package com.tencent.cloud.component.common.ai.utils;

/* loaded from: classes12.dex */
public class CloudCrashHandler implements java.lang.Thread.UncaughtExceptionHandler {
    public static java.lang.String TAG;
    public static com.tencent.cloud.component.common.ai.utils.CloudCrashHandler crashHandler;
    public static java.util.Date curDate;
    public static java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyyMMddHHmmss");
    public static java.lang.String str;
    private byte _hellAccFlag_;
    public java.lang.ref.WeakReference<android.content.Context> contextWeakReference;
    public java.util.List<com.tencent.cloud.component.common.ai.callback.CrashListener> crashListeners;
    public java.lang.Thread.UncaughtExceptionHandler defaultHandler;
    public java.util.Map<java.lang.String, java.lang.String> infos = new java.util.HashMap();
    public java.lang.String crashInfoTag = com.google.android.gms.measurement.AppMeasurement.CRASH_ORIGIN;
    public boolean isFilter = false;
    public java.lang.String filterString = "";
    public boolean isReleaseType = false;
    public volatile boolean isWriterCrash = false;

    static {
        java.util.Date date = new java.util.Date(java.lang.System.currentTimeMillis());
        curDate = date;
        str = formatter.format(date);
        TAG = "CloudCrashHandler";
    }

    private void collectDeviceInfo(android.content.Context context) {
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 1);
            if (packageInfo != null) {
                java.lang.String str2 = packageInfo.versionName;
                if (str2 == null) {
                    str2 = "null";
                }
                java.lang.String str3 = packageInfo.versionCode + "";
                this.infos.put("versionName", str2);
                this.infos.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.VERSIONCODE, str3);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
    }

    private android.content.Context getContext() {
        java.lang.ref.WeakReference<android.content.Context> weakReference = this.contextWeakReference;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private java.lang.Thread.UncaughtExceptionHandler getUncaughtDefaultHandler() {
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.defaultHandler;
        if (uncaughtExceptionHandler == null) {
            return null;
        }
        return uncaughtExceptionHandler;
    }

    private boolean handleException(java.lang.Throwable th6) {
        android.content.Context context;
        if (th6 == null || (context = getContext()) == null || this.isWriterCrash) {
            return false;
        }
        this.isWriterCrash = true;
        collectDeviceInfo(context);
        saveCrashInfo2File(context, th6);
        return false;
    }

    public static com.tencent.cloud.component.common.ai.utils.CloudCrashHandler instance() {
        if (crashHandler == null) {
            crashHandler = new com.tencent.cloud.component.common.ai.utils.CloudCrashHandler();
        }
        return crashHandler;
    }

    private java.lang.String saveCrashInfo2File(android.content.Context context, java.lang.Throwable th6) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.infos.entrySet()) {
            stringBuffer.append(entry.getKey() + "=" + entry.getValue() + "\n");
        }
        try {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
            th6.printStackTrace(printWriter);
            for (java.lang.Throwable cause = th6.getCause(); cause != null; cause = cause.getCause()) {
                cause.printStackTrace(printWriter);
            }
            printWriter.close();
            java.lang.String obj = stringWriter.toString();
            stringWriter.close();
            java.lang.String str2 = "";
            if (android.text.TextUtils.isEmpty(obj)) {
                return "";
            }
            if (this.isFilter && !obj.contains(this.filterString)) {
                return "";
            }
            sendCrashCallBack(obj);
            stringBuffer.append(obj);
            java.lang.String stringBuffer2 = stringBuffer.toString();
            if (this.isReleaseType) {
                return "";
            }
            java.io.File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(externalCacheDir);
                java.lang.String str3 = java.io.File.separator;
                sb6.append(str3);
                sb6.append(this.crashInfoTag);
                sb6.append(str3);
                str2 = sb6.toString();
            }
            if (android.text.TextUtils.isEmpty(str2)) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(context.getCacheDir().getAbsolutePath());
                java.lang.String str4 = java.io.File.separator;
                sb7.append(str4);
                sb7.append(this.crashInfoTag);
                sb7.append(str4);
                str2 = sb7.toString();
            }
            java.lang.String str5 = "crash-" + str + "-" + java.lang.System.currentTimeMillis() + ".log";
            java.io.File file = new java.io.File(str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(str2 + str5);
            fileOutputStream.write(stringBuffer2.getBytes());
            fileOutputStream.close();
            return str5;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private void sendCrashCallBack(java.lang.String str2) {
        java.util.List<com.tencent.cloud.component.common.ai.callback.CrashListener> list = this.crashListeners;
        if (list == null) {
            return;
        }
        java.util.Iterator<com.tencent.cloud.component.common.ai.callback.CrashListener> it = list.iterator();
        while (it.hasNext()) {
            it.next().onCrash(str2);
        }
    }

    public void addCrashListener(com.tencent.cloud.component.common.ai.callback.CrashListener crashListener) {
        if (this.crashListeners == null) {
            this.crashListeners = new java.util.ArrayList();
        }
        this.crashListeners.add(crashListener);
    }

    public void init(android.content.Context context, java.lang.String str2, boolean z17, java.lang.String str3, boolean z18) {
        this.contextWeakReference = new java.lang.ref.WeakReference<>(context);
        this.crashInfoTag = str2;
        this.isReleaseType = z18;
        this.isFilter = z17;
        this.filterString = str3;
        this.isWriterCrash = false;
        this.defaultHandler = java.lang.Thread.getDefaultUncaughtExceptionHandler();
        java.lang.Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th6) {
        handleException(th6);
        java.lang.Thread.UncaughtExceptionHandler uncaughtDefaultHandler = getUncaughtDefaultHandler();
        if (uncaughtDefaultHandler != null) {
            uncaughtDefaultHandler.uncaughtException(thread, th6);
            return;
        }
        try {
            java.lang.Thread.sleep(1000L);
        } catch (java.lang.InterruptedException unused) {
        }
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/cloud/component/common/ai/utils/CloudCrashHandler", "uncaughtException", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/cloud/component/common/ai/utils/CloudCrashHandler", "uncaughtException", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(1);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/cloud/component/common/ai/utils/CloudCrashHandler", "uncaughtException", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "java/lang/System_EXEC_", "exit", "(I)V");
        java.lang.System.exit(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(obj2, "com/tencent/cloud/component/common/ai/utils/CloudCrashHandler", "uncaughtException", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "java/lang/System_EXEC_", "exit", "(I)V");
    }
}
