package kd1;

/* loaded from: classes7.dex */
public class b implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f388228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f388229e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kd1.c f388230f;

    public b(kd1.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f388230f = cVar;
        this.f388228d = lVar;
        this.f388229e = i17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String string = bundle.getString("idsStr", "");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            java.util.Vector vector = new java.util.Vector();
            java.lang.String[] split = string.split(",");
            java.util.Vector vector2 = new java.util.Vector();
            java.util.Vector vector3 = new java.util.Vector();
            for (java.lang.String str : split) {
                vector.add(str);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, "0")) {
                    kd1.e.b();
                    java.lang.String string2 = kd1.e.a().getString(str, "");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.JsApiLoadPaySpeechDialectConfig", "resPath:%s", string2);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2) || !com.p314xaae8f345.mm.vfs.w6.j(string2)) {
                        kd1.e.b();
                        vector2.add(kd1.e.c(str));
                        vector3.add("");
                    } else {
                        kd1.e.b();
                        vector2.add(kd1.e.c("0-1"));
                        kd1.e.b();
                        vector3.add(kd1.e.a().getString("0-1_version", ""));
                    }
                } else {
                    kd1.e.b();
                    vector2.add(kd1.e.c(str));
                    kd1.e.b();
                    vector3.add(kd1.e.a().getString(str + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130908t, ""));
                }
            }
            if (vector.size() > 0) {
                hashMap.put("downloadedPackId", new org.json.JSONArray((java.util.Collection) vector));
                hashMap.put("downloadedPackMD5", new org.json.JSONArray((java.util.Collection) vector2));
                hashMap.put("downloadedPackVersions", new org.json.JSONArray((java.util.Collection) vector3));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.JsApiLoadPaySpeechDialectConfig", "downloadedPackId:%s  ，downloadedPackMD5：%s, downloadedPackVersions:%s", new org.json.JSONArray((java.util.Collection) vector).toString(), new org.json.JSONArray((java.util.Collection) vector2).toString(), new org.json.JSONArray((java.util.Collection) vector3).toString());
            }
        }
        java.lang.String string3 = bundle.getString("resId", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.JsApiLoadPaySpeechDialectConfig", "resId:%s", string3);
        hashMap.put("dialectPackId", string3);
        this.f388228d.a(this.f388229e, this.f388230f.p("ok", hashMap));
    }
}
