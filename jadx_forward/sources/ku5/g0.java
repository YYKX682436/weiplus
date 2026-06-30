package ku5;

/* loaded from: classes12.dex */
public class g0 implements ru5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f394119a;

    public g0(ku5.t0 t0Var, long j17) {
        this.f394119a = j17;
    }

    @Override // ru5.a
    public java.lang.Object a(java.lang.Object obj) {
        java.util.concurrent.Callable callable = (java.util.concurrent.Callable) obj;
        wu5.l b17 = nu5.a.b(callable, this.f394119a, null);
        if (callable instanceof wu5.d) {
            ((wu5.d) callable).f(b17);
        }
        return b17;
    }
}
