package az0;

/* loaded from: classes5.dex */
public final class h6 implements com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnRecommendComplete {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f97062a;

    public h6(p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f97062a = qVar;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnRecommendComplete
    /* renamed from: onRecommendComplete */
    public final void mo9346x7c9af5f6(com.p314xaae8f345.p457x3304c6.p477x633fb29.C4123xc221bdc2 c4123xc221bdc2, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recommendNext: onRecommend result, err:");
        sb6.append(c4093x6b88526b != null ? c4093x6b88526b.f16057x38eb0007 : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMovieSessionManager", sb6.toString());
        p3325xe03a0797.p3326xc267989b.q qVar = this.f97062a;
        if (c4093x6b88526b == null) {
            ((p3325xe03a0797.p3326xc267989b.r) qVar).s(c4123xc221bdc2, null);
        } else {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.IllegalStateException("recommend error"))));
        }
    }
}
