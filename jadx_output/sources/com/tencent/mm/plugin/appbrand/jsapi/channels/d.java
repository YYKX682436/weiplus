package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public final class d implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.channels.e f80234a;

    public d(com.tencent.mm.plugin.appbrand.jsapi.channels.e eVar) {
        this.f80234a = eVar;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        com.tencent.mm.plugin.appbrand.jsapi.channels.b bVar = com.tencent.mm.plugin.appbrand.jsapi.channels.EnterFinderResult.CREATOR;
        kotlin.jvm.internal.o.d(num);
        int intValue = num.intValue();
        bVar.getClass();
        this.f80234a.finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.channels.EnterFinderResult(intValue, null));
    }
}
