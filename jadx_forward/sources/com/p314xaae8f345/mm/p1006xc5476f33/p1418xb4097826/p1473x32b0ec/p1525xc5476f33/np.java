package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class np extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq f195202d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq dqVar) {
        super(0);
        this.f195202d = dqVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hideGiftSendAgainLayout: curGiftId:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq dqVar = this.f195202d;
        sb6.append(dqVar.f193858r);
        sb6.append(", curComboId:");
        sb6.append(dqVar.f193863w);
        sb6.append(", curSongName: ");
        sb6.append(dqVar.f193859s);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftSendPlugin", sb6.toString());
        java.util.Map map = dqVar.K;
        java.lang.String str = dqVar.f193863w;
        if (str == null) {
            str = "";
        }
        ((java.util.HashMap) map).put(str, java.lang.Boolean.TRUE);
        java.lang.String str2 = dqVar.f193858r;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq.v1(dqVar, str2 == null ? "" : str2, dqVar.f193863w, dqVar.f193859s, dqVar.f193862v, 0);
        android.os.Bundle bundle = dqVar.f193856p1;
        if (bundle != null) {
            bundle.putInt("PARAM_FINDER_LIVE_GIFT_SEND_TOTAL_CNT", dqVar.f193855p0);
        }
        dqVar.f193863w = "";
        dqVar.f193866y = false;
        dqVar.f193855p0 = 0;
        dqVar.f446856d.animate().alpha(0.0f).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mp(dqVar)).start();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t tVar = dqVar.N;
        if (tVar != null) {
            tVar.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq.t1(dqVar));
        }
        ((je2.t) dqVar.P0(je2.t.class)).f380802o.mo7808x76db6cb1(new jz5.l(java.lang.Boolean.FALSE, dqVar.f193856p1));
        dqVar.f193856p1 = null;
        return jz5.f0.f384359a;
    }
}
