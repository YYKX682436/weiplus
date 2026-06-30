package com.tencent.mm.feature.emoji;

/* loaded from: classes.dex */
public final class EmoticonJsApiDownloadModel extends androidx.lifecycle.c1 {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.feature.emoji.v2 f66004h = new com.tencent.mm.feature.emoji.v2(null);

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.HashMap f66005i = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public long f66006d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f66007e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f66008f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f66009g;

    public EmoticonJsApiDownloadModel() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.EmotionStateChangeEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.EmotionStateChangeEvent>(a0Var) { // from class: com.tencent.mm.feature.emoji.EmoticonJsApiDownloadModel$emoticonStateListener$1
            {
                this.__eventId = 449099204;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.EmotionStateChangeEvent emotionStateChangeEvent) {
                com.tencent.mm.autogen.events.EmotionStateChangeEvent event = emotionStateChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.t4 t4Var = event.f54107g;
                java.lang.String str = t4Var.f7979a;
                int i17 = t4Var.f7981c;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                int i18 = t4Var.f7980b;
                if (i18 != 7 && i18 != 6) {
                    jSONObject2.put("status", 1);
                } else if (i17 == 100) {
                    jSONObject2.put("status", 3);
                } else {
                    jSONObject2.put("status", 2);
                    jSONObject2.put("progress", java.lang.Float.valueOf(i17 / 100.0f));
                }
                jSONObject.put(str, jSONObject2);
                com.tencent.mm.feature.emoji.EmoticonJsApiDownloadModel emoticonJsApiDownloadModel = com.tencent.mm.feature.emoji.EmoticonJsApiDownloadModel.this;
                if (!emoticonJsApiDownloadModel.f66007e.contains(str)) {
                    return false;
                }
                com.tencent.mm.feature.emoji.v2 v2Var = com.tencent.mm.feature.emoji.EmoticonJsApiDownloadModel.f66004h;
                com.tencent.mars.xlog.Log.i("MicroMsg.EmoticonJsApiDownloadModel", "callback: publish " + emoticonJsApiDownloadModel.f66006d + ", " + str + ' ' + jSONObject);
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Vj(emoticonJsApiDownloadModel.f66006d, "onStoreEmoticonDownloadUpdate", jSONObject);
                return false;
            }
        };
        this.f66008f = iListener;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiteAppLifeCycleEvent> iListener2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiteAppLifeCycleEvent>(a0Var) { // from class: com.tencent.mm.feature.emoji.EmoticonJsApiDownloadModel$liteAppDestroyListener$1
            {
                this.__eventId = 1907495603;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent) {
                com.tencent.mm.autogen.events.LiteAppLifeCycleEvent event = liteAppLifeCycleEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.ri riVar = event.f54468g;
                if (riVar.f7817a != 3) {
                    return false;
                }
                com.tencent.mm.feature.emoji.EmoticonJsApiDownloadModel emoticonJsApiDownloadModel = com.tencent.mm.feature.emoji.EmoticonJsApiDownloadModel.this;
                long j17 = emoticonJsApiDownloadModel.f66006d;
                java.lang.Long l17 = riVar.f7820d;
                if (l17 == null || j17 != l17.longValue()) {
                    return false;
                }
                emoticonJsApiDownloadModel.onCleared();
                return false;
            }
        };
        this.f66009g = iListener2;
        iListener.alive();
        iListener2.alive();
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        this.f66008f.dead();
        this.f66009g.dead();
        long j17 = this.f66006d;
        java.util.HashMap hashMap = f66005i;
        synchronized (hashMap) {
        }
    }
}
