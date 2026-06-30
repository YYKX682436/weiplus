package gg2;

/* loaded from: classes2.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg2.m f353220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.y23 f353221e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f353222f;

    public j(gg2.m mVar, r45.y23 y23Var, int i17) {
        this.f353220d = mVar;
        this.f353221e = y23Var;
        this.f353222f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View view2;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.nw1 m59258xd0557130;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/exp/LiveExpOneItem$renderExp1Layout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        gg2.m mVar = this.f353220d;
        in5.s0 s0Var = mVar.f353197a.f498682i;
        if (s0Var == null || (view2 = s0Var.f3639x46306858) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/exp/LiveExpOneItem$renderExp1Layout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        intent.putExtra("KEY_PARAMS_DO_ACTION", 9);
        intent.putExtra("KEY_PARAMS_AUTO_OPEN_PRODUCT_INFO", this.f353221e.mo14344x5f01b1f6());
        uc2.i iVar = (uc2.i) mVar.f353197a.b(uc2.i.class);
        if (iVar != null) {
            ((sb2.o) iVar).Y6(view2, intent);
        }
        uc2.g gVar = (uc2.g) mVar.f353197a.b(uc2.g.class);
        r45.qt2 c76 = gVar != null ? ((sb2.l) gVar).c7() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3 v3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3.f184154a;
        ml2.t1 t1Var = ml2.t1.D2;
        jz5.l[] lVarArr = new jz5.l[3];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = mVar.f353197a.f498681h;
        if (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (m59258xd0557130 = feedObject.m59258xd0557130()) == null || (str = java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)).toString()) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("liveid", str);
        java.lang.String str2 = mVar.f353229d;
        lVarArr[1] = new jz5.l("productid", str2 != null ? str2 : "");
        lVarArr[2] = new jz5.l("com_label_type", java.lang.String.valueOf(this.f353222f));
        v3Var.d(c76, t1Var, kz5.c1.i(lVarArr));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = mVar.f353197a.f498681h;
        if (abstractC14490x69736cb52 != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("feedActionType", 88);
            jSONObject.put("feedActionSubType", 1);
            jSONObject.put("value", 1);
            jSONObject.put("strValue", mVar.f353229d);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            v3Var.a(c76, abstractC14490x69736cb52, jSONObject2);
        }
        mVar.k();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/exp/LiveExpOneItem$renderExp1Layout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
