package com.tencent.midas.plugin;

/* loaded from: classes13.dex */
public class APPluginActivity extends com.tencent.mm.hellhoundlib.activities.HellActivity implements com.tencent.midas.plugin.IAPPluginActivity {
    private byte _hellAccFlag_;
    public android.app.Activity mProxyActivity = null;
    public android.app.Activity mActivity = null;
    public android.content.Context mContext = null;
    protected android.view.View mProxyContentView = null;
    protected java.lang.String mPluginName = "";
    protected java.lang.String mApkFilePath = "";
    protected android.content.pm.PackageInfo mPackageInfo = null;
    protected boolean mIsRunInPlugin = false;
    private java.lang.ClassLoader mDexClassLoader = null;
    private boolean mFinished = false;

    public static final android.graphics.Bitmap getDrawableBitmap(android.graphics.drawable.Drawable drawable) {
        if (drawable != null && (drawable instanceof android.graphics.drawable.BitmapDrawable)) {
            return ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
        }
        return null;
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public boolean IDispatchTouchEvent(android.view.MotionEvent motionEvent) {
        try {
            return dispatchTouchEvent(motionEvent);
        } catch (java.lang.Exception unused) {
            return true;
        }
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public void IFinish() {
        finish();
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public android.view.View IGetContentView() {
        return this.mProxyContentView;
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public android.os.Handler IGetInHandler() {
        return null;
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public android.content.res.Resources IGetResource() {
        android.content.Context context = this.mContext;
        return context != null ? context.getResources() : this.mActivity.getResources();
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public void IInit(java.lang.String str, java.lang.String str2, android.app.Activity activity, java.lang.ClassLoader classLoader, android.content.pm.PackageInfo packageInfo) {
        this.mIsRunInPlugin = true;
        this.mDexClassLoader = classLoader;
        this.mProxyActivity = activity;
        this.mPluginName = str;
        this.mApkFilePath = str2;
        this.mPackageInfo = packageInfo;
        com.tencent.midas.plugin.APPluginContext aPPluginContext = new com.tencent.midas.plugin.APPluginContext(activity, 0, str2, classLoader);
        this.mContext = aPPluginContext;
        attachBaseContext(aPPluginContext);
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public boolean IIsWrapContent() {
        return true;
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public void IOnActivityResult(int i17, int i18, android.content.Intent intent) {
        onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public void IOnConfigurationChanged(android.content.res.Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public void IOnCreate(android.os.Bundle bundle) {
        onCreate(bundle);
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public boolean IOnCreateOptionsMenu(android.view.Menu menu) {
        return onCreateOptionsMenu(menu);
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public void IOnDestroy() {
        onDestroy();
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public boolean IOnKeyDown(int i17, android.view.KeyEvent keyEvent) {
        return onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public boolean IOnKeyMultiple(int i17, int i18, android.view.KeyEvent keyEvent) {
        return onKeyMultiple(i17, i18, keyEvent);
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public boolean IOnKeyUp(int i17, android.view.KeyEvent keyEvent) {
        return onKeyUp(i17, keyEvent);
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public boolean IOnMenuItemSelected(int i17, android.view.MenuItem menuItem) {
        return onMenuItemSelected(i17, menuItem);
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public void IOnNewIntent(android.content.Intent intent) {
        onNewIntent(intent);
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public boolean IOnOptionsItemSelected(android.view.MenuItem menuItem) {
        return onOptionsItemSelected(menuItem);
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public void IOnPause() {
        onPause();
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public boolean IOnPrepareOptionsMenu(android.view.Menu menu) {
        return onPrepareOptionsMenu(menu);
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public void IOnRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        onRequestPermissionsResult(i17, strArr, iArr);
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public void IOnRestart() {
        onRestart();
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public void IOnRestoreInstanceState(android.os.Bundle bundle) {
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public void IOnResume() {
        onResume();
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public void IOnSaveInstanceState(android.os.Bundle bundle) {
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public void IOnStart() {
        onStart();
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public void IOnStop() {
        onStop();
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public boolean IOnTouchEvent(android.view.MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public void IOnUserInteraction() {
        onUserInteraction();
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public void IOnWindowFocusChanged(boolean z17) {
        onWindowFocusChanged(z17);
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public void IRequestPermissions(java.lang.String[] strArr, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(strArr);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/midas/plugin/APPluginActivity", "IRequestPermissions", "([Ljava/lang/String;I)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
        requestPermissions((java.lang.String[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(this, "com/tencent/midas/plugin/APPluginActivity", "IRequestPermissions", "([Ljava/lang/String;I)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
        com.tencent.midas.comm.APLog.i("APPluginActivity", "IRequestPermissions() permissions=" + strArr + ", requestCode=" + i17);
        if (this.mIsRunInPlugin) {
            return;
        }
        super.requestPermissions(strArr, i17);
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public void ISetIntent(android.content.Intent intent) {
        setIntent(intent);
    }

    @Override // com.tencent.midas.plugin.IAPPluginActivity
    public void ISetOutHandler(android.os.Handler handler) {
    }

    @Override // android.app.Activity
    public android.view.View findViewById(int i17) {
        android.view.View view;
        if (!this.mIsRunInPlugin || (view = this.mProxyContentView) == null) {
            return super.findViewById(i17);
        }
        android.view.View findViewById = view.findViewById(i17);
        return findViewById == null ? super.findViewById(i17) : findViewById;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        int i17;
        android.content.Intent intent;
        com.tencent.midas.comm.APLog.i("APPluginActivity", "APPluginActivity finish");
        if (!this.mIsRunInPlugin) {
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
        if (this.mProxyActivity != null && !isFinishing()) {
            this.mProxyActivity.setResult(i17, intent);
            this.mProxyActivity.finish();
        }
        this.mFinished = true;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.Context getApplicationContext() {
        android.app.Activity activity;
        com.tencent.midas.comm.APLog.i("APPluginActivity", "APPluginActivity getApplicationContext mProxyActivity:" + this.mProxyActivity);
        return (!this.mIsRunInPlugin || (activity = this.mProxyActivity) == null) ? super.getApplicationContext() : activity.getApplicationContext();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.pm.ApplicationInfo getApplicationInfo() {
        return this.mIsRunInPlugin ? this.mPackageInfo.applicationInfo : super.getApplicationInfo();
    }

    @Override // android.app.Activity
    public int getChangingConfigurations() {
        return this.mIsRunInPlugin ? this.mProxyActivity.getChangingConfigurations() : super.getChangingConfigurations();
    }

    public android.content.res.Resources getHostResources() {
        return this.mProxyActivity.getResources();
    }

    @Override // android.app.Activity
    public android.view.LayoutInflater getLayoutInflater() {
        android.content.Context context = this.mContext;
        return context != null ? android.view.LayoutInflater.from(context) : android.view.LayoutInflater.from(this.mActivity);
    }

    public android.app.Activity getOutActivity() {
        return this.mProxyActivity;
    }

    public android.content.res.Resources getOutResources() {
        return this.mIsRunInPlugin ? this.mProxyActivity.getResources() : this.mActivity.getResources();
    }

    public android.content.pm.PackageInfo getPackageInfo() {
        if (this.mIsRunInPlugin) {
            return this.mPackageInfo;
        }
        return null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.String getPackageName() {
        return this.mIsRunInPlugin ? this.mPackageInfo.packageName : super.getPackageName();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        if ("window".equals(str) || ya.a.SEARCH.equals(str)) {
            return this.mIsRunInPlugin ? this.mProxyActivity.getSystemService(str) : super.getSystemService(str);
        }
        android.content.Context context = this.mContext;
        return context != null ? context.getSystemService(str) : super.getSystemService(str);
    }

    @Override // android.app.Activity
    public android.view.Window getWindow() {
        if (!this.mIsRunInPlugin) {
            return super.getWindow();
        }
        android.app.Activity activity = this.mProxyActivity;
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    @Override // android.app.Activity
    public android.view.WindowManager getWindowManager() {
        return this.mIsRunInPlugin ? this.mProxyActivity.getWindowManager() : super.getWindowManager();
    }

    @Override // android.app.Activity
    public boolean isFinishing() {
        return this.mIsRunInPlugin ? this.mFinished : super.isFinishing();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.midas.comm.APLog.i("APPluginActivity", "APPluginActivity onActivityResult");
        if (this.mIsRunInPlugin) {
            return;
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (this.mIsRunInPlugin) {
            this.mActivity = this.mProxyActivity;
            com.tencent.midas.plugin.APPluginStatic.add(this);
        } else {
            super.onCreate(bundle);
            this.mActivity = this;
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.midas.comm.APLog.i("APPluginActivity", "onDestroy mIsRunInPlugin:" + this.mIsRunInPlugin);
        if (!this.mIsRunInPlugin) {
            super.onDestroy();
        } else {
            this.mDexClassLoader = null;
            com.tencent.midas.plugin.APPluginStatic.remove(this);
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (this.mIsRunInPlugin) {
            return false;
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyMultiple(int i17, int i18, android.view.KeyEvent keyEvent) {
        if (this.mIsRunInPlugin) {
            return false;
        }
        return super.onKeyMultiple(i17, i18, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (this.mIsRunInPlugin) {
            return false;
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        if (this.mIsRunInPlugin) {
            return;
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.tencent.midas.comm.APLog.i("APPluginActivity", "onRequestPermissionsResult() requestCode=" + i17);
        if (this.mIsRunInPlugin) {
            return;
        }
        super.onRequestPermissionsResult(i17, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onRestart() {
        if (this.mIsRunInPlugin) {
            return;
        }
        super.onRestart();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        if (this.mIsRunInPlugin) {
            return;
        }
        super.onResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        if (this.mIsRunInPlugin) {
            return;
        }
        super.onStart();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        if (this.mIsRunInPlugin) {
            return;
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.mIsRunInPlugin) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        if (this.mIsRunInPlugin) {
            return;
        }
        super.onWindowFocusChanged(z17);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        android.app.Activity activity;
        if (!this.mIsRunInPlugin || (activity = this.mProxyActivity) == null) {
            super.openOptionsMenu();
        } else {
            activity.openOptionsMenu();
        }
    }

    @Override // android.app.Activity
    public void overridePendingTransition(int i17, int i18) {
        if (this.mIsRunInPlugin) {
            this.mActivity.overridePendingTransition(i17, i18);
        } else {
            super.overridePendingTransition(i17, i18);
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i17) {
        if (this.mIsRunInPlugin) {
            android.view.View inflate = android.view.LayoutInflater.from(this).inflate(i17, (android.view.ViewGroup) null);
            this.mProxyContentView = inflate;
            this.mActivity.setContentView(inflate);
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
        if (!this.mIsRunInPlugin || (activity = this.mProxyActivity) == null) {
            super.setTheme(i17);
        } else {
            activity.setTheme(i17);
        }
    }

    @Override // android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i17) {
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities;
        if (!this.mIsRunInPlugin) {
            super.startActivityForResult(intent, i17);
            return;
        }
        boolean z17 = false;
        if (intent.hasExtra(com.tencent.midas.plugin.APPluginStatic.PARAM_PLUGIN_INTERNAL_ACTIVITIES_ONLY)) {
            z17 = intent.getBooleanExtra(com.tencent.midas.plugin.APPluginStatic.PARAM_PLUGIN_INTERNAL_ACTIVITIES_ONLY, false);
        } else {
            android.app.Activity activity = this.mProxyActivity;
            if (activity != null) {
                intent.setPackage(activity.getPackageName());
            }
            android.app.Activity activity2 = this.mActivity;
            if (activity2 != null && ((queryIntentActivities = activity2.getPackageManager().queryIntentActivities(intent, 65536)) == null || queryIntentActivities.size() == 0)) {
                z17 = true;
            }
        }
        if (!z17) {
            android.app.Activity activity3 = this.mActivity;
            if (activity3 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.k(activity3, arrayList.toArray(), "com/tencent/midas/plugin/APPluginActivity", "startActivityForResult", "(Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                return;
            }
            return;
        }
        intent.putExtra("pluginsdk_IsPluginActivity", true);
        android.app.Activity activity4 = this.mActivity;
        if (activity4 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.k(activity4, arrayList2.toArray(), "com/tencent/midas/plugin/APPluginActivity", "startActivityForResult", "(Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View view) {
        if (this.mIsRunInPlugin) {
            this.mProxyContentView = view;
            this.mActivity.setContentView(view);
        } else {
            super.setContentView(view);
        }
    }
}
