package bg2;

/* loaded from: classes2.dex */
public final class a3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.b3 f19915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19916e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(bg2.b3 b3Var, int i17) {
        super(0);
        this.f19915d = b3Var;
        this.f19916e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context;
        zy2.ra Sj;
        bg2.b3 b3Var = this.f19915d;
        com.tencent.mars.xlog.Log.i(b3Var.f19937e, "[showShareGuideBubble] show now");
        int i17 = this.f19916e;
        if (i17 == 2) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_FEED_SHARE_BTN_GUIDE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        }
        if (i17 == 1) {
            gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_FEED_LONG_PRESS_SHARE_LAST_GUIDE_INT_SYNC, c01.id.e());
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_FEED_LONG_PRESS_SHARE_TIMES_TOTAL_INT_SYNC;
            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(c17.r(u3Var, 0) + 1));
            com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_FEED_LONG_PRESS_SHARE_TIMES_IN_ONE_DAY_INT_SYNC;
            gm0.j1.u().c().x(u3Var2, java.lang.Integer.valueOf(c18.r(u3Var2, 0) + 1));
        }
        tc2.g gVar = b3Var.f417141d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = gVar.f417148h;
        if (baseFinderFeed != null) {
            in5.s0 s0Var = gVar.f417149i;
            r45.qt2 V6 = (s0Var == null || (context = s0Var.f293121e) == null || (Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context)) == null) ? null : ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).V6();
            com.tencent.mm.plugin.finder.assist.v3 v3Var = com.tencent.mm.plugin.finder.assist.v3.f102621a;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("feedActionType", 87);
            jSONObject.put("feedActionSubType", 521);
            linkedList.add(jSONObject.toString());
            v3Var.b(V6, baseFinderFeed, linkedList);
            ml2.u1 u1Var = ml2.u1.f328056j3;
            jz5.l[] lVarArr = new jz5.l[2];
            r45.nw1 liveInfo = baseFinderFeed.getFeedObject().getLiveInfo();
            lVarArr[0] = new jz5.l("liveid", pm0.v.u(liveInfo != null ? liveInfo.getLong(0) : 0L));
            lVarArr[1] = new jz5.l("feedid", pm0.v.u(baseFinderFeed.getFeedObject().getFeedObject().getId()));
            v3Var.c(V6, u1Var, kz5.c1.i(lVarArr));
        }
        return jz5.f0.f302826a;
    }
}
