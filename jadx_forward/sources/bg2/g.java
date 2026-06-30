package bg2;

/* loaded from: classes2.dex */
public final class g extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg2.k f101629a;

    public g(bg2.k kVar) {
        this.f101629a = kVar;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.nw1 m59258xd0557130;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        bg2.k kVar = this.f101629a;
        uc2.g gVar = (uc2.g) kVar.O6(uc2.g.class);
        r45.qt2 c76 = gVar != null ? ((sb2.l) gVar).c7() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3 v3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3.f184154a;
        if (z17) {
            kVar.f101756g = c01.id.c();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = kVar.f498674d.f498681h;
            if (abstractC14490x69736cb5 != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("feedActionType", 87);
                jSONObject.put("feedActionSubType", 201);
                jSONObject.put("value", 1);
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                v3Var.a(c76, abstractC14490x69736cb5, jSONObject2);
            }
            if (kVar.f101763q) {
                kVar.f101763q = false;
                bg2.y0 y0Var = (bg2.y0) kVar.N6(bg2.y0.class);
                if (y0Var != null) {
                    y0Var.Y6(5L, 0L, "");
                    return;
                }
                return;
            }
            return;
        }
        long c17 = c01.id.c() - kVar.f101756g;
        ml2.u1 u1Var = ml2.u1.B2;
        jz5.l[] lVarArr = new jz5.l[2];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = kVar.f498674d.f498681h;
        if (abstractC14490x69736cb52 == null || (feedObject = abstractC14490x69736cb52.getFeedObject()) == null || (m59258xd0557130 = feedObject.m59258xd0557130()) == null || (str = java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)).toString()) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("liveid", str);
        lVarArr[1] = new jz5.l("exp_time", java.lang.String.valueOf(c17));
        v3Var.c(c76, u1Var, kz5.c1.i(lVarArr));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb53 = kVar.f498674d.f498681h;
        if (abstractC14490x69736cb53 != null) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("feedActionType", 89);
            jSONObject3.put("feedActionSubType", 201);
            jSONObject3.put("value", c17);
            java.lang.String jSONObject4 = jSONObject3.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
            v3Var.a(c76, abstractC14490x69736cb53, jSONObject4);
        }
    }
}
