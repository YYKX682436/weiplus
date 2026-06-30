package com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J,\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R*\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0016\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/KindaLiteStore;", "Lcom/tencent/mm/plugin/lite/r;", "", "initStore", "", com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "Lcom/tencent/kinda/framework/kindalite/KindaLiteStoreCallback;", "callback", "Ljz5/f0;", "addStoreCallback", "", "instanceId", "actionName", "", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "", "callbackId", "onDispatch", "Lcom/tencent/mm/plugin/lite/s;", "store", "Lcom/tencent/mm/plugin/lite/s;", "", "Ljava/lang/ref/WeakReference;", "storeCallbacks", "Ljava/util/Map;", "<init>", "()V", "Companion", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.kinda.framework.kindalite.KindaLiteStore */
/* loaded from: classes15.dex */
public final class C3207x50573026 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3207x50573026.Companion INSTANCE = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3207x50573026.Companion(null);

    /* renamed from: INSTANCE */
    private static volatile com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3207x50573026 f12343x4fbc8495 = null;

    /* renamed from: STORE_APP_ID */
    public static final java.lang.String f12344x4ed1f557 = "wxalitenative35516dec8343edbd2a6b57fe2bd3d498@pay";
    private static final java.lang.String TAG = "KindaLiteStore";
    private com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s store;
    private java.util.Map<java.lang.String, java.lang.ref.WeakReference<com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.InterfaceC3208xd9e62e8b>> storeCallbacks;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/KindaLiteStore$Companion;", "", "()V", "INSTANCE", "Lcom/tencent/kinda/framework/kindalite/KindaLiteStore;", "STORE_APP_ID", "", "TAG", "getInstance", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.kinda.framework.kindalite.KindaLiteStore$Companion, reason: from kotlin metadata */
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: getInstance */
        public final com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3207x50573026 m25752x9cf0d20b() {
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3207x50573026 c3207x50573026 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3207x50573026.f12343x4fbc8495;
            if (c3207x50573026 == null) {
                synchronized (this) {
                    c3207x50573026 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3207x50573026.f12343x4fbc8495;
                    if (c3207x50573026 == null) {
                        c3207x50573026 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3207x50573026(null);
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3207x50573026.f12343x4fbc8495 = c3207x50573026;
                    }
                }
            }
            return c3207x50573026;
        }
    }

    private C3207x50573026() {
    }

    public /* synthetic */ C3207x50573026(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this();
    }

    /* renamed from: addStoreCallback */
    public final void m25750x6e0b9125(java.lang.String sessionId, com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.InterfaceC3208xd9e62e8b callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (this.storeCallbacks == null) {
            this.storeCallbacks = new java.util.WeakHashMap();
        }
        java.util.Map<java.lang.String, java.lang.ref.WeakReference<com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.InterfaceC3208xd9e62e8b>> map = this.storeCallbacks;
        if (map != null) {
            map.put(sessionId, new java.lang.ref.WeakReference<>(callback));
        }
    }

    /* renamed from: initStore */
    public final boolean m25751xeffb4db1() {
        if (this.store != null) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
        this.store = sVar;
        sVar.f225700d = this;
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar2 = this.store;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65247xf235039d(f12344x4ed1f557, sVar2);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r
    /* renamed from: onDispatch */
    public boolean mo9541xb6136779(long instanceId, java.lang.String actionName, java.lang.Object data, int callbackId) {
        org.json.JSONObject jSONObject;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onDispatch instanceId: " + instanceId + " actionName: " + actionName + " data: " + data + " callbackId: " + callbackId);
        try {
            if (data instanceof java.lang.String) {
                jSONObject = new org.json.JSONObject((java.lang.String) data);
            } else {
                if (!(data instanceof org.json.JSONObject)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "data invalid, require JSONObject");
                    return false;
                }
                jSONObject = (org.json.JSONObject) data;
            }
            org.json.JSONObject jSONObject2 = jSONObject;
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.InterfaceC3208xd9e62e8b>> map = this.storeCallbacks;
            if (map != null) {
                map.size();
            }
            java.lang.String optString = jSONObject2.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            if (optString.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "sessionId not found");
                return false;
            }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.InterfaceC3208xd9e62e8b>> map2 = this.storeCallbacks;
            java.lang.ref.WeakReference<com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.InterfaceC3208xd9e62e8b> weakReference = map2 != null ? map2.get(optString) : null;
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.InterfaceC3208xd9e62e8b interfaceC3208xd9e62e8b = weakReference != null ? weakReference.get() : null;
            if (interfaceC3208xd9e62e8b != null) {
                return interfaceC3208xd9e62e8b.mo25753xc01b14dc(instanceId, actionName, jSONObject2, callbackId);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "callback not found, sessionId: ".concat(optString));
            return false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "JSON parse failed", e17);
            return false;
        }
    }
}
