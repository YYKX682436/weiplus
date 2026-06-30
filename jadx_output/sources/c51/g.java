package c51;

/* loaded from: classes10.dex */
public final class g extends c51.e {

    /* renamed from: o, reason: collision with root package name */
    public final d51.b f38640o;

    /* renamed from: p, reason: collision with root package name */
    public final b51.u f38641p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d51.b playConfig, b51.u dispatcher) {
        super(playConfig);
        kotlin.jvm.internal.o.g(playConfig, "playConfig");
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        this.f38640o = playConfig;
        this.f38641p = dispatcher;
        java.lang.String path = playConfig.f226524b;
        kotlin.jvm.internal.o.g(path, "path");
        android.view.View pagView = playConfig.f226521d;
        kotlin.jvm.internal.o.g(pagView, "pagView");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[register] tag = ");
        java.lang.String str = playConfig.f226522e;
        sb6.append(str);
        sb6.append(", path:");
        sb6.append(path);
        com.tencent.mars.xlog.Log.i("Micro.PagTargetDispatcher", sb6.toString());
        dispatcher.f18074a.put(java.lang.Integer.valueOf(pagView.hashCode()), new jz5.o(path, new java.lang.ref.WeakReference(pagView), str == null ? "" : str));
    }

    @Override // c51.e
    public void e(c51.c result) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.String str = this.f38640o.f226522e;
        b51.u uVar = this.f38641p;
        uVar.getClass();
        com.tencent.mars.xlog.Log.i("Micro.PagTargetDispatcher", "[dispatch] tag = " + str + "，result.path = " + result);
        boolean z17 = result instanceof c51.b;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = uVar.f18074a;
        if (!z17) {
            if (result instanceof c51.a) {
                com.tencent.mars.xlog.Log.i("Micro.PagTargetDispatcher", "load pag failed result = " + result);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                    if (kotlin.jvm.internal.o.b(((c51.a) result).f38627a, ((jz5.o) entry.getValue()).f302841d)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                java.util.Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    uVar.a(((c51.a) result).f38627a, ((java.lang.Number) ((java.util.Map.Entry) it.next()).getKey()).intValue(), str);
                }
                return;
            }
            return;
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry2 : concurrentHashMap.entrySet()) {
            if (kotlin.jvm.internal.o.b(((c51.b) result).f38629a, ((jz5.o) entry2.getValue()).f302841d)) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        for (java.util.Map.Entry entry3 : linkedHashMap2.entrySet()) {
            android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) ((jz5.o) entry3.getValue()).f302842e).get();
            if (view != null) {
                java.lang.String path = ((c51.b) result).f38629a;
                kotlin.jvm.internal.o.g(path, "path");
                java.util.LinkedHashMap linkedHashMap3 = uVar.f18075b;
                java.lang.Object obj = linkedHashMap3.get(java.lang.Integer.valueOf(view.hashCode()));
                if (!(((kotlinx.coroutines.sync.d) obj) != null)) {
                    obj = null;
                }
                kotlinx.coroutines.sync.d dVar = (kotlinx.coroutines.sync.d) obj;
                if (dVar == null) {
                    dVar = null;
                }
                if (dVar == null) {
                    dVar = kotlinx.coroutines.sync.l.a(false, 1, null);
                    linkedHashMap3.put(java.lang.Integer.valueOf(view.hashCode()), dVar);
                }
                com.tencent.mars.xlog.Log.i("Micro.PagTargetDispatcher", "[playPag-enter] tag:" + str + ", path:" + path);
                kotlinx.coroutines.l.c(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, kotlinx.coroutines.a1.UNDISPATCHED, new b51.t(dVar, uVar, view, str, path, null));
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                uVar.a(((c51.b) result).f38629a, ((java.lang.Number) entry3.getKey()).intValue(), null);
            }
        }
    }
}
