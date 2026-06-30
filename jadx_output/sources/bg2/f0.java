package bg2;

/* loaded from: classes2.dex */
public final class f0 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg2.j0 f20074a;

    public f0(bg2.j0 j0Var) {
        this.f20074a = j0Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        kotlin.jvm.internal.o.g(view, "view");
        bg2.j0 j0Var = this.f20074a;
        uc2.g gVar = (uc2.g) j0Var.O6(uc2.g.class);
        r45.qt2 c76 = gVar != null ? ((sb2.l) gVar).c7() : null;
        com.tencent.mm.plugin.finder.assist.v3 v3Var = com.tencent.mm.plugin.finder.assist.v3.f102621a;
        if (z17) {
            j0Var.f20184i = c01.id.c();
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j0Var.f417141d.f417148h;
            if (baseFinderFeed != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("feedActionType", 87);
                jSONObject.put("feedActionSubType", 101);
                jSONObject.put("value", 1);
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                v3Var.a(c76, baseFinderFeed, jSONObject2);
                return;
            }
            return;
        }
        long c17 = c01.id.c() - j0Var.f20184i;
        ml2.u1 u1Var = ml2.u1.A2;
        jz5.l[] lVarArr = new jz5.l[3];
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = j0Var.f417141d.f417148h;
        if (baseFinderFeed2 == null || (feedObject = baseFinderFeed2.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null || (str = java.lang.Long.valueOf(liveInfo.getLong(0)).toString()) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("liveid", str);
        lVarArr[1] = new jz5.l("comment_msg_cnt", java.lang.String.valueOf(j0Var.f20187o));
        lVarArr[2] = new jz5.l("exp_time", java.lang.String.valueOf(c17));
        v3Var.c(c76, u1Var, kz5.c1.i(lVarArr));
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = j0Var.f417141d.f417148h;
        if (baseFinderFeed3 != null) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("feedActionType", 89);
            jSONObject3.put("feedActionSubType", 101);
            jSONObject3.put("value", c17);
            java.lang.String jSONObject4 = jSONObject3.toString();
            kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
            v3Var.a(c76, baseFinderFeed3, jSONObject4);
        }
    }
}
