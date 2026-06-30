package az0;

/* loaded from: classes5.dex */
public final class b6 implements com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnExportComplete {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 f96892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96893b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ az0.b0 f96894c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f96895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete f96896e;

    public b6(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 c4069xbe747ef4, java.lang.String str, az0.b0 b0Var, long j17, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete) {
        this.f96892a = c4069xbe747ef4;
        this.f96893b = str;
        this.f96894c = b0Var;
        this.f96895d = j17;
        this.f96896e = onComplete;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnExportComplete
    /* renamed from: onExportComplete */
    public final void mo9328xdd715ccc(java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        if (c4093x6b88526b != null) {
            bz0.f.f118268a.a(c4093x6b88526b);
            if (c4093x6b88526b.f129708ec == com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b.MaasEC.VideoEncodeFailed) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MaasMovieSessionManager", "export encode error, mark");
                py0.a0 a0Var = py0.a0.f440499a;
                rg.c a17 = rg.c.a(this.f96892a.m33188xf0ad77e3());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "valueOf(...)");
                a0Var.b(a17);
            }
        } else {
            bz0.f fVar = bz0.f.f118268a;
            java.lang.String videoPath = this.f96893b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
            bz0.f.f118271d = p3325xe03a0797.p3326xc267989b.l.d(bz0.f.f118269b, null, null, new bz0.c(bz0.f.f118271d, videoPath, null), 3, null);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            az0.b0 b0Var = this.f96894c;
            b0Var.getClass();
            b0Var.f96872b = str;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMovieSessionManager", "onExportComplete: " + str);
        bz0.f fVar2 = bz0.f.f118268a;
        bz0.f.f118270c.f140476r = java.lang.System.currentTimeMillis() - this.f96895d;
        this.f96896e.mo9331x815f5438(c4093x6b88526b);
    }
}
