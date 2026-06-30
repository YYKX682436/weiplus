package xl0;

/* loaded from: classes4.dex */
public class a implements s85.b, java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final xl0.a f536633d = new xl0.a();

    /* renamed from: e, reason: collision with root package name */
    public static final s85.c f536634e = new s85.e(gm0.j1.t().a(0, java.lang.Boolean.class), new s85.h(gm0.j1.t().a(1, java.lang.Boolean.class)));

    @Override // s85.b
    public void a(s85.c cVar, java.lang.Object obj) {
        if (!((java.lang.Boolean) obj).booleanValue()) {
            ((ku5.t0) ku5.t0.f394148d).A("FewShotBooster");
            return;
        }
        ku5.t0 t0Var = (ku5.t0) ku5.t0.f394148d;
        t0Var.getClass();
        t0Var.t(this, 1800000L, "FewShotBooster");
    }

    @Override // java.lang.Runnable
    public void run() {
    }
}
