package r72;

/* loaded from: classes16.dex */
public abstract class l {
    public static final void a(r72.k kVar, o72.r2 favItemInfo) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(favItemInfo, "favItemInfo");
        r45.bq0 bq0Var = favItemInfo.f67640x5ab01132;
        kVar.W(favItemInfo.f67657x2262335f);
        java.lang.String str2 = bq0Var.f452505q;
        if (str2 != null) {
            kVar.U(str2);
        }
        java.lang.String str3 = bq0Var.f452507s;
        if (str3 != null) {
            kVar.H(str3);
        }
        long j17 = bq0Var.A;
        if (j17 > 0) {
            kVar.J(j17);
        }
        r45.sp0 sp0Var = bq0Var.G;
        if (sp0Var != null && (str = sp0Var.f467425e) != null) {
            kVar.K(str);
        }
        if (bq0Var.f452503o != null && bq0Var.f452509u > 0) {
            r72.f0 f0Var = new r72.f0();
            f0Var.n(bq0Var.f452509u);
            f0Var.l(bq0Var.f452503o);
            kVar.S(f0Var);
        }
        if (bq0Var.f452512x) {
            kVar.G(bq0Var.f452511w);
        }
        if (bq0Var.F) {
            kVar.Z(bq0Var.E);
        } else if (favItemInfo.f67657x2262335f == 18) {
            kVar.Z(1);
        }
        java.lang.String str4 = bq0Var.R;
        if (str4 != null) {
            kVar.I(str4);
        }
        kVar.B().clear();
        r45.rq0 rq0Var = favItemInfo.f67653xef67d413;
        java.util.Iterator it = rq0Var.f466629e.iterator();
        while (it.hasNext()) {
            kVar.B().add((java.lang.String) it.next());
        }
        kVar.A().clear();
        java.util.Iterator it6 = rq0Var.f466630f.iterator();
        while (it6.hasNext()) {
            kVar.A().add((java.lang.Integer) it6.next());
        }
        kVar.x().clear();
        java.util.Iterator it7 = rq0Var.f466628d.iterator();
        while (it7.hasNext()) {
            kVar.x().add((java.lang.String) it7.next());
        }
        r45.jq0 jq0Var = favItemInfo.f67640x5ab01132.f452495d;
        if (jq0Var != null) {
            r72.g0 g0Var = new r72.g0();
            if (jq0Var.f459568e) {
                g0Var.A(jq0Var.f459567d);
            }
            if (jq0Var.f459574n) {
                g0Var.y(jq0Var.f459573m);
            }
            if (jq0Var.f459570g) {
                g0Var.t(jq0Var.f459569f);
            }
            if (jq0Var.f459572i) {
                g0Var.B(jq0Var.f459571h);
            }
            if (jq0Var.f459576p) {
                g0Var.x(jq0Var.f459575o);
            }
            if (jq0Var.f459580t) {
                g0Var.w(jq0Var.f459579s);
            }
            if (jq0Var.f459582v) {
                g0Var.s(jq0Var.f459581u);
            }
            if (jq0Var.f459584x) {
                g0Var.q(jq0Var.f459583w);
            }
            if (jq0Var.f459574n) {
                g0Var.z(jq0Var.f459573m);
            }
            if (jq0Var.f459586z) {
                g0Var.u(jq0Var.f459585y);
            }
            if (jq0Var.C) {
                g0Var.r(jq0Var.B);
            }
            kVar.T(g0Var);
        }
        java.util.LinkedList linkedList = favItemInfo.f67640x5ab01132.f452497f;
        if (linkedList.size() != 0) {
            java.util.Iterator it8 = linkedList.iterator();
            while (it8.hasNext()) {
                r45.gp0 gp0Var = (r45.gp0) it8.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gp0Var);
                kVar.l().add(r72.e.b(gp0Var));
            }
        }
        r45.pp0 pp0Var = favItemInfo.f67640x5ab01132.f452499h;
        if (pp0Var != null) {
            r72.z zVar = new r72.z();
            if (pp0Var.f464806n) {
                zVar.A(pp0Var.f464805m);
            }
            if (pp0Var.f464802g) {
                zVar.B(pp0Var.f464801f);
            }
            if (pp0Var.f464800e) {
                zVar.C(pp0Var.f464799d);
            }
            if (pp0Var.f464804i) {
                zVar.K(pp0Var.f464803h);
            }
            if (pp0Var.f464808p) {
                zVar.G(pp0Var.f464807o);
            }
            if (pp0Var.f464810r) {
                zVar.J(pp0Var.f464809q);
            }
            if (pp0Var.f464812t) {
                zVar.F(pp0Var.f464811s);
            }
            if (pp0Var.f464814v) {
                zVar.E(pp0Var.f464813u);
            }
            if (pp0Var.f464816x) {
                zVar.H(pp0Var.f464815w);
            }
            if (pp0Var.f464818z) {
                zVar.I(pp0Var.f464817y);
            }
            if (pp0Var.B) {
                zVar.z(pp0Var.A ? 1 : 0);
            }
            if (pp0Var.D) {
                zVar.x(pp0Var.C);
            }
            if (pp0Var.F) {
                zVar.y(pp0Var.E);
            }
            kVar.P(zVar);
        }
        r45.bq0 bq0Var2 = favItemInfo.f67640x5ab01132;
        r45.tq0 tq0Var = bq0Var2.f452501m;
        if (tq0Var != null) {
            kVar.Y(r72.n0.b(tq0Var, bq0Var2.K));
        }
        r45.aq0 aq0Var = favItemInfo.f67640x5ab01132.f452513y;
        if (aq0Var != null) {
            kVar.R(r72.e0.a(aq0Var));
        }
        r45.mq0 mq0Var = favItemInfo.f67640x5ab01132.C;
        if (mq0Var != null) {
            kVar.V(r72.l0.b(mq0Var));
        }
        r45.sp0 sp0Var2 = favItemInfo.f67640x5ab01132.G;
        if (sp0Var2 != null) {
            r72.b0 b0Var = new r72.b0();
            b0Var.n(sp0Var2.f467425e);
            b0Var.l(sp0Var2.f467424d);
            kVar.Q(b0Var);
        }
        r45.dp0 dp0Var = favItemInfo.f67640x5ab01132.I;
        if (dp0Var != null) {
            kVar.F(r72.b.b(dp0Var));
        }
        r45.kv2 kv2Var = favItemInfo.f67640x5ab01132.M;
        if (kv2Var != null) {
            kVar.N(o72.s3.b(kv2Var));
        }
        r45.ev2 ev2Var = favItemInfo.f67640x5ab01132.Q;
        if (ev2Var != null) {
            kVar.L(r72.n.b(ev2Var));
        }
        r45.op0 op0Var = favItemInfo.f67640x5ab01132.P;
        if (op0Var == null) {
            return;
        }
        r72.y yVar = new r72.y();
        yVar.L(op0Var.f463940d);
        yVar.z(op0Var.f463941e);
        yVar.F(op0Var.f463943g);
        yVar.A(op0Var.f463946m);
        yVar.J(op0Var.f463945i);
        yVar.C(op0Var.f463947n);
        yVar.E(op0Var.f463944h);
        yVar.H(op0Var.f463949p);
        yVar.G(op0Var.f463948o);
        yVar.y(op0Var.f463950q);
        yVar.I(op0Var.f463942f);
        yVar.K(op0Var.f463952s);
        yVar.B(op0Var.f463953t);
        java.util.LinkedList<r45.np0> favLineExcerptList = op0Var.f463954u;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(favLineExcerptList, "favLineExcerptList");
        for (r45.np0 np0Var : favLineExcerptList) {
            r72.j jVar = new r72.j();
            jVar.l(np0Var.f463098e);
            jVar.n(np0Var.f463097d);
            jVar.o(np0Var.f463099f);
            yVar.l().add(jVar);
        }
        kVar.O(yVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x02d5, code lost:
    
        if ((r1.length() == 0) != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02ee, code lost:
    
        if ((r1.length() == 0) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0306, code lost:
    
        if ((r1.length() == 0) != false) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(r72.k r7, o72.r2 r8) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r72.l.b(r72.k, o72.r2):void");
    }
}
