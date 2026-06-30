package qf1;

/* loaded from: classes13.dex */
public class k implements rf1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f443807a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qf1.m f443808b;

    public k(qf1.m mVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f443808b = mVar;
        this.f443807a = lVar;
    }

    @Override // rf1.c
    public void a(rf1.h hVar) {
        if (!hVar.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiStartWifi", "onConnect, wifiItem is invalid");
            return;
        }
        try {
            qf1.c cVar = new qf1.c();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("wifi", hVar.b());
            cVar.p(this.f443807a);
            cVar.f163909h = 0;
            cVar.t(hashMap);
            cVar.m();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStartWifi", "onConnect error");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiStartWifi", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // rf1.c
    public void b(rf1.h hVar) {
        if (!hVar.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiStartWifi", "onConnectAcceptIncomplete, wifiItem is invalid");
            return;
        }
        try {
            qf1.d dVar = new qf1.d();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("wifi", hVar.b());
            dVar.p(this.f443807a);
            dVar.f163909h = 0;
            dVar.t(hashMap);
            dVar.m();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStartWifi", "onConnectAcceptIncomplete error");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiStartWifi", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // rf1.c
    public void h() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f443807a;
        this.f443808b.getClass();
        try {
            qf1.c cVar = new qf1.c();
            java.util.HashMap hashMap = new java.util.HashMap();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("SSID", "");
            jSONObject.put("BSSID", "");
            hashMap.put("wifi", jSONObject);
            cVar.p(lVar);
            cVar.f163909h = 0;
            cVar.t(hashMap);
            cVar.m();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStartWifi", "mWiFiEventReceiver is error");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiStartWifi", e17, "", new java.lang.Object[0]);
        }
    }
}
