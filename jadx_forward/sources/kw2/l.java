package kw2;

/* loaded from: classes15.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kw2.y f394577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394578e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f394579f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.i3 f394580g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f394581h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f394582i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kw2.f f394583m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(kw2.y yVar, java.lang.String str, boolean z17, so2.i3 i3Var, long j17, long j18, kw2.f fVar) {
        super(0);
        this.f394577d = yVar;
        this.f394578e = str;
        this.f394579f = z17;
        this.f394580g = i3Var;
        this.f394581h = j17;
        this.f394582i = j18;
        this.f394583m = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        kw2.y yVar;
        java.lang.String str;
        jz5.f0 f0Var;
        kw2.y yVar2 = this.f394577d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = yVar2.f394650c;
        java.lang.String str2 = this.f394578e;
        kw2.h hVar = (kw2.h) concurrentHashMap.get(str2);
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (hVar != null) {
            kw2.y yVar3 = this.f394577d;
            so2.i3 i3Var = this.f394580g;
            long j17 = this.f394581h;
            long j18 = this.f394582i;
            kw2.f fVar = this.f394583m;
            if (!hVar.f394552c) {
                java.util.ArrayList arrayList = hVar.f394555f;
                if (!arrayList.isEmpty()) {
                    kw2.e eVar = (kw2.e) kz5.n0.i0(arrayList);
                    if (eVar.A) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderNetworkFlowReport", "PLAY_onPlayerPause invalid item stopPlayHit " + eVar.Q + "  " + hVar);
                        yVar = yVar2;
                        str = "FinderNetworkFlowReport";
                    } else {
                        boolean z17 = this.f394579f;
                        yVar = yVar2;
                        if (z17) {
                            eVar.O = c01.id.a();
                        }
                        str = "FinderNetworkFlowReport";
                        kw2.y.b(yVar3, hVar, eVar, i3Var, j17, j18, !z17, fVar, "onPlayerPause");
                    }
                    f0Var = f0Var2;
                }
            }
            yVar = yVar2;
            str = "FinderNetworkFlowReport";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "PLAY_onPlayerPause invalid item hitStop " + str2 + ' ' + hVar);
            f0Var = f0Var2;
        } else {
            yVar = yVar2;
            str = "FinderNetworkFlowReport";
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "PLAY_onPlayerPause invalid item " + str2 + ' ' + yVar);
        }
        return f0Var2;
    }
}
