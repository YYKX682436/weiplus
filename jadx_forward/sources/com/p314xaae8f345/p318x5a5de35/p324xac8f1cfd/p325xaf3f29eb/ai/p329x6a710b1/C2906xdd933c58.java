package com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1;

/* renamed from: com.tencent.cloud.component.common.ai.utils.CloudCrashHandler */
/* loaded from: classes12.dex */
public class C2906xdd933c58 implements java.lang.Thread.UncaughtExceptionHandler {
    public static java.lang.String TAG;

    /* renamed from: crashHandler */
    public static com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2906xdd933c58 f9891x321a71a3;

    /* renamed from: curDate */
    public static java.util.Date f9892x4316c60e;

    /* renamed from: formatter */
    public static java.text.SimpleDateFormat f9893x6bfab0ca = new java.text.SimpleDateFormat("yyyyMMddHHmmss");
    public static java.lang.String str;

    /* renamed from: _hellAccFlag_ */
    private byte f9894x7f11beae;

    /* renamed from: contextWeakReference */
    public java.lang.ref.WeakReference<android.content.Context> f9895x17489544;

    /* renamed from: crashListeners */
    public java.util.List<com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p326xf5bc2045.InterfaceC2895x90f0255b> f9897xc8cdba58;

    /* renamed from: defaultHandler */
    public java.lang.Thread.UncaughtExceptionHandler f9898xa0bfbdc9;

    /* renamed from: infos */
    public java.util.Map<java.lang.String, java.lang.String> f9900x5fb3185 = new java.util.HashMap();

    /* renamed from: crashInfoTag */
    public java.lang.String f9896x7cc39665 = com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.f7335x31ce7ede;

    /* renamed from: isFilter */
    public boolean f9901xdc35bd42 = false;

    /* renamed from: filterString */
    public java.lang.String f9899x7f2a9da9 = "";

    /* renamed from: isReleaseType */
    public boolean f9902xb8ac6c57 = false;

    /* renamed from: isWriterCrash */
    public volatile boolean f9903x32553b6a = false;

    static {
        java.util.Date date = new java.util.Date(java.lang.System.currentTimeMillis());
        f9892x4316c60e = date;
        str = f9893x6bfab0ca.format(date);
        TAG = "CloudCrashHandler";
    }

    /* renamed from: collectDeviceInfo */
    private void m21703x62742cee(android.content.Context context) {
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 1);
            if (packageInfo != null) {
                java.lang.String str2 = packageInfo.versionName;
                if (str2 == null) {
                    str2 = "null";
                }
                java.lang.String str3 = packageInfo.versionCode + "";
                this.f9900x5fb3185.put("versionName", str2);
                this.f9900x5fb3185.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56321xa96d32a5, str3);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: getContext */
    private android.content.Context m21704x76847179() {
        java.lang.ref.WeakReference<android.content.Context> weakReference = this.f9895x17489544;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: getUncaughtDefaultHandler */
    private java.lang.Thread.UncaughtExceptionHandler m21705xda84ac74() {
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f9898xa0bfbdc9;
        if (uncaughtExceptionHandler == null) {
            return null;
        }
        return uncaughtExceptionHandler;
    }

    /* renamed from: handleException */
    private boolean m21706x9514ef07(java.lang.Throwable th6) {
        android.content.Context m21704x76847179;
        if (th6 == null || (m21704x76847179 = m21704x76847179()) == null || this.f9903x32553b6a) {
            return false;
        }
        this.f9903x32553b6a = true;
        m21703x62742cee(m21704x76847179);
        m21708x6745efd6(m21704x76847179, th6);
        return false;
    }

    /* renamed from: instance */
    public static com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2906xdd933c58 m21707x21169495() {
        if (f9891x321a71a3 == null) {
            f9891x321a71a3 = new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2906xdd933c58();
        }
        return f9891x321a71a3;
    }

    /* renamed from: saveCrashInfo2File */
    private java.lang.String m21708x6745efd6(android.content.Context context, java.lang.Throwable th6) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.f9900x5fb3185.entrySet()) {
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
            if (this.f9901xdc35bd42 && !obj.contains(this.f9899x7f2a9da9)) {
                return "";
            }
            m21709x4826a284(obj);
            stringBuffer.append(obj);
            java.lang.String stringBuffer2 = stringBuffer.toString();
            if (this.f9902xb8ac6c57) {
                return "";
            }
            java.io.File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(externalCacheDir);
                java.lang.String str3 = java.io.File.separator;
                sb6.append(str3);
                sb6.append(this.f9896x7cc39665);
                sb6.append(str3);
                str2 = sb6.toString();
            }
            if (android.text.TextUtils.isEmpty(str2)) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(context.getCacheDir().getAbsolutePath());
                java.lang.String str4 = java.io.File.separator;
                sb7.append(str4);
                sb7.append(this.f9896x7cc39665);
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

    /* renamed from: sendCrashCallBack */
    private void m21709x4826a284(java.lang.String str2) {
        java.util.List<com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p326xf5bc2045.InterfaceC2895x90f0255b> list = this.f9897xc8cdba58;
        if (list == null) {
            return;
        }
        java.util.Iterator<com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p326xf5bc2045.InterfaceC2895x90f0255b> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo21606xaf6e3908(str2);
        }
    }

    /* renamed from: addCrashListener */
    public void m21710x5d8d7a5a(com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p326xf5bc2045.InterfaceC2895x90f0255b interfaceC2895x90f0255b) {
        if (this.f9897xc8cdba58 == null) {
            this.f9897xc8cdba58 = new java.util.ArrayList();
        }
        this.f9897xc8cdba58.add(interfaceC2895x90f0255b);
    }

    /* renamed from: init */
    public void m21711x316510(android.content.Context context, java.lang.String str2, boolean z17, java.lang.String str3, boolean z18) {
        this.f9895x17489544 = new java.lang.ref.WeakReference<>(context);
        this.f9896x7cc39665 = str2;
        this.f9902xb8ac6c57 = z18;
        this.f9901xdc35bd42 = z17;
        this.f9899x7f2a9da9 = str3;
        this.f9903x32553b6a = false;
        this.f9898xa0bfbdc9 = java.lang.Thread.getDefaultUncaughtExceptionHandler();
        java.lang.Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th6) {
        m21706x9514ef07(th6);
        java.lang.Thread.UncaughtExceptionHandler m21705xda84ac74 = m21705xda84ac74();
        if (m21705xda84ac74 != null) {
            m21705xda84ac74.uncaughtException(thread, th6);
            return;
        }
        try {
            java.lang.Thread.sleep(1000L);
        } catch (java.lang.InterruptedException unused) {
        }
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
