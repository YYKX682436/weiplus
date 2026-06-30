package bg4;

/* loaded from: classes9.dex */
public class a extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public a() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.String str = ((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6224x89a7e693) abstractC20979x809547d1).f136471g.f89289a;
        if (str != null) {
            java.lang.String b17 = zf4.r.b(str, false);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
                zf4.l.Bi().d(b17);
            }
            java.util.HashMap hashMap = (java.util.HashMap) zf4.l.Bi().f554183e;
            zf4.i iVar = (zf4.i) hashMap.get(str);
            if (iVar != null) {
                java.io.RandomAccessFile randomAccessFile = iVar.f554202a;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                        iVar.f554202a = null;
                    } catch (java.io.IOException unused) {
                    }
                }
                hashMap.remove(str);
            }
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (m17.a()) {
                m17.f294799a.d(m17.f294800b);
            }
        }
        return false;
    }
}
