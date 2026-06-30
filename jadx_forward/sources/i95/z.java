package i95;

/* loaded from: classes12.dex */
public class z implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i95.w f371399d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f371400e;

    public z(i95.w wVar, java.lang.Throwable th6) {
        this.f371399d = wVar;
        this.f371400e = th6;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        this.f371399d.m134978xc7df9085(this.f371400e);
        i95.n0.j(null, this.f371399d, i95.r.ACTIVATED, true, true, false);
        return null;
    }
}
