package nv3;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: l, reason: collision with root package name */
    public static final nv3.d f422191l = new nv3.d(null);

    /* renamed from: a, reason: collision with root package name */
    public final im5.b f422192a;

    /* renamed from: b, reason: collision with root package name */
    public final int f422193b;

    /* renamed from: c, reason: collision with root package name */
    public long f422194c;

    /* renamed from: d, reason: collision with root package name */
    public final int f422195d;

    /* renamed from: e, reason: collision with root package name */
    public final int f422196e;

    /* renamed from: f, reason: collision with root package name */
    public final int f422197f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f422198g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f422199h;

    /* renamed from: i, reason: collision with root package name */
    public wt3.i0 f422200i;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f422201j;

    /* renamed from: k, reason: collision with root package name */
    public int f422202k;

    public f(im5.b lifeCycleKeeper, int i17, long j17, int i18, int i19, int i27, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, wt3.i0 i0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifeCycleKeeper, "lifeCycleKeeper");
        this.f422192a = lifeCycleKeeper;
        this.f422193b = i17;
        this.f422194c = j17;
        this.f422195d = i18;
        this.f422196e = i19;
        this.f422197f = i27;
        this.f422198g = gVar;
        this.f422199h = gVar2;
        this.f422200i = i0Var;
    }

    public final void a(boolean z17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.util.List list) {
        java.util.ArrayList arrayList;
        if (z17) {
            this.f422201j = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("GetListenVideoBgmList bgmListType:");
        sb6.append(this.f422195d);
        sb6.append(" loadFirstPage:");
        sb6.append(z17);
        sb6.append(" cgiSessionBuffer:");
        sb6.append(this.f422201j != null);
        sb6.append(" idList:");
        if (list != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((java.lang.String) it.next());
            }
        } else {
            arrayList = null;
        }
        sb6.append(arrayList);
        sb6.append(" hasCurrentClassifyResultData:");
        sb6.append(gVar != null);
        sb6.append(" hasInnerClassifyResultData:");
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f422198g;
        sb6.append(gVar2 != null);
        sb6.append(" hasPromptRawText:");
        sb6.append(this.f422199h != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GetListenVideoBgmListHelper", sb6.toString());
        nv3.d dVar = f422191l;
        wt3.i0 i0Var = this.f422200i;
        org.json.JSONObject a17 = nv3.d.a(dVar, i0Var != null ? i0Var.mo68371x19263085() : null, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.g0();
        g0Var.f391654d = java.lang.System.currentTimeMillis();
        pq5.g l17 = new jv3.a(this.f422195d, this.f422193b, this.f422201j, this.f422194c, gVar == null ? gVar2 : gVar, null, list, a17.toString(), null, null, this.f422196e, this.f422202k, this.f422197f, this.f422199h, 800, null).l();
        if (l17 != null) {
            l17.f(this.f422192a);
            l17.h(new nv3.e(g0Var, this, z17));
        }
    }

    public /* synthetic */ f(im5.b bVar, int i17, long j17, int i18, int i19, int i27, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, wt3.i0 i0Var, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(bVar, i17, j17, (i28 & 8) != 0 ? 1 : i18, (i28 & 16) != 0 ? 0 : i19, (i28 & 32) != 0 ? 0 : i27, (i28 & 64) != 0 ? null : gVar, (i28 & 128) != 0 ? null : gVar2, (i28 & 256) != 0 ? null : i0Var);
    }
}
