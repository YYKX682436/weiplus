package cl;

/* loaded from: classes7.dex */
public class g2 implements com.eclipsesource.mmv8.JavaCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.h2 f42646a;

    public g2(cl.h2 h2Var) {
        this.f42646a = h2Var;
    }

    @Override // com.eclipsesource.mmv8.JavaCallback
    public java.lang.Object invoke(com.eclipsesource.mmv8.V8Object v8Object, com.eclipsesource.mmv8.V8Array v8Array) {
        if (v8Array.length() < 1 || v8Array.getType(0) != 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.V8DirectApiSharedBuffer", "get invalid parameters");
            return null;
        }
        cl.k0 a17 = ((cl.j0) this.f42646a.f42655c).a(v8Array.getInteger(0));
        if (a17 == null) {
            return null;
        }
        if (a17.f42671a == null) {
            com.eclipsesource.mmv8.V8Context f17 = a17.f42674d.f();
            com.eclipsesource.mmv8.InSandboxByteBuffer inSandboxByteBuffer = a17.f42672b;
            kotlin.jvm.internal.o.d(inSandboxByteBuffer);
            a17.f42671a = f17.newSharedV8ArrayBuffer(inSandboxByteBuffer);
        }
        com.eclipsesource.mmv8.V8ArrayBuffer v8ArrayBuffer = a17.f42671a;
        kotlin.jvm.internal.o.d(v8ArrayBuffer);
        return v8ArrayBuffer;
    }
}
