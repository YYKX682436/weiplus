package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameBlockView */
/* loaded from: classes5.dex */
public class C15943x8273b8e0 extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.LayoutInflater f222213d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout.LayoutParams f222214e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f222215f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b4 f222216g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.a0 f222217h;

    public C15943x8273b8e0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        setOrientation(1);
        this.f222213d = (android.view.LayoutInflater) getContext().getSystemService("layout_inflater");
        this.f222214e = new android.widget.LinearLayout.LayoutParams(-1, -2);
        this.f222215f = this;
        this.f222216g = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b4();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameBlockView", "initView finished");
    }
}
