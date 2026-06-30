package zs2;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public r45.mt2 f556779a;

    /* renamed from: b, reason: collision with root package name */
    public int f556780b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.ArrayList f556781c;

    /* renamed from: d, reason: collision with root package name */
    public jz5.l f556782d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f556783e;

    /* renamed from: f, reason: collision with root package name */
    public int f556784f;

    public c() {
        r45.mt2 mt2Var = new r45.mt2();
        this.f556779a = mt2Var;
        this.f556780b = mt2Var.m75939xb282bd08(4);
        this.f556781c = new java.util.ArrayList();
        this.f556783e = "";
    }

    public final km2.m a() {
        int size = this.f556781c.size();
        int i17 = this.f556780b;
        boolean z17 = false;
        if (i17 >= 0 && i17 < size) {
            z17 = true;
        }
        if (z17) {
            return (km2.m) this.f556781c.get(i17);
        }
        return null;
    }

    public final void b(int i17) {
        gk2.e eVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderReplayLiveData", "set curPos:" + i17);
        km2.m a17 = a();
        ct2.j jVar = (a17 == null || (eVar = a17.f390663e) == null) ? null : (ct2.j) eVar.a(ct2.j.class);
        if (jVar != null) {
            jVar.A = i17;
        }
        this.f556780b = i17;
    }

    public final void c(jz5.l lVar) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("FinderReplayLiveData", "fromFloatInfo:" + this.f556782d + " -> " + lVar, new java.lang.Object[0]);
        this.f556782d = lVar;
    }
}
