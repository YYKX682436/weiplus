package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class j implements com.tencent.mm.plugin.appbrand.jsapi.media.w1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.media.j f81856a = new com.tencent.mm.plugin.appbrand.jsapi.media.j();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.w1
    public boolean a(com.tencent.mm.plugin.appbrand.jsapi.l lVar, com.tencent.mm.plugin.appbrand.w0 appPauseType) {
        kotlin.jvm.internal.o.g(appPauseType, "appPauseType");
        return com.tencent.mm.plugin.appbrand.w0.HIDE != appPauseType;
    }

    public java.lang.String toString() {
        return "AutoPauseIfNotNavigateStrategy";
    }
}
