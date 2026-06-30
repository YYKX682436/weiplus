package k53;

/* loaded from: classes8.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19287x4a9b6f36 f385911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k53.u0 f385912e;

    public o0(k53.u0 u0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19287x4a9b6f36 c19287x4a9b6f36) {
        this.f385912e = u0Var;
        this.f385911d = c19287x4a9b6f36;
    }

    @Override // java.lang.Runnable
    public void run() {
        k53.u0 u0Var = this.f385912e;
        if (u0Var.f385935h) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.bj().c("", this.f385911d.f264269e, 20302, 214, 2, u0Var.f385936i);
        u0Var.f385934g = java.lang.System.currentTimeMillis();
    }
}
