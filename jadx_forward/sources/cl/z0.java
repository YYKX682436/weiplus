package cl;

/* loaded from: classes7.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f124371e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f124372f;

    public z0(cl.q0 q0Var, java.lang.String str, boolean z17) {
        this.f124372f = q0Var;
        this.f124370d = str;
        this.f124371e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        cl.q0 q0Var = this.f124372f;
        cl.a aVar = (cl.a) q0Var.f124257b;
        cl.q1 q1Var = new cl.q1(aVar.f124101a, aVar);
        aVar.h(new cl.m1(q1Var, this.f124370d, this.f124371e), false);
        aVar.f124120t.add(new cl.n1(q1Var));
        if (q0Var.f124264i != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(q0Var.f124256a, "waitForDebugger, restore Inspector console");
            q0Var.f().mo16386x31ca9f38().add("console", q0Var.f124264i);
            q0Var.f124265j = false;
        }
    }
}
