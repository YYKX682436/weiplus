package o72;

/* loaded from: classes.dex */
public abstract class p5 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f424973a = "";

    /* renamed from: b, reason: collision with root package name */
    public static java.util.Set f424974b;

    static {
        if (hz4.q.f367984a) {
            return;
        }
        synchronized (hz4.q.class) {
            if (!hz4.q.f367984a) {
                hz4.q.a();
                hz4.q.f367984a = true;
            }
        }
    }

    public static java.lang.String a(boolean z17) {
        if (z17) {
            return gm0.j1.u().d();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f424973a)) {
            f424973a = lp0.b.h();
        }
        return f424973a;
    }

    public static java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(a(false), "wenote/html/upload");
        if (!r6Var.m()) {
            r6Var.J();
        }
        sb6.append(r6Var.o());
        sb6.append("/wenoteupload.htm");
        return sb6.toString();
    }

    public static java.lang.String c() {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(a(true), "wenote/image/localpath");
        if (!r6Var.m()) {
            r6Var.J();
        }
        return r6Var.o();
    }
}
