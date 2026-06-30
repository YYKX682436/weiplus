package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.MaskLinearLayout */
/* loaded from: classes4.dex */
public class C17974x4f9963db extends android.widget.LinearLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f247911h = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f247912d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Runnable f247913e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f247914f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f247915g;

    public C17974x4f9963db(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f247914f = false;
        this.f247915g = new java.util.LinkedList();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        this.f247912d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.f247913e = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u5(this);
        super.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.v5(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17974x4f9963db c17974x4f9963db) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        c17974x4f9963db.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateS", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        if (c17974x4f9963db.isPressed()) {
            c17974x4f9963db.setBackgroundColor(c17974x4f9963db.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835));
        } else {
            c17974x4f9963db.setBackgroundResource(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateS", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
    }

    public void b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4 c17972xe84284f4) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addChildId", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        ((java.util.LinkedList) this.f247915g).add(c17972xe84284f4);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addChildId", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDraw", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        super.onDraw(canvas);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDraw", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
    }

    @Override // android.view.View
    @java.lang.Deprecated
    public void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnTouchListener", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        iz5.a.g(null, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnTouchListener", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
    }

    /* renamed from: settouchEnable */
    public void m70601x59285800(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("settouchEnable", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        this.f247914f = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("settouchEnable", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
    }
}
