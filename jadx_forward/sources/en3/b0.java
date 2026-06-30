package en3;

@j95.b
/* loaded from: classes8.dex */
public final class b0 extends i95.w implements ra0.w {

    /* renamed from: d, reason: collision with root package name */
    public r45.jv4 f336822d;

    public static final long wi(en3.b0 b0Var, r45.jv4 jv4Var, java.lang.String str, java.lang.String str2) {
        java.lang.Object obj;
        java.lang.Object obj2;
        b0Var.getClass();
        java.util.LinkedList m75941xfb821914 = jv4Var.m75941xfb821914(7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getActionList(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.iv4) obj2).m75945x2fec8307(0), str)) {
                break;
            }
        }
        r45.iv4 iv4Var = (r45.iv4) obj2;
        java.util.LinkedList m75941xfb8219142 = jv4Var.m75941xfb821914(7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getActionList(...)");
        java.util.Iterator it6 = m75941xfb8219142.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.iv4) next).m75945x2fec8307(0), str2)) {
                obj = next;
                break;
            }
        }
        r45.iv4 iv4Var2 = (r45.iv4) obj;
        if (iv4Var == null || iv4Var2 == null) {
            return 0L;
        }
        long m75942xfb822ef2 = iv4Var2.m75942xfb822ef2(2) - iv4Var.m75942xfb822ef2(2);
        if (m75942xfb822ef2 > 0) {
            return m75942xfb822ef2;
        }
        return 0L;
    }

    public void Ai(java.lang.String action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        long c17 = c01.id.c();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        r45.jv4 jv4Var = this.f336822d;
        if (jv4Var != null) {
            java.lang.String m75945x2fec8307 = jv4Var.m75945x2fec8307(0);
            ra0.a0 a0Var = ra0.a0.f474991a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349();
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, ra0.a0.f474992b)) {
                jv4Var = null;
            }
            r45.jv4 jv4Var2 = jv4Var;
            if (jv4Var2 != null) {
                ((ku5.t0) ku5.t0.f394148d).h(new en3.z(action, c17, elapsedRealtime, jv4Var2, this), "NewLifeReportAction");
            }
        }
    }

    public r45.kv0 Bi(int i17, int i18) {
        r45.kv0 a17 = db2.t4.f309704a.a(i18);
        a17.set(1, java.lang.Integer.valueOf(i17));
        a17.set(4, new r45.g40());
        r45.g40 g40Var = (r45.g40) a17.m75936x14adae67(4);
        if (g40Var != null) {
            java.lang.String debugInfo = "genNewLifeFinderBaseRequest[" + i17 + '-' + i18 + ']';
            ra0.a0 a0Var = ra0.a0.f474991a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(debugInfo, "debugInfo");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349();
            g40Var.set(0, ra0.a0.f474992b);
        }
        return a17;
    }
}
