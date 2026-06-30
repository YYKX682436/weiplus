package cl;

/* loaded from: classes7.dex */
public class f2 implements com.eclipsesource.mmv8.JavaCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.h2 f42634a;

    public f2(cl.h2 h2Var) {
        this.f42634a = h2Var;
    }

    @Override // com.eclipsesource.mmv8.JavaCallback
    public java.lang.Object invoke(com.eclipsesource.mmv8.V8Object v8Object, com.eclipsesource.mmv8.V8Array v8Array) {
        if (v8Array.length() < 1 || v8Array.getType(0) != 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.V8DirectApiSharedBuffer", "get invalid parameters");
            return null;
        }
        int integer = v8Array.getInteger(0);
        ((cl.j0) this.f42634a.f42655c).b(integer);
        com.tencent.mars.xlog.Log.i("MicroMsg.V8DirectApiSharedBuffer", "untrace, bufferId:%d", java.lang.Integer.valueOf(integer));
        return null;
    }
}
