package h61;

/* loaded from: classes9.dex */
public class f implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h61.h f360677d;

    public f(h61.h hVar) {
        this.f360677d = hVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        if (i17 == -21005) {
            return 0;
        }
        h61.h hVar2 = this.f360677d;
        if (hVar == null || hVar.f69553xb5f54fe9 != 0) {
            if (hVar != null && hVar.f69553xb5f54fe9 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.AAImagUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
                hVar2.f360678a.d(3, -1, "doScene failed");
                return 0;
            }
            if (i17 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.AAImagUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
                hVar2.f360678a.d(3, -1, "doScene failed");
            }
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.AAImagUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
        hVar2.f360678a.a(hVar.f69524x419c440e, 1, hVar.f69560x7b284d5e, 1, "upload_" + str, hVar.f69526x419c9c3d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.AAImagUpload", "uploadsns cdndone pass: " + (java.lang.System.currentTimeMillis() - hVar2.f360681d) + " " + hVar.f69526x419c9c3d);
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
