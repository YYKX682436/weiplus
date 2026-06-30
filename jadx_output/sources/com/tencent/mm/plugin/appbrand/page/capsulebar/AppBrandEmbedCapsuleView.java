package com.tencent.mm.plugin.appbrand.page.capsulebar;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0005\u001a\u00020\u0004H\u0014J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\r\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/page/capsulebar/AppBrandEmbedCapsuleView;", "Lcom/tencent/mm/plugin/appbrand/page/capsulebar/BaseAppBrandSingleCloseCapsuleBar;", "Landroid/widget/ImageView;", "getWxaIcon", "Landroid/view/View;", "getCloseButton", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "Ljz5/f0;", "setTitle", "Landroid/view/View$OnClickListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setCloseBtnListener", "setShareBtnListener", "", "getViewsNeedResponseAlphaAnimation", "setExtendBtnListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AppBrandEmbedCapsuleView extends com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f86469f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f86470g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f86471h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f86472i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandEmbedCapsuleView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View findViewById = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f488137i6, this).findViewById(com.tencent.mm.R.id.m7j);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f86469f = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f484261dk4);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f86470g = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.dk7);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.bys);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f86471h = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.f483760bz4);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f86472i = kz5.c0.i((android.widget.FrameLayout) findViewById3, (android.widget.FrameLayout) findViewById5);
    }

    @Override // mi1.f2
    public void a(boolean z17) {
    }

    @Override // mi1.f2
    public boolean b() {
        java.util.List list = this.f86472i;
        return (list.isEmpty() ^ true) && ((android.view.View) list.get(0)).getAlpha() == 0.0f;
    }

    @Override // mi1.f2
    public float c() {
        return this.f86471h.getAlpha();
    }

    @Override // mi1.f2
    public void d(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar
    public android.view.View getCloseButton() {
        return this.f86471h;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar
    public java.util.List<android.view.View> getViewsNeedResponseAlphaAnimation() {
        return this.f86472i;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar
    /* renamed from: getWxaIcon */
    public android.widget.ImageView getF86488i() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar
    public void setCloseBtnListener(android.view.View.OnClickListener onClickListener) {
        this.f86471h.setOnClickListener(onClickListener);
    }

    public final void setExtendBtnListener(android.view.View.OnClickListener onClickListener) {
        this.f86470g.setOnClickListener(onClickListener);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar
    public void setShareBtnListener(android.view.View.OnClickListener onClickListener) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar
    public void setTitle(java.lang.String str) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandEmbedCapsuleView(android.content.Context context, boolean z17, boolean z18) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View findViewById = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f488137i6, this).findViewById(com.tencent.mm.R.id.m7j);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f86469f = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f484261dk4);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
        this.f86470g = weImageView;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.dk7);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.bys);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById4;
        this.f86471h = weImageView2;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.f483760bz4);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) findViewById5;
        this.f86472i = kz5.c0.i(frameLayout, frameLayout2);
        if (!z17 && com.tencent.mm.ui.bk.C()) {
            frameLayout.setBackground(getContext().getDrawable(com.tencent.mm.R.drawable.f480850e4));
            weImageView.setIconColor(-1);
            frameLayout2.setBackground(getContext().getDrawable(com.tencent.mm.R.drawable.f480850e4));
            weImageView2.setIconColor(-1);
        } else {
            frameLayout.setBackground(getContext().getDrawable(com.tencent.mm.R.drawable.f480851e5));
            weImageView.setIconColor(getContext().getColor(com.tencent.mm.R.color.BW_0));
            frameLayout2.setBackground(getContext().getDrawable(com.tencent.mm.R.drawable.f480851e5));
            weImageView2.setIconColor(getContext().getColor(com.tencent.mm.R.color.BW_0));
        }
        if (z18) {
            return;
        }
        weImageView.setIconColor(getContext().getColor(com.tencent.mm.R.color.f478651d7));
    }
}
