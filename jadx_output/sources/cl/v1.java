package cl;

/* loaded from: classes7.dex */
public class v1 extends cl.r1 {

    /* renamed from: b, reason: collision with root package name */
    public final cl.u f42802b;

    public v1(cl.u uVar) {
        this.f42802b = uVar;
    }

    @Override // cl.r1
    public void a() {
    }

    @Override // cl.r1
    public void c(cl.q0 q0Var, com.eclipsesource.mmv8.V8Object v8Object) {
        v8Object.registerJavaMethod(new cl.s1(this), "getNativeBufferId");
        v8Object.registerJavaMethod(new cl.t1(this, q0Var), "getNativeBuffer");
        v8Object.registerJavaMethod(new cl.u1(this), "setNativeBuffer");
    }
}
