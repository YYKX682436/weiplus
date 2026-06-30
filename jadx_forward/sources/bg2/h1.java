package bg2;

/* loaded from: classes2.dex */
public final class h1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.j1 f101660d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(bg2.j1 j1Var) {
        super(0);
        this.f101660d = j1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context;
        zy2.ra Sj;
        bg2.j1 j1Var = this.f101660d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j1Var.f101721e, "[showLikeGuideBubble] show now");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_FEED_LIKE_BTN_GUIDE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        tc2.g gVar = j1Var.f498674d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = gVar.f498681h;
        if (abstractC14490x69736cb5 != null) {
            in5.s0 s0Var = gVar.f498682i;
            r45.qt2 V6 = (s0Var == null || (context = s0Var.f374654e) == null || (Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context)) == null) ? null : ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj).V6();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3 v3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3.f184154a;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("feedActionType", 87);
            jSONObject.put("feedActionSubType", 531);
            linkedList.add(jSONObject.toString());
            v3Var.b(V6, abstractC14490x69736cb5, linkedList);
            ml2.u1 u1Var = ml2.u1.f409584h3;
            jz5.l[] lVarArr = new jz5.l[1];
            r45.nw1 m59258xd0557130 = abstractC14490x69736cb5.getFeedObject().m59258xd0557130();
            lVarArr[0] = new jz5.l("liveid", pm0.v.u(m59258xd0557130 != null ? m59258xd0557130.m75942xfb822ef2(0) : 0L));
            v3Var.c(V6, u1Var, kz5.c1.i(lVarArr));
        }
        return jz5.f0.f384359a;
    }
}
