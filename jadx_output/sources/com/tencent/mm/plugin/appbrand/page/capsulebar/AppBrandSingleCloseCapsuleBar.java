package com.tencent.mm.plugin.appbrand.page.capsulebar;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%B#\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b$\u0010(J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0014J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0016J\u0012\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016R\u001a\u0010\u0016\u001a\u00020\b8\u0014X\u0094D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R*\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006)"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/page/capsulebar/AppBrandSingleCloseCapsuleBar;", "Lcom/tencent/mm/plugin/appbrand/page/capsulebar/BaseAppBrandSingleCloseCapsuleBar;", "", "Landroid/view/View;", "getViewsNeedResponseAlphaAnimation", "Landroid/widget/ImageView;", "getWxaIcon", "getCloseButton", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "Ljz5/f0;", "setTitle", "desc", "setDesc", "Landroid/view/View$OnClickListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setCloseBtnListener", "setShareBtnListener", "f", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Lmi1/u1;", "value", "s", "Lmi1/u1;", "getCloseBtnType", "()Lmi1/u1;", "setCloseBtnType", "(Lmi1/u1;)V", "closeBtnType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AppBrandSingleCloseCapsuleBar extends com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final java.lang.String TAG;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f86474g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f86475h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f86476i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f86477m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f86478n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f86479o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.LinearLayout f86480p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.LinearLayout f86481q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f86482r;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public mi1.u1 closeBtnType;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f86484t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandSingleCloseCapsuleBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.TAG = "MicroMsg.AppBrandSingleCloseCapsuleBar";
        android.view.View findViewById = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f488138i7, this).findViewById(com.tencent.mm.R.id.m7j);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f86474g = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.bys);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f86475h = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.mse);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById3;
        this.f86476i = weImageView;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.k3f);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById4;
        this.f86477m = textView;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.h5n);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById5;
        this.f86478n = imageView;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.f484050cu2);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById6;
        this.f86479o = textView2;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.oca);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f86480p = (android.widget.LinearLayout) findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.b3v);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById8;
        this.f86481q = linearLayout;
        this.closeBtnType = mi1.u1.f326698d;
        this.f86484t = kz5.c0.i(weImageView, textView, imageView, textView2);
        linearLayout.setLayoutTransition(new android.animation.LayoutTransition());
    }

    @Override // mi1.f2
    public void a(boolean z17) {
        int i17 = z17 ? 0 : 8;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f86475h;
        if (i17 != weImageView.getVisibility()) {
            weImageView.setVisibility(z17 ? 0 : 8);
            this.f86481q.requestLayout();
        }
    }

    @Override // mi1.f2
    public boolean b() {
        java.util.List list = this.f86484t;
        return (list.isEmpty() ^ true) && ((android.view.View) list.get(0)).getAlpha() == 0.0f;
    }

    @Override // mi1.f2
    public float c() {
        return this.f86478n.getAlpha();
    }

    @Override // mi1.f2
    public void d(boolean z17) {
        int i17 = z17 ? 0 : 8;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f86476i;
        if (i17 != weImageView.getVisibility()) {
            weImageView.setVisibility(z17 ? 0 : 8);
            this.f86481q.requestLayout();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar
    public void g(boolean z17) {
        int i17 = z17 ? 0 : 8;
        android.widget.LinearLayout linearLayout = this.f86480p;
        if (i17 != linearLayout.getVisibility()) {
            linearLayout.setVisibility(z17 ? 0 : 8);
        }
    }

    public final mi1.u1 getCloseBtnType() {
        return this.closeBtnType;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar
    public android.view.View getCloseButton() {
        return this.f86475h;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar
    public java.lang.String getTAG() {
        return this.TAG;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar
    public java.util.List<android.view.View> getViewsNeedResponseAlphaAnimation() {
        return this.f86484t;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar
    /* renamed from: getWxaIcon, reason: from getter */
    public android.widget.ImageView getF86478n() {
        return this.f86478n;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar
    public int h(int i17) {
        return this.f86482r ? i17 == com.tencent.mm.R.color.f478714f5 ? com.tencent.mm.R.color.BW_0 : i17 == com.tencent.mm.R.color.aaw ? com.tencent.mm.R.color.f478553an : i17 : i17;
    }

    public final void i() {
        boolean z17 = this.f86482r;
        int i17 = com.tencent.mm.R.raw.app_brand_half_screen_capsule_bar_close_light;
        int i18 = com.tencent.mm.R.drawable.bdb;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f86475h;
        if (z17) {
            if (this.closeBtnType == mi1.u1.f326699e) {
                weImageView.setImageResource(com.tencent.mm.R.raw.app_brand_half_screen_capsule_bar_close_light);
                weImageView.setIconColor(0);
                j(ym5.x.a(getContext(), 32.0f), ym5.x.a(getContext(), 32.0f));
                return;
            } else {
                j(getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz), getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz));
                weImageView.setIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_0));
                weImageView.setImageResource(com.tencent.mm.R.drawable.bdb);
                return;
            }
        }
        if (this.closeBtnType == mi1.u1.f326699e) {
            if (com.tencent.mm.ui.bk.C()) {
                i17 = com.tencent.mm.R.raw.app_brand_half_screen_capsule_bar_close_dark;
            }
            weImageView.setImageResource(i17);
            weImageView.setIconColor(0);
            j(ym5.x.a(getContext(), 32.0f), ym5.x.a(getContext(), 32.0f));
            return;
        }
        weImageView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz), getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz)));
        if (com.tencent.mm.ui.bk.C()) {
            i18 = com.tencent.mm.R.drawable.bda;
        }
        weImageView.setImageResource(i18);
        j(getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz), getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz));
    }

    public final void j(int i17, int i18) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f86475h;
        android.view.ViewGroup.LayoutParams layoutParams = weImageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i17;
            layoutParams.width = i18;
        }
        weImageView.requestLayout();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar
    public void setCloseBtnListener(android.view.View.OnClickListener onClickListener) {
        this.f86475h.setOnClickListener(onClickListener);
    }

    public final void setCloseBtnType(mi1.u1 value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.closeBtnType = value;
        i();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar
    public void setDesc(java.lang.String desc) {
        kotlin.jvm.internal.o.g(desc, "desc");
        android.widget.TextView textView = this.f86479o;
        textView.setVisibility(0);
        textView.setText(desc);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar
    public void setShareBtnListener(android.view.View.OnClickListener onClickListener) {
        this.f86476i.setOnClickListener(onClickListener);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar
    public void setTitle(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        this.f86477m.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandSingleCloseCapsuleBar(android.content.Context context, boolean z17) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.TAG = "MicroMsg.AppBrandSingleCloseCapsuleBar";
        android.view.View findViewById = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f488138i7, this).findViewById(com.tencent.mm.R.id.m7j);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f86474g = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.bys);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f86475h = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.mse);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById3;
        this.f86476i = weImageView;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.k3f);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById4;
        this.f86477m = textView;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.h5n);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById5;
        this.f86478n = imageView;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.f484050cu2);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById6;
        this.f86479o = textView2;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.oca);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f86480p = (android.widget.LinearLayout) findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.b3v);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById8;
        this.f86481q = linearLayout;
        this.closeBtnType = mi1.u1.f326698d;
        this.f86484t = kz5.c0.i(weImageView, textView, imageView, textView2);
        linearLayout.setLayoutTransition(new android.animation.LayoutTransition());
        this.f86482r = z17;
        findViewById.setBackgroundColor(getContext().getResources().getColor(h(com.tencent.mm.R.color.a9e)));
        textView.setTextColor(getContext().getResources().getColor(h(com.tencent.mm.R.color.f478714f5)));
        i();
        weImageView.setImageResource(com.tencent.mm.R.raw.app_brand_half_screenc_capsule_bar_share);
        if (z17) {
            weImageView.setIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_0));
        } else {
            weImageView.setIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478712f3));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandSingleCloseCapsuleBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        kotlin.jvm.internal.o.g(context, "context");
        this.TAG = "MicroMsg.AppBrandSingleCloseCapsuleBar";
        android.view.View findViewById = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f488138i7, this).findViewById(com.tencent.mm.R.id.m7j);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f86474g = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.bys);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f86475h = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.mse);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById3;
        this.f86476i = weImageView;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.k3f);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById4;
        this.f86477m = textView;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.h5n);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById5;
        this.f86478n = imageView;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.f484050cu2);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById6;
        this.f86479o = textView2;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.oca);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f86480p = (android.widget.LinearLayout) findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.b3v);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById8;
        this.f86481q = linearLayout;
        this.closeBtnType = mi1.u1.f326698d;
        this.f86484t = kz5.c0.i(weImageView, textView, imageView, textView2);
        linearLayout.setLayoutTransition(new android.animation.LayoutTransition());
    }
}
