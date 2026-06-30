package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni f47398a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.appbrand.commonjni.buffer.BufferURLManager f47399b;

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            com.tencent.luggage.sdk.jsapi.component.service.c cVar = new com.tencent.luggage.sdk.jsapi.component.service.c();
            bl.d.f21674a = cVar;
            bl.h.f21675a = new com.tencent.luggage.sdk.jsapi.component.service.d();
            cVar.loadLibrary("wxa-runtime-binding");
        }

        private a() {
        }

        public static void a() {
        }
    }

    public e(bl.a aVar) {
        a();
        this.f47398a = new com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni(aVar);
        this.f47399b = new com.tencent.mm.appbrand.commonjni.buffer.BufferURLManager();
    }

    public static void a() {
        com.tencent.luggage.sdk.jsapi.component.service.e.a.a();
    }
}
