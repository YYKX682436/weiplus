package kd2;

/* loaded from: classes2.dex */
public final class h1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 f388286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kd2.p1 f388287e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3, kd2.p1 p1Var) {
        super(0);
        this.f388286d = c5445x963cab3;
        this.f388287e = p1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = this.f388286d;
        c5445x963cab3.f135785g.getClass();
        am.ia iaVar = c5445x963cab3.f135785g;
        if (iaVar.f88452b == 19) {
            kd2.p1 p1Var = this.f388287e;
            kd2.q0 q0Var = p1Var.C;
            java.lang.Long valueOf = (q0Var == null || (c14989xf862ae88 = q0Var.f388339g) == null) ? null : java.lang.Long.valueOf(c14989xf862ae88.getLiveId());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoPassive", "feedChangeListener id:" + iaVar.f88451a + " liveId:" + valueOf + ", liveStatus:" + iaVar.f88458h);
            long j17 = iaVar.f88451a;
            if (j17 != 0 && valueOf != null && j17 == valueOf.longValue() && iaVar.f88458h == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.ui.C14446xd52a323f k07 = p1Var.k0();
                k07.setContentDescription(k07.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jp7));
                k07.isVideoEnd = true;
                k07.m58249xa2fbf520(false);
                kd2.q0 q0Var2 = p1Var.C;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae882 = q0Var2 != null ? q0Var2.f388339g : null;
                if (c14989xf862ae882 != null) {
                    c14989xf862ae882.m59167x50451200(2);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
