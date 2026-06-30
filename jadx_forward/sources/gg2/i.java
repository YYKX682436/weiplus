package gg2;

/* loaded from: classes2.dex */
public final class i extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gg2.m f353218a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f353219b;

    public i(gg2.m mVar, int i17) {
        this.f353218a = mVar;
        this.f353219b = i17;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.nw1 m59258xd0557130;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        gg2.m mVar = this.f353218a;
        uc2.g gVar = (uc2.g) mVar.f353197a.b(uc2.g.class);
        r45.qt2 c76 = gVar != null ? ((sb2.l) gVar).c7() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3 v3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3.f184154a;
        if (z17) {
            mVar.f353228c = c01.id.c();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = mVar.f353197a.f498681h;
            if (abstractC14490x69736cb5 != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("feedActionType", 87);
                jSONObject.put("feedActionSubType", 1);
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
        ml2.u1 u1Var = ml2.u1.f409625v2;
        jz5.l[] lVarArr = new jz5.l[4];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = mVar.f353197a.f498681h;
        if (abstractC14490x69736cb52 == null || (feedObject = abstractC14490x69736cb52.getFeedObject()) == null || (m59258xd0557130 = feedObject.m59258xd0557130()) == null || (str2 = java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)).toString()) == null) {
            str = "toString(...)";
            str2 = "";
        } else {
            str = "toString(...)";
        }
        lVarArr[0] = new jz5.l("liveid", str2);
        lVarArr[1] = new jz5.l("exp_time", java.lang.String.valueOf(c17));
        java.lang.String str3 = mVar.f353229d;
        if (str3 == null) {
            str3 = "";
        }
        lVarArr[2] = new jz5.l("productid", str3);
        lVarArr[3] = new jz5.l("com_label_type", java.lang.String.valueOf(this.f353219b));
        v3Var.c(c76, u1Var, kz5.c1.i(lVarArr));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb53 = mVar.f353197a.f498681h;
        if (abstractC14490x69736cb53 != null) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("feedActionType", 89);
            jSONObject3.put("feedActionSubType", 1);
            jSONObject3.put("value", c17);
            jSONObject3.put("strValue", mVar.f353229d);
            java.lang.String jSONObject4 = jSONObject3.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, str);
            v3Var.a(c76, abstractC14490x69736cb53, jSONObject4);
        }
    }
}
