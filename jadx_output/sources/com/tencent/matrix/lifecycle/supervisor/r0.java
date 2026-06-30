package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f52869a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f52870b;

    public r0() {
        jz5.i iVar = jz5.i.f302829d;
        this.f52869a = jz5.h.a(iVar, com.tencent.matrix.lifecycle.supervisor.q0.f52866d);
        this.f52870b = jz5.h.a(iVar, com.tencent.matrix.lifecycle.supervisor.p0.f52863d);
    }

    public final boolean a() {
        boolean z17;
        jz5.g gVar = this.f52869a;
        if (((java.util.concurrent.ConcurrentHashMap) gVar.getValue()).isEmpty()) {
            return true;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) gVar.getValue();
        if (!concurrentHashMap.isEmpty()) {
            java.util.Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                if (!(((java.lang.Number) ((java.util.Map.Entry) it.next()).getKey()).intValue() == android.os.Process.myPid())) {
                    z17 = false;
                    break;
                }
            }
        }
        z17 = true;
        return z17;
    }

    public final com.tencent.matrix.lifecycle.supervisor.ProcessToken b(int i17) {
        com.tencent.matrix.lifecycle.supervisor.ProcessToken processToken = (com.tencent.matrix.lifecycle.supervisor.ProcessToken) ((java.util.concurrent.ConcurrentHashMap) this.f52869a.getValue()).remove(java.lang.Integer.valueOf(i17));
        if (processToken != null) {
            ((java.util.concurrent.ConcurrentHashMap) this.f52870b.getValue()).remove(processToken.f52793f);
            return processToken;
        }
        throw new java.lang.IllegalStateException("token with pid=" + i17 + " not found");
    }
}
