package com.tencent.mm.flutter.base;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/flutter/base/MMFoundationLib;", "", "<init>", "()V", "Companion", "pi0/o1", "mm_foundation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class MMFoundationLib {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.mm.flutter.base.MMFoundationLib.Companion INSTANCE = new com.tencent.mm.flutter.base.MMFoundationLib.Companion(null);
    private static pi0.o1 exceptionReporter;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/flutter/base/MMFoundationLib$Companion;", "", "", "info", "Ljz5/f0;", "reportException", "mm_foundation_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes11.dex */
    public static final class Companion {
        public Companion(kotlin.jvm.internal.i iVar) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void reportException(java.lang.String str) {
            if (com.tencent.mm.flutter.base.MMFoundationLib.exceptionReporter != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FlutterEngineService", "reportException " + str);
                c61.bb bbVar = c61.db.f38943g;
                if (str == null) {
                    return;
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                boolean optBoolean = jSONObject.optBoolean("killSelf");
                java.lang.String optString = jSONObject.optString("error");
                java.lang.String optString2 = jSONObject.optString("stackTrace");
                java.lang.String optString3 = jSONObject.optString("pageName");
                java.lang.String optString4 = jSONObject.optString("widgetInformation");
                java.lang.String optString5 = jSONObject.optString("lastBuildWidget");
                java.lang.String optString6 = jSONObject.optString("lastSetStateStack");
                if (optBoolean) {
                    bbVar.b(optBoolean, optString, optString2, optString3, 0L, optString4, optString5, optString6);
                } else {
                    bbVar.c(optBoolean, optString, optString2, optString3, 0L, optString4, optString5, optString6);
                }
                if (optBoolean) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FlutterFoundationCrashPlugin", "FlutterCrashContent: " + optString + ", stack:" + optString2);
                    com.tencent.mars.xlog.Log.appenderFlushSync();
                    com.tencent.mars.xlog.Log.appenderClose();
                    throw new c61.ya(optString);
                }
            }
        }
    }

    private static final void reportException(java.lang.String str) {
        INSTANCE.reportException(str);
    }
}
