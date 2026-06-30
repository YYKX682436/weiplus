package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public final class u7 {

    /* renamed from: a, reason: collision with root package name */
    public final long f163627a;

    /* renamed from: b, reason: collision with root package name */
    public final long f163628b;

    /* renamed from: c, reason: collision with root package name */
    public final int f163629c;

    /* renamed from: d, reason: collision with root package name */
    public final int f163630d;

    public u7(long j17, long j18, int i17, int i18) {
        this.f163627a = j17;
        this.f163628b = j18;
        this.f163629c = i17;
        this.f163630d = i18;
    }

    /* renamed from: equals */
    public boolean m51102xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.u7)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.u7 u7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.u7) obj;
        return this.f163627a == u7Var.f163627a && this.f163628b == u7Var.f163628b && this.f163629c == u7Var.f163629c && this.f163630d == u7Var.f163630d;
    }

    /* renamed from: hashCode */
    public int m51103x8cdac1b() {
        return (((((java.lang.Long.hashCode(this.f163627a) * 31) + java.lang.Long.hashCode(this.f163628b)) * 31) + java.lang.Integer.hashCode(this.f163629c)) * 31) + java.lang.Integer.hashCode(this.f163630d);
    }

    /* renamed from: toString */
    public java.lang.String m51104x9616526c() {
        return "VideoMetaData(duration=" + this.f163627a + ", size=" + this.f163628b + ", width=" + this.f163629c + ", height=" + this.f163630d + ')';
    }
}
