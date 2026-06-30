package cl;

/* loaded from: classes7.dex */
public class b3 implements com.eclipsesource.mmv8.JavaCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f42602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f42603b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.c0 f42604c;

    public b3(cl.l3 l3Var, java.lang.ref.WeakReference weakReference, java.util.List list, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        this.f42602a = weakReference;
        this.f42603b = list;
        this.f42604c = c0Var;
    }

    @Override // com.eclipsesource.mmv8.JavaCallback
    public java.lang.Object invoke(com.eclipsesource.mmv8.V8Object v8Object, com.eclipsesource.mmv8.V8Array v8Array) {
        java.lang.String string = v8Array.getString(0);
        java.lang.String string2 = v8Array.getString(1);
        int integer = v8Array.getInteger(2);
        java.lang.String string3 = (v8Array.length() < 4 || v8Array.getType(3) != 4) ? "" : v8Array.getString(3);
        java.lang.ref.WeakReference weakReference = this.f42602a;
        if (weakReference.get() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.V8EngineWorkerManager", "hy: component lost. stop dispatch");
            return "";
        }
        com.tencent.mm.plugin.appbrand.jsapi.m mVar = (com.tencent.mm.plugin.appbrand.jsapi.m) weakReference.get();
        java.util.List list = this.f42603b;
        if (list != null && list.contains(string)) {
            return mVar.q0(string, string2, string3, integer, false, this.f42604c, -1);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.V8EngineWorkerManager", "hy: calling not permitted api: %s", string);
        mVar.d0(integer, mVar.s0(string, "fail:not supported"), this.f42604c);
        return "fail:not supported";
    }
}
