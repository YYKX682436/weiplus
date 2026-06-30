package p012xc85e97e9.p013x9d4bf30f;

/* renamed from: androidx.activity.ComponentActivity */
/* loaded from: classes13.dex */
public class ActivityC0053x3d3f670c extends p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c implements p012xc85e97e9.p093xedfae76a.m1, p012xc85e97e9.p093xedfae76a.k, o4.g, p012xc85e97e9.p013x9d4bf30f.k, p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.i {

    /* renamed from: ACTIVITY_RESULT_TAG */
    private static final java.lang.String f76x38411b88 = "android:support:activity-result";

    /* renamed from: mContentLayoutId */
    private int f78x132d2151;

    /* renamed from: mDefaultFactory */
    private p012xc85e97e9.p093xedfae76a.f1 f80x3d12a156;

    /* renamed from: mViewModelStore */
    private p012xc85e97e9.p093xedfae76a.l1 f86x29b2758a;

    /* renamed from: mContextAwareHelper */
    final g.a f79x33c271ca = new g.a();

    /* renamed from: mMenuHostHelper */
    private final n3.w f82xc81b2402 = new n3.w(new java.lang.Runnable() { // from class: androidx.activity.ComponentActivity$$a
        @Override // java.lang.Runnable
        public final void run() {
            p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c.this.m2513x60b3a53a();
        }
    });

    /* renamed from: mLifecycleRegistry */
    private final p012xc85e97e9.p093xedfae76a.b0 f81xf011f8da = new p012xc85e97e9.p093xedfae76a.b0(this, true);

    /* renamed from: mSavedStateRegistryController */
    final o4.f f85x10fa46b0 = new o4.f(this, null);

    /* renamed from: mOnBackPressedDispatcher */
    private final p012xc85e97e9.p013x9d4bf30f.i f84xcd1dc676 = new p012xc85e97e9.p013x9d4bf30f.i(new p012xc85e97e9.p013x9d4bf30f.b(this));

    /* renamed from: mNextLocalRequestCode */
    private final java.util.concurrent.atomic.AtomicInteger f83x52bf01d1 = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: mActivityResultRegistry */
    private final p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.h f77x5aec9536 = new p012xc85e97e9.p013x9d4bf30f.e(this);

