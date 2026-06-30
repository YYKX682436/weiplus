package pv3;

/* loaded from: classes5.dex */
public final class d implements c50.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440119a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f440120b;

    public d(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a) {
        this.f440119a = str;
        this.f440120b = c16997xb0aa383a;
    }

    @Override // c50.z0
    public void a(long j17, int i17, java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        pv3.f fVar = pv3.f.f440122a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MusicCacheManager", "[onDownloadFinished] feedId:" + this.f440119a + " ret:" + i17 + " path:" + path + " isFileLegal:" + fVar.d(path));
        pv3.f.f440125d.remove(java.lang.Long.valueOf(j17));
        if (i17 == 0) {
            fVar.c(j17, path, this.f440120b);
        } else {
            fVar.e(false, new lv3.a(j17, "", 0L));
        }
    }

    @Override // c50.z0
    public void b(long j17, long j18, long j19) {
    }
}
