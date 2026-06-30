package dp1;

/* loaded from: classes8.dex */
public class t implements db5.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f323707a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dp1.w f323708b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dp1.u f323709c;

    public t(dp1.u uVar, java.util.concurrent.atomic.AtomicInteger atomicInteger, dp1.w wVar) {
        this.f323709c = uVar;
        this.f323707a = atomicInteger;
        this.f323708b = wVar;
    }

    @Override // db5.d
    /* renamed from: onComplete */
    public void mo2162x815f5438(boolean z17) {
        if (!z17 && this.f323707a.getAndIncrement() < 1) {
            db5.f.c(this.f323709c.mo50327x19263085(), new dp1.s(this));
            return;
        }
        dp1.w wVar = this.f323708b;
        if (wVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.z) wVar).a(z17);
        }
    }
}
