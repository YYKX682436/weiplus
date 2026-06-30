package yt3;

/* loaded from: classes10.dex */
public final class p implements android.view.View.OnClickListener, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final ju3.d0 f547108d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 f547109e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.RelativeLayout f547110f;

    /* renamed from: g, reason: collision with root package name */
    public final int f547111g;

    public p(android.view.ViewGroup parent, ju3.d0 status, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 inputPanel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputPanel, "inputPanel");
        this.f547108d = status;
        this.f547109e = inputPanel;
        android.view.View findViewById = parent.findViewById(com.p314xaae8f345.mm.R.id.d7q);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
        this.f547110f = relativeLayout;
        this.f547111g = 4;
        relativeLayout.setOnClickListener(this);
        inputPanel.m68219x12a54e63(com.p314xaae8f345.mm.R.C30861xcebc809e.b47);
        inputPanel.m68223x466a35c6(new yt3.n(this));
        inputPanel.m68227xf183343e(new yt3.o(this));
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(parent.getContext());
        float f17 = b17.y;
        float f18 = b17.x;
        float f19 = f17 / f18;
        float f27 = f17 / 2.18f;
        float f28 = (f18 - f27) / 2;
        if (f19 <= 1.78f) {
            inputPanel.d(f27, f28);
        } else {
            if (f19 >= 2.18f) {
                return;
            }
            inputPanel.d(f27, f28);
        }
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 c17042xf8121282 = this.f547109e;
        if (!(c17042xf8121282.getVisibility() == 0)) {
            return false;
        }
        c17042xf8121282.m68225x76500a7f(false);
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditAddTipPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 c17042xf8121282 = this.f547109e;
        c17042xf8121282.mode = 1;
        c17042xf8121282.m68225x76500a7f(true);
        int[] iArr = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282.N;
        c17042xf8121282.e("", -1, 0);
        nu3.i.f421751a.b(18);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditAddTipPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    /* renamed from: reset */
    public void mo9066x6761d4f() {
        android.widget.RelativeLayout relativeLayout = this.f547110f;
        android.view.ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = com.p314xaae8f345.mm.ui.zk.a(relativeLayout.getContext(), 44);
        relativeLayout.setVisibility(this.f547111g);
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        this.f547110f.setVisibility(i17);
    }
}
