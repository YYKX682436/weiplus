package tj3;

/* loaded from: classes14.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tj3.h f501263d;

    public d(tj3.h hVar) {
        this.f501263d = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.b0 m166665xa0ab20ce;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/avatar_view/MultiTalkAvatarControlLayout$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        m166665xa0ab20ce = this.f501263d.m166665xa0ab20ce();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onVirtualBackgroundClick: cut state: ");
        p012xc85e97e9.p093xedfae76a.g0 g0Var = m166665xa0ab20ce.f231804v;
        sb6.append(g0Var.mo3195x754a37bb());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkUIViewModel", sb6.toString());
        java.lang.Boolean bool = (java.lang.Boolean) g0Var.mo3195x754a37bb();
        if (bool == null) {
            bool = java.lang.Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a2 n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().n();
        if (n17 != null) {
            n17.i(!booleanValue);
        }
        boolean z17 = !booleanValue;
        m166665xa0ab20ce.f231803u.mo7808x76db6cb1(java.lang.Boolean.valueOf(z17));
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.wi().d()) {
            m166665xa0ab20ce.f231801s = z17;
            java.util.Map miniInfoHolder = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().V;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(miniInfoHolder, "miniInfoHolder");
            ((java.util.HashMap) miniInfoHolder).put("front_cam_vb", java.lang.Boolean.valueOf(z17));
        } else {
            m166665xa0ab20ce.f231802t = z17;
            java.util.Map miniInfoHolder2 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().V;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(miniInfoHolder2, "miniInfoHolder");
            ((java.util.HashMap) miniInfoHolder2).put("back_cam_vb", java.lang.Boolean.valueOf(z17));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/avatar_view/MultiTalkAvatarControlLayout$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
