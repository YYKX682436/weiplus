package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class w8 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f171843d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f171844e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f171845f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f171846g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f171845f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f171846g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.v8(this);
    }

    public final void O6() {
        if (m158354x19263085().isDestroyed() || m158354x19263085().isFinishing()) {
            return;
        }
        this.f171843d = true;
        this.f171845f.mo50297x7c4d7ca2(this.f171846g, 433L);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo48805xd384d23c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.e1 e1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.e1.f170549a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.ui.AppBrandUI");
        e1Var.a((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) m158354x19263085, "onBackPressed(mEatBackPressed:" + this.f171844e + ')');
        if (this.f171844e) {
            return true;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.ui.AppBrandUI");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc q76 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) m158354x192630852).q7();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo48805xd384d23c2 = q76.mo48805xd384d23c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = mo48805xd384d23c2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) mo48805xd384d23c2 : null;
        if (o6Var != null) {
            if (!o6Var.Q0()) {
                o6Var = null;
            }
            if (o6Var != null && (l0Var = o6Var.H2) != null && (f0Var = l0Var.f172731d) != null) {
                f0Var.T(11);
            }
        }
        ze.l lVar = q76 instanceof ze.l ? (ze.l) q76 : null;
        if (lVar == null) {
            return false;
        }
        if (!lVar.a0() && (mo48805xd384d23c = lVar.mo48805xd384d23c()) != null) {
            try {
                mo48805xd384d23c.Z0();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntimeContainer", "onBackPressed e = %s", e17);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.z4(lVar, e17));
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        O6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        this.f171845f.mo50302x6b17ad39(null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onEnterAnimationComplete */
    public void mo53055x51d329a4() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f171845f;
        java.lang.Runnable runnable = this.f171846g;
        n3Var.mo50300x3fa464aa(runnable);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.v8) runnable).run();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onNewIntent */
    public void mo2280xc944513d(android.content.Intent intent) {
        super.mo2280xc944513d(intent);
        O6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        super.mo2286xb05099c3();
        if (this.f171843d) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f171845f;
        java.lang.Runnable runnable = this.f171846g;
        n3Var.mo50300x3fa464aa(runnable);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.v8) runnable).run();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        this.f171845f.mo50300x3fa464aa(this.f171846g);
        this.f171844e = true;
        this.f171843d = false;
    }
}
