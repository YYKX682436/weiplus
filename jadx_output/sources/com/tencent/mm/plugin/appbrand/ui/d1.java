package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes5.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f89655d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(java.lang.ref.WeakReference weakReference) {
        super(1);
        this.f89655d = weakReference;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kj1.g0 it = (kj1.g0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.appbrand.ui.AppBrandCheckWxaShortLinkUI appBrandCheckWxaShortLinkUI = (com.tencent.mm.plugin.appbrand.ui.AppBrandCheckWxaShortLinkUI) this.f89655d.get();
        if (appBrandCheckWxaShortLinkUI != null) {
            appBrandCheckWxaShortLinkUI.finish();
        }
        return jz5.f0.f302826a;
    }
}
