package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a;

/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.Executor f134302a;

    /* renamed from: b, reason: collision with root package name */
    public final int f134303b;

    /* renamed from: c, reason: collision with root package name */
    public final long f134304c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.p f134305d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.q f134306e;

    public p(java.util.concurrent.Executor executor, int i17, long j17, yz5.p onHeavyTaskDetected, yz5.q onWorkerBlocked) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onHeavyTaskDetected, "onHeavyTaskDetected");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onWorkerBlocked, "onWorkerBlocked");
        this.f134302a = executor;
        this.f134303b = i17;
        this.f134304c = j17;
        this.f134305d = onHeavyTaskDetected;
        this.f134306e = onWorkerBlocked;
    }

    /* renamed from: equals */
    public boolean m41071xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p)) {
            return false;
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p pVar = (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134302a, pVar.f134302a) && this.f134303b == pVar.f134303b && this.f134304c == pVar.f134304c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134305d, pVar.f134305d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134306e, pVar.f134306e);
    }

    /* renamed from: hashCode */
    public int m41072x8cdac1b() {
        java.util.concurrent.Executor executor = this.f134302a;
        int hashCode = (((executor != null ? executor.hashCode() : 0) * 31) + this.f134303b) * 31;
        long j17 = this.f134304c;
        int i17 = (hashCode + ((int) (j17 ^ (j17 >>> 32)))) * 31;
        yz5.p pVar = this.f134305d;
        int hashCode2 = (i17 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        yz5.q qVar = this.f134306e;
        return hashCode2 + (qVar != null ? qVar.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m41073x9616526c() {
        return "LifecycleThreadConfig(externalExecutor=" + this.f134302a + ", maxPoolSize=" + this.f134303b + ", keepAliveSeconds=" + this.f134304c + ", onHeavyTaskDetected=" + this.f134305d + ", onWorkerBlocked=" + this.f134306e + ")";
    }

    public /* synthetic */ p(java.util.concurrent.Executor executor, int i17, long j17, yz5.p pVar, yz5.q qVar, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? null : executor, (i18 & 2) != 0 ? 5 : i17, (i18 & 4) != 0 ? 30L : j17, (i18 & 8) != 0 ? com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.n.f134237d : pVar, (i18 & 16) != 0 ? com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.o.f134238d : qVar);
    }
}
