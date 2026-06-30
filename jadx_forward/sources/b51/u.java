package b51;

/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f99607a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedHashMap f99608b = new java.util.LinkedHashMap();

    public final void a(java.lang.String path, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micro.PagTargetDispatcher", "[unregister] tag = " + str + ", path:" + path);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f99607a;
        java.lang.Object obj = concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        jz5.o oVar = (jz5.o) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(oVar != null ? (java.lang.String) oVar.f384374d : null, path)) {
            obj = null;
        }
        if (((jz5.o) obj) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micro.PagTargetDispatcher", "[unregister] tag = " + str + ", path:" + path + ", founded");
        }
    }
}
