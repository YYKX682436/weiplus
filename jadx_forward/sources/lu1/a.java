package lu1;

/* loaded from: classes12.dex */
public class a implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f402851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f402852e;

    public a(java.lang.String str, java.lang.String str2) {
        this.f402851d = str;
        this.f402852e = str2;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadHelpper", "getCdnAuthInfo, mediaId = %s", str);
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        lu1.b bVar;
        lu1.b bVar2;
        lu1.b bVar3;
        lu1.b bVar4;
        if (i17 == -21005) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadHelpper", "duplicate request, ignore this request, media id is %s", str);
            return 0;
        }
        java.lang.String str2 = this.f402851d;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CDNDownloadHelpper", "start failed : %d, media id is :%s", java.lang.Integer.valueOf(i17), str);
            for (int i18 = 0; i18 < ((java.util.ArrayList) lu1.c.f402854a).size(); i18++) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) lu1.c.f402854a).get(i18);
                if (weakReference != null && (bVar4 = (lu1.b) weakReference.get()) != null) {
                    bVar4.J(str2);
                }
            }
            return 0;
        }
        if (gVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadHelpper", "progressInfo : %s", gVar.m125797x9616526c());
            long j17 = gVar.f69500x8ab84c59;
            long j18 = j17 > 0 ? (gVar.f69496x83ec3dd * 100) / j17 : 0L;
            long j19 = j18 >= 0 ? j18 > 100 ? 100L : j18 : 0L;
            for (int i19 = 0; i19 < ((java.util.ArrayList) lu1.c.f402854a).size(); i19++) {
                java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) ((java.util.ArrayList) lu1.c.f402854a).get(i19);
                if (weakReference2 != null && (bVar3 = (lu1.b) weakReference2.get()) != null) {
                    bVar3.g2(str2, (int) j19, 100);
                }
            }
            return 0;
        }
        if (hVar != null) {
            int i27 = hVar.f69553xb5f54fe9;
            if (i27 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CDNDownloadHelpper", "cdntra clientid:%s , sceneResult.retCode:%d , sceneResult[%s]", str, java.lang.Integer.valueOf(i27), hVar);
                for (int i28 = 0; i28 < ((java.util.ArrayList) lu1.c.f402854a).size(); i28++) {
                    java.lang.ref.WeakReference weakReference3 = (java.lang.ref.WeakReference) ((java.util.ArrayList) lu1.c.f402854a).get(i28);
                    if (weakReference3 != null && (bVar2 = (lu1.b) weakReference3.get()) != null) {
                        bVar2.J(str2);
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadHelpper", "cdn trans suceess, sceneResult[%s]", hVar);
                for (int i29 = 0; i29 < ((java.util.ArrayList) lu1.c.f402854a).size(); i29++) {
                    java.lang.ref.WeakReference weakReference4 = (java.lang.ref.WeakReference) ((java.util.ArrayList) lu1.c.f402854a).get(i29);
                    if (weakReference4 != null && (bVar = (lu1.b) weakReference4.get()) != null) {
                        bVar.I1(str2, this.f402852e);
                    }
                }
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadHelpper", "decodePrepareResponse, mediaId = %s", str);
        return null;
    }
}
