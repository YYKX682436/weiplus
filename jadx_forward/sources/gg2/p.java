package gg2;

/* loaded from: classes2.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg2.q f353239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.px3 f353240e;

    public p(gg2.q qVar, r45.px3 px3Var) {
        this.f353239d = qVar;
        this.f353240e = px3Var;
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
        yj0.a.b("com/tencent/mm/plugin/finder/live/exp/LiveExpTwelveItem$renderProducts$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_PARAMS_DO_ACTION", 17);
        gg2.q qVar = this.f353239d;
        tc2.g gVar = qVar.f353197a;
        in5.s0 s0Var = gVar.f498682i;
        if (s0Var == null || (view2 = s0Var.f3639x46306858) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/exp/LiveExpTwelveItem$renderProducts$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        uc2.i iVar = (uc2.i) gVar.b(uc2.i.class);
        if (iVar != null) {
            ((sb2.o) iVar).Y6(view2, intent);
        }
        qVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = qVar.f353197a.f498681h;
        if (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (m59258xd0557130 = feedObject.m59258xd0557130()) == null || (str = java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)).toString()) == null) {
            str = "";
        }
        hashMap.put("liveid", str);
        r45.px3 px3Var = this.f353240e;
        hashMap.put("guide_bar_type", java.lang.String.valueOf(px3Var.m75939xb282bd08(3)));
        java.lang.String m75945x2fec8307 = px3Var.m75945x2fec8307(1);
        hashMap.put("guide_bar_txt", m75945x2fec8307 != null ? m75945x2fec8307 : "");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.S2, hashMap, null, null, null, null, false, 124, null);
        qVar.k();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/exp/LiveExpTwelveItem$renderProducts$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
