package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class zb0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dc0 f196854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.mb0 f196855e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.g0 f196856f;

    public zb0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dc0 dc0Var, bw5.mb0 mb0Var, cm2.g0 g0Var) {
        this.f196854d = dc0Var;
        this.f196855e = mb0Var;
        this.f196856f = g0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveTingBubble$refreshView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bf2.c cVar = bf2.c.f101131a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dc0 dc0Var = this.f196854d;
        gk2.e eVar = dc0Var.f193788e;
        jz5.f0 f0Var = null;
        bw5.mb0 mb0Var = this.f196855e;
        java.lang.String b17 = mb0Var != null ? mb0Var.b() : null;
        if (b17 == null) {
            b17 = "";
        }
        bf2.c.c(cVar, eVar, 5, 12, b17, 0, null, 0, 5, null, 0, nd1.y0.f72985x366c91de, null);
        zl2.r4 r4Var = zl2.r4.f555483a;
        boolean z17 = r4Var.Y1(dc0Var.f193787d) && !r4Var.w1();
        java.lang.String str = dc0Var.f193791h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "click bubble, isVisitorLandscape = " + z17);
        cm2.g0 g0Var = this.f196856f;
        if (!z17 || com.p314xaae8f345.mm.ui.bk.d0()) {
            bw5.mb0 P0 = r4Var.P0(g0Var.f124879v);
            if (P0 != null) {
                android.view.ViewGroup viewGroup = dc0Var.f193792i;
                if (viewGroup == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
                    throw null;
                }
                android.content.Context context = viewGroup.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                r4Var.r2(context, P0, bw5.ar0.TingScene_Live_CategoryBubble);
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[jumpTing] play info null!");
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
            if (k0Var != null && (r60Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60) k0Var.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60.class)) != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putByteArray("POST_TING_PORTRAIT_DATA", g0Var.f124879v.mo14344x5f01b1f6());
                r60Var.p1("POST_TING_PORTRAIT", bundle);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTingBubble$refreshView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
