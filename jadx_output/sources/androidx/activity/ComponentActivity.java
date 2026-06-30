package androidx.activity;

/* loaded from: classes13.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements androidx.lifecycle.m1, androidx.lifecycle.k, o4.g, androidx.activity.k, androidx.activity.result.i {
    private static final java.lang.String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private int mContentLayoutId;
    private androidx.lifecycle.f1 mDefaultFactory;
    private androidx.lifecycle.l1 mViewModelStore;
    final g.a mContextAwareHelper = new g.a();
    private final n3.w mMenuHostHelper = new n3.w(new java.lang.Runnable() { // from class: androidx.activity.ComponentActivity$$a
        @Override // java.lang.Runnable
        public final void run() {
            androidx.activity.ComponentActivity.this.invalidateMenu();
        }
    });
    private final androidx.lifecycle.b0 mLifecycleRegistry = new androidx.lifecycle.b0(this, true);
    final o4.f mSavedStateRegistryController = new o4.f(this, null);
    private final androidx.activity.i mOnBackPressedDispatcher = new androidx.activity.i(new androidx.activity.b(this));
    private final java.util.concurrent.atomic.AtomicInteger mNextLocalRequestCode = new java.util.concurrent.atomic.AtomicInteger();
    private final androidx.activity.result.h mActivityResultRegistry = new androidx.activity.e(this);

    public ComponentActivity() {
        if (mo133getLifecycle() == null) {
            throw new java.lang.IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        mo133getLifecycle().a(new androidx.lifecycle.v() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.v
            public void onStateChanged(androidx.lifecycle.y yVar, androidx.lifecycle.m mVar) {
                if (mVar == androidx.lifecycle.m.ON_STOP) {
                    android.view.Window window = androidx.activity.ComponentActivity.this.getWindow();
                    android.view.View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        mo133getLifecycle().a(new androidx.lifecycle.v() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.v
            public void onStateChanged(androidx.lifecycle.y yVar, androidx.lifecycle.m mVar) {
                if (mVar == androidx.lifecycle.m.ON_DESTROY) {
                    androidx.activity.ComponentActivity.this.mContextAwareHelper.f267335b = null;
                    if (androidx.activity.ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    androidx.activity.ComponentActivity.this.getViewModel().a();
                }
            }
        });
        mo133getLifecycle().a(new androidx.lifecycle.v() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.v
            public void onStateChanged(androidx.lifecycle.y yVar, androidx.lifecycle.m mVar) {
                androidx.activity.ComponentActivity componentActivity = androidx.activity.ComponentActivity.this;
                componentActivity.ensureViewModelStore();
                componentActivity.mo133getLifecycle().c(this);
            }
        });
        getSavedStateRegistry().b(ACTIVITY_RESULT_TAG, new o4.d() { // from class: androidx.activity.ComponentActivity$$b
            @Override // o4.d
            public final android.os.Bundle a() {
                return androidx.activity.ComponentActivity.L6(androidx.activity.ComponentActivity.this);
            }
        });
        addOnContextAvailableListener(new g.b() { // from class: androidx.activity.ComponentActivity$$c
            @Override // g.b
            public final void a(android.content.Context context) {
                androidx.activity.ComponentActivity.K6(androidx.activity.ComponentActivity.this, context);
            }
        });
    }

    public static /* synthetic */ void K6(androidx.activity.ComponentActivity componentActivity, android.content.Context context) {
        android.os.Bundle a17 = componentActivity.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a17 != null) {
            componentActivity.mActivityResultRegistry.c(a17);
        }
    }

    public static android.os.Bundle L6(androidx.activity.ComponentActivity componentActivity) {
        componentActivity.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        androidx.activity.result.h hVar = componentActivity.mActivityResultRegistry;
        hVar.getClass();
        java.util.HashMap hashMap = (java.util.HashMap) hVar.f9064c;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new java.util.ArrayList<>(hashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new java.util.ArrayList<>(hashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new java.util.ArrayList<>(hVar.f9066e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (android.os.Bundle) hVar.f9069h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", hVar.f9062a);
        return bundle;
    }

    public final void M6() {
        getWindow().getDecorView().setTag(com.tencent.mm.R.id.p28, this);
        getWindow().getDecorView().setTag(com.tencent.mm.R.id.p2_, this);
        o4.j.b(getWindow().getDecorView(), this);
    }

    @Override // android.app.Activity
    public void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        M6();
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(n3.b0 b0Var) {
        n3.w wVar = this.mMenuHostHelper;
        wVar.f334428b.add(b0Var);
        wVar.f334427a.run();
    }

    public final void addOnContextAvailableListener(g.b bVar) {
        g.a aVar = this.mContextAwareHelper;
        if (aVar.f267335b != null) {
            bVar.a(aVar.f267335b);
        }
        ((java.util.concurrent.CopyOnWriteArraySet) aVar.f267334a).add(bVar);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            androidx.activity.f fVar = (androidx.activity.f) getLastNonConfigurationInstance();
            if (fVar != null) {
                this.mViewModelStore = fVar.f9036b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new androidx.lifecycle.l1();
            }
        }
    }

    @Override // androidx.activity.result.i
    public final androidx.activity.result.h getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.k
    public androidx.lifecycle.f1 getDefaultViewModelProviderFactory() {
        if (getApplication() == null) {
            throw new java.lang.IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new androidx.lifecycle.x0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @java.lang.Deprecated
    public java.lang.Object getLastCustomNonConfigurationInstance() {
        androidx.activity.f fVar = (androidx.activity.f) getLastNonConfigurationInstance();
        if (fVar != null) {
            return fVar.f9035a;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.k
    public final androidx.activity.i getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // o4.g
    public final o4.b getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f342809b;
    }

    @Override // androidx.lifecycle.m1
    /* renamed from: getViewModelStore */
    public androidx.lifecycle.l1 getViewModel() {
        if (getApplication() == null) {
            throw new java.lang.IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (this.mActivityResultRegistry.a(i17, i18, intent)) {
            return;
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.c();
    }

    @Override // androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.mSavedStateRegistryController.a(bundle);
        g.a aVar = this.mContextAwareHelper;
        aVar.f267335b = this;
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) aVar.f267334a).iterator();
        while (it.hasNext()) {
            ((g.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        androidx.lifecycle.t0.c(this);
        int i17 = this.mContentLayoutId;
        if (i17 != 0) {
            setContentView(i17);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        super.onCreateOptionsMenu(menu);
        n3.w wVar = this.mMenuHostHelper;
        getMenuInflater();
        java.util.Iterator it = wVar.f334428b.iterator();
        if (!it.hasNext()) {
            return true;
        }
        android.support.v4.media.f.a(it.next());
        throw null;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        if (super.onOptionsItemSelected(menuItem)) {
            return true;
        }
        java.util.Iterator it = this.mMenuHostHelper.f334428b.iterator();
        if (!it.hasNext()) {
            return false;
        }
        android.support.v4.media.f.a(it.next());
        throw null;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.a(i17, -1, new android.content.Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i17, strArr, iArr);
    }

    @java.lang.Deprecated
    public java.lang.Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final java.lang.Object onRetainNonConfigurationInstance() {
        androidx.activity.f fVar;
        java.lang.Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        androidx.lifecycle.l1 l1Var = this.mViewModelStore;
        if (l1Var == null && (fVar = (androidx.activity.f) getLastNonConfigurationInstance()) != null) {
            l1Var = fVar.f9036b;
        }
        if (l1Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        androidx.activity.f fVar2 = new androidx.activity.f();
        fVar2.f9035a = onRetainCustomNonConfigurationInstance;
        fVar2.f9036b = l1Var;
        return fVar2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        androidx.lifecycle.o mo133getLifecycle = mo133getLifecycle();
        if (mo133getLifecycle instanceof androidx.lifecycle.b0) {
            ((androidx.lifecycle.b0) mo133getLifecycle).i(androidx.lifecycle.n.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.b(bundle);
    }

    public android.content.Context peekAvailableContext() {
        return this.mContextAwareHelper.f267335b;
    }

    public final <I, O> androidx.activity.result.c registerForActivityResult(h.b bVar, androidx.activity.result.h hVar, androidx.activity.result.b bVar2) {
        return hVar.d("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, bVar, bVar2);
    }

    public void removeMenuProvider(n3.b0 b0Var) {
        this.mMenuHostHelper.a(b0Var);
    }

    public final void removeOnContextAvailableListener(g.b bVar) {
        ((java.util.concurrent.CopyOnWriteArraySet) this.mContextAwareHelper.f267334a).remove(bVar);
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

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
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

    public final <I, O> androidx.activity.result.c registerForActivityResult(h.b bVar, androidx.activity.result.b bVar2) {
        return registerForActivityResult(bVar, this.mActivityResultRegistry, bVar2);
    }

    public void addMenuProvider(final n3.b0 b0Var, androidx.lifecycle.y yVar) {
        final n3.w wVar = this.mMenuHostHelper;
        wVar.f334428b.add(b0Var);
        wVar.f334427a.run();
        androidx.lifecycle.o mo133getLifecycle = yVar.mo133getLifecycle();
        java.util.HashMap hashMap = (java.util.HashMap) wVar.f334429c;
        n3.x xVar = (n3.x) hashMap.remove(b0Var);
        if (xVar != null) {
            xVar.f334434a.c(xVar.f334435b);
            xVar.f334435b = null;
        }
        hashMap.put(b0Var, new n3.x(mo133getLifecycle, new androidx.lifecycle.v(b0Var) { // from class: n3.w$$a
            @Override // androidx.lifecycle.v
            public final void onStateChanged(androidx.lifecycle.y yVar2, androidx.lifecycle.m mVar) {
                androidx.lifecycle.m mVar2 = androidx.lifecycle.m.ON_DESTROY;
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

    public void addMenuProvider(final n3.b0 b0Var, androidx.lifecycle.y yVar, final androidx.lifecycle.n nVar) {
        final n3.w wVar = this.mMenuHostHelper;
        wVar.getClass();
        androidx.lifecycle.o mo133getLifecycle = yVar.mo133getLifecycle();
        java.util.HashMap hashMap = (java.util.HashMap) wVar.f334429c;
        n3.x xVar = (n3.x) hashMap.remove(b0Var);
        if (xVar != null) {
            xVar.f334434a.c(xVar.f334435b);
            xVar.f334435b = null;
        }
        hashMap.put(b0Var, new n3.x(mo133getLifecycle, new androidx.lifecycle.v(nVar, b0Var) { // from class: n3.w$$b

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ androidx.lifecycle.n f334432e;

            @Override // androidx.lifecycle.v
            public final void onStateChanged(androidx.lifecycle.y yVar2, androidx.lifecycle.m mVar) {
                n3.w wVar2 = n3.w.this;
                wVar2.getClass();
                int[] iArr = androidx.lifecycle.l.f11634a;
                androidx.lifecycle.n nVar2 = this.f334432e;
                int i17 = iArr[nVar2.ordinal()];
                androidx.lifecycle.m mVar2 = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : androidx.lifecycle.m.ON_RESUME : androidx.lifecycle.m.ON_START : androidx.lifecycle.m.ON_CREATE;
                java.lang.Runnable runnable = wVar2.f334427a;
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = wVar2.f334428b;
                if (mVar == mVar2) {
                    copyOnWriteArrayList.add(null);
                    runnable.run();
                    return;
                }
                androidx.lifecycle.m mVar3 = androidx.lifecycle.m.ON_DESTROY;
                if (mVar == mVar3) {
                    wVar2.a(null);
                    return;
                }
                int i18 = iArr[nVar2.ordinal()];
                if (i18 != 1) {
                    mVar3 = i18 != 2 ? i18 != 3 ? null : androidx.lifecycle.m.ON_PAUSE : androidx.lifecycle.m.ON_STOP;
                }
                if (mVar == mVar3) {
                    copyOnWriteArrayList.remove((java.lang.Object) null);
                    runnable.run();
                }
            }
        }));
    }
}
