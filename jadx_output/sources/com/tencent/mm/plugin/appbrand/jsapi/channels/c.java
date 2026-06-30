package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public final class c implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.channels.e f80229a;

    public c(com.tencent.mm.plugin.appbrand.jsapi.channels.e eVar) {
        this.f80229a = eVar;
    }

    @Override // zy2.i5
    public final void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.jsapi.channels.b bVar = com.tencent.mm.plugin.appbrand.jsapi.channels.EnterFinderResult.CREATOR;
        kotlin.jvm.internal.o.d(obj);
        bVar.getClass();
        com.tencent.mm.protobuf.f fVar = obj instanceof com.tencent.mm.protobuf.f ? (com.tencent.mm.protobuf.f) obj : null;
        java.lang.Object json = fVar != null ? fVar.toJSON() : null;
        this.f80229a.finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.channels.EnterFinderResult(0, json instanceof org.json.JSONObject ? (org.json.JSONObject) json : null));
    }
}
