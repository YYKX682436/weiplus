package d04;

/* loaded from: classes8.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17325xac7c40dc f306942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f306943e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f306944f;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17325xac7c40dc c17325xac7c40dc, int i17, android.view.View view) {
        this.f306942d = c17325xac7c40dc;
        this.f306943e = i17;
        this.f306944f = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/widget/BaseScrollTabView$initTabClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17325xac7c40dc c17325xac7c40dc = this.f306942d;
        if (!c17325xac7c40dc.f241201f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseScrollTabView", "onTabClick not enableSwitchTab");
            yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/widget/BaseScrollTabView$initTabClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        c17325xac7c40dc.m68753xe39a2981(true);
        int i17 = this.f306943e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseScrollTabView", "onTabClick index: %d", java.lang.Integer.valueOf(i17));
        d04.k kVar = (d04.k) kz5.n0.a0(c17325xac7c40dc.f241202g, i17);
        if (kVar != null) {
            kVar.getF241341e();
            c17325xac7c40dc.getClass();
        }
        c17325xac7c40dc.h(i17, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/widget/BaseScrollTabView$initTabClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
