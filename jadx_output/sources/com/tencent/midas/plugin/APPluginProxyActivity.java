package com.tencent.midas.plugin;

/* loaded from: classes13.dex */
public class APPluginProxyActivity extends com.tencent.mm.hellhoundlib.activities.HellActivity {
    private static final java.lang.String TAG = "APPluginProxyActivity";
    private static boolean cutOutEnable = false;
    private static java.lang.String gPluginApkFilePath = null;
    protected static java.lang.String gPluginName = "MidasPay";
    public static boolean mAppForground = true;
    private static java.lang.reflect.Field sMMapField;
    private static java.lang.reflect.Method sUnparcelMethod;
    private java.lang.String mLaunchActivity = null;
    private com.tencent.midas.plugin.IAPPluginActivity mPluginActivity = null;
    private java.lang.String mPluginApkFilePath = null;
    private java.lang.String mPluginName = null;
    protected int mStopFlag = 0;
    protected java.lang.String mCreateErrorInfo = null;

    private java.lang.String initPlugin() {
        android.content.pm.PackageInfo packageInfo = com.tencent.midas.plugin.APPluginStatic.sPackageInfoMap.get(this.mPluginApkFilePath);
        if (packageInfo == null) {
            packageInfo = com.tencent.midas.plugin.APApkFileParser.getPackageInfo(this, this.mPluginApkFilePath, 1);
            if (packageInfo == null) {
                return "Get Package Info Failed!";
            }
            if (android.os.Build.VERSION.SDK_INT >= 28 && com.tencent.midas.plugin.APPluginUtils.isInNewProcess(this)) {
                try {
                    android.webkit.WebView.setDataDirectorySuffix("midaspay");
                } catch (java.lang.Throwable unused) {
                }
            }
            try {
                if (!com.tencent.midas.jsbridge.APX5.isX5WebView(this)) {
                    new android.webkit.WebView(this);
                }
                packageInfo.applicationInfo.sharedLibraryFiles = getApplicationInfo().sharedLibraryFiles;
                packageInfo.applicationInfo.sourceDir = getApplicationInfo().sourceDir;
                packageInfo.applicationInfo.publicSourceDir = getApplicationInfo().publicSourceDir;
            } catch (java.lang.Exception unused2) {
            }
            com.tencent.midas.plugin.APPluginStatic.sPackageInfoMap.put(this.mPluginApkFilePath, packageInfo);
        }
        android.content.pm.PackageInfo packageInfo2 = packageInfo;
        java.lang.String str = this.mLaunchActivity;
        if (str == null || str.length() == 0) {
            android.content.pm.ActivityInfo[] activityInfoArr = packageInfo2.activities;
            if (activityInfoArr == null || activityInfoArr.length == 0) {
                return "Activity Not Found!";
            }
            this.mLaunchActivity = activityInfoArr[0].name;
        }
        dalvik.system.DexClassLoader orCreateClassLoaderByPath = com.tencent.midas.plugin.APPluginLoader.getOrCreateClassLoaderByPath(this, this.mPluginName, this.mPluginApkFilePath);
        getIntent().setExtrasClassLoader(orCreateClassLoaderByPath);
        com.tencent.midas.plugin.IAPPluginActivity iAPPluginActivity = (com.tencent.midas.plugin.IAPPluginActivity) orCreateClassLoaderByPath.loadClass(this.mLaunchActivity).newInstance();
        this.mPluginActivity = iAPPluginActivity;
        iAPPluginActivity.IInit(this.mPluginName, this.mPluginApkFilePath, this, orCreateClassLoaderByPath, packageInfo2);
        this.mPluginActivity.ISetIntent(getIntent());
        return null;
    }

    public static boolean isMoveTaskToBack(android.content.Context context, android.content.Intent intent) {
        return intent.getComponent() == null || !intent.getComponent().getPackageName().equals(context.getPackageName());
    }

