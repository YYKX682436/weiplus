package com.tencent.mm.feature.performance.scheduler;

/* loaded from: classes9.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f67700a = new java.util.LinkedHashMap();

    public final void a(java.lang.String jobTag, yz5.l configure) {
        kotlin.jvm.internal.o.g(jobTag, "jobTag");
        kotlin.jvm.internal.o.g(configure, "configure");
        if (this.f67700a.containsKey(jobTag)) {
            throw new java.lang.IllegalArgumentException("config conflict with [" + jobTag + ']');
        }
        java.util.Map map = this.f67700a;
        com.tencent.mm.feature.performance.scheduler.i0 i0Var = new com.tencent.mm.feature.performance.scheduler.i0(jobTag);
        configure.invoke(i0Var);
        com.tencent.mm.feature.performance.scheduler.z zVar = i0Var.f67693b;
        kotlin.jvm.internal.o.d(zVar);
        if (!(zVar.f67728c != null)) {
            zVar.a(24L);
        }
        map.put(jobTag, i0Var);
    }
}
