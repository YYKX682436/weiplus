package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes8.dex */
public final class tx {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f217596a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f217597b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f217598c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f217599d;

    public tx(java.lang.String str, boolean z17, boolean z18, java.lang.String face_verify_url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(face_verify_url, "face_verify_url");
        this.f217596a = str;
        this.f217597b = z17;
        this.f217598c = z18;
        this.f217599d = face_verify_url;
    }

    /* renamed from: equals */
    public boolean m63257xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.tx)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.tx txVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.tx) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f217596a, txVar.f217596a) && this.f217597b == txVar.f217597b && this.f217598c == txVar.f217598c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f217599d, txVar.f217599d);
    }

    /* renamed from: hashCode */
    public int m63258x8cdac1b() {
        java.lang.String str = this.f217596a;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f217597b)) * 31) + java.lang.Boolean.hashCode(this.f217598c)) * 31) + this.f217599d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m63259x9616526c() {
        return "{isSuccess=" + this.f217597b + " need_face_verify=" + this.f217598c + " face_verify_url=" + this.f217599d + " username=" + this.f217596a + '}';
    }
}
