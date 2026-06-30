package com.tencent.midas.plugin;

/* loaded from: classes13.dex */
public interface IAPPluginActivity {
    boolean IDispatchTouchEvent(android.view.MotionEvent motionEvent);

    void IFinish();

    android.view.View IGetContentView();

    android.os.Handler IGetInHandler();

    android.content.res.Resources IGetResource();

    void IInit(java.lang.String str, java.lang.String str2, android.app.Activity activity, java.lang.ClassLoader classLoader, android.content.pm.PackageInfo packageInfo);

    boolean IIsWrapContent();

    void IOnActivityResult(int i17, int i18, android.content.Intent intent);

    void IOnConfigurationChanged(android.content.res.Configuration configuration);

    void IOnCreate(android.os.Bundle bundle);

    boolean IOnCreateOptionsMenu(android.view.Menu menu);

    void IOnDestroy();

    boolean IOnKeyDown(int i17, android.view.KeyEvent keyEvent);

    boolean IOnKeyMultiple(int i17, int i18, android.view.KeyEvent keyEvent);

    boolean IOnKeyUp(int i17, android.view.KeyEvent keyEvent);

    boolean IOnMenuItemSelected(int i17, android.view.MenuItem menuItem);

    void IOnNewIntent(android.content.Intent intent);

    boolean IOnOptionsItemSelected(android.view.MenuItem menuItem);

    void IOnPause();

    boolean IOnPrepareOptionsMenu(android.view.Menu menu);

    void IOnRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr);

    void IOnRestart();

    void IOnRestoreInstanceState(android.os.Bundle bundle);

    void IOnResume();

    void IOnSaveInstanceState(android.os.Bundle bundle);

    void IOnStart();

    void IOnStop();

    boolean IOnTouchEvent(android.view.MotionEvent motionEvent);

    void IOnUserInteraction();

    void IOnWindowFocusChanged(boolean z17);

    void IRequestPermissions(java.lang.String[] strArr, int i17);

    void ISetIntent(android.content.Intent intent);

    void ISetOutHandler(android.os.Handler handler);
}
