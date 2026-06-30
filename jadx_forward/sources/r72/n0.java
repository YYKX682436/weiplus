package r72;

/* loaded from: classes16.dex */
public abstract class n0 {
    public static final jz5.l a(r72.m0 urlItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(urlItem, "urlItem");
        r45.tq0 tq0Var = new r45.tq0();
        tq0Var.i(urlItem.k());
        tq0Var.j(urlItem.t());
        tq0Var.o(urlItem.u());
        tq0Var.p(urlItem.w());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tq0Var.f468197d) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(urlItem.x())) {
            tq0Var.p(urlItem.x());
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tq0Var.f468199f) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(urlItem.o())) {
            tq0Var.j(urlItem.o());
        }
        tq0Var.n(urlItem.s());
        tq0Var.f468207q = urlItem.l();
        tq0Var.f468208r = true;
        tq0Var.f468209s = urlItem.j();
        tq0Var.f468210t = true;
        tq0Var.k(urlItem.p());
        tq0Var.q(urlItem.y());
        tq0Var.l(urlItem.q());
        java.util.LinkedList n17 = urlItem.n();
        tq0Var.f468215y.clear();
        java.util.Iterator it = n17.iterator();
        while (it.hasNext()) {
            r72.j jVar = (r72.j) it.next();
            r45.np0 np0Var = new r45.np0();
            np0Var.f463098e = jVar.m161999x76847043();
            np0Var.f463097d = jVar.j();
            np0Var.f463099f = jVar.k();
            tq0Var.f468215y.add(np0Var);
        }
        r45.qp0 qp0Var = new r45.qp0();
        r72.o0 r17 = urlItem.r();
        if (r17 != null) {
            qp0Var = new r45.qp0();
            qp0Var.f465701m = r17.r();
            qp0Var.f465702n = r17.q();
            qp0Var.f465703o = r17.p();
            qp0Var.f465706r = r17.j();
            qp0Var.f465695d = r17.l();
            qp0Var.f465709u = r17.u();
            qp0Var.f465696e = r17.n();
            qp0Var.f465697f = r17.t();
            qp0Var.f465698g = r17.s();
            qp0Var.f465699h = r17.o();
            qp0Var.f465700i = r17.k();
            qp0Var.f465704p = r17.m162013xce14d1c6();
        }
        return new jz5.l(tq0Var, qp0Var);
    }

    public static final r72.m0 b(r45.tq0 originUrl, r45.qp0 qp0Var) {
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originUrl, "originUrl");
        r72.m0 m0Var = new r72.m0();
        if (originUrl.f468202i) {
            m0Var.A(originUrl.f468201h);
        }
        if (originUrl.f468200g) {
            m0Var.I(originUrl.f468199f);
        }
        if (originUrl.f468204n) {
            m0Var.J(originUrl.f468203m);
        }
        if (originUrl.f468198e) {
            m0Var.K(originUrl.f468197d);
        }
        if (originUrl.f468198e) {
            m0Var.L(originUrl.f468197d);
        }
        if (originUrl.f468200g) {
            m0Var.C(originUrl.f468199f);
        }
        if (originUrl.f468206p) {
            m0Var.H(originUrl.f468205o);
        }
        if (originUrl.f468208r) {
            m0Var.B(originUrl.f468207q);
        }
        if (originUrl.f468210t) {
            m0Var.z(originUrl.f468209s);
        }
        if (originUrl.B) {
            m0Var.E(originUrl.A);
        }
        if (originUrl.f468212v) {
            m0Var.N(originUrl.f468211u);
        }
        if (originUrl.f468214x) {
            m0Var.F(originUrl.f468213w);
        }
        if (originUrl.f468216z && (linkedList = originUrl.f468215y) != null && linkedList.size() != 0) {
            java.util.Iterator it = originUrl.f468215y.iterator();
            while (it.hasNext()) {
                r45.np0 np0Var = (r45.np0) it.next();
                r72.j jVar = new r72.j();
                jVar.o(np0Var.f463099f);
                jVar.n(np0Var.f463097d);
                jVar.l(np0Var.f463098e);
                m0Var.n().add(jVar);
            }
        }
        if (qp0Var != null) {
            r72.o0 o0Var = new r72.o0();
            o0Var.G(qp0Var.f465701m);
            o0Var.F(qp0Var.f465702n);
            o0Var.E(qp0Var.f465703o);
            o0Var.w(qp0Var.f465706r);
            o0Var.z(qp0Var.f465695d);
            o0Var.B(qp0Var.f465709u);
            o0Var.A(qp0Var.f465696e);
            o0Var.I(qp0Var.f465697f);
            o0Var.H(qp0Var.f465698g);
            o0Var.C(qp0Var.f465699h);
            o0Var.x(qp0Var.f465700i);
            o0Var.y(qp0Var.f465704p);
            m0Var.G(o0Var);
        }
        return m0Var;
    }
}
