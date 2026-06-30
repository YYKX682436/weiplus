package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* loaded from: classes5.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f230541a;

    /* renamed from: b, reason: collision with root package name */
    public final long f230542b;

    /* renamed from: c, reason: collision with root package name */
    public final int f230543c;

    public e0(int i17, long j17, int i18) {
        this.f230541a = i17;
        this.f230542b = j17;
        this.f230543c = i18;
    }

    /* renamed from: equals */
    public boolean m66945xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.e0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.e0 e0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.e0) obj;
        return this.f230541a == e0Var.f230541a && this.f230542b == e0Var.f230542b && this.f230543c == e0Var.f230543c;
    }

    /* renamed from: hashCode */
    public int m66946x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f230541a) * 31) + java.lang.Long.hashCode(this.f230542b)) * 31) + java.lang.Integer.hashCode(this.f230543c);
    }

    /* renamed from: toString */
    public java.lang.String m66947x9616526c() {
        return "Item(time=" + this.f230541a + ", durationMs=" + this.f230542b + ", type=" + this.f230543c + ')';
    }
}
