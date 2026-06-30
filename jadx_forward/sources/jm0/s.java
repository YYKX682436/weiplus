package jm0;

/* loaded from: classes10.dex */
public class s extends p012xc85e97e9.p093xedfae76a.o {

    /* renamed from: b, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.y f381819b;

    /* renamed from: c, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.n f381820c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.concurrent.ConcurrentHashMap f381821d;

    public s(p012xc85e97e9.p093xedfae76a.y owner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        this.f381819b = owner;
        this.f381820c = p012xc85e97e9.p093xedfae76a.n.INITIALIZED;
        this.f381821d = new java.util.concurrent.ConcurrentHashMap();
    }

    @Override // p012xc85e97e9.p093xedfae76a.o
    public void a(p012xc85e97e9.p093xedfae76a.x observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f381821d;
        if (concurrentHashMap != null) {
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.o
    public p012xc85e97e9.p093xedfae76a.n b() {
        return this.f381820c;
    }

    @Override // p012xc85e97e9.p093xedfae76a.o
    public void c(p012xc85e97e9.p093xedfae76a.x observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f381821d;
        if (concurrentHashMap != null) {
        }
    }

    public final void d() {
        java.util.List<p012xc85e97e9.p093xedfae76a.x> list;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mvvm.PluginLifecycleRegistry", "moveToCreateState start");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f381821d;
        if (concurrentHashMap != null) {
            list = new java.util.ArrayList(concurrentHashMap.size());
            java.util.Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                list.add((p012xc85e97e9.p093xedfae76a.x) ((java.util.Map.Entry) it.next()).getValue());
            }
        } else {
            list = kz5.p0.f395529d;
        }
        for (p012xc85e97e9.p093xedfae76a.x xVar : list) {
            if (xVar instanceof p012xc85e97e9.p093xedfae76a.v) {
                ((p012xc85e97e9.p093xedfae76a.v) xVar).mo2520xaba1ac62(this.f381819b, p012xc85e97e9.p093xedfae76a.m.ON_CREATE);
            } else {
                java.lang.reflect.Method[] methods = xVar.getClass().getMethods();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(methods, "getMethods(...)");
                for (java.lang.reflect.Method method : methods) {
                    p012xc85e97e9.p093xedfae76a.l0 l0Var = (p012xc85e97e9.p093xedfae76a.l0) method.getAnnotation(p012xc85e97e9.p093xedfae76a.l0.class);
                    if (l0Var != null && l0Var.m7813x6ac9171() == p012xc85e97e9.p093xedfae76a.m.ON_CREATE) {
                        method.invoke(xVar, new java.lang.Object[0]);
                    }
                }
            }
        }
        this.f381820c = p012xc85e97e9.p093xedfae76a.n.CREATED;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mvvm.PluginLifecycleRegistry", "moveToCreateState end");
    }

    public final void e() {
        java.util.List<p012xc85e97e9.p093xedfae76a.x> list;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mvvm.PluginLifecycleRegistry", "moveToDestroyState start");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f381821d;
        if (concurrentHashMap != null) {
            list = new java.util.ArrayList(concurrentHashMap.size());
            java.util.Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                list.add((p012xc85e97e9.p093xedfae76a.x) ((java.util.Map.Entry) it.next()).getValue());
            }
        } else {
            list = kz5.p0.f395529d;
        }
        for (p012xc85e97e9.p093xedfae76a.x xVar : list) {
            if (xVar instanceof p012xc85e97e9.p093xedfae76a.v) {
                ((p012xc85e97e9.p093xedfae76a.v) xVar).mo2520xaba1ac62(this.f381819b, p012xc85e97e9.p093xedfae76a.m.ON_DESTROY);
            } else {
                java.lang.reflect.Method[] methods = xVar.getClass().getMethods();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(methods, "getMethods(...)");
                for (java.lang.reflect.Method method : methods) {
                    p012xc85e97e9.p093xedfae76a.l0 l0Var = (p012xc85e97e9.p093xedfae76a.l0) method.getAnnotation(p012xc85e97e9.p093xedfae76a.l0.class);
                    if (l0Var != null && l0Var.m7813x6ac9171() == p012xc85e97e9.p093xedfae76a.m.ON_DESTROY) {
                        method.invoke(xVar, new java.lang.Object[0]);
                    }
                }
            }
        }
        this.f381821d = null;
        this.f381820c = p012xc85e97e9.p093xedfae76a.n.DESTROYED;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mvvm.PluginLifecycleRegistry", "moveToDestroyState end");
    }
}
