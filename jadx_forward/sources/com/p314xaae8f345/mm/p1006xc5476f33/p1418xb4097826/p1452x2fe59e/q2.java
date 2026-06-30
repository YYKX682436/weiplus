package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f190324a;

    /* renamed from: b, reason: collision with root package name */
    public final long f190325b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.wy0 f190326c;

    public q2(java.lang.String enterSessionId, long j17, r45.wy0 wy0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterSessionId, "enterSessionId");
        this.f190324a = enterSessionId;
        this.f190325b = j17;
        this.f190326c = wy0Var;
    }

    /* renamed from: equals */
    public boolean m56538xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q2)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q2 q2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f190324a, q2Var.f190324a) && this.f190325b == q2Var.f190325b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f190326c, q2Var.f190326c);
    }

    /* renamed from: hashCode */
    public int m56539x8cdac1b() {
        int hashCode = ((this.f190324a.hashCode() * 31) + java.lang.Long.hashCode(this.f190325b)) * 31;
        r45.wy0 wy0Var = this.f190326c;
        return hashCode + (wy0Var == null ? 0 : wy0Var.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m56540x9616526c() {
        return "FinderCommentTitleBarCacheInfo(enterSessionId=" + this.f190324a + ", requestId=" + this.f190325b + ", titleBarInfo=" + this.f190326c + ')';
    }
}
