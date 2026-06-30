package cj4;

/* loaded from: classes11.dex */
public final class n1 implements rf5.b {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f42002d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f42003e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f42004f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ref.WeakReference f42005g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f42006h;

    public n1(java.lang.String contextKey, android.content.Context context, yz5.a destroyCallback) {
        kotlin.jvm.internal.o.g(contextKey, "contextKey");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(destroyCallback, "destroyCallback");
        this.f42002d = contextKey;
        this.f42003e = destroyCallback;
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(context);
        this.f42005g = weakReference;
        android.content.Context context2 = (android.content.Context) weakReference.get();
        if (context2 instanceof com.tencent.mm.ui.MMFragmentActivity) {
            J0((com.tencent.mm.ui.MMFragmentActivity) context2);
        }
    }

    @Override // bm5.s0
    public java.lang.String getTag() {
        return this.f42002d;
    }

    @Override // pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    @Override // pf5.g
    public boolean onBackPressed() {
        return false;
    }

    @Override // pf5.g
    public void onBeforeFinish(android.content.Intent intent) {
    }

    @Override // pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
    }

    @Override // pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
    }

    @Override // pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
    }

    @Override // pf5.g
    public void onDestroy() {
        android.content.Context context = (android.content.Context) this.f42005g.get();
        if (context != null) {
            java.lang.ref.WeakReference weakReference = this.f42006h;
            if (weakReference != null) {
            }
            if (context instanceof com.tencent.mm.ui.MMFragmentActivity) {
                x8((com.tencent.mm.ui.MMFragmentActivity) context);
            }
        }
        this.f42003e.invoke();
    }

    @Override // pf5.g
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return false;
    }

    @Override // pf5.g
    public boolean onKeyUp(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return false;
    }

    @Override // pf5.g
    public void onNewIntent(android.content.Intent intent) {
    }

    @Override // pf5.g
    public void onPause() {
        this.f42004f = true;
        java.lang.ref.WeakReference weakReference = this.f42006h;
        if (weakReference != null) {
        }
    }

    @Override // pf5.g
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
    }

    @Override // pf5.g
    public void onRestoreInstanceState(android.os.Bundle bundle) {
    }

    @Override // pf5.g
    public void onResume() {
        cj4.m1 m1Var;
        java.lang.ref.WeakReference weakReference = this.f42006h;
        if (weakReference == null || (m1Var = (cj4.m1) weakReference.get()) == null) {
            return;
        }
        com.tencent.mm.plugin.textstatus.ui.m3 m3Var = (com.tencent.mm.plugin.textstatus.ui.m3) m1Var;
        if (!this.f42004f) {
            return;
        }
        m3Var.f174085a.H();
    }

    @Override // pf5.g
    public void onSaveInstanceState(android.os.Bundle bundle) {
    }

    @Override // pf5.g
    public void onStart() {
    }

    @Override // pf5.g
    public void onStop() {
    }
}
