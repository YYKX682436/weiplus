package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public final class va {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f277823b;

    /* renamed from: d, reason: collision with root package name */
    public static java.util.concurrent.Future f277825d;

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.va f277822a = new com.p314xaae8f345.mm.p2621x8fb0427b.va();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentLinkedQueue f277824c = new java.util.concurrent.ConcurrentLinkedQueue();

    static {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilentTask", "SilentDBOperationHelper init");
        com.p314xaae8f345.mm.app.w.INSTANCE.b(new com.p314xaae8f345.mm.p2621x8fb0427b.sa());
    }

    public final void a(java.lang.Runnable runnable, java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runnable, "runnable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        com.p314xaae8f345.mm.p2621x8fb0427b.ua uaVar = com.p314xaae8f345.mm.p2621x8fb0427b.ua.f277799d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilentTask", "executeSqlSilently runnable, name = ".concat(name));
        f277824c.add(new com.p314xaae8f345.mm.p2621x8fb0427b.ta(runnable, name, uaVar));
    }
}
