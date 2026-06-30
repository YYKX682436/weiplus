package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class xm extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 f218008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f218009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f218010f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, long j17) {
        super(0);
        this.f218008d = c15415x74224fd8;
        this.f218009e = c1163xf1deaba4;
        this.f218010f = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f;
        in5.c cVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = this.f218009e.p0(this.f218008d.w());
        in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
        long mo2128x1ed62e84 = (s0Var == null || (cVar = (in5.c) s0Var.f374658i) == null) ? 0L : cVar.mo2128x1ed62e84();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHorizontalVideoNewFormUIC", "[checkSeek] video feedId=" + pm0.v.u(mo2128x1ed62e84) + " seekTime=" + this.f218010f);
        ((ey2.v2) pf5.u.f435469a.e(c61.l7.class).a(ey2.v2.class)).N6(mo2128x1ed62e84);
        java.lang.Object obj = s0Var != null ? (in5.c) s0Var.f374658i : null;
        so2.u1 u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
        if (u1Var != null) {
            u1Var.f492165f = true;
        }
        if (s0Var != null && (c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.p(com.p314xaae8f345.mm.R.id.e_k)) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f.Z(c15196x85976f5f, this.f218010f, 3, 0.0f, false, null, 28, null);
        }
        return jz5.f0.f384359a;
    }
}
