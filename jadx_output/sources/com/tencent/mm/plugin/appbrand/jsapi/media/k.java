package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class k implements com.tencent.mm.plugin.appbrand.jsapi.media.w1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.media.k f81887a = new com.tencent.mm.plugin.appbrand.jsapi.media.k();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.w1
    public boolean a(com.tencent.mm.plugin.appbrand.jsapi.l lVar, com.tencent.mm.plugin.appbrand.w0 appPauseType) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37;
        u81.h hVar;
        kotlin.jvm.internal.o.g(appPauseType, "appPauseType");
        if (com.tencent.mm.plugin.appbrand.w0.HIDE != appPauseType) {
            return true;
        }
        u81.b bVar = u81.b.FOREGROUND;
        u81.b bVar2 = null;
        com.tencent.mm.plugin.appbrand.y yVar = lVar instanceof com.tencent.mm.plugin.appbrand.y ? (com.tencent.mm.plugin.appbrand.y) lVar : null;
        if (yVar != null && (t37 = yVar.t3()) != null && (hVar = t37.N) != null) {
            bVar2 = hVar.b();
        }
        return bVar != bVar2;
    }

    public java.lang.String toString() {
        return "AutoPauseIfNotNavigateStrategyLU";
    }
}