    public ActivityC0053x3d3f670c() {
        if (mo273xed6858b4() == null) {
            throw new java.lang.IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.v() { // from class: androidx.activity.ComponentActivity.3
            @Override // p012xc85e97e9.p093xedfae76a.v
            /* renamed from: onStateChanged */
            public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p093xedfae76a.m mVar) {
                if (mVar == p012xc85e97e9.p093xedfae76a.m.ON_STOP) {
                    android.view.Window window = p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c.this.getWindow();
                    android.view.View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.v() { // from class: androidx.activity.ComponentActivity.4
            @Override // p012xc85e97e9.p093xedfae76a.v
            /* renamed from: onStateChanged */
            public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p093xedfae76a.m mVar) {
                if (mVar == p012xc85e97e9.p093xedfae76a.m.ON_DESTROY) {
                    p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c.this.f79x33c271ca.f348868b = null;
                    if (p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c.this.isChangingConfigurations()) {
                        return;
                    }
                    p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c.this.getViewModel().a();
                }
            }
        });
        mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.v() { // from class: androidx.activity.ComponentActivity.5
            @Override // p012xc85e97e9.p093xedfae76a.v
            /* renamed from: onStateChanged */
            public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p093xedfae76a.m mVar) {
                p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c activityC0053x3d3f670c = p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c.this;
                activityC0053x3d3f670c.m2506xbb068f9b();
                activityC0053x3d3f670c.mo273xed6858b4().c(this);
            }
        });
        mo2511xdf516e9d().b(f76x38411b88, new o4.d() { // from class: androidx.activity.ComponentActivity$$b
            @Override // o4.d
            public final android.os.Bundle a() {
                return p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c.L6(p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c.this);
            }
        });
        m2505x8a97fb2e(new g.b() { // from class: androidx.activity.ComponentActivity$$c
            @Override // g.b
            public final void a(android.content.Context context) {
                p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c.K6(p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c.this, context);
            }
        });
    }

    public static /* synthetic */ void K6(p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c activityC0053x3d3f670c, android.content.Context context) {
        android.os.Bundle a17 = activityC0053x3d3f670c.mo2511xdf516e9d().a(f76x38411b88);
        if (a17 != null) {
            activityC0053x3d3f670c.f77x5aec9536.c(a17);
        }
    }

    public static android.os.Bundle L6(p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c activityC0053x3d3f670c) {
        activityC0053x3d3f670c.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.h hVar = activityC0053x3d3f670c.f77x5aec9536;
        hVar.getClass();
        java.util.HashMap hashMap = (java.util.HashMap) hVar.f90597c;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new java.util.ArrayList<>(hashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new java.util.ArrayList<>(hashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new java.util.ArrayList<>(hVar.f90599e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (android.os.Bundle) hVar.f90602h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", hVar.f90595a);
        return bundle;
    }

    public final void M6() {
        getWindow().getDecorView().setTag(com.p314xaae8f345.mm.R.id.p28, this);
        getWindow().getDecorView().setTag(com.p314xaae8f345.mm.R.id.p2_, this);
        o4.j.b(getWindow().getDecorView(), this);
    }

    @Override // android.app.Activity
    public void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        M6();
        super.addContentView(view, layoutParams);
    }

    /* renamed from: addMenuProvider */
    public void m2502x47193b1(n3.b0 b0Var) {
        n3.w wVar = this.f82xc81b2402;
        wVar.f415961b.add(b0Var);
        wVar.f415960a.run();
    }

    /* renamed from: addOnContextAvailableListener */
    public final void m2505x8a97fb2e(g.b bVar) {
        g.a aVar = this.f79x33c271ca;
        if (aVar.f348868b != null) {
            bVar.a(aVar.f348868b);
        }
        ((java.util.concurrent.CopyOnWriteArraySet) aVar.f348867a).add(bVar);
    }

    /* renamed from: ensureViewModelStore */
    public void m2506xbb068f9b() {
        if (this.f86x29b2758a == null) {
            p012xc85e97e9.p013x9d4bf30f.f fVar = (p012xc85e97e9.p013x9d4bf30f.f) getLastNonConfigurationInstance();
            if (fVar != null) {
                this.f86x29b2758a = fVar.f90569b;
            }
            if (this.f86x29b2758a == null) {
                this.f86x29b2758a = new p012xc85e97e9.p093xedfae76a.l1();
            }
        }
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.i
    /* renamed from: getActivityResultRegistry */
    public final p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.h mo2507xfe541f5f() {
        return this.f77x5aec9536;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k
    /* renamed from: getDefaultViewModelProviderFactory */
    public p012xc85e97e9.p093xedfae76a.f1 mo2508xff1f76e0() {
        if (getApplication() == null) {
            throw new java.lang.IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f80x3d12a156 == null) {
            this.f80x3d12a156 = new p012xc85e97e9.p093xedfae76a.x0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.f80x3d12a156;
    }

    @java.lang.Deprecated
    /* renamed from: getLastCustomNonConfigurationInstance */
    public java.lang.Object m2509x85a9c59b() {
        p012xc85e97e9.p013x9d4bf30f.f fVar = (p012xc85e97e9.p013x9d4bf30f.f) getLastNonConfigurationInstance();
        if (fVar != null) {
            return fVar.f90568a;
        }
        return null;
    }

    @Override // p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return this.f81xf011f8da;
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.k
    /* renamed from: getOnBackPressedDispatcher */
    public final p012xc85e97e9.p013x9d4bf30f.i mo2510x96a7816d() {
        return this.f84xcd1dc676;
    }

    @Override // o4.g
    /* renamed from: getSavedStateRegistry */
    public final o4.b mo2511xdf516e9d() {
        return this.f85x10fa46b0.f424342b;
    }

    @Override // p012xc85e97e9.p093xedfae76a.m1
    /* renamed from: getViewModelStore */
    public p012xc85e97e9.p093xedfae76a.l1 getViewModel() {
        if (getApplication() == null) {
            throw new java.lang.IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        m2506xbb068f9b();
        return this.f86x29b2758a;
    }

    /* renamed from: invalidateMenu */
    public void m2513x60b3a53a() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (this.f77x5aec9536.a(i17, i18, intent)) {
            return;
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f84xcd1dc676.c();
    }

    @Override // p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f85x10fa46b0.a(bundle);
        g.a aVar = this.f79x33c271ca;
        aVar.f348868b = this;
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) aVar.f348867a).iterator();
        while (it.hasNext()) {
            ((g.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        p012xc85e97e9.p093xedfae76a.t0.c(this);
        int i17 = this.f78x132d2151;
        if (i17 != 0) {
            setContentView(i17);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        super.onCreateOptionsMenu(menu);
        n3.w wVar = this.f82xc81b2402;
        getMenuInflater();
        java.util.Iterator it = wVar.f415961b.iterator();
        if (!it.hasNext()) {
            return true;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
        throw null;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        if (super.onOptionsItemSelected(menuItem)) {
            return true;
        }
        java.util.Iterator it = this.f82xc81b2402.f415961b.iterator();
        if (!it.hasNext()) {
            return false;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
        throw null;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (this.f77x5aec9536.a(i17, -1, new android.content.Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i17, strArr, iArr);
    }

    @java.lang.Deprecated
    /* renamed from: onRetainCustomNonConfigurationInstance */
    public java.lang.Object m2514x584d8053() {
        return null;
    }

    @Override // android.app.Activity
    public final java.lang.Object onRetainNonConfigurationInstance() {
        p012xc85e97e9.p013x9d4bf30f.f fVar;
        java.lang.Object m2514x584d8053 = m2514x584d8053();
        p012xc85e97e9.p093xedfae76a.l1 l1Var = this.f86x29b2758a;
        if (l1Var == null && (fVar = (p012xc85e97e9.p013x9d4bf30f.f) getLastNonConfigurationInstance()) != null) {
            l1Var = fVar.f90569b;
        }
        if (l1Var == null && m2514x584d8053 == null) {
            return null;
        }
        p012xc85e97e9.p013x9d4bf30f.f fVar2 = new p012xc85e97e9.p013x9d4bf30f.f();
        fVar2.f90568a = m2514x584d8053;
        fVar2.f90569b = l1Var;
        return fVar2;
    }

    @Override // p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = mo273xed6858b4();
        if (mo273xed6858b4 instanceof p012xc85e97e9.p093xedfae76a.b0) {
            ((p012xc85e97e9.p093xedfae76a.b0) mo273xed6858b4).i(p012xc85e97e9.p093xedfae76a.n.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f85x10fa46b0.b(bundle);
    }

    /* renamed from: peekAvailableContext */
    public android.content.Context m2515x2be3de21() {
        return this.f79x33c271ca.f348868b;
    }

    /* renamed from: registerForActivityResult */
    public final <I, O> p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c m2517xaf5070d2(h.b bVar, p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.h hVar, p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b bVar2) {
        return hVar.d("activity_rq#" + this.f83x52bf01d1.getAndIncrement(), this, bVar, bVar2);
    }

    /* renamed from: removeMenuProvider */
    public void m2518x25a35714(n3.b0 b0Var) {
        this.f82xc81b2402.a(b0Var);
    }

    /* renamed from: removeOnContextAvailableListener */
    public final void m2519x23d29551(g.b bVar) {
        ((java.util.concurrent.CopyOnWriteArraySet) this.f79x33c271ca.f348867a).remove(bVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        if (t4.a.d()) {
            t4.a.f("reportFullyDrawn() for ComponentActivity");
        }
        super.reportFullyDrawn();
    }

    @Override // android.app.Activity
    public void setContentView(int i17) {
        M6();
        super.setContentView(i17);
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startActivityForResult(android.content.Intent intent, int i17) {
        super.startActivityForResult(intent, i17);
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startIntentSenderForResult(android.content.IntentSender intentSender, int i17, android.content.Intent intent, int i18, int i19, int i27) {
        super.startIntentSenderForResult(intentSender, i17, intent, i18, i19, i27);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    @java.lang.Deprecated
    public void startActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        super.startActivityForResult(intent, i17, bundle);
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startIntentSenderForResult(android.content.IntentSender intentSender, int i17, android.content.Intent intent, int i18, int i19, int i27, android.os.Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i17, intent, i18, i19, i27, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View view) {
        M6();
        super.setContentView(view);
    }

    /* renamed from: registerForActivityResult */
    public final <I, O> p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c m2516xaf5070d2(h.b bVar, p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b bVar2) {
        return m2517xaf5070d2(bVar, this.f77x5aec9536, bVar2);
    }

    /* renamed from: addMenuProvider */
    public void m2503x47193b1(final n3.b0 b0Var, p012xc85e97e9.p093xedfae76a.y yVar) {
        final n3.w wVar = this.f82xc81b2402;
        wVar.f415961b.add(b0Var);
        wVar.f415960a.run();
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = yVar.mo273xed6858b4();
        java.util.HashMap hashMap = (java.util.HashMap) wVar.f415962c;
        n3.x xVar = (n3.x) hashMap.remove(b0Var);
        if (xVar != null) {
            xVar.f415967a.c(xVar.f415968b);
            xVar.f415968b = null;
        }
        hashMap.put(b0Var, new n3.x(mo273xed6858b4, new p012xc85e97e9.p093xedfae76a.v(b0Var) { // from class: n3.w$$a
            @Override // p012xc85e97e9.p093xedfae76a.v
            /* renamed from: onStateChanged */
            public final void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y yVar2, p012xc85e97e9.p093xedfae76a.m mVar) {
                p012xc85e97e9.p093xedfae76a.m mVar2 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY;
                n3.w wVar2 = n3.w.this;
                if (mVar == mVar2) {
                    wVar2.a(null);
                } else {
                    wVar2.getClass();
                }
            }
        }));
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        M6();
        super.setContentView(view, layoutParams);
    }

    /* renamed from: addMenuProvider */
    public void m2504x47193b1(final n3.b0 b0Var, p012xc85e97e9.p093xedfae76a.y yVar, final p012xc85e97e9.p093xedfae76a.n nVar) {
        final n3.w wVar = this.f82xc81b2402;
        wVar.getClass();
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = yVar.mo273xed6858b4();
        java.util.HashMap hashMap = (java.util.HashMap) wVar.f415962c;
        n3.x xVar = (n3.x) hashMap.remove(b0Var);
        if (xVar != null) {
            xVar.f415967a.c(xVar.f415968b);
            xVar.f415968b = null;
        }
        hashMap.put(b0Var, new n3.x(mo273xed6858b4, new p012xc85e97e9.p093xedfae76a.v(nVar, b0Var) { // from class: n3.w$$b

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ p012xc85e97e9.p093xedfae76a.n f415965e;

            @Override // p012xc85e97e9.p093xedfae76a.v
            /* renamed from: onStateChanged */
            public final void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y yVar2, p012xc85e97e9.p093xedfae76a.m mVar) {
                n3.w wVar2 = n3.w.this;
                wVar2.getClass();
                int[] iArr = p012xc85e97e9.p093xedfae76a.l.f93167a;
                p012xc85e97e9.p093xedfae76a.n nVar2 = this.f415965e;
                int i17 = iArr[nVar2.ordinal()];
                p012xc85e97e9.p093xedfae76a.m mVar2 = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : p012xc85e97e9.p093xedfae76a.m.ON_RESUME : p012xc85e97e9.p093xedfae76a.m.ON_START : p012xc85e97e9.p093xedfae76a.m.ON_CREATE;
                java.lang.Runnable runnable = wVar2.f415960a;
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = wVar2.f415961b;
                if (mVar == mVar2) {
                    copyOnWriteArrayList.add(null);
                    runnable.run();
                    return;
                }
                p012xc85e97e9.p093xedfae76a.m mVar3 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY;
                if (mVar == mVar3) {
                    wVar2.a(null);
                    return;
                }
                int i18 = iArr[nVar2.ordinal()];
                if (i18 != 1) {
                    mVar3 = i18 != 2 ? i18 != 3 ? null : p012xc85e97e9.p093xedfae76a.m.ON_PAUSE : p012xc85e97e9.p093xedfae76a.m.ON_STOP;
                }
                if (mVar == mVar3) {
                    copyOnWriteArrayList.remove((java.lang.Object) null);
                    runnable.run();
                }
            }
        }));
    }
}
