package bg2;

/* loaded from: classes2.dex */
public final class c4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.h4 f101511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.wk5 f101512e;

    public c4(bg2.h4 h4Var, r45.wk5 wk5Var) {
        this.f101511d = h4Var;
        this.f101512e = wk5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View view2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.nw1 m59258xd0557130;
        java.lang.String l17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertShoppingRecommendController$renderCoupon$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_PARAMS_DO_ACTION", 18);
        bg2.h4 h4Var = this.f101511d;
        in5.s0 s0Var = h4Var.f498674d.f498682i;
        if (s0Var == null || (view2 = s0Var.f3639x46306858) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertShoppingRecommendController$renderCoupon$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        uc2.i iVar = (uc2.i) h4Var.O6(uc2.i.class);
        if (iVar != null) {
            ((sb2.o) iVar).Y6(view2, intent);
        }
        java.lang.String m75945x2fec8307 = this.f101512e.m75945x2fec8307(0);
        java.lang.String str = "";
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        h4Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = h4Var.f498674d.f498681h;
        if (abstractC14490x69736cb5 != null && (feedObject = abstractC14490x69736cb5.getFeedObject()) != null && (m59258xd0557130 = feedObject.m59258xd0557130()) != null && (l17 = java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)).toString()) != null) {
            str = l17;
        }
        hashMap.put("liveid", str);
        hashMap.put("guide_bar_txt", m75945x2fec8307);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.T2, hashMap, null, null, null, null, false, 124, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertShoppingRecommendController$renderCoupon$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
