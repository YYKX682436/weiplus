package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes3.dex */
public final class w2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f284673a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Matrix f284674b;

    /* renamed from: c, reason: collision with root package name */
    public final int f284675c;

    /* renamed from: d, reason: collision with root package name */
    public final int f284676d;

    /* renamed from: e, reason: collision with root package name */
    public final float f284677e;

    /* renamed from: f, reason: collision with root package name */
    public final float f284678f;

    public w2(android.graphics.Bitmap bitmap, android.graphics.Matrix startMatrix, int i17, int i18, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(startMatrix, "startMatrix");
        this.f284673a = bitmap;
        this.f284674b = startMatrix;
        this.f284675c = i17;
        this.f284676d = i18;
        this.f284677e = f17;
        this.f284678f = f18;
    }

    /* renamed from: equals */
    public boolean m79920xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.w2)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.w2 w2Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.w2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f284673a, w2Var.f284673a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f284674b, w2Var.f284674b) && this.f284675c == w2Var.f284675c && this.f284676d == w2Var.f284676d && java.lang.Float.compare(this.f284677e, w2Var.f284677e) == 0 && java.lang.Float.compare(this.f284678f, w2Var.f284678f) == 0;
    }

    /* renamed from: hashCode */
    public int m79921x8cdac1b() {
        return (((((((((this.f284673a.hashCode() * 31) + this.f284674b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f284675c)) * 31) + java.lang.Integer.hashCode(this.f284676d)) * 31) + java.lang.Float.hashCode(this.f284677e)) * 31) + java.lang.Float.hashCode(this.f284678f);
    }

    /* renamed from: toString */
    public java.lang.String m79922x9616526c() {
        return "Snapshot(bitmap=" + this.f284673a + ", startMatrix=" + this.f284674b + ", width=" + this.f284675c + ", height=" + this.f284676d + ", z=" + this.f284677e + ", cornerRadiusPx=" + this.f284678f + ')';
    }
}
