package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class c4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.eb7 f199485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h4 f199486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f199487f;

    public c4(r45.eb7 eb7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h4 h4Var, android.content.Context context) {
        this.f199485d = eb7Var;
        this.f199486e = h4Var;
        this.f199487f = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterRecommendProductWidget$fillCards$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l81.b1 b1Var = new l81.b1();
        r45.eb7 eb7Var = this.f199485d;
        r45.ce0 ce0Var = (r45.ce0) eb7Var.m75936x14adae67(3);
        if (ce0Var == null || (str = ce0Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        b1Var.f398547b = str;
        r45.ce0 ce0Var2 = (r45.ce0) eb7Var.m75936x14adae67(3);
        if (ce0Var2 == null || (str2 = ce0Var2.m75945x2fec8307(1)) == null) {
            str2 = "";
        }
        b1Var.f398555f = str2;
        b1Var.f398565k = 1205;
        zl2.b0 b0Var = zl2.b0.f555196a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h4 h4Var = this.f199486e;
        b0Var.a(h4Var.f200061b.Y().f492179a, "", b1Var);
        android.content.Context context = h4Var.f200060a.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa) ((zy2.v9) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.v9.class))).U6(h4Var.f200061b.Y().f492192n.m75942xfb822ef2(0), b1Var);
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            dk2.q4 q4Var = dk2.q4.f315471a;
            android.content.Context context2 = this.f199487f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
            dk2.q4.m(q4Var, context2, eVar, b1Var, true, null, 16, null);
        }
        long m75942xfb822ef2 = eb7Var.m75942xfb822ef2(0);
        h4Var.getClass();
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.f408797s;
        cl0.g gVar = new cl0.g();
        gVar.o("commerceAction", 1028);
        gVar.p("productid", m75942xfb822ef2);
        ml2.r0.mj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterRecommendProductWidget$fillCards$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
