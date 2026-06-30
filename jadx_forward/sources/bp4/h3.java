package bp4;

/* loaded from: classes10.dex */
public final class h3 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f104721f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22611x654ca43e f104722g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff f104723h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(android.view.ViewGroup parent, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f104721f = parent;
        android.view.View findViewById = parent.findViewById(com.p314xaae8f345.mm.R.id.o1b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22611x654ca43e c22611x654ca43e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22611x654ca43e) findViewById;
        this.f104722g = c22611x654ca43e;
        android.view.View findViewById2 = parent.findViewById(com.p314xaae8f345.mm.R.id.o1c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) findViewById2;
        this.f104723h = c2718xca2902ff;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TemplateNormalModeSelectPlugin", "init tabLayout.tabCount:" + c2718xca2902ff.m20353x443e53f0());
        c22611x654ca43e.m81286x376ccde3(true);
        int m20353x443e53f0 = c2718xca2902ff.m20353x443e53f0() - 1;
        for (int i17 = 0; i17 < m20353x443e53f0; i17++) {
            android.view.View childAt = this.f104723h.getChildAt(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.View childAt2 = ((android.view.ViewGroup) childAt).getChildAt(i17);
            android.view.ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginEnd(i65.a.h(this.f104721f.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7));
            childAt2.setLayoutParams(marginLayoutParams);
        }
        this.f104723h.a(new bp4.g3(status));
        z(false);
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        this.f104723h.setVisibility(i17);
    }

    public final void z(boolean z17) {
        this.f104722g.setVisibility(z17 ? 0 : 8);
    }
}
