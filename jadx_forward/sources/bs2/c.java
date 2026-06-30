package bs2;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f105351a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f105352b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f105353c;

    public c(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f105351a = "Finder.ExpiredTimer#".concat(name);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(name);
        n3Var.m77789xc5a5549d(false);
        this.f105352b = n3Var;
        this.f105353c = new java.util.concurrent.atomic.AtomicReference();
    }

    public static /* synthetic */ void b(bs2.c cVar, bs2.b bVar, long j17, java.lang.String str, bs2.a aVar, int i17, java.lang.Object obj) {
        if ((i17 & 8) != 0) {
            aVar = bs2.a.f105329d;
        }
        cVar.a(bVar, j17, str, aVar);
    }

    public final void a(bs2.b runnable, long j17, java.lang.String tag, bs2.a triggerSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runnable, "runnable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(triggerSource, "triggerSource");
        long max = java.lang.Math.max(0L, j17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f105352b;
        n3Var.mo50302x6b17ad39(null);
        runnable.f105335d = max;
        runnable.f105336e = c01.id.c();
        runnable.f105337f = triggerSource;
        n3Var.mo50297x7c4d7ca2(runnable, max);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f105351a, "[postDelayed] delay=" + runnable.f105335d + "ms triggerSource=" + triggerSource + ", hash=" + runnable.hashCode() + " tag=" + tag);
    }

    public final bs2.b c(java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        this.f105353c.set(null);
        this.f105352b.mo50302x6b17ad39(null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f105351a, "[stop] tag=" + tag + ", null");
        return null;
    }
}
