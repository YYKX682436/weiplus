package gf5;

/* loaded from: classes11.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f352941a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f352942b;

    /* renamed from: c, reason: collision with root package name */
    public final gf5.g f352943c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f352944d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f352945e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f352946f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f352947g;

    /* renamed from: h, reason: collision with root package name */
    public final gf5.t f352948h;

    /* renamed from: i, reason: collision with root package name */
    public final char f352949i;

    /* renamed from: j, reason: collision with root package name */
    public final gf5.o f352950j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f352951k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f352952l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f352953m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f352954n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f352955o;

    public n(java.lang.String name, boolean z17, gf5.g identifierConfig, java.util.List rules, java.util.Set extraIdentifierStartChars, java.util.Set extraIdentifierPartChars, java.util.Set lineBreakChars, gf5.t numberRule, char c17, gf5.o detectionProfile) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(identifierConfig, "identifierConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rules, "rules");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraIdentifierStartChars, "extraIdentifierStartChars");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraIdentifierPartChars, "extraIdentifierPartChars");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lineBreakChars, "lineBreakChars");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(numberRule, "numberRule");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detectionProfile, "detectionProfile");
        this.f352941a = name;
        this.f352942b = z17;
        this.f352943c = identifierConfig;
        this.f352944d = rules;
        this.f352945e = extraIdentifierStartChars;
        this.f352946f = extraIdentifierPartChars;
        this.f352947g = lineBreakChars;
        this.f352948h = numberRule;
        this.f352949i = c17;
        this.f352950j = detectionProfile;
        jz5.i iVar = jz5.i.f384364f;
        this.f352951k = jz5.h.a(iVar, new gf5.k(this));
        this.f352952l = jz5.h.a(iVar, new gf5.j(this));
        this.f352953m = jz5.h.a(iVar, new gf5.i(this));
        this.f352954n = jz5.h.a(iVar, new gf5.m(this));
        this.f352955o = jz5.h.a(iVar, new gf5.l(this));
    }

    public final java.lang.String a() {
        return this.f352941a;
    }

    public final gf5.t b() {
        return this.f352948h;
    }

    public final java.util.List c() {
        return this.f352944d;
    }

    public final boolean d(char c17) {
        return e(c17) || java.lang.Character.isDigit(c17) || ((java.util.Set) this.f352952l.mo141623x754a37bb()).contains(java.lang.Character.valueOf(c17));
    }

    public final boolean e(char c17) {
        return c17 == '_' || java.lang.Character.isLetter(c17) || ((java.util.Set) this.f352951k.mo141623x754a37bb()).contains(java.lang.Character.valueOf(c17));
    }

    /* renamed from: equals */
    public boolean m131475xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.n)) {
            return false;
        }
        gf5.n nVar = (gf5.n) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352941a, nVar.f352941a) && this.f352942b == nVar.f352942b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352943c, nVar.f352943c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352944d, nVar.f352944d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352945e, nVar.f352945e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352946f, nVar.f352946f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352947g, nVar.f352947g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352948h, nVar.f352948h) && this.f352949i == nVar.f352949i && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352950j, nVar.f352950j);
    }

    public final java.lang.String f(java.lang.String word) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(word, "word");
        if (this.f352942b) {
            return word;
        }
        java.lang.String lowerCase = word.toLowerCase(java.util.Locale.ROOT);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* renamed from: hashCode */
    public int m131476x8cdac1b() {
        return (((((((((((((((((this.f352941a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f352942b)) * 31) + this.f352943c.m131470x8cdac1b()) * 31) + this.f352944d.hashCode()) * 31) + this.f352945e.hashCode()) * 31) + this.f352946f.hashCode()) * 31) + this.f352947g.hashCode()) * 31) + this.f352948h.m131494x8cdac1b()) * 31) + java.lang.Character.hashCode(this.f352949i)) * 31) + this.f352950j.m131479x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m131477x9616526c() {
        return "LanguageDefinition(name=" + this.f352941a + ", caseSensitive=" + this.f352942b + ", identifierConfig=" + this.f352943c + ", rules=" + this.f352944d + ", extraIdentifierStartChars=" + this.f352945e + ", extraIdentifierPartChars=" + this.f352946f + ", lineBreakChars=" + this.f352947g + ", numberRule=" + this.f352948h + ", escapeChar=" + this.f352949i + ", detectionProfile=" + this.f352950j + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(java.lang.String r29, boolean r30, gf5.g r31, java.util.List r32, java.util.Set r33, java.util.Set r34, java.util.Set r35, gf5.t r36, char r37, gf5.o r38, int r39, p3321xbce91901.jvm.p3324x21ffc6bd.i r40) {
        /*
            r28 = this;
            r0 = r39
            r1 = r0 & 2
            r2 = 1
            if (r1 == 0) goto L9
            r1 = r2
            goto Lb
        L9:
            r1 = r30
        Lb:
            r3 = r0 & 4
            r4 = 3
            r5 = 0
            if (r3 == 0) goto L17
            gf5.g r3 = new gf5.g
            r3.<init>(r5, r5, r4, r5)
            goto L19
        L17:
            r3 = r31
        L19:
            r6 = r0 & 8
            if (r6 == 0) goto L20
            kz5.p0 r6 = kz5.p0.f395529d
            goto L22
        L20:
            r6 = r32
        L22:
            r7 = r0 & 16
            kz5.r0 r8 = kz5.r0.f395535d
            if (r7 == 0) goto L2a
            r7 = r8
            goto L2c
        L2a:
            r7 = r33
        L2c:
            r9 = r0 & 32
            if (r9 == 0) goto L31
            goto L33
        L31:
            r8 = r34
        L33:
            r9 = r0 & 64
            if (r9 == 0) goto L50
            r9 = 2
            java.lang.Character[] r9 = new java.lang.Character[r9]
            r10 = 10
            java.lang.Character r10 = java.lang.Character.valueOf(r10)
            r11 = 0
            r9[r11] = r10
            r10 = 13
            java.lang.Character r10 = java.lang.Character.valueOf(r10)
            r9[r2] = r10
            java.util.Set r2 = kz5.z.D0(r9)
            goto L52
        L50:
            r2 = r35
        L52:
            r9 = r0 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L5c
            gf5.t r9 = new gf5.t
            r9.<init>(r5, r5, r4, r5)
            goto L5e
        L5c:
            r9 = r36
        L5e:
            r4 = r0 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L65
            r4 = 92
            goto L67
        L65:
            r4 = r37
        L67:
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L87
            gf5.o r0 = new gf5.o
            r10 = r0
            r11 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 511(0x1ff, float:7.16E-43)
            r27 = 0
            r10.<init>(r11, r13, r15, r16, r18, r20, r22, r24, r25, r26, r27)
            goto L89
        L87:
            r0 = r38
        L89:
            r30 = r28
            r31 = r29
            r32 = r1
            r33 = r3
            r34 = r6
            r35 = r7
            r36 = r8
            r37 = r2
            r38 = r9
            r39 = r4
            r40 = r0
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gf5.n.<init>(java.lang.String, boolean, gf5.g, java.util.List, java.util.Set, java.util.Set, java.util.Set, gf5.t, char, gf5.o, int, kotlin.jvm.internal.i):void");
    }
}
