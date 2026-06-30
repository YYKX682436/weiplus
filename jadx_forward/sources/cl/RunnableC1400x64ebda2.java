package cl;

/* renamed from: cl.q0$$a */
/* loaded from: classes7.dex */
public final /* synthetic */ class RunnableC1400x64ebda2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f124266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124267e;

    public /* synthetic */ RunnableC1400x64ebda2(cl.q0 q0Var, java.lang.String str) {
        this.f124266d = q0Var;
        this.f124267e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cl.q0 q0Var = this.f124266d;
        if (q0Var.f124264i != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(q0Var.f124256a, "hangOriginConsoleOnKey, restore Inspector console");
            q0Var.f().mo16386x31ca9f38().add(this.f124267e, q0Var.f124264i);
        }
    }
}
