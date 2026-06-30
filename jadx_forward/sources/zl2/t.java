package zl2;

/* loaded from: classes3.dex */
public abstract class t {
    public static final r45.ov2 a(r45.h32 h32Var) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h32Var, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFirstCouponInfoInJumpInfo jump_info,size=");
        java.util.LinkedList m75941xfb821914 = h32Var.m75941xfb821914(11);
        sb6.append(m75941xfb821914 != null ? java.lang.Integer.valueOf(m75941xfb821914.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNoticeInfoFuncObject", sb6.toString());
        java.util.LinkedList m75941xfb8219142 = h32Var.m75941xfb821914(11);
        if (m75941xfb8219142 != null) {
            java.util.Iterator it = m75941xfb8219142.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((r45.k34) obj).m75939xb282bd08(0) == 10) {
                    break;
                }
            }
            r45.k34 k34Var = (r45.k34) obj;
            if (k34Var != null) {
                try {
                    r45.pv2 pv2Var = new r45.pv2();
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = k34Var.m75934xbce7f2f(1);
                    pv2Var.mo11468x92b714fd(m75934xbce7f2f != null ? m75934xbce7f2f.g() : null);
                    java.util.LinkedList m75941xfb8219143 = pv2Var.m75941xfb821914(0);
                    if (m75941xfb8219143 != null) {
                        return (r45.ov2) kz5.n0.Z(m75941xfb8219143);
                    }
                    return null;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveNoticeInfoFuncObject", "getFirstCouponInfoInJumpInfo " + e17);
                }
            }
        }
        return null;
    }

    public static final r45.l94 b(r45.h32 h32Var) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h32Var, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getProducts jump_info,size=");
        java.util.LinkedList m75941xfb821914 = h32Var.m75941xfb821914(11);
        sb6.append(m75941xfb821914 != null ? java.lang.Integer.valueOf(m75941xfb821914.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNoticeInfoFuncObject", sb6.toString());
        java.util.LinkedList m75941xfb8219142 = h32Var.m75941xfb821914(11);
        if (m75941xfb8219142 != null) {
            java.util.Iterator it = m75941xfb8219142.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                boolean z17 = false;
                if (((r45.k34) obj).m75939xb282bd08(0) == 22) {
                    z17 = true;
                }
                if (z17) {
                    break;
                }
            }
            r45.k34 k34Var = (r45.k34) obj;
            if (k34Var != null) {
                try {
                    r45.l94 l94Var = new r45.l94();
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = k34Var.m75934xbce7f2f(1);
                    l94Var.m75932x347fbd55(m75934xbce7f2f != null ? m75934xbce7f2f.g() : null);
                    return l94Var;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveNoticeInfoFuncObject", "getProducts " + e17);
                }
            }
        }
        return null;
    }

    public static final void c(r45.h32 h32Var, r45.q62 response, boolean z17) {
        r45.l1 l1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h32Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        r45.ov2 a17 = a(h32Var);
        if (a17 != null) {
            a17.set(3, java.lang.Integer.valueOf(response.m75939xb282bd08(3)));
            a17.set(23, java.lang.Integer.valueOf(response.m75939xb282bd08(5)));
            a17.set(21, java.lang.Integer.valueOf(response.m75939xb282bd08(4)));
            if (z17 && (l1Var = (r45.l1) a17.m75936x14adae67(19)) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a.b(l1Var);
            }
            f(h32Var, a17);
        }
    }

    public static final boolean d(r45.h32 h32Var, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h32Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).bj(username) || h32Var.m75939xb282bd08(14) != 1) {
            return false;
        }
        if (((r45.ok4) h32Var.m75936x14adae67(19)) != null) {
            r45.ok4 ok4Var = (r45.ok4) h32Var.m75936x14adae67(19);
            if (!(ok4Var != null && ok4Var.m75939xb282bd08(0) == 0)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean e(r45.h32 h32Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h32Var, "<this>");
        return h32Var.m75939xb282bd08(1) == 0;
    }

    public static final void f(r45.h32 h32Var, r45.ov2 r17) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h32Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r17, "r");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("replaceFirstCouponInfoInJumpInfo jump_info,size=");
        java.util.LinkedList m75941xfb821914 = h32Var.m75941xfb821914(11);
        sb6.append(m75941xfb821914 != null ? java.lang.Integer.valueOf(m75941xfb821914.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNoticeInfoFuncObject", sb6.toString());
        java.util.LinkedList m75941xfb8219142 = h32Var.m75941xfb821914(11);
        if (m75941xfb8219142 != null) {
            java.util.Iterator it = m75941xfb8219142.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.k34) obj).m75939xb282bd08(0) == 10) {
                        break;
                    }
                }
            }
            r45.k34 k34Var = (r45.k34) obj;
            if (k34Var != null) {
                try {
                    r45.pv2 pv2Var = new r45.pv2();
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = k34Var.m75934xbce7f2f(1);
                    pv2Var.mo11468x92b714fd(m75934xbce7f2f != null ? m75934xbce7f2f.g() : null);
                    java.util.LinkedList m75941xfb8219143 = pv2Var.m75941xfb821914(0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getInfo_list(...)");
                    kz5.h0.C(m75941xfb8219143);
                    pv2Var.m75941xfb821914(0).addFirst(r17);
                    k34Var.set(1, hc2.b.a(pv2Var));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveNoticeInfoFuncObject", "replaceFirstCouponInfoInJumpInfo " + e17);
                }
            }
        }
    }
}
