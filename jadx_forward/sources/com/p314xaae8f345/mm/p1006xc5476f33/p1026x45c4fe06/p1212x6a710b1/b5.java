package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public final class b5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f171924a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.locks.Condition f171925b;

    public b5(java.util.concurrent.locks.ReentrantLock lock, java.util.concurrent.locks.Condition condition) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lock, "lock");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(condition, "condition");
        this.f171924a = lock;
        this.f171925b = condition;
    }

    /* renamed from: equals */
    public boolean m53082xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b5)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b5 b5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b5) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f171924a, b5Var.f171924a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f171925b, b5Var.f171925b);
    }

    /* renamed from: hashCode */
    public int m53083x8cdac1b() {
        return (this.f171924a.hashCode() * 31) + this.f171925b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m53084x9616526c() {
        return "LockAndCondition(lock=" + this.f171924a + ", condition=" + this.f171925b + ')';
    }
}
