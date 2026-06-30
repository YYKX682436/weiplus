package az0;

/* loaded from: classes5.dex */
public final class o5 implements com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTemplateBuildComplete {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f97305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete f97306b;

    public o5(yz5.p pVar, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete) {
        this.f97305a = pVar;
        this.f97306b = onComplete;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTemplateBuildComplete
    /* renamed from: onTemplateBuildComplete */
    public final void mo9364x50d7face(com.p314xaae8f345.p457x3304c6.p477x633fb29.C4119x51ad3274 c4119x51ad3274, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("buildTemplate onComplete: err:");
        sb6.append(c4093x6b88526b != null ? c4093x6b88526b.f16057x38eb0007 : null);
        sb6.append(", ");
        sb6.append(c4119x51ad3274 != null ? c4119x51ad3274.m33880x3bfa572b() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMovieSessionManager", sb6.toString());
        this.f97305a.mo149xb9724478(c4119x51ad3274, c4093x6b88526b);
        this.f97306b.mo9331x815f5438(c4093x6b88526b);
    }
}
