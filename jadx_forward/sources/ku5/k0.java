package ku5;

/* loaded from: classes12.dex */
public class k0 implements ru5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f394125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394126b;

    public k0(ku5.t0 t0Var, long j17, java.lang.String str) {
        this.f394125a = j17;
        this.f394126b = str;
    }

    @Override // ru5.a
    public java.lang.Object a(java.lang.Object obj) {
        java.util.concurrent.Callable callable = (java.util.concurrent.Callable) obj;
        wu5.l b17 = nu5.a.b(callable, this.f394125a, this.f394126b);
        if (callable instanceof wu5.d) {
            ((wu5.d) callable).f(b17);
        }
        return b17;
    }
}
