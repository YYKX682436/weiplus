package com.p314xaae8f345.p2936x80def495.p2937x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002J \u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&R&\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00028\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/tencent/skyline/jsapi/SkylineJsApiExecutor;", "", "Lcom/tencent/skyline/jsapi/SkylineJsApiInvoker;", "invoker", "Ljz5/f0;", "attach", "", "jsapiName", "Lorg/json/JSONObject;", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "", "callbackId", "dispatchJsApiCall", "mInvoker", "Lcom/tencent/skyline/jsapi/SkylineJsApiInvoker;", "getMInvoker", "()Lcom/tencent/skyline/jsapi/SkylineJsApiInvoker;", "setMInvoker", "(Lcom/tencent/skyline/jsapi/SkylineJsApiInvoker;)V", "<init>", "()V", "skyline_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.skyline.jsapi.SkylineJsApiExecutor */
/* loaded from: classes13.dex */
public abstract class AbstractC25611xa07b098f {
    protected com.p314xaae8f345.p2936x80def495.p2937x60b7c31.C25612x971e32be<?> mInvoker;

    /* renamed from: attach */
    public final void m95979xac1eee45(com.p314xaae8f345.p2936x80def495.p2937x60b7c31.C25612x971e32be<?> invoker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invoker, "invoker");
        m95981x89819c4f(invoker);
    }

    /* renamed from: dispatchJsApiCall */
    public abstract void mo95974x9d9dc6b5(java.lang.String str, org.json.JSONObject jSONObject, int i17);

    /* renamed from: getMInvoker */
    public final com.p314xaae8f345.p2936x80def495.p2937x60b7c31.C25612x971e32be<?> m95980x8ec93b43() {
        com.p314xaae8f345.p2936x80def495.p2937x60b7c31.C25612x971e32be<?> c25612x971e32be = this.mInvoker;
        if (c25612x971e32be != null) {
            return c25612x971e32be;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mInvoker");
        throw null;
    }

    /* renamed from: setMInvoker */
    public final void m95981x89819c4f(com.p314xaae8f345.p2936x80def495.p2937x60b7c31.C25612x971e32be<?> c25612x971e32be) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c25612x971e32be, "<set-?>");
        this.mInvoker = c25612x971e32be;
    }
}
