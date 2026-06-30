package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class m4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f206665a;

    /* renamed from: b, reason: collision with root package name */
    public final long f206666b;

    /* renamed from: c, reason: collision with root package name */
    public final int f206667c;

    /* renamed from: d, reason: collision with root package name */
    public final int f206668d;

    /* renamed from: e, reason: collision with root package name */
    public int f206669e;

    /* renamed from: f, reason: collision with root package name */
    public int f206670f;

    /* renamed from: g, reason: collision with root package name */
    public int f206671g;

    public m4(int i17, long j17, int i18, int i19, int i27, int i28, int i29, int i37) {
        this.f206665a = i17;
        this.f206666b = j17;
        this.f206667c = i18;
        this.f206668d = i19;
        this.f206669e = i27;
        this.f206670f = i29;
        this.f206671g = i37;
    }

    /* renamed from: equals */
    public boolean m58865xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.m4)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.m4 m4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.m4) obj;
        return this.f206665a == m4Var.f206665a && this.f206666b == m4Var.f206666b && this.f206667c == m4Var.f206667c && this.f206668d == m4Var.f206668d && this.f206669e == m4Var.f206669e && this.f206670f == m4Var.f206670f && this.f206671g == m4Var.f206671g;
    }

    /* renamed from: hashCode */
    public int m58866x8cdac1b() {
        return (((((((((((((java.lang.Integer.hashCode(this.f206665a) * 31) + java.lang.Long.hashCode(this.f206666b)) * 31) + java.lang.Integer.hashCode(this.f206667c)) * 31) + java.lang.Integer.hashCode(this.f206668d)) * 31) + java.lang.Integer.hashCode(this.f206669e)) * 31) + java.lang.Integer.hashCode(0)) * 31) + java.lang.Integer.hashCode(this.f206670f)) * 31) + java.lang.Integer.hashCode(this.f206671g);
    }

    /* renamed from: toString */
    public java.lang.String m58867x9616526c() {
        return "ImageViewInfo(index=" + this.f206665a + ", startExposeMs=" + this.f206666b + ", comeWay=" + this.f206667c + ", viewIdx=" + this.f206668d + ", stayTimeMs=" + this.f206669e + ", isZoomIn=0, isPause=" + this.f206670f + ", isSpeedUp=" + this.f206671g + ')';
    }
}
