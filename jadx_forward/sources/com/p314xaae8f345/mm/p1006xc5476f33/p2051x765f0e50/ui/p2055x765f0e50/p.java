package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f242939a;

    /* renamed from: b, reason: collision with root package name */
    public final int f242940b;

    /* renamed from: c, reason: collision with root package name */
    public final int f242941c;

    /* renamed from: d, reason: collision with root package name */
    public final int f242942d;

    /* renamed from: e, reason: collision with root package name */
    public int f242943e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f242944f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f242945g;

    /* renamed from: h, reason: collision with root package name */
    public final int f242946h;

    /* renamed from: i, reason: collision with root package name */
    public final int f242947i;

    public p(int i17, int i18, int i19, int i27, int i28, java.util.List list, java.lang.String qrUrl, int i29, int i37, int i38, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i27 = (i38 & 8) != 0 ? 0 : i27;
        i28 = (i38 & 16) != 0 ? 0 : i28;
        list = (i38 & 32) != 0 ? null : list;
        qrUrl = (i38 & 64) != 0 ? "" : qrUrl;
        i29 = (i38 & 128) != 0 ? 0 : i29;
        i37 = (i38 & 256) != 0 ? 0 : i37;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qrUrl, "qrUrl");
        this.f242939a = i17;
        this.f242940b = i18;
        this.f242941c = i19;
        this.f242942d = i27;
        this.f242943e = i28;
        this.f242944f = list;
        this.f242945g = qrUrl;
        this.f242946h = i29;
        this.f242947i = i37;
    }

    /* renamed from: equals */
    public boolean m69067xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p pVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p) obj;
        return this.f242939a == pVar.f242939a && this.f242940b == pVar.f242940b && this.f242941c == pVar.f242941c && this.f242942d == pVar.f242942d && this.f242943e == pVar.f242943e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f242944f, pVar.f242944f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f242945g, pVar.f242945g) && this.f242946h == pVar.f242946h && this.f242947i == pVar.f242947i;
    }

    /* renamed from: hashCode */
    public int m69068x8cdac1b() {
        int hashCode = ((((((((java.lang.Integer.hashCode(this.f242939a) * 31) + java.lang.Integer.hashCode(this.f242940b)) * 31) + java.lang.Integer.hashCode(this.f242941c)) * 31) + java.lang.Integer.hashCode(this.f242942d)) * 31) + java.lang.Integer.hashCode(this.f242943e)) * 31;
        java.util.List list = this.f242944f;
        return ((((((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.f242945g.hashCode()) * 31) + java.lang.Integer.hashCode(this.f242946h)) * 31) + java.lang.Integer.hashCode(this.f242947i);
    }

    /* renamed from: toString */
    public java.lang.String m69069x9616526c() {
        return "QRInfo(sortIndex=" + this.f242939a + ", qrcodeStyle=" + this.f242940b + ", bgType=" + this.f242941c + ", bgResource=" + this.f242942d + ", bgDominatorColorSize=" + this.f242943e + ", bgDominators=" + this.f242944f + ", qrUrl=" + this.f242945g + ", gradientCodeColor1=" + this.f242946h + ", gradientCodeColor2=" + this.f242947i + ')';
    }
}
