package kw2;

/* loaded from: classes15.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kw2.y f394616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f394618f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.i3 f394619g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f394620h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ek4.b f394621i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f394622m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kw2.f f394623n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f394624o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(kw2.y yVar, java.lang.String str, long j17, so2.i3 i3Var, boolean z17, ek4.b bVar, long j18, kw2.f fVar, long j19) {
        super(0);
        this.f394616d = yVar;
        this.f394617e = str;
        this.f394618f = j17;
        this.f394619g = i3Var;
        this.f394620h = z17;
        this.f394621i = bVar;
        this.f394622m = j18;
        this.f394623n = fVar;
        this.f394624o = j19;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        kw2.y yVar = this.f394616d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = yVar.f394649b;
        java.lang.String str = this.f394617e;
        kw2.e eVar = (kw2.e) concurrentHashMap.get(str);
        kw2.d dVar = kw2.e.V;
        jz5.f0 f0Var = null;
        so2.i3 i3Var = this.f394619g;
        if (eVar != null) {
            long j17 = this.f394618f;
            if (j17 > 0) {
                eVar.f394494g = j17;
                eVar.f394493f = j17 / 1000;
            }
            eVar.E = true;
            dVar.d(eVar, i3Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNetworkFlowReport", "PRERENDER_stopPreRenderForStartPlay " + eVar.Q + ' ' + str + " item:" + eVar);
        } else {
            eVar = null;
        }
        kw2.h hVar = (kw2.h) yVar.f394650c.get(str);
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (hVar != null) {
            java.util.ArrayList arrayList = hVar.f394555f;
            boolean z17 = (arrayList.isEmpty() ^ true) && !((kw2.e) kz5.n0.i0(arrayList)).A;
            boolean z18 = this.f394620h;
            if (z18 && z17) {
                kw2.e eVar2 = (kw2.e) kz5.n0.i0(arrayList);
                if (z18 && eVar2.O > 0) {
                    eVar2.P += c01.id.a() - eVar2.O;
                    eVar2.O = 0L;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderNetworkFlowReport", "PLAY_onPlayerStart " + str + " isManualStart item " + hVar);
            } else if (!hVar.f394550a || hVar.f394552c) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderNetworkFlowReport", "PLAY_onPlayerStart " + str + " invalid item " + hVar);
            } else if (hVar.f394551b || arrayList.size() != 1) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                ek4.b bVar = this.f394621i;
                sb6.append(yVar.d(bVar.f335157a));
                sb6.append(' ');
                sb6.append(bVar.f335162f);
                sb6.append(' ');
                sb6.append(str);
                java.lang.String sb7 = sb6.toString();
                kw2.e a17 = dVar.a(this.f394622m, str, bVar);
                a17.f394513z = true;
                a17.f394505r = c01.id.a();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sb7, "<set-?>");
                a17.Q = sb7;
                a17.f394512y = arrayList.size();
                if (eVar != null) {
                    hVar.f394554e = false;
                    a17.S = eVar;
                    if (((int) eVar.f394488a) == 5) {
                        a17.B = true;
                        a17.C = false;
                    }
                    dVar.c(a17, i3Var);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNetworkFlowReport", "PLAY_onPlayerStart#hasPreRender " + sb7 + ' ' + a17);
                } else {
                    kw2.f fVar = this.f394623n;
                    if (fVar != null) {
                        fVar.a(new kw2.r(sb7, a17));
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNetworkFlowReport", "PLAY_onPlayerStart#itembegin " + sb7 + ' ' + a17);
                arrayList.add(a17);
            } else {
                hVar.f394551b = true;
                kw2.e eVar3 = (kw2.e) kz5.n0.X(arrayList);
                eVar3.f394513z = true;
                eVar3.f394507t = this.f394624o;
                eVar3.f394512y = 0L;
            }
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderNetworkFlowReport", "PLAY_onPlayerStart invalid item " + str + ' ' + yVar);
        }
        return f0Var2;
    }
}
