package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes9.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.HandlerThread f152188a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f152189b;

    public j0(android.os.HandlerThread thread, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 handler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thread, "thread");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        this.f152188a = thread;
        this.f152189b = handler;
    }

    /* renamed from: equals */
    public boolean m47966xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p944x882e457a.j0)) {
            return false;
        }
        com.p314xaae8f345.mm.p944x882e457a.j0 j0Var = (com.p314xaae8f345.mm.p944x882e457a.j0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f152188a, j0Var.f152188a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f152189b, j0Var.f152189b);
    }

    /* renamed from: hashCode */
    public int m47967x8cdac1b() {
        return (this.f152188a.hashCode() * 31) + this.f152189b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m47968x9616526c() {
        return "HandlerData(thread=" + this.f152188a + ", handler=" + this.f152189b + ')';
    }
}