    private boolean isStart3rdApp(android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        if (!android.text.TextUtils.isEmpty(action) && action.equals("android.media.action.IMAGE_CAPTURE")) {
            return true;
        }
        if (!android.text.TextUtils.isEmpty(action) && action.equals("android.intent.action.GET_CONTENT")) {
            return true;
        }
        android.content.ComponentName component = intent.getComponent();
        if (component == null) {
            return false;
        }
        java.lang.String packageName = component.getPackageName();
        if (!android.text.TextUtils.isEmpty(packageName) && packageName.equals("com.tencent.midas.pay")) {
            return true;
        }
        java.lang.String className = component.getClassName();
        return !android.text.TextUtils.isEmpty(className) && className.equals("com.qzone");
    }

    private void logStartPluginErrInfo(java.lang.String str) {
        if (!str.contains("permission") && !str.contains("filenotfoundexception")) {
            if (str.contains("resources$notfoundexception") || str.contains("resourcesnotfoundexception")) {
                return;
            }
            str.contains("classnotfoundexception");
            return;
        }
        com.tencent.midas.comm.APLog.i("logStartPluginErrInfo", "mPluginApkFilePath" + this.mPluginApkFilePath);
        android.content.pm.ApplicationInfo applicationInfo = getApplicationInfo();
        if (applicationInfo != null) {
            int i17 = applicationInfo.flags;
            com.tencent.midas.comm.APLog.d("", "UID: " + applicationInfo.uid + ", IsSystemApp: " + ((i17 & 1) > 0) + ", IsUpdateSystemApp: " + ((i17 & 128) > 0));
        }
    }

