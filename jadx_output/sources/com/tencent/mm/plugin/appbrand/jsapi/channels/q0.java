package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public final class q0 implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.channels.r0 f80264a;

    public q0(com.tencent.mm.plugin.appbrand.jsapi.channels.r0 r0Var) {
        this.f80264a = r0Var;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        kotlin.jvm.internal.o.d(num);
        this.f80264a.finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsLiveCollectionResult(num.intValue()));
    }
}
