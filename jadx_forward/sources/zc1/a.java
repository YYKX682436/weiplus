package zc1;

/* loaded from: classes7.dex */
public class a implements uh1.d {

    /* renamed from: a, reason: collision with root package name */
    public org.json.JSONObject f552926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f552927b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f552928c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f552929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zc1.c f552930e;

    public a(zc1.c cVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str2) {
        this.f552930e = cVar;
        this.f552927b = str;
        this.f552928c = lVar;
        this.f552929d = str2;
    }

    @Override // uh1.d
    public void a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("__AppBrandRemoteDebugRequestHeader__");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f552928c;
        java.lang.String str = this.f552929d;
        if (optBoolean) {
            if (((uh1.a) lVar.b(uh1.a.class)).F) {
                jSONObject.remove("__AppBrandRemoteDebugRequestHeader__");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5164x497885b6 c5164x497885b6 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5164x497885b6();
                am.u uVar = c5164x497885b6.f135514g;
                uVar.f89578a = "download";
                uVar.f89580c = jSONObject;
                uVar.f89579b = str;
                c5164x497885b6.e();
                return;
            }
            return;
        }
        this.f552926a = jSONObject;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("downloadTaskId", str);
        hashMap.put("state", "headersReceived");
        hashMap.put("header", this.f552926a);
        java.lang.String jSONObject2 = new org.json.JSONObject(hashMap).toString();
        zc1.b bVar = new zc1.b();
        bVar.p(lVar);
        bVar.r(jSONObject2);
        bVar.n(this.f552930e.f552933f.a(str));
    }

    @Override // uh1.d
    public void b(int i17, long j17, long j18) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = this.f552929d;
        hashMap.put("downloadTaskId", str);
        hashMap.put("state", "progressUpdate");
        hashMap.put("progress", java.lang.Integer.valueOf(i17));
        hashMap.put("totalBytesWritten", java.lang.Long.valueOf(j17));
        hashMap.put("totalBytesExpectedToWrite", java.lang.Long.valueOf(j18));
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        zc1.b bVar = new zc1.b();
        bVar.p(this.f552928c);
        bVar.r(jSONObject);
        bVar.n(this.f552930e.f552933f.a(str));
    }

    @Override // uh1.d
    public void c(int i17, java.lang.String str, java.lang.String str2, int i18, long j17, java.util.Map map) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCreateDownloadTask", "onDownloadResultWithCode errMsg = %d, mimeType = %s, filePath = %s, statusCode = %d, dataLength = %d", java.lang.Integer.valueOf(i17), str, str2, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f552927b)) {
            java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.c2.D(this.f552928c, new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str2)), this.f552927b, null).f380437b;
            if (!"ok".equals(str3)) {
                if (zc1.c.b(this.f552930e, this.f552928c, this.f552929d)) {
                    return;
                }
                this.f552930e.e(this.f552928c, this.f552929d, str3, 603300);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCreateDownloadTask", "onDownloadResultWithCode filePath %s", this.f552927b);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("downloadTaskId", this.f552929d);
            hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, this.f552927b);
            hashMap.put("dataLength", java.lang.Long.valueOf(j17));
            hashMap.put("statusCode", java.lang.Integer.valueOf(i18));
            hashMap.put("state", ya.b.f77504xbb80cbe3);
            org.json.JSONObject jSONObject = this.f552926a;
            if (jSONObject != null) {
                hashMap.put("header", jSONObject);
            }
            if (map != null && map.size() > 0) {
                hashMap.put(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, map);
            }
            java.lang.String jSONObject2 = new org.json.JSONObject(hashMap).toString();
            zc1.b bVar = new zc1.b();
            bVar.p(this.f552928c);
            bVar.r(jSONObject2);
            bVar.n(this.f552930e.f552933f.a(this.f552929d));
            this.f552930e.f552933f.b(this.f552929d);
            return;
        }
        zc1.c cVar = this.f552930e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f552928c;
        cVar.getClass();
        java.lang.String a17 = q75.g.a(str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17) && com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54257xb16332e8.equals(str)) {
            a17 = "mp4";
        }
        ik1.b0 b0Var = new ik1.b0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49619x6aa75256 = lVar.mo50354x59eafec1().mo49619x6aa75256(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str2)), a17, true, b0Var);
        java.lang.String str4 = mo49619x6aa75256 != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK ? null : (java.lang.String) b0Var.f373357a;
        if (str4 == null) {
            if (zc1.c.b(this.f552930e, this.f552928c, this.f552929d)) {
                return;
            }
            this.f552930e.e(this.f552928c, this.f552929d, mo49619x6aa75256 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_EXCEED_DIRECTORY_MAX_SIZE ? "temp file size exceed limit" : "download fail save file fail", 603300);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCreateDownloadTask", "onDownloadResultWithCode localId %s", str4);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("downloadTaskId", this.f552929d);
        hashMap2.put("tempFilePath", str4);
        hashMap2.put("dataLength", java.lang.Long.valueOf(j17));
        hashMap2.put("statusCode", java.lang.Integer.valueOf(i18));
        hashMap2.put("state", ya.b.f77504xbb80cbe3);
        org.json.JSONObject jSONObject3 = this.f552926a;
        if (jSONObject3 != null) {
            hashMap2.put("header", jSONObject3);
        }
        if (map != null && map.size() > 0) {
            hashMap2.put(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, map);
        }
        java.lang.String jSONObject4 = new org.json.JSONObject(hashMap2).toString();
        zc1.b bVar2 = new zc1.b();
        bVar2.p(this.f552928c);
        bVar2.r(jSONObject4);
        bVar2.n(this.f552930e.f552933f.a(this.f552929d));
        this.f552930e.f552933f.b(this.f552929d);
    }

    @Override // uh1.d
    public void d(int i17, java.lang.String str, int i18) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.lang.String str2 = this.f552929d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCreateDownloadTask", "onDownloadError downloadTaskId=%s,errMsg=%d,error=%s,errno=%d", str2, valueOf, str, valueOf2);
        zc1.c cVar = this.f552930e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f552928c;
        if (zc1.c.b(cVar, lVar, str2)) {
            return;
        }
        cVar.e(lVar, str2, str, i18);
    }
}
