package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes2.dex */
public final class c4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f198502a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.no0 f198503b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Bitmap f198504c;

    public c4(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.no0 plugin, android.graphics.Bitmap bitmap, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        bitmap = (i18 & 4) != 0 ? null : bitmap;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        this.f198502a = i17;
        this.f198503b = plugin;
        this.f198504c = bitmap;
    }

    /* renamed from: equals */
    public boolean m57842xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c4)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c4 c4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c4) obj;
        return this.f198502a == c4Var.f198502a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f198503b, c4Var.f198503b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f198504c, c4Var.f198504c);
    }

    /* renamed from: hashCode */
    public int m57843x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f198502a) * 31) + this.f198503b.hashCode()) * 31;
        android.graphics.Bitmap bitmap = this.f198504c;
        return hashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m57844x9616526c() {
        return "FinderLiveEndPageData(pageType=" + this.f198502a + ", plugin=" + this.f198503b + ", phBitmap=" + this.f198504c + ')';
    }
}
