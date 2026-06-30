package c51;

/* loaded from: classes10.dex */
public final class g extends c51.e {

    /* renamed from: o, reason: collision with root package name */
    public final d51.b f120173o;

    /* renamed from: p, reason: collision with root package name */
    public final b51.u f120174p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d51.b playConfig, b51.u dispatcher) {
        super(playConfig);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playConfig, "playConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        this.f120173o = playConfig;
        this.f120174p = dispatcher;
        java.lang.String path = playConfig.f308057b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        android.view.View pagView = playConfig.f308054d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagView, "pagView");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[register] tag = ");
        java.lang.String str = playConfig.f308055e;
        sb6.append(str);
        sb6.append(", path:");
        sb6.append(path);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micro.PagTargetDispatcher", sb6.toString());
        dispatcher.f99607a.put(java.lang.Integer.valueOf(pagView.hashCode()), new jz5.o(path, new java.lang.ref.WeakReference(pagView), str == null ? "" : str));
    }

    @Override // c51.e
    public void e(c51.c result) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.lang.String str = this.f120173o.f308055e;
        b51.u uVar = this.f120174p;
        uVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micro.PagTargetDispatcher", "[dispatch] tag = " + str + "，result.path = " + result);
        boolean z17 = result instanceof c51.b;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = uVar.f99607a;
        if (!z17) {
            if (result instanceof c51.a) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micro.PagTargetDispatcher", "load pag failed result = " + result);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((c51.a) result).f120160a, ((jz5.o) entry.getValue()).f384374d)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                java.util.Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    uVar.a(((c51.a) result).f120160a, ((java.lang.Number) ((java.util.Map.Entry) it.next()).getKey()).intValue(), str);
                }
                return;
            }
            return;
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry2 : concurrentHashMap.entrySet()) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((c51.b) result).f120162a, ((jz5.o) entry2.getValue()).f384374d)) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        for (java.util.Map.Entry entry3 : linkedHashMap2.entrySet()) {
            android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) ((jz5.o) entry3.getValue()).f384375e).get();
            if (view != null) {
                java.lang.String path = ((c51.b) result).f120162a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
                java.util.LinkedHashMap linkedHashMap3 = uVar.f99608b;
                java.lang.Object obj = linkedHashMap3.get(java.lang.Integer.valueOf(view.hashCode()));
                if (!(((p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) obj) != null)) {
                    obj = null;
                }
                p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) obj;
                if (dVar == null) {
                    dVar = null;
                }
                if (dVar == null) {
                    dVar = p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.a(false, 1, null);
                    linkedHashMap3.put(java.lang.Integer.valueOf(view.hashCode()), dVar);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micro.PagTargetDispatcher", "[playPag-enter] tag:" + str + ", path:" + path);
                p3325xe03a0797.p3326xc267989b.l.c(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, p3325xe03a0797.p3326xc267989b.a1.UNDISPATCHED, new b51.t(dVar, uVar, view, str, path, null));
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                uVar.a(((c51.b) result).f120162a, ((java.lang.Number) entry3.getKey()).intValue(), null);
            }
        }
    }
}
