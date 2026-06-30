package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes3.dex */
public final class t2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f284627a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Bitmap f284628b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.l f284629c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Matrix f284630d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.l f284631e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Matrix f284632f;

    /* renamed from: g, reason: collision with root package name */
    public final float f284633g;

    /* renamed from: h, reason: collision with root package name */
    public final float f284634h;

    public t2(long j17, android.graphics.Bitmap bitmap, jz5.l startWH, android.graphics.Matrix startMatrix, jz5.l endWH, android.graphics.Matrix endMatrix, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(startWH, "startWH");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(startMatrix, "startMatrix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(endWH, "endWH");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(endMatrix, "endMatrix");
        this.f284627a = j17;
        this.f284628b = bitmap;
        this.f284629c = startWH;
        this.f284630d = startMatrix;
        this.f284631e = endWH;
        this.f284632f = endMatrix;
        this.f284633g = f17;
        this.f284634h = f18;
    }

    /* renamed from: equals */
    public boolean m79914xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.t2)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.t2 t2Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.t2) obj;
        return this.f284627a == t2Var.f284627a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f284628b, t2Var.f284628b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f284629c, t2Var.f284629c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f284630d, t2Var.f284630d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f284631e, t2Var.f284631e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f284632f, t2Var.f284632f) && java.lang.Float.compare(this.f284633g, t2Var.f284633g) == 0 && java.lang.Float.compare(this.f284634h, t2Var.f284634h) == 0;
    }

    /* renamed from: hashCode */
    public int m79915x8cdac1b() {
        return (((((((((((((java.lang.Long.hashCode(this.f284627a) * 31) + this.f284628b.hashCode()) * 31) + this.f284629c.m141638x8cdac1b()) * 31) + this.f284630d.hashCode()) * 31) + this.f284631e.m141638x8cdac1b()) * 31) + this.f284632f.hashCode()) * 31) + java.lang.Float.hashCode(this.f284633g)) * 31) + java.lang.Float.hashCode(this.f284634h);
    }

    /* renamed from: toString */
    public java.lang.String m79916x9616526c() {
        return "Element(order=" + this.f284627a + ", bitmap=" + this.f284628b + ", startWH=" + this.f284629c + ", startMatrix=" + this.f284630d + ", endWH=" + this.f284631e + ", endMatrix=" + this.f284632f + ", startCornerRadiusPx=" + this.f284633g + ", endCornerRadiusPx=" + this.f284634h + ')';
    }
}
