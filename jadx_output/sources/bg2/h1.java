package bg2;

/* loaded from: classes2.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.j1 f20127d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(bg2.j1 j1Var) {
        super(0);
        this.f20127d = j1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context;
        zy2.ra Sj;
        bg2.j1 j1Var = this.f20127d;
        com.tencent.mars.xlog.Log.i(j1Var.f20188e, "[showLikeGuideBubble] show now");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_FEED_LIKE_BTN_GUIDE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        tc2.g gVar = j1Var.f417141d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = gVar.f417148h;
        if (baseFinderFeed != null) {
            in5.s0 s0Var = gVar.f417149i;
            r45.qt2 V6 = (s0Var == null || (context = s0Var.f293121e) == null || (Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context)) == null) ? null : ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).V6();
            com.tencent.mm.plugin.finder.assist.v3 v3Var = com.tencent.mm.plugin.finder.assist.v3.f102621a;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("feedActionType", 87);
            jSONObject.put("feedActionSubType", 531);
            linkedList.add(jSONObject.toString());
            v3Var.b(V6, baseFinderFeed, linkedList);
            ml2.u1 u1Var = ml2.u1.f328051h3;
            jz5.l[] lVarArr = new jz5.l[1];
            r45.nw1 liveInfo = baseFinderFeed.getFeedObject().getLiveInfo();
            lVarArr[0] = new jz5.l("liveid", pm0.v.u(liveInfo != null ? liveInfo.getLong(0) : 0L));
            v3Var.c(V6, u1Var, kz5.c1.i(lVarArr));
        }
        return jz5.f0.f302826a;
    }
}
