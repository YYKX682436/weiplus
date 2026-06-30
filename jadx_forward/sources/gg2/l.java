package gg2;

/* loaded from: classes2.dex */
public final class l extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gg2.m f353226a;

    public l(gg2.m mVar) {
        this.f353226a = mVar;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        gg2.m mVar = this.f353226a;
        uc2.g gVar = (uc2.g) mVar.f353197a.b(uc2.g.class);
        r45.qt2 c76 = gVar != null ? ((sb2.l) gVar).c7() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3 v3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3.f184154a;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = mVar.f353197a.f498681h;
            if (abstractC14490x69736cb5 != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("feedActionType", 87);
                jSONObject.put("feedActionSubType", 5);
                jSONObject.put("value", 1);
                jSONObject.put("strValue", mVar.f353229d);
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                v3Var.a(c76, abstractC14490x69736cb5, jSONObject2);
                return;
            }
            return;
        }
        long c17 = c01.id.c() - mVar.f353228c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = mVar.f353197a.f498681h;
        if (abstractC14490x69736cb52 != null) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("feedActionType", 89);
            jSONObject3.put("feedActionSubType", 5);
            jSONObject3.put("value", c17);
            jSONObject3.put("strValue", mVar.f353229d);
            java.lang.String jSONObject4 = jSONObject3.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
            v3Var.a(c76, abstractC14490x69736cb52, jSONObject4);
        }
    }
}
