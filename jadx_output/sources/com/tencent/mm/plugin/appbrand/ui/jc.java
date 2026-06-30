package com.tencent.mm.plugin.appbrand.ui;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/jc;", "Lvj5/h;", "Lcom/tencent/mm/plugin/appbrand/ui/vc;", "Landroid/view/View;", "getView", "", "w", "Ljz5/g;", "get_instanceDescription", "()Ljava/lang/String;", "_instanceDescription", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "luggage-wxa-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public abstract class jc extends vj5.h implements com.tencent.mm.plugin.appbrand.ui.vc {

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final jz5.g _instanceDescription;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        s(true);
        this._instanceDescription = jz5.h.a(jz5.i.f302831f, new com.tencent.mm.plugin.appbrand.ui.ic(this));
    }

    private final void I(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Luggage.Wxa.BaseFrameLayoutLoadingSplashImpl", str + " [with instance:" + get_instanceDescription() + ']');
    }

    private final java.lang.String get_instanceDescription() {
        return (java.lang.String) this._instanceDescription.getValue();
    }

    public abstract java.lang.String D();

    public android.view.View getView() {
        return this;
    }

    @Override // vj5.h, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        I("onAttachedToWindow");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        I("onDetachedFromWindow");
    }

    @Override // android.view.View
    public boolean post(java.lang.Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.x0.b(this)) {
            return super.post(runnable);
        }
        com.tencent.mm.sdk.platformtools.u3.h(runnable);
        return true;
    }

    @Override // android.view.View
    public boolean postDelayed(java.lang.Runnable runnable, long j17) {
        if (runnable == null) {
            return false;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.x0.b(this)) {
            return super.postDelayed(runnable, j17);
        }
        com.tencent.mm.sdk.platformtools.u3.i(runnable, j17);
        return true;
    }

    @Override // android.view.View
    public void postOnAnimation(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.x0.b(this)) {
            super.postOnAnimation(runnable);
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(runnable);
        }
    }

    @Override // android.view.View
    public void postOnAnimationDelayed(java.lang.Runnable runnable, long j17) {
        if (runnable == null) {
            return;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.x0.b(this)) {
            super.postOnAnimationDelayed(runnable, j17);
        } else {
            com.tencent.mm.sdk.platformtools.u3.i(runnable, j17);
        }
    }

    public /* bridge */ /* synthetic */ void setAppServiceType(int i17) {
    }

    public /* bridge */ /* synthetic */ void setCanShowHideAnimation(boolean z17) {
    }

    public abstract /* synthetic */ void setProgress(int i17);
}
