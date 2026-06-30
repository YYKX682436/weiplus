package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f157666a;

    /* renamed from: b, reason: collision with root package name */
    public final long f157667b;

    /* renamed from: c, reason: collision with root package name */
    public final int f157668c;

    public a(long j17, long j18, int i17) {
        this.f157666a = j17;
        this.f157667b = j18;
        this.f157668c = i17;
    }

    /* renamed from: equals */
    public boolean m49653xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a) obj;
        return this.f157666a == aVar.f157666a && this.f157667b == aVar.f157667b && this.f157668c == aVar.f157668c;
    }

    /* renamed from: hashCode */
    public int m49654x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f157666a) * 31) + java.lang.Long.hashCode(this.f157667b)) * 31) + java.lang.Integer.hashCode(this.f157668c);
    }

    /* renamed from: toString */
    public java.lang.String m49655x9616526c() {
        return "Result(readTime=" + this.f157666a + ", writeTime=" + this.f157667b + ", size=" + this.f157668c + ')';
    }
}
