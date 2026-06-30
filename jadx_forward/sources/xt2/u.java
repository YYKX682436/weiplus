package xt2;

/* loaded from: classes3.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.q45 f538566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14974x21b19514 f538567e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.p45 f538568f;

    public u(r45.q45 q45Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14974x21b19514 c14974x21b19514, r45.p45 p45Var) {
        this.f538566d = q45Var;
        this.f538567e = c14974x21b19514;
        this.f538568f = p45Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ga0 ga0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/view/FinderLiveProductPairingTagView$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.q45 q45Var = this.f538566d;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) q45Var.m75936x14adae67(4);
        if (c19786x6a1e2862 != null) {
            dk2.ef efVar = dk2.ef.f314905a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
            if (k0Var != null && (ga0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ga0) k0Var.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ga0.class)) != null) {
                r45.ac4 ac4Var = new r45.ac4();
                ac4Var.set(6, java.lang.Boolean.TRUE);
                ac4Var.set(1, c19786x6a1e2862);
                if (ga0Var.x0()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l.s1(ga0Var, "PORTRAIT_ACTION_DISPATCH_JUMP", ac4Var, 0, 4, null);
                } else {
                    i95.m c17 = i95.n0.c(c61.yb.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    android.content.Context context = ga0Var.f446856d.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    c61.yb.Yi((c61.yb) c17, context, ac4Var, null, null, 8, null);
                }
            }
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14974x21b19514.f207823e;
        this.f538567e.getClass();
        i95.m c18 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c18;
        ml2.b4 b4Var = ml2.b4.f408797s;
        cl0.g gVar = new cl0.g();
        ml2.f4 f4Var = ml2.f4.f408964e;
        gVar.o("commerceAction", 1069);
        r45.p45 p45Var = this.f538568f;
        gVar.h("pairing_id", p45Var != null ? java.lang.Long.valueOf(p45Var.m75942xfb822ef2(0)) : null);
        gVar.p("product_id", q45Var.m75942xfb822ef2(2));
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveProductPairingTagView$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
