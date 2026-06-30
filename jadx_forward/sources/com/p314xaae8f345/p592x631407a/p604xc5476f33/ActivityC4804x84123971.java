package com.p314xaae8f345.p592x631407a.p604xc5476f33;

/* renamed from: com.tencent.midas.plugin.APPluginActivity */
/* loaded from: classes13.dex */
public class ActivityC4804x84123971 extends com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c implements com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba {

    /* renamed from: _hellAccFlag_ */
    private byte f20734x7f11beae;

    /* renamed from: mProxyActivity */
    public android.app.Activity f20743xe891dc30 = null;

    /* renamed from: mActivity */
    public android.app.Activity f20735xc2499a9c = null;

    /* renamed from: mContext */
    public android.content.Context f20737xd6cfe882 = null;

    /* renamed from: mProxyContentView */
    protected android.view.View f20744x856375fd = null;

    /* renamed from: mPluginName */
    protected java.lang.String f20742xc51d84ab = "";

    /* renamed from: mApkFilePath */
    protected java.lang.String f20736xc571c350 = "";

    /* renamed from: mPackageInfo */
    protected android.content.pm.PackageInfo f20741xe0358b67 = null;

    /* renamed from: mIsRunInPlugin */
    protected boolean f20740x98a2416c = false;

    /* renamed from: mDexClassLoader */
    private java.lang.ClassLoader f20738x209f54e1 = null;

    /* renamed from: mFinished */
    private boolean f20739xfcd667ff = false;

