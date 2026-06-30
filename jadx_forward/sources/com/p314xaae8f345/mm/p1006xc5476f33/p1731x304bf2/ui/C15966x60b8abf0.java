package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameFeedSocialInfoView */
/* loaded from: classes5.dex */
public class C15966x60b8abf0 extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f222354d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1759xd1075a44.C16036xf7d3378c f222355e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f222356f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f222357g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f222358h;

    public C15966x60b8abf0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f222354d = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.a_7);
        this.f222355e = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1759xd1075a44.C16036xf7d3378c) findViewById(com.p314xaae8f345.mm.R.id.a_d);
        this.f222356f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.a9y);
        this.f222357g = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
        this.f222358h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cus);
    }

    /* renamed from: setData */
    public void m64752x76491f2c(m53.o0 o0Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(o0Var.f405466e) && o0Var.f405467f == null) {
            this.f222354d.setVisibility(8);
        } else {
            this.f222354d.setVisibility(0);
            this.f222355e.m64850x76491f2c(o0Var.f405466e);
            java.lang.String str = o0Var.f405467f;
            if (str != null) {
                this.f222356f.setText(str);
                this.f222356f.setVisibility(0);
            } else {
                this.f222356f.setVisibility(8);
            }
        }
        if (o0Var.f405468g == null) {
            this.f222357g.setVisibility(8);
        } else {
            this.f222357g.setVisibility(0);
            this.f222358h.setText(o0Var.f405468g);
        }
    }
}
