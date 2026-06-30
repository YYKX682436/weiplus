package p012xc85e97e9.p087x9da2e250.app;

/* renamed from: androidx.fragment.app.FragmentActivity */
/* loaded from: classes14.dex */
public class ActivityC1102x9ee2d9f extends p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c implements z2.f, z2.g {

    /* renamed from: FRAGMENTS_TAG */
    static final java.lang.String f3467x87ac313e = "android:support:fragments";

    /* renamed from: mCreated */
    boolean f3468xdb6731bb;

    /* renamed from: mResumed */
    boolean f3471xdf83f0aa;

    /* renamed from: mFragments */
    final p012xc85e97e9.p087x9da2e250.app.t0 f3470x9170b236 = new p012xc85e97e9.p087x9da2e250.app.t0(new p012xc85e97e9.p087x9da2e250.app.k0(this));

    /* renamed from: mFragmentLifecycleRegistry */
    final p012xc85e97e9.p093xedfae76a.b0 f3469xd3477d6a = new p012xc85e97e9.p093xedfae76a.b0(this, true);

    /* renamed from: mStopped */
    boolean f3472x2dc844a0 = true;

    public ActivityC1102x9ee2d9f() {
        mo2511xdf516e9d().b(f3467x87ac313e, new p012xc85e97e9.p087x9da2e250.app.i0(this));
        m2505x8a97fb2e(new p012xc85e97e9.p087x9da2e250.app.j0(this));
    }

    public static boolean N6(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d, p012xc85e97e9.p093xedfae76a.n nVar) {
        boolean z17 = false;
        for (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 : abstractC1104xc1ad431d.m7675x1626d96d()) {
            if (componentCallbacksC1101xa17d4670 != null) {
                if (componentCallbacksC1101xa17d4670.m7447xfb805e1e() != null) {
                    z17 |= N6(componentCallbacksC1101xa17d4670.m7437x54c0aef7(), nVar);
                }
                p012xc85e97e9.p087x9da2e250.app.c3 c3Var = componentCallbacksC1101xa17d4670.f3463xdf3b8abb;
                if (c3Var != null) {
                    c3Var.b();
                    if (c3Var.f92804d.f93138c.a(p012xc85e97e9.p093xedfae76a.n.STARTED)) {
                        componentCallbacksC1101xa17d4670.f3463xdf3b8abb.f92804d.i(nVar);
                        z17 = true;
                    }
                }
                if (componentCallbacksC1101xa17d4670.f3438xf011f8da.f93138c.a(p012xc85e97e9.p093xedfae76a.n.STARTED)) {
                    componentCallbacksC1101xa17d4670.f3438xf011f8da.i(nVar);
                    z17 = true;
                }
            }
        }
        return z17;
    }

