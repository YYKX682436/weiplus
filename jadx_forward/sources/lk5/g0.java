package lk5;

/* loaded from: classes14.dex */
public final class g0 extends com.p314xaae8f345.mm.ui.ga {

    /* renamed from: y0, reason: collision with root package name */
    public android.view.MenuInflater f400566y0;

    /* renamed from: z0, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 f400567z0;

    public g0(com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83) {
        this.f400567z0 = c22584xf7d97e83;
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public s75.b B() {
        return new s75.b("");
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public int C() {
        return this.f400567z0.mo81244x2ee31f5b();
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public android.view.View D() {
        nk5.c cVar;
        android.view.ViewGroup viewGroup;
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = this.f400567z0;
        android.view.View inflate = android.view.LayoutInflater.from(c22584xf7d97e83.f292654p).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bbk, (android.view.ViewGroup) null);
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = c22584xf7d97e83.f292654p;
        p012xc85e97e9.p016x746ad0e3.app.b m81192x74c95406 = abstractActivityC22579xbed01a37 != null ? abstractActivityC22579xbed01a37.m81192x74c95406() : null;
        lk5.e eVar = m81192x74c95406 instanceof lk5.e ? (lk5.e) m81192x74c95406 : null;
        if (eVar != null && (viewGroup = eVar.f400561b) != null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.hvf);
            android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            android.view.ViewParent parent = frameLayout.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) parent;
            int indexOfChild = viewGroup2.indexOfChild(frameLayout);
            viewGroup2.removeView(frameLayout);
            viewGroup2.addView(viewGroup, indexOfChild, layoutParams);
        }
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.hw_);
        android.widget.FrameLayout frameLayout3 = (android.widget.FrameLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.hwa);
        lk5.f fVar = com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39695x233c02ec;
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a372 = c22584xf7d97e83.f292654p;
        java.lang.String name = abstractActivityC22579xbed01a372 != null ? abstractActivityC22579xbed01a372.getClass().getName() : null;
        if (name == null) {
            name = "";
        }
        fVar.getClass();
        cVar = com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39716x5a4134e4;
        if (cVar.a(name)) {
            android.view.ViewGroup.LayoutParams layoutParams2 = frameLayout3.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = 0;
                frameLayout3.setLayoutParams(marginLayoutParams);
            }
        }
        c22584xf7d97e83.M = frameLayout2;
        c22584xf7d97e83.N = frameLayout3;
        c22584xf7d97e83.f292661w = inflate.findViewById(com.p314xaae8f345.mm.R.id.f569067ow4);
        frameLayout2.addView(android.view.LayoutInflater.from(c22584xf7d97e83.f292654p).inflate(c22584xf7d97e83.mo81244x2ee31f5b(), (android.view.ViewGroup) null));
        c22584xf7d97e83.m7542x4da7ad7();
        n3.m0.a(inflate, new lk5.c0(c22584xf7d97e83));
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public void E0(int i17) {
        super.E0(i17);
        ul5.k kVar = this.f290207v;
        if (kVar != null) {
            kVar.mo82166x35ae8153(i17);
        }
        android.view.View view = this.f400567z0.f292661w;
        if (view != null) {
            view.setBackgroundColor(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public void I() {
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = this.f400567z0;
        android.view.View view = c22584xf7d97e83.f292660v;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/vas/VASCommonFragment", "hideStatusBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/vas/VASCommonFragment", "hideStatusBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        c22584xf7d97e83.L = true;
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public void N0() {
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = this.f400567z0;
        o.r rVar = new o.r(c22584xf7d97e83.f292654p);
        if (this.f400566y0 == null) {
            p012xc85e97e9.p016x746ad0e3.app.b F = F();
            if (F != null) {
                this.f400566y0 = new n.j(F.m());
            } else {
                this.f400566y0 = new n.j(c22584xf7d97e83.mo7430x19263085());
            }
        }
        android.view.MenuInflater menuInflater = this.f400566y0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(menuInflater);
        c22584xf7d97e83.mo7502xa71d2e62(rVar, menuInflater);
        c22584xf7d97e83.mo7514x99b541d5(rVar);
        super.g0(rVar);
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public void O0(boolean z17) {
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f400567z0.f292654p;
        boolean z18 = false;
        if (abstractActivityC22579xbed01a37 != null && abstractActivityC22579xbed01a37.m81188x60276c93()) {
            z18 = true;
        }
        if (z18) {
            return;
        }
        super.O0(z17);
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public boolean V() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public boolean d0() {
        this.f400567z0.getClass();
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public void f(int i17, int i18, int i19, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        super.f(i17, i18, i19, onMenuItemClickListener);
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public void f0() {
        this.f400567z0.getClass();
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public void g(int i17, java.lang.String str, int i18, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        super.g(i17, str, i18, onMenuItemClickListener);
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public boolean g0(android.view.Menu menu) {
        return super.g0(menu);
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public void i0() {
        this.f400567z0.getClass();
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public boolean k0(android.view.Menu menu) {
        super.k0(menu);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public void m(android.view.View view) {
        this.f400567z0.getClass();
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public android.view.View m0() {
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f400567z0.f292654p;
        if (abstractActivityC22579xbed01a37 != null) {
            return abstractActivityC22579xbed01a37.mo44294xa334195d();
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public void p0(int i17) {
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = this.f400567z0;
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = c22584xf7d97e83.f292654p;
        boolean z17 = false;
        if (abstractActivityC22579xbed01a37 != null && abstractActivityC22579xbed01a37.m81188x60276c93()) {
            z17 = true;
        }
        if (!z17) {
            super.p0(i17);
        } else if (this.G != null) {
            this.O = i17;
            this.P = true;
            this.R = com.p314xaae8f345.mm.ui.uk.g(i17);
            this.G.w(new android.graphics.drawable.ColorDrawable(this.O));
            P0();
        }
        ul5.k kVar = this.f290207v;
        if (kVar != null) {
            kVar.mo82174x3b2a1eb1(i17);
        }
        android.view.View view = c22584xf7d97e83.f292659u;
        if (view != null) {
            view.setBackgroundColor(i17);
        }
        android.view.View view2 = c22584xf7d97e83.f292660v;
        if (view2 != null) {
            view2.setBackgroundColor(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public boolean s() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public java.lang.String v() {
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = this.f400567z0;
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = c22584xf7d97e83.f292654p;
        java.lang.String name = abstractActivityC22579xbed01a37 != null ? abstractActivityC22579xbed01a37.getClass().getName() : null;
        return name == null ? c22584xf7d97e83.getClass().getName() : name;
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public android.view.View w() {
        android.view.View view = this.f290171d;
        return view == null ? new android.view.View(this.f400567z0.mo7430x19263085()) : view;
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 x() {
        return this.f400567z0.f292654p;
    }

    @Override // com.p314xaae8f345.mm.ui.ga
    public int y() {
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = this.f400567z0;
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = c22584xf7d97e83.f292654p;
        int m81169xba9022cb = abstractActivityC22579xbed01a37 != null ? abstractActivityC22579xbed01a37.m81169xba9022cb() : -1;
        if (m81169xba9022cb != -1) {
            return m81169xba9022cb;
        }
        c22584xf7d97e83.getClass();
        return com.p314xaae8f345.mm.R.id.hw_;
    }
}
