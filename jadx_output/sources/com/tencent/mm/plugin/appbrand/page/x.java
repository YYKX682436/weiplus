package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class x extends com.tencent.mm.plugin.appbrand.page.w9 {

    /* renamed from: J, reason: collision with root package name */
    public final qi1.d f87239J;
    public boolean K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        qi1.d dVar = new qi1.d(new android.content.MutableContextWrapper(context));
        this.f87239J = dVar;
        qi1.a aVar = qi1.a.f363479d;
        if (T()) {
            dVar.setEnableFixSize(false);
            dVar.setFixedSizeMode(aVar);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void N(int i17, int i18) {
        if (T()) {
            try {
                setWebContentsSize(i17, i18);
            } finally {
                this.B = true;
            }
        }
        if (this.K) {
            java.lang.String msg = "setAppBrandWebViewContentsSize width:" + i17 + " height:" + i18;
            kotlin.jvm.internal.o.g(msg, "msg");
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w9, com.tencent.mm.plugin.appbrand.page.fb
    public /* bridge */ /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 getPageView() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w9, com.tencent.mm.plugin.appbrand.page.fb
    public android.view.View getWrapperView() {
        android.view.View wrapperView = super.getWrapperView();
        qi1.d dVar = this.f87239J;
        if (dVar.getChildAt(0) != wrapperView) {
            dVar.removeAllViews();
            dVar.addView(wrapperView);
            dVar.setLayoutParams(new androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams(-1, -1));
        }
        return dVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w9, com.tencent.mm.plugin.appbrand.page.fb
    public void i(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (getContext() instanceof android.content.MutableContextWrapper) {
            android.content.MutableContextWrapper mutableContextWrapper = (android.content.MutableContextWrapper) getContext();
            if (mutableContextWrapper.getBaseContext() != context) {
                mutableContextWrapper.setBaseContext(context);
            }
        }
        android.content.Context context2 = this.f87239J.getContext();
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type android.content.MutableContextWrapper");
        ((android.content.MutableContextWrapper) context2).setBaseContext(context);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w9, com.tencent.mm.plugin.appbrand.page.fb
    public void setAppBrandWebViewContentsSizeLogEnabled(boolean z17) {
        this.K = z17;
    }

    public final void setContentsMaxVisibleHeightProvider(qi1.b bVar) {
        if (T()) {
            this.f87239J.setMaxVisibleScreenHeightProvider(bVar);
        }
    }

    public final void setFixSizeEnable(boolean z17) {
        qi1.a aVar = qi1.a.f363479d;
        if (T()) {
            qi1.d dVar = this.f87239J;
            dVar.setEnableFixSize(z17);
            dVar.setFixedSizeMode(aVar);
        }
    }
}
