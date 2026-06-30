package com.p314xaae8f345.p2936x80def495.p2937x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001a\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\n\u0012\u0002\b\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002J \u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/tencent/skyline/jsapi/JsApiMethodChannelExecutor;", "Lcom/tencent/skyline/jsapi/SkylineJsApiExecutor;", "Lorg/json/JSONObject;", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "", "callbackId", "Ljz5/f0;", "addDartJsApiInvokeData", "src", "", "", "json2HashMap", "jsapiName", "dispatchJsApiCall", "Lio/flutter/plugin/common/MethodChannel;", "mJsApiMethodChannel", "Lio/flutter/plugin/common/MethodChannel;", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "<init>", "(Lio/flutter/plugin/common/BinaryMessenger;)V", "Companion", "skyline_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.skyline.jsapi.JsApiMethodChannelExecutor */
/* loaded from: classes13.dex */
public final class C25608x33aadc64 extends com.p314xaae8f345.p2936x80def495.p2937x60b7c31.AbstractC25611xa07b098f {

    /* renamed from: SKYLINE_JSAPI_KEY_CALLBACK_ID */
    private static final java.lang.String f46942xd47e38dd = "skyline_invoke_callback_id";

    /* renamed from: SKYLINE_JSAPI_NAME */
    private static final java.lang.String f46943xf74ef403 = "skyline/jsapi_method_channel";
    private static final java.lang.String TAG = "Skyline.MethodChannelExecutor";
    private io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 mJsApiMethodChannel;

    public C25608x33aadc64(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 binaryMessenger) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binaryMessenger, "binaryMessenger");
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(binaryMessenger, f46943xf74ef403, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28684x5180d5ad.f71608x4fbc8495);
        c28688xe8dbe4c2.m138441xdf757329(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler() { // from class: com.tencent.skyline.jsapi.JsApiMethodChannelExecutor$1$1
            @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
            /* renamed from: onMethodCall */
            public final void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff call, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(call.f71610xbfc5d0e1, "Skyline.JsApi.Callback")) {
                    result.mo65719xbc9fa82f();
                    return;
                }
                try {
                    java.lang.Object obj = call.f71609x86ac7956;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                    int i17 = jSONObject.getInt("skyline_invoke_callback_id");
                    java.lang.String string = jSONObject.getString("skyline_invoke_callback_reason");
                    org.json.JSONObject optJSONObject = jSONObject.optJSONObject("skyline_invoke_callback_data");
                    com.p314xaae8f345.p2936x80def495.p2937x60b7c31.C25612x971e32be<?> m95980x8ec93b43 = com.p314xaae8f345.p2936x80def495.p2937x60b7c31.C25608x33aadc64.this.m95980x8ec93b43();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                    m95980x8ec93b43.m95983x9ad64344(i17, string, optJSONObject);
                    result.mo65720x90b54003(null);
                } catch (org.json.JSONException e17) {
                    result.mo65718x5c4d208("error", e17.getMessage(), null);
                }
            }
        });
        this.mJsApiMethodChannel = c28688xe8dbe4c2;
    }

    /* renamed from: addDartJsApiInvokeData */
    private final void m95972xf8ff8753(org.json.JSONObject jSONObject, int i17) {
        jSONObject.put(f46942xd47e38dd, i17);
    }

    /* renamed from: json2HashMap */
    private final java.util.Map<java.lang.String, ?> m95973x8a5109c4(org.json.JSONObject src) {
        java.util.Iterator<java.lang.String> keys = src.keys();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
        java.util.HashMap hashMap = new java.util.HashMap();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            java.lang.String string = src.getString(next);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            hashMap.put(next, string);
        }
        return hashMap;
    }

    @Override // com.p314xaae8f345.p2936x80def495.p2937x60b7c31.AbstractC25611xa07b098f
    /* renamed from: dispatchJsApiCall */
    public void mo95974x9d9dc6b5(java.lang.String jsapiName, org.json.JSONObject data, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsapiName, "jsapiName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        m95972xf8ff8753(data, i17);
        this.mJsApiMethodChannel.m138438xd8c5c779(jsapiName, m95973x8a5109c4(data));
    }
}
