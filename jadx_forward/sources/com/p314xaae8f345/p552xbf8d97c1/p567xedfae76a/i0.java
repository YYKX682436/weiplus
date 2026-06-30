package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a;

/* loaded from: classes5.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f134232a;

    /* renamed from: b, reason: collision with root package name */
    public final long f134233b;

    public i0(java.lang.String task, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        this.f134232a = task;
        this.f134233b = j17;
    }

    /* renamed from: equals */
    public boolean m41002xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.i0)) {
            return false;
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.i0 i0Var = (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.i0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134232a, i0Var.f134232a) && this.f134233b == i0Var.f134233b;
    }

    /* renamed from: hashCode */
    public int m41003x8cdac1b() {
        java.lang.String str = this.f134232a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j17 = this.f134233b;
        return (hashCode * 31) + ((int) (j17 ^ (j17 >>> 32)));
    }

    /* renamed from: toString */
    public java.lang.String m41004x9616526c() {
        return "TaskInfo(task=" + this.f134232a + ", time=" + this.f134233b + ")";
    }
}
