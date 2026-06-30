package cl;

/* loaded from: classes7.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl.j1 f42639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f42640e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42641f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42642g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42643h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42644i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f42645m;

    public g1(cl.q0 q0Var, cl.j1 j1Var, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f42645m = q0Var;
        this.f42639d = j1Var;
        this.f42640e = i17;
        this.f42641f = str;
        this.f42642g = str2;
        this.f42643h = str3;
        this.f42644i = str4;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f42642g;
        cl.q0 q0Var = this.f42645m;
        cl.j1 j1Var = this.f42639d;
        if (j1Var == null) {
            q0Var.f().executeVoidScript(this.f42641f, cl.q0.a(q0Var, str), 0, this.f42643h, this.f42644i, this.f42640e, null);
            return;
        }
        cl.k1 k1Var = new cl.k1();
        k1Var.f42677c = this.f42640e;
        k1Var.f42675a = java.lang.System.currentTimeMillis();
        try {
            java.lang.Object executeScript = q0Var.f().executeScript(this.f42641f, cl.q0.a(q0Var, str), 0, this.f42643h, this.f42644i, this.f42640e, k1Var);
            cl.k1.a(k1Var);
            j1Var.a(executeScript != null ? executeScript.toString() : null, k1Var);
        } catch (java.lang.Throwable th6) {
            cl.k1.a(k1Var);
            j1Var.a(null, k1Var);
            throw th6;
        }
    }
}
