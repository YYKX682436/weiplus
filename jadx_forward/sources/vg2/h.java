package vg2;

/* loaded from: classes3.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.m f518047d;

    public h(vg2.m mVar) {
        this.f518047d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/gift/widget/FinderLiveAiGeneratedGiftPanel$initContentView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vg2.m mVar = this.f518047d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nl nlVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nl) mVar.H;
        nlVar.getClass();
        r45.gb2 gb2Var = new r45.gb2();
        gb2Var.set(1, db2.t4.f309704a.a(8655));
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            mm2.e1 e1Var = (mm2.e1) eVar.a(mm2.e1.class);
            byte[] bArr = e1Var.f410518o;
            gb2Var.set(2, bArr != null ? new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr, 0, bArr.length) : null);
            gb2Var.set(3, java.lang.Long.valueOf(e1Var.f410521r.m75942xfb822ef2(0)));
            gb2Var.set(4, java.lang.Long.valueOf(e1Var.f410516m));
            if (zl2.r4.f555483a.g0() == 3) {
                android.content.Context context = nlVar.f195179a.f446856d.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                str = xy2.c.e(context);
            } else {
                str = "";
            }
            gb2Var.set(5, str);
        }
        gb2Var.set(6, mVar.I.f67814x2c488eb6);
        gb2Var.set(11, 2);
        gb2Var.set(9, 2);
        az2.j jVar = (az2.j) gb2Var.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar = nlVar.f195179a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(hmVar, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kl(jVar, hmVar, mVar, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/gift/widget/FinderLiveAiGeneratedGiftPanel$initContentView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
