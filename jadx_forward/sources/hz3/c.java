package hz3;

/* loaded from: classes12.dex */
public final class c implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hz3.q f367852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hz3.w f367853e;

    public c(hz3.q qVar, hz3.w wVar) {
        this.f367852d = qVar;
        this.f367853e = wVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AIScanImageCdnUploadUtil", "checkCDNImage getCdnAuthInfo, mediaId = " + str);
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        hz3.q qVar = this.f367852d;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AIScanImageCdnUploadUtil", "checkCDNImage AIScanImageCdnUploader upload start fail: " + i17);
            ((hz3.u) qVar).a(new hz3.x(3, 402));
            return 0;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkCDNImage callback, mediaId:");
        sb6.append(str);
        sb6.append(" len:");
        sb6.append(gVar != null ? java.lang.Long.valueOf(gVar.f69496x83ec3dd) : null);
        sb6.append(", totalLen:");
        sb6.append(gVar != null ? java.lang.Long.valueOf(gVar.f69500x8ab84c59) : null);
        sb6.append(", sceneResult.retCode: ");
        sb6.append(hVar != null ? java.lang.Integer.valueOf(hVar.f69553xb5f54fe9) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AIScanImageCdnUploadUtil", sb6.toString());
        if (hVar != null) {
            if (hVar.f69553xb5f54fe9 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AIScanImageCdnUploadUtil", "checkCDNImage result fail: " + hVar.f69553xb5f54fe9);
                ((hz3.u) qVar).a(new hz3.x(3, 403));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AIScanImageCdnUploadUtil", "checkCDNImage success");
                hz3.x xVar = new hz3.x(0, 0);
                int i18 = this.f367853e.f367905c;
                java.lang.String field_fileId = hVar.f69522xf9dbbe9c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_fileId, "field_fileId");
                xVar.f367910c = field_fileId;
                java.lang.String field_aesKey = hVar.f69502xf11df5f5;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_aesKey, "field_aesKey");
                xVar.f367911d = field_aesKey;
                ((hz3.u) qVar).a(xVar);
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AIScanImageCdnUploadUtil", "decodePrepareResponse, mediaId = %s", str);
        return new byte[0];
    }
}
