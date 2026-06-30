package oj4;

/* loaded from: classes11.dex */
public final class d implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oj4.c f427343d;

    public d(oj4.c cVar) {
        this.f427343d = cVar;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buff, "buff");
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        if (i17 == -21005) {
            return 0;
        }
        oj4.c cVar = this.f427343d;
        if (hVar != null && hVar.f69553xb5f54fe9 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusUploader", "cdntra cdnCallback2 clientid:%s startRet:%d proginfo:[%s] res:[%s]", mediaId, java.lang.Integer.valueOf(i17), gVar, hVar);
            ((oj4.m) cVar).a(0, true, hVar);
            return 0;
        }
        if (hVar == null || hVar.f69553xb5f54fe9 == 0) {
            if (i17 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusUploader", "cdntra cdnCallback4 clientid:%s startRet:%d proginfo:[%s] res:[%s]", mediaId, java.lang.Integer.valueOf(i17), gVar, hVar);
                ((oj4.m) cVar).a(i17, false, hVar);
            }
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusUploader", "cdntra cdnCallback3 clientid:%s startRet:%d proginfo:[%s] res:[%s]", mediaId, java.lang.Integer.valueOf(i17), gVar, hVar);
        ((oj4.m) cVar).a(hVar.f69553xb5f54fe9, false, hVar);
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String mediaId, byte[] inbuf) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inbuf, "inbuf");
        return null;
    }
}
