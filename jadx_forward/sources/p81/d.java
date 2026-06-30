package p81;

/* loaded from: classes7.dex */
public class d implements gm5.a {
    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a6 a6Var;
        nm5.b bVar = (nm5.b) obj;
        r45.os3 os3Var = (r45.os3) bVar.a(0);
        r45.ps3 ps3Var = (r45.ps3) bVar.a(1);
        int i17 = os3Var.f464013d;
        if (i17 == 0) {
            a6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a6(os3Var.f464014e);
        } else {
            if (i17 != 4) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("not support request.type %d", java.lang.Integer.valueOf(os3Var.f464013d)));
            }
            a6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a6(os3Var.f464014e, os3Var.f464019m);
        }
        km5.b b17 = km5.u.b();
        b17.b();
        p81.c cVar = new p81.c(this, b17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Predownload.ActionGetEncryptPkg.PlainActionDownloadPkg", "%s downloadPkg, patch_url(%s), full_url(%s)", a6Var.m49244x9616526c(), ps3Var.f464910g, ps3Var.f464908e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.j0 j0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.j0(a6Var.m49244x9616526c(), os3Var.f464020n.f465165e, os3Var.f464015f, ps3Var.f464908e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.i0 i0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.i0.INSTANCE;
        i0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua Bi = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua.Bi();
        m81.c cVar2 = m81.c.ENV_ERR;
        java.lang.String str = j0Var.f406221l;
        if (Bi == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Predownload.EncryptPkgDownloader", "startDownload, null updater");
            cVar.c(str, cVar2, null);
        } else {
            int a17 = Bi.f157532f.a(j0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Predownload.EncryptPkgDownloader", "startDownload, addRequest(%s) ret = %d", j0Var.f(), java.lang.Integer.valueOf(a17));
            if (a17 != 4) {
                i0Var.f157117d.e(j0Var.f271245a, cVar);
            } else {
                cVar.c(str, cVar2, null);
            }
        }
        return java.lang.Boolean.FALSE;
    }
}
