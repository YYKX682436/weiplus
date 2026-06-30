package cl1;

/* loaded from: classes8.dex */
public class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl1.z f42896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cl1.n0 f42897e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cl1.u f42898f;

    public t(cl1.u uVar, cl1.z zVar, cl1.n0 n0Var) {
        this.f42898f = uVar;
        this.f42896d = zVar;
        this.f42897e = n0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView$ItemAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cl1.u uVar = this.f42898f;
        com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView appBrandDesktopView = uVar.f42899d;
        if (appBrandDesktopView.f91125d2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopView", "inLongPress, return");
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView$ItemAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            appBrandDesktopView.f91082f2.G(this.f42896d.getAdapterPosition() - (uVar.f42899d.f91087k2 ? 1 : 0), this.f42897e, true);
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView$ItemAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
