package kw2;

/* loaded from: classes15.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kw2.y f394558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394559e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dn.h f394560f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kw2.y yVar, java.lang.String str, dn.h hVar) {
        super(0);
        this.f394558d = yVar;
        this.f394559e = str;
        this.f394560f = hVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        kw2.y yVar = this.f394558d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = yVar.f394649b;
        java.lang.String str = this.f394559e;
        kw2.e eVar = (kw2.e) concurrentHashMap.get(str);
        if (eVar != null) {
            eVar.f394487J = true;
            dn.h hVar = this.f394560f;
            long j17 = hVar.f69548xe026fea1;
            eVar.H = j17;
            eVar.G = eVar.F + j17;
            if (hVar.f69553xb5f54fe9 == 0) {
                eVar.M = true;
            }
            if (!eVar.N) {
                yVar.c(j17);
                kw2.e.V.e(eVar, hVar);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNetworkFlowReport", "PRERENDER_handleDownloaderComeStopStateInPreRender update:" + eVar.N + ' ' + eVar.Q + ' ' + str + " item:" + eVar);
            eVar.E = true;
            if (eVar.I) {
                concurrentHashMap.remove(str);
                yVar.f(eVar, "handleDownloaderComeStopStateInPreRender");
            }
        }
        return jz5.f0.f384359a;
    }
}
