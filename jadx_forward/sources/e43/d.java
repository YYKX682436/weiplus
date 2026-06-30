package e43;

/* loaded from: classes12.dex */
public final class d implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u33.j f330893d;

    public d(u33.j jVar) {
        this.f330893d = jVar;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buff, "buff");
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        java.lang.String str;
        java.lang.String m125799x9616526c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = mediaId;
        objArr[1] = java.lang.Integer.valueOf(i17);
        java.lang.String str2 = "null";
        if (gVar == null || (str = gVar.m125797x9616526c()) == null) {
            str = "null";
        }
        objArr[2] = str;
        if (hVar != null && (m125799x9616526c = hVar.m125799x9616526c()) != null) {
            str2 = m125799x9616526c;
        }
        objArr[3] = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRoomMediaUploader", "on cdn callback mediaId = %s, startRet = %d, keep_ProgressInfo = %s, keep_SceneResult = %s", objArr);
        if (i17 == -21005) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRoomMediaUploader", "duplicate request, ignore this request, media id is %s", mediaId);
            return 0;
        }
        u33.j jVar = this.f330893d;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatRoomMediaUploader", "start failed : %d, media id is :%s", java.lang.Integer.valueOf(i17), mediaId);
            ((e43.h) jVar).a(false, i17, mediaId, hVar);
            return 0;
        }
        if (gVar == null) {
            if (hVar != null) {
                int i18 = hVar.f69553xb5f54fe9;
                if (i18 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatRoomMediaUploader", "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", mediaId, java.lang.Integer.valueOf(i18), hVar);
                    ((e43.h) jVar).a(false, hVar.f69553xb5f54fe9, mediaId, hVar);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRoomMediaUploader", "cdn trans suceess, media id : %s", mediaId);
                    ((e43.h) jVar).a(true, 0, mediaId, hVar);
                }
            }
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRoomMediaUploader", "progressInfo : %s", gVar.m125797x9616526c());
        long j17 = gVar.f69500x8ab84c59;
        long j18 = 0;
        long j19 = j17 > 0 ? (gVar.f69496x83ec3dd * 100) / j17 : 0L;
        if (j19 >= 0) {
            j18 = 100;
            if (j19 <= 100) {
                j18 = j19;
            }
        }
        ((e43.h) jVar).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendImgUtil", "onProgress, percent = %d, mediaId = %s", java.lang.Integer.valueOf((int) j18), mediaId);
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String mediaId, byte[] inbuf) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inbuf, "inbuf");
        return null;
    }
}
