package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes3.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.C16470x3920ad6b f229859d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.C16470x3920ad6b c16470x3920ad6b) {
        this.f229859d = c16470x3920ad6b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mall/ui/BannerActView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.C16470x3920ad6b c16470x3920ad6b = this.f229859d;
        c16470x3920ad6b.setVisibility(8);
        java.util.List list = c16470x3920ad6b.f229760d;
        if (list == null || list.size() < 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MallLogic", "func[setBannerRedDotClick] actList null or empty");
        } else {
            int i17 = ((bt4.a) list.get(0)).f105999a;
            gm0.j1.i();
            gm0.j1.u().c().w(270342, java.lang.Integer.valueOf(i17));
            gm0.j1.i();
            gm0.j1.u().c().i(true);
        }
        java.util.List list2 = c16470x3920ad6b.f229760d;
        if (list2 != null && list2.size() > 0) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(c16470x3920ad6b.getContext(), ((bt4.a) c16470x3920ad6b.f229760d.get(0)).f106001c, true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mall/ui/BannerActView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
