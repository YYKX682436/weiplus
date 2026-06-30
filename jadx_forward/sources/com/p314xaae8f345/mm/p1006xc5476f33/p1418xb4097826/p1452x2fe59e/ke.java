package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class ke implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af f188717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f188718e;

    public ke(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af afVar, boolean z17) {
        this.f188717d = afVar;
        this.f188718e = z17;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af afVar = this.f188717d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = afVar.f187810x1;
        if (k0Var != null) {
            k0Var.o(null);
        }
        g4Var.clear();
        boolean z17 = this.f188718e;
        g4Var.j(z17 ? 0 : 2, "发送给朋友", com.p314xaae8f345.mm.R.raw.f79181x28396080, afVar.m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m), false);
        g4Var.j(z17 ? 1 : 3, "分享到朋友圈", com.p314xaae8f345.mm.R.raw.f78691x7ae93edb, 0, false);
    }
}
