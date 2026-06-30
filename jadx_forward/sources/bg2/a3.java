package bg2;

/* loaded from: classes2.dex */
public final class a3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.b3 f101448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f101449e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(bg2.b3 b3Var, int i17) {
        super(0);
        this.f101448d = b3Var;
        this.f101449e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context;
        zy2.ra Sj;
        bg2.b3 b3Var = this.f101448d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b3Var.f101470e, "[showShareGuideBubble] show now");
        int i17 = this.f101449e;
        if (i17 == 2) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_FEED_SHARE_BTN_GUIDE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        }
        if (i17 == 1) {
            gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_FEED_LONG_PRESS_SHARE_LAST_GUIDE_INT_SYNC, c01.id.e());
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_FEED_LONG_PRESS_SHARE_TIMES_TOTAL_INT_SYNC;
            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(c17.r(u3Var, 0) + 1));
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_FEED_LONG_PRESS_SHARE_TIMES_IN_ONE_DAY_INT_SYNC;
            gm0.j1.u().c().x(u3Var2, java.lang.Integer.valueOf(c18.r(u3Var2, 0) + 1));
        }
        tc2.g gVar = b3Var.f498674d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = gVar.f498681h;
        if (abstractC14490x69736cb5 != null) {
            in5.s0 s0Var = gVar.f498682i;
            r45.qt2 V6 = (s0Var == null || (context = s0Var.f374654e) == null || (Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context)) == null) ? null : ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj).V6();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3 v3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3.f184154a;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("feedActionType", 87);
            jSONObject.put("feedActionSubType", 521);
            linkedList.add(jSONObject.toString());
            v3Var.b(V6, abstractC14490x69736cb5, linkedList);
            ml2.u1 u1Var = ml2.u1.f409589j3;
            jz5.l[] lVarArr = new jz5.l[2];
            r45.nw1 m59258xd0557130 = abstractC14490x69736cb5.getFeedObject().m59258xd0557130();
            lVarArr[0] = new jz5.l("liveid", pm0.v.u(m59258xd0557130 != null ? m59258xd0557130.m75942xfb822ef2(0) : 0L));
            lVarArr[1] = new jz5.l("feedid", pm0.v.u(abstractC14490x69736cb5.getFeedObject().getFeedObject().m76784x5db1b11()));
            v3Var.c(V6, u1Var, kz5.c1.i(lVarArr));
        }
        return jz5.f0.f384359a;
    }
}
