package ku5;

/* loaded from: classes12.dex */
public class z implements ru5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f394160a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f394161b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f394162c;

    public z(ku5.t0 t0Var, long j17, long j18, boolean z17) {
        this.f394160a = j17;
        this.f394161b = j18;
        this.f394162c = z17;
    }

    @Override // ru5.a
    public java.lang.Object a(java.lang.Object obj) {
        java.lang.Runnable runnable = (java.lang.Runnable) obj;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MILLISECONDS;
        long convert = timeUnit.convert(this.f394161b, timeUnit2);
        wu5.l lVar = new wu5.l(runnable, nu5.a.d(this.f394160a, timeUnit2), this.f394162c ? -convert : convert, nu5.a.c(runnable));
        if (runnable instanceof wu5.d) {
            ((wu5.d) runnable).f(lVar);
        }
        return lVar;
    }
}
