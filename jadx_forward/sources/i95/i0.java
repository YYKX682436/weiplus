package i95;

/* loaded from: classes12.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i95.w f371332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f371333e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f371334f;

    public i0(i95.w wVar, java.lang.Throwable th6, boolean z17) {
        this.f371332d = wVar;
        this.f371333e = th6;
        this.f371334f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f371332d.m134978xc7df9085(this.f371333e);
        i95.n0.j(null, this.f371332d, i95.r.INITIALIZED, this.f371334f, true, false);
    }
}
