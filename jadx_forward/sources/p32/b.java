package p32;

/* loaded from: classes12.dex */
public class b implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f432991d = null;

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        if (hVar == null || !str.equals(this.f432991d)) {
            return 0;
        }
        if (i17 != 0 || hVar.f69553xb5f54fe9 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExdevicePictureUploader", "hy: transfer done, fail");
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdevicePictureUploader", "transfer done, mediaid=%s, completeInfo=%s", str, hVar.m125799x9616526c());
        r32.a aVar = new r32.a();
        aVar.f66505x850adc81 = hVar.f69524x419c440e;
        aVar.f66506xdec927b = c01.z1.r();
        java.lang.String str2 = aVar.f66505x850adc81;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && !"#".equals(str2)) {
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str2.getBytes());
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(p32.c.f432992a);
            if (!r6Var.m() || !r6Var.y()) {
                r6Var.J();
            }
            com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var, b17);
            if (r6Var2.m()) {
                r6Var2.o();
            } else {
                try {
                    r6Var2.k();
                } catch (java.io.IOException e17) {
                    e17.toString();
                }
                gm0.j1.e().j(new p32.a(str2, r6Var2));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.wi().z0(aVar, true);
        q32.c cj6 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.cj();
        java.lang.String str3 = aVar.f66505x850adc81;
        java.lang.String str4 = aVar.f66504x6d53d39f;
        cj6.getClass();
        gm0.j1.n().f354821b.g(new p32.p(str3, str4));
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
