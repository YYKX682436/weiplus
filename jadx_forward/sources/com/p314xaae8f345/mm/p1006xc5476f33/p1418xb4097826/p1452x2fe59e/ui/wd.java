package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class wd {
    public wd(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(java.util.List selectedList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedList, "selectedList");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        for (java.lang.Object obj : selectedList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String g17 = ((b93.b) c93.a.a()).g((java.lang.String) obj);
            if (g17 == null) {
                g17 = "";
            }
            sb6.append(g17);
            if (i17 < selectedList.size() - 1) {
                sb6.append(",");
            }
            i17 = i18;
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.lang.String b(java.util.LinkedList linkedList) {
        int i17 = 0;
        if (linkedList == null || linkedList.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.Object obj : linkedList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            sb6.append(((r45.il1) obj).m75945x2fec8307(1));
            if (i17 < linkedList.size() - 1) {
                sb6.append(",");
            }
            i17 = i18;
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.lang.String c(java.util.List selectedList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedList, "selectedList");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        for (java.lang.Object obj : selectedList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 q17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q((java.lang.String) obj);
            java.lang.String str = "";
            if (q17 != null) {
                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String d17 = q17.d1();
                ((sg3.a) v0Var).getClass();
                java.lang.String c17 = c01.a2.c(q17, d17);
                if (c17 != null) {
                    str = c17;
                }
            }
            sb6.append(str);
            if (i17 < selectedList.size() - 1) {
                sb6.append(",");
            }
            i17 = i18;
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }
}
