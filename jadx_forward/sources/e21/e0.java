package e21;

/* loaded from: classes11.dex */
public final class e0 {

    /* renamed from: d, reason: collision with root package name */
    public static final e21.w f328043d = new e21.w(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f328044a = new java.util.LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f328045b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f328046c = jz5.h.b(e21.d0.f328036d);

    public final void a(xg3.q0 operation, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        ((ku5.t0) ku5.t0.f394148d).r(new e21.a0(this, operation, i17), "oplog_reporter_serial_tag");
    }

    public final void b(xg3.q0 op6, java.lang.Integer num, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(op6, "op");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((ku5.t0) ku5.t0.f394148d).r(new e21.b0(op6, currentTimeMillis, this, num, i17), "oplog_reporter_serial_tag");
    }

    public final void c(xg3.q0 op6, java.lang.Integer num, int i17, e21.x reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(op6, "op");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((ku5.t0) ku5.t0.f394148d).r(new e21.c0(op6, this, currentTimeMillis, reason, num, i17), "oplog_reporter_serial_tag");
    }
}
