package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c;

/* loaded from: classes11.dex */
public class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f289124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f289125e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.a0 f289126f;

    public z(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.a0 a0Var, int i17, int i18) {
        this.f289126f = a0Var;
        this.f289124d = i17;
        this.f289125e = i18;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/banner/MainFrameBanner$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        c01.t9.e().b(this.f289124d, this.f289125e);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.a0 a0Var = this.f289126f;
        android.content.Context context = (android.content.Context) a0Var.f484375g.get();
        a0Var.getClass();
        java.lang.String str = (java.lang.String) c01.d9.b().p().l(68377, null);
        c01.d9.b().p().w(68377, "");
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        if (p94.w0.a() != null && ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w1) p94.w0.a()).f() > 0) {
            K0 = false;
        }
        fe0.j4 j4Var = new fe0.j4();
        j4Var.f342943g = K0;
        ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Ui(context, null, 6, j4Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11002, 8, 1);
        yj0.a.h(this, "com/tencent/mm/ui/conversation/banner/MainFrameBanner$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
