package dz0;

/* loaded from: classes5.dex */
public final class r1 implements com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b f326530a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f326531b;

    public r1(com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b, az0.n7 n7Var) {
        this.f326530a = c11015x5b190a3b;
        this.f326531b = n7Var;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete
    /* renamed from: onComplete */
    public final void mo9331x815f5438(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasSdkUIC", "recommend with blank onComplete " + c4093x6b88526b);
        if (c4093x6b88526b == null) {
            com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b = this.f326530a;
            c11015x5b190a3b.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasSdkUIC", "triggerRecommend: ");
            pf5.e.m158343xd39de650(c11015x5b190a3b, null, null, new dz0.p2(this.f326531b, c11015x5b190a3b, null), 3, null);
        }
    }
}
