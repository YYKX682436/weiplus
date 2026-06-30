package com.p314xaae8f345.mm.udr;

@j95.b
/* loaded from: classes5.dex */
public final class e1 extends i95.w implements com.p314xaae8f345.mm.udr.c0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f278013e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f278014f = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f278015d = jz5.h.b(com.p314xaae8f345.mm.udr.d1.f278012d);

    static {
        java.lang.Iterable all = ((fs.c) fs.g.f(ea5.l.class)).all();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(all, "all(...)");
        java.util.ArrayList<ea5.l> arrayList = new java.util.ArrayList();
        java.util.Iterator it = all.iterator();
        while (it.hasNext()) {
            ea5.l lVar = (ea5.l) ((fs.q) it.next()).get();
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        for (ea5.l lVar2 : arrayList) {
            java.lang.String mo472xca17635e = lVar2.mo472xca17635e();
            if (mo472xca17635e != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UDRGlobalConfigFeatureService", "build class:%s for project:%s", lVar2.getClass().getName(), mo472xca17635e);
                f278013e.put(mo472xca17635e, lVar2);
                f278014f.add(mo472xca17635e);
            }
            java.util.ArrayList<java.lang.String> mo65744x5efea91c = lVar2.mo65744x5efea91c();
            java.util.List<java.lang.String> S0 = mo65744x5efea91c != null ? kz5.n0.S0(mo65744x5efea91c) : null;
            if (S0 != null) {
                for (java.lang.String str : S0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UDRGlobalConfigFeatureService", "build class:%s for projectId:%s", lVar2.getClass().getName(), str);
                    f278013e.put(str, lVar2);
                    f278014f.add(str);
                }
            }
        }
    }

    public e1() {
        jz5.h.b(com.p314xaae8f345.mm.udr.c1.f278009d);
    }

    public ea5.l wi(java.lang.String projectId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f278013e;
        if (concurrentHashMap.containsKey(projectId)) {
            return (ea5.l) concurrentHashMap.get(projectId);
        }
        if (r26.i0.y(projectId, "wxalite", false)) {
            return (ea5.l) concurrentHashMap.get("wxalite");
        }
        return null;
    }
}
