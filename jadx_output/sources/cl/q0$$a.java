package cl;

/* loaded from: classes7.dex */
public final /* synthetic */ class q0$$a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f42733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42734e;

    public /* synthetic */ q0$$a(cl.q0 q0Var, java.lang.String str) {
        this.f42733d = q0Var;
        this.f42734e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cl.q0 q0Var = this.f42733d;
        if (q0Var.f42731i != null) {
            com.tencent.mars.xlog.Log.i(q0Var.f42723a, "hangOriginConsoleOnKey, restore Inspector console");
            q0Var.f().getGlobalObject().add(this.f42734e, q0Var.f42731i);
        }
    }
}
