package re2;

/* loaded from: classes2.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re2.w f476021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f476022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f476023f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(re2.w wVar, yz5.l lVar, yz5.l lVar2) {
        super(1);
        this.f476021d = wVar;
        this.f476022e = lVar;
        this.f476023f = lVar2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String mergedFilePath = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mergedFilePath, "mergedFilePath");
        re2.w wVar = this.f476021d;
        yz5.l lVar = this.f476022e;
        yz5.l lVar2 = this.f476023f;
        re2.s sVar = new re2.s(wVar, lVar, lVar2);
        re2.t tVar = new re2.t(wVar, lVar2);
        wVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveAvatarMerger", "doUpload: path=".concat(mergedFilePath));
        p3325xe03a0797.p3326xc267989b.l.d(wVar.f476032e, null, null, new re2.p(mergedFilePath, wVar, sVar, tVar, null), 3, null);
        return jz5.f0.f384359a;
    }
}
