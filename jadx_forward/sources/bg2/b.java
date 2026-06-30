package bg2;

/* loaded from: classes2.dex */
public final class b extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg2.c f101459a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f101460b;

    public b(bg2.c cVar, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var) {
        this.f101459a = cVar;
        this.f101460b = g0Var;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        bg2.c cVar = this.f101459a;
        uc2.g gVar = (uc2.g) cVar.O6(uc2.g.class);
        r45.qt2 c76 = gVar != null ? ((sb2.l) gVar).c7() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3 v3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3.f184154a;
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = this.f101460b;
        if (z17) {
            g0Var.f391654d = c01.id.c();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = cVar.f498674d.f498681h;
            if (abstractC14490x69736cb5 != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("feedActionType", 87);
                jSONObject.put("feedActionSubType", 7);
                jSONObject.put("value", 1);
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                v3Var.a(c76, abstractC14490x69736cb5, jSONObject2);
                return;
            }
            return;
        }
        long c17 = c01.id.c() - g0Var.f391654d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = cVar.f498674d.f498681h;
        if (abstractC14490x69736cb52 != null) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("feedActionType", 89);
            jSONObject3.put("feedActionSubType", 7);
            jSONObject3.put("value", c17);
            java.lang.String jSONObject4 = jSONObject3.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
            v3Var.a(c76, abstractC14490x69736cb52, jSONObject4);
        }
    }
}
