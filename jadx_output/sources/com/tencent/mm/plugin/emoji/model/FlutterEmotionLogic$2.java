package com.tencent.mm.plugin.emoji.model;

/* loaded from: classes15.dex */
class FlutterEmotionLogic$2 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.EmotionStateChangeEvent> {
    public FlutterEmotionLogic$2(com.tencent.mm.plugin.emoji.model.d0 d0Var, androidx.lifecycle.y yVar) {
        super(yVar);
        this.__eventId = 449099204;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.EmotionStateChangeEvent emotionStateChangeEvent) {
        com.tencent.mm.autogen.events.EmotionStateChangeEvent emotionStateChangeEvent2 = emotionStateChangeEvent;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            am.t4 t4Var = emotionStateChangeEvent2.f54107g;
            jSONObject.put("ProductID", t4Var.f7979a);
            jSONObject.put("Progress", t4Var.f7981c);
            jSONObject.put("Status", t4Var.f7980b);
            jSONObject.put("CDNClientID", t4Var.f7982d);
        } catch (java.lang.Exception unused) {
        }
        com.tencent.mm.autogen.events.FlutterMethodCallEvent flutterMethodCallEvent = new com.tencent.mm.autogen.events.FlutterMethodCallEvent();
        am.xd xdVar = flutterMethodCallEvent.f54344g;
        xdVar.f8374a = true;
        xdVar.f8375b = new c01.e9("onEmotionDownloadCallback", jSONObject.toString());
        flutterMethodCallEvent.d(new com.tencent.mm.plugin.emoji.model.c0(this));
        return false;
    }
}
