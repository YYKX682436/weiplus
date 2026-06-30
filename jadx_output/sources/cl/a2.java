package cl;

/* loaded from: classes16.dex */
public class a2 implements com.eclipsesource.mmv8.JavaVoidCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.c2 f42596a;

    public a2(cl.c2 c2Var) {
        this.f42596a = c2Var;
    }

    @Override // com.eclipsesource.mmv8.JavaVoidCallback
    public void invoke(com.eclipsesource.mmv8.V8Object v8Object, com.eclipsesource.mmv8.V8Array v8Array) {
        java.lang.String v8Array2 = v8Array.toString();
        com.tencent.mars.xlog.Log.e("MicroMsg.J2V8_Console", v8Array2);
        cl.c2 c2Var = this.f42596a;
        c2Var.e(6, "MicroMsg.J2V8_Console", v8Array2);
        c2Var.getClass();
    }
}
