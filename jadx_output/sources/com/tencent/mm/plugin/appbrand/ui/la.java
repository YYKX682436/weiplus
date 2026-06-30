package com.tencent.mm.plugin.appbrand.ui;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/la;", "Lcom/tencent/mm/plugin/appbrand/ui/hc;", "Lcom/tencent/mm/plugin/appbrand/ui/vc;", "Landroid/view/View;", "getView", "", "progress", "Ljz5/f0;", "setProgress", "", "can", "setCanShowHideAnimation", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class la extends com.tencent.mm.plugin.appbrand.ui.hc {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        s(true);
        B(0, !(nf.x.f336616b != null ? r0.isDarkMode() : false), true);
        setBackgroundColor(0);
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.jc
    public java.lang.String D() {
        return "AppBrandUITransparentLoadingSplash";
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.jc, com.tencent.mm.plugin.appbrand.ui.vc
    public android.view.View getView() {
        return this;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.vc
    public void j(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.vc
    public void k(int i17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.vc
    public void n(yz5.a aVar) {
        if (!kotlin.jvm.internal.o.b(android.os.Looper.getMainLooper(), android.os.Looper.myLooper())) {
            post(new com.tencent.mm.plugin.appbrand.ui.ka(this, aVar));
            return;
        }
        setVisibility(8);
        android.view.ViewParent parent = getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.hc, com.tencent.mm.plugin.appbrand.ui.jc, com.tencent.mm.plugin.appbrand.ui.vc
    public /* bridge */ /* synthetic */ void setAppServiceType(int i17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.hc, com.tencent.mm.plugin.appbrand.ui.jc, com.tencent.mm.plugin.appbrand.ui.vc
    public void setCanShowHideAnimation(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.hc, com.tencent.mm.plugin.appbrand.ui.jc, com.tencent.mm.plugin.appbrand.ui.vc
    public void setProgress(int i17) {
    }
}
