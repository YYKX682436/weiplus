package iu0;

/* loaded from: classes5.dex */
public final class b implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iu0.d f376329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f376330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ iu0.a f376331f;

    public b(iu0.d dVar, java.lang.String str, iu0.a aVar) {
        this.f376329d = dVar;
        this.f376330e = str;
        this.f376331f = aVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.CdnUpload", "cdnCallback: mediaId=" + str + ", startRet=" + i17 + ", sceneResult=" + hVar + ", retryCount=" + this.f376329d.f376336b);
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.CdnUpload", "cdnCallback: start failed, ret=" + i17);
            if (i17 != -21005) {
                iu0.d.a(this.f376329d, this.f376330e, this.f376331f, 0, i17, "CDN start failed");
            }
            return 0;
        }
        if (str != null && hVar != null) {
            if (hVar.f69553xb5f54fe9 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.CdnUpload", "cdnCallback: upload failed, retCode=" + hVar.f69553xb5f54fe9);
                iu0.d.a(this.f376329d, this.f376330e, this.f376331f, 0, hVar.f69553xb5f54fe9, "CDN upload failed");
                return 0;
            }
            java.lang.String str2 = hVar.f69524x419c440e;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = hVar.f69526x419c9c3d;
            java.lang.String str4 = str3 != null ? str3 : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.CdnUpload", "cdnCallback: success, cdnUrl=" + str2 + ", md5=" + str4 + ", fileLength=" + hVar.f69523x17c343e7);
            this.f376329d.f376335a = null;
            gu0.i2 i2Var = (gu0.i2) this.f376331f;
            i2Var.getClass();
            ((p3325xe03a0797.p3326xc267989b.r) i2Var.f357236a).s(new jz5.l(str2, str4), gu0.h2.f357224d);
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
