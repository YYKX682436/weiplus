package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final long f157842a;

    /* renamed from: b, reason: collision with root package name */
    public final long f157843b;

    /* renamed from: c, reason: collision with root package name */
    public final int f157844c;

    public r(long j17, long j18, int i17) {
        this.f157842a = j17;
        this.f157843b = j18;
        this.f157844c = i17;
    }

    /* renamed from: equals */
    public boolean m49698xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.r)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.r rVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.r) obj;
        return this.f157842a == rVar.f157842a && this.f157843b == rVar.f157843b && this.f157844c == rVar.f157844c;
    }

    /* renamed from: hashCode */
    public int m49699x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f157842a) * 31) + java.lang.Long.hashCode(this.f157843b)) * 31) + java.lang.Integer.hashCode(this.f157844c);
    }

    /* renamed from: toString */
    public java.lang.String m49700x9616526c() {
        return "Result(readTime=" + this.f157842a + ", writeTime=" + this.f157843b + ", size=" + this.f157844c + ')';
    }
}
