package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class vf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f186318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f186319f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf f186320g;

    public vf(in5.s0 s0Var, so2.h1 h1Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar) {
        this.f186317d = s0Var;
        this.f186318e = h1Var;
        this.f186319f = i17;
        this.f186320g = zfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.s0 s0Var = this.f186317d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15288x851f5d51 c15288x851f5d51 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15288x851f5d51) s0Var.p(com.p314xaae8f345.mm.R.id.efr);
        so2.h1 h1Var = this.f186318e;
        c15288x851f5d51.b(h1Var.getFeedObject().m59258xd0557130(), this.f186319f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15288x851f5d51 c15288x851f5d512 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15288x851f5d51) s0Var.p(com.p314xaae8f345.mm.R.id.efr);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar = this.f186320g;
        c15288x851f5d512.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.tf(zfVar, s0Var, h1Var));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15288x851f5d51) s0Var.p(com.p314xaae8f345.mm.R.id.efr)).setOnLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.uf(zfVar, s0Var));
    }
}
