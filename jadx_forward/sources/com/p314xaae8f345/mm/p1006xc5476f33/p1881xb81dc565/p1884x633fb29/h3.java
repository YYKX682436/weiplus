package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes8.dex */
public final class h3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f231526a;

    /* renamed from: b, reason: collision with root package name */
    public int f231527b;

    /* renamed from: c, reason: collision with root package name */
    public int f231528c;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f231529d;

    public h3(java.lang.String userName, int i17, int i18, android.graphics.Bitmap bitmap, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i19 & 2) != 0 ? 0 : i17;
        i18 = (i19 & 4) != 0 ? 0 : i18;
        bitmap = (i19 & 8) != 0 ? null : bitmap;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f231526a = userName;
        this.f231527b = i17;
        this.f231528c = i18;
        this.f231529d = bitmap;
    }

    /* renamed from: equals */
    public boolean m67033xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.h3)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.h3 h3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.h3) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f231526a, h3Var.f231526a) && this.f231527b == h3Var.f231527b && this.f231528c == h3Var.f231528c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f231529d, h3Var.f231529d);
    }

    /* renamed from: hashCode */
    public int m67034x8cdac1b() {
        int hashCode = ((((this.f231526a.hashCode() * 31) + java.lang.Integer.hashCode(this.f231527b)) * 31) + java.lang.Integer.hashCode(this.f231528c)) * 31;
        android.graphics.Bitmap bitmap = this.f231529d;
        return hashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m67035x9616526c() {
        return "BitmapHolder(userName=" + this.f231526a + ", angle=" + this.f231527b + ", mirror=" + this.f231528c + ", dataBitmap=" + this.f231529d + ')';
    }
}
