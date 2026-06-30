package r26;

/* loaded from: classes10.dex */
public final class t implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.regex.Pattern f450450d;

    public t(java.util.regex.Pattern nativePattern) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nativePattern, "nativePattern");
        this.f450450d = nativePattern;
    }

    public static q26.n c(r26.t tVar, java.lang.CharSequence input, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        tVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        if (i17 >= 0 && i17 <= input.length()) {
            return new q26.m(new r26.r(tVar, input, i17), r26.s.f450449d);
        }
        throw new java.lang.IndexOutOfBoundsException("Start index out of bounds: " + i17 + ", input length: " + input.length());
    }

    public final boolean a(java.lang.CharSequence input) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        return this.f450450d.matcher(input).find();
    }

    public final r26.m b(java.lang.CharSequence input, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        java.util.regex.Matcher matcher = this.f450450d.matcher(input);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(matcher, "matcher(...)");
        return r26.u.a(matcher, i17, input);
    }

    public final r26.m d(java.lang.CharSequence input) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        java.util.regex.Matcher matcher = this.f450450d.matcher(input);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new r26.q(matcher, input);
        }
        return null;
    }

    public final boolean e(java.lang.CharSequence input) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        return this.f450450d.matcher(input).matches();
    }

    public final java.lang.String f(java.lang.CharSequence input, yz5.l transform) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transform, "transform");
        int i17 = 0;
        r26.m b17 = b(input, 0);
        if (b17 == null) {
            return input.toString();
        }
        int length = input.length();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(length);
        do {
            r26.q qVar = (r26.q) b17;
            sb6.append(input, i17, qVar.b().h().intValue());
            sb6.append((java.lang.CharSequence) transform.mo146xb9724478(qVar));
            i17 = qVar.b().g().intValue() + 1;
            b17 = qVar.d();
            if (i17 >= length) {
                break;
            }
        } while (b17 != null);
        if (i17 < length) {
            sb6.append(input, i17, length);
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.util.List g(java.lang.CharSequence input, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        r26.n0.c0(i17);
        java.util.regex.Matcher matcher = this.f450450d.matcher(input);
        if (i17 == 1 || !matcher.find()) {
            return kz5.b0.c(input.toString());
        }
        int i18 = 10;
        if (i17 > 0 && i17 <= 10) {
            i18 = i17;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i18);
        int i19 = i17 - 1;
        int i27 = 0;
        do {
            arrayList.add(input.subSequence(i27, matcher.start()).toString());
            i27 = matcher.end();
            if (i19 >= 0 && arrayList.size() == i19) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(i27, input.length()).toString());
        return arrayList;
    }

    /* renamed from: toString */
    public java.lang.String m161401x9616526c() {
        java.lang.String pattern = this.f450450d.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pattern, "toString(...)");
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r26.t.<init>(java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t(java.lang.String r2, r26.v r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r0)
            java.lang.String r0 = "option"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)
            int r3 = r3.f450453d
            r0 = r3 & 2
            if (r0 == 0) goto L12
            r3 = r3 | 64
        L12:
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r26.t.<init>(java.lang.String, r26.v):void");
    }
}
