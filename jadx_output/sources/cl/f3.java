package cl;

/* loaded from: classes7.dex */
public class f3 implements com.tencent.mm.plugin.appbrand.jsruntime.c0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f42635d;

    public f3(cl.l3 l3Var, cl.q0 q0Var) {
        this.f42635d = q0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.c0
    public void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        cl.q0 q0Var = this.f42635d;
        if (q0Var != null) {
            q0Var.d(str, new cl.e3(this, valueCallback));
        }
    }
}
