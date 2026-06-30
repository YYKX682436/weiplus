package bg2;

/* loaded from: classes2.dex */
public final class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.j0 f101684d;

    public i0(bg2.j0 j0Var) {
        this.f101684d = j0Var;
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
        yj0.a.b("com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertCommentUIController$renderTips$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bg2.j0 j0Var = this.f101684d;
        bg2.j0.Y6(j0Var);
        uc2.g gVar = (uc2.g) j0Var.O6(uc2.g.class);
        r45.qt2 c76 = gVar != null ? ((sb2.l) gVar).c7() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3 v3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3.f184154a;
        ml2.t1 t1Var = ml2.t1.I2;
        jz5.l[] lVarArr = new jz5.l[2];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = j0Var.f498674d.f498681h;
        if (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (m59258xd0557130 = feedObject.m59258xd0557130()) == null || (str = java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)).toString()) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("liveid", str);
        lVarArr[1] = new jz5.l("comment_msg_cnt", java.lang.String.valueOf(j0Var.f101720o));
        v3Var.d(c76, t1Var, kz5.c1.i(lVarArr));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = j0Var.f498674d.f498681h;
        if (abstractC14490x69736cb52 != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("feedActionType", 88);
            jSONObject.put("feedActionSubType", 101);
            jSONObject.put("value", 1);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            v3Var.a(c76, abstractC14490x69736cb52, jSONObject2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertCommentUIController$renderTips$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
