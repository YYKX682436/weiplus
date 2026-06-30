package kf5;

/* loaded from: classes9.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final kf5.d f389035d = new kf5.d();

    public d() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.content.Context context = (android.content.Context) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p653x55bb7a46.p658xd1075a44.C10395x48f00a39 c10395x48f00a39 = new com.p314xaae8f345.mm.p653x55bb7a46.p658xd1075a44.C10395x48f00a39(context, null, 0, 6, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("ImageView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
        android.widget.ImageView imageView = new android.widget.ImageView(c10395x48f00a39.getContext());
        c10395x48f00a39.addView(imageView);
        imageView.setId(com.p314xaae8f345.mm.R.id.ui6);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLayout_width", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
        if (imageView.getLayoutParams() == null) {
            c44.a.o();
            imageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = -1;
            imageView.setLayoutParams(layoutParams);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLayout_width", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLayout_height", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
        if (imageView.getLayoutParams() == null) {
            c44.a.o();
            imageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -1));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            layoutParams2.height = -1;
            imageView.setLayoutParams(layoutParams2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLayout_height", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ImageView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("FrameLayout", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(c10395x48f00a39.getContext());
        c10395x48f00a39.addView(frameLayout);
        frameLayout.setId(com.p314xaae8f345.mm.R.id.ui7);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLayout_width", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
        if (frameLayout.getLayoutParams() == null) {
            c44.a.o();
            frameLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
            layoutParams3.width = -1;
            frameLayout.setLayoutParams(layoutParams3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLayout_width", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLayout_height", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
        if (frameLayout.getLayoutParams() == null) {
            c44.a.o();
            frameLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -1));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams4 = frameLayout.getLayoutParams();
            layoutParams4.height = -1;
            frameLayout.setLayoutParams(layoutParams4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLayout_height", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("FrameLayout", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
        return c10395x48f00a39;
    }
}
