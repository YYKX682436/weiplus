package cl;

/* loaded from: classes7.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl.j1 f124172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f124173e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124174f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124175g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124176h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124177i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f124178m;

    public g1(cl.q0 q0Var, cl.j1 j1Var, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f124178m = q0Var;
        this.f124172d = j1Var;
        this.f124173e = i17;
        this.f124174f = str;
        this.f124175g = str2;
        this.f124176h = str3;
        this.f124177i = str4;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f124175g;
        cl.q0 q0Var = this.f124178m;
        cl.j1 j1Var = this.f124172d;
        if (j1Var == null) {
            q0Var.f().mo16382xcb4354d4(this.f124174f, cl.q0.a(q0Var, str), 0, this.f124176h, this.f124177i, this.f124173e, null);
            return;
        }
        cl.k1 k1Var = new cl.k1();
        k1Var.f124210c = this.f124173e;
        k1Var.f124208a = java.lang.System.currentTimeMillis();
        try {
            java.lang.Object mo16374x330788a0 = q0Var.f().mo16374x330788a0(this.f124174f, cl.q0.a(q0Var, str), 0, this.f124176h, this.f124177i, this.f124173e, k1Var);
            cl.k1.a(k1Var);
            j1Var.a(mo16374x330788a0 != null ? mo16374x330788a0.toString() : null, k1Var);
        } catch (java.lang.Throwable th6) {
            cl.k1.a(k1Var);
            j1Var.a(null, k1Var);
            throw th6;
        }
    }
}
