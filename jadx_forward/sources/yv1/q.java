package yv1;

@j95.b
/* loaded from: classes3.dex */
public final class q extends i95.w implements c01.d8 {

    /* renamed from: e, reason: collision with root package name */
    public static final yv1.m f547668e = new yv1.m(null);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f547669f = jz5.h.b(yv1.k.f547630d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f547670g = jz5.h.b(yv1.l.f547636d);

    /* renamed from: d, reason: collision with root package name */
    public java.util.concurrent.Future f547671d;

    public void wi(java.lang.String from, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        c01.d8.f118637g0.getClass();
        if (!c01.c8.f118622b.contains(from)) {
            throw new java.lang.IllegalArgumentException("Unknown dataSource: ".concat(from));
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanExService", "#noteLatestTotalSize: " + j17 + ", from=" + from + ", currMs=" + currentTimeMillis, null);
        if (j17 > 0) {
            yv1.m mVar = f547668e;
            yv1.m.a(mVar).putLong("last_total_size_of_" + from + "_ts", currentTimeMillis);
            yv1.m.a(mVar).putLong("last_total_size_of_".concat(from), j17);
        }
        yv1.m mVar2 = f547668e;
        synchronized (yv1.m.b(mVar2)) {
            kz5.h0.B(yv1.m.b(mVar2), new yv1.n(from, j17));
        }
    }
}
