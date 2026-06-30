package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class mq implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nq f200640d;

    public mq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nq nqVar) {
        this.f200640d = nqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLivePostGameChoosePanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cl0.g gVar = new cl0.g();
        gVar.o("type", 12);
        gVar.h("game_id", null);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f408858e;
        zy2.zb.j5(zbVar, 47L, gVar.toString(), null, 4, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nq nqVar = this.f200640d;
        java.lang.String str = nqVar.M;
        nqVar.getClass();
        i95.m c18 = i95.n0.c(zg0.u2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1) zg0.u2.K2((zg0.u2) c18, nqVar.f199716e, str, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n1(0.0f, 0.0f, null, false, false, 1, false, false, 1, false, false, 0, false, false, false, "#FFFFFF", false, 0, false, 2, false, false, false, 7831247, null), 4, null)).show();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLivePostGameChoosePanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
