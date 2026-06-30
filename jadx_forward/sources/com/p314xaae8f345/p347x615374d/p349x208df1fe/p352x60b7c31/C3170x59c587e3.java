package com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31;

/* renamed from: com.tencent.kinda.framework.jsapi.IPCInvoke_KindaJSInvoke */
/* loaded from: classes16.dex */
public class C3170x59c587e3 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public void mo8834xb9724478(android.os.Bundle bundle, final com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        final com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec c5666x53d8f9ec = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec();
        java.lang.String string = bundle.getString("jsapiName", "");
        am.gi giVar = c5666x53d8f9ec.f135990g;
        giVar.f88299c = string;
        giVar.f88297a = bundle.getInt("jsapi_type", 0);
        giVar.f88298b = bundle;
        giVar.f88300d = new java.lang.Runnable() { // from class: com.tencent.kinda.framework.jsapi.IPCInvoke_KindaJSInvoke.1
            @Override // java.lang.Runnable
            public void run() {
                rVar.a(c5666x53d8f9ec.f135991h.f88368a);
            }
        };
        c5666x53d8f9ec.e();
    }
}
