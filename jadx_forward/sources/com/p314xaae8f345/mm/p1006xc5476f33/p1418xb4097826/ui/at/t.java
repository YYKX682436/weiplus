package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at;

/* loaded from: classes.dex */
public class t extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f210434d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.z3 f210435e;

    /* renamed from: f, reason: collision with root package name */
    public final int f210436f;

    /* renamed from: g, reason: collision with root package name */
    public p13.y f210437g;

    /* renamed from: h, reason: collision with root package name */
    public p13.r f210438h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f210439i;

    /* renamed from: m, reason: collision with root package name */
    public int f210440m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f210441n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f210442o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f210443p;

    public t(int i17, com.p314xaae8f345.mm.p2621x8fb0427b.z3 contact, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        this.f210434d = i17;
        this.f210435e = contact;
        this.f210436f = i18;
        this.f210440m = 127;
        this.f210441n = "";
        this.f210442o = "";
        this.f210443p = "";
        n();
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.t other = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.t) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f210435e, other.f210435e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f210438h, other.f210438h) && this.f210439i == other.f210439i;
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.t other = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.t) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        int i17 = other.f210436f;
        int i18 = this.f210436f;
        int i19 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(i18, i17);
        if (i19 != 0) {
            return i19;
        }
        if (i18 == 2) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f210434d, other.f210434d);
        }
        int i27 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f210440m, other.f210440m);
        return i27 == 0 ? this.f210443p.compareTo(other.f210443p) : i27;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return this.f210436f;
    }

    public void n() {
        java.lang.String str;
        jz5.f0 f0Var;
        if (this.f210436f == 1) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f210435e;
            java.lang.String w07 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var.w0()) ? z3Var.w0() : z3Var.f2();
            if (w07 != null) {
                java.util.Locale locale = java.util.Locale.getDefault();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "getDefault(...)");
                str = w07.toUpperCase(locale);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toUpperCase(...)");
            } else {
                str = "";
            }
            ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
            java.lang.String k17 = o13.n.k(str);
            char c17 = '{';
            if (k17 != null) {
                java.util.Locale locale2 = java.util.Locale.getDefault();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale2, "getDefault(...)");
                java.lang.String upperCase = k17.toUpperCase(locale2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(upperCase, "toUpperCase(...)");
                this.f210443p = upperCase.concat("\u007f");
                char[] charArray = upperCase.toCharArray();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(charArray, "toCharArray(...)");
                java.lang.Character R = kz5.z.R(charArray, 0);
                char charValue = R != null ? R.charValue() : ' ';
                if ('a' <= charValue && charValue < '{') {
                    charValue = (char) (charValue - ' ');
                } else {
                    if (!('A' <= charValue && charValue < '[')) {
                        charValue = '{';
                    }
                }
                this.f210440m = charValue;
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                this.f210443p = str.concat("\u007f");
                char[] charArray2 = str.toCharArray();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(charArray2, "toCharArray(...)");
                java.lang.Character R2 = kz5.z.R(charArray2, 0);
                char charValue2 = R2 != null ? R2.charValue() : ' ';
                if ('a' <= charValue2 && charValue2 < '{') {
                    c17 = (char) (charValue2 - ' ');
                } else {
                    if ('A' <= charValue2 && charValue2 < '[') {
                        c17 = charValue2;
                    }
                }
                this.f210440m = c17;
            }
            this.f210443p += str;
            int i17 = this.f210440m;
            this.f210441n = (i17 < 65 || i17 > 90) ? "#" : java.lang.String.valueOf((char) i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderAtSomeoneLiveItem", "uiDisplayName:" + str + " showHeadCode:" + ((char) this.f210440m) + " compareContent:" + this.f210443p);
        }
    }

    @Override // xm3.d
    public java.lang.String v() {
        return this.f210435e.d1() + '-' + this.f210436f;
    }
}
