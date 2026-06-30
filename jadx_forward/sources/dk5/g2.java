package dk5;

/* loaded from: classes9.dex */
public class g2 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk5.h2 f316167d;

    public g2(dk5.h2 h2Var) {
        this.f316167d = h2Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        dk5.h2 h2Var = this.f316167d;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.MusicVideoShareUtil", "CDN starts fail!");
            if (h2Var != null) {
                h2Var.a(null, true);
            }
            return 0;
        }
        if (hVar != null) {
            int i18 = hVar.f69553xb5f54fe9;
            if (i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.MusicVideoShareUtil", "CDN upload task fail!");
                if (h2Var != null) {
                    h2Var.a(null, true);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.MusicVideoShareUtil", "retCode %d, fileId %s, url %s", java.lang.Integer.valueOf(i18), hVar.f69522xf9dbbe9c, hVar.f69524x419c440e);
                java.lang.String str2 = hVar.f69524x419c440e;
                if (h2Var != null) {
                    h2Var.a(str2, true);
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
