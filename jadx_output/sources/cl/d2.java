package cl;

/* loaded from: classes7.dex */
public class d2 implements com.eclipsesource.mmv8.JavaCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.h2 f42614a;

    public d2(cl.h2 h2Var) {
        this.f42614a = h2Var;
    }

    @Override // com.eclipsesource.mmv8.JavaCallback
    public java.lang.Object invoke(com.eclipsesource.mmv8.V8Object v8Object, com.eclipsesource.mmv8.V8Array v8Array) {
        if (v8Array.length() < 1 || v8Array.getType(0) != 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.V8DirectApiSharedBuffer", "get invalid parameters");
            return null;
        }
        int integer = v8Array.getInteger(0);
        com.tencent.mars.xlog.Log.i("MicroMsg.V8DirectApiSharedBuffer", "get, id:%d", java.lang.Integer.valueOf(integer));
        java.util.HashMap hashMap = (java.util.HashMap) ((cl.n0) this.f42614a.f42654b).f42703b;
        if (!hashMap.containsKey(java.lang.Integer.valueOf(integer))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SharedV8ArrayBufferMgr", "get: id %d not exist", java.lang.Integer.valueOf(integer));
            return null;
        }
        cl.m0 m0Var = (cl.m0) hashMap.get(java.lang.Integer.valueOf(integer));
        if (m0Var.f42695d == null) {
            com.eclipsesource.mmv8.InSandboxByteBuffer inSandboxByteBuffer = m0Var.f42693b;
            if (!inSandboxByteBuffer.isReleased()) {
                m0Var.f42695d = m0Var.f42692a.f().newSharedV8ArrayBuffer(inSandboxByteBuffer);
            }
        }
        return m0Var.f42695d;
    }
}
