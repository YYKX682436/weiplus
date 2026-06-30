package bg2;

/* loaded from: classes2.dex */
public final class s3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.y23 f102028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.z3 f102029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f102030f;

    public s3(r45.y23 y23Var, bg2.z3 z3Var, android.view.View view) {
        this.f102028d = y23Var;
        this.f102029e = z3Var;
        this.f102030f = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.nw1 m59258xd0557130;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertShoppingPromoteController$renderExp5Layout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_PARAMS_DO_ACTION", 9);
        intent.putExtra("KEY_PARAMS_AUTO_OPEN_PRODUCT_INFO", this.f102028d.mo14344x5f01b1f6());
        bg2.z3 z3Var = this.f102029e;
        uc2.i iVar = (uc2.i) z3Var.O6(uc2.i.class);
        if (iVar != null) {
            ((sb2.o) iVar).Y6(this.f102030f, intent);
        }
        uc2.g gVar = (uc2.g) z3Var.O6(uc2.g.class);
        r45.qt2 c76 = gVar != null ? ((sb2.l) gVar).c7() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3 v3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3.f184154a;
        ml2.t1 t1Var = ml2.t1.H2;
        jz5.l[] lVarArr = new jz5.l[3];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = z3Var.f498674d.f498681h;
        if (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (m59258xd0557130 = feedObject.m59258xd0557130()) == null || (str = java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)).toString()) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("liveid", str);
        java.lang.String str2 = z3Var.f102231s;
        lVarArr[1] = new jz5.l("productid", str2 != null ? str2 : "");
        lVarArr[2] = new jz5.l("click_type", "0");
        v3Var.d(c76, t1Var, kz5.c1.i(lVarArr));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = z3Var.f498674d.f498681h;
        if (abstractC14490x69736cb52 != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("feedActionType", 88);
            jSONObject.put("feedActionSubType", 3);
            jSONObject.put("value", 1);
            jSONObject.put("strValue", z3Var.f102231s);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            v3Var.a(c76, abstractC14490x69736cb52, jSONObject2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertShoppingPromoteController$renderExp5Layout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
