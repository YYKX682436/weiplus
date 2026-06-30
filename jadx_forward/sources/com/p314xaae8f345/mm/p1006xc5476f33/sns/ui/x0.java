package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class x0 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f253007d;

    /* renamed from: e, reason: collision with root package name */
    public int f253008e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f253009f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f253010g;

    public x0(android.content.Context context) {
        super(context);
        this.f253007d = 0;
        this.f253008e = 6;
        this.f253009f = context;
        setOrientation(1);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addView", "com.tencent.mm.plugin.sns.ui.AutoLayout");
        if (this.f253007d % this.f253008e == 0) {
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.f253009f);
            this.f253010g = linearLayout;
            linearLayout.setOrientation(0);
            this.f253010g.addView(view);
            super.addView(this.f253010g);
        } else {
            this.f253010g.addView(view);
        }
        this.f253007d++;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addView", "com.tencent.mm.plugin.sns.ui.AutoLayout");
    }

    /* renamed from: setLineMaxCounte */
    public void m71362xac130ce4(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLineMaxCounte", "com.tencent.mm.plugin.sns.ui.AutoLayout");
        if (i17 > 0) {
            this.f253008e = i17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLineMaxCounte", "com.tencent.mm.plugin.sns.ui.AutoLayout");
    }
}
