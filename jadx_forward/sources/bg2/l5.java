package bg2;

/* loaded from: classes2.dex */
public final class l5 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg2.o5 f101802a;

    public l5(bg2.o5 o5Var) {
        this.f101802a = o5Var;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.nw1 m59258xd0557130;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            bg2.o5 o5Var = this.f101802a;
            r45.cg6 cg6Var = o5Var.f101900m;
            if (cg6Var != null && cg6Var.m75933x41a8a7f2(0)) {
                android.view.ViewGroup viewGroup = o5Var.f101896f;
                if ((viewGroup != null ? viewGroup.getChildCount() : 0) > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveConvertPoiController", "on poi exposed");
                    uc2.g gVar = (uc2.g) o5Var.O6(uc2.g.class);
                    r45.qt2 c76 = gVar != null ? ((sb2.l) gVar).c7() : null;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3 v3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3.f184154a;
                    ml2.u1 u1Var = ml2.u1.f409628w2;
                    jz5.l[] lVarArr = new jz5.l[1];
                    tc2.g gVar2 = o5Var.f498674d;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = gVar2.f498681h;
                    if (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (m59258xd0557130 = feedObject.m59258xd0557130()) == null || (str = java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)).toString()) == null) {
                        str = "";
                    }
                    lVarArr[0] = new jz5.l("liveid", str);
                    v3Var.c(c76, u1Var, kz5.c1.i(lVarArr));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = gVar2.f498681h;
                    if (abstractC14490x69736cb52 != null) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("feedActionType", 87);
                        jSONObject.put("feedActionSubType", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.q.f34769x366c91de);
                        java.lang.String jSONObject2 = jSONObject.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                        v3Var.a(c76, abstractC14490x69736cb52, jSONObject2);
                    }
                }
            }
        }
    }
}
