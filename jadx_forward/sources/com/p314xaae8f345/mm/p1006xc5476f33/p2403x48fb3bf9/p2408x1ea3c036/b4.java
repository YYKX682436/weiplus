package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public abstract class b4 extends sd.w {

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.h f263686k;

    public b4(android.app.Activity activity) {
        super(activity);
        java.util.LinkedList linkedList;
        this.f488193a = uw4.n.class;
        sd.f fVar = this.f488197e;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.t5.class) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.t5.f264000a = new java.util.LinkedList();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.t5.b();
            linkedList = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.t5.f264000a;
        }
        fVar.getClass();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            fVar.f488132a.add((java.lang.Class) it.next());
        }
        this.f263686k = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.h();
        nf.g gVar = ((sd.u) this.f488202j).f488186a.f488198f;
        gVar.f418117c.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.a4(this, activity));
    }

    @Override // sd.w
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) b();
        e0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageMMWebPage", "onAddInContainer");
        java.lang.String string = e0Var.f488190n.getString("float_ball_key");
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.x3 x3Var = e0Var.E;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.x2 x2Var = e0Var.D;
        if (K0) {
            x2Var.b(5, com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(java.lang.String.format("web-%s", e0Var.s())));
            x3Var.y(5, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.s0.d(((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).m(e0Var.s())));
        } else {
            x2Var.b(5, string);
            x3Var.y(5, string);
        }
        x2Var.c0("rawUrl", e0Var.s());
        x2Var.t0(e0Var.s());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e0Var.t())) {
            x2Var.Z(e0Var.s());
        }
        e0Var.Y = true;
        if (e0Var.X) {
            x2Var.x();
            x3Var.z();
        }
        java.lang.String s17 = e0Var.s();
        if (s17 == null) {
            s17 = "";
        }
        java.lang.String s18 = e0Var.s();
        if (s18 == null) {
            s18 = "";
        }
        e0Var.F = new com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16092xbbe22aef(s17, s18, "");
        ((d73.i) i95.n0.c(d73.i.class)).Sb(e0Var.F);
        e0Var.l();
        k();
    }

    public final void k() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f95;
        android.content.Context context = this.f488194b;
        if (!(context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) || (m78735x28280f95 = ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).m78735x28280f95()) == null) {
            return;
        }
        if (((sd.u) this.f488202j).f488186a.f488196d.size() <= 1) {
            m78735x28280f95.m81450x8e764904(true);
        } else {
            m78735x28280f95.m81450x8e764904(false);
        }
    }
}
