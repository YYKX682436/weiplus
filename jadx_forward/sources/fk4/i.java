package fk4;

/* loaded from: classes12.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk4.k f345141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f345142e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f345143f;

    public i(fk4.k kVar, long j17, long j18) {
        this.f345141d = kVar;
        this.f345142e = j17;
        this.f345143f = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t21.o2.Di().p(this.f345141d.f(), (int) this.f345142e, (int) this.f345143f, 0);
    }
}
