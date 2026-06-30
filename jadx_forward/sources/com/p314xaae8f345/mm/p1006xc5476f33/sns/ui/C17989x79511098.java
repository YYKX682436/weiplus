package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.PhotosContent */
/* loaded from: classes4.dex */
public class C17989x79511098 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.C21494x5bf86537 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f248104e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f248105f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f248106g;

    /* renamed from: h, reason: collision with root package name */
    public float f248107h;

    /* renamed from: i, reason: collision with root package name */
    public int f248108i;

    public C17989x79511098(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f248104e = new java.util.ArrayList();
        this.f248105f = new java.util.ArrayList();
        this.f248106g = new java.util.ArrayList();
        this.f248108i = 120;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.PhotosContent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.PhotosContent");
    }

    public void a(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addImageParentView", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        this.f248106g.add(view);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addImageParentView", "com.tencent.mm.plugin.sns.ui.PhotosContent");
    }

    public void b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18146x7d99d446 c18146x7d99d446) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addImageview", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        this.f248104e.add(c18146x7d99d446);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addImageview", "com.tencent.mm.plugin.sns.ui.PhotosContent");
    }

    public void c(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addLivePhotoTagView", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        this.f248105f.add(view);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addLivePhotoTagView", "com.tencent.mm.plugin.sns.ui.PhotosContent");
    }

    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearImageView", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        this.f248104e.clear();
        this.f248105f.clear();
        this.f248106g.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearImageView", "com.tencent.mm.plugin.sns.ui.PhotosContent");
    }

    public android.widget.FrameLayout.LayoutParams e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEachImageViewLayoutParams", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        android.view.View childAt = getChildAt(i17);
        if (childAt == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEachImageViewLayoutParams", "com.tencent.mm.plugin.sns.ui.PhotosContent");
            return null;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEachImageViewLayoutParams", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        return layoutParams;
    }

    public android.view.View f(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImageParentView", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        java.util.ArrayList arrayList = this.f248106g;
        if (i17 >= arrayList.size()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImageParentView", "com.tencent.mm.plugin.sns.ui.PhotosContent");
            return null;
        }
        android.view.View view = (android.view.View) arrayList.get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImageParentView", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        return view;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18146x7d99d446 g(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImageView", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        java.util.ArrayList arrayList = this.f248104e;
        if (i17 >= arrayList.size()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImageView", "com.tencent.mm.plugin.sns.ui.PhotosContent");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18146x7d99d446 c18146x7d99d446 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18146x7d99d446) arrayList.get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImageView", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        return c18146x7d99d446;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMeasure", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        super.onMeasure(i17, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMeasure", "com.tencent.mm.plugin.sns.ui.PhotosContent");
    }

    /* renamed from: setParentImageViewWidth */
    public void m70665xaf1ffdd2(int i17) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setParentImageViewWidth", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        if (i17 <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setParentImageViewWidth", "com.tencent.mm.plugin.sns.ui.PhotosContent");
            return;
        }
        float f17 = getResources().getDisplayMetrics().density;
        this.f248107h = f17;
        int i18 = (int) (this.f248108i * f17);
        this.f248108i = i18;
        if (i17 >= i18) {
            i17 = i18;
        }
        int i19 = 0;
        while (true) {
            arrayList = this.f248104e;
            if (i19 >= arrayList.size()) {
                break;
            }
            android.view.View childAt = getChildAt(i19);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(childAt.getLayoutParams());
            marginLayoutParams.width = i17;
            marginLayoutParams.height = i17;
            float f18 = i17;
            float f19 = this.f248107h;
            marginLayoutParams.leftMargin = (int) ((i19 % 3) * ((f19 * 3.0f) + f18));
            marginLayoutParams.topMargin = (int) ((i19 / 3) * (f18 + (f19 * 3.0f)));
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(marginLayoutParams);
            layoutParams.gravity = 51;
            childAt.setLayoutParams(layoutParams);
            i19++;
        }
        if (arrayList.size() / 3 > 0) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams2.height = (int) ((i17 * r2) + (this.f248107h * 3.0f * (r2 - 1)));
            setLayoutParams(marginLayoutParams2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setParentImageViewWidth", "com.tencent.mm.plugin.sns.ui.PhotosContent");
    }
}
