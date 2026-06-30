package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.MPSmileyFooter */
/* loaded from: classes5.dex */
public class C19487x960af8af extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 {

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f268575g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 f268576h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f268577i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f268578m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f268579n;

    /* renamed from: o, reason: collision with root package name */
    public int f268580o;

    /* renamed from: p, reason: collision with root package name */
    public int f268581p;

    /* renamed from: q, reason: collision with root package name */
    public int f268582q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f268583r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f268584s;

    public C19487x960af8af(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f268577i = null;
        this.f268580o = -1;
        this.f268581p = 0;
        this.f268582q = 0;
        this.f268583r = false;
        this.f268575g = context;
    }

    public static void f(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19487x960af8af c19487x960af8af) {
        if (c19487x960af8af.f268576h.getVisibility() != 8) {
            c19487x960af8af.f268577i.requestFocus();
            c19487x960af8af.f268576h.h();
            c19487x960af8af.f268576h.setVisibility(8);
            c19487x960af8af.m74801x19263085().mo26063x7b383410();
            c19487x960af8af.f268578m.setImageResource(c19487x960af8af.g(com.p314xaae8f345.mm.R.C30857x2dd9f1.f559727d7));
            return;
        }
        c19487x960af8af.m74801x19263085().mo48674x36654fab();
        c19487x960af8af.f268576h.i();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.e(c19487x960af8af.f268575g) != 2 || !c19487x960af8af.f268583r) {
            c19487x960af8af.i();
        }
        c19487x960af8af.f268576h.setVisibility(0);
        c19487x960af8af.f268577i.requestFocus();
        c19487x960af8af.f268578m.setImageResource(c19487x960af8af.g(com.p314xaae8f345.mm.R.C30857x2dd9f1.f559726d6));
    }

    /* renamed from: getActivity */
    private com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m74801x19263085() {
        if (this.f268584s == null) {
            android.content.Context context = this.f268575g;
            if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                this.f268584s = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
            } else {
                while (!(context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) && (context instanceof android.content.ContextWrapper)) {
                    context = ((android.content.ContextWrapper) context).getBaseContext();
                }
                this.f268584s = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
            }
        }
        return this.f268584s;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049, al5.e0
    public void J2(boolean z17, int i17) {
        super.J2(z17, i17);
        if (this.f268581p == i17 || i17 == 0) {
            return;
        }
        this.f268581p = i17;
        fp.w.m(getContext(), i17);
        i();
    }

    public final int g(int i17) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        this.f268575g.getTheme().resolveAttribute(i17, typedValue, true);
        return typedValue.resourceId;
    }

    public boolean h() {
        return this.f268576h.getVisibility() == 0;
    }

    public final void i() {
        android.view.ViewGroup.LayoutParams layoutParams = this.f268579n.getLayoutParams();
        layoutParams.height = this.f268581p + this.f268582q;
        this.f268579n.setLayoutParams(layoutParams);
        int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.g(getContext());
        this.f268576h.mo75342x4b0766b2(g17);
        this.f268576h.b();
        android.view.ViewGroup.LayoutParams layoutParams2 = this.f268576h.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = g17;
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f268576h != null) {
            i();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = this.f268580o;
        if (i28 >= i27) {
            i27 = i28;
        }
        this.f268580o = i27;
    }

    /* renamed from: setExtraAddHeight */
    public void m74802x5e868bfa(int i17) {
        this.f268582q = i17;
    }

    /* renamed from: setFobbidenWhenLandscape */
    public void m74803xafa62512(boolean z17) {
        this.f268583r = z17;
    }

    /* renamed from: setMMEditText */
    public void m74804x1b9709f9(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017) {
        this.f268577i = c22621x7603e017;
        c22621x7603e017.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.q4(this));
        c22621x7603e017.setOnEditorActionListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.r4(this));
    }

    /* renamed from: setSmileHeight */
    public void m74805x58c0848d(int i17) {
        android.view.ViewGroup.LayoutParams layoutParams = this.f268579n.getLayoutParams();
        layoutParams.height = i17;
        this.f268579n.setLayoutParams(layoutParams);
        int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.g(getContext());
        this.f268576h.mo75342x4b0766b2(g17);
        this.f268576h.getClass();
        android.view.ViewGroup.LayoutParams layoutParams2 = this.f268576h.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = g17;
        }
    }
}
