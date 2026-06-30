package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes10.dex */
public final class e5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f179488a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Rect f179489b;

    /* renamed from: c, reason: collision with root package name */
    public final int f179490c;

    /* renamed from: d, reason: collision with root package name */
    public final int f179491d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Bitmap f179492e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f179493f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f179494g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Bitmap f179495h;

    /* renamed from: i, reason: collision with root package name */
    public final android.util.Range f179496i;

    public e5(java.lang.String filePath, android.graphics.Rect clipBounds, int i17, int i18, android.graphics.Bitmap bitmap, boolean z17, boolean z18, android.graphics.Bitmap bitmap2, android.util.Range trimTimeRange) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clipBounds, "clipBounds");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trimTimeRange, "trimTimeRange");
        this.f179488a = filePath;
        this.f179489b = clipBounds;
        this.f179490c = i17;
        this.f179491d = i18;
        this.f179492e = bitmap;
        this.f179493f = z17;
        this.f179494g = z18;
        this.f179495h = bitmap2;
        this.f179496i = trimTimeRange;
    }

    /* renamed from: equals */
    public boolean m54802xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.e5)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.e5 e5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.e5) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f179488a, e5Var.f179488a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f179489b, e5Var.f179489b) && this.f179490c == e5Var.f179490c && this.f179491d == e5Var.f179491d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f179492e, e5Var.f179492e) && this.f179493f == e5Var.f179493f && this.f179494g == e5Var.f179494g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f179495h, e5Var.f179495h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f179496i, e5Var.f179496i);
    }

    /* renamed from: hashCode */
    public int m54803x8cdac1b() {
        int hashCode = ((((((this.f179488a.hashCode() * 31) + this.f179489b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f179490c)) * 31) + java.lang.Integer.hashCode(this.f179491d)) * 31;
        android.graphics.Bitmap bitmap = this.f179492e;
        int hashCode2 = (((((hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f179493f)) * 31) + java.lang.Boolean.hashCode(this.f179494g)) * 31;
        android.graphics.Bitmap bitmap2 = this.f179495h;
        return ((hashCode2 + (bitmap2 != null ? bitmap2.hashCode() : 0)) * 31) + this.f179496i.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m54804x9616526c() {
        return "GenerateParams(filePath=" + this.f179488a + ", clipBounds=" + this.f179489b + ", scaledWidth=" + this.f179490c + ", scaledHeight=" + this.f179491d + ", textBitmap=" + this.f179492e + ", isGif=" + this.f179493f + ", isVideo=" + this.f179494g + ", imgBitMap=" + this.f179495h + ", trimTimeRange=" + this.f179496i + ')';
    }
}
