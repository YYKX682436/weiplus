package kw2;

/* loaded from: classes15.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f394637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394638e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ek4.b f394639f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.i3 f394640g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kw2.y f394641h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(long j17, java.lang.String str, ek4.b bVar, so2.i3 i3Var, kw2.y yVar) {
        super(0);
        this.f394637d = j17;
        this.f394638e = str;
        this.f394639f = bVar;
        this.f394640g = i3Var;
        this.f394641h = yVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        kw2.e eVar;
        jz5.f0 f0Var;
        kw2.e eVar2;
        kw2.d dVar = kw2.e.V;
        long j17 = this.f394637d;
        java.lang.String str = this.f394638e;
        ek4.b bVar = this.f394639f;
        kw2.e a17 = dVar.a(j17, str, bVar);
        java.lang.String str2 = bVar.f335162f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
        a17.Q = str2;
        a17.F = this.f394640g.f68968x799e9d9e;
        kw2.y yVar = this.f394641h;
        kw2.e eVar3 = (kw2.e) yVar.f394648a.get(str);
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = yVar.f394648a;
        if (eVar3 != null) {
            eVar = a17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderNetworkFlowReport", "PRELOAD_startPreload " + eVar3.Q + " duplicated recentRecordDiffMs:" + (c01.id.a() - eVar3.f394510w) + " mediaId:" + str + " feedId:" + pm0.v.u(j17) + " startRecordMs:" + eVar3.f394510w + " size:" + concurrentHashMap.size() + " list:");
            f0Var = f0Var2;
        } else {
            eVar = a17;
            f0Var = null;
        }
        if (f0Var == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PRELOAD_startPreload ");
            eVar2 = eVar;
            sb6.append(eVar2.Q);
            sb6.append(" mediaId:");
            sb6.append(str);
            sb6.append(" feedId:");
            sb6.append(pm0.v.u(j17));
            sb6.append(" size:");
            sb6.append(concurrentHashMap.size());
            sb6.append(" list:");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNetworkFlowReport", sb6.toString());
        } else {
            eVar2 = eVar;
        }
        concurrentHashMap.put(str, eVar2);
        return f0Var2;
    }
}
