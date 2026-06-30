package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class ag extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 f215306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f215307e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f215308f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, long j17) {
        super(0);
        this.f215306d = c15415x74224fd8;
        this.f215307e = c1163xf1deaba4;
        this.f215308f = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        vo2.d player;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd;
        in5.c cVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = this.f215307e.p0(this.f215306d.w());
        in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
        long mo2128x1ed62e84 = (s0Var == null || (cVar = (in5.c) s0Var.f374658i) == null) ? 0L : cVar.mo2128x1ed62e84();
        boolean z17 = false;
        boolean z18 = s0Var != null && s0Var.m8185xcdaf1228() == 4;
        long j17 = this.f215308f;
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "[checkSeek] video feedId=" + pm0.v.u(mo2128x1ed62e84) + " seekTime=" + j17);
            ((ey2.v2) pf5.u.f435469a.e(c61.l7.class).a(ey2.v2.class)).N6(mo2128x1ed62e84);
            java.lang.Object obj = s0Var.f374658i;
            so2.u1 u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
            if (u1Var != null) {
                u1Var.f492165f = true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.p(com.p314xaae8f345.mm.R.id.e_k);
            if (c15196x85976f5f != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f.Z(c15196x85976f5f, this.f215308f, 3, 0.0f, false, null, 28, null);
            }
        } else {
            if (s0Var != null && s0Var.m8185xcdaf1228() == 2) {
                z17 = true;
            }
            if (z17 && j17 > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "[checkSeek] photo feedId=" + pm0.v.u(mo2128x1ed62e84) + " seekTime=" + j17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530 c14493xfdc11530 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530) s0Var.p(com.p314xaae8f345.mm.R.id.agy);
                if (c14493xfdc11530 != null && (player = c14493xfdc11530.getPlayer()) != null && (c15188xd8bd4bd = ((vo2.c) player).f520092b) != null) {
                    c15188xd8bd4bd.f0(j17, true, 3);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
