package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class ti extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 f211416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f211417e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 f211418f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f211419g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f211420h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f211421i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 activityC15076x7a6c76b6, long j17, float f17, boolean z17) {
        super(0);
        this.f211416d = c15415x74224fd8;
        this.f211417e = c1163xf1deaba4;
        this.f211418f = activityC15076x7a6c76b6;
        this.f211419g = j17;
        this.f211420h = f17;
        this.f211421i = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        vo2.d player;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd;
        in5.c cVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = this.f211417e.p0(this.f211416d.w());
        in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
        long mo2128x1ed62e84 = (s0Var == null || (cVar = (in5.c) s0Var.f374658i) == null) ? 0L : cVar.mo2128x1ed62e84();
        boolean z17 = false;
        boolean z18 = s0Var != null && s0Var.m8185xcdaf1228() == 4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 activityC15076x7a6c76b6 = this.f211418f;
        long j17 = this.f211419g;
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC15076x7a6c76b6.C, "checkSeek: video feedId=" + pm0.v.u(mo2128x1ed62e84) + " seekTime=" + j17 + " playSpeedRatio:" + this.f211420h + " afterSeekPlay:" + this.f211421i);
            ((ey2.v2) pf5.u.f435469a.e(c61.l7.class).a(ey2.v2.class)).N6(mo2128x1ed62e84);
            java.lang.Object obj = s0Var.f374658i;
            so2.u1 u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
            if (u1Var != null) {
                u1Var.f492165f = true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.p(com.p314xaae8f345.mm.R.id.e_k);
            zy2.g5 videoView = c15196x85976f5f != null ? c15196x85976f5f.getVideoView() : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd2 = videoView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView : null;
            if (c15188xd8bd4bd2 != null) {
                c15188xd8bd4bd2.mo56709x764d819b(true);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.p(com.p314xaae8f345.mm.R.id.e_k);
            if (c15196x85976f5f2 != null) {
                long j18 = this.f211419g;
                float f17 = this.f211420h;
                boolean z19 = this.f211421i;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.si siVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.si(this.f211418f, mo2128x1ed62e84, z19, s0Var);
                cw2.b0 b0Var = c15196x85976f5f2.E;
                b0Var.getClass();
                pm0.v.X(new cw2.a0(b0Var, j18, 3, f17, z19, siVar));
            }
        } else {
            if (s0Var != null && s0Var.m8185xcdaf1228() == 2) {
                z17 = true;
            }
            if (z17 && j17 > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC15076x7a6c76b6.C, "[checkSeek] photo feedId=" + pm0.v.u(mo2128x1ed62e84) + " seekTime=" + j17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530 c14493xfdc11530 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530) s0Var.p(com.p314xaae8f345.mm.R.id.agy);
                if (c14493xfdc11530 != null && (player = c14493xfdc11530.getPlayer()) != null && (c15188xd8bd4bd = ((vo2.c) player).f520092b) != null) {
                    c15188xd8bd4bd.f0(j17, true, 3);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
