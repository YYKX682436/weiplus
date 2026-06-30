package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public final class o1 implements zb5.d {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f283921d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f283922e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f283923f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f283924g;

    /* renamed from: h, reason: collision with root package name */
    public int f283925h;

    /* renamed from: i, reason: collision with root package name */
    public zb5.e f283926i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f283927m;

    /* renamed from: n, reason: collision with root package name */
    public long f283928n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f283929o;

    /* renamed from: p, reason: collision with root package name */
    public long f283930p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f283931q;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f283932r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String[] f283933s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String[] f283934t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f283935u;

    public o1(android.content.Context context, java.lang.String talker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        this.f283921d = context;
        this.f283922e = talker;
        this.f283927m = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f283929o = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f283931q = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f283932r = new int[]{754974769, 1241514033};
        this.f283933s = new java.lang.String[]{"msgId", "createTime"};
        this.f283934t = new java.lang.String[]{"msgId", "type", "createTime", "talker", "content", "isSend", "reserved", "flag", "status"};
        this.f283935u = jz5.h.b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n1.f283887d);
    }

    public static final r45.bu2 c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o1 o1Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String j17;
        ot0.q v17;
        zy2.i iVar;
        r45.kv2 kv2Var;
        if (o1Var.f283927m.get() || (j17 = f9Var.j()) == null || (v17 = ot0.q.v(j17)) == null) {
            return null;
        }
        int i17 = v17.f430199i;
        if (!(i17 == 51 || i17 == 129) || (iVar = (zy2.i) v17.y(zy2.i.class)) == null || (kv2Var = iVar.f558944b) == null) {
            return null;
        }
        r45.bu2 bu2Var = new r45.bu2();
        bu2Var.set(0, java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        bu2Var.set(3, f9Var.Q0());
        bu2Var.set(1, java.lang.Long.valueOf(f9Var.mo78012x3fdd41df()));
        bu2Var.set(2, kv2Var);
        return bu2Var;
    }

    public void a(boolean z17) {
        q40.e eVar;
        this.f283928n = java.lang.System.currentTimeMillis();
        this.f283929o.set(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedHistoryListPresenter", "loadData isFirst=" + z17);
        zb5.e eVar2 = this.f283926i;
        if (eVar2 != null && (eVar = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ActivityC21746xa8e928c2) eVar2).f282097f) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.C15104x4e0baa10) eVar).z0();
        }
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.i1(this, z17));
    }

    public final boolean d(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return false;
        }
        java.util.regex.Matcher matcher = ((java.util.regex.Pattern) ((jz5.n) this.f283935u).mo141623x754a37bb()).matcher(str2);
        boolean z17 = false;
        while (matcher.find()) {
            java.lang.String group = matcher.group();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(group);
            boolean y17 = r26.i0.y(group, str, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedHistoryListPresenter", "[isContains] search=" + str + " group=" + group);
            if (y17) {
                return y17;
            }
            z17 = y17;
        }
        return z17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z
    /* renamed from: onDetach */
    public void mo79813x3f5eee52() {
        this.f283927m.set(true);
        if (this.f283928n != 0) {
            boolean z17 = this.f283929o.get();
            long currentTimeMillis = z17 ? this.f283930p : java.lang.System.currentTimeMillis() - this.f283928n;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedHistoryListPresenter", "[loadData][perf] exit, completed:%s, cost:%dms", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(currentTimeMillis));
            java.util.List list = this.f283924g;
            int size = list != null ? list.size() : 0;
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m1(z17, currentTimeMillis, this.f283922e, size));
        }
        zb5.e eVar = this.f283926i;
        if (eVar != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ActivityC21746xa8e928c2) eVar).f282095d = null;
        }
        this.f283926i = null;
        de5.a aVar = de5.a.f310929a;
        aVar.l("");
        aVar.j(21, 6);
    }
}
