package bg2;

/* loaded from: classes2.dex */
public final class l5 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg2.o5 f20269a;

    public l5(bg2.o5 o5Var) {
        this.f20269a = o5Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            bg2.o5 o5Var = this.f20269a;
            r45.cg6 cg6Var = o5Var.f20367m;
            if (cg6Var != null && cg6Var.getBoolean(0)) {
                android.view.ViewGroup viewGroup = o5Var.f20363f;
                if ((viewGroup != null ? viewGroup.getChildCount() : 0) > 0) {
                    com.tencent.mars.xlog.Log.i("LiveConvertPoiController", "on poi exposed");
                    uc2.g gVar = (uc2.g) o5Var.O6(uc2.g.class);
                    r45.qt2 c76 = gVar != null ? ((sb2.l) gVar).c7() : null;
                    com.tencent.mm.plugin.finder.assist.v3 v3Var = com.tencent.mm.plugin.finder.assist.v3.f102621a;
                    ml2.u1 u1Var = ml2.u1.f328095w2;
                    jz5.l[] lVarArr = new jz5.l[1];
                    tc2.g gVar2 = o5Var.f417141d;
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = gVar2.f417148h;
                    if (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null || (str = java.lang.Long.valueOf(liveInfo.getLong(0)).toString()) == null) {
                        str = "";
                    }
                    lVarArr[0] = new jz5.l("liveid", str);
                    v3Var.c(c76, u1Var, kz5.c1.i(lVarArr));
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = gVar2.f417148h;
                    if (baseFinderFeed2 != null) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("feedActionType", 87);
                        jSONObject.put("feedActionSubType", com.tencent.mm.plugin.appbrand.jsapi.sensor.q.CTRL_INDEX);
                        java.lang.String jSONObject2 = jSONObject.toString();
                        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                        v3Var.a(c76, baseFinderFeed2, jSONObject2);
                    }
                }
            }
        }
    }
}
