package kw2;

/* loaded from: classes15.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f394631d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394632e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ek4.b f394633f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394634g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ so2.i3 f394635h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kw2.y f394636i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(long j17, java.lang.String str, ek4.b bVar, java.lang.String str2, so2.i3 i3Var, kw2.y yVar) {
        super(0);
        this.f394631d = j17;
        this.f394632e = str;
        this.f394633f = bVar;
        this.f394634g = str2;
        this.f394635h = i3Var;
        this.f394636i = yVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        jz5.f0 f0Var2;
        kw2.d dVar = kw2.e.V;
        long j17 = this.f394631d;
        java.lang.String str4 = this.f394632e;
        ek4.b bVar = this.f394633f;
        kw2.e a17 = dVar.a(j17, str4, bVar);
        a17.D = true;
        java.lang.String str5 = this.f394634g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str5, "<set-?>");
        a17.Q = str5;
        int i17 = bVar.f335157a;
        if (i17 == 4) {
            a17.L = true;
        }
        dVar.c(a17, this.f394635h);
        kw2.y yVar = this.f394636i;
        kw2.e eVar = (kw2.e) yVar.f394649b.get(str4);
        jz5.f0 f0Var3 = jz5.f0.f384359a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = yVar.f394649b;
        if (eVar != null) {
            long a18 = c01.id.a() - eVar.f394510w;
            f0Var = f0Var3;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PRERENDER_startPreRender ");
            concurrentHashMap = concurrentHashMap2;
            str = "PRERENDER_startPreRender ";
            sb6.append(yVar.d(i17));
            sb6.append(' ');
            sb6.append(str5);
            sb6.append(" duplicated recentRecordDiffMs:");
            sb6.append(a18);
            sb6.append(" mediaId:");
            sb6.append(str4);
            sb6.append(" feedId:");
            sb6.append(pm0.v.u(j17));
            sb6.append(" startRecordMs:");
            sb6.append(eVar.f394510w);
            str3 = " size:";
            sb6.append(str3);
            sb6.append(concurrentHashMap.size());
            str2 = " list:";
            sb6.append(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderNetworkFlowReport", sb6.toString());
            f0Var2 = f0Var;
        } else {
            f0Var = f0Var3;
            concurrentHashMap = concurrentHashMap2;
            str = "PRERENDER_startPreRender ";
            str2 = " list:";
            str3 = " size:";
            f0Var2 = null;
        }
        if (f0Var2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNetworkFlowReport", str + yVar.d(i17) + ' ' + str5 + " mediaId:" + str4 + " feedId:" + pm0.v.u(j17) + str3 + concurrentHashMap.size() + str2);
        }
        concurrentHashMap.put(str4, a17);
        return f0Var;
    }
}
