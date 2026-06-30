package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class q1 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f286838a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f286839b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ot0.q f286840c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f286841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f286842e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f286843f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 f286844g;

    public q1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, boolean z17, ot0.q qVar, android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var) {
        this.f286838a = u3Var;
        this.f286839b = z17;
        this.f286840c = qVar;
        this.f286841d = view;
        this.f286842e = dVar;
        this.f286843f = f9Var;
        this.f286844g = a0Var;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        boolean z17 = this.f286839b;
        yb5.d dVar = this.f286842e;
        if (z17) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.c2.h0(this.f286840c, this.f286841d, dVar, this.f286843f, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qq(this.f286844g));
        } else {
            db5.t7.m123882x26a183b(dVar.g(), com.p314xaae8f345.mm.R.C30867xcad56011.ggb, 0).show();
        }
        this.f286838a.cancel();
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1293L, 32L, 1L);
        this.f286838a.cancel();
    }
}
