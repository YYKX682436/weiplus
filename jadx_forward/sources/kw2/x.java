package kw2;

/* loaded from: classes15.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kw2.y f394644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394645e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394646f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dn.h f394647g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(kw2.y yVar, java.lang.String str, java.lang.String str2, dn.h hVar) {
        super(0);
        this.f394644d = yVar;
        this.f394645e = str;
        this.f394646f = str2;
        this.f394647g = hVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var;
        kw2.y yVar = this.f394644d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = yVar.f394648a;
        java.lang.String str = this.f394645e;
        kw2.e eVar = (kw2.e) concurrentHashMap.remove(str);
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = yVar.f394648a;
        java.lang.String str2 = this.f394646f;
        if (eVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNetworkFlowReport", "PRELOAD_stopPreload " + eVar.Q + ' ' + str2 + " mediaId:" + str + " size:" + concurrentHashMap2.size());
            kw2.d dVar = kw2.e.V;
            dn.h hVar = this.f394647g;
            dVar.e(eVar, hVar);
            long j17 = hVar.f69549x50119311;
            eVar.f394497j = j17;
            yVar.c(j17);
            yVar.f(eVar, "stopPreload");
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderNetworkFlowReport", "PRELOAD_stopPreload hit null mediaId:" + str + ' ' + str2 + " return for size:" + concurrentHashMap2.size() + " list:");
        }
        return f0Var2;
    }
}
