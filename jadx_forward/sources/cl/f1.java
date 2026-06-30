package cl;

/* loaded from: classes7.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl.j1 f124163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124164e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124165f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f124166g;

    public f1(cl.q0 q0Var, cl.j1 j1Var, java.lang.String str, java.lang.String str2) {
        this.f124166g = q0Var;
        this.f124163d = j1Var;
        this.f124164e = str;
        this.f124165f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f124165f;
        java.lang.String str2 = this.f124164e;
        cl.q0 q0Var = this.f124166g;
        cl.j1 j1Var = this.f124163d;
        if (j1Var == null) {
            q0Var.f().mo16381xcb4354d4(str2, cl.q0.a(q0Var, str), 0, null);
            return;
        }
        cl.k1 k1Var = new cl.k1();
        k1Var.f124208a = java.lang.System.currentTimeMillis();
        java.lang.Object mo16373x330788a0 = q0Var.f().mo16373x330788a0(str2, cl.q0.a(q0Var, str), 0, k1Var);
        cl.k1.a(k1Var);
        j1Var.a(mo16373x330788a0 != null ? mo16373x330788a0.toString() : null, k1Var);
    }
}
