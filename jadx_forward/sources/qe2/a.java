package qe2;

/* loaded from: classes2.dex */
public abstract class a {
    public static final java.util.List a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c14994x9b99c079, "<this>");
        r45.d50 d17 = d(c14994x9b99c079);
        if (d17 == null) {
            return kz5.p0.f395529d;
        }
        java.util.LinkedList m75941xfb821914 = d17.m75941xfb821914(1);
        lz5.e eVar = new lz5.e((m75941xfb821914 != null ? m75941xfb821914.size() : 0) + 1);
        java.lang.String m59273x80025a04 = c14994x9b99c079.m59273x80025a04();
        if (m59273x80025a04 == null) {
            m59273x80025a04 = "";
        }
        eVar.add(m59273x80025a04);
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa> m75941xfb8219142 = d17.m75941xfb821914(1);
        if (m75941xfb8219142 != null) {
            for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa : m75941xfb8219142) {
                java.lang.String m76184x8010e5e4 = c19782x23db1cfa != null ? c19782x23db1cfa.m76184x8010e5e4() : null;
                if (m76184x8010e5e4 == null) {
                    m76184x8010e5e4 = "";
                }
                eVar.add(m76184x8010e5e4);
            }
        }
        return kz5.b0.a(eVar);
    }

    public static final java.lang.String b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c14994x9b99c079, "<this>");
        r45.d50 d17 = d(c14994x9b99c079);
        java.lang.String m75945x2fec8307 = d17 != null ? d17.m75945x2fec8307(0) : null;
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    public static final int c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c14994x9b99c079, "<this>");
        r45.d50 d17 = d(c14994x9b99c079);
        if (d17 == null) {
            return 0;
        }
        java.util.LinkedList m75941xfb821914 = d17.m75941xfb821914(1);
        return (m75941xfb821914 != null ? m75941xfb821914.size() : 0) + 1;
    }

    public static final r45.d50 d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        r45.dm2 m76806xdef68064;
        r45.d50 d50Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = c14994x9b99c079.getFeedObject();
        if (feedObject == null || (m76806xdef68064 = feedObject.m76806xdef68064()) == null || (d50Var = (r45.d50) m76806xdef68064.m75936x14adae67(63)) == null) {
            return null;
        }
        boolean z17 = true;
        java.util.LinkedList m75941xfb821914 = d50Var.m75941xfb821914(1);
        if (m75941xfb821914 != null && !m75941xfb821914.isEmpty()) {
            z17 = false;
        }
        if (z17) {
            return null;
        }
        return d50Var;
    }

    public static final boolean e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c14994x9b99c079, "<this>");
        return c14994x9b99c079.m59311x25315bf4() && d(c14994x9b99c079) != null;
    }

    public static final boolean f(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, mm2.n0 n0Var) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f3Var;
        r45.a84 a84Var;
        if (c19792x256d2725 == null || n0Var == null || (f3Var = n0Var.f410804p) == null || (a84Var = (r45.a84) f3Var.mo144003x754a37bb()) == null) {
            return false;
        }
        java.util.LinkedList m75941xfb821914 = a84Var.m75941xfb821914(1);
        if (m75941xfb821914 == null || m75941xfb821914.isEmpty()) {
            return false;
        }
        r45.dm2 m76806xdef68064 = c19792x256d2725.m76806xdef68064();
        if (m76806xdef68064 == null) {
            m76806xdef68064 = new r45.dm2();
            c19792x256d2725.m76899x71cce6d8(m76806xdef68064);
        }
        r45.d50 d50Var = new r45.d50();
        d50Var.set(0, a84Var.m75945x2fec8307(0));
        d50Var.set(1, new java.util.LinkedList(a84Var.m75941xfb821914(1)));
        m76806xdef68064.set(63, d50Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("syncCoAuthorInfoFromSlice: filled ");
        java.util.LinkedList m75941xfb8219142 = a84Var.m75941xfb821914(1);
        sb6.append(m75941xfb8219142 != null ? java.lang.Integer.valueOf(m75941xfb8219142.size()) : null);
        sb6.append(" co-authors, avatarUrl=");
        java.lang.String m75945x2fec8307 = a84Var.m75945x2fec8307(0);
        sb6.append(m75945x2fec8307 != null ? r26.p0.E0(m75945x2fec8307, 80) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderItemCoAuthorExt", sb6.toString());
        return true;
    }

    public static final r45.a84 g(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        r45.d50 d50Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c19792x256d2725, "<this>");
        r45.dm2 m76806xdef68064 = c19792x256d2725.m76806xdef68064();
        if (m76806xdef68064 == null || (d50Var = (r45.d50) m76806xdef68064.m75936x14adae67(63)) == null) {
            return null;
        }
        java.util.LinkedList m75941xfb821914 = d50Var.m75941xfb821914(1);
        if (m75941xfb821914 == null || m75941xfb821914.isEmpty()) {
            return null;
        }
        r45.a84 a84Var = new r45.a84();
        a84Var.set(0, d50Var.m75945x2fec8307(0));
        a84Var.set(1, new java.util.LinkedList(d50Var.m75941xfb821914(1)));
        return a84Var;
    }

    public static final boolean h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c14994x9b99c079, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!e(c14994x9b99c079)) {
            return false;
        }
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObject = c14994x9b99c079.getFeedObject();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        if (finderObject.m76802x2dd01666() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "showCoAuthorSheet: objectDesc is null, skip");
            return false;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0792 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079();
            c14994x9b99c0792.m59375x22d34c7f(finderObject);
            return qe2.l.c(context, c14994x9b99c0792);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FinderLiveFeatureService", th6, "showCoAuthorSheet error", new java.lang.Object[0]);
            return false;
        }
    }
}
