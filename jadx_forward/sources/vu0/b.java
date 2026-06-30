package vu0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final pp0.r0 f521585a;

    /* renamed from: b, reason: collision with root package name */
    public final xu0.a f521586b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f521587c;

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f521588d;

    public b(pp0.r0 r0Var, xu0.a requestListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestListener, "requestListener");
        this.f521585a = r0Var;
        this.f521586b = requestListener;
        this.f521587c = new java.util.concurrent.ConcurrentHashMap();
        this.f521588d = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392101a.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
    }

    public static final java.lang.String a(vu0.b bVar, java.lang.String str, java.lang.String str2, com.p314xaae8f345.p457x3304c6.p479x4179489f.C4141x29d4ed4f[] c4141x29d4ed4fArr) {
        bVar.getClass();
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (!r6Var.m() || !r6Var.A() || r6Var.C() <= 0 || c4141x29d4ed4fArr == null) {
            return str;
        }
        java.lang.String a17 = uu0.l.a("wav", bVar.b(str, str2));
        boolean bj6 = ((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).bj();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4174xb63577dd c4174xb63577dd = new com.p314xaae8f345.p457x3304c6.p479x4179489f.C4174xb63577dd();
        c4174xb63577dd.f129968a = true;
        c4174xb63577dd.f129969b = com.p314xaae8f345.p457x3304c6.p479x4179489f.h.Peaking;
        c4174xb63577dd.f129970c = c4141x29d4ed4fArr;
        c4174xb63577dd.f129972e = false;
        c4174xb63577dd.f129976i = false;
        c4174xb63577dd.f129984q = false;
        c4174xb63577dd.f129987t = false;
        c4174xb63577dd.f129988u = bj6;
        c4174xb63577dd.f129989v = -18.0f;
        c4174xb63577dd.f129990w = -40.0f;
        c4174xb63577dd.f129991x = -10.0f;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4175x22639adb.b(str, a17, c4174xb63577dd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
        return a17;
    }

    public final java.lang.String b(java.lang.String str, java.lang.String str2) {
        byte[] bytes = (str + '_' + str2).getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getMessageDigest(...)");
        return g17;
    }
}
