package vu5;

/* loaded from: classes12.dex */
public class g implements java.util.concurrent.ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f521887d = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vu5.j f521888e;

    public g(vu5.j jVar) {
        this.f521888e = jVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("HotPool#");
        this.f521888e.getClass();
        sb6.append(this.f521887d.getAndIncrement());
        java.lang.String sb7 = sb6.toString();
        int i17 = pu5.h.f440005b;
        pu5.d dVar = new pu5.d(new pu5.c(runnable), "[GT]" + sb7);
        dVar.setPriority(7);
        return dVar;
    }
}
