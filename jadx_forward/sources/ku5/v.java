package ku5;

/* loaded from: classes12.dex */
public class v implements ru5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f394154a;

    public v(ku5.t0 t0Var, long j17) {
        this.f394154a = j17;
    }

    @Override // ru5.a
    public java.lang.Object a(java.lang.Object obj) {
        java.lang.Runnable runnable = (java.lang.Runnable) obj;
        wu5.l a17 = nu5.a.a(runnable, this.f394154a, null);
        if (runnable instanceof wu5.d) {
            ((wu5.d) runnable).f(a17);
        }
        return a17;
    }
}
