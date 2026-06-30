package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes10.dex */
public final class bb0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f193530p;

    /* renamed from: q, reason: collision with root package name */
    public final int f193531q;

    /* renamed from: r, reason: collision with root package name */
    public int f193532r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f193533s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f193534t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f193530p = statusMonitor;
        this.f193531q = 3;
        this.f193532r = 3;
        this.f193533s = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.fmo);
        this.f193534t = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("FinderLiveSwitchModeTimer", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.za0(this), true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void t1() {
        K0(0);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f193534t;
        b4Var.d();
        b4Var.c(1000L, 1000L);
    }
}
