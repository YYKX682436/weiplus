package se2;

/* loaded from: classes3.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ se2.e0 f488371d;

    public b0(se2.e0 e0Var) {
        this.f488371d = e0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.List arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(view);
        java.lang.Object[] array = arrayList2.toArray();
        arrayList2.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/comment/BoxCommentViewCallback$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        se2.e0 e0Var = this.f488371d;
        java.lang.Object mo141623x754a37bb = ((jz5.n) e0Var.f488386c).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((android.view.ViewGroup) mo141623x754a37bb).setVisibility(8);
        try {
            int i17 = ((mm2.e0) e0Var.a(mm2.e0.class)).f410508r;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb tbVar = e0Var.f488384a;
            if (i17 > 0) {
                int i18 = ((mm2.e0) e0Var.a(mm2.e0.class)).f410505o;
                int u17 = tbVar.u1() - 1;
                int i19 = i18 + 1;
                int i27 = ((mm2.e0) e0Var.a(mm2.e0.class)).f410508r;
                if (i19 <= i27 && i27 <= u17) {
                    tbVar.v1().d(((mm2.e0) e0Var.a(mm2.e0.class)).f410508r, java.lang.Boolean.TRUE);
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = tbVar.f195908w;
                    if (c22848x6ddd90cf == null || (arrayList = c22848x6ddd90cf.m82898xfb7e5820()) == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    lm2.c cVar = (lm2.c) arrayList.get(((mm2.e0) e0Var.a(mm2.e0.class)).f410508r);
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).Gk(cVar.c(), 1, cVar.a());
                } else {
                    tbVar.v1().c(java.lang.Boolean.FALSE);
                }
                ((mm2.e0) e0Var.a(mm2.e0.class)).V6(0);
            } else {
                tbVar.v1().c(java.lang.Boolean.FALSE);
            }
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, e0Var.f488385b + "-newTipGroupClick");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/comment/BoxCommentViewCallback$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
