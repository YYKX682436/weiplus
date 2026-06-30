package rk4;

/* loaded from: classes11.dex */
public abstract class j5 {
    public static final java.lang.String a(bw5.lp0 lp0Var) {
        bw5.nc0 l17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lp0Var, "<this>");
        if (il4.l.l(lp0Var.d().f115722e)) {
            bw5.z90 j17 = lp0Var.d().j();
            if (j17 != null) {
                return j17.f117436x1[4] ? j17.f117417g : "";
            }
            return null;
        }
        if (!h(lp0Var) || (l17 = lp0Var.d().l()) == null) {
            return null;
        }
        return l17.m12571x74292566();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004d, code lost:
    
        if (r0 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0067, code lost:
    
        if (r0 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r0 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String b(bw5.v70 r7) {
        /*
            java.lang.String r0 = "<this>"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            int r0 = r7.f115722e
            boolean r0 = il4.l.k(r0)
            r1 = 0
            r2 = 1
            java.lang.String r3 = ""
            r4 = 0
            if (r0 == 0) goto L23
            bw5.z90 r0 = r7.j()
            if (r0 == 0) goto L1d
            java.lang.String r0 = r0.l()
            goto L1e
        L1d:
            r0 = r4
        L1e:
            if (r0 != 0) goto L21
            goto L69
        L21:
            r3 = r0
            goto L69
        L23:
            int r0 = r7.f115722e
            r5 = 7
            if (r0 == r5) goto L2f
            r5 = 8
            if (r0 != r5) goto L2d
            goto L2f
        L2d:
            r5 = r1
            goto L30
        L2f:
            r5 = r2
        L30:
            r6 = 4
            if (r5 != 0) goto L55
            if (r0 != r6) goto L37
            r5 = r2
            goto L38
        L37:
            r5 = r1
        L38:
            if (r5 == 0) goto L3b
            goto L55
        L3b:
            boolean r0 = il4.l.j(r0)
            if (r0 == 0) goto L50
            bw5.j40 r0 = r7.b()
            if (r0 == 0) goto L4c
            java.lang.String r0 = r0.e()
            goto L4d
        L4c:
            r0 = r4
        L4d:
            if (r0 != 0) goto L21
            goto L69
        L50:
            java.lang.String r3 = r7.c()
            goto L69
        L55:
            bw5.e70 r0 = r7.g()
            if (r0 == 0) goto L66
            boolean[] r5 = r0.E
            boolean r5 = r5[r6]
            if (r5 == 0) goto L64
            java.lang.String r0 = r0.f108294g
            goto L67
        L64:
            r0 = r3
            goto L67
        L66:
            r0 = r4
        L67:
            if (r0 != 0) goto L21
        L69:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r3)
            int r0 = r3.length()
            if (r0 <= 0) goto L73
            r1 = r2
        L73:
            if (r1 == 0) goto L76
            r4 = r3
        L76:
            if (r4 != 0) goto L81
            java.lang.String r4 = r7.c()
            java.lang.String r7 = "getAuthor(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r7)
        L81:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.j5.b(bw5.v70):java.lang.String");
    }

    public static final java.lang.String c(bw5.lp0 lp0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lp0Var, "<this>");
        if (lp0Var.d() == null) {
            return "";
        }
        bw5.v70 d17 = lp0Var.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getListenItem(...)");
        return b(d17);
    }

    public static final java.lang.String d(bw5.lp0 lp0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lp0Var, "<this>");
        bw5.v70 d17 = lp0Var.d();
        java.lang.String f17 = d17 != null ? d17.f() : null;
        return f17 == null ? "" : f17;
    }

    public static final int e(bw5.lp0 lp0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lp0Var, "<this>");
        if (!il4.l.l(lp0Var.d().f115722e)) {
            if (il4.l.j(lp0Var.d().f115722e)) {
                bw5.j40 b17 = lp0Var.d().b();
                if (b17 != null) {
                    return b17.f110351s;
                }
                return 0;
            }
            if (!(lp0Var.d().f115722e == 4)) {
                return lp0Var.d().f115736v;
            }
            bw5.e70 g17 = lp0Var.d().g();
            if (g17 != null) {
                return g17.f108296i;
            }
            return 0;
        }
        bw5.z90 j17 = lp0Var.d().j();
        int i17 = j17 != null ? j17.f117431u : 0;
        if (i17 == 0) {
            int i18 = lp0Var.d().f115722e;
            if (i18 != 7 && i18 != 8) {
                r1 = false;
            }
            if (r1) {
                bw5.e70 g18 = lp0Var.d().g();
                if (g18 != null) {
                    return g18.f108296i;
                }
                return 0;
            }
        }
        return i17;
    }

    public static final java.lang.String f(java.lang.String str) {
        android.net.Uri parse;
        if (str == null || str.length() == 0) {
            return "";
        }
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (parse = android.net.Uri.parse(str)) == null) {
                return "";
            }
            java.lang.String queryParameter = parse.getQueryParameter("__biz");
            if (queryParameter == null) {
                queryParameter = "";
            }
            java.lang.String queryParameter2 = parse.getQueryParameter("mid");
            if (queryParameter2 == null) {
                queryParameter2 = "";
            }
            java.lang.String queryParameter3 = parse.getQueryParameter("idx");
            if (queryParameter3 == null) {
                queryParameter3 = "";
            }
            return queryParameter + '_' + queryParameter2 + '_' + queryParameter3;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TingItemEx", "Exception err: " + e17.getMessage());
            return "";
        }
    }

    public static final boolean g(bw5.lp0 lp0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lp0Var, "<this>");
        return il4.l.l(lp0Var.d().f115722e);
    }

    public static final boolean h(bw5.lp0 lp0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lp0Var, "<this>");
        int i17 = lp0Var.d().f115722e;
        il4.l lVar = il4.l.f373675a;
        if (i17 == 101) {
            return true;
        }
        return i17 == 103;
    }

    public static final int i(bw5.lp0 lp0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lp0Var, "<this>");
        if (lp0Var.c() != null && lp0Var.c().f108986e > 0) {
            return lp0Var.c().f108986e;
        }
        return 0;
    }

    public static final java.lang.String j(bw5.lp0 lp0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lp0Var, "<this>");
        bw5.v70 d17 = lp0Var.d();
        java.lang.String m13171x7531c8a2 = d17 != null ? d17.m13171x7531c8a2() : null;
        return m13171x7531c8a2 == null ? "" : m13171x7531c8a2;
    }

    public static final java.lang.String k(bw5.lp0 lp0Var) {
        bw5.nc0 l17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lp0Var, "<this>");
        if (il4.l.l(lp0Var.d().f115722e)) {
            bw5.z90 j17 = lp0Var.d().j();
            if (j17 != null) {
                return j17.i();
            }
            return null;
        }
        if (il4.l.j(lp0Var.d().f115722e)) {
            bw5.j40 b17 = lp0Var.d().b();
            if (b17 != null) {
                return b17.d();
            }
            return null;
        }
        if (!h(lp0Var) || (l17 = lp0Var.d().l()) == null) {
            return null;
        }
        return l17.f112154o[5] ? l17.f112150h : "";
    }

    public static final java.lang.String l(bw5.lp0 lp0Var) {
        bw5.nc0 l17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lp0Var, "<this>");
        if (il4.l.l(lp0Var.d().f115722e)) {
            bw5.z90 j17 = lp0Var.d().j();
            if (j17 != null) {
                return j17.k();
            }
            return null;
        }
        if (il4.l.j(lp0Var.d().f115722e)) {
            bw5.j40 b17 = lp0Var.d().b();
            if (b17 != null) {
                return b17.m12208xb5887639();
            }
            return null;
        }
        if (!h(lp0Var) || (l17 = lp0Var.d().l()) == null) {
            return null;
        }
        return l17.f112154o[6] ? l17.f112151i : "";
    }
}
