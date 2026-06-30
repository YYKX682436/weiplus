package cl;

/* loaded from: classes7.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl.j1 f42619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f42621f;

    public e1(cl.q0 q0Var, cl.j1 j1Var, java.lang.String str) {
        this.f42621f = q0Var;
        this.f42619d = j1Var;
        this.f42620e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f42620e;
        cl.q0 q0Var = this.f42621f;
        cl.j1 j1Var = this.f42619d;
        if (j1Var == null) {
            q0Var.f().executeVoidScript(str, null);
            return;
        }
        cl.k1 k1Var = new cl.k1();
        k1Var.f42675a = java.lang.System.currentTimeMillis();
        java.lang.Object executeScript = q0Var.f().executeScript(str, k1Var);
        cl.k1.a(k1Var);
        j1Var.a(executeScript != null ? executeScript.toString() : null, k1Var);
    }
}
