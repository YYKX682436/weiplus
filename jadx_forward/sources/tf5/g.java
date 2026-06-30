package tf5;

/* loaded from: classes11.dex */
public final class g extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.z3 f500511d;

    /* renamed from: e, reason: collision with root package name */
    public final int f500512e;

    /* renamed from: f, reason: collision with root package name */
    public final int f500513f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f500514g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f500515h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f500516i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f500517m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.CharSequence f500518n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.CharSequence f500519o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f500520p;

    public g(com.p314xaae8f345.mm.p2621x8fb0427b.z3 contact, int i17, int i18) {
        java.lang.String U0;
        java.lang.String str;
        java.lang.String U02;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String valueOf;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        this.f500511d = contact;
        this.f500512e = i17;
        this.f500513f = i18;
        this.f500515h = "";
        this.f500516i = true;
        java.util.ArrayList arrayList = new java.util.ArrayList(5);
        this.f500517m = arrayList;
        this.f500520p = "";
        java.lang.String wi6 = ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).wi(contact);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        float h17 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia);
        ((ke0.e) xVar).getClass();
        this.f500518n = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.n(context, wi6, h17);
        java.lang.String str5 = contact.f318122y1;
        this.f500519o = str5 == null ? "" : str5;
        java.lang.String y07 = contact.y0();
        if (y07 != null && (r26.n0.N(y07) ^ true)) {
            U0 = contact.y0();
        } else {
            java.lang.String U03 = contact.U0();
            U0 = U03 != null && (r26.n0.N(U03) ^ true) ? contact.U0() : "";
        }
        java.lang.String str6 = "\u007f";
        if (U0 != null) {
            java.util.Locale locale = java.util.Locale.getDefault();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "getDefault(...)");
            str = U0.toUpperCase(locale);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toUpperCase(...)");
        } else {
            str = "\u007f";
        }
        arrayList.add(str);
        java.lang.String w07 = contact.w0();
        if (w07 != null && (r26.n0.N(w07) ^ true)) {
            U02 = contact.w0();
        } else {
            java.lang.String U04 = contact.U0();
            U02 = U04 != null && (r26.n0.N(U04) ^ true) ? contact.U0() : "";
        }
        if (U02 != null) {
            java.util.Locale locale2 = java.util.Locale.getDefault();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale2, "getDefault(...)");
            str2 = U02.toUpperCase(locale2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "toUpperCase(...)");
        } else {
            str2 = "\u007f";
        }
        arrayList.add(str2);
        java.lang.String U05 = contact.U0();
        if (U05 != null) {
            java.util.Locale locale3 = java.util.Locale.getDefault();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale3, "getDefault(...)");
            str3 = U05.toUpperCase(locale3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "toUpperCase(...)");
        } else {
            str3 = "\u007f";
        }
        arrayList.add(str3);
        java.lang.String P0 = contact.P0();
        if (P0 != null) {
            java.util.Locale locale4 = java.util.Locale.getDefault();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale4, "getDefault(...)");
            str4 = P0.toUpperCase(locale4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "toUpperCase(...)");
        } else {
            str4 = "\u007f";
        }
        arrayList.add(str4);
        java.lang.String d17 = contact.d1();
        if (d17 != null) {
            java.util.Locale locale5 = java.util.Locale.getDefault();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale5, "getDefault(...)");
            str6 = d17.toUpperCase(locale5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str6, "toUpperCase(...)");
        }
        arrayList.add(str6);
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (i18 == 123) {
            valueOf = "#";
        } else if (i18 == 32) {
            valueOf = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571434ex);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
        } else {
            valueOf = java.lang.String.valueOf((char) i18);
        }
        this.f500515h = valueOf;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(contact.d1())) {
            j41.b0 b0Var = (j41.b0) i95.n0.c(j41.b0.class);
            java.lang.String fj6 = b0Var != null ? ((l41.q2) b0Var).fj(contact.Q0(), contact.G0()) : null;
            java.lang.String str7 = fj6 != null ? fj6 : "";
            this.f500520p = str7;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("3552365301", contact.Q0())) {
                return;
            }
            this.f500520p = "@" + str7;
        }
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        tf5.g other = (tf5.g) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500511d, other.f500511d) && this.f500514g == other.f500514g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500515h, other.f500515h) && this.f500516i == other.f500516i && this.f500513f == other.f500513f;
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        tf5.g other = (tf5.g) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        int i17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f500512e, other.f500512e);
        if (i17 == 0 && (i17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f500511d.W0(), other.f500511d.W0())) == 0) {
            int i18 = 0;
            while (true) {
                java.util.ArrayList arrayList = this.f500517m;
                if (i18 < arrayList.size()) {
                    java.util.ArrayList arrayList2 = other.f500517m;
                    if (i18 < arrayList2.size()) {
                        java.lang.String str = (java.lang.String) arrayList.get(i18);
                        java.lang.Object obj2 = arrayList2.get(i18);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                        i17 = str.compareTo((java.lang.String) obj2);
                        if (i17 != 0) {
                            break;
                        }
                        i18++;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return i17;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return this.f500512e;
    }

    @Override // xm3.d
    public java.lang.String v() {
        return this.f500511d.d1() + '-' + this.f500512e;
    }
}
