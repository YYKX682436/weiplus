package e04;

/* loaded from: classes12.dex */
public final class p2 implements dn.k {
    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buff, "buff");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCdnService", "getCdnAuthInfo, mediaId = %s", mediaId);
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCdnService", "scanTranslateUploadCdn on cdn callback mediaId = %s, startRet = %d, keep_ProgressInfo = %s, keep_SceneResult = %s", mediaId, java.lang.Integer.valueOf(i17), gVar, hVar);
        e04.r2 r2Var = new e04.r2();
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanTranslationCdnService", "scanTranslateUploadCdn start failed : %d, media id is :%s", java.lang.Integer.valueOf(i17), mediaId);
            r2Var.f327612a = i17;
            e04.t2 t2Var = e04.t2.f327639a;
            java.util.HashMap hashMap = (java.util.HashMap) e04.t2.f327641c;
            if (hashMap.containsKey(mediaId)) {
                java.lang.Object remove = hashMap.remove(mediaId);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(remove);
                ((e04.q2) remove).a(mediaId, r2Var);
            }
            return 0;
        }
        if (hVar != null) {
            int i18 = hVar.f69553xb5f54fe9;
            r2Var.f327612a = i18;
            if (i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanTranslationCdnService", "scanTranslateUploadCdn cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", mediaId, java.lang.Integer.valueOf(i18), hVar);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCdnService", "scanTranslateUploadCdn cdn trans suceess, media id : %s", mediaId);
                r2Var.f327613b = hVar.f69522xf9dbbe9c;
                r2Var.f327614c = hVar.f69502xf11df5f5;
            }
            e04.t2 t2Var2 = e04.t2.f327639a;
            java.util.HashMap hashMap2 = (java.util.HashMap) e04.t2.f327641c;
            if (hashMap2.containsKey(mediaId)) {
                java.lang.Object remove2 = hashMap2.remove(mediaId);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(remove2);
                ((e04.q2) remove2).a(mediaId, r2Var);
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String mediaId, byte[] inbuf) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inbuf, "inbuf");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCdnService", "decodePrepareResponse, mediaId = %s", mediaId);
        return null;
    }
}
