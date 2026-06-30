package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class q0 extends com.tencent.mm.plugin.appbrand.jsruntime.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.r0 f47519b;

    public q0(com.tencent.luggage.sdk.jsapi.component.service.r0 r0Var) {
        this.f47519b = r0Var;
        com.tencent.mm.appbrand.commonjni.buffer.BufferURLManager bufferURLManager = r0Var.f47526d.f47362f.f47399b;
        com.tencent.mm.appbrand.commonjni.buffer.a aVar = new com.tencent.mm.appbrand.commonjni.buffer.a() { // from class: com.tencent.luggage.sdk.jsapi.component.service.q0$$a
            @Override // com.tencent.mm.appbrand.commonjni.buffer.a
            public final void a(java.lang.String str) {
                com.tencent.luggage.sdk.jsapi.component.service.q0.this.b(str);
            }
        };
        synchronized (bufferURLManager.f53941b) {
            bufferURLManager.f53941b.add(aVar);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.d1
    public java.nio.ByteBuffer a(java.lang.String str) {
        return this.f47519b.f47526d.f47362f.f47399b.c(str);
    }
}
