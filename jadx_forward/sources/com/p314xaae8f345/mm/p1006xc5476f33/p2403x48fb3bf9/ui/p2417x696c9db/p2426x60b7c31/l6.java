package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes8.dex */
public class l6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 f266786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266787e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266788f;

    public l6(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 abstractC19284xdca64a7, nw4.y2 y2Var) {
        this.f266788f = c1Var;
        this.f266786d = abstractC19284xdca64a7;
        this.f266787e = y2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5399xd243b6 c5399xd243b6 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5399xd243b6();
        am.q8 q8Var = c5399xd243b6.f135741g;
        q8Var.f89229a = 1;
        q8Var.f89230b = this.f266786d.f264271g;
        q8Var.f89231c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) this.f266787e.f422323a.get("duration"), 60);
        q8Var.f89232d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k6(this, c5399xd243b6);
        c5399xd243b6.e();
    }
}
