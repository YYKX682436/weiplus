package dy3;

/* loaded from: classes.dex */
public final class p extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f326128d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.z3 f326129e;

    /* renamed from: f, reason: collision with root package name */
    public final int f326130f;

    /* renamed from: g, reason: collision with root package name */
    public p13.r f326131g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f326132h;

    /* renamed from: i, reason: collision with root package name */
    public final int f326133i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f326134m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f326135n;

    public p(int i17, com.p314xaae8f345.mm.p2621x8fb0427b.z3 contact, int i18, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        jz5.f0 f0Var = null;
        a3Var = (i19 & 8) != 0 ? null : a3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        this.f326128d = i17;
        this.f326129e = contact;
        this.f326130f = i18;
        this.f326133i = 127;
        java.lang.String str = "";
        this.f326134m = "";
        this.f326135n = "";
        if (i18 == 2) {
            java.lang.String w07 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(contact.w0()) ? contact.w0() : a3Var != null ? a3Var.z0(contact.d1()) : null;
            w07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w07) ? contact.f2() : w07;
            if (w07 != null) {
                java.util.Locale locale = java.util.Locale.getDefault();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "getDefault(...)");
                str = w07.toUpperCase(locale);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toUpperCase(...)");
            }
            ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
            java.lang.String k17 = o13.n.k(str);
            char c17 = '{';
            if (k17 != null) {
                java.util.Locale locale2 = java.util.Locale.getDefault();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale2, "getDefault(...)");
                java.lang.String upperCase = k17.toUpperCase(locale2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(upperCase, "toUpperCase(...)");
                this.f326135n = upperCase.concat("\u007f");
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
                this.f326133i = charValue;
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                this.f326135n = str.concat("\u007f");
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
                this.f326133i = c17;
            }
            java.lang.String str2 = this.f326135n + str;
            this.f326135n = str2;
            int i27 = this.f326133i;
            this.f326134m = (i27 < 65 || i27 > 90) ? "#" : java.lang.String.valueOf((char) i27);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneAtSomeoneLiveItem", "uiDisplayName:" + str + " showHeadCode:" + ((char) this.f326133i) + " compareContent:" + str2);
        }
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        dy3.p other = (dy3.p) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326129e, other.f326129e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326131g, other.f326131g) && this.f326132h == other.f326132h;
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        dy3.p other = (dy3.p) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        int i17 = other.f326130f;
        int i18 = this.f326130f;
        int i19 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(i18, i17);
        if (i19 != 0) {
            return i19;
        }
        if (i18 == 1) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f326128d, other.f326128d);
        }
        int i27 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f326133i, other.f326133i);
        return i27 == 0 ? this.f326135n.compareTo(other.f326135n) : i27;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return this.f326130f;
    }

    @Override // xm3.d
    public java.lang.String v() {
        return this.f326129e.d1() + '-' + this.f326130f;
    }
}
