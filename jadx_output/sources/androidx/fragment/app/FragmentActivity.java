package androidx.fragment.app;

/* loaded from: classes14.dex */
public class FragmentActivity extends androidx.activity.ComponentActivity implements z2.f, z2.g {
    static final java.lang.String FRAGMENTS_TAG = "android:support:fragments";
    boolean mCreated;
    boolean mResumed;
    final androidx.fragment.app.t0 mFragments = new androidx.fragment.app.t0(new androidx.fragment.app.k0(this));
    final androidx.lifecycle.b0 mFragmentLifecycleRegistry = new androidx.lifecycle.b0(this, true);
    boolean mStopped = true;

    public FragmentActivity() {
        getSavedStateRegistry().b(FRAGMENTS_TAG, new androidx.fragment.app.i0(this));
        addOnContextAvailableListener(new androidx.fragment.app.j0(this));
    }

    public static boolean N6(androidx.fragment.app.FragmentManager fragmentManager, androidx.lifecycle.n nVar) {
        boolean z17 = false;
        for (androidx.fragment.app.Fragment fragment : fragmentManager.getFragments()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z17 |= N6(fragment.getChildFragmentManager(), nVar);
                }
                androidx.fragment.app.c3 c3Var = fragment.mViewLifecycleOwner;
                if (c3Var != null) {
                    c3Var.b();
                    if (c3Var.f11271d.f11605c.a(androidx.lifecycle.n.STARTED)) {
                        fragment.mViewLifecycleOwner.f11271d.i(nVar);
                        z17 = true;
                    }
                }
                if (fragment.mLifecycleRegistry.f11605c.a(androidx.lifecycle.n.STARTED)) {
                    fragment.mLifecycleRegistry.i(nVar);
                    z17 = true;
                }
            }
        }
        return z17;
    }

    public final android.view.View dispatchFragmentsOnCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return this.mFragments.f11476a.f11496g.getLayoutInflaterFactory().onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        printWriter.println(" State:");
        java.lang.String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            a4.b.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.f11476a.f11496g.dump(str, fileDescriptor, printWriter, strArr);
    }

    public androidx.fragment.app.FragmentManager getSupportFragmentManager() {
        return this.mFragments.f11476a.f11496g;
    }

    @java.lang.Deprecated
    public a4.b getSupportLoaderManager() {
        return a4.b.b(this);
    }

    public void markFragmentsCreated() {
        do {
        } while (N6(getSupportFragmentManager(), androidx.lifecycle.n.CREATED));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i17, i18, intent);
    }

    @java.lang.Deprecated
    public void onAttachFragment(androidx.fragment.app.Fragment fragment) {
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mFragments.a();
        this.mFragments.f11476a.f11496g.dispatchConfigurationChanged(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.m.ON_CREATE);
        this.mFragments.f11476a.f11496g.dispatchCreate();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i17, android.view.Menu menu) {
        if (i17 != 0) {
            return super.onCreatePanelMenu(i17, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i17, menu);
        androidx.fragment.app.t0 t0Var = this.mFragments;
        return onCreatePanelMenu | t0Var.f11476a.f11496g.dispatchCreateOptionsMenu(menu, getMenuInflater());
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f11476a.f11496g.dispatchDestroy();
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.m.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.f11476a.f11496g.dispatchLowMemory();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i17, android.view.MenuItem menuItem) {
        if (super.onMenuItemSelected(i17, menuItem)) {
            return true;
        }
        if (i17 == 0) {
            return this.mFragments.f11476a.f11496g.dispatchOptionsItemSelected(menuItem);
        }
        if (i17 != 6) {
            return false;
        }
        return this.mFragments.f11476a.f11496g.dispatchContextItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z17) {
        this.mFragments.f11476a.f11496g.dispatchMultiWindowModeChanged(z17);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.a();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i17, android.view.Menu menu) {
        if (i17 == 0) {
            this.mFragments.f11476a.f11496g.dispatchOptionsMenuClosed(menu);
        }
        super.onPanelClosed(i17, menu);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f11476a.f11496g.dispatchPause();
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z17) {
        this.mFragments.f11476a.f11496g.dispatchPictureInPictureModeChanged(z17);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @java.lang.Deprecated
    public boolean onPrepareOptionsPanel(android.view.View view, android.view.Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i17, android.view.View view, android.view.Menu menu) {
        return i17 == 0 ? onPrepareOptionsPanel(view, menu) | this.mFragments.f11476a.f11496g.dispatchPrepareOptionsMenu(menu) : super.onPreparePanel(i17, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i17, strArr, iArr);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.mResumed = true;
        this.mFragments.a();
        this.mFragments.f11476a.f11496g.execPendingActions(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.m.ON_RESUME);
        this.mFragments.f11476a.f11496g.dispatchResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.f11476a.f11496g.dispatchActivityCreated();
        }
        this.mFragments.a();
        this.mFragments.f11476a.f11496g.execPendingActions(true);
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.m.ON_START);
        this.mFragments.f11476a.f11496g.dispatchStart();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.f11476a.f11496g.dispatchStop();
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.m.ON_STOP);
    }

    public void setEnterSharedElementCallback(z2.z1 z1Var) {
        int i17 = z2.h.f469448a;
        z2.b.c(this, null);
    }

    public void setExitSharedElementCallback(z2.z1 z1Var) {
        int i17 = z2.h.f469448a;
        z2.b.d(this, null);
    }

    public void startActivityFromFragment(androidx.fragment.app.Fragment fragment, android.content.Intent intent, int i17) {
        startActivityFromFragment(fragment, intent, i17, (android.os.Bundle) null);
    }

    @java.lang.Deprecated
    public void startIntentSenderFromFragment(androidx.fragment.app.Fragment fragment, android.content.IntentSender intentSender, int i17, android.content.Intent intent, int i18, int i19, int i27, android.os.Bundle bundle) {
        if (i17 != -1) {
            fragment.startIntentSenderForResult(intentSender, i17, intent, i18, i19, i27, bundle);
        } else {
            int i28 = z2.h.f469448a;
            z2.a.c(this, intentSender, i17, intent, i18, i19, i27, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        int i17 = z2.h.f469448a;
        z2.b.a(this);
    }

    @java.lang.Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        int i17 = z2.h.f469448a;
        z2.b.b(this);
    }

    public void supportStartPostponedEnterTransition() {
        int i17 = z2.h.f469448a;
        z2.b.e(this);
    }

    @Override // z2.g
    @java.lang.Deprecated
    public final void validateRequestPermissionsRequestCode(int i17) {
    }

    public void startActivityFromFragment(androidx.fragment.app.Fragment fragment, android.content.Intent intent, int i17, android.os.Bundle bundle) {
        if (i17 == -1) {
            int i18 = z2.h.f469448a;
            z2.a.b(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i17, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }
}
