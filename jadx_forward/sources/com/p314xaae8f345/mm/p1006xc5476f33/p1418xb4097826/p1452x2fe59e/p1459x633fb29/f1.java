package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.h32 f189379a;

    /* renamed from: b, reason: collision with root package name */
    public final long f189380b;

    public f1(r45.h32 info, long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i17 & 2) != 0 ? java.lang.System.currentTimeMillis() : j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f189379a = info;
        this.f189380b = j17;
    }

    public final boolean a() {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f189380b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1 i1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189463a;
        return currentTimeMillis < ((long) 600000);
    }

    /* renamed from: equals */
    public boolean m56332xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f1)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f1 f1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f189379a, f1Var.f189379a) && this.f189380b == f1Var.f189380b;
    }

    /* renamed from: hashCode */
    public int m56333x8cdac1b() {
        return (this.f189379a.hashCode() * 31) + java.lang.Long.hashCode(this.f189380b);
    }

    /* renamed from: toString */
    public java.lang.String m56334x9616526c() {
        return "NoticeInfoCacheItem(info=" + this.f189379a + ", timeStamp=" + this.f189380b + ')';
    }
}
