package com.tencent.mm.plugin.appbrand.page.capsulebar;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bB#\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001a\u0010\u001eJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0014J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u000f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u0010\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u001a\u0010\u0015\u001a\u00020\b8\u0014X\u0094D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/page/capsulebar/AppBrandeEmbedSingleCloseCapsuleBar;", "Lcom/tencent/mm/plugin/appbrand/page/capsulebar/BaseAppBrandSingleCloseCapsuleBar;", "", "Landroid/view/View;", "getViewsNeedResponseAlphaAnimation", "Landroid/widget/ImageView;", "getWxaIcon", "getCloseButton", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "Ljz5/f0;", "setTitle", "Landroid/view/View$OnClickListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setCloseBtnListener", "setTitleClickListener", "setShareBtnListener", "f", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AppBrandeEmbedSingleCloseCapsuleBar extends com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final java.lang.String TAG;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f86486g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f86487h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f86488i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f86489m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f86490n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f86491o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f86492p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f86493q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenHeaderTipsListener f86494r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.a f86495s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f86496t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandeEmbedSingleCloseCapsuleBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.TAG = "MicroMsg.AppBrandSingleCloseCapsuleBar";
        android.view.View findViewById = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f488136i5, this).findViewById(com.tencent.mm.R.id.m7j);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f86486g = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.k3f);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f86487h = textView;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.h5n);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f86488i = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.qtq);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f86489m = findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.ocu);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f86490n = findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.qtt);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f86491o = findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.qtu);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f86492p = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.qts);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f86493q = findViewById8;
        this.f86496t = kz5.b0.c(findViewById4);
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        com.tencent.mm.ui.bk.s0(((android.widget.TextView) findViewById(com.tencent.mm.R.id.f486857mn5)).getPaint());
    }

    @Override // mi1.f2
    public void a(boolean z17) {
    }

    @Override // mi1.f2
    public boolean b() {
        java.util.List list = this.f86496t;
        return (list.isEmpty() ^ true) && ((android.view.View) list.get(0)).getAlpha() == 0.0f;
    }

    @Override // mi1.f2
    public float c() {
        java.util.List list = this.f86496t;
        if (!list.isEmpty()) {
            return ((android.view.View) list.get(0)).getAlpha();
        }
        return 255.0f;
    }

    @Override // mi1.f2
    public void d(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar
    public void f(java.lang.String str, com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenHeaderTipsListener weAppHalfScreenHeaderTipsListener, yz5.a onCloseClick) {
        kotlin.jvm.internal.o.g(onCloseClick, "onCloseClick");
        if (str == null || str.length() == 0) {
            android.view.View view = this.f86491o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/page/capsulebar/AppBrandeEmbedSingleCloseCapsuleBar", "setHeaderTips", "(Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/config/WeAppHalfScreenHeaderTipsListener;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/page/capsulebar/AppBrandeEmbedSingleCloseCapsuleBar", "setHeaderTips", "(Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/config/WeAppHalfScreenHeaderTipsListener;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f86491o;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/page/capsulebar/AppBrandeEmbedSingleCloseCapsuleBar", "setHeaderTips", "(Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/config/WeAppHalfScreenHeaderTipsListener;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/page/capsulebar/AppBrandeEmbedSingleCloseCapsuleBar", "setHeaderTips", "(Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/config/WeAppHalfScreenHeaderTipsListener;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f86492p.setText(str);
        if (weAppHalfScreenHeaderTipsListener != null) {
            weAppHalfScreenHeaderTipsListener.b();
        }
        this.f86494r = weAppHalfScreenHeaderTipsListener;
        this.f86495s = onCloseClick;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar
    public android.view.View getCloseButton() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar
    public java.lang.String getTAG() {
        return this.TAG;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar
    public java.util.List<android.view.View> getViewsNeedResponseAlphaAnimation() {
        return this.f86496t;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar
    /* renamed from: getWxaIcon, reason: from getter */
    public android.widget.ImageView getF86488i() {
        return this.f86488i;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar
    public int h(int i17) {
        return i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar
    public void setCloseBtnListener(android.view.View.OnClickListener onClickListener) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar
    public void setShareBtnListener(android.view.View.OnClickListener onClickListener) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar
    public void setTitle(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        this.f86487h.setText(str);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar
    public void setTitleClickListener(android.view.View.OnClickListener onClickListener) {
        super.setTitleClickListener(onClickListener);
        this.f86490n.setOnClickListener(onClickListener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandeEmbedSingleCloseCapsuleBar(android.content.Context context, boolean z17) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.TAG = "MicroMsg.AppBrandSingleCloseCapsuleBar";
        android.view.View findViewById = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f488136i5, this).findViewById(com.tencent.mm.R.id.m7j);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f86486g = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.k3f);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f86487h = textView;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.h5n);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f86488i = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.qtq);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f86489m = findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.ocu);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f86490n = findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.qtt);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f86491o = findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.qtu);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f86492p = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.qts);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f86493q = findViewById8;
        this.f86496t = kz5.b0.c(findViewById4);
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        com.tencent.mm.ui.bk.s0(((android.widget.TextView) findViewById(com.tencent.mm.R.id.f486857mn5)).getPaint());
        findViewById8.setOnClickListener(new mi1.d0(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandeEmbedSingleCloseCapsuleBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        kotlin.jvm.internal.o.g(context, "context");
        this.TAG = "MicroMsg.AppBrandSingleCloseCapsuleBar";
        android.view.View findViewById = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f488136i5, this).findViewById(com.tencent.mm.R.id.m7j);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f86486g = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.k3f);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f86487h = textView;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.h5n);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f86488i = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.qtq);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f86489m = findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.ocu);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f86490n = findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.qtt);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f86491o = findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.qtu);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f86492p = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.qts);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f86493q = findViewById8;
        this.f86496t = kz5.b0.c(findViewById4);
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        com.tencent.mm.ui.bk.s0(((android.widget.TextView) findViewById(com.tencent.mm.R.id.f486857mn5)).getPaint());
    }
}
