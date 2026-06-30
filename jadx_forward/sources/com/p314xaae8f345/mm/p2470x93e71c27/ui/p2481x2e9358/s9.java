package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public final class s9 {

    /* renamed from: j, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.s9 f272181j = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.s9("", null, null, -1, -1, false, null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f272182a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Character f272183b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f272184c;

    /* renamed from: d, reason: collision with root package name */
    public final int f272185d;

    /* renamed from: e, reason: collision with root package name */
    public final int f272186e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f272187f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Character f272188g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f272189h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f272190i;

    public s9(java.lang.String numStr, java.lang.Character ch6, java.lang.String str, int i17, int i18, boolean z17, java.lang.Character ch7) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(numStr, "numStr");
        this.f272182a = numStr;
        this.f272183b = ch6;
        this.f272184c = str;
        this.f272185d = i17;
        this.f272186e = i18;
        this.f272187f = z17;
        this.f272188g = ch7;
        this.f272189h = "";
        this.f272190i = jz5.h.b(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.r9(this));
    }

    public final java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.Character ch6 = this.f272183b;
        if (ch6 != null) {
            sb6.append(ch6.charValue());
        }
        java.lang.String str = this.f272189h;
        if (str == null || r26.n0.N(str)) {
            sb6.append("1");
        } else {
            sb6.append(this.f272189h);
        }
        java.lang.String str2 = this.f272184c;
        if (str2 != null) {
            sb6.append(str2);
        }
        if (this.f272187f) {
            sb6.append("b");
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    /* renamed from: equals */
    public boolean m75564xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.s9)) {
            return false;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.s9 s9Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.s9) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f272182a, s9Var.f272182a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f272183b, s9Var.f272183b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f272184c, s9Var.f272184c) && this.f272185d == s9Var.f272185d && this.f272186e == s9Var.f272186e && this.f272187f == s9Var.f272187f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f272188g, s9Var.f272188g);
    }

    /* renamed from: hashCode */
    public int m75565x8cdac1b() {
        int hashCode = this.f272182a.hashCode() * 31;
        java.lang.Character ch6 = this.f272183b;
        int hashCode2 = (hashCode + (ch6 == null ? 0 : ch6.hashCode())) * 31;
        java.lang.String str = this.f272184c;
        int hashCode3 = (((((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f272185d)) * 31) + java.lang.Integer.hashCode(this.f272186e)) * 31) + java.lang.Boolean.hashCode(this.f272187f)) * 31;
        java.lang.Character ch7 = this.f272188g;
        return hashCode3 + (ch7 != null ? ch7.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m75566x9616526c() {
        return "SeqInfo(numStr=" + this.f272182a + ", leftPattern=" + this.f272183b + ", rightPattern=" + this.f272184c + ", beginIndex=" + this.f272185d + ", endIndex=" + this.f272186e + ", isHasBlank=" + this.f272187f + ", nextChar=" + this.f272188g + ')';
    }
}
