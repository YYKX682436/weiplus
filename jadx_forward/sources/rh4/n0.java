package rh4;

/* loaded from: classes8.dex */
public class n0 extends lh4.h {

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80 f477302m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.RelativeLayout f477303n;

    /* renamed from: o, reason: collision with root package name */
    public rh4.j0 f477304o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(android.content.Context context, lh4.b callback, int i17, android.util.AttributeSet attributeSet, int i18) {
        super(context, callback, i17, attributeSet, i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80 i19 = i();
        this.f477302m = i19;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) m145777xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.jqf);
        relativeLayout.setContentDescription(i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.f571842re) + i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.f572147a00));
        relativeLayout.setOnClickListener(new rh4.l0(this));
        relativeLayout.setOnLongClickListener(new rh4.m0(relativeLayout));
        this.f477303n = relativeLayout;
        ((android.view.ViewGroup) m145777xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.cg7)).addView(i19, 0, new android.widget.FrameLayout.LayoutParams(-1, -2));
        i19.setId(com.p314xaae8f345.mm.R.id.f568766nz1);
        relativeLayout.setAccessibilityTraversalBefore(i19.getId());
        j();
    }

    public static final java.lang.String k(java.util.List items) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = items.iterator();
        while (it.hasNext()) {
            sb6.append(((cl1.n0) it.next()).f124421a.f157898h + ',');
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    @Override // lh4.h
    public void c() {
        n();
        this.f477302m.m1();
    }

    @Override // lh4.h
    public void d() {
        android.widget.TextView m145779x7531c8a2 = m145779x7531c8a2();
        if (m145779x7531c8a2 != null) {
            m145779x7531c8a2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571850rm);
        }
        android.widget.TextView m145779x7531c8a22 = m145779x7531c8a2();
        android.view.ViewGroup.LayoutParams layoutParams = m145779x7531c8a22 != null ? m145779x7531c8a22.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
            m145779x7531c8a2().setLayoutParams(marginLayoutParams);
        }
    }

    @Override // lh4.h
    public java.lang.String f() {
        java.lang.String string = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571850rm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // lh4.h
    public boolean g(int i17) {
        return true;
    }

    /* renamed from: getMoreView */
    public final android.widget.RelativeLayout m162445x6ece7510() {
        return this.f477303n;
    }

    /* renamed from: getRecyclerView */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80 m162446x4905e9fa() {
        return this.f477302m;
    }

    /* renamed from: getShowCount */
    public final int m162447x8c6e4d5c() {
        return this.f477302m.m71640x8c6e4d5c();
    }

    /* renamed from: getShowLines */
    public final int m162448x8cea4b4c() {
        return this.f477302m.m71642x8cea4b4c();
    }

    /* renamed from: getShowList */
    public final java.util.List<cl1.n0> m162449x67a476b1() {
        return this.f477302m.m71643x67a476b1();
    }

    /* renamed from: getShowMaxCount */
    public final int m162450x44f0fe9e() {
        return this.f477302m.mo71638x92a0b781();
    }

    /* renamed from: getWeAppCallback */
    public final rh4.j0 m162451x2b17f622() {
        return this.f477304o;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80 i() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80(getContext());
    }

    public final void j() {
        android.view.ViewGroup.LayoutParams layoutParams = m145776x329d8f10().getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        m145776x329d8f10().setLayoutParams(marginLayoutParams);
        this.f477302m.m71646xbbc97b80(i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn));
    }

    public void l() {
        rh4.j0 j0Var = this.f477304o;
        if (j0Var != null) {
            ((rh4.k0) j0Var).g();
        }
    }

    public void m(float f17) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3) m145775x71965dbb();
        c18557xc00aa3f3.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "onWeAppMarginUpdate margin: %f", java.lang.Float.valueOf(f17));
        int i17 = (int) f17;
        rh4.n0 n0Var = c18557xc00aa3f3.f254064k2;
        if (n0Var != null) {
            n0Var.o(i17);
        }
        rh4.o oVar = c18557xc00aa3f3.f254065l2;
        if (oVar != null) {
            oVar.o(i17);
        }
        rh4.m mVar = c18557xc00aa3f3.f254066m2;
        if (mVar != null) {
            mVar.o(i17);
        }
        ph4.e eVar = c18557xc00aa3f3.f254067n2;
        if (eVar != null && (textView2 = eVar.f400246g) != null) {
            com.p314xaae8f345.mm.ui.kk.e(textView2, i17);
        }
        oh4.j jVar = c18557xc00aa3f3.f254068o2;
        if (jVar == null || (textView = jVar.f400246g) == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.kk.e(textView, i17);
    }

    public void n() {
        android.widget.ImageView imageView;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80 c18566x5b11ed80 = this.f477302m;
        int i17 = c18566x5b11ed80.m71639xe6796cde().size() > c18566x5b11ed80.mo71638x92a0b781() ? 0 : 4;
        android.widget.RelativeLayout relativeLayout = this.f477303n;
        relativeLayout.setVisibility(i17);
        if (relativeLayout.getVisibility() != 4 || (imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.jr6)) == null) {
            return;
        }
        imageView.setImageDrawable(null);
    }

    public void o(int i17) {
        android.widget.TextView textView = this.f400246g;
        if (textView != null) {
            com.p314xaae8f345.mm.ui.kk.e(textView, i17);
        }
        android.widget.RelativeLayout relativeLayout = this.f477303n;
        if (relativeLayout == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.rightMargin = i17;
    }

    /* renamed from: setDataList */
    public final void m162452xe131cdea(java.util.List<? extends cl1.n0> list) {
        this.f477302m.m71644xe131cdea(list);
    }

    /* renamed from: setWeAppCallback */
    public final void m162453xbdee5c96(rh4.j0 j0Var) {
        if (j0Var != null) {
            rh4.k0 k0Var = new rh4.k0(this, j0Var);
            this.f477304o = k0Var;
            this.f477302m.m71647xbdee5c96(k0Var);
        }
    }
}
