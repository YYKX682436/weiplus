package cl;

/* loaded from: classes7.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl.j1 f42630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42631e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42632f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f42633g;

    public f1(cl.q0 q0Var, cl.j1 j1Var, java.lang.String str, java.lang.String str2) {
        this.f42633g = q0Var;
        this.f42630d = j1Var;
        this.f42631e = str;
        this.f42632f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f42632f;
        java.lang.String str2 = this.f42631e;
        cl.q0 q0Var = this.f42633g;
        cl.j1 j1Var = this.f42630d;
        if (j1Var == null) {
            q0Var.f().executeVoidScript(str2, cl.q0.a(q0Var, str), 0, null);
            return;
        }
        cl.k1 k1Var = new cl.k1();
        k1Var.f42675a = java.lang.System.currentTimeMillis();
        java.lang.Object executeScript = q0Var.f().executeScript(str2, cl.q0.a(q0Var, str), 0, k1Var);
        cl.k1.a(k1Var);
        j1Var.a(executeScript != null ? executeScript.toString() : null, k1Var);
    }
}
