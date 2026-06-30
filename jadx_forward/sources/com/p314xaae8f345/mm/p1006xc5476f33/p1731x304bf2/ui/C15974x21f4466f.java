package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameInfoViewForeign */
/* loaded from: classes8.dex */
public class C15974x21f4466f extends android.widget.RelativeLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f222404d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f222405e;

    /* renamed from: f, reason: collision with root package name */
    public int f222406f;

    /* renamed from: g, reason: collision with root package name */
    public int f222407g;

    /* renamed from: h, reason: collision with root package name */
    public final int f222408h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View.OnClickListener f222409i;

    public C15974x21f4466f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f222406f = 0;
        this.f222407g = 0;
        this.f222408h = 2;
        this.f222409i = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.y3(this);
        this.f222404d = context;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(this.f222409i);
        this.f222405e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.gnp);
        int d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().d1();
        this.f222407g = d17;
        if (d17 > 0 && d17 <= 99) {
            this.f222405e.setVisibility(0);
            this.f222405e.setText("" + this.f222407g);
        } else if (d17 > 99) {
            this.f222405e.setVisibility(0);
            this.f222405e.setText("99+");
            this.f222405e.setTextSize(1, 9.0f);
        } else {
            this.f222405e.setVisibility(4);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameInfoViewForeign", "initView finished");
    }

    /* renamed from: setSourceScene */
    public void m64761x6a7f536f(int i17) {
        this.f222406f = i17;
    }
}
