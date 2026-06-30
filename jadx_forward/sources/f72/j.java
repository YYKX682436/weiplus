package f72;

/* loaded from: classes12.dex */
public abstract class j implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final long f341580d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f341581e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f341582f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1406x7643c6b5.C13519x2c4403b8 f341583g;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1406x7643c6b5.C13519x2c4403b8 c13519x2c4403b8, android.content.Intent intent, f72.i iVar) {
        this.f341583g = c13519x2c4403b8;
        this.f341580d = -1L;
        this.f341581e = null;
        this.f341582f = null;
        this.f341582f = intent.getStringExtra("key_video_file_name");
        this.f341580d = intent.getLongExtra("k_bio_id", -1L);
        this.f341581e = intent.getStringExtra("key_app_id");
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    public abstract com.p314xaae8f345.mm.p944x882e457a.m1 a(dn.h hVar);

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceUploadVideoService", "hy: sceneResult.field_retCode == 0 cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
        long j17 = this.f341580d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1406x7643c6b5.C13519x2c4403b8 c13519x2c4403b8 = this.f341583g;
        if (hVar == null || hVar.f69553xb5f54fe9 != 0) {
            java.lang.String str2 = this.f341582f;
            if (hVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceUploadVideoService", "hy: upload video cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
                com.p314xaae8f345.mm.vfs.w6.h(str2);
                vz2.c.i(c13519x2c4403b8.f181580i, hVar.f69553xb5f54fe9, "cdn error retCode");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(917L, 24L, 1L, false);
                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13516xe45e9481.d(j17, 1, hVar.f69553xb5f54fe9);
                return 0;
            }
            if (i17 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceUploadVideoService", "hy: upload video start error!; cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
                com.p314xaae8f345.mm.vfs.w6.h(str2);
                vz2.c.i(c13519x2c4403b8.f181580i, i17, "cdn error startRet");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(917L, 24L, 1L, false);
                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13516xe45e9481.d(j17, 1, i17);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceUploadVideoService", "hy: upload video done. now upload");
            vz2.c.i(c13519x2c4403b8.f181580i, 0, ya.b.f77504xbb80cbe3);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(917L, 23L, 1L, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13516xe45e9481.d(j17, 0, 0);
            com.p314xaae8f345.mm.p944x882e457a.m1 a17 = a(hVar);
            gm0.j1.d().a(a17.mo808xfb85f7b0(), c13519x2c4403b8);
            gm0.j1.d().g(a17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceUploadVideoService", "hy: upload video request send: " + a17.mo808xfb85f7b0());
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
