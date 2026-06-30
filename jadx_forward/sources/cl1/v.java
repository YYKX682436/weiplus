package cl1;

/* loaded from: classes8.dex */
public class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl1.w f124433d;

    public v(cl1.w wVar) {
        this.f124433d = wVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView$SearchViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopView", "AppbrandDesktop search jump to AppBrandSearchUI");
        java.lang.System.currentTimeMillis();
        if (((su4.a1) i95.n0.c(su4.a1.class)) != null) {
            cl1.w wVar = this.f124433d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb c12767x7016a6fb = wVar.f124434d;
            c12767x7016a6fb.f172615f2.u(12, true, c12767x7016a6fb.f172616g2.e() == 2, null);
            su4.j2 j2Var = new su4.j2();
            j2Var.f494472b = 42;
            j2Var.f494473c = 262208;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb c12767x7016a6fb2 = wVar.f124434d;
            java.lang.String str = c12767x7016a6fb2.f172635z2;
            j2Var.E = c12767x7016a6fb2.f172615f2.c();
            j2Var.A = !((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).wi(42, 262208);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Bi(wVar.f124434d.f172618i2, j2Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView$SearchViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
