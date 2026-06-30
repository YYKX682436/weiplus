package cl;

/* loaded from: classes7.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl.j1 f124152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124153e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f124154f;

    public e1(cl.q0 q0Var, cl.j1 j1Var, java.lang.String str) {
        this.f124154f = q0Var;
        this.f124152d = j1Var;
        this.f124153e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f124153e;
        cl.q0 q0Var = this.f124154f;
        cl.j1 j1Var = this.f124152d;
        if (j1Var == null) {
            q0Var.f().mo16380xcb4354d4(str, null);
            return;
        }
        cl.k1 k1Var = new cl.k1();
        k1Var.f124208a = java.lang.System.currentTimeMillis();
        java.lang.Object mo16372x330788a0 = q0Var.f().mo16372x330788a0(str, k1Var);
        cl.k1.a(k1Var);
        j1Var.a(mo16372x330788a0 != null ? mo16372x330788a0.toString() : null, k1Var);
    }
}
