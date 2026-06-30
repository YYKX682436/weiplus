package v74;

/* loaded from: classes4.dex */
public final class b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f515294d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f515295e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f515296f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.FrameLayout f515297g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f515298h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f515299i;

    /* renamed from: m, reason: collision with root package name */
    public int f515300m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(android.view.View rootView, int i17, v74.s itemSize) {
        super(rootView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemSize, "itemSize");
        android.widget.TextView textView = null;
        if (i17 != 0 && i17 != 1) {
            android.widget.TextView textView2 = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.o_r);
            if (textView2 != null) {
                textView2.setTextSize(0, ca4.m0.I(com.p314xaae8f345.mm.R.C30860x5b28f31.a_g));
                textView = textView2;
            }
            this.f515299i = textView;
            return;
        }
        this.f515296f = (android.widget.ImageView) rootView.findViewById(com.p314xaae8f345.mm.R.id.cl6);
        android.widget.TextView textView3 = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.obc);
        if (textView3 != null) {
            textView3.setTextSize(0, ca4.m0.I(com.p314xaae8f345.mm.R.C30860x5b28f31.a_g));
        } else {
            textView3 = null;
        }
        this.f515294d = textView3;
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.f568869oc0);
        if (findViewById != 0) {
            findViewById.getLayoutParams().width = itemSize.a();
            textView = findViewById;
        }
        this.f515295e = textView;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) rootView.findViewById(com.p314xaae8f345.mm.R.id.jdk);
        if (c22646x1e9ca55 != null) {
            c22646x1e9ca55.m81437x205ac394(i65.a.b(rootView.getContext(), 8));
            c22646x1e9ca55.getLayoutParams().width = itemSize.a();
            android.view.ViewGroup.LayoutParams layoutParams = c22646x1e9ca55.getLayoutParams();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemCardHeight", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemCardHeight", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
            layoutParams.height = itemSize.f515422d;
        }
        this.f515297g = (android.widget.FrameLayout) rootView.findViewById(com.p314xaae8f345.mm.R.id.oy7);
        android.widget.ImageView imageView = (android.widget.ImageView) rootView.findViewById(com.p314xaae8f345.mm.R.id.p0h);
        this.f515298h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(i65.a.i(rootView.getContext(), com.p314xaae8f345.mm.R.raw.f81043x73ab7191));
        }
        if (imageView == null) {
            return;
        }
        imageView.setContentDescription(rootView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjf));
    }

    public final android.widget.FrameLayout i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
        return this.f515297g;
    }

    public final android.widget.ImageView j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoStatusIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoStatusIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
        return this.f515298h;
    }

    public final void k(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setIconType", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
        this.f515300m = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIconType", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
    }
}
