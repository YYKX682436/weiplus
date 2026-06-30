package com.p314xaae8f345.p2936x80def495.p2937x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\b\u0010\u000e\u001a\u00020\rH&¨\u0006\u0011"}, d2 = {"Lcom/tencent/skyline/jsapi/BaseJsApiForSkyline;", "Lcom/tencent/skyline/jsapi/SkylineJsApiExecutor;", "EXECUTOR", "", "env", "Lorg/json/JSONObject;", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "", "callbackId", "Ljz5/f0;", "dispatchToDart", "(Lcom/tencent/skyline/jsapi/SkylineJsApiExecutor;Lorg/json/JSONObject;I)V", "invoke", "", "getName", "<init>", "()V", "skyline_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.skyline.jsapi.BaseJsApiForSkyline */
/* loaded from: classes13.dex */
public abstract class AbstractC25607x6706574c<EXECUTOR extends com.p314xaae8f345.p2936x80def495.p2937x60b7c31.AbstractC25611xa07b098f> {
    /* renamed from: dispatchToDart */
    public final void m95968xa54229b4(EXECUTOR env, org.json.JSONObject data, int callbackId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        env.mo95974x9d9dc6b5(mo95969xfb82e301(), data, callbackId);
    }

    /* renamed from: getName */
    public abstract java.lang.String mo95969xfb82e301();

    /* renamed from: invoke */
    public void m95970xb9724478(EXECUTOR env, org.json.JSONObject data, int callbackId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        m95968xa54229b4(env, data, callbackId);
    }
}
