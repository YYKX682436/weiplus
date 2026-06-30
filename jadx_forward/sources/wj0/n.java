package wj0;

/* loaded from: classes11.dex */
public class n extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f528099d;

    public n() {
        super(0);
        this.f528099d = new wj0.m(this);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.Runnable runnable = this.f528099d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runnable, "runnable");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("HardCoderStaticOnPostSyncTaskEventListener", "PizzaWorkerCompat")) {
            throw new java.lang.IllegalStateException("Default or empty tag is not allowed for removable task!");
        }
        ((fz.l) ((cp.f) i95.n0.c(cp.f.class))).getClass();
        ((ku5.t0) ku5.t0.f394148d).A("HardCoderStaticOnPostSyncTaskEventListener");
        gm0.j1.e().d().mo50300x3fa464aa(runnable);
        cp.e.c("HardCoderStaticOnPostSyncTaskEventListener", this.f528099d, 3000L);
        return false;
    }
}
