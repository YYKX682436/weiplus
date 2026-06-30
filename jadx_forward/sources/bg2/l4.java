package bg2;

/* loaded from: classes2.dex */
public final class l4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.o4 f101801d;

    public l4(bg2.o4 o4Var) {
        this.f101801d = o4Var;
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
        yj0.a.b("com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertTemplateInfoController$onBind$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_PARAMS_DO_ACTION", 12);
        bg2.o4 o4Var = this.f101801d;
        uc2.i iVar = (uc2.i) o4Var.O6(uc2.i.class);
        if (iVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            ((sb2.o) iVar).Y6(view, intent);
        }
        uc2.g gVar = (uc2.g) o4Var.O6(uc2.g.class);
        r45.qt2 c76 = gVar != null ? ((sb2.l) gVar).c7() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3 v3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3.f184154a;
        ml2.t1 t1Var = ml2.t1.J2;
        jz5.l[] lVarArr = new jz5.l[2];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = o4Var.f498674d.f498681h;
        if (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (m59258xd0557130 = feedObject.m59258xd0557130()) == null || (str = java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)).toString()) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("liveid", str);
        lVarArr[1] = new jz5.l("lottery_id", java.lang.String.valueOf(o4Var.f101890n));
        v3Var.d(c76, t1Var, kz5.c1.i(lVarArr));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertTemplateInfoController$onBind$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
