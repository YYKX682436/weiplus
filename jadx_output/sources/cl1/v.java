package cl1;

/* loaded from: classes8.dex */
public class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl1.w f42900d;

    public v(cl1.w wVar) {
        this.f42900d = wVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView$SearchViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopView", "AppbrandDesktop search jump to AppBrandSearchUI");
        java.lang.System.currentTimeMillis();
        if (((su4.a1) i95.n0.c(su4.a1.class)) != null) {
            cl1.w wVar = this.f42900d;
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView appBrandDesktopView = wVar.f42901d;
            appBrandDesktopView.f91082f2.u(12, true, appBrandDesktopView.f91083g2.e() == 2, null);
            su4.j2 j2Var = new su4.j2();
            j2Var.f412939b = 42;
            j2Var.f412940c = 262208;
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView appBrandDesktopView2 = wVar.f42901d;
            java.lang.String str = appBrandDesktopView2.f91102z2;
            j2Var.E = appBrandDesktopView2.f91082f2.c();
            j2Var.A = !((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).wi(42, 262208);
            ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Bi(wVar.f42901d.f91085i2, j2Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView$SearchViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
