package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

/* loaded from: classes12.dex */
public class d implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f f178081d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f fVar) {
        this.f178081d = fVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f fVar = this.f178081d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.c) fVar.f178088b.get(str);
        if (cVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.editor.EditorCdnManager", "cdn info is null!!!");
            return 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.b bVar = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.b.OUT_OF_DATE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.b bVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.b.ERR;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = fVar.f178088b;
        java.lang.String str2 = cVar.f178069b;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.editor.EditorCdnManager", "transfer err! startRet: %s. cdnInfo:%s", java.lang.Integer.valueOf(i17), cVar);
            if (-5103059 == i17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f.a(fVar, cVar, bVar);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f.a(fVar, cVar, bVar2);
            }
            concurrentHashMap.remove(str2);
            return 0;
        }
        if (gVar != null) {
            cVar.f178074g = gVar.f69496x83ec3dd;
            cVar.f178073f = gVar.f69500x8ab84c59;
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f.a(fVar, cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.b.TRAN);
        } else if (hVar != null) {
            if (hVar.f69553xb5f54fe9 >= 0) {
                boolean z18 = cVar.f178077j;
                if (z18) {
                    cVar.f178076i = hVar.f69502xf11df5f5;
                    cVar.f178075h = hVar.f69524x419c440e;
                }
                boolean endsWith = str.endsWith("_t");
                r45.gp0 gp0Var = cVar.f178068a;
                if (endsWith) {
                    gp0Var.c0(cVar.f178076i);
                    gp0Var.d0(cVar.f178075h);
                } else {
                    gp0Var.a0(cVar.f178076i);
                    gp0Var.b0(cVar.f178075h);
                    if (z18) {
                        if (cVar.f178070c == 4) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.editor.EditorCdnManager", "video stream, id:%s", hVar.f69569x931c604d);
                            gp0Var.T0(hVar.f69569x931c604d);
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.editor.EditorCdnManager", "transfer done, mediaId=%s completeResult.mediaId=%s aesKey=%s completeInfo=%s", str, hVar.f323299a, hVar.f69502xf11df5f5, hVar.m125799x9616526c());
                com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f.a(fVar, cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.b.SUCC);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.editor.EditorCdnManager", "transfer err. mediaId=%s completeResult.mediaId=%s aesKey=%s completeInfo=%s", str, hVar.f323299a, hVar.f69502xf11df5f5, hVar.m125799x9616526c());
                if (-5103059 == hVar.f69553xb5f54fe9) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f.a(fVar, cVar, bVar);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f.a(fVar, cVar, bVar2);
                }
            }
            concurrentHashMap.remove(str2);
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
