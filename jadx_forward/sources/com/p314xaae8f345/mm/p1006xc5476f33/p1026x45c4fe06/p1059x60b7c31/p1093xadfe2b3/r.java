package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3;

/* loaded from: classes8.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f163086a;

    /* renamed from: b, reason: collision with root package name */
    public ft.p4 f163087b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f163088c;

    public r() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f163088c = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.jsapi.liteapp.JsApiOpenLiteApp$CheckLiteAppTask$LiteAppLifeCycleListener$1
            {
                this.f39173x3fe91575 = 1907495603;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3) {
                if (c5675xda3892c3.f136001g.f89350a != 3) {
                    return false;
                }
                mo48814x2efc64();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.r rVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.r.this;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenLiteApp", "remove app data callback. waAppId: %s", rVar.f163086a);
                ((xc1.t) ((ft.q4) i95.n0.c(ft.q4.class))).Bi(rVar.f163086a, rVar.f163087b);
                return false;
            }
        };
    }
}
