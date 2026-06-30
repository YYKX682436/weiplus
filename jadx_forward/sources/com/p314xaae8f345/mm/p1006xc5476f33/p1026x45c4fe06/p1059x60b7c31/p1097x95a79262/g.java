package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1097x95a79262;

/* loaded from: classes7.dex */
public class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o0 {

    /* renamed from: CTRL_INDEX */
    public static final int f34532x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f34533x24728b = "onReceiveCacheMsgChannelBatch";

    public g() {
        si1.e.a(f34533x24728b);
    }

    public void x(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.util.ArrayList arrayList) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnReceiveCacheMsgChannelBatchJsApiEvent", "dispatch msg channel to web ， msgChannelList size:%d", java.lang.Integer.valueOf(arrayList.size()));
        java.util.HashMap hashMap = new java.util.HashMap();
        org.json.JSONStringer jSONStringer = new org.json.JSONStringer();
        try {
            jSONStringer.array();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1161x38eb0007.C12429xdd32d5a3 c12429xdd32d5a3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1161x38eb0007.C12429xdd32d5a3) it.next();
                jSONStringer.object();
                jSONStringer.key("sendTime");
                jSONStringer.value(c12429xdd32d5a3.f167547m);
                jSONStringer.key("msgId");
                jSONStringer.value(c12429xdd32d5a3.f167541d);
                jSONStringer.key("msgType");
                jSONStringer.value(c12429xdd32d5a3.f167545h);
                jSONStringer.key("msgContent");
                jSONStringer.value(c12429xdd32d5a3.f167546i);
                jSONStringer.endObject();
            }
            jSONStringer.endArray();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OnReceiveCacheMsgChannelBatchJsApiEvent", e17, "dispatch", new java.lang.Object[0]);
        }
        hashMap.put("cacheList", jSONStringer.toString());
        u(lVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnReceiveCacheMsgChannelBatchJsApiEvent", "dispatch wxa msg channel");
        t(hashMap);
        m();
    }
}
