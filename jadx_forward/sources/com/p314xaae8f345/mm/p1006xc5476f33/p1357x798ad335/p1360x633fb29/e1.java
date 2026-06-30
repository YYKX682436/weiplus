package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public class e1 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.f1 f178556d;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.f1 f1Var) {
        this.f178556d = f1Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        if (gVar != null) {
            gVar.m125797x9616526c();
        }
        if (hVar != null) {
            hVar.m125799x9616526c();
        }
        if (i17 == -21006) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileWebNetDownloader", "duplicate request, ignore this request, media id is %s", str);
            return 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.f1 f1Var = this.f178556d;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileWebNetDownloader", "start failed : %d, media id is :%s", java.lang.Integer.valueOf(i17), str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.f1.g(f1Var, str, 4, i17, null);
            return 0;
        }
        if (gVar == null) {
            if (hVar != null) {
                int i18 = hVar.f69553xb5f54fe9;
                if (i18 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileWebNetDownloader", "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", str, java.lang.Integer.valueOf(i18), hVar);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.f1.g(f1Var, str, 4, hVar.f69553xb5f54fe9, null);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileWebNetDownloader", "cdn trans suceess, media id : %s", str);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.f1.g(f1Var, str, 3, 0, null);
                }
            }
            return 0;
        }
        long j17 = gVar.f69496x83ec3dd;
        long j18 = gVar.f69500x8ab84c59;
        f1Var.getClass();
        h02.a f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.f(str);
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Boolean.valueOf(f17 != null);
        objArr[1] = str;
        objArr[2] = java.lang.Long.valueOf(j17);
        objArr[3] = java.lang.Long.valueOf(j18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileWebNetDownloader", "updateProgressChange, info is %s %s %d %d", objArr);
        if (f17 != null) {
            java.util.HashMap hashMap = f1Var.f178563d;
            java.lang.Long l17 = (java.lang.Long) hashMap.get(f17.f68411x238eb002);
            java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
            if (l17 == null || valueOf.longValue() - l17.longValue() >= 500) {
                hashMap.put(f17.f68411x238eb002, valueOf);
                f17.f68441x10a0fed7 = 1;
                f17.f68413xf432b5ad = j17;
                f17.f68443x78351860 = j18;
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(f17);
                f1Var.f178745a.f(f17.f68408x32b20428, str, j17, j18);
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
