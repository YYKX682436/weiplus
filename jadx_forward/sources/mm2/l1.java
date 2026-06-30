package mm2;

/* loaded from: classes3.dex */
public final class l1 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.s1 f410750d;

    public l1(mm2.s1 s1Var) {
        this.f410750d = s1Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        r45.p12 p12Var;
        java.lang.Object obj2;
        r45.q12 q12Var = (r45.q12) obj;
        mm2.s1 s1Var = this.f410750d;
        java.util.LinkedList linkedList = (java.util.LinkedList) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) s1Var.f410921h).mo144003x754a37bb();
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (q12Var != null && ((r45.p12) obj2).m75939xb282bd08(0) == q12Var.m75939xb282bd08(0)) {
                    break;
                }
            }
            p12Var = (r45.p12) obj2;
        } else {
            p12Var = null;
        }
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) s1Var.f410922i).k(p12Var != null && p12Var.m75933x41a8a7f2(4) ? s1Var.f410923m : p12Var != null ? p12Var.m75941xfb821914(1) : null);
        if (kz5.b0.c(new java.lang.Integer(3)).contains(new java.lang.Integer(q12Var != null ? q12Var.m75939xb282bd08(0) : 0))) {
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) s1Var.m147920xbba4bfc0(mm2.g1.class)).f410605m).k(null);
        } else {
            r45.sm1 sm1Var = s1Var.C;
            if ((sm1Var != null ? (r45.fd2) sm1Var.m75936x14adae67(1) : null) == null) {
                ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) s1Var.m147920xbba4bfc0(mm2.g1.class)).f410605m).k(p12Var != null && p12Var.m75933x41a8a7f2(5) ? s1Var.f410924n : p12Var != null ? (r45.fd2) p12Var.m75936x14adae67(2) : null);
            }
            ((mm2.o2) s1Var.m147920xbba4bfc0(mm2.o2.class)).m147993x5a5b64d();
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) s1Var.m147920xbba4bfc0(mm2.g1.class)).f410604i).k(null);
            ((mm2.c1) s1Var.m147920xbba4bfc0(mm2.c1.class)).f410316b5 = null;
        }
        if (q12Var != null) {
            ((mm2.e1) s1Var.m147920xbba4bfc0(mm2.e1.class)).n7(q12Var);
            int m75939xb282bd08 = q12Var.m75939xb282bd08(0);
            if (m75939xb282bd08 == 1) {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_LAST_POST_VIDEO_SUB_MODE_INT_SYNC, java.lang.Integer.valueOf(q12Var.m75939xb282bd08(1)));
                ((mm2.c1) s1Var.m147920xbba4bfc0(mm2.c1.class)).Y4 = false;
            } else if (m75939xb282bd08 == 2) {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_LAST_POST_VOICE_SUB_MODE_INT_SYNC, java.lang.Integer.valueOf(q12Var.m75939xb282bd08(1)));
                ((mm2.c1) s1Var.m147920xbba4bfc0(mm2.c1.class)).Y4 = false;
            }
        }
        if (!((mm2.c1) s1Var.m147920xbba4bfc0(mm2.c1.class)).a8()) {
            ((mm2.c1) s1Var.m147920xbba4bfc0(mm2.c1.class)).f410311a5 = (q12Var != null ? q12Var.m75939xb282bd08(0) : 0) == 3;
        }
        return jz5.f0.f384359a;
    }
}
