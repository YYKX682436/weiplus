package cj4;

/* loaded from: classes11.dex */
public final class n1 implements rf5.b {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f123535d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f123536e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f123537f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ref.WeakReference f123538g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f123539h;

    public n1(java.lang.String contextKey, android.content.Context context, yz5.a destroyCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextKey, "contextKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destroyCallback, "destroyCallback");
        this.f123535d = contextKey;
        this.f123536e = destroyCallback;
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(context);
        this.f123538g = weakReference;
        android.content.Context context2 = (android.content.Context) weakReference.get();
        if (context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
            J0((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context2);
        }
    }

    @Override // bm5.s0
    /* renamed from: getTag */
    public java.lang.String mo10824xb5887064() {
        return this.f123535d;
    }

    @Override // pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
    }

    @Override // pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        return false;
    }

    @Override // pf5.g
    /* renamed from: onBeforeFinish */
    public void mo2275x62f76871(android.content.Intent intent) {
    }

    @Override // pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
    }

    @Override // pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
    }

    @Override // pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
    }

    @Override // pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        android.content.Context context = (android.content.Context) this.f123538g.get();
        if (context != null) {
            java.lang.ref.WeakReference weakReference = this.f123539h;
            if (weakReference != null) {
            }
            if (context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
                x8((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context);
            }
        }
        this.f123536e.mo152xb9724478();
    }

    @Override // pf5.g
    /* renamed from: onKeyDown */
    public boolean mo2278x1f03f0c2(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return false;
    }

    @Override // pf5.g
    /* renamed from: onKeyUp */
    public boolean mo2279xafd962bb(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return false;
    }

    @Override // pf5.g
    /* renamed from: onNewIntent */
    public void mo2280xc944513d(android.content.Intent intent) {
    }

    @Override // pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        this.f123537f = true;
        java.lang.ref.WeakReference weakReference = this.f123539h;
        if (weakReference != null) {
        }
    }

    @Override // pf5.g
    /* renamed from: onRequestPermissionsResult */
    public void mo2282x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
    }

    @Override // pf5.g
    /* renamed from: onRestoreInstanceState */
    public void mo2283xb949e58d(android.os.Bundle bundle) {
    }

    @Override // pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        cj4.m1 m1Var;
        java.lang.ref.WeakReference weakReference = this.f123539h;
        if (weakReference == null || (m1Var = (cj4.m1) weakReference.get()) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.m3 m3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.m3) m1Var;
        if (!this.f123537f) {
            return;
        }
        m3Var.f255618a.H();
    }

    @Override // pf5.g
    /* renamed from: onSaveInstanceState */
    public void mo2285xa71a2260(android.os.Bundle bundle) {
    }

    @Override // pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
    }

    @Override // pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
    }
}
