package kw2;

/* loaded from: classes15.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kw2.g f394586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394587e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kw2.e f394588f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(kw2.g gVar, java.lang.String str, kw2.e eVar) {
        super(0);
        this.f394586d = gVar;
        this.f394587e = str;
        this.f394588f = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        kw2.g gVar = this.f394586d;
        if (gVar.f394546a) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PLAY_onPlayerPrepare#onDownloaderStart ");
            sb6.append(this.f394587e);
            sb6.append(' ');
            kw2.e eVar = this.f394588f;
            sb6.append(eVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNetworkFlowReport", sb6.toString());
            eVar.B = true;
            eVar.C = false;
            kw2.e.V.c(eVar, gVar.f394547b);
        }
        return jz5.f0.f384359a;
    }
}
