package bg2;

/* loaded from: classes2.dex */
public final class b extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg2.c f19926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f19927b;

    public b(bg2.c cVar, kotlin.jvm.internal.g0 g0Var) {
        this.f19926a = cVar;
        this.f19927b = g0Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        bg2.c cVar = this.f19926a;
        uc2.g gVar = (uc2.g) cVar.O6(uc2.g.class);
        r45.qt2 c76 = gVar != null ? ((sb2.l) gVar).c7() : null;
        com.tencent.mm.plugin.finder.assist.v3 v3Var = com.tencent.mm.plugin.finder.assist.v3.f102621a;
        kotlin.jvm.internal.g0 g0Var = this.f19927b;
        if (z17) {
            g0Var.f310121d = c01.id.c();
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = cVar.f417141d.f417148h;
            if (baseFinderFeed != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("feedActionType", 87);
                jSONObject.put("feedActionSubType", 7);
                jSONObject.put("value", 1);
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                v3Var.a(c76, baseFinderFeed, jSONObject2);
                return;
            }
            return;
        }
        long c17 = c01.id.c() - g0Var.f310121d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = cVar.f417141d.f417148h;
        if (baseFinderFeed2 != null) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("feedActionType", 89);
            jSONObject3.put("feedActionSubType", 7);
            jSONObject3.put("value", c17);
            java.lang.String jSONObject4 = jSONObject3.toString();
            kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
            v3Var.a(c76, baseFinderFeed2, jSONObject4);
        }
    }
}