    /* renamed from: getDrawableBitmap */
    public static final android.graphics.Bitmap m42030xfaaabc63(android.graphics.drawable.Drawable drawable) {
        if (drawable != null && (drawable instanceof android.graphics.drawable.BitmapDrawable)) {
            return ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
        }
        return null;
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IDispatchTouchEvent */
    public boolean mo42031xcbbe3ede(android.view.MotionEvent motionEvent) {
        try {
            return dispatchTouchEvent(motionEvent);
        } catch (java.lang.Exception unused) {
            return true;
        }
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IFinish */
    public void mo42032x93155e3c() {
        finish();
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IGetContentView */
    public android.view.View mo42033x267d5e31() {
        return this.f20744x856375fd;
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IGetInHandler */
    public android.os.Handler mo42034xbec5e98() {
        return null;
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IGetResource */
    public android.content.res.Resources mo42035xfc97d17b() {
        android.content.Context context = this.f20737xd6cfe882;
        return context != null ? context.getResources() : this.f20735xc2499a9c.getResources();
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IInit */
    public void mo42036x4278cf9(java.lang.String str, java.lang.String str2, android.app.Activity activity, java.lang.ClassLoader classLoader, android.content.pm.PackageInfo packageInfo) {
        this.f20740x98a2416c = true;
        this.f20738x209f54e1 = classLoader;
        this.f20743xe891dc30 = activity;
        this.f20742xc51d84ab = str;
        this.f20736xc571c350 = str2;
        this.f20741xe0358b67 = packageInfo;
        com.p314xaae8f345.p592x631407a.p604xc5476f33.C4807x92bd9b0d c4807x92bd9b0d = new com.p314xaae8f345.p592x631407a.p604xc5476f33.C4807x92bd9b0d(activity, 0, str2, classLoader);
        this.f20737xd6cfe882 = c4807x92bd9b0d;
        attachBaseContext(c4807x92bd9b0d);
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IIsWrapContent */
    public boolean mo42037x7f373f7c() {
        return true;
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IOnActivityResult */
    public void mo42038x6b7c1a34(int i17, int i18, android.content.Intent intent) {
        onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IOnConfigurationChanged */
    public void mo42039xa84f2106(android.content.res.Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IOnCreate */
    public void mo42040x89b88324(android.os.Bundle bundle) {
        onCreate(bundle);
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IOnCreateOptionsMenu */
    public boolean mo42041xfef71759(android.view.Menu menu) {
        return onCreateOptionsMenu(menu);
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IOnDestroy */
    public void mo42042xccdd02d2() {
        onDestroy();
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IOnKeyDown */
    public boolean mo42043x3f675279(int i17, android.view.KeyEvent keyEvent) {
        return onKeyDown(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IOnKeyMultiple */
    public boolean mo42044x90281067(int i17, int i18, android.view.KeyEvent keyEvent) {
        return onKeyMultiple(i17, i18, keyEvent);
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IOnKeyUp */
    public boolean mo42045xb247c632(int i17, android.view.KeyEvent keyEvent) {
        return onKeyUp(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IOnMenuItemSelected */
    public boolean mo42046xc97db1f5(int i17, android.view.MenuItem menuItem) {
        return onMenuItemSelected(i17, menuItem);
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IOnNewIntent */
    public void mo42047x5e562134(android.content.Intent intent) {
        onNewIntent(intent);
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IOnOptionsItemSelected */
    public boolean mo42048xeea5cb64(android.view.MenuItem menuItem) {
        return onOptionsItemSelected(menuItem);
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IOnPause */
    public void mo42049xb28c5ece() {
        onPause();
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IOnPrepareOptionsMenu */
    public boolean mo42050x3d1877be(android.view.Menu menu) {
        return onPrepareOptionsMenu(menu);
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IOnRequestPermissionsResult */
    public void mo42051xb227bb1a(int i17, java.lang.String[] strArr, int[] iArr) {
        onRequestPermissionsResult(i17, strArr, iArr);
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IOnRestart */
    public void mo42052xb17400e7() {
        onRestart();
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IOnRestoreInstanceState */
    public void mo42053x10b74536(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IOnResume */
    public void mo42054xa2a0aa55() {
        onResume();
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IOnSaveInstanceState */
    public void mo42055xfef40b57(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IOnStart */
    public void mo42056xb2befd3a() {
        onStart();
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IOnStop */
    public void mo42057xa2ab542a() {
        onStop();
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IOnTouchEvent */
    public boolean mo42058x73a6e0c3(android.view.MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IOnUserInteraction */
    public void mo42059x834fd81f() {
        onUserInteraction();
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IOnWindowFocusChanged */
    public void mo42060x484fb0f4(boolean z17) {
        onWindowFocusChanged(z17);
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: IRequestPermissions */
    public void mo42061x76d7669e(java.lang.String[] strArr, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(strArr);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/midas/plugin/APPluginActivity", "IRequestPermissions", "([Ljava/lang/String;I)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
        requestPermissions((java.lang.String[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(this, "com/tencent/midas/plugin/APPluginActivity", "IRequestPermissions", "([Ljava/lang/String;I)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPluginActivity", "IRequestPermissions() permissions=" + strArr + ", requestCode=" + i17);
        if (this.f20740x98a2416c) {
            return;
        }
        super.requestPermissions(strArr, i17);
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: ISetIntent */
    public void mo42062x3220ef55(android.content.Intent intent) {
        setIntent(intent);
    }

    @Override // com.p314xaae8f345.p592x631407a.p604xc5476f33.InterfaceC4818x848287ba
    /* renamed from: ISetOutHandler */
    public void mo42063x1edc055(android.os.Handler handler) {
    }

    @Override // android.app.Activity
    public android.view.View findViewById(int i17) {
        android.view.View view;
        if (!this.f20740x98a2416c || (view = this.f20744x856375fd) == null) {
            return super.findViewById(i17);
        }
        android.view.View findViewById = view.findViewById(i17);
        return findViewById == null ? super.findViewById(i17) : findViewById;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        int i17;
        android.content.Intent intent;
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPluginActivity", "APPluginActivity finish");
        if (!this.f20740x98a2416c) {
            super.finish();
            return;
        }
        synchronized (this) {
            i17 = 0;
            try {
                java.lang.reflect.Field declaredField = android.app.Activity.class.getDeclaredField("mResultCode");
                declaredField.setAccessible(true);
                i17 = ((java.lang.Integer) declaredField.get(this)).intValue();
                java.lang.reflect.Field declaredField2 = android.app.Activity.class.getDeclaredField("mResultData");
                declaredField2.setAccessible(true);
                intent = (android.content.Intent) declaredField2.get(this);
            } catch (java.lang.Exception e17) {
                e17.toString();
                intent = null;
            }
        }
        if (this.f20743xe891dc30 != null && !isFinishing()) {
            this.f20743xe891dc30.setResult(i17, intent);
            this.f20743xe891dc30.finish();
        }
        this.f20739xfcd667ff = true;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.Context getApplicationContext() {
        android.app.Activity activity;
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPluginActivity", "APPluginActivity getApplicationContext mProxyActivity:" + this.f20743xe891dc30);
        return (!this.f20740x98a2416c || (activity = this.f20743xe891dc30) == null) ? super.getApplicationContext() : activity.getApplicationContext();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.pm.ApplicationInfo getApplicationInfo() {
        return this.f20740x98a2416c ? this.f20741xe0358b67.applicationInfo : super.getApplicationInfo();
    }

    @Override // android.app.Activity
    public int getChangingConfigurations() {
        return this.f20740x98a2416c ? this.f20743xe891dc30.getChangingConfigurations() : super.getChangingConfigurations();
    }

    /* renamed from: getHostResources */
    public android.content.res.Resources m42064x8de381a7() {
        return this.f20743xe891dc30.getResources();
    }

    @Override // android.app.Activity
    public android.view.LayoutInflater getLayoutInflater() {
        android.content.Context context = this.f20737xd6cfe882;
        return context != null ? android.view.LayoutInflater.from(context) : android.view.LayoutInflater.from(this.f20735xc2499a9c);
    }

    /* renamed from: getOutActivity */
    public android.app.Activity m42065xdeb91f47() {
        return this.f20743xe891dc30;
    }

    /* renamed from: getOutResources */
    public android.content.res.Resources m42066x760518ed() {
        return this.f20740x98a2416c ? this.f20743xe891dc30.getResources() : this.f20735xc2499a9c.getResources();
    }

    /* renamed from: getPackageInfo */
    public android.content.pm.PackageInfo m42067xffec0de() {
        if (this.f20740x98a2416c) {
            return this.f20741xe0358b67;
        }
        return null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.String getPackageName() {
        return this.f20740x98a2416c ? this.f20741xe0358b67.packageName : super.getPackageName();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        if ("window".equals(str) || ya.a.f77450x918d59a8.equals(str)) {
            return this.f20740x98a2416c ? this.f20743xe891dc30.getSystemService(str) : super.getSystemService(str);
        }
        android.content.Context context = this.f20737xd6cfe882;
        return context != null ? context.getSystemService(str) : super.getSystemService(str);
    }

    @Override // android.app.Activity
    public android.view.Window getWindow() {
        if (!this.f20740x98a2416c) {
            return super.getWindow();
        }
        android.app.Activity activity = this.f20743xe891dc30;
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    @Override // android.app.Activity
    public android.view.WindowManager getWindowManager() {
        return this.f20740x98a2416c ? this.f20743xe891dc30.getWindowManager() : super.getWindowManager();
    }

    @Override // android.app.Activity
    public boolean isFinishing() {
        return this.f20740x98a2416c ? this.f20739xfcd667ff : super.isFinishing();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPluginActivity", "APPluginActivity onActivityResult");
        if (this.f20740x98a2416c) {
            return;
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (this.f20740x98a2416c) {
            this.f20735xc2499a9c = this.f20743xe891dc30;
            com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.add(this);
        } else {
            super.onCreate(bundle);
            this.f20735xc2499a9c = this;
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPluginActivity", "onDestroy mIsRunInPlugin:" + this.f20740x98a2416c);
        if (!this.f20740x98a2416c) {
            super.onDestroy();
        } else {
            this.f20738x209f54e1 = null;
            com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.m42131xc84af884(this);
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (this.f20740x98a2416c) {
            return false;
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyMultiple(int i17, int i18, android.view.KeyEvent keyEvent) {
        if (this.f20740x98a2416c) {
            return false;
        }
        return super.onKeyMultiple(i17, i18, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (this.f20740x98a2416c) {
            return false;
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        if (this.f20740x98a2416c) {
            return;
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPluginActivity", "onRequestPermissionsResult() requestCode=" + i17);
        if (this.f20740x98a2416c) {
            return;
        }
        super.onRequestPermissionsResult(i17, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onRestart() {
        if (this.f20740x98a2416c) {
            return;
        }
        super.onRestart();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        if (this.f20740x98a2416c) {
            return;
        }
        super.onResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        if (this.f20740x98a2416c) {
            return;
        }
        super.onStart();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        if (this.f20740x98a2416c) {
            return;
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f20740x98a2416c) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        if (this.f20740x98a2416c) {
            return;
        }
        super.onWindowFocusChanged(z17);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        android.app.Activity activity;
        if (!this.f20740x98a2416c || (activity = this.f20743xe891dc30) == null) {
            super.openOptionsMenu();
        } else {
            activity.openOptionsMenu();
        }
    }

    @Override // android.app.Activity
    public void overridePendingTransition(int i17, int i18) {
        if (this.f20740x98a2416c) {
            this.f20735xc2499a9c.overridePendingTransition(i17, i18);
        } else {
            super.overridePendingTransition(i17, i18);
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i17) {
        if (this.f20740x98a2416c) {
            android.view.View inflate = android.view.LayoutInflater.from(this).inflate(i17, (android.view.ViewGroup) null);
            this.f20744x856375fd = inflate;
            this.f20735xc2499a9c.setContentView(inflate);
            return;
        }
        super.setContentView(i17);
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i17) {
        super.setRequestedOrientation(i17);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i17) {
        android.app.Activity activity;
        if (!this.f20740x98a2416c || (activity = this.f20743xe891dc30) == null) {
            super.setTheme(i17);
        } else {
            activity.setTheme(i17);
        }
    }

    @Override // android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i17) {
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities;
        if (!this.f20740x98a2416c) {
            super.startActivityForResult(intent, i17);
            return;
        }
        boolean z17 = false;
        if (intent.hasExtra(com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.f20804x4e7786f6)) {
            z17 = intent.getBooleanExtra(com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.f20804x4e7786f6, false);
        } else {
            android.app.Activity activity = this.f20743xe891dc30;
            if (activity != null) {
                intent.setPackage(activity.getPackageName());
            }
            android.app.Activity activity2 = this.f20735xc2499a9c;
            if (activity2 != null && ((queryIntentActivities = activity2.getPackageManager().queryIntentActivities(intent, 65536)) == null || queryIntentActivities.size() == 0)) {
                z17 = true;
            }
        }
        if (!z17) {
            android.app.Activity activity3 = this.f20735xc2499a9c;
            if (activity3 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.k(activity3, arrayList.toArray(), "com/tencent/midas/plugin/APPluginActivity", "startActivityForResult", "(Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                return;
            }
            return;
        }
        intent.putExtra("pluginsdk_IsPluginActivity", true);
        android.app.Activity activity4 = this.f20735xc2499a9c;
        if (activity4 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.k(activity4, arrayList2.toArray(), "com/tencent/midas/plugin/APPluginActivity", "startActivityForResult", "(Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View view) {
        if (this.f20740x98a2416c) {
            this.f20744x856375fd = view;
            this.f20735xc2499a9c.setContentView(view);
        } else {
            super.setContentView(view);
        }
    }
}