    /* renamed from: dispatchFragmentsOnCreateView */
    public final android.view.View m7594x4522ec69(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return this.f3470x9170b236.f93009a.f93029g.m7677x9866b4ff().onCreateView(view, str, context, attributeSet);
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
        printWriter.print(this.f3468xdb6731bb);
        printWriter.print(" mResumed=");
        printWriter.print(this.f3471xdf83f0aa);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3472x2dc844a0);
        if (getApplication() != null) {
            a4.b.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f3470x9170b236.f93009a.f93029g.m7658x2f39f4(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: getSupportFragmentManager */
    public p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d mo7595x9cdc264() {
        return this.f3470x9170b236.f93009a.f93029g;
    }

    @java.lang.Deprecated
    /* renamed from: getSupportLoaderManager */
    public a4.b m7596x8181a101() {
        return a4.b.b(this);
    }

    /* renamed from: markFragmentsCreated */
    public void m7597x80e3e232() {
        do {
        } while (N6(mo7595x9cdc264(), p012xc85e97e9.p093xedfae76a.n.CREATED));
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        this.f3470x9170b236.a();
        super.onActivityResult(i17, i18, intent);
    }

    @java.lang.Deprecated
    /* renamed from: onAttachFragment */
    public void m7598x140dc774(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3470x9170b236.a();
        this.f3470x9170b236.f93009a.f93029g.m7639xfc09c78(configuration);
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f3469xd3477d6a.f(p012xc85e97e9.p093xedfae76a.m.ON_CREATE);
        this.f3470x9170b236.f93009a.f93029g.m7641x88790e16();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i17, android.view.Menu menu) {
        if (i17 != 0) {
            return super.onCreatePanelMenu(i17, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i17, menu);
        p012xc85e97e9.p087x9da2e250.app.t0 t0Var = this.f3470x9170b236;
        return onCreatePanelMenu | t0Var.f93009a.f93029g.m7642x514aa127(menu, getMenuInflater());
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View m7594x4522ec69 = m7594x4522ec69(view, str, context, attributeSet);
        return m7594x4522ec69 == null ? super.onCreateView(view, str, context, attributeSet) : m7594x4522ec69;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f3470x9170b236.f93009a.f93029g.m7643xa62dd620();
        this.f3469xd3477d6a.f(p012xc85e97e9.p093xedfae76a.m.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f3470x9170b236.f93009a.f93029g.m7645x1353c21b();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i17, android.view.MenuItem menuItem) {
        if (super.onMenuItemSelected(i17, menuItem)) {
            return true;
        }
        if (i17 == 0) {
            return this.f3470x9170b236.f93009a.f93029g.m7648xfa3e19b2(menuItem);
        }
        if (i17 != 6) {
            return false;
        }
        return this.f3470x9170b236.f93009a.f93029g.m7640x9d93b743(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z17) {
        this.f3470x9170b236.f93009a.f93029g.m7646x58578662(z17);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        this.f3470x9170b236.a();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i17, android.view.Menu menu) {
        if (i17 == 0) {
            this.f3470x9170b236.f93009a.f93029g.m7649x1aca938f(menu);
        }
        super.onPanelClosed(i17, menu);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f3471xdf83f0aa = false;
        this.f3470x9170b236.f93009a.f93029g.m7650x80f5ad9c();
        this.f3469xd3477d6a.f(p012xc85e97e9.p093xedfae76a.m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z17) {
        this.f3470x9170b236.f93009a.f93029g.m7651xaf1d8afc(z17);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m7600xc8aef297();
    }

    @java.lang.Deprecated
    /* renamed from: onPrepareOptionsPanel */
    public boolean m7599x9d1b6c4e(android.view.View view, android.view.Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i17, android.view.View view, android.view.Menu menu) {
        return i17 == 0 ? m7599x9d1b6c4e(view, menu) | this.f3470x9170b236.f93009a.f93029g.m7652x353627b0(menu) : super.onPreparePanel(i17, view, menu);
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        this.f3470x9170b236.a();
        super.onRequestPermissionsResult(i17, strArr, iArr);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f3471xdf83f0aa = true;
        this.f3470x9170b236.a();
        this.f3470x9170b236.f93009a.f93029g.m7660x13596257(true);
    }

    /* renamed from: onResumeFragments */
    public void m7600xc8aef297() {
        this.f3469xd3477d6a.f(p012xc85e97e9.p093xedfae76a.m.ON_RESUME);
        this.f3470x9170b236.f93009a.f93029g.m7654xa1613547();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.f3472x2dc844a0 = false;
        if (!this.f3468xdb6731bb) {
            this.f3468xdb6731bb = true;
            this.f3470x9170b236.f93009a.f93029g.m7637x1d9214ff();
        }
        this.f3470x9170b236.a();
        this.f3470x9170b236.f93009a.f93029g.m7660x13596257(true);
        this.f3469xd3477d6a.f(p012xc85e97e9.p093xedfae76a.m.ON_START);
        this.f3470x9170b236.f93009a.f93029g.m7655x81284c08();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f3470x9170b236.a();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f3472x2dc844a0 = true;
        m7597x80e3e232();
        this.f3470x9170b236.f93009a.f93029g.m7656xb195f39c();
        this.f3469xd3477d6a.f(p012xc85e97e9.p093xedfae76a.m.ON_STOP);
    }

    /* renamed from: setEnterSharedElementCallback */
    public void m7601x8a863e46(z2.z1 z1Var) {
        int i17 = z2.h.f550981a;
        z2.b.c(this, null);
    }

    /* renamed from: setExitSharedElementCallback */
    public void m7602x1c53077c(z2.z1 z1Var) {
        int i17 = z2.h.f550981a;
        z2.b.d(this, null);
    }

    /* renamed from: startActivityFromFragment */
    public void mo7603xcc5c304b(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, android.content.Intent intent, int i17) {
        mo7604xcc5c304b(componentCallbacksC1101xa17d4670, intent, i17, (android.os.Bundle) null);
    }

    @java.lang.Deprecated
    /* renamed from: startIntentSenderFromFragment */
    public void m7605x7fde412d(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, android.content.IntentSender intentSender, int i17, android.content.Intent intent, int i18, int i19, int i27, android.os.Bundle bundle) {
        if (i17 != -1) {
            componentCallbacksC1101xa17d4670.m7589xeb9fea13(intentSender, i17, intent, i18, i19, i27, bundle);
        } else {
            int i28 = z2.h.f550981a;
            z2.a.c(this, intentSender, i17, intent, i18, i19, i27, bundle);
        }
    }

    /* renamed from: supportFinishAfterTransition */
    public void m7606xe2c3d6af() {
        int i17 = z2.h.f550981a;
        z2.b.a(this);
    }

    @java.lang.Deprecated
    /* renamed from: supportInvalidateOptionsMenu */
    public void mo2548x55429c53() {
        invalidateOptionsMenu();
    }

    /* renamed from: supportPostponeEnterTransition */
    public void m7607x38187a08() {
        int i17 = z2.h.f550981a;
        z2.b.b(this);
    }

    /* renamed from: supportStartPostponedEnterTransition */
    public void m7608x5e1772d2() {
        int i17 = z2.h.f550981a;
        z2.b.e(this);
    }

    @Override // z2.g
    @java.lang.Deprecated
    /* renamed from: validateRequestPermissionsRequestCode */
    public final void mo7609xbbf31df1(int i17) {
    }

    /* renamed from: startActivityFromFragment */
    public void mo7604xcc5c304b(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, android.content.Intent intent, int i17, android.os.Bundle bundle) {
        if (i17 == -1) {
            int i18 = z2.h.f550981a;
            z2.a.b(this, intent, -1, bundle);
        } else {
            componentCallbacksC1101xa17d4670.mo7588x5dc77fb5(intent, i17, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View m7594x4522ec69 = m7594x4522ec69(null, str, context, attributeSet);
        return m7594x4522ec69 == null ? super.onCreateView(str, context, attributeSet) : m7594x4522ec69;
    }
}
