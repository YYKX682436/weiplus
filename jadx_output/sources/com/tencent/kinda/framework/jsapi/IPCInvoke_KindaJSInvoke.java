package com.tencent.kinda.framework.jsapi;

/* loaded from: classes16.dex */
public class IPCInvoke_KindaJSInvoke implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(android.os.Bundle bundle, final com.tencent.mm.ipcinvoker.r rVar) {
        final com.tencent.mm.autogen.events.KindaJSInvokeEvent kindaJSInvokeEvent = new com.tencent.mm.autogen.events.KindaJSInvokeEvent();
        java.lang.String string = bundle.getString("jsapiName", "");
        am.gi giVar = kindaJSInvokeEvent.f54457g;
        giVar.f6766c = string;
        giVar.f6764a = bundle.getInt("jsapi_type", 0);
        giVar.f6765b = bundle;
        giVar.f6767d = new java.lang.Runnable() { // from class: com.tencent.kinda.framework.jsapi.IPCInvoke_KindaJSInvoke.1
            @Override // java.lang.Runnable
            public void run() {
                rVar.a(kindaJSInvokeEvent.f54458h.f6835a);
            }
        };
        kindaJSInvokeEvent.e();
    }
}
