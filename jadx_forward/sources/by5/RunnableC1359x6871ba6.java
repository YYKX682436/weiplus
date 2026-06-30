package by5;

/* renamed from: by5.u0$$a */
/* loaded from: classes13.dex */
public final /* synthetic */ class RunnableC1359x6871ba6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ by5.u0 f118135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f118136e;

    public /* synthetic */ RunnableC1359x6871ba6(by5.u0 u0Var, java.lang.Object obj) {
        this.f118135d = u0Var;
        this.f118136e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        by5.u0 u0Var = this.f118135d;
        java.lang.Object obj = this.f118136e;
        if (u0Var.f118133d.get()) {
            u0Var.f(obj);
        } else {
            u0Var.g(obj);
        }
        u0Var.f118132c = 2;
    }
}
