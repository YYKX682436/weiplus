package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class b70 {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.Bitmap f193515a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f193516b;

    public b70(android.graphics.Bitmap bitmap, java.lang.String str, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        bitmap = (i17 & 1) != 0 ? null : bitmap;
        str = (i17 & 2) != 0 ? null : str;
        this.f193515a = bitmap;
        this.f193516b = str;
    }

    /* renamed from: equals */
    public boolean m56905xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b70)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b70 b70Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b70) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f193515a, b70Var.f193515a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f193516b, b70Var.f193516b);
    }

    /* renamed from: hashCode */
    public int m56906x8cdac1b() {
        android.graphics.Bitmap bitmap = this.f193515a;
        int hashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        java.lang.String str = this.f193516b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m56907x9616526c() {
        return "ItemData(bitmap=" + this.f193515a + ", url=" + this.f193516b + ')';
    }
}
