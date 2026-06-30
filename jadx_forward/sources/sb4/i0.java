package sb4;

/* loaded from: classes4.dex */
public final class i0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d f487058d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f487059e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f487060f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f487061g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f487062h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f487063i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.f568581nb2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) findViewById;
        this.f487058d = c22628xfde5d61d;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.f568583nb4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
        this.f487059e = imageView;
        android.view.View findViewById3 = itemView.findViewById(com.p314xaae8f345.mm.R.id.f568582nb3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        this.f487060f = textView;
        android.view.View findViewById4 = itemView.findViewById(com.p314xaae8f345.mm.R.id.naz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f487061g = findViewById4;
        android.view.View findViewById5 = itemView.findViewById(com.p314xaae8f345.mm.R.id.f568579nb0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f487062h = (android.widget.ImageView) findViewById5;
        android.view.View findViewById6 = itemView.findViewById(com.p314xaae8f345.mm.R.id.s6y);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f487063i = findViewById6;
        int Oj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Oj();
        i(c22628xfde5d61d, Oj);
        i(textView, Oj);
        i(findViewById4, Oj);
        i(imageView, Oj / 3);
    }

    public final void i(android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("changeViewSize", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = i17;
        layoutParams2.height = i17;
        view.setLayoutParams(layoutParams2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("changeViewSize", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
    }

    public final android.widget.TextView j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContentIv", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContentIv", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
        return this.f487060f;
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImageIv", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImageIv", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
        return this.f487058d;
    }

    public final android.widget.ImageView l() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSightIcon", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSightIcon", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
        return this.f487059e;
    }
}
