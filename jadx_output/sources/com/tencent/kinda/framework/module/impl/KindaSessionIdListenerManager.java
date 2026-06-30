package com.tencent.kinda.framework.module.impl;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/tencent/kinda/framework/module/impl/KindaSessionIdListenerManager;", "", "()V", "Companion", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class KindaSessionIdListenerManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.kinda.framework.module.impl.KindaSessionIdListenerManager.Companion INSTANCE = new com.tencent.kinda.framework.module.impl.KindaSessionIdListenerManager.Companion(null);
    private static final java.util.Map<java.lang.String, com.tencent.kinda.framework.module.impl.KindaSessionIdListenerImpl> listenerMap = new java.util.LinkedHashMap();

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0004R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/tencent/kinda/framework/module/impl/KindaSessionIdListenerManager$Companion;", "", "Ljz5/f0;", "cleanup", "", "uuid", "Lh45/n;", "callback", "startListen", "stopListen", com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "notifySessionId", "", "Lcom/tencent/kinda/framework/module/impl/KindaSessionIdListenerImpl;", "listenerMap", "Ljava/util/Map;", "<init>", "()V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final void cleanup() {
            com.tencent.kinda.framework.module.impl.KindaSessionIdListenerManager.listenerMap.clear();
        }

        public final void notifySessionId(java.lang.String str) {
            if (str == null) {
                str = "";
            }
            com.tencent.mars.xlog.Log.i("KindaSessionIdListenerImpl", "notifySessionId to " + com.tencent.kinda.framework.module.impl.KindaSessionIdListenerManager.listenerMap.size() + " listeners, id=" + str);
            java.util.Iterator it = com.tencent.kinda.framework.module.impl.KindaSessionIdListenerManager.listenerMap.values().iterator();
            while (it.hasNext()) {
                h45.n callback = ((com.tencent.kinda.framework.module.impl.KindaSessionIdListenerImpl) it.next()).getCallback();
                if (callback != null) {
                    callback.onSessionId(str);
                }
            }
        }

        public final void startListen(java.lang.String str, h45.n nVar) {
            if (str == null || nVar == null) {
                com.tencent.mars.xlog.Log.i("KindaSessionIdListenerImpl", "startListen uuid or callback is null");
                return;
            }
            com.tencent.mars.xlog.Log.i("KindaSessionIdListenerImpl", "startListen uuid: ".concat(str));
            stopListen(str);
            com.tencent.kinda.gen.KindaGlobalReporter createReporter = com.tencent.kinda.gen.KindaGlobalReporter.createReporter();
            if (createReporter == null) {
                com.tencent.mars.xlog.Log.e("KindaSessionIdListenerImpl", "reporter is null");
                return;
            }
            com.tencent.kinda.framework.module.impl.KindaSessionIdListenerImpl kindaSessionIdListenerImpl = new com.tencent.kinda.framework.module.impl.KindaSessionIdListenerImpl();
            kindaSessionIdListenerImpl.setCallback(nVar);
            com.tencent.kinda.framework.module.impl.KindaSessionIdListenerManager.listenerMap.put(str, kindaSessionIdListenerImpl);
            createReporter.listenSessionId(kindaSessionIdListenerImpl);
            com.tencent.mars.xlog.Log.i("KindaSessionIdListenerImpl", "Started listening for uuid: ".concat(str));
        }

        public final void stopListen(java.lang.String str) {
            if (str == null) {
                com.tencent.mars.xlog.Log.i("KindaSessionIdListenerImpl", "stopListen uuid is null");
                return;
            }
            com.tencent.mars.xlog.Log.i("KindaSessionIdListenerImpl", "stopListen uuid: ".concat(str));
            com.tencent.kinda.gen.KindaGlobalReporter createReporter = com.tencent.kinda.gen.KindaGlobalReporter.createReporter();
            if (createReporter == null) {
                com.tencent.mars.xlog.Log.e("KindaSessionIdListenerImpl", "reporter is null");
                return;
            }
            com.tencent.kinda.framework.module.impl.KindaSessionIdListenerImpl kindaSessionIdListenerImpl = (com.tencent.kinda.framework.module.impl.KindaSessionIdListenerImpl) com.tencent.kinda.framework.module.impl.KindaSessionIdListenerManager.listenerMap.remove(str);
            if (kindaSessionIdListenerImpl == null) {
                com.tencent.mars.xlog.Log.i("KindaSessionIdListenerImpl", "No listener found for uuid: ".concat(str));
            } else {
                createReporter.unlistenSessionId(kindaSessionIdListenerImpl);
                com.tencent.mars.xlog.Log.i("KindaSessionIdListenerImpl", "Stopped listening for uuid: ".concat(str));
            }
        }
    }
}
