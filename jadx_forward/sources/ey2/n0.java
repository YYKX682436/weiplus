package ey2;

/* loaded from: classes2.dex */
public final class n0 extends pf5.o0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f338969e = new java.util.LinkedList();

    public final ey2.m0 N6(r45.qt2 contextObj) {
        r45.jw2 jw2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GuideConfigVM", "[getConfig] contextId=" + contextObj.m75945x2fec8307(1));
        java.lang.String m75945x2fec8307 = contextObj.m75945x2fec8307(1);
        boolean z17 = m75945x2fec8307 != null && r26.i0.y(m75945x2fec8307, "34-", false);
        java.lang.Object obj = null;
        java.util.LinkedList linkedList = this.f338969e;
        if (z17) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((r45.jw2) next).m75939xb282bd08(0) == 1) {
                    obj = next;
                    break;
                }
            }
            jw2Var = (r45.jw2) obj;
        } else {
            java.lang.String m75945x2fec83072 = contextObj.m75945x2fec8307(1);
            if (m75945x2fec83072 != null && r26.i0.y(m75945x2fec83072, "29-", false)) {
                java.util.Iterator it6 = linkedList.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    java.lang.Object next2 = it6.next();
                    if (((r45.jw2) next2).m75939xb282bd08(0) == 2) {
                        obj = next2;
                        break;
                    }
                }
                jw2Var = (r45.jw2) obj;
            } else {
                java.util.Iterator it7 = linkedList.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    }
                    java.lang.Object next3 = it7.next();
                    if (((r45.jw2) next3).m75939xb282bd08(0) == 3) {
                        obj = next3;
                        break;
                    }
                }
                jw2Var = (r45.jw2) obj;
            }
        }
        ey2.m0 m0Var = new ey2.m0();
        if (jw2Var != null) {
            m0Var.f338963a = jw2Var.m75939xb282bd08(0);
            jw2Var.m75939xb282bd08(1);
            jw2Var.m75939xb282bd08(4);
            jw2Var.m75939xb282bd08(5);
            jw2Var.m75939xb282bd08(2);
            jw2Var.m75939xb282bd08(6);
            jw2Var.m75939xb282bd08(3);
            jw2Var.m75939xb282bd08(7);
        }
        return m0Var;
    }
}
