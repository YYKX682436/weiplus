package com.p314xaae8f345.p592x631407a.p604xc5476f33;

/* renamed from: com.tencent.midas.plugin.APPluginProxyActivity */
/* loaded from: classes13.dex */
public class ActivityC4812xcf43a7b extends com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c {
    private static final java.lang.String TAG = "APPluginProxyActivity";

    /* renamed from: cutOutEnable */
    private static boolean f20782x66d4964f = false;

    /* renamed from: gPluginApkFilePath */
    private static java.lang.String f20783x7b5b723 = null;

    /* renamed from: gPluginName */
    protected static java.lang.String f20784x47c15425 = "MidasPay";

    /* renamed from: mAppForground */
    public static boolean f20785x60317f7c = true;

    /* renamed from: sMMapField */
    private static java.lang.reflect.Field f20786x62b49d58;

    /* renamed from: sUnparcelMethod */
    private static java.lang.reflect.Method f20787x962f4ab6;

    /* renamed from: mLaunchActivity */
    private java.lang.String f20789x83b921af = null;

    /* renamed from: mPluginActivity */
    private com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba f20790x6be3ed2f = null;

    /* renamed from: mPluginApkFilePath */
    private java.lang.String f20791xa32103dd = null;

    /* renamed from: mPluginName */
    private java.lang.String f20792xc51d84ab = null;

    /* renamed from: mStopFlag */
    protected int f20793x8b2d521b = 0;

    /* renamed from: mCreateErrorInfo */
    protected java.lang.String f20788x8bf9710d = null;

    /* renamed from: initPlugin */
    private java.lang.String m42113x9e1b463() {
        android.content.pm.PackageInfo packageInfo = com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.f20816x922f11fb.get(this.f20791xa32103dd);
        if (packageInfo == null) {
            packageInfo = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4802x6aa3a008.m42027xffec0de(this, this.f20791xa32103dd, 1);
            if (packageInfo == null) {
                return "Get Package Info Failed!";
            }
            if (android.os.Build.VERSION.SDK_INT >= 28 && com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42169x7c9269fe(this)) {
                try {
                    android.webkit.WebView.setDataDirectorySuffix("midaspay");
                } catch (java.lang.Throwable unused) {
                }
            }
            try {
                if (!com.p314xaae8f345.p592x631407a.p603x745bd612.C4796x1ec34c.m42003xf414dc92(this)) {
                    new android.webkit.WebView(this);
                }
                packageInfo.applicationInfo.sharedLibraryFiles = getApplicationInfo().sharedLibraryFiles;
                packageInfo.applicationInfo.sourceDir = getApplicationInfo().sourceDir;
                packageInfo.applicationInfo.publicSourceDir = getApplicationInfo().publicSourceDir;
            } catch (java.lang.Exception unused2) {
            }
            com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.f20816x922f11fb.put(this.f20791xa32103dd, packageInfo);
        }
        android.content.pm.PackageInfo packageInfo2 = packageInfo;
        java.lang.String str = this.f20789x83b921af;
        if (str == null || str.length() == 0) {
            android.content.pm.ActivityInfo[] activityInfoArr = packageInfo2.activities;
            if (activityInfoArr == null || activityInfoArr.length == 0) {
                return "Activity Not Found!";
            }
            this.f20789x83b921af = activityInfoArr[0].name;
        }
        dalvik.system.DexClassLoader m42109x6aff9af2 = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4810x459da6f5.m42109x6aff9af2(this, this.f20792xc51d84ab, this.f20791xa32103dd);
        getIntent().setExtrasClassLoader(m42109x6aff9af2);
        com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba interfaceC4818x848287ba = (com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba) m42109x6aff9af2.loadClass(this.f20789x83b921af).newInstance();
        this.f20790x6be3ed2f = interfaceC4818x848287ba;
        interfaceC4818x848287ba.mo42036x4278cf9(this.f20792xc51d84ab, this.f20791xa32103dd, this, m42109x6aff9af2, packageInfo2);
        this.f20790x6be3ed2f.mo42062x3220ef55(getIntent());
        return null;
    }

