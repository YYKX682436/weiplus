package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class g8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f194176a;

    /* renamed from: b, reason: collision with root package name */
    public final int f194177b;

    /* renamed from: c, reason: collision with root package name */
    public final int f194178c;

    /* renamed from: d, reason: collision with root package name */
    public final long f194179d;

    public g8(int i17, int i18, int i19, long j17) {
        this.f194176a = i17;
        this.f194177b = i18;
        this.f194178c = i19;
        this.f194179d = j17;
    }

    /* renamed from: equals */
    public boolean m56952xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g8)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g8 g8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g8) obj;
        return this.f194176a == g8Var.f194176a && this.f194177b == g8Var.f194177b && this.f194178c == g8Var.f194178c && this.f194179d == g8Var.f194179d;
    }

    /* renamed from: hashCode */
    public int m56953x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f194176a) * 31) + java.lang.Integer.hashCode(this.f194177b)) * 31) + java.lang.Integer.hashCode(this.f194178c)) * 31) + java.lang.Long.hashCode(this.f194179d);
    }

    /* renamed from: toString */
    public java.lang.String m56954x9616526c() {
        return "songId:" + this.f194176a + ", playStatus:" + this.f194177b + ", songVolume:" + this.f194178c + ", songOptVersion:" + this.f194179d;
    }
}
