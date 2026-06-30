package l36;

/* loaded from: classes16.dex */
public final class k0 {

    /* renamed from: i, reason: collision with root package name */
    public static final char[] f397063i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f397064a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f397065b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f397066c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f397067d;

    /* renamed from: e, reason: collision with root package name */
    public final int f397068e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f397069f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f397070g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f397071h;

    public k0(l36.j0 j0Var) {
        this.f397064a = j0Var.f397051a;
        java.lang.String str = j0Var.f397052b;
        this.f397065b = j(str, 0, str.length(), false);
        java.lang.String str2 = j0Var.f397053c;
        this.f397066c = j(str2, 0, str2.length(), false);
        this.f397067d = j0Var.f397054d;
        int i17 = j0Var.f397055e;
        this.f397068e = i17 == -1 ? c(j0Var.f397051a) : i17;
        k(j0Var.f397056f, false);
        java.util.List list = j0Var.f397057g;
        this.f397069f = list != null ? k(list, true) : null;
        java.lang.String str3 = j0Var.f397058h;
        this.f397070g = str3 != null ? j(str3, 0, str3.length(), false) : null;
        this.f397071h = j0Var.m145026x9616526c();
    }

    public static java.lang.String a(java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17, boolean z18, boolean z19, boolean z27, java.nio.charset.Charset charset) {
        int i19 = i17;
        while (i19 < i18) {
            int codePointAt = str.codePointAt(i19);
            int i27 = -1;
            int i28 = 128;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z27) || str2.indexOf(codePointAt) != -1 || ((codePointAt == 37 && (!z17 || (z18 && !l(str, i19, i18)))) || (codePointAt == 43 && z19)))) {
                x36.k kVar = new x36.k();
                kVar.P(str, i17, i19);
                x36.k kVar2 = null;
                while (i19 < i18) {
                    int codePointAt2 = str.codePointAt(i19);
                    if (!z17 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z19) {
                            kVar.O(z17 ? "+" : "%2B");
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= i28 && z27) || str2.indexOf(codePointAt2) != i27 || (codePointAt2 == 37 && (!z17 || (z18 && !l(str, i19, i18)))))) {
                            if (kVar2 == null) {
                                kVar2 = new x36.k();
                            }
                            if (charset == null || charset.equals(m36.e.f404922d)) {
                                kVar2.Q(codePointAt2);
                            } else {
                                int charCount = java.lang.Character.charCount(codePointAt2) + i19;
                                if (!(i19 >= 0)) {
                                    throw new java.lang.IllegalArgumentException(("beginIndex < 0: " + i19).toString());
                                }
                                if (!(charCount >= i19)) {
                                    throw new java.lang.IllegalArgumentException(("endIndex < beginIndex: " + charCount + " < " + i19).toString());
                                }
                                if (!(charCount <= str.length())) {
                                    throw new java.lang.IllegalArgumentException(("endIndex > string.length: " + charCount + " > " + str.length()).toString());
                                }
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(charset, r26.c.f450398a)) {
                                    kVar2.P(str, i19, charCount);
                                } else {
                                    java.lang.String substring = str.substring(i19, charCount);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    byte[] bytes = substring.getBytes(charset);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "(this as java.lang.String).getBytes(charset)");
                                    kVar2.A(bytes, 0, bytes.length);
                                }
                            }
                            while (!kVar2.o1()) {
                                int mo174955xcc4273be = kVar2.mo174955xcc4273be() & 255;
                                kVar.F(37);
                                char[] cArr = f397063i;
                                kVar.F(cArr[(mo174955xcc4273be >> 4) & 15]);
                                kVar.F(cArr[mo174955xcc4273be & 15]);
                            }
                        } else {
                            kVar.Q(codePointAt2);
                        }
                    }
                    i19 += java.lang.Character.charCount(codePointAt2);
                    i27 = -1;
                    i28 = 128;
                }
                return kVar.q();
            }
            i19 += java.lang.Character.charCount(codePointAt);
        }
        return str.substring(i17, i18);
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2, boolean z17, boolean z18, boolean z19, boolean z27) {
        return a(str, 0, str.length(), str2, z17, z18, z19, z27, null);
    }

    public static int c(java.lang.String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.h1.f33726x366c91de;
        }
        return -1;
    }

    public static void i(java.lang.StringBuilder sb6, java.util.List list) {
        int size = list.size();
        for (int i17 = 0; i17 < size; i17 += 2) {
            java.lang.String str = (java.lang.String) list.get(i17);
            java.lang.String str2 = (java.lang.String) list.get(i17 + 1);
            if (i17 > 0) {
                sb6.append('&');
            }
            sb6.append(str);
            if (str2 != null) {
                sb6.append('=');
                sb6.append(str2);
            }
        }
    }

    public static java.lang.String j(java.lang.String str, int i17, int i18, boolean z17) {
        int i19;
        int i27 = i17;
        while (i27 < i18) {
            char charAt = str.charAt(i27);
            if (charAt == '%' || (charAt == '+' && z17)) {
                x36.k kVar = new x36.k();
                kVar.P(str, i17, i27);
                while (i27 < i18) {
                    int codePointAt = str.codePointAt(i27);
                    if (codePointAt != 37 || (i19 = i27 + 2) >= i18) {
                        if (codePointAt == 43 && z17) {
                            kVar.F(32);
                        }
                        kVar.Q(codePointAt);
                    } else {
                        int e17 = m36.e.e(str.charAt(i27 + 1));
                        int e18 = m36.e.e(str.charAt(i19));
                        if (e17 != -1 && e18 != -1) {
                            kVar.F((e17 << 4) + e18);
                            i27 = i19;
                        }
                        kVar.Q(codePointAt);
                    }
                    i27 += java.lang.Character.charCount(codePointAt);
                }
                return kVar.q();
            }
            i27++;
        }
        return str.substring(i17, i18);
    }

    public static boolean l(java.lang.String str, int i17, int i18) {
        int i19 = i17 + 2;
        return i19 < i18 && str.charAt(i17) == '%' && m36.e.e(str.charAt(i17 + 1)) != -1 && m36.e.e(str.charAt(i19)) != -1;
    }

    public static java.util.List m(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        while (i17 <= str.length()) {
            int indexOf = str.indexOf(38, i17);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i17);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i17, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i17, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i17 = indexOf + 1;
        }
        return arrayList;
    }

    public java.lang.String d() {
        if (this.f397066c.isEmpty()) {
            return "";
        }
        int length = this.f397064a.length() + 3;
        java.lang.String str = this.f397071h;
        return str.substring(str.indexOf(58, length) + 1, str.indexOf(64));
    }

    public java.lang.String e() {
        int length = this.f397064a.length() + 3;
        java.lang.String str = this.f397071h;
        int indexOf = str.indexOf(47, length);
        return str.substring(indexOf, m36.e.h(str, indexOf, str.length(), "?#"));
    }

    /* renamed from: equals */
    public boolean m145028xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof l36.k0) && ((l36.k0) obj).f397071h.equals(this.f397071h);
    }

    public java.util.List f() {
        int length = this.f397064a.length() + 3;
        java.lang.String str = this.f397071h;
        int indexOf = str.indexOf(47, length);
        int h17 = m36.e.h(str, indexOf, str.length(), "?#");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (indexOf < h17) {
            int i17 = indexOf + 1;
            int g17 = m36.e.g(str, i17, h17, '/');
            arrayList.add(str.substring(i17, g17));
            indexOf = g17;
        }
        return arrayList;
    }

    public java.lang.String g() {
        if (this.f397069f == null) {
            return null;
        }
        java.lang.String str = this.f397071h;
        int indexOf = str.indexOf(63) + 1;
        return str.substring(indexOf, m36.e.g(str, indexOf, str.length(), '#'));
    }

    public java.lang.String h() {
        if (this.f397065b.isEmpty()) {
            return "";
        }
        int length = this.f397064a.length() + 3;
        java.lang.String str = this.f397071h;
        return str.substring(length, m36.e.h(str, length, str.length(), ":@"));
    }

    /* renamed from: hashCode */
    public int m145029x8cdac1b() {
        return this.f397071h.hashCode();
    }

    public final java.util.List k(java.util.List list, boolean z17) {
        int size = list.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.String str = (java.lang.String) list.get(i17);
            arrayList.add(str != null ? j(str, 0, str.length(), z17) : null);
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    public java.lang.String n() {
        l36.j0 j0Var;
        try {
            j0Var = new l36.j0();
            j0Var.b(this, "/...");
        } catch (java.lang.IllegalArgumentException unused) {
            j0Var = null;
        }
        j0Var.getClass();
        j0Var.f397052b = b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        j0Var.f397053c = b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return j0Var.a().f397071h;
    }

    public java.net.URI o() {
        l36.j0 j0Var = new l36.j0();
        java.lang.String str = this.f397064a;
        j0Var.f397051a = str;
        j0Var.f397052b = h();
        j0Var.f397053c = d();
        j0Var.f397054d = this.f397067d;
        int c17 = c(str);
        int i17 = this.f397068e;
        if (i17 == c17) {
            i17 = -1;
        }
        j0Var.f397055e = i17;
        java.util.List list = j0Var.f397056f;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        arrayList.clear();
        arrayList.addAll(f());
        java.lang.String g17 = g();
        java.lang.String str2 = null;
        j0Var.f397057g = g17 != null ? m(b(g17, " \"'<>#", true, false, true, true)) : null;
        if (this.f397070g != null) {
            java.lang.String str3 = this.f397071h;
            str2 = str3.substring(str3.indexOf(35) + 1);
        }
        j0Var.f397058h = str2;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
        int size = arrayList2.size();
        for (int i18 = 0; i18 < size; i18++) {
            arrayList2.set(i18, b((java.lang.String) arrayList2.get(i18), "[]", true, true, false, true));
        }
        java.util.List list2 = j0Var.f397057g;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i19 = 0; i19 < size2; i19++) {
                java.lang.String str4 = (java.lang.String) j0Var.f397057g.get(i19);
                if (str4 != null) {
                    j0Var.f397057g.set(i19, b(str4, "\\^`{|}", true, true, true, true));
                }
            }
        }
        java.lang.String str5 = j0Var.f397058h;
        if (str5 != null) {
            j0Var.f397058h = b(str5, " \"#<>\\^`{|}", true, true, false, false);
        }
        java.lang.String m145026x9616526c = j0Var.m145026x9616526c();
        try {
            return new java.net.URI(m145026x9616526c);
        } catch (java.net.URISyntaxException e17) {
            try {
                return java.net.URI.create(m145026x9616526c.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (java.lang.Exception unused) {
                throw new java.lang.RuntimeException(e17);
            }
        }
    }

    /* renamed from: toString */
    public java.lang.String m145030x9616526c() {
        return this.f397071h;
    }
}
