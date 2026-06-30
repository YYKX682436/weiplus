package com.tencent.luggage.sdk.processes;

/* loaded from: classes7.dex */
public final class i implements wu5.j {
    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.luggage.sdk.processes.r rVar = com.tencent.luggage.sdk.processes.r.f47682f;
        if (rVar == null) {
            kotlin.jvm.internal.o.o("INSTANCE_");
            throw null;
        }
        java.util.Iterator it = rVar.k().iterator();
        while (it.hasNext()) {
            ((com.tencent.luggage.sdk.processes.h) it.next()).j();
        }
    }
}
