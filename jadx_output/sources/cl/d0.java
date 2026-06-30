package cl;

/* loaded from: classes7.dex */
public class d0 implements cl.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.e0 f42612a;

    public d0(cl.e0 e0Var) {
        this.f42612a = e0Var;
    }

    @Override // cl.i1
    public com.eclipsesource.mmv8.V8Context a() {
        cl.e0 e0Var = this.f42612a;
        com.eclipsesource.mmv8.MultiContextNodeJS multiContextNodeJS = e0Var.A;
        if (multiContextNodeJS == null) {
            throw new java.lang.IllegalStateException("getMainContext mNodeJS not ready!");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NodeJSRuntime", "getMainContext %s", java.lang.Integer.valueOf(multiContextNodeJS.getMainContext().hashCode()));
        return e0Var.A.getMainContext();
    }
}
