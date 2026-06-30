package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class q7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p7 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f217201e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f217202f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f217203g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s7 f217204h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f217205i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, boolean z17, java.lang.ref.WeakReference weakReference, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s7 s7Var, in5.s0 s0Var) {
        super(abstractC14490x69736cb5);
        this.f217201e = abstractC14490x69736cb5;
        this.f217202f = z17;
        this.f217203g = weakReference;
        this.f217204h = s7Var;
        this.f217205i = s0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.jl2 jl2Var = (r45.jl2) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f217201e;
        boolean z17 = this.f217202f;
        if (z17) {
            in5.s0 s0Var = (in5.s0) this.f217203g.get();
            if (s0Var == null) {
                return;
            }
            so2.j5 j5Var = (so2.j5) s0Var.f374658i;
            if (j5Var != null && j5Var.mo2128x1ed62e84() != abstractC14490x69736cb5.mo2128x1ed62e84()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderControversialAlertUIC", "error feed: " + j5Var.mo2128x1ed62e84() + " != " + abstractC14490x69736cb5.mo2128x1ed62e84());
                return;
            }
        }
        this.f217204h.O6(this.f217205i, jl2Var, abstractC14490x69736cb5, z17);
    }
}
