package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class yb0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cm2.g0 f196714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dc0 f196715e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.mb0 f196716f;

    public yb0(cm2.g0 g0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dc0 dc0Var, bw5.mb0 mb0Var) {
        this.f196714d = g0Var;
        this.f196715e = dc0Var;
        this.f196716f = mb0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveTingBubble$refreshView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean m75933x41a8a7f2 = this.f196714d.f124879v.m75933x41a8a7f2(2);
        bf2.c cVar = bf2.c.f101131a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dc0 dc0Var = this.f196715e;
        gk2.e eVar = dc0Var.f193788e;
        int i17 = m75933x41a8a7f2 ? 4 : 3;
        bw5.mb0 mb0Var = this.f196716f;
        jz5.f0 f0Var = null;
        java.lang.String b17 = mb0Var != null ? mb0Var.b() : null;
        if (b17 == null) {
            b17 = "";
        }
        bf2.c.c(cVar, eVar, i17, 12, b17, 0, null, 0, 4, null, 0, nd1.y0.f72985x366c91de, null);
        java.lang.String b18 = mb0Var != null ? mb0Var.b() : null;
        if (b18 == null) {
            b18 = "";
        }
        java.lang.String str = dc0Var.f193791h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "click btn, categoryId = " + b18 + ", isLiked=" + m75933x41a8a7f2);
        android.content.Context context = dc0Var.f193787d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) context : null;
        if (abstractActivityC15087xee12defa != null) {
            bw5.g80 g80Var = new bw5.g80();
            bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
            g80Var.f109266q = 2201;
            boolean[] zArr = g80Var.f109273x;
            zArr[12] = true;
            g80Var.f109258f = m75933x41a8a7f2;
            zArr[3] = true;
            g80Var.f109257e = b18;
            zArr[4] = true;
            g80Var.f109260h = 0;
            zArr[6] = true;
            g80Var.f109265p = 6;
            zArr[11] = true;
            g80Var.f109259g = false;
            zArr[5] = true;
            ((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).Di(new qk.aa(abstractActivityC15087xee12defa, g80Var, false, null, null, 28, null), dc0Var.f193799s);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "click btn, not activity");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTingBubble$refreshView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
