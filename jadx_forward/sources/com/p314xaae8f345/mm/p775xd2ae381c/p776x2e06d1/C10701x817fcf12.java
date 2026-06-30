package com.p314xaae8f345.mm.p775xd2ae381c.p776x2e06d1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/flutter/base/MMFoundationLib;", "", "<init>", "()V", "Companion", "pi0/o1", "mm_foundation_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.flutter.base.MMFoundationLib */
/* loaded from: classes11.dex */
public final class C10701x817fcf12 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.mm.p775xd2ae381c.p776x2e06d1.C10701x817fcf12.Companion INSTANCE = new com.p314xaae8f345.mm.p775xd2ae381c.p776x2e06d1.C10701x817fcf12.Companion(null);

    /* renamed from: exceptionReporter */
    private static pi0.o1 f28942xdf045a50;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/flutter/base/MMFoundationLib$Companion;", "", "", "info", "Ljz5/f0;", "reportException", "mm_foundation_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.flutter.base.MMFoundationLib$Companion, reason: from kotlin metadata */
    /* loaded from: classes11.dex */
    public static final class Companion {
        public Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: reportException */
        public final void m45343x9e70357b(java.lang.String str) {
            if (com.p314xaae8f345.mm.p775xd2ae381c.p776x2e06d1.C10701x817fcf12.f28942xdf045a50 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterEngineService", "reportException " + str);
                c61.bb bbVar = c61.db.f120476g;
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
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterFoundationCrashPlugin", "FlutterCrashContent: " + optString + ", stack:" + optString2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40530x65a4a38();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40528x3103a4f1();
                    throw new c61.ya(optString);
                }
            }
        }
    }

    /* renamed from: reportException */
    private static final void m45342x9e70357b(java.lang.String str) {
        INSTANCE.m45343x9e70357b(str);
    }
}
