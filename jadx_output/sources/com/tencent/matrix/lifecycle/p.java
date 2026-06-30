package com.tencent.matrix.lifecycle;

/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.Executor f52769a;

    /* renamed from: b, reason: collision with root package name */
    public final int f52770b;

    /* renamed from: c, reason: collision with root package name */
    public final long f52771c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.p f52772d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.q f52773e;

    public p(java.util.concurrent.Executor executor, int i17, long j17, yz5.p onHeavyTaskDetected, yz5.q onWorkerBlocked) {
        kotlin.jvm.internal.o.g(onHeavyTaskDetected, "onHeavyTaskDetected");
        kotlin.jvm.internal.o.g(onWorkerBlocked, "onWorkerBlocked");
        this.f52769a = executor;
        this.f52770b = i17;
        this.f52771c = j17;
        this.f52772d = onHeavyTaskDetected;
        this.f52773e = onWorkerBlocked;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.matrix.lifecycle.p)) {
            return false;
        }
        com.tencent.matrix.lifecycle.p pVar = (com.tencent.matrix.lifecycle.p) obj;
        return kotlin.jvm.internal.o.b(this.f52769a, pVar.f52769a) && this.f52770b == pVar.f52770b && this.f52771c == pVar.f52771c && kotlin.jvm.internal.o.b(this.f52772d, pVar.f52772d) && kotlin.jvm.internal.o.b(this.f52773e, pVar.f52773e);
    }

    public int hashCode() {
        java.util.concurrent.Executor executor = this.f52769a;
        int hashCode = (((executor != null ? executor.hashCode() : 0) * 31) + this.f52770b) * 31;
        long j17 = this.f52771c;
        int i17 = (hashCode + ((int) (j17 ^ (j17 >>> 32)))) * 31;
        yz5.p pVar = this.f52772d;
        int hashCode2 = (i17 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        yz5.q qVar = this.f52773e;
        return hashCode2 + (qVar != null ? qVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "LifecycleThreadConfig(externalExecutor=" + this.f52769a + ", maxPoolSize=" + this.f52770b + ", keepAliveSeconds=" + this.f52771c + ", onHeavyTaskDetected=" + this.f52772d + ", onWorkerBlocked=" + this.f52773e + ")";
    }

    public /* synthetic */ p(java.util.concurrent.Executor executor, int i17, long j17, yz5.p pVar, yz5.q qVar, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? null : executor, (i18 & 2) != 0 ? 5 : i17, (i18 & 4) != 0 ? 30L : j17, (i18 & 8) != 0 ? com.tencent.matrix.lifecycle.n.f52704d : pVar, (i18 & 16) != 0 ? com.tencent.matrix.lifecycle.o.f52705d : qVar);
    }
}
