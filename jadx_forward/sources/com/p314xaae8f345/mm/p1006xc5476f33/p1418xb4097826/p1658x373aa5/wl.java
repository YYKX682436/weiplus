package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class wl implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15352x8ed10a39 f214832d;

    public wl(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15352x8ed10a39 c15352x8ed10a39) {
        this.f214832d = c15352x8ed10a39;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderTagView$genItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ql qlVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15352x8ed10a39.f213027w;
        java.lang.Object tag = view.getTag(-1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((java.lang.Boolean) tag).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        java.lang.Object tag2 = view.getTag(-2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag2, "null cannot be cast to non-null type kotlin.Int");
        f0Var.f391649d = ((java.lang.Integer) tag2).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15352x8ed10a39 c15352x8ed10a39 = this.f214832d;
        int size = c15352x8ed10a39.m62398x9a05e1d8().size();
        for (int i17 = 0; i17 < size; i17++) {
            if (i17 == f0Var.f391649d) {
                android.view.View view2 = c15352x8ed10a39.m62398x9a05e1d8().get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view2, "get(...)");
                c15352x8ed10a39.c(true, view2, -1);
            } else {
                android.view.View view3 = c15352x8ed10a39.m62398x9a05e1d8().get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view3, "get(...)");
                c15352x8ed10a39.c(false, view3, -1);
            }
        }
        if (!booleanValue) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo77785xc570fb34(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.vl(c15352x8ed10a39, f0Var));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderTagView$genItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
