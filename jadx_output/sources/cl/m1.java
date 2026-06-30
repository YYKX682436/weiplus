package cl;

/* loaded from: classes7.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f42697e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cl.q1 f42698f;

    public m1(cl.q1 q1Var, java.lang.String str, boolean z17) {
        this.f42698f = q1Var;
        this.f42696d = str;
        this.f42697e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.eclipsesource.mmv8.MultiContextV8 multiContextV8 = this.f42698f.f42743a;
        if (multiContextV8 == null) {
            throw new java.lang.IllegalStateException("V8DebuggerHelper v8 null");
        }
        multiContextV8.waitForDebugger(this.f42696d, this.f42697e);
        cl.q1 q1Var = this.f42698f;
        if (q1Var.f42745c != null) {
            return;
        }
        q1Var.f42745c = ((ku5.t0) ku5.t0.f312615d).d(new cl.p1(q1Var), 2000L, 2000L);
    }
}
