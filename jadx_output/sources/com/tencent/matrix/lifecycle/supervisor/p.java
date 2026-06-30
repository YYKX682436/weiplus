package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f52862a = jz5.h.a(jz5.i.f302829d, com.tencent.matrix.lifecycle.supervisor.o.f52861d);

    public final void a(com.tencent.matrix.lifecycle.supervisor.ProcessToken supervisorToken, java.lang.String str, java.lang.String str2, boolean z17) {
        kotlin.jvm.internal.o.g(supervisorToken, "supervisorToken");
        java.util.concurrent.ConcurrentHashMap c17 = c();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : c17.entrySet()) {
            if (!kotlin.jvm.internal.o.b((com.tencent.matrix.lifecycle.supervisor.ProcessToken) entry.getKey(), supervisorToken)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        b(linkedHashMap, new com.tencent.matrix.lifecycle.supervisor.m(str, str2, z17));
    }

    public final void b(java.util.Map map, yz5.l lVar) {
        for (java.util.Map.Entry entry : map.entrySet()) {
            try {
                lVar.invoke(entry);
            } catch (java.lang.Throwable th6) {
                com.tencent.matrix.lifecycle.supervisor.v vVar = com.tencent.matrix.lifecycle.supervisor.v.f52883f;
                oj.j.d(com.tencent.matrix.lifecycle.supervisor.v.a(vVar), th6, ((com.tencent.matrix.lifecycle.supervisor.ProcessToken) entry.getKey()).f52792e + ((com.tencent.matrix.lifecycle.supervisor.ProcessToken) entry.getKey()).f52793f, new java.lang.Object[0]);
                if (th6 instanceof android.os.DeadObjectException) {
                    c().remove(entry.getKey());
                    oj.j.b(com.tencent.matrix.lifecycle.supervisor.v.a(vVar), "remote process of proxy is dead, remove proxy: " + ((com.tencent.matrix.lifecycle.supervisor.ProcessToken) entry.getKey()) + ". size[" + c().size() + ']', new java.lang.Object[0]);
                }
            }
        }
    }

    public final java.util.concurrent.ConcurrentHashMap c() {
        return (java.util.concurrent.ConcurrentHashMap) this.f52862a.getValue();
    }
}
