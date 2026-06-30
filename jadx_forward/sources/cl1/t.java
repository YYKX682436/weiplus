package cl1;

/* loaded from: classes8.dex */
public class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl1.z f124429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cl1.n0 f124430e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cl1.u f124431f;

    public t(cl1.u uVar, cl1.z zVar, cl1.n0 n0Var) {
        this.f124431f = uVar;
        this.f124429d = zVar;
        this.f124430e = n0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView$ItemAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cl1.u uVar = this.f124431f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb c12767x7016a6fb = uVar.f124432d;
        if (c12767x7016a6fb.f172658d2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopView", "inLongPress, return");
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView$ItemAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            c12767x7016a6fb.f172615f2.G(this.f124429d.m8183xf806b362() - (uVar.f124432d.f172620k2 ? 1 : 0), this.f124430e, true);
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView$ItemAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
