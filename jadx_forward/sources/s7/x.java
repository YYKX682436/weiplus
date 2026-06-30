package s7;

/* loaded from: classes16.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final s7.h f485420a;

    /* renamed from: b, reason: collision with root package name */
    public final s7.w f485421b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f485422c = false;

    public x(s7.h hVar, s7.w wVar) {
        this.f485420a = null;
        this.f485421b = null;
        this.f485420a = hVar;
        this.f485421b = wVar;
    }

    public static int a(java.util.List list, int i17, s7.y1 y1Var) {
        int i18 = 0;
        if (i17 < 0) {
            return 0;
        }
        java.lang.Object obj = list.get(i17);
        s7.w1 w1Var = y1Var.f485119b;
        if (obj != w1Var) {
            return -1;
        }
        java.util.Iterator it = w1Var.c().iterator();
        while (it.hasNext()) {
            if (((s7.a2) it.next()) == y1Var) {
                return i18;
            }
            i18++;
        }
        return -1;
    }

    public static java.util.List c(s7.f fVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!fVar.f()) {
            java.lang.String str = null;
            if (!fVar.f()) {
                int i17 = fVar.f485304b;
                java.lang.String str2 = fVar.f485303a;
                char charAt = str2.charAt(i17);
                if ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) {
                    fVar.f485304b = i17;
                } else {
                    int a17 = fVar.a();
                    while (true) {
                        if ((a17 < 65 || a17 > 90) && (a17 < 97 || a17 > 122)) {
                            break;
                        }
                        a17 = fVar.a();
                    }
                    str = str2.substring(i17, fVar.f485304b);
                }
            }
            if (str == null) {
                break;
            }
            try {
                arrayList.add(s7.h.m163965xdce0328(str));
            } catch (java.lang.IllegalArgumentException unused) {
            }
            if (!fVar.p()) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean f(s7.s sVar, s7.u uVar, int i17, java.util.List list, int i18, s7.y1 y1Var) {
        s7.v vVar = (s7.v) ((java.util.ArrayList) uVar.f485373a).get(i17);
        if (!i(sVar, vVar, list, i18, y1Var)) {
            return false;
        }
        s7.g gVar = s7.g.DESCENDANT;
        s7.g gVar2 = vVar.f485384a;
        if (gVar2 == gVar) {
            if (i17 == 0) {
                return true;
            }
            while (i18 >= 0) {
                if (h(sVar, uVar, i17 - 1, list, i18)) {
                    return true;
                }
                i18--;
            }
            return false;
        }
        if (gVar2 == s7.g.CHILD) {
            return h(sVar, uVar, i17 - 1, list, i18);
        }
        int a17 = a(list, i18, y1Var);
        if (a17 <= 0) {
            return false;
        }
        return f(sVar, uVar, i17 - 1, list, i18, (s7.y1) y1Var.f485119b.c().get(a17 - 1));
    }

    public static boolean g(s7.s sVar, s7.u uVar, s7.y1 y1Var) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object obj = y1Var.f485119b;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((s7.a2) obj).f485119b;
        }
        int size = arrayList.size() - 1;
        java.util.List list = uVar.f485373a;
        if ((list == null ? 0 : ((java.util.ArrayList) list).size()) == 1) {
            return i(sVar, (s7.v) ((java.util.ArrayList) uVar.f485373a).get(0), arrayList, size, y1Var);
        }
        return f(sVar, uVar, (uVar.f485373a != null ? ((java.util.ArrayList) r0).size() : 0) - 1, arrayList, size, y1Var);
    }

    public static boolean h(s7.s sVar, s7.u uVar, int i17, java.util.List list, int i18) {
        s7.v vVar = (s7.v) ((java.util.ArrayList) uVar.f485373a).get(i17);
        s7.y1 y1Var = (s7.y1) list.get(i18);
        if (!i(sVar, vVar, list, i18, y1Var)) {
            return false;
        }
        s7.g gVar = s7.g.DESCENDANT;
        s7.g gVar2 = vVar.f485384a;
        if (gVar2 == gVar) {
            if (i17 == 0) {
                return true;
            }
            while (i18 > 0) {
                i18--;
                if (h(sVar, uVar, i17 - 1, list, i18)) {
                    return true;
                }
            }
            return false;
        }
        if (gVar2 == s7.g.CHILD) {
            return h(sVar, uVar, i17 - 1, list, i18 - 1);
        }
        int a17 = a(list, i18, y1Var);
        if (a17 <= 0) {
            return false;
        }
        return f(sVar, uVar, i17 - 1, list, i18, (s7.y1) y1Var.f485119b.c().get(a17 - 1));
    }

    public static boolean i(s7.s sVar, s7.v vVar, java.util.List list, int i17, s7.y1 y1Var) {
        java.util.List list2;
        java.lang.String str = vVar.f485385b;
        if (str != null && !str.equals(y1Var.n().toLowerCase(java.util.Locale.US))) {
            return false;
        }
        java.util.List list3 = vVar.f485386c;
        if (list3 != null) {
            java.util.Iterator it = ((java.util.ArrayList) list3).iterator();
            while (it.hasNext()) {
                s7.c cVar = (s7.c) it.next();
                java.lang.String str2 = cVar.f485135a;
                str2.getClass();
                boolean equals = str2.equals(dm.i4.f66865x76d1ec5a);
                java.lang.String str3 = cVar.f485137c;
                if (equals) {
                    if (!str3.equals(y1Var.f485431c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (list2 = y1Var.f485435g) == null || !list2.contains(str3)) {
                    return false;
                }
            }
        }
        java.util.List list4 = vVar.f485387d;
        if (list4 == null) {
            return true;
        }
        java.util.Iterator it6 = ((java.util.ArrayList) list4).iterator();
        while (it6.hasNext()) {
            if (!((s7.i) it6.next()).a(sVar, y1Var)) {
                return false;
            }
        }
        return true;
    }

    public final void b(s7.t tVar, s7.f fVar) {
        int intValue;
        int r17;
        boolean z17;
        java.lang.String t17 = fVar.t();
        fVar.q();
        if (t17 == null) {
            throw new s7.a("Invalid '@' rule");
        }
        int i17 = 0;
        if (!this.f485422c && t17.equals("media")) {
            java.util.List c17 = c(fVar);
            if (!fVar.d('{')) {
                throw new s7.a("Invalid @media rule: missing rule set");
            }
            fVar.q();
            java.util.Iterator it = ((java.util.ArrayList) c17).iterator();
            while (it.hasNext()) {
                s7.h hVar = (s7.h) it.next();
                if (hVar == s7.h.all || hVar == this.f485420a) {
                    z17 = true;
                    break;
                }
            }
            z17 = false;
            if (z17) {
                this.f485422c = true;
                tVar.b(e(fVar));
                this.f485422c = false;
            } else {
                e(fVar);
            }
            if (!fVar.f() && !fVar.d('}')) {
                throw new s7.a("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f485422c || !t17.equals("import")) {
            java.lang.String.format("Ignoring @%s rule", t17);
            while (!fVar.f() && ((intValue = fVar.h().intValue()) != 59 || i17 != 0)) {
                if (intValue == 123) {
                    i17++;
                } else if (intValue == 125 && i17 > 0 && i17 - 1 == 0) {
                    break;
                }
            }
        } else {
            java.lang.String str = null;
            if (!fVar.f()) {
                int i18 = fVar.f485304b;
                if (fVar.e("url(")) {
                    fVar.q();
                    java.lang.String s17 = fVar.s();
                    if (s17 == null) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        while (!fVar.f()) {
                            int i19 = fVar.f485304b;
                            java.lang.String str2 = fVar.f485303a;
                            char charAt = str2.charAt(i19);
                            if (charAt == '\'' || charAt == '\"' || charAt == '(' || charAt == ')' || fVar.g(charAt) || java.lang.Character.isISOControl((int) charAt)) {
                                break;
                            }
                            fVar.f485304b++;
                            if (charAt == '\\') {
                                if (!fVar.f()) {
                                    int i27 = fVar.f485304b;
                                    fVar.f485304b = i27 + 1;
                                    charAt = str2.charAt(i27);
                                    if (charAt != '\n' && charAt != '\r' && charAt != '\f') {
                                        int r18 = fVar.r(charAt);
                                        if (r18 != -1) {
                                            for (int i28 = 1; i28 <= 5 && !fVar.f() && (r17 = fVar.r(str2.charAt(fVar.f485304b))) != -1; i28++) {
                                                fVar.f485304b++;
                                                r18 = (r18 * 16) + r17;
                                            }
                                            sb6.append((char) r18);
                                        }
                                    }
                                }
                            }
                            sb6.append(charAt);
                        }
                        s17 = sb6.length() == 0 ? null : sb6.toString();
                    }
                    if (s17 == null) {
                        fVar.f485304b = i18;
                    } else {
                        fVar.q();
                        if (fVar.f() || fVar.e(")")) {
                            str = s17;
                        } else {
                            fVar.f485304b = i18;
                        }
                    }
                }
            }
            if (str == null) {
                str = fVar.s();
            }
            if (str == null) {
                throw new s7.a("Invalid @import rule: expected string or url()");
            }
            fVar.q();
            c(fVar);
            if (!fVar.f() && !fVar.d(';')) {
                throw new s7.a("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        fVar.q();
    }

    public final boolean d(s7.t tVar, s7.f fVar) {
        java.util.List v17 = fVar.v();
        if (v17 == null) {
            return false;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) v17;
        if (arrayList.isEmpty()) {
            return false;
        }
        if (!fVar.d('{')) {
            throw new s7.a("Malformed rule block: expected '{'");
        }
        fVar.q();
        s7.r1 r1Var = new s7.r1();
        do {
            java.lang.String t17 = fVar.t();
            fVar.q();
            if (!fVar.d(':')) {
                throw new s7.a("Expected ':'");
            }
            fVar.q();
            java.lang.String u17 = fVar.u();
            if (u17 == null) {
                throw new s7.a("Expected property value");
            }
            fVar.q();
            if (fVar.d('!')) {
                fVar.q();
                if (!fVar.e("important")) {
                    throw new s7.a("Malformed rule set: found unexpected '!'");
                }
                fVar.q();
            }
            fVar.d(';');
            s7.r3.H(r1Var, t17, u17);
            fVar.q();
            if (fVar.f()) {
                break;
            }
        } while (!fVar.d('}'));
        fVar.q();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            tVar.a(new s7.r((s7.u) it.next(), r1Var, this.f485421b));
        }
        return true;
    }

    public final s7.t e(s7.f fVar) {
        s7.t tVar = new s7.t();
        while (!fVar.f()) {
            try {
                if (!fVar.e("<!--") && !fVar.e("-->")) {
                    if (!fVar.d('@')) {
                        if (!d(tVar, fVar)) {
                            break;
                        }
                    } else {
                        b(tVar, fVar);
                    }
                }
            } catch (s7.a e17) {
                e17.getMessage();
            }
        }
        return tVar;
    }
}
