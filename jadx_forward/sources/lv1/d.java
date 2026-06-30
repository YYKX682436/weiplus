package lv1;

/* loaded from: classes8.dex */
public class d implements dn.k {
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadServiceSlot", "duplicate request, ignore this request, media id is %s", str);
            return 0;
        }
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CDNDownloadServiceSlot", "start failed : %d, media id is :%s", java.lang.Integer.valueOf(i17), str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13094x9254a35e.b(str, 4, i17, null);
            return 0;
        }
        if (gVar != null) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13094x9254a35e.f177049e.Ue(str, gVar.f69496x83ec3dd, gVar.f69500x8ab84c59);
            } catch (android.os.RemoteException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CDNDownloadServiceSlot", "updateProgressChange: " + e17);
            }
            return 0;
        }
        if (hVar != null) {
            int i18 = hVar.f69553xb5f54fe9;
            if (i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CDNDownloadServiceSlot", "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", str, java.lang.Integer.valueOf(i18), hVar);
                com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13094x9254a35e.b(str, 4, hVar.f69553xb5f54fe9, null);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadServiceSlot", "cdn trans suceess, media id : %s", str);
                com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13094x9254a35e.b(str, 3, 0, null);
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
