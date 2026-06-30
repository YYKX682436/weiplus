package hy4;

/* loaded from: classes5.dex */
public class k implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy4.m f367654d;

    public k(hy4.m mVar, hy4.j jVar) {
        this.f367654d = mVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        synchronized (this.f367654d) {
            if (hVar != null) {
                if (hVar.f69553xb5f54fe9 == 0 && i17 == 0) {
                    java.lang.String str2 = (java.lang.String) ((java.util.HashMap) this.f367654d.f367701b).get(str);
                    if (!this.f367654d.f367704e.equals(str2)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VestImgUploadEngine", "currentPath=%s,callbackPath=%s, path updated after CDNTaskCallback", this.f367654d.f367704e, str2);
                        return 0;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VestImgUploadEngine", "CDN upload success, file url = %s", hVar.f69524x419c440e);
                    gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.a1(hVar.f69524x419c440e, this.f367654d.f367703d, str2));
                    return 0;
                }
            }
            return 0;
        }
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
