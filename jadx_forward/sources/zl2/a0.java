package zl2;

/* loaded from: classes3.dex */
public final class a0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.br2 f555166a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f555167b;

    public a0(r45.br2 br2Var, yz5.l lVar) {
        this.f555166a = br2Var;
        this.f555167b = lVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.y23 y23Var;
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0 && (y23Var = (r45.y23) ((r45.ea1) fVar.f152151d).m75936x14adae67(1)) != null) {
            r45.ce0 ce0Var = (r45.ce0) y23Var.m75936x14adae67(9);
            if (ce0Var == null || (str = ce0Var.m75945x2fec8307(0)) == null) {
                str = "";
            }
            r45.br2 br2Var = this.f555166a;
            br2Var.set(5, str);
            r45.ce0 ce0Var2 = (r45.ce0) y23Var.m75936x14adae67(9);
            if (ce0Var2 == null || (str2 = ce0Var2.m75945x2fec8307(1)) == null) {
                str2 = "";
            }
            br2Var.set(6, str2);
            br2Var.set(7, pm0.v.u(y23Var.m75942xfb822ef2(0)));
            java.util.LinkedList m75941xfb821914 = y23Var.m75941xfb821914(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getImg_urls(...)");
            java.lang.String str3 = (java.lang.String) kz5.n0.a0(m75941xfb821914, 0);
            if (str3 == null) {
                str3 = "";
            }
            br2Var.set(8, str3);
            java.lang.String m75945x2fec8307 = y23Var.m75945x2fec8307(1);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            br2Var.set(9, m75945x2fec8307);
            br2Var.set(11, java.lang.Integer.valueOf(y23Var.m75939xb282bd08(5)));
            br2Var.set(27, java.lang.Boolean.valueOf(y23Var.m75939xb282bd08(36) != 0));
            br2Var.set(19, y23Var.m75933x41a8a7f2(63) ? y23Var.m75945x2fec8307(64) : ((r45.ea1) fVar.f152151d).m75945x2fec8307(5));
            java.util.LinkedList m75941xfb8219142 = y23Var.m75941xfb821914(34);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getIcon_urls(...)");
            br2Var.set(20, (java.lang.String) kz5.n0.Z(m75941xfb8219142));
            java.util.LinkedList m75941xfb8219143 = y23Var.m75941xfb821914(34);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getIcon_urls(...)");
            br2Var.set(22, (java.lang.String) kz5.n0.a0(m75941xfb8219143, 1));
            br2Var.set(34, y23Var.m75933x41a8a7f2(63) ? "1" : "");
            br2Var.set(35, y23Var.m75945x2fec8307(65));
            r45.id5 id5Var = (r45.id5) y23Var.m75936x14adae67(74);
            br2Var.set(36, id5Var != null ? id5Var.m75945x2fec8307(0) : null);
            br2Var.set(37, id5Var != null ? id5Var.m75945x2fec8307(1) : null);
            br2Var.set(38, id5Var != null ? id5Var.m75945x2fec8307(2) : null);
            br2Var.set(39, id5Var != null ? id5Var.m75945x2fec8307(3) : null);
            if (y23Var.m75939xb282bd08(31) != 0) {
                br2Var.set(10, java.lang.Integer.valueOf(y23Var.m75939xb282bd08(4)));
            }
            java.util.LinkedList m75941xfb8219144 = y23Var.m75941xfb821914(28);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219144, "getShow_box_items(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : m75941xfb8219144) {
                if (((r45.p56) obj2).m75939xb282bd08(0) == 6) {
                    arrayList.add(obj2);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.p56 p56Var = (r45.p56) next;
                if (i17 == 0) {
                    r45.hu3 hu3Var = new r45.hu3();
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = p56Var.m75934xbce7f2f(1);
                    hu3Var.mo11468x92b714fd(m75934xbce7f2f != null ? m75934xbce7f2f.g() : null);
                    br2Var.set(24, hu3Var.m75945x2fec8307(0));
                } else if (i17 == 1) {
                    r45.hu3 hu3Var2 = new r45.hu3();
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f2 = p56Var.m75934xbce7f2f(1);
                    hu3Var2.mo11468x92b714fd(m75934xbce7f2f2 != null ? m75934xbce7f2f2.g() : null);
                    br2Var.set(25, hu3Var2.m75945x2fec8307(0));
                } else if (i17 == 2) {
                    r45.hu3 hu3Var3 = new r45.hu3();
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f3 = p56Var.m75934xbce7f2f(1);
                    hu3Var3.mo11468x92b714fd(m75934xbce7f2f3 != null ? m75934xbce7f2f3.g() : null);
                    br2Var.set(26, hu3Var3.m75945x2fec8307(0));
                }
                i17 = i18;
            }
            mn2.g1 g1Var = mn2.g1.f411508a;
            vo0.d e17 = g1Var.e();
            java.lang.String m75945x2fec83072 = br2Var.m75945x2fec8307(20);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 y90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f;
            mn2.q3 q3Var = new mn2.q3(m75945x2fec83072, y90Var);
            mn2.f1 f1Var = mn2.f1.f411498s;
            wo0.c b17 = e17.b(q3Var, g1Var.h(f1Var));
            zl2.x xVar = new zl2.x(br2Var);
            b17.getClass();
            b17.f529406d = xVar;
            b17.f();
            wo0.c b18 = g1Var.e().b(new mn2.q3(br2Var.m75945x2fec8307(22), y90Var), g1Var.h(f1Var));
            zl2.y yVar = new zl2.y(br2Var);
            b18.getClass();
            b18.f529406d = yVar;
            b18.f();
            r45.y64 d17 = cm2.a.f124861a.d(y23Var);
            if (d17 != null) {
                long c17 = c01.id.c();
                if (d17.m75942xfb822ef2(1) <= c17 || d17.m75939xb282bd08(0) <= 0) {
                    zl2.b0 b0Var = zl2.b0.f555196a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProductShareUtil", y23Var.m75945x2fec8307(1) + ",discount_price:" + d17.m75939xb282bd08(0) + ", serverTime:" + c17 + ",end_time_ms:" + d17.m75942xfb822ef2(1));
                } else {
                    br2Var.set(15, java.lang.Integer.valueOf(d17.m75939xb282bd08(0)));
                }
                br2Var.set(16, java.lang.Long.valueOf(d17.m75942xfb822ef2(1)));
            }
            br2Var.set(31, y23Var.m75941xfb821914(28));
            br2Var.set(32, y23Var.m75945x2fec8307(43));
            java.lang.String m75945x2fec83073 = y23Var.m75945x2fec8307(17);
            java.lang.String str4 = m75945x2fec83073 != null ? m75945x2fec83073 : "";
            zl2.b0.f555196a.f(br2Var, "Finder.FinderProductShareUtil_requestProductInfoOk");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProductShareUtil", "requestId:".concat(str4));
        }
        pm0.v.X(new zl2.z(this.f555167b, fVar));
        return jz5.f0.f384359a;
    }
}
