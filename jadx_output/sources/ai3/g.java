package ai3;

/* loaded from: classes10.dex */
public final class g implements t21.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f5111a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f5112b;

    public g(kotlin.jvm.internal.c0 c0Var, java.lang.Object obj) {
        this.f5111a = c0Var;
        this.f5112b = obj;
    }

    @Override // t21.f0
    public void a(boolean z17, int i17) {
        this.f5111a.f310112d = z17;
        java.lang.Object obj = this.f5112b;
        synchronized (obj) {
            try {
                obj.notifyAll();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VideoTransCodeHelper", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
