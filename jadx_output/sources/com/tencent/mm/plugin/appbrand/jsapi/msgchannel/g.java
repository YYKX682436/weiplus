package com.tencent.mm.plugin.appbrand.jsapi.msgchannel;

/* loaded from: classes7.dex */
public class g extends com.tencent.mm.plugin.appbrand.jsapi.o0 {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "onReceiveCacheMsgChannelBatch";

    public g() {
        si1.e.a(NAME);
    }

    public void x(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.util.ArrayList arrayList) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OnReceiveCacheMsgChannelBatchJsApiEvent", "dispatch msg channel to web ， msgChannelList size:%d", java.lang.Integer.valueOf(arrayList.size()));
        java.util.HashMap hashMap = new java.util.HashMap();
        org.json.JSONStringer jSONStringer = new org.json.JSONStringer();
        try {
            jSONStringer.array();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.appbrand.message.WxaAppMsgChannel wxaAppMsgChannel = (com.tencent.mm.plugin.appbrand.message.WxaAppMsgChannel) it.next();
                jSONStringer.object();
                jSONStringer.key("sendTime");
                jSONStringer.value(wxaAppMsgChannel.f86014m);
                jSONStringer.key("msgId");
                jSONStringer.value(wxaAppMsgChannel.f86008d);
                jSONStringer.key("msgType");
                jSONStringer.value(wxaAppMsgChannel.f86012h);
                jSONStringer.key("msgContent");
                jSONStringer.value(wxaAppMsgChannel.f86013i);
                jSONStringer.endObject();
            }
            jSONStringer.endArray();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OnReceiveCacheMsgChannelBatchJsApiEvent", e17, "dispatch", new java.lang.Object[0]);
        }
        hashMap.put("cacheList", jSONStringer.toString());
        u(lVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.OnReceiveCacheMsgChannelBatchJsApiEvent", "dispatch wxa msg channel");
        t(hashMap);
        m();
    }
}
