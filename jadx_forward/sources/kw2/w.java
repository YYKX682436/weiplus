package kw2;

/* loaded from: classes15.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kw2.y f394642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394643e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(kw2.y yVar, java.lang.String str) {
        super(0);
        this.f394642d = yVar;
        this.f394643e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        kw2.y yVar = this.f394642d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = yVar.f394649b;
        java.lang.String str = this.f394643e;
        kw2.e eVar = (kw2.e) concurrentHashMap.get(str);
        if (eVar != null) {
            eVar.I = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNetworkFlowReport", "PRERENDER_stopPreRenderForPlayerStop " + eVar.Q + ' ' + str + " item:" + eVar);
            eVar.E = true;
            if (eVar.f394488a == 4 || eVar.f394487J) {
                yVar.f394649b.remove(str);
                yVar.f(eVar, "stopPreRenderForPlayerStop");
            }
        }
        return jz5.f0.f384359a;
    }
}
