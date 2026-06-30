package sc1;

/* loaded from: classes7.dex */
public class a1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f487176a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1094x32b0ec.C12151x47b5a23e f487177b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f487178c;

    public a1(sc1.c1 c1Var, org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1094x32b0ec.C12151x47b5a23e c12151x47b5a23e, java.lang.String str) {
        this.f487176a = jSONObject;
        this.f487177b = c12151x47b5a23e;
        this.f487178c = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c0
    public void a(java.lang.String str) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        jc1.d dVar = jc1.g.f380474m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1094x32b0ec.C12151x47b5a23e c12151x47b5a23e = this.f487177b;
        java.lang.String str2 = this.f487178c;
        if (K0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOperateLivePusher", "operatePlayBgm, download file fail, url:%s", str2);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("url", str2);
            c12151x47b5a23e.d(dVar, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6, "download file fail", hashMap);
            return;
        }
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(str, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateLivePusher", "operatePlayBgm, local file path:%s, realLocalPath: %s", str, i17);
        org.json.JSONObject jSONObject = this.f487176a;
        try {
            jSONObject.put("BGMFilePath", i17);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOperateLivePusher", "operatePlayBgm, set param fail", e17);
        }
        if (c12151x47b5a23e.f("playBGM", jSONObject)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOperateLivePusher", "operatePlayBgm, play bgm fail, url:%s", str2);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("url", str2);
        c12151x47b5a23e.d(dVar, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6, "download file fail", hashMap2);
    }
}
