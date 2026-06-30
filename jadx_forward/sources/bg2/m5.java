package bg2;

/* loaded from: classes2.dex */
public final class m5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.o5 f101840d;

    public m5(bg2.o5 o5Var) {
        this.f101840d = o5Var;
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
        yj0.a.b("com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveIndependentExpController$onBind$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveConvertPoiController", "poi clicked");
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup != null) {
            bg2.o5 o5Var = this.f101840d;
            uc2.g gVar = (uc2.g) o5Var.O6(uc2.g.class);
            r45.qt2 c76 = gVar != null ? ((sb2.l) gVar).c7() : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3 v3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3.f184154a;
            ml2.t1 t1Var = ml2.t1.E2;
            jz5.l[] lVarArr = new jz5.l[1];
            tc2.g gVar2 = o5Var.f498674d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = gVar2.f498681h;
            if (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (m59258xd0557130 = feedObject.m59258xd0557130()) == null || (str = java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)).toString()) == null) {
                str = "";
            }
            lVarArr[0] = new jz5.l("liveid", str);
            v3Var.d(c76, t1Var, kz5.c1.i(lVarArr));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = gVar2.f498681h;
            if (abstractC14490x69736cb52 != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("feedActionType", 88);
                jSONObject.put("feedActionSubType", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.q.f34769x366c91de);
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                v3Var.a(c76, abstractC14490x69736cb52, jSONObject2);
            }
            android.view.View childAt = viewGroup.getChildAt(0);
            if (childAt != null) {
                childAt.performClick();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveIndependentExpController$onBind$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
