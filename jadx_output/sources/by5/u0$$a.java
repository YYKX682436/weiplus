package by5;

/* loaded from: classes13.dex */
public final /* synthetic */ class u0$$a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ by5.u0 f36602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f36603e;

    public /* synthetic */ u0$$a(by5.u0 u0Var, java.lang.Object obj) {
        this.f36602d = u0Var;
        this.f36603e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        by5.u0 u0Var = this.f36602d;
        java.lang.Object obj = this.f36603e;
        if (u0Var.f36600d.get()) {
            u0Var.f(obj);
        } else {
            u0Var.g(obj);
        }
        u0Var.f36599c = 2;
    }
}
