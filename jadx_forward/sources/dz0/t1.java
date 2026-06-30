package dz0;

/* loaded from: classes5.dex */
public final class t1 implements com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b f326547a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f326548b;

    public t1(com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b, az0.n7 n7Var) {
        this.f326547a = c11015x5b190a3b;
        this.f326548b = n7Var;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete
    /* renamed from: onComplete */
    public final void mo9331x815f5438(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 m33862x16a99dbd;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasSdkUIC", "performCreationWithTemplate: onComplete " + c4093x6b88526b);
        if (c4093x6b88526b == null) {
            com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b = this.f326547a;
            c11015x5b190a3b.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasSdkUIC", "triggerRecommend: ");
            az0.n7 n7Var = this.f326548b;
            java.lang.String str = null;
            pf5.e.m158343xd39de650(c11015x5b190a3b, null, null, new dz0.p2(n7Var, c11015x5b190a3b, null), 3, null);
            com.p314xaae8f345.p457x3304c6.p477x633fb29.C4117x106cc6f6 m33392xd96d6d9c = n7Var.f97275a.m33392xd96d6d9c();
            if (m33392xd96d6d9c != null && (m33862x16a99dbd = m33392xd96d6d9c.m33862x16a99dbd()) != null) {
                str = m33862x16a99dbd.m33856x92013dca();
            }
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = c11015x5b190a3b.f151327r;
            java.lang.String str3 = c11015x5b190a3b.f151328s;
            c11015x5b190a3b.f151330u.put(str2 + '-' + str3, str);
        }
    }
}
