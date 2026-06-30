package re2;

/* loaded from: classes2.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re2.w f476013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f476014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f476015f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(re2.w wVar, yz5.l lVar, yz5.l lVar2) {
        super(1);
        this.f476013d = wVar;
        this.f476014e = lVar;
        this.f476015f = lVar2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String remoteUrl = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remoteUrl, "remoteUrl");
        re2.w wVar = this.f476013d;
        re2.q qVar = new re2.q(wVar, this.f476014e, remoteUrl);
        re2.r rVar = new re2.r(wVar, this.f476015f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doReport: objectId=");
        long j17 = wVar.f476028a;
        sb6.append(j17);
        sb6.append(", url=");
        sb6.append(r26.p0.E0(remoteUrl, 80));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveAvatarMerger", sb6.toString());
        re2.m mVar = new re2.m(qVar);
        re2.n nVar = new re2.n(rVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveRequestHelper", "mergeAvatars: objectId=" + j17 + ", url=" + r26.p0.E0(remoteUrl, 80));
        new ek2.s(remoteUrl, j17, new re2.c1(j17, mVar, nVar)).l();
        return jz5.f0.f384359a;
    }
}