    public static void openActivityForResult(android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, android.content.Intent intent, int i17) {
        com.tencent.midas.comm.APLog.i("APPLuginProxyActivity", "APPluginProxyActivity openActivityForResult pluginName：" + str);
        com.tencent.midas.comm.APLog.i("APPLuginProxyActivity", "APPluginProxyActivity openActivityForResult contextActivity：" + activity);
        com.tencent.midas.comm.APLog.i("APPLuginProxyActivity", "APPluginProxyActivity openActivityForResult apkFilePath：" + str2);
        com.tencent.midas.comm.APLog.i("APPLuginProxyActivity", "APPluginProxyActivity openActivityForResult startIntent：".concat(intent.getClass().getSimpleName()));
        com.tencent.midas.comm.APLog.i("APPLuginProxyActivity", "APPluginProxyActivity openActivityForResult startIntent：" + intent.getClass().getCanonicalName());
        com.tencent.midas.comm.APLog.i("APPLuginProxyActivity", "APPluginProxyActivity openActivityForResult startIntent：" + intent.getClass().getClassLoader());
        gPluginName = str;
        try {
            gPluginApkFilePath = com.tencent.midas.plugin.APPluginInstallerAndUpdater.getInstallPath(activity, str).getCanonicalPath();
        } catch (java.io.IOException unused) {
        }
        intent.putExtra(com.tencent.midas.plugin.APPluginStatic.PARAM_PLUGIN_NAME, str);
        intent.putExtra(com.tencent.midas.plugin.APPluginStatic.PARAM_LAUNCH_ACTIVITY, str3);
        intent.putExtra(com.tencent.midas.plugin.APPluginStatic.PARAM_PLUGIN_PATH, str2);
        com.tencent.midas.comm.APLog.d("APPLuginProxyActivity", "put is new process: " + com.tencent.midas.control.APMidasPayHelper.isNewProcess);
        com.tencent.midas.comm.APLog.d("APPLuginProxyActivity", "put is log enable: " + com.tencent.midas.control.APMidasPayHelper.isLogEnable());
        intent.putExtra(com.tencent.midas.plugin.APPluginStatic.PARAM_PLUGIN_IS_NEW_PROCESS, com.tencent.midas.control.APMidasPayHelper.isNewProcess);
        intent.putExtra(com.tencent.midas.plugin.APPluginStatic.PARAM_PLUGIN_LOG_ENABLE, com.tencent.midas.control.APMidasPayHelper.isLogEnable());
        intent.putExtra(com.tencent.midas.plugin.APPluginStatic.PARAM_PLUGIN_LOG_CALLBACK_CLASS_NAME, com.tencent.midas.control.APMidasPayHelper.getLogCallbackClassName());
        intent.putExtra(com.tencent.midas.plugin.APPluginStatic.PARAM_PLUGIN_CutOut_ENABLE, com.tencent.midas.control.APMidasPayHelper.cutoutEnable);
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("com.tencent.tauth.Tencent");
            java.lang.reflect.Method method = cls.getMethod("isPermissionNotGranted", new java.lang.Class[0]);
            method.setAccessible(true);
            intent.putExtra(com.tencent.midas.plugin.APPluginStatic.PARAM_PLUGIN_OPENSDK_ENABLE, ((java.lang.Boolean) method.invoke(cls, new java.lang.Object[0])).booleanValue() ? false : true);
        } catch (java.lang.Throwable unused2) {
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/midas/plugin/APPluginProxyActivity", "openActivityForResult", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        } catch (java.lang.Throwable th6) {
            com.tencent.midas.comm.APLog.i("APPLuginProxyActivity", "APPluginProxyActivity openActivityForResult Throwable:" + th6.toString());
        }
    }

    private static void setClassLoaderToEveryBundle(android.os.Bundle bundle, java.lang.ClassLoader classLoader) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (sUnparcelMethod == null || sMMapField == null) {
            java.lang.Class<?> cls = bundle.getClass();
            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("unparcel", new java.lang.Class[0]);
            sUnparcelMethod = declaredMethod;
            declaredMethod.setAccessible(true);
            java.lang.reflect.Field declaredField = cls.getDeclaredField("mMap");
            sMMapField = declaredField;
            declaredField.setAccessible(true);
        }
        sUnparcelMethod.invoke(bundle, new java.lang.Object[0]);
        java.util.Map map = (java.util.Map) sMMapField.get(bundle);
        if (map != null) {
            for (java.lang.Object obj : map.values()) {
                if (obj instanceof android.os.Bundle) {
                    setClassLoaderToEveryBundle((android.os.Bundle) obj, classLoader);
                }
            }
        }
    }

    private void startPluginActivityForResult(android.app.Activity activity, java.lang.String str, android.content.Intent intent, int i17) {
        com.tencent.midas.comm.APLog.i("APPLuginProxyActivity", "APPluginProxyActivity startPluginActivityForResult.private");
        android.content.Intent intent2 = new android.content.Intent(activity, getProxyActivity(str));
        intent2.putExtra(com.tencent.midas.plugin.APPluginStatic.PARAM_PLUGIN_NAME, this.mPluginName);
        intent2.putExtra(com.tencent.midas.plugin.APPluginStatic.PARAM_PLUGIN_PATH, this.mPluginApkFilePath);
        intent2.putExtra(com.tencent.midas.plugin.APPluginStatic.PARAM_LAUNCH_ACTIVITY, str);
        com.tencent.midas.comm.APLog.i("APPLuginProxyActivity", "APPluginProxyActivity setExtrasClassLoader before");
        intent2.setExtrasClassLoader(intent.getExtras().getClassLoader());
        com.tencent.midas.comm.APLog.i("APPLuginProxyActivity", "APPluginProxyActivity setExtrasClassLoader after");
        intent2.addFlags(intent.getFlags());
        intent2.putExtras(intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/midas/plugin/APPluginProxyActivity", "startPluginActivityForResult", "(Landroid/app/Activity;Ljava/lang/String;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.midas.plugin.IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        return iAPPluginActivity != null ? iAPPluginActivity.IDispatchTouchEvent(motionEvent) : super.dispatchTouchEvent(motionEvent);
    }

    public java.lang.Class<? extends com.tencent.midas.plugin.APPluginProxyActivity> getProxyActivity(java.lang.String str) {
        return getClass();
    }

    public boolean isWrapContent() {
        com.tencent.midas.plugin.IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        if (iAPPluginActivity != null) {
            return iAPPluginActivity.IIsWrapContent();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.midas.comm.APLog.i("APPLuginProxyActivity", "onActivityResult requestCode:" + i17 + " resultCode:" + i18 + " mPluginActivity:" + this.mPluginActivity);
        super.onActivityResult(i17, i18, intent);
        if (this.mPluginActivity != null) {
            try {
                java.lang.ClassLoader classLoader = com.tencent.midas.plugin.APPluginLoader.getClassLoader(this.mPluginName, com.tencent.midas.plugin.APPluginUtils.getMD5FromPath(com.tencent.midas.plugin.APPluginInstallerAndUpdater.getInstallPath(this, this.mPluginName).getCanonicalPath()));
                if (classLoader != null && intent != null) {
                    intent.setExtrasClassLoader(classLoader);
                }
                this.mPluginActivity.IOnActivityResult(i17, i18, intent);
            } catch (java.lang.Exception e17) {
                com.tencent.midas.comm.APLog.w("APPLuginProxyActivity onActivityResult", e17.toString());
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        try {
            super.onBackPressed();
        } catch (java.lang.IllegalStateException unused) {
            finish();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.tencent.midas.plugin.IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        if (iAPPluginActivity != null) {
            try {
                iAPPluginActivity.IOnConfigurationChanged(configuration);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0213 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.plugin.APPluginProxyActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        com.tencent.midas.plugin.IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        return iAPPluginActivity != null ? iAPPluginActivity.IOnCreateOptionsMenu(menu) : super.onCreateOptionsMenu(menu);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.midas.comm.APLog.i(TAG, "onDestroy mPluginActivity:" + this.mPluginActivity);
        com.tencent.midas.comm.APLogUtil.flushIfNewProcess();
        com.tencent.midas.plugin.IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        if (iAPPluginActivity != null) {
            try {
                iAPPluginActivity.IOnDestroy();
            } catch (java.lang.Exception unused) {
            }
        }
        com.tencent.midas.data.APPluginReportManager.getInstance().dataReport(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_LAUNCHPAY);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        com.tencent.midas.plugin.IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        boolean IOnKeyDown = iAPPluginActivity != null ? iAPPluginActivity.IOnKeyDown(i17, keyEvent) : false;
        return !IOnKeyDown ? super.onKeyDown(i17, keyEvent) : IOnKeyDown;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i17, android.view.MenuItem menuItem) {
        com.tencent.midas.plugin.IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        return iAPPluginActivity != null ? iAPPluginActivity.IOnMenuItemSelected(i17, menuItem) : super.onMenuItemSelected(i17, menuItem);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        java.lang.ClassLoader classLoader = com.tencent.midas.plugin.APPluginLoader.getClassLoader(this.mPluginName, com.tencent.midas.plugin.APPluginUtils.getMD5FromPath(com.tencent.midas.plugin.APPluginInstallerAndUpdater.getInstallPathString(this, this.mPluginName)));
        com.tencent.midas.comm.APLog.i("APPLuginProxyActivity", "APPluginProxyActivity onNewIntent mPluginName:" + this.mPluginName + " classLoader: " + classLoader);
        if (classLoader != null) {
            intent.setExtrasClassLoader(classLoader);
        }
        if (this.mPluginActivity == null || !intent.getBooleanExtra(com.tencent.midas.plugin.APPluginStatic.PARAM_CLEAR_TOP, false)) {
            return;
        }
        this.mPluginActivity.IOnNewIntent(intent);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        com.tencent.midas.plugin.IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        return iAPPluginActivity != null ? iAPPluginActivity.IOnOptionsItemSelected(menuItem) : super.onOptionsItemSelected(menuItem);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.midas.plugin.IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        if (iAPPluginActivity != null) {
            iAPPluginActivity.IOnPause();
        }
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(android.view.Menu menu) {
        com.tencent.midas.plugin.IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        return iAPPluginActivity != null ? iAPPluginActivity.IOnPrepareOptionsMenu(menu) : super.onPrepareOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.tencent.midas.comm.APLog.i("APPLuginProxyActivity", "onRequestPermissionsResult requestCode:" + i17 + " permissions:" + strArr + " grantResults:" + iArr);
        super.onRequestPermissionsResult(i17, strArr, iArr);
        if (this.mPluginActivity != null) {
            try {
                com.tencent.midas.plugin.APPluginLoader.getClassLoader(this.mPluginName, com.tencent.midas.plugin.APPluginUtils.getMD5FromPath(com.tencent.midas.plugin.APPluginInstallerAndUpdater.getInstallPath(this, this.mPluginName).getCanonicalPath()));
                this.mPluginActivity.IOnRequestPermissionsResult(i17, strArr, iArr);
            } catch (java.lang.Exception e17) {
                com.tencent.midas.comm.APLog.w("APPLuginProxyActivity onRequestPermissionsResult", e17.toString());
            }
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        java.lang.ClassLoader classLoader = com.tencent.midas.plugin.APPluginLoader.getClassLoader(this.mPluginName, com.tencent.midas.plugin.APPluginUtils.getMD5FromPath(com.tencent.midas.plugin.APPluginInstallerAndUpdater.getInstallPathString(this, this.mPluginName)));
        if (classLoader != null) {
            try {
                setClassLoaderToEveryBundle(bundle, classLoader);
            } catch (java.lang.Exception unused) {
            }
        }
        try {
            super.onRestoreInstanceState(bundle);
        } catch (java.lang.Exception unused2) {
        }
        com.tencent.midas.plugin.IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        if (iAPPluginActivity != null) {
            iAPPluginActivity.IOnRestoreInstanceState(bundle);
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.midas.plugin.IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        if (iAPPluginActivity != null) {
            iAPPluginActivity.IOnResume();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        com.tencent.midas.plugin.IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        if (iAPPluginActivity != null) {
            iAPPluginActivity.IOnSaveInstanceState(bundle);
        }
        bundle.putString(com.tencent.midas.plugin.APPluginStatic.PARAM_PLUGIN_NAME, this.mPluginName);
        bundle.putString(com.tencent.midas.plugin.APPluginStatic.PARAM_PLUGIN_LOCATION, this.mPluginName);
        bundle.putString(com.tencent.midas.plugin.APPluginStatic.PARAM_PLUGIN_PATH, this.mPluginApkFilePath);
        bundle.putString(com.tencent.midas.plugin.APPluginStatic.PARAM_LAUNCH_ACTIVITY, this.mLaunchActivity);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        com.tencent.midas.plugin.IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        if (iAPPluginActivity != null) {
            iAPPluginActivity.IOnStart();
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.tencent.midas.plugin.IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        if (iAPPluginActivity != null) {
            iAPPluginActivity.IOnStop();
        }
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.midas.plugin.IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        return iAPPluginActivity != null ? iAPPluginActivity.IOnTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        com.tencent.midas.plugin.IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        if (iAPPluginActivity != null) {
            iAPPluginActivity.IOnUserInteraction();
        } else {
            super.onUserInteraction();
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        com.tencent.midas.plugin.IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        if (iAPPluginActivity != null) {
            iAPPluginActivity.IOnWindowFocusChanged(z17);
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i17) {
        com.tencent.midas.comm.APLog.i(TAG, "setRequestedOrientation requestedOrientation:" + i17);
        super.setRequestedOrientation(i17);
    }

    public boolean shouldHandleStartPluginFailed(java.lang.String str) {
        if (str.contains("permission") || str.contains("filenotfoundexception")) {
            showNeedUninstanllAndInstallDialog();
            return true;
        }
        if (!str.contains("resources$notfoundexception") && !str.contains("resourcesnotfoundexception")) {
            return false;
        }
        showNeedUninstanllAndInstallDialog();
        return true;
    }

    public void showNeedUninstanllAndInstallDialog() {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle("温馨提示");
        builder.setMessage("系统繁忙" + this.mPluginName + "失败，请卸载重装~");
        builder.setPositiveButton("我知道了", new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.midas.plugin.APPluginProxyActivity.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                com.tencent.midas.plugin.APPluginProxyActivity.this.finish();
            }
        });
        try {
            builder.create().show();
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i17) {
        if (intent.getBooleanExtra("pluginsdk_IsPluginActivity", false)) {
            android.content.ComponentName component = intent.getComponent();
            java.lang.String className = component != null ? component.getClassName() : null;
            intent.putExtra("pluginsdk_IsPluginActivity", false);
            if (className != null && className.length() > 0) {
                startPluginActivityForResult(this, className, intent, i17);
            }
        } else {
            super.startActivityForResult(intent, i17);
        }
        this.mStopFlag = 2;
    }

    public void startActivityForResult(android.content.Intent intent, int i17, int i18) {
        com.tencent.midas.comm.APLog.i("APPLuginProxyActivity", "startActivityForResult.public");
        this.mStopFlag = 2;
        isStart3rdApp(intent);
        if (!isMoveTaskToBack(this, intent)) {
            intent.addFlags(262144);
        }
        super.startActivityForResult(intent, i17);
    }
}
