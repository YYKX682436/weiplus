package kw2;

/* loaded from: classes15.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kw2.y f394625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394626e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.i3 f394627f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f394628g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f394629h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kw2.f f394630i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(kw2.y yVar, java.lang.String str, so2.i3 i3Var, long j17, long j18, kw2.f fVar) {
        super(0);
        this.f394625d = yVar;
        this.f394626e = str;
        this.f394627f = i3Var;
        this.f394628g = j17;
        this.f394629h = j18;
        this.f394630i = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f394625d.f394650c;
        java.lang.String str = this.f394626e;
        kw2.h hVar = (kw2.h) concurrentHashMap.get(str);
        if (hVar != null) {
            kw2.y yVar = this.f394625d;
            so2.i3 i3Var = this.f394627f;
            long j17 = this.f394628g;
            long j18 = this.f394629h;
            kw2.f fVar = this.f394630i;
            boolean z17 = hVar.f394552c;
            java.util.ArrayList arrayList = hVar.f394555f;
            if (!z17 && !arrayList.isEmpty()) {
                hVar.f394552c = true;
                kw2.e eVar = (kw2.e) kz5.n0.i0(arrayList);
                if (!eVar.A) {
                    kw2.y.b(yVar, hVar, eVar, i3Var, j17, j18, true, fVar, "onPlayerStop");
                }
                kw2.y.a(yVar, str, hVar, "onPlayerStop");
            } else if (hVar.f394554e && arrayList.isEmpty()) {
                yVar.f394650c.remove(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderNetworkFlowReport", "PLAY_onPlayerStop pre render item remove " + str + ' ' + yVar.g() + ' ' + hVar);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderNetworkFlowReport", "PLAY_onPlayerStop invalid item " + str + ' ' + hVar);
            }
        }
        return jz5.f0.f384359a;
    }
}
