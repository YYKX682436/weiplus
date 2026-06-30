package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class t0 extends com.tencent.mm.plugin.appbrand.jsapi.o0 {
    public static final int CTRL_INDEX = 754;
    public static final java.lang.String NAME = "onCopyUrl";

    /* renamed from: i, reason: collision with root package name */
    public final boolean f83452i;

    public t0(boolean z17) {
        this.f83452i = z17;
    }

    public final void x(int i17, com.tencent.luggage.sdk.jsapi.component.service.y service) {
        kotlin.jvm.internal.o.g(service, "service");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("webviewId", java.lang.Integer.valueOf(i17));
        hashMap.put("shortLinkEnable", java.lang.Boolean.valueOf(this.f83452i));
        u(service);
        t(hashMap);
        m();
    }
}
