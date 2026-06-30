package b51;

/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f18074a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedHashMap f18075b = new java.util.LinkedHashMap();

    public final void a(java.lang.String path, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mars.xlog.Log.i("Micro.PagTargetDispatcher", "[unregister] tag = " + str + ", path:" + path);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f18074a;
        java.lang.Object obj = concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        jz5.o oVar = (jz5.o) obj;
        if (!kotlin.jvm.internal.o.b(oVar != null ? (java.lang.String) oVar.f302841d : null, path)) {
            obj = null;
        }
        if (((jz5.o) obj) != null) {
            com.tencent.mars.xlog.Log.i("Micro.PagTargetDispatcher", "[unregister] tag = " + str + ", path:" + path + ", founded");
        }
    }
}
