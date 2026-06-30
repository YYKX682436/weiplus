package bs2;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f23818a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f23819b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f23820c;

    public c(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f23818a = "Finder.ExpiredTimer#".concat(name);
        com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3(name);
        n3Var.setLogging(false);
        this.f23819b = n3Var;
        this.f23820c = new java.util.concurrent.atomic.AtomicReference();
    }

    public static /* synthetic */ void b(bs2.c cVar, bs2.b bVar, long j17, java.lang.String str, bs2.a aVar, int i17, java.lang.Object obj) {
        if ((i17 & 8) != 0) {
            aVar = bs2.a.f23796d;
        }
        cVar.a(bVar, j17, str, aVar);
    }

    public final void a(bs2.b runnable, long j17, java.lang.String tag, bs2.a triggerSource) {
        kotlin.jvm.internal.o.g(runnable, "runnable");
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(triggerSource, "triggerSource");
        long max = java.lang.Math.max(0L, j17);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f23819b;
        n3Var.removeCallbacksAndMessages(null);
        runnable.f23802d = max;
        runnable.f23803e = c01.id.c();
        runnable.f23804f = triggerSource;
        n3Var.postDelayed(runnable, max);
        com.tencent.mars.xlog.Log.i(this.f23818a, "[postDelayed] delay=" + runnable.f23802d + "ms triggerSource=" + triggerSource + ", hash=" + runnable.hashCode() + " tag=" + tag);
    }

    public final bs2.b c(java.lang.String tag) {
        kotlin.jvm.internal.o.g(tag, "tag");
        this.f23820c.set(null);
        this.f23819b.removeCallbacksAndMessages(null);
        com.tencent.mars.xlog.Log.i(this.f23818a, "[stop] tag=" + tag + ", null");
        return null;
    }
}
