package cl;

/* loaded from: classes7.dex */
public class t1 implements com.eclipsesource.mmv8.JavaCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f42767a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cl.v1 f42768b;

    public t1(cl.v1 v1Var, cl.q0 q0Var) {
        this.f42768b = v1Var;
        this.f42767a = q0Var;
    }

    @Override // com.eclipsesource.mmv8.JavaCallback
    public java.lang.Object invoke(com.eclipsesource.mmv8.V8Object v8Object, com.eclipsesource.mmv8.V8Array v8Array) {
        if (v8Array.length() < 1 || v8Array.getType(0) != 1) {
            com.tencent.mars.xlog.Log.w("V8DirectApiBuffer", "getNativeBuffer invalid parameters");
            return null;
        }
        v8Array.getInteger(0);
        java.nio.ByteBuffer buffer = this.f42768b.f42802b.getBuffer(v8Array.getInteger(0), false);
        if (buffer != null) {
            return this.f42767a.f().newV8ArrayBuffer(buffer);
        }
        com.tencent.mars.xlog.Log.w("V8DirectApiBuffer", "getNativeBuffer bb null");
        return null;
    }
}
