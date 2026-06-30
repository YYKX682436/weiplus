package cl;

/* loaded from: classes7.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f42838e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f42839f;

    public z0(cl.q0 q0Var, java.lang.String str, boolean z17) {
        this.f42839f = q0Var;
        this.f42837d = str;
        this.f42838e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        cl.q0 q0Var = this.f42839f;
        cl.a aVar = (cl.a) q0Var.f42724b;
        cl.q1 q1Var = new cl.q1(aVar.f42568a, aVar);
        aVar.h(new cl.m1(q1Var, this.f42837d, this.f42838e), false);
        aVar.f42587t.add(new cl.n1(q1Var));
        if (q0Var.f42731i != null) {
            com.tencent.mars.xlog.Log.i(q0Var.f42723a, "waitForDebugger, restore Inspector console");
            q0Var.f().getGlobalObject().add("console", q0Var.f42731i);
            q0Var.f42732j = false;
        }
    }
}
