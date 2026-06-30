package cl;

/* loaded from: classes7.dex */
public class u1 implements com.eclipsesource.mmv8.JavaVoidCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.v1 f42773a;

    public u1(cl.v1 v1Var) {
        this.f42773a = v1Var;
    }

    @Override // com.eclipsesource.mmv8.JavaVoidCallback
    public void invoke(com.eclipsesource.mmv8.V8Object v8Object, com.eclipsesource.mmv8.V8Array v8Array) {
        if (v8Array.length() < 2 || v8Array.getType(0) != 1 || v8Array.getType(1) != 10) {
            com.tencent.mars.xlog.Log.w("V8DirectApiBuffer", "setNativeBuffer invalid parameters");
            return;
        }
        v8Array.getInteger(0);
        com.eclipsesource.mmv8.V8ArrayBuffer v8ArrayBuffer = (com.eclipsesource.mmv8.V8ArrayBuffer) v8Array.get(1);
        if (v8ArrayBuffer == null) {
            com.tencent.mars.xlog.Log.w("V8DirectApiBuffer", "setNativeBuffer buffer null");
        } else {
            this.f42773a.f42802b.setBuffer(v8Array.getInteger(0), v8ArrayBuffer.getBackingStore());
            v8ArrayBuffer.release();
        }
    }
}
