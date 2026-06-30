package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class qc {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f267994a;

    /* renamed from: b, reason: collision with root package name */
    public final int f267995b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f267996c;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f267997d;

    public qc(java.lang.String title, int i17, java.lang.String iconData, android.graphics.Bitmap bitmap, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 2) != 0 ? 0 : i17;
        bitmap = (i18 & 8) != 0 ? null : bitmap;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconData, "iconData");
        this.f267994a = title;
        this.f267995b = i17;
        this.f267996c = iconData;
        this.f267997d = bitmap;
    }

    /* renamed from: equals */
    public boolean m74708xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.qc)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.qc qcVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.qc) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f267994a, qcVar.f267994a) && this.f267995b == qcVar.f267995b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f267996c, qcVar.f267996c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f267997d, qcVar.f267997d);
    }

    /* renamed from: hashCode */
    public int m74709x8cdac1b() {
        int hashCode = ((((this.f267994a.hashCode() * 31) + java.lang.Integer.hashCode(this.f267995b)) * 31) + this.f267996c.hashCode()) * 31;
        android.graphics.Bitmap bitmap = this.f267997d;
        return hashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m74710x9616526c() {
        return "ChildItem(title=" + this.f267994a + ", id=" + this.f267995b + ", iconData=" + this.f267996c + ", iconBm=" + this.f267997d + ')';
    }
}
