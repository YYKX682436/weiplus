package kw2;

/* loaded from: classes15.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek4.b f394603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kw2.y f394604e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394605f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f394606g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kw2.f f394607h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ek4.b bVar, kw2.y yVar, java.lang.String str, long j17, kw2.f fVar) {
        super(0);
        this.f394603d = bVar;
        this.f394604e = yVar;
        this.f394605f = str;
        this.f394606g = j17;
        this.f394607h = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ek4.b bVar = this.f394603d;
        sb6.append(bVar.f335162f);
        sb6.append('.');
        int i17 = bVar.f335157a;
        kw2.y yVar = this.f394604e;
        sb6.append(yVar.d(i17));
        sb6.append('.');
        java.lang.String str = this.f394605f;
        jz5.f0 f0Var = null;
        sb6.append(hc2.b0.k(str, 0, 0, 3, null));
        java.lang.String sb7 = sb6.toString();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = yVar.f394650c;
        kw2.h hVar = (kw2.h) concurrentHashMap.get(str);
        if (hVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderNetworkFlowReport", "PLAY_onPlayerPrepare " + sb7 + " invalid item " + hVar);
        }
        kw2.e a17 = kw2.e.V.a(this.f394606g, str, bVar);
        kw2.h hVar2 = new kw2.h(false, false, false, false, false, new java.util.ArrayList());
        hVar2.f394550a = true;
        kw2.f fVar = this.f394607h;
        if (fVar != null) {
            fVar.a(new kw2.n(sb7, a17));
        }
        kw2.e eVar = (kw2.e) yVar.f394649b.get(str);
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (eVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNetworkFlowReport", "PLAY_onPlayerPrepare#hitPreRender " + sb7 + ' ' + a17);
            hVar2.f394554e = true;
            concurrentHashMap.put(str, hVar2);
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            a17.f394513z = true;
            a17.f394505r = c01.id.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sb7, "<set-?>");
            a17.Q = sb7;
            hVar2.f394553d = i17 == 2;
            hVar2.f394555f.add(a17);
            concurrentHashMap.put(str, hVar2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNetworkFlowReport", "PLAY_onPlayerPrepare#itembegin " + sb7 + ' ' + a17);
        }
        return f0Var2;
    }
}
