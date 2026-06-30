package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class b40 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c40 f193506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.b0 f193507e;

    public b40(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c40 c40Var, cm2.b0 b0Var) {
        this.f193506d = c40Var;
        this.f193507e = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveOtherBubble$refreshView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zl2.r4 r4Var = zl2.r4.f555483a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c40 c40Var = this.f193506d;
        boolean z17 = r4Var.Y1(c40Var.f193641d) && !r4Var.w1();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c40Var.f193645h, "jump isAnchorLandscape:" + z17);
        cm2.b0 b0Var = this.f193507e;
        java.lang.Integer g17 = b0Var.g();
        if (g17 != null) {
            int intValue = g17.intValue();
            bf2.c cVar = bf2.c.f101131a;
            gk2.e eVar = c40Var.f193642e;
            java.lang.String m76501xf2fd2296 = b0Var.f124864v.m76501xf2fd2296();
            if (m76501xf2fd2296 == null) {
                m76501xf2fd2296 = "";
            }
            bf2.c.c(cVar, eVar, 5, intValue, m76501xf2fd2296, 0, null, 0, 0, null, 0, 1008, null);
        }
        if (b0Var.f124921g) {
            if (zl2.q4.f555466a.E()) {
                db5.t7.m123883x26a183b(c40Var.f193641d, "getJumpInfo!!", 0).show();
            }
            mm2.e1 e1Var = (mm2.e1) c40Var.f193642e.a(mm2.e1.class);
            long j17 = e1Var.f410516m;
            long m75942xfb822ef2 = e1Var.f410521r.m75942xfb822ef2(0);
            int i17 = b0Var.f124865w;
            java.lang.String e17 = xy2.c.e(c40Var.f193641d);
            gk2.e eVar2 = c40Var.f193642e;
            new ke2.v(j17, m75942xfb822ef2, i17, e17, ((mm2.e1) eVar2.a(mm2.e1.class)).f410518o, b0Var.f124920f, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(b0Var.f124864v.mo14344x5f01b1f6()), r4Var.f1(eVar2, null), ((mm2.e1) eVar2.a(mm2.e1.class)).f410526w, null, 512, null).l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a40(b0Var, z17, c40Var));
        } else if (z17) {
            dk2.ef efVar = dk2.ef.f314905a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
            if (k0Var != null && (r60Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60) k0Var.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60.class)) != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putByteArray("POST_PORTRAIT_DATA", b0Var.f124864v.mo14344x5f01b1f6());
                bundle.putInt("POST_PORTRAIT_DATA_TYPE", b0Var.f124865w);
                r60Var.p1("POST_PORTRAIT", bundle);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c40.f193640m.a(c40Var.f193641d, b0Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveOtherBubble$refreshView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
