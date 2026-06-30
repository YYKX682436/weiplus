package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class h implements com.tencent.mm.plugin.appbrand.jsapi.media.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.media.w1 f81827a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.media.w1 f81828b;

    public h(com.tencent.mm.plugin.appbrand.jsapi.media.w1 left, com.tencent.mm.plugin.appbrand.jsapi.media.w1 right) {
        kotlin.jvm.internal.o.g(left, "left");
        kotlin.jvm.internal.o.g(right, "right");
        this.f81827a = left;
        this.f81828b = right;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.w1
    public boolean a(com.tencent.mm.plugin.appbrand.jsapi.l lVar, com.tencent.mm.plugin.appbrand.w0 appPauseType) {
        kotlin.jvm.internal.o.g(appPauseType, "appPauseType");
        return this.f81827a.a(lVar, appPauseType) && this.f81828b.a(lVar, appPauseType);
    }

    public java.lang.String toString() {
        return "AutoPauseCombinedStrategy(left=" + this.f81827a + ", right=" + this.f81828b + ')';
    }
}
