package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes8.dex */
public class j4 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.i4 f264502d;

    public j4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.i4 i4Var) {
        this.f264502d = i4Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewFileChooserCdnService", "getCdnAuthInfo, mediaId = %s", str);
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = gVar == null ? "null" : gVar.m125797x9616526c();
        objArr[3] = hVar != null ? hVar.m125799x9616526c() : "null";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewFileChooserCdnService", "on cdn callback mediaId = %s, startRet = %d, keep_ProgressInfo = %s, keep_SceneResult = %s", objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l4 Zi = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi();
        Zi.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 abstractC19284xdca64a7 = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewJSSDKFileItemManager", "getItemByMediaID error, media id is null or nil");
        } else {
            java.util.Iterator it = Zi.f264536a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 abstractC19284xdca64a72 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7) it.next();
                java.lang.String str2 = abstractC19284xdca64a72.f264273i;
                if (str2 == null) {
                    str2 = "";
                }
                if (str2.equals(str)) {
                    abstractC19284xdca64a7 = abstractC19284xdca64a72;
                    break;
                }
            }
        }
        if (abstractC19284xdca64a7 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebviewFileChooserCdnService", "get item by media id failed, media is : %s", str);
            return 0;
        }
        if (i17 == -21005) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewFileChooserCdnService", "duplicate request, ignore this request, media id is %s", str);
            return 0;
        }
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebviewFileChooserCdnService", "start failed : %d, media id is :%s", java.lang.Integer.valueOf(i17), str);
            this.f264502d.h(false, i17, abstractC19284xdca64a7.f264269e, abstractC19284xdca64a7.f264273i, null, null);
            return 0;
        }
        if (gVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewFileChooserCdnService", "progressInfo : %s", gVar.m125797x9616526c());
            long j17 = gVar.f69500x8ab84c59 > 0 ? (int) ((gVar.f69496x83ec3dd * 100) / r3) : 0L;
            this.f264502d.g(abstractC19284xdca64a7.f264280s, abstractC19284xdca64a7.f264275n, (int) (j17 >= 0 ? j17 > 100 ? 100L : j17 : 0L), abstractC19284xdca64a7.f264269e, abstractC19284xdca64a7.f264273i);
            return 0;
        }
        if (hVar != null) {
            int i18 = hVar.f69553xb5f54fe9;
            if (i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebviewFileChooserCdnService", "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", str, java.lang.Integer.valueOf(i18), hVar);
                this.f264502d.h(false, hVar.f69553xb5f54fe9, abstractC19284xdca64a7.f264269e, abstractC19284xdca64a7.f264273i, null, null);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewFileChooserCdnService", "cdn trans suceess, media id : %s, item.mediaId : %s, item.localId: %s", str, abstractC19284xdca64a7.f264273i, abstractC19284xdca64a7.f264269e);
                abstractC19284xdca64a7.e(hVar);
                if (abstractC19284xdca64a7.f264280s && abstractC19284xdca64a7.f264282u) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.i4 i4Var = this.f264502d;
                    i4Var.getClass();
                    r45.re4 re4Var = new r45.re4();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k4 k4Var = abstractC19284xdca64a7.f264279r;
                    re4Var.f466297e = k4Var.f38729xf11df5f5;
                    re4Var.f466299g = k4Var.f38731x17c343e7;
                    re4Var.f466296d = k4Var.f38730xf9dbbe9c;
                    re4Var.f466298f = abstractC19284xdca64a7.c();
                    re4Var.f466300h = abstractC19284xdca64a7.b();
                    gm0.j1.d().a(1034, i4Var);
                    gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.t1(abstractC19284xdca64a7.f264268d, abstractC19284xdca64a7.f264269e, re4Var));
                } else {
                    this.f264502d.h(true, 0, abstractC19284xdca64a7.f264269e, abstractC19284xdca64a7.f264272h, abstractC19284xdca64a7.f264279r.f38732x419c440e, hVar.f69560x7b284d5e);
                }
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewFileChooserCdnService", "decodePrepareResponse, mediaId = %s", str);
        return null;
    }
}
