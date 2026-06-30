package k72;

/* loaded from: classes14.dex */
public class c0 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f386242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k72.d0 f386243e;

    public c0(k72.d0 d0Var, java.lang.String str, java.lang.String str2, k72.y yVar) {
        this.f386243e = d0Var;
        this.f386242d = str;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceCheckVideoRecordMgr", "hy: sceneResult.field_retCode == 0 cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
        int i18 = hVar == null ? -1 : hVar.f69553xb5f54fe9;
        vz2.c.c().f137740i = i18;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6436x54c76ecc c17 = vz2.c.c();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        k72.d0 d0Var = this.f386243e;
        c17.f137742k = currentTimeMillis - d0Var.f386251h;
        vz2.c.k("rspCdn", java.lang.Integer.valueOf(i18));
        java.lang.String str2 = this.f386242d;
        if (hVar != null && hVar.f69553xb5f54fe9 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceCheckVideoRecordMgr", "hy: upload video done. now upload");
            java.lang.String str3 = hVar.f69522xf9dbbe9c;
            java.lang.String str4 = hVar.f69502xf11df5f5;
            k72.b0 b0Var = d0Var.f386249f;
            if (b0Var != null) {
                byte[] bArr = d0Var.f386250g;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceCheckActionMgr", "onUploadFinish, fileName: %s, fileId: %s, aesKey: %s", str2, str2, str3, str4);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(917L, 50L, 1L, false);
                k72.u uVar = ((k72.r) b0Var).f386277a.f386281g;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceCheckActionMgr", "requestCheckAction, fileName: %s, fileId: %s, aesKey: %s needSignContract:%s ", str2, str3, str4, java.lang.Boolean.valueOf(uVar.f386301z));
                vz2.c.j("reqVerify");
                j72.c cVar = new j72.c(uVar.f386289n, uVar.f386290o, uVar.f386291p, str3, str4, uVar.f386284f, uVar.f386292q, uVar.f386285g, bArr, uVar.f386301z, 1, 0L, 0.0d, 0.0d, uVar.A);
                gm0.j1.d().a(2726, uVar);
                gm0.j1.d().g(cVar);
            }
        } else {
            if (hVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceCheckVideoRecordMgr", "hy: upload video cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
                com.p314xaae8f345.mm.vfs.w6.h(str2);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(917L, 51L, 1L, false);
                k72.b0 b0Var2 = d0Var.f386249f;
                if (b0Var2 != null) {
                    ((k72.r) b0Var2).a();
                }
                return 0;
            }
            if (i17 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceCheckVideoRecordMgr", "hy: upload video start error!; cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(917L, 51L, 1L, false);
                com.p314xaae8f345.mm.vfs.w6.h(str2);
                k72.b0 b0Var3 = d0Var.f386249f;
                if (b0Var3 != null) {
                    ((k72.r) b0Var3).a();
                }
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
