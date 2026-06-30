package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1802xadb2a389.p1803x48fb3bf9;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/bridge/webview/LiteAppTingAudioStateApi;", "Lq93/a;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.lite.jsapi.bridge.webview.LiteAppTingAudioStateApi */
/* loaded from: classes.dex */
public final class C16199x7a4c133e extends q93.a {

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.HashSet f225010m = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public long f225011g;

    /* renamed from: h, reason: collision with root package name */
    public final rk4.o5 f225012h = new q93.i(this);

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f225013i;

    public C16199x7a4c133e() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f225013i = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3>(a0Var) { // from class: com.tencent.mm.plugin.lite.jsapi.bridge.webview.LiteAppTingAudioStateApi$liteAppCloseWindowEvent$1
            {
                this.f39173x3fe91575 = 1907495603;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 event = c5675xda3892c3;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.ri riVar = event.f136001g;
                if (riVar.f89350a != 3) {
                    return false;
                }
                java.lang.String str = riVar.f89352c;
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1802xadb2a389.p1803x48fb3bf9.C16199x7a4c133e c16199x7a4c133e = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1802xadb2a389.p1803x48fb3bf9.C16199x7a4c133e.this;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, c16199x7a4c133e.f224975e.f380558b)) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppSetTingAudioStateApi", "unregisterPlayerEventListener appId %s, %d", riVar.f89352c, java.lang.Long.valueOf(c16199x7a4c133e.f225011g));
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1802xadb2a389.p1803x48fb3bf9.C16199x7a4c133e.f225010m.remove(java.lang.Long.valueOf(c16199x7a4c133e.f225011g));
                ((ef0.j3) ((qk.u8) i95.n0.c(qk.u8.class))).Ai(c16199x7a4c133e.f225012h);
                mo48814x2efc64();
                return false;
            }
        };
    }

    @Override // q93.a, jd.b
    public void a(java.lang.String appId, org.json.JSONObject data, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.a(appId, data, z17);
        long j17 = this.f224975e.f380557a;
        this.f225011g = j17;
        java.util.HashSet hashSet = f225010m;
        if (hashSet.contains(java.lang.Long.valueOf(j17))) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppSetTingAudioStateApi", "registerPlayerEventListener %d", java.lang.Long.valueOf(this.f225011g));
        hashSet.add(java.lang.Long.valueOf(this.f225011g));
        this.f225013i.mo48813x58998cd();
        ((ef0.j3) ((qk.u8) i95.n0.c(qk.u8.class))).wi(this.f225012h);
    }
}
