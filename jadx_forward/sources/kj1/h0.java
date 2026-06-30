package kj1;

/* loaded from: classes7.dex */
public final class h0 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f389868d;

    public h0(com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f389868d = rVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f389868d;
        if (hVar == null) {
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.C12592x92cb95ba(false, null, 2, null));
            }
            return 0;
        }
        if (i17 != 0) {
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.C12592x92cb95ba(false, null, 2, null));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaShortLinkRiskManager", "cdn upload failed, startRet : %d", java.lang.Integer.valueOf(i17));
            return 0;
        }
        int i18 = hVar.f69553xb5f54fe9;
        if (i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaShortLinkRiskManager", "cdn upload failed, retCode:%d sceneResult[%s]", java.lang.Integer.valueOf(i18), hVar);
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.C12592x92cb95ba(false, null, 2, null));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaShortLinkRiskManager", "cdn upload success, media id : %s  file url=%s   thumb url=%s", str, hVar.f69524x419c440e, hVar.f69560x7b284d5e);
            if (rVar != null) {
                java.lang.String field_fileUrl = hVar.f69524x419c440e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_fileUrl, "field_fileUrl");
                rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.C12592x92cb95ba(true, field_fileUrl));
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
