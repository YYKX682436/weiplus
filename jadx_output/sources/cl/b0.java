package cl;

/* loaded from: classes7.dex */
public class b0 implements com.eclipsesource.mmv8.V8.JavaTaskScheduler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.e0 f42599a;

    public b0(cl.e0 e0Var) {
        this.f42599a = e0Var;
    }

    @Override // com.eclipsesource.mmv8.V8.JavaTaskScheduler
    public void Schedule(java.lang.Runnable runnable) {
        this.f42599a.C.n(runnable, false);
    }
}
