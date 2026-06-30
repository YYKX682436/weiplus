package hf0;

/* loaded from: classes9.dex */
public final class b implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf0.a f362527d;

    public b(hf0.a aVar) {
        this.f362527d = aVar;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buff, "buff");
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        hf0.a aVar = this.f362527d;
        if (hVar != null && hVar.f69553xb5f54fe9 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ting.TingAudioUploader", "cdn upload success, clientId: %s, startRet: %d, progressInfo: [%s], res: [%s]", mediaId, java.lang.Integer.valueOf(i17), gVar, hVar);
            java.lang.String field_fileUrl = hVar.f69524x419c440e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_fileUrl, "field_fileUrl");
            ((jm4.g5) aVar).a(0, true, field_fileUrl, hVar);
            return 0;
        }
        if (hVar == null || hVar.f69553xb5f54fe9 == 0) {
            if (i17 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ting.TingAudioUploader", "cdn upload fail, startRet is not 0, clientId: %s, startRet: %d, progressInfo: [%s], res: [%s]", mediaId, java.lang.Integer.valueOf(i17), gVar, hVar);
                ((jm4.g5) aVar).a(i17, false, "", hVar);
            }
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ting.TingAudioUploader", "cdn upload fail, retCode is not 0, clientId: %s, startRet: %d, progressInfo: [%s], res: [%s]", mediaId, java.lang.Integer.valueOf(i17), gVar, hVar);
        ((jm4.g5) aVar).a(hVar.f69553xb5f54fe9, false, "", hVar);
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String mediaId, byte[] inbuf) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inbuf, "inbuf");
        return null;
    }
}
