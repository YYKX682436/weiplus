package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class b2 implements rf5.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j2 f255277d;

    public b2(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j2 j2Var) {
        this.f255277d = j2Var;
    }

    @Override // bm5.s0
    /* renamed from: getTag */
    public java.lang.String mo10824xb5887064() {
        return "MultipleTextStatusCardDialog";
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
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPause: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j2 j2Var = this.f255277d;
        bi4.n0 f17 = j2Var.f();
        sb6.append(f17 != null ? java.lang.Integer.valueOf(f17.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.MultipleTextStatusCardDialog", sb6.toString());
        bi4.n0 f18 = j2Var.f();
        if (f18 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3) f18).d();
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
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onResume: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j2 j2Var = this.f255277d;
        bi4.n0 f17 = j2Var.f();
        sb6.append(f17 != null ? java.lang.Integer.valueOf(f17.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.MultipleTextStatusCardDialog", sb6.toString());
        bi4.n0 f18 = j2Var.f();
        if (f18 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3) f18).a();
        }
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