    /* renamed from: isMoveTaskToBack */
    public static boolean m42114x3902ca62(android.content.Context context, android.content.Intent intent) {
        return intent.getComponent() == null || !intent.getComponent().getPackageName().equals(context.getPackageName());
    }

    /* renamed from: isStart3rdApp */
    private boolean m42115x5fb2594(android.content.Intent intent) {
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

    /* renamed from: logStartPluginErrInfo */
    private void m42116x37c81222(java.lang.String str) {
        if (!str.contains("permission") && !str.contains("filenotfoundexception")) {
            if (str.contains("resources$notfoundexception") || str.contains("resourcesnotfoundexception")) {
                return;
            }
            str.contains("classnotfoundexception");
            return;
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("logStartPluginErrInfo", "mPluginApkFilePath" + this.f20791xa32103dd);
        android.content.pm.ApplicationInfo applicationInfo = getApplicationInfo();
        if (applicationInfo != null) {
            int i17 = applicationInfo.flags;
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d("", "UID: " + applicationInfo.uid + ", IsSystemApp: " + ((i17 & 1) > 0) + ", IsUpdateSystemApp: " + ((i17 & 128) > 0));
        }
    }

    /* renamed from: openActivityForResult */
    public static void m42117x36212acd(android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, android.content.Intent intent, int i17) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "APPluginProxyActivity openActivityForResult pluginName：" + str);
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "APPluginProxyActivity openActivityForResult contextActivity：" + activity);
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "APPluginProxyActivity openActivityForResult apkFilePath：" + str2);
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "APPluginProxyActivity openActivityForResult startIntent：".concat(intent.getClass().getSimpleName()));
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "APPluginProxyActivity openActivityForResult startIntent：" + intent.getClass().getCanonicalName());
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "APPluginProxyActivity openActivityForResult startIntent：" + intent.getClass().getClassLoader());
        f20784x47c15425 = str;
        try {
            f20783x7b5b723 = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4808xfbd720f8.m42090x5997ff2a(activity, str).getCanonicalPath();
        } catch (java.io.IOException unused) {
        }
        intent.putExtra(com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.f20809xec9e1345, str);
        intent.putExtra(com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.f20802x8fa9f249, str3);
        intent.putExtra(com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.f20811xec9efcdf, str2);
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d("APPLuginProxyActivity", "put is new process: " + com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20437x926af579);
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d("APPLuginProxyActivity", "put is log enable: " + com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41774xa25a73dd());
        intent.putExtra(com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.f20805x5c657735, com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20437x926af579);
        intent.putExtra(com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.f20808x74000c38, com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41774xa25a73dd());
        intent.putExtra(com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.f20807x7bc144b7, com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41769xcef762f0());
        intent.putExtra(com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.f20803x2b63e7dc, com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20428xef62766f);
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("com.tencent.tauth.Tencent");
            java.lang.reflect.Method method = cls.getMethod("isPermissionNotGranted", new java.lang.Class[0]);
            method.setAccessible(true);
            intent.putExtra(com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.f20810x549c2f4c, ((java.lang.Boolean) method.invoke(cls, new java.lang.Object[0])).booleanValue() ? false : true);
        } catch (java.lang.Throwable unused2) {
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/midas/plugin/APPluginProxyActivity", "openActivityForResult", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "APPluginProxyActivity openActivityForResult Throwable:" + th6.toString());
        }
    }

    /* renamed from: setClassLoaderToEveryBundle */
    private static void m42118xddd72a99(android.os.Bundle bundle, java.lang.ClassLoader classLoader) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (f20787x962f4ab6 == null || f20786x62b49d58 == null) {
            java.lang.Class<?> cls = bundle.getClass();
            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("unparcel", new java.lang.Class[0]);
            f20787x962f4ab6 = declaredMethod;
            declaredMethod.setAccessible(true);
            java.lang.reflect.Field declaredField = cls.getDeclaredField("mMap");
            f20786x62b49d58 = declaredField;
            declaredField.setAccessible(true);
        }
        f20787x962f4ab6.invoke(bundle, new java.lang.Object[0]);
        java.util.Map map = (java.util.Map) f20786x62b49d58.get(bundle);
        if (map != null) {
            for (java.lang.Object obj : map.values()) {
                if (obj instanceof android.os.Bundle) {
                    m42118xddd72a99((android.os.Bundle) obj, classLoader);
                }
            }
        }
    }

    /* renamed from: startPluginActivityForResult */
    private void m42119x6bcbf642(android.app.Activity activity, java.lang.String str, android.content.Intent intent, int i17) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "APPluginProxyActivity startPluginActivityForResult.private");
        android.content.Intent intent2 = new android.content.Intent(activity, m42120x4ae38fe7(str));
        intent2.putExtra(com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.f20809xec9e1345, this.f20792xc51d84ab);
        intent2.putExtra(com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.f20811xec9efcdf, this.f20791xa32103dd);
        intent2.putExtra(com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.f20802x8fa9f249, str);
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "APPluginProxyActivity setExtrasClassLoader before");
        intent2.setExtrasClassLoader(intent.getExtras().getClassLoader());
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "APPluginProxyActivity setExtrasClassLoader after");
        intent2.addFlags(intent.getFlags());
        intent2.putExtras(intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/midas/plugin/APPluginProxyActivity", "startPluginActivityForResult", "(Landroid/app/Activity;Ljava/lang/String;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba interfaceC4818x848287ba = this.f20790x6be3ed2f;
        return interfaceC4818x848287ba != null ? interfaceC4818x848287ba.mo42031xcbbe3ede(motionEvent) : super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: getProxyActivity */
    public java.lang.Class<? extends com.p314xaae8f345.p592x631407a.p604xc5476f33.ActivityC4812xcf43a7b> m42120x4ae38fe7(java.lang.String str) {
        return getClass();
    }

    /* renamed from: isWrapContent */
    public boolean m42121xe7599145() {
        com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba interfaceC4818x848287ba = this.f20790x6be3ed2f;
        if (interfaceC4818x848287ba != null) {
            return interfaceC4818x848287ba.mo42037x7f373f7c();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "onActivityResult requestCode:" + i17 + " resultCode:" + i18 + " mPluginActivity:" + this.f20790x6be3ed2f);
        super.onActivityResult(i17, i18, intent);
        if (this.f20790x6be3ed2f != null) {
            try {
                java.lang.ClassLoader m42107xa0bf1275 = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4810x459da6f5.m42107xa0bf1275(this.f20792xc51d84ab, com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42161x8e8bd977(com.p314xaae8f345.p592x631407a.p604xc5476f33.C4808xfbd720f8.m42090x5997ff2a(this, this.f20792xc51d84ab).getCanonicalPath()));
                if (m42107xa0bf1275 != null && intent != null) {
                    intent.setExtrasClassLoader(m42107xa0bf1275);
                }
                this.f20790x6be3ed2f.mo42038x6b7c1a34(i17, i18, intent);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.w("APPLuginProxyActivity onActivityResult", e17.toString());
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
        com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba interfaceC4818x848287ba = this.f20790x6be3ed2f;
        if (interfaceC4818x848287ba != null) {
            try {
                interfaceC4818x848287ba.mo42039xa84f2106(configuration);
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
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p592x631407a.p604xc5476f33.ActivityC4812xcf43a7b.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba interfaceC4818x848287ba = this.f20790x6be3ed2f;
        return interfaceC4818x848287ba != null ? interfaceC4818x848287ba.mo42041xfef71759(menu) : super.onCreateOptionsMenu(menu);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "onDestroy mPluginActivity:" + this.f20790x6be3ed2f);
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4757x93559237.m41645xc6f50ad0();
        com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba interfaceC4818x848287ba = this.f20790x6be3ed2f;
        if (interfaceC4818x848287ba != null) {
            try {
                interfaceC4818x848287ba.mo42042xccdd02d2();
            } catch (java.lang.Exception unused) {
            }
        }
        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41932x4994497e(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20540x4c0395c3);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba interfaceC4818x848287ba = this.f20790x6be3ed2f;
        boolean mo42043x3f675279 = interfaceC4818x848287ba != null ? interfaceC4818x848287ba.mo42043x3f675279(i17, keyEvent) : false;
        return !mo42043x3f675279 ? super.onKeyDown(i17, keyEvent) : mo42043x3f675279;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i17, android.view.MenuItem menuItem) {
        com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba interfaceC4818x848287ba = this.f20790x6be3ed2f;
        return interfaceC4818x848287ba != null ? interfaceC4818x848287ba.mo42046xc97db1f5(i17, menuItem) : super.onMenuItemSelected(i17, menuItem);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        java.lang.ClassLoader m42107xa0bf1275 = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4810x459da6f5.m42107xa0bf1275(this.f20792xc51d84ab, com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42161x8e8bd977(com.p314xaae8f345.p592x631407a.p604xc5476f33.C4808xfbd720f8.m42091x235cc3db(this, this.f20792xc51d84ab)));
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "APPluginProxyActivity onNewIntent mPluginName:" + this.f20792xc51d84ab + " classLoader: " + m42107xa0bf1275);
        if (m42107xa0bf1275 != null) {
            intent.setExtrasClassLoader(m42107xa0bf1275);
        }
        if (this.f20790x6be3ed2f == null || !intent.getBooleanExtra(com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.f20800x926a8ad1, false)) {
            return;
        }
        this.f20790x6be3ed2f.mo42047x5e562134(intent);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba interfaceC4818x848287ba = this.f20790x6be3ed2f;
        return interfaceC4818x848287ba != null ? interfaceC4818x848287ba.mo42048xeea5cb64(menuItem) : super.onOptionsItemSelected(menuItem);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba interfaceC4818x848287ba = this.f20790x6be3ed2f;
        if (interfaceC4818x848287ba != null) {
            interfaceC4818x848287ba.mo42049xb28c5ece();
        }
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(android.view.Menu menu) {
        com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba interfaceC4818x848287ba = this.f20790x6be3ed2f;
        return interfaceC4818x848287ba != null ? interfaceC4818x848287ba.mo42050x3d1877be(menu) : super.onPrepareOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "onRequestPermissionsResult requestCode:" + i17 + " permissions:" + strArr + " grantResults:" + iArr);
        super.onRequestPermissionsResult(i17, strArr, iArr);
        if (this.f20790x6be3ed2f != null) {
            try {
                com.p314xaae8f345.p592x631407a.p604xc5476f33.C4810x459da6f5.m42107xa0bf1275(this.f20792xc51d84ab, com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42161x8e8bd977(com.p314xaae8f345.p592x631407a.p604xc5476f33.C4808xfbd720f8.m42090x5997ff2a(this, this.f20792xc51d84ab).getCanonicalPath()));
                this.f20790x6be3ed2f.mo42051xb227bb1a(i17, strArr, iArr);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.w("APPLuginProxyActivity onRequestPermissionsResult", e17.toString());
            }
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        java.lang.ClassLoader m42107xa0bf1275 = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4810x459da6f5.m42107xa0bf1275(this.f20792xc51d84ab, com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42161x8e8bd977(com.p314xaae8f345.p592x631407a.p604xc5476f33.C4808xfbd720f8.m42091x235cc3db(this, this.f20792xc51d84ab)));
        if (m42107xa0bf1275 != null) {
            try {
                m42118xddd72a99(bundle, m42107xa0bf1275);
            } catch (java.lang.Exception unused) {
            }
        }
        try {
            super.onRestoreInstanceState(bundle);
        } catch (java.lang.Exception unused2) {
        }
        com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba interfaceC4818x848287ba = this.f20790x6be3ed2f;
        if (interfaceC4818x848287ba != null) {
            interfaceC4818x848287ba.mo42053x10b74536(bundle);
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba interfaceC4818x848287ba = this.f20790x6be3ed2f;
        if (interfaceC4818x848287ba != null) {
            interfaceC4818x848287ba.mo42054xa2a0aa55();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba interfaceC4818x848287ba = this.f20790x6be3ed2f;
        if (interfaceC4818x848287ba != null) {
            interfaceC4818x848287ba.mo42055xfef40b57(bundle);
        }
        bundle.putString(com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.f20809xec9e1345, this.f20792xc51d84ab);
        bundle.putString(com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.f20806x80dc436f, this.f20792xc51d84ab);
        bundle.putString(com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.f20811xec9efcdf, this.f20791xa32103dd);
        bundle.putString(com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.f20802x8fa9f249, this.f20789x83b921af);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba interfaceC4818x848287ba = this.f20790x6be3ed2f;
        if (interfaceC4818x848287ba != null) {
            interfaceC4818x848287ba.mo42056xb2befd3a();
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba interfaceC4818x848287ba = this.f20790x6be3ed2f;
        if (interfaceC4818x848287ba != null) {
            interfaceC4818x848287ba.mo42057xa2ab542a();
        }
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba interfaceC4818x848287ba = this.f20790x6be3ed2f;
        return interfaceC4818x848287ba != null ? interfaceC4818x848287ba.mo42058x73a6e0c3(motionEvent) : super.onTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba interfaceC4818x848287ba = this.f20790x6be3ed2f;
        if (interfaceC4818x848287ba != null) {
            interfaceC4818x848287ba.mo42059x834fd81f();
        } else {
            super.onUserInteraction();
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba interfaceC4818x848287ba = this.f20790x6be3ed2f;
        if (interfaceC4818x848287ba != null) {
            interfaceC4818x848287ba.mo42060x484fb0f4(z17);
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i17) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "setRequestedOrientation requestedOrientation:" + i17);
        super.setRequestedOrientation(i17);
    }

    /* renamed from: shouldHandleStartPluginFailed */
    public boolean m42122xc2120257(java.lang.String str) {
        if (str.contains("permission") || str.contains("filenotfoundexception")) {
            m42123xf400c52b();
            return true;
        }
        if (!str.contains("resources$notfoundexception") && !str.contains("resourcesnotfoundexception")) {
            return false;
        }
        m42123xf400c52b();
        return true;
    }

    /* renamed from: showNeedUninstanllAndInstallDialog */
    public void m42123xf400c52b() {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle("温馨提示");
        builder.setMessage("系统繁忙" + this.f20792xc51d84ab + "失败，请卸载重装~");
        builder.setPositiveButton("我知道了", new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.midas.plugin.APPluginProxyActivity.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                com.p314xaae8f345.p592x631407a.p604xc5476f33.ActivityC4812xcf43a7b.this.finish();
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
                m42119x6bcbf642(this, className, intent, i17);
            }
        } else {
            super.startActivityForResult(intent, i17);
        }
        this.f20793x8b2d521b = 2;
    }

    /* renamed from: startActivityForResult */
    public void m42124x5dc77fb5(android.content.Intent intent, int i17, int i18) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPLuginProxyActivity", "startActivityForResult.public");
        this.f20793x8b2d521b = 2;
        m42115x5fb2594(intent);
        if (!m42114x3902ca62(this, intent)) {
            intent.addFlags(262144);
        }
        super.startActivityForResult(intent, i17);
    }
}
