package com.tencent.kinda.framework.kindalite;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J,\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R*\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0016\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/KindaLiteStore;", "Lcom/tencent/mm/plugin/lite/r;", "", "initStore", "", com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "Lcom/tencent/kinda/framework/kindalite/KindaLiteStoreCallback;", "callback", "Ljz5/f0;", "addStoreCallback", "", "instanceId", "actionName", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "", "callbackId", "onDispatch", "Lcom/tencent/mm/plugin/lite/s;", "store", "Lcom/tencent/mm/plugin/lite/s;", "", "Ljava/lang/ref/WeakReference;", "storeCallbacks", "Ljava/util/Map;", "<init>", "()V", "Companion", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class KindaLiteStore implements com.tencent.mm.plugin.lite.r {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.kinda.framework.kindalite.KindaLiteStore.Companion INSTANCE = new com.tencent.kinda.framework.kindalite.KindaLiteStore.Companion(null);
    private static volatile com.tencent.kinda.framework.kindalite.KindaLiteStore INSTANCE = null;
    public static final java.lang.String STORE_APP_ID = "wxalitenative35516dec8343edbd2a6b57fe2bd3d498@pay";
    private static final java.lang.String TAG = "KindaLiteStore";
    private com.tencent.mm.plugin.lite.s store;
    private java.util.Map<java.lang.String, java.lang.ref.WeakReference<com.tencent.kinda.framework.kindalite.KindaLiteStoreCallback>> storeCallbacks;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/KindaLiteStore$Companion;", "", "()V", "INSTANCE", "Lcom/tencent/kinda/framework/kindalite/KindaLiteStore;", "STORE_APP_ID", "", "TAG", "getInstance", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.kinda.framework.kindalite.KindaLiteStore getInstance() {
            com.tencent.kinda.framework.kindalite.KindaLiteStore kindaLiteStore = com.tencent.kinda.framework.kindalite.KindaLiteStore.INSTANCE;
            if (kindaLiteStore == null) {
                synchronized (this) {
                    kindaLiteStore = com.tencent.kinda.framework.kindalite.KindaLiteStore.INSTANCE;
                    if (kindaLiteStore == null) {
                        kindaLiteStore = new com.tencent.kinda.framework.kindalite.KindaLiteStore(null);
                        com.tencent.kinda.framework.kindalite.KindaLiteStore.INSTANCE = kindaLiteStore;
                    }
                }
            }
            return kindaLiteStore;
        }
    }

    private KindaLiteStore() {
    }

    public /* synthetic */ KindaLiteStore(kotlin.jvm.internal.i iVar) {
        this();
    }

    public final void addStoreCallback(java.lang.String sessionId, com.tencent.kinda.framework.kindalite.KindaLiteStoreCallback callback) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (this.storeCallbacks == null) {
            this.storeCallbacks = new java.util.WeakHashMap();
        }
        java.util.Map<java.lang.String, java.lang.ref.WeakReference<com.tencent.kinda.framework.kindalite.KindaLiteStoreCallback>> map = this.storeCallbacks;
        if (map != null) {
            map.put(sessionId, new java.lang.ref.WeakReference<>(callback));
        }
    }

    public final boolean initStore() {
        if (this.store != null) {
            return true;
        }
        com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
        this.store = sVar;
        sVar.f144167d = this;
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        com.tencent.mm.plugin.lite.s sVar2 = this.store;
        ((com.tencent.mm.feature.lite.i) g0Var).getClass();
        com.tencent.mm.plugin.lite.LiteAppCenter.addGlobalStore(STORE_APP_ID, sVar2);
        return true;
    }

    @Override // com.tencent.mm.plugin.lite.r
    public boolean onDispatch(long instanceId, java.lang.String actionName, java.lang.Object data, int callbackId) {
        org.json.JSONObject jSONObject;
        com.tencent.mars.xlog.Log.i(TAG, "onDispatch instanceId: " + instanceId + " actionName: " + actionName + " data: " + data + " callbackId: " + callbackId);
        try {
            if (data instanceof java.lang.String) {
                jSONObject = new org.json.JSONObject((java.lang.String) data);
            } else {
                if (!(data instanceof org.json.JSONObject)) {
                    com.tencent.mars.xlog.Log.i(TAG, "data invalid, require JSONObject");
                    return false;
                }
                jSONObject = (org.json.JSONObject) data;
            }
            org.json.JSONObject jSONObject2 = jSONObject;
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<com.tencent.kinda.framework.kindalite.KindaLiteStoreCallback>> map = this.storeCallbacks;
            if (map != null) {
                map.size();
            }
            java.lang.String optString = jSONObject2.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            kotlin.jvm.internal.o.d(optString);
            if (optString.length() == 0) {
                com.tencent.mars.xlog.Log.e(TAG, "sessionId not found");
                return false;
            }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<com.tencent.kinda.framework.kindalite.KindaLiteStoreCallback>> map2 = this.storeCallbacks;
            java.lang.ref.WeakReference<com.tencent.kinda.framework.kindalite.KindaLiteStoreCallback> weakReference = map2 != null ? map2.get(optString) : null;
            com.tencent.kinda.framework.kindalite.KindaLiteStoreCallback kindaLiteStoreCallback = weakReference != null ? weakReference.get() : null;
            if (kindaLiteStoreCallback != null) {
                return kindaLiteStoreCallback.onStoreDispatch(instanceId, actionName, jSONObject2, callbackId);
            }
            com.tencent.mars.xlog.Log.e(TAG, "callback not found, sessionId: ".concat(optString));
            return false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "JSON parse failed", e17);
            return false;
        }
    }
}
