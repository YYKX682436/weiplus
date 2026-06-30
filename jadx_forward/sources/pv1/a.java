package pv1;

/* loaded from: classes13.dex */
public class a implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pv1.c f440099d;

    public a(pv1.c cVar) {
        this.f440099d = cVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        if (gVar != null) {
            gVar.m125797x9616526c();
        }
        if (hVar != null) {
            hVar.m125799x9616526c();
        }
        if (i17 == -21006) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.FileDownloaderXWEBProxy", "duplicate request, ignore this request, mediaId:%s", str);
            return 0;
        }
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XWeb.MM.FileDownloaderXWEBProxy", "cdnCallback, start failed:%d, mediaId:%s", java.lang.Integer.valueOf(i17), str);
            pv1.c.a(this.f440099d, str, 4, i17, null, false);
            return 0;
        }
        if (gVar == null) {
            if (hVar != null) {
                int i18 = hVar.f69553xb5f54fe9;
                if (i18 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XWeb.MM.FileDownloaderXWEBProxy", "cdnCallback, download fail, mediaId:%s, retCode:%d, sceneResult:%s", str, java.lang.Integer.valueOf(i18), hVar);
                    pv1.c.a(this.f440099d, str, 4, hVar.f69553xb5f54fe9, null, hVar.f69535xe3dc39c);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.FileDownloaderXWEBProxy", "cdnCallback, download success, mediaId:%s", str);
                    pv1.c.a(this.f440099d, str, 3, 0, null, hVar.f69535xe3dc39c);
                }
            }
            return 0;
        }
        long j17 = gVar.f69496x83ec3dd;
        long j18 = gVar.f69500x8ab84c59;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f440099d.f440103a;
        concurrentHashMap.containsKey(str);
        if (concurrentHashMap.containsKey(str)) {
            rx5.b bVar = ((pv1.b) concurrentHashMap.get(str)).f440100a;
            if (bVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XWeb.MM.FileDownloaderXWEBProxy", "updateProgressChange, proxy_callback is null");
            } else {
                bVar.c(str, j17, j18);
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
