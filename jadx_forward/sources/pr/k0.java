package pr;

/* loaded from: classes15.dex */
public final class k0 implements pr.b1 {

    /* renamed from: q, reason: collision with root package name */
    public static final pr.z f439256q = new pr.z(null);

    /* renamed from: r, reason: collision with root package name */
    public static final pr.e0 f439257r = new pr.w();

    /* renamed from: s, reason: collision with root package name */
    public static final pr.e0 f439258s = new pr.v();

    /* renamed from: t, reason: collision with root package name */
    public static final jz5.g f439259t = jz5.h.b(pr.y.f439332d);

    /* renamed from: u, reason: collision with root package name */
    public static final jz5.g f439260u = jz5.h.b(pr.x.f439328d);

    /* renamed from: a, reason: collision with root package name */
    public final pr.d0 f439261a;

    /* renamed from: b, reason: collision with root package name */
    public final pr.c0 f439262b;

    /* renamed from: d, reason: collision with root package name */
    public int f439264d;

    /* renamed from: f, reason: collision with root package name */
    public int f439266f;

    /* renamed from: g, reason: collision with root package name */
    public int f439267g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f439268h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f439269i;

    /* renamed from: m, reason: collision with root package name */
    public int f439273m;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f439263c = "MicroMsg.EmojiSyncLoader";

    /* renamed from: e, reason: collision with root package name */
    public int f439265e = -1;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f439270j = java.util.Collections.synchronizedList(new java.util.LinkedList());

    /* renamed from: k, reason: collision with root package name */
    public final java.util.LinkedList f439271k = new java.util.LinkedList();

    /* renamed from: l, reason: collision with root package name */
    public final pr.a1 f439272l = new pr.a1(3);

    /* renamed from: n, reason: collision with root package name */
    public final pr.h0 f439274n = new pr.h0(this);

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Boolean[] f439275o = {java.lang.Boolean.FALSE};

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Byte[] f439276p = new java.lang.Byte[0];

    public k0(pr.d0 d0Var, pr.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f439261a = d0Var;
        this.f439262b = c0Var;
    }

    @Override // pr.b1
    public int a() {
        if (this.f439269i) {
            return Integer.MAX_VALUE;
        }
        return this.f439265e;
    }

    @Override // pr.b1
    public void b(boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            if (gm0.j1.a()) {
                pm0.v.L("EmojiSyncLoader_checkSyncEmoji", true, new pr.g0(this, z17));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f439263c, "checkSyncEmoji(%s): account was not ready, ignore rest logic.", java.lang.Boolean.valueOf(z17));
            }
        }
    }

    @Override // pr.b1
    public boolean c() {
        return !this.f439269i;
    }

    @Override // pr.b1
    public void d(pr.e0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        pm0.v.X(new pr.j0(this, callback));
    }

    @Override // pr.b1
    /* renamed from: destroy */
    public void mo158865x5cd39ffa() {
        if (this.f439275o[0].booleanValue()) {
            synchronized (this.f439275o) {
                if (this.f439275o[0].booleanValue()) {
                    synchronized (this.f439276p) {
                        try {
                            pr.a1 a1Var = this.f439272l;
                            a1Var.f439222a.clear();
                            for (java.util.Map.Entry entry : a1Var.f439223b.entrySet()) {
                            }
                            this.f439272l.f439224c = null;
                        } finally {
                        }
                    }
                    this.f439275o[0] = java.lang.Boolean.FALSE;
                }
            }
        }
    }

    @Override // pr.b1
    public void e() {
        synchronized (this.f439276p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f439263c, "loadMore: " + this.f439268h + ", " + this.f439269i);
            boolean z17 = false;
            if (this.f439269i) {
                this.f439268h = false;
            } else if (!this.f439268h) {
                z17 = true;
            }
            if (z17) {
                pr.c0 c0Var = this.f439262b;
                int i17 = this.f439266f;
                ((pr.a0) c0Var).getClass();
                this.f439266f = i17 + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_sync_more_count, 120);
                h();
            }
        }
    }

    @Override // pr.b1
    public void f(pr.e0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        pm0.v.X(new pr.i0(this, callback));
    }

    @Override // pr.b1
    public int g() {
        if (this.f439269i) {
            return Integer.MAX_VALUE;
        }
        return this.f439266f;
    }

    public final void h() {
        java.util.List a17 = this.f439261a.a();
        this.f439267g = a17.size();
        int min = java.lang.Math.min(this.f439266f, a17.size());
        this.f439266f = min;
        if (this.f439264d > min) {
            this.f439264d = min;
        }
        int i17 = this.f439264d;
        if (min > i17) {
            this.f439268h = true;
        }
        if (!this.f439268h && min == this.f439267g) {
            this.f439269i = true;
        }
        this.f439265e = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f439263c, "startInternal: " + this.f439264d + ", " + this.f439266f + ", " + this.f439267g + ", " + this.f439265e + ", " + this.f439268h + ", " + this.f439269i);
        java.util.List subList = a17.subList(this.f439264d, this.f439266f);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(subList, 10));
        int i18 = 0;
        for (java.lang.Object obj : subList) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) obj;
            this.f439270j.add(c21053xdbf1e5f4.mo42933xb5885648());
            arrayList.add(new pr.u0(c21053xdbf1e5f4, i18 + this.f439264d));
            i18 = i19;
        }
        pr.a1 a1Var = this.f439272l;
        a1Var.getClass();
        pm0.v.X(new pr.z0(a1Var, arrayList));
    }

    @Override // pr.b1
    /* renamed from: init */
    public void mo158866x316510() {
        if (this.f439275o[0].booleanValue()) {
            return;
        }
        synchronized (this.f439275o) {
            if (!this.f439275o[0].booleanValue()) {
                synchronized (this.f439276p) {
                    this.f439272l.f439224c = this.f439274n;
                    this.f439266f = ((pr.a0) this.f439262b).a();
                }
                b(false);
                this.f439275o[0] = java.lang.Boolean.TRUE;
            }
        }
    }
}
