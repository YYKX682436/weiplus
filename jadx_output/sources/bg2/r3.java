package bg2;

/* loaded from: classes2.dex */
public final class r3 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg2.z3 f20455a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.kr0 f20456b;

    public r3(bg2.z3 z3Var, r45.kr0 kr0Var) {
        this.f20455a = z3Var;
        this.f20456b = kr0Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        r45.bg6 bg6Var;
        kotlin.jvm.internal.o.g(view, "view");
        bg2.z3 z3Var = this.f20455a;
        uc2.g gVar = (uc2.g) z3Var.O6(uc2.g.class);
        r45.qt2 c76 = gVar != null ? ((sb2.l) gVar).c7() : null;
        com.tencent.mm.plugin.finder.assist.v3 v3Var = com.tencent.mm.plugin.finder.assist.v3.f102621a;
        int i17 = 0;
        if (z17) {
            z3Var.f20696q = c01.id.c();
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = z3Var.f417141d.f417148h;
            if (baseFinderFeed != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("feedActionType", 87);
                jSONObject.put("feedActionSubType", 6);
                jSONObject.put("value", 1);
                jSONObject.put("strValue", z3Var.f20698s);
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                v3Var.a(c76, baseFinderFeed, jSONObject2);
            }
            if (z3Var.A) {
                z3Var.A = false;
                bg2.y0 y0Var = (bg2.y0) z3Var.N6(bg2.y0.class);
                if (y0Var != null) {
                    r45.kr0 kr0Var = this.f20456b;
                    if (kr0Var != null && (bg6Var = (r45.bg6) kr0Var.getCustom(5)) != null) {
                        i17 = bg6Var.getInteger(0);
                    }
                    y0Var.Y6(4L, i17 * 1000, "{productid:" + z3Var.f20698s + '}');
                    return;
                }
                return;
            }
            return;
        }
        long c17 = c01.id.c() - z3Var.f20696q;
        ml2.u1 u1Var = ml2.u1.f328107z2;
        jz5.l[] lVarArr = new jz5.l[3];
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = z3Var.f417141d.f417148h;
        if (baseFinderFeed2 == null || (feedObject = baseFinderFeed2.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null || (str = java.lang.Long.valueOf(liveInfo.getLong(0)).toString()) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("liveid", str);
        lVarArr[1] = new jz5.l("exp_time", java.lang.String.valueOf(c17));
        java.lang.String str2 = z3Var.f20698s;
        if (str2 == null) {
            str2 = "";
        }
        lVarArr[2] = new jz5.l("productid", str2);
        v3Var.c(c76, u1Var, kz5.c1.i(lVarArr));
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = z3Var.f417141d.f417148h;
        if (baseFinderFeed3 != null) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("feedActionType", 89);
            jSONObject3.put("feedActionSubType", 6);
            jSONObject3.put("value", c17);
            jSONObject3.put("strValue", z3Var.f20698s);
            java.lang.String jSONObject4 = jSONObject3.toString();
            kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
            v3Var.a(c76, baseFinderFeed3, jSONObject4);
        }
    }
}
