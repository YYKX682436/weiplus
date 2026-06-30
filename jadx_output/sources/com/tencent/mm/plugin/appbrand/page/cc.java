package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class cc {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Runnable f86499a = new com.tencent.mm.plugin.appbrand.page.ac(this);

    /* renamed from: b, reason: collision with root package name */
    public android.view.ViewTreeObserver.OnGlobalLayoutListener f86500b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.dc f86501c;

    public cc(com.tencent.mm.plugin.appbrand.page.dc dcVar, com.tencent.mm.plugin.appbrand.page.vb vbVar) {
        this.f86501c = dcVar;
    }

    public final void a() {
        android.view.View contentView = this.f86501c.f86539a.getContentView();
        if (contentView != null) {
            contentView.removeCallbacks(this.f86499a);
            if (this.f86500b != null) {
                contentView.getViewTreeObserver().removeOnGlobalLayoutListener(this.f86500b);
            }
        }
    }
}
