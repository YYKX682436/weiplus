package yd5;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: q, reason: collision with root package name */
    public static long f542660q = java.lang.System.currentTimeMillis();

    /* renamed from: r, reason: collision with root package name */
    public static int f542661r;

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f542662a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f542663b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f542664c;

    /* renamed from: d, reason: collision with root package name */
    public final int f542665d;

    /* renamed from: e, reason: collision with root package name */
    public long f542666e;

    /* renamed from: f, reason: collision with root package name */
    public long f542667f;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f542669h;

    /* renamed from: i, reason: collision with root package name */
    public final int f542670i;

    /* renamed from: j, reason: collision with root package name */
    public final long f542671j;

    /* renamed from: m, reason: collision with root package name */
    public long f542674m;

    /* renamed from: n, reason: collision with root package name */
    public long f542675n;

    /* renamed from: o, reason: collision with root package name */
    public long f542676o;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6998xff6719f8 f542668g = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6998xff6719f8();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.HashMap f542672k = new java.util.HashMap();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.HashMap f542673l = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f542677p = new java.util.HashMap();

    public p(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, boolean z17, int i17) {
        this.f542662a = f9Var;
        this.f542663b = str;
        this.f542664c = z17;
        this.f542665d = i17;
        this.f542669h = "";
        if (f9Var != null) {
            this.f542670i = com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(f9Var.Q0()) ? 2 : 1;
            java.lang.String Q0 = f9Var.Q0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
            this.f542669h = Q0;
            this.f542671j = f9Var.I0();
        }
    }

    public final void a() {
        java.lang.String str;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f542662a;
        if (f9Var == null || (str = this.f542663b) == null) {
            return;
        }
        ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
        t21.v2 h17 = t21.d3.h(str);
        if (h17 == null) {
            return;
        }
        t21.j3 d17 = t21.j3.f496333h.d(h17.g());
        boolean z17 = f9Var.A0() == 1;
        boolean N4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(f9Var.Q0());
        java.lang.String Q0 = f9Var.Q0();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6998xff6719f8 c6998xff6719f8 = this.f542668g;
        c6998xff6719f8.f143131h = c6998xff6719f8.b("ChatName", Q0, true);
        c6998xff6719f8.f143130g = N4 ? 1L : 0L;
        c6998xff6719f8.f143137n = h17.f496548m;
        i95.m c17 = i95.n0.c(tg3.u0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c6998xff6719f8.f143129f = com.p314xaae8f345.mm.vfs.w6.k(tg3.u0.e8((tg3.u0) c17, this.f542662a, bm5.f0.f104104s, this.f542663b, false, 8, null));
        if (d17 != null) {
            c6998xff6719f8.f143128e = d17.f496337b ? 0L : d17.f496342g;
            c6998xff6719f8.f143138o = d17.f496336a;
            c6998xff6719f8.f143127d = c6998xff6719f8.b("FileId", this.f542664c ? d17.f496339d : d17.f496340e, true);
        }
        int i17 = this.f542665d;
        if (i17 == 1) {
            boolean z18 = !(h17.T == 1);
            c6998xff6719f8.f143134k = z18 ? 1L : 3L;
            if (z18) {
                h17.T = 1;
                h17.Z = true;
            }
        } else if (i17 == 2) {
            boolean z19 = !(h17.T == 1);
            c6998xff6719f8.f143134k = z19 ? 2L : 3L;
            if (z19) {
                h17.T = 1;
                h17.Z = true;
            }
        } else if (i17 == 3) {
            c6998xff6719f8.f143134k = 4L;
        } else if (i17 == 4) {
            c6998xff6719f8.f143134k = 5L;
        } else if (i17 == 5) {
            c6998xff6719f8.f143134k = 6L;
        }
        if (N4) {
            c6998xff6719f8.f143132i = ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(f9Var.Q0());
        }
        c6998xff6719f8.f143133j = c6998xff6719f8.b("SenderUserName", z17 ? c01.z1.r() : h17.e(), true);
        java.util.HashMap hashMap = this.f542677p;
        if (!hashMap.isEmpty()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            c6998xff6719f8.f143139p = c6998xff6719f8.b("ExtraInfo", r26.i0.u(jSONObject2, ',', ';', false, 4, null), true);
        }
        c6998xff6719f8.k();
        t21.d3.Q(h17);
    }

    public final void b() {
        this.f542666e = java.lang.System.currentTimeMillis();
    }
}
