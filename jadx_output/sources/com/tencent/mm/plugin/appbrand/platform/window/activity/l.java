package com.tencent.mm.plugin.appbrand.platform.window.activity;

/* loaded from: classes7.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.platform.window.activity.q f87604d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.appbrand.platform.window.activity.q qVar) {
        super(0);
        this.f87604d = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity activity = this.f87604d.f87639c;
        return activity != null ? com.tencent.mm.plugin.appbrand.platform.window.activity.w.c(activity) : (com.tencent.mm.plugin.appbrand.platform.window.activity.j) com.tencent.mm.plugin.appbrand.utils.o1.a("Luggage.WXA.ActivityWindowOrientationHandlerProxyImpl.Dummy", com.tencent.mm.plugin.appbrand.platform.window.activity.j.class);
    }
}
