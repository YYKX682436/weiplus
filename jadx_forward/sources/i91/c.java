package i91;

/* loaded from: classes15.dex */
public class c implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i91.d f371230d;

    public c(i91.d dVar) {
        this.f371230d = dVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppbrandCdnService", "getCdnAuthInfo, mediaId = %s", str);
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = gVar == null ? "null" : gVar.m125797x9616526c();
        objArr[3] = hVar != null ? hVar.m125799x9616526c() : "null";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppbrandCdnService", "on cdn callback mediaId = %s, startRet = %d, keep_ProgressInfo = %s, keep_SceneResult = %s", objArr);
        i91.e bj6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.bj();
        bj6.getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            for (i91.b bVar : bj6.f371234a.values()) {
                java.lang.String str2 = bVar.f371227d;
                if (str2 == null) {
                    str2 = "";
                }
                if (str2.equals(str)) {
                    break;
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppbrandMediaCdnItemManager", "getItemByMediaID error, media id is null or nil");
        }
        bVar = null;
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppbrandCdnService", "get item by media id failed, media is : %s", str);
            return 0;
        }
        if (i17 == -21005) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppbrandCdnService", "duplicate request, ignore this request, media id is %s", str);
            return 0;
        }
        i91.d dVar = this.f371230d;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppbrandCdnService", "start failed : %d, media id is :%s", java.lang.Integer.valueOf(i17), str);
            i91.d.a(dVar, false, bVar.f371224a, bVar.f371227d, null);
            return 0;
        }
        if (gVar == null) {
            if (hVar != null) {
                int i18 = hVar.f69553xb5f54fe9;
                if (i18 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppbrandCdnService", "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", str, java.lang.Integer.valueOf(i18), hVar);
                    i91.d.a(dVar, false, bVar.f371224a, bVar.f371227d, null);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppbrandCdnService", "cdn trans suceess, media id : %s", str);
                    if (bVar.f371228e == null) {
                        bVar.f371228e = new i91.a();
                    }
                    i91.a aVar = bVar.f371228e;
                    aVar.f69860xf11df5f5 = hVar.f69502xf11df5f5;
                    java.lang.String str3 = hVar.f69522xf9dbbe9c;
                    aVar.f69861xf9dbbe9c = str3;
                    aVar.f69863x419c440e = hVar.f69524x419c440e;
                    aVar.f69862x17c343e7 = (int) hVar.f69523x17c343e7;
                    bVar.f371226c = str3;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.bj().a(bVar);
                    i91.d.a(dVar, true, bVar.f371224a, bVar.f371226c, bVar.f371228e.f69863x419c440e);
                }
            }
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppbrandCdnService", "progressInfo : %s", gVar.m125797x9616526c());
        long j17 = gVar.f69500x8ab84c59;
        long j18 = j17 > 0 ? (gVar.f69496x83ec3dd * 100) / j17 : 0L;
        long j19 = j18 >= 0 ? j18 > 100 ? 100L : j18 : 0L;
        boolean z18 = bVar.f371229f;
        int i19 = (int) j19;
        java.lang.String str4 = bVar.f371224a;
        java.lang.String str5 = bVar.f371227d;
        dVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppbrandCdnService", "notifyProgressCallback, upload : %b, mediaType : %d, percent : %d, localId : %s, mediaId : %s", java.lang.Boolean.valueOf(z18), 0, java.lang.Integer.valueOf(i19), str4, str5);
        java.util.Vector vector = dVar.f371232b;
        if (vector != null && vector.size() > 0) {
            java.util.Iterator it = vector.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12168x62e4d433 c12168x62e4d433 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.z6) ((i91.g) it.next())).f163711a;
                c12168x62e4d433.f163212p = i19;
                c12168x62e4d433.f163214r = 3;
                c12168x62e4d433.c();
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppbrandCdnService", "decodePrepareResponse, mediaId = %s", str);
        return null;
    }
}
