package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public final class a4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f171917a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f171918b;

    /* renamed from: c, reason: collision with root package name */
    public final int f171919c;

    public a4(java.lang.String path, java.lang.String fileName, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        this.f171917a = path;
        this.f171918b = fileName;
        this.f171919c = i17;
    }

    /* renamed from: equals */
    public boolean m53078xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.a4)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.a4 a4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.a4) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f171917a, a4Var.f171917a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f171918b, a4Var.f171918b) && this.f171919c == a4Var.f171919c;
    }

    /* renamed from: hashCode */
    public int m53079x8cdac1b() {
        return (((this.f171917a.hashCode() * 31) + this.f171918b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f171919c);
    }

    /* renamed from: toString */
    public java.lang.String m53080x9616526c() {
        return "PathConversionResult(path=" + this.f171917a + ", fileName=" + this.f171918b + ", fileSize=" + this.f171919c + ')';
    }
}
