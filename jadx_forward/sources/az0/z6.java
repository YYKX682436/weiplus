package az0;

/* loaded from: classes5.dex */
public final class z6 implements com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f97639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete f97640b;

    public z6(long j17, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete) {
        this.f97639a = j17;
        this.f97640b = onComplete;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete
    /* renamed from: onComplete */
    public final void mo9331x815f5438(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        long j17 = this.f97639a;
        bz0.b bVar = bz0.b.f118257a;
        if (c4093x6b88526b != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MaasMovieSessionManager", c4093x6b88526b.f129708ec + ' ' + c4093x6b88526b.f16057x38eb0007, new java.lang.Throwable());
            bz0.b.b(bVar, "203", c4093x6b88526b, java.lang.System.currentTimeMillis() - j17, 0, 8, null);
        } else {
            bVar.c("203", java.lang.System.currentTimeMillis() - j17, bz0.a.f118256b);
        }
        this.f97640b.mo9331x815f5438(c4093x6b88526b);
    }
}
