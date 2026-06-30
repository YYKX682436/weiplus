package il4;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final il4.d f373635a = new il4.d();

    /* renamed from: b, reason: collision with root package name */
    public static final jt0.j f373636b = new jt0.j(50);

    public static final r45.lm6 a(android.content.Context context, il4.a aVar, ot0.q content, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        boolean z17;
        java.lang.String str;
        bw5.o50 o50Var;
        bw5.g60 e17;
        java.util.LinkedList linkedList;
        bw5.o50 o50Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        if ((aVar == null || (o50Var2 = aVar.f373628e) == null || o50Var2.f112497n != 42) ? false : true) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 q17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(aVar.f373628e.b().m12488x6c03c64c());
            if (q17 != null) {
                str = q17.g2();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getDisplayRemark(...)");
            } else {
                str = "";
            }
            z17 = aVar.f373628e.f112511x1;
        } else {
            z17 = false;
            str = "";
        }
        r45.lm6 lm6Var = new r45.lm6();
        lm6Var.f461170d = content.f430187f;
        lm6Var.f461171e = m(context, aVar != null ? aVar.f373628e : null);
        int i17 = i(aVar != null ? aVar.f373628e : null);
        lm6Var.f461173g = i17;
        il4.d dVar = f373635a;
        lm6Var.f461172f = dVar.j(i17, aVar != null ? aVar.f373628e : null);
        if (aVar != null && (o50Var = aVar.f373628e) != null && (e17 = o50Var.e()) != null && (linkedList = e17.f109234e) != null) {
            lm6Var.f461177n.addAll(linkedList);
        }
        if (f9Var != null) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            java.lang.String D2 = m11.b1.Di().D2(f9Var, f9Var.z0(), true);
            if (D2 == null) {
                D2 = "";
            }
            lm6Var.f461176m = D2;
        }
        lm6Var.f461174h = dVar.h(lm6Var.f461173g, aVar != null ? aVar.f373628e : null);
        java.lang.String f17 = dVar.f(aVar != null ? aVar.f373628e : null);
        lm6Var.f461175i = f17 != null ? f17 : "";
        if (str.length() > 0) {
            lm6Var.f461178o = str;
        }
        lm6Var.f461179p = z17;
        return lm6Var;
    }

    public static final r45.lm6 b(android.content.Context context, java.lang.String title, bw5.o50 o50Var, java.lang.String imgPath) {
        boolean z17;
        java.lang.String str;
        bw5.g60 e17;
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgPath, "imgPath");
        if (o50Var != null && o50Var.f112497n == 42) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 q17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(o50Var.b().m12488x6c03c64c());
            if (q17 != null) {
                str = q17.g2();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getDisplayRemark(...)");
            } else {
                str = "";
            }
            z17 = o50Var.f112511x1;
        } else {
            z17 = false;
            str = "";
        }
        r45.lm6 lm6Var = new r45.lm6();
        lm6Var.f461170d = title;
        lm6Var.f461171e = m(context, o50Var);
        int i17 = i(o50Var);
        lm6Var.f461173g = i17;
        il4.d dVar = f373635a;
        lm6Var.f461172f = dVar.j(i17, o50Var);
        if (o50Var != null && (e17 = o50Var.e()) != null && (linkedList = e17.f109234e) != null) {
            lm6Var.f461177n.addAll(linkedList);
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        java.lang.String D2 = m11.b1.Di().D2(null, imgPath, true);
        if (D2 == null) {
            D2 = "";
        }
        lm6Var.f461176m = D2;
        lm6Var.f461174h = dVar.h(lm6Var.f461173g, o50Var);
        java.lang.String f17 = dVar.f(o50Var);
        lm6Var.f461175i = f17 != null ? f17 : "";
        if (str.length() > 0) {
            lm6Var.f461178o = str;
        }
        lm6Var.f461179p = z17;
        return lm6Var;
    }

    public static final r45.lm6 c(android.content.Context context, bw5.o50 o50Var, java.lang.String str) {
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (o50Var == null) {
            return new r45.lm6();
        }
        r45.lm6 lm6Var = new r45.lm6();
        lm6Var.f461170d = o50Var.m12637xfb82e301();
        lm6Var.f461171e = m(context, o50Var);
        int i17 = i(o50Var);
        lm6Var.f461173g = i17;
        il4.d dVar = f373635a;
        lm6Var.f461174h = dVar.h(i17, o50Var);
        java.lang.String f17 = dVar.f(o50Var);
        if (f17 == null) {
            f17 = "";
        }
        lm6Var.f461175i = f17;
        if (str == null || str.length() == 0) {
            str = dVar.j(lm6Var.f461173g, o50Var);
        }
        lm6Var.f461172f = str;
        bw5.g60 e17 = o50Var.e();
        if (e17 != null && (linkedList = e17.f109234e) != null) {
            lm6Var.f461177n.addAll(linkedList);
        }
        return lm6Var;
    }

    public static final r45.lm6 d(android.content.Context context, java.lang.String chatRoomTitle, bw5.o50 o50Var, bw5.v70 v70Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatRoomTitle, "chatRoomTitle");
        r45.lm6 lm6Var = new r45.lm6();
        lm6Var.f461170d = chatRoomTitle;
        lm6Var.f461171e = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n3s);
        if (o50Var != null) {
            bw5.mc0 b17 = o50Var.b();
            lm6Var.f461172f = b17 != null ? b17.b() : null;
            bw5.mc0 b18 = o50Var.b();
            lm6Var.f461174h = b18 != null ? b18.m12487x8010e5e4() : null;
        }
        if (v70Var != null) {
            lm6Var.f461177n.add(v70Var.f());
        }
        return lm6Var;
    }

    public static final java.lang.String e(bw5.o50 o50Var) {
        if (o50Var == null) {
            return "";
        }
        try {
            bw5.o50 o50Var2 = new bw5.o50();
            boolean[] zArr = o50Var2.L1;
            o50Var2.mo11468x92b714fd(o50Var.mo14344x5f01b1f6());
            o50Var2.f112499p = false;
            zArr[10] = true;
            o50Var2.f112506u = false;
            zArr[15] = true;
            o50Var2.f112512y = new bw5.xa0();
            zArr[19] = true;
            java.lang.String encodeToString = android.util.Base64.encodeToString(o50Var2.mo14344x5f01b1f6(), 2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encodeToString, "encodeToString(...)");
            return encodeToString;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TingCategoryUtils", e17, "encodeTingCategoryItem exception", new java.lang.Object[0]);
            return "";
        }
    }

    public static final java.lang.String g(bw5.o50 o50Var) {
        if (o50Var == null) {
            return null;
        }
        bw5.mc0 b17 = o50Var.b();
        java.lang.String m12487x8010e5e4 = b17 != null ? b17.m12487x8010e5e4() : null;
        if (m12487x8010e5e4 == null) {
            m12487x8010e5e4 = "";
        }
        if (!(m12487x8010e5e4.length() == 0)) {
            return m12487x8010e5e4;
        }
        java.lang.String str = o50Var.L1[6] ? o50Var.f112494i : "";
        return str != null ? str : "";
    }

    public static final int i(bw5.o50 o50Var) {
        if (o50Var == null) {
            return 0;
        }
        int i17 = o50Var.f112497n;
        if (i17 == 4) {
            return 1;
        }
        if (i17 == 10) {
            bw5.g60 e17 = o50Var.e();
            if (e17 != null && e17.f109233d == 1) {
                return 2;
            }
        }
        if (o50Var.f112497n == 21 && o50Var.e().f109234e.size() >= 3) {
            return 3;
        }
        int i18 = o50Var.f112497n;
        if (i18 == 26) {
            return 4;
        }
        return i18 == 42 ? 5 : 0;
    }

    public static final java.lang.String k(bw5.o50 o50Var) {
        if (o50Var == null) {
            return null;
        }
        return f373635a.j(i(o50Var), o50Var);
    }

    public static final java.lang.String l(bw5.o50 o50Var) {
        if (o50Var == null) {
            return "";
        }
        java.lang.String str = o50Var.c().toString();
        java.lang.String c17 = o50Var.f().c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getRecommendId(...)");
        if (c17.length() > 0) {
            str = str + "-r-" + o50Var.f().c();
        }
        java.lang.String b17 = o50Var.f().b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getFeedidlistUniqueId(...)");
        if (b17.length() > 0) {
            str = str + "-f-" + o50Var.f().b();
        }
        if (o50Var.S <= 0) {
            return str;
        }
        return str + "-lt-" + o50Var.S;
    }

    public static final java.lang.String m(android.content.Context context, bw5.o50 o50Var) {
        int i17 = o50Var != null ? o50Var.f112497n : 0;
        if (!f373635a.u(i17)) {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jz7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            return string;
        }
        if (q(i17)) {
            java.lang.String g17 = g(o50Var);
            java.lang.String str = g17 != null ? g17 : "";
            if (!(str.length() > 0)) {
                java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jyf);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                return string2;
            }
            java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jyg);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            java.lang.String format = java.lang.String.format(string3, java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            return format;
        }
        if (i17 == 4) {
            java.lang.String string4 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574919jz4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
            return string4;
        }
        if (i17 == 6) {
            java.lang.String string5 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jyi);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
            return string5;
        }
        if (i17 == 21) {
            java.lang.String string6 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jz8);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string6, "getString(...)");
            return string6;
        }
        if (r(i17)) {
            java.lang.String string7 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jyy);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string7, "getString(...)");
            return string7;
        }
        if (i17 != 26) {
            return "";
        }
        java.lang.String string8 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m2_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string8, "getString(...)");
        return string8;
    }

    public static final java.lang.String n(android.content.Context context, r45.km6 km6Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return km6Var == null ? "" : m(context, v(km6Var.f460372e));
    }

    public static final java.lang.String o(android.content.Context context, bw5.o50 o50Var, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int i17 = o50Var != null ? o50Var.f112497n : 0;
        java.lang.String string = !f373635a.u(i17) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jz7) : q(i17) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jyf) : i17 == 4 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574919jz4) : i17 == 6 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jyi) : i17 == 21 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jz8) : r(i17) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jyy) : t(i17) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pis) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jz7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        if (!z17) {
            return string;
        }
        return "[" + string + ']';
    }

    public static final java.lang.String p(android.content.Context context, r45.km6 km6Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return o(context, v(km6Var != null ? km6Var.f460372e : null), true);
    }

    public static final boolean q(int i17) {
        return i17 == 3;
    }

    public static final boolean r(int i17) {
        return i17 == 9 || i17 == 7 || i17 == 19 || i17 == 28;
    }

    public static final boolean s(int i17) {
        return i17 == 22 || i17 == 23 || i17 == 12;
    }

    public static final boolean t(int i17) {
        return i17 == 44 || i17 == 45 || i17 == 46;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final bw5.o50 v(java.lang.String r5) {
        /*
            r0 = 0
            r1 = 1
            if (r5 == 0) goto Ld
            int r2 = r5.length()
            if (r2 != 0) goto Lb
            goto Ld
        Lb:
            r2 = r0
            goto Le
        Ld:
            r2 = r1
        Le:
            r3 = 0
            if (r2 == 0) goto L12
            return r3
        L12:
            int r2 = r5.hashCode()
            jt0.j r4 = il4.d.f373636b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r4.get(r2)
            bw5.o50 r2 = (bw5.o50) r2
            if (r2 == 0) goto L2a
            boolean[] r5 = r2.L1
            r0 = 6
            boolean r5 = r5[r0]
            return r2
        L2a:
            int r2 = r5.length()
            if (r2 != 0) goto L31
            goto L32
        L31:
            r1 = r0
        L32:
            if (r1 == 0) goto L35
            goto L51
        L35:
            r1 = 2
            byte[] r5 = android.util.Base64.decode(r5, r1)     // Catch: java.lang.Exception -> L46
            if (r5 == 0) goto L51
            bw5.o50 r1 = new bw5.o50     // Catch: java.lang.Exception -> L46
            r1.<init>()     // Catch: java.lang.Exception -> L46
            bw5.o50 r5 = r1.mo11468x92b714fd(r5)     // Catch: java.lang.Exception -> L46
            goto L52
        L46:
            r5 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "MicroMsg.TingCategoryUtils"
            java.lang.String r2 = "parseTingCategoryItem exception"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r5, r2, r0)
        L51:
            r5 = r3
        L52:
            if (r5 == 0) goto L60
            int r0 = r5.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.j(r0, r5)
            r3 = r5
        L60:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: il4.d.v(java.lang.String):bw5.o50");
    }

    public static final bw5.v70 w(java.lang.String str) {
        boolean z17 = true;
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return null;
        }
        try {
            byte[] decode = android.util.Base64.decode(str, 2);
            if (decode != null) {
                return new bw5.v70().mo11468x92b714fd(decode);
            }
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TingCategoryUtils", e17, "parseTingCategoryItem exception", new java.lang.Object[0]);
            return null;
        }
    }

    public final java.lang.String f(bw5.o50 o50Var) {
        if (o50Var == null) {
            return null;
        }
        int i17 = o50Var.f112497n;
        if ((i17 == 8 && o50Var.K) || i17 == 42) {
            return o50Var.b().b();
        }
        return null;
    }

    public final java.lang.String h(int i17, bw5.o50 o50Var) {
        bw5.mc0 b17;
        if (i17 == 2) {
            if (o50Var != null && (b17 = o50Var.b()) != null) {
                r2 = b17.m12487x8010e5e4();
            }
            return r2 == null ? "" : r2;
        }
        if (i17 == 3) {
            r2 = o50Var != null ? o50Var.m12637xfb82e301() : null;
            return r2 == null ? "" : r2;
        }
        r2 = o50Var != null ? o50Var.L1[6] ? o50Var.f112494i : "" : null;
        return r2 == null ? "" : r2;
    }

    public final java.lang.String j(int i17, bw5.o50 o50Var) {
        java.util.LinkedList linkedList;
        bw5.mc0 b17;
        java.lang.String str = "";
        if (i17 == 2) {
            java.lang.String b18 = (o50Var == null || (b17 = o50Var.b()) == null) ? null : b17.b();
            return b18 == null ? "" : b18;
        }
        if (o50Var == null) {
            return "";
        }
        java.lang.String d17 = o50Var.d();
        if (!(d17 == null || d17.length() == 0) || ((linkedList = o50Var.e().f109234e) != null && (d17 = (java.lang.String) kz5.n0.Z(linkedList)) != null)) {
            str = d17;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        return str;
    }

    public final boolean u(int i17) {
        return q(i17) || i17 == 4 || i17 == 6 || i17 == 21 || i17 == 9 || i17 == 7 || i17 == 19 || i17 == 26 || i17 == 28 || i17 == 45 || i17 == 46;
    }
}
