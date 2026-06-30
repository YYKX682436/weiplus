package hb2;

/* loaded from: classes8.dex */
public final class s0 extends hb2.w0 implements i95.m {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.s0 f361623e = new hb2.s0();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f361624f = "Finder.FinderModifyUserService";

    @Override // hb2.w0
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g c(java.lang.Object obj) {
        r45.ri2 cmdBufItem = (r45.ri2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        return com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(cmdBufItem.mo14344x5f01b1f6());
    }

    @Override // hb2.w0
    public int i() {
        return 1;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f361624f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        ya2.g gVar;
        ya2.b2 b17;
        r45.ri2 cmdBufItem = (r45.ri2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdBufItem, "cmdBufItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdRef, "cmdRef");
        int m75939xb282bd08 = cmdRef.m75939xb282bd08(1);
        java.lang.String str = f361624f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[handleUpdateResult] username=" + username + ", retCode=" + m75939xb282bd08);
        if (m75939xb282bd08 != 0 || (b17 = (gVar = ya2.h.f542017a).b(username)) == null) {
            return;
        }
        m92.c cVar = new m92.c(username);
        java.lang.String m75945x2fec8307 = cmdBufItem.m75945x2fec8307(0);
        if (m75945x2fec8307 != null) {
            b17.f69328x21f9b213 = m75945x2fec8307;
            cVar.f68710x21f9b213 = m75945x2fec8307;
        }
        java.lang.String m75945x2fec83072 = cmdBufItem.m75945x2fec8307(1);
        if (m75945x2fec83072 != null) {
            b17.f69341xda9bc3b3 = m75945x2fec83072;
            cVar.f68718xda9bc3b3 = m75945x2fec83072;
        }
        java.lang.String m75945x2fec83073 = cmdBufItem.m75945x2fec8307(3);
        if (m75945x2fec83073 != null) {
            b17.f69301x81118c51 = m75945x2fec83073;
            cVar.f68693x81118c51 = m75945x2fec83073;
        }
        g92.b bVar = g92.b.f351302e;
        bVar.C(cVar, m92.j.f406525g);
        gVar.o(b17);
        java.lang.String field_username = b17.f69347xdec927b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_username, "field_username");
        m92.b j37 = g92.a.j3(bVar, field_username, false, 2, null);
        int i17 = j37 != null ? j37.f68698x26b1b2e8 : 0;
        if (cmdBufItem.m75939xb282bd08(18) == 1) {
            i17 |= 262144;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "showFinderInWxSwitch turn on");
        } else if (cmdBufItem.m75939xb282bd08(18) == 2) {
            i17 &= -262145;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "showFinderInWxSwitch turn off");
        }
        m92.c cVar2 = new m92.c(b17.D0());
        cVar2.f68698x26b1b2e8 = i17;
        bVar.C(cVar2, m92.j.f406530o);
    }

    public void n(boolean z17, zy2.gc gcVar, java.lang.String str) {
        r45.ri2 ri2Var = new r45.ri2();
        ri2Var.set(29, java.lang.Integer.valueOf(z17 ? 1 : 2));
        if (str != null) {
            hb2.w0.a(f361623e, str, ri2Var, gcVar, false, true, null, 40, null);
        }
    }

    public void o(boolean z17, zy2.gc gcVar, java.lang.String str) {
        r45.ri2 ri2Var = new r45.ri2();
        ri2Var.set(26, java.lang.Integer.valueOf(z17 ? 1 : 2));
        if (str != null) {
            hb2.w0.a(f361623e, str, ri2Var, gcVar, false, false, null, 56, null);
        }
    }

    public void q(java.lang.String coverUrl, zy2.gc gcVar, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverUrl, "coverUrl");
        r45.ri2 ri2Var = new r45.ri2();
        ri2Var.set(20, coverUrl);
        if (str != null) {
            hb2.w0.a(f361623e, str, ri2Var, gcVar, false, true, null, 40, null);
        }
    }

    public void r(java.lang.String country, java.lang.String province, java.lang.String city, int i17, zy2.gc gcVar, java.lang.String str) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(country, "country");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(province, "province");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(city, "city");
        r45.ri2 ri2Var = new r45.ri2();
        ri2Var.set(4, country);
        ri2Var.set(5, province);
        ri2Var.set(6, city);
        ri2Var.set(11, java.lang.Integer.valueOf(i17));
        r45.ae3 ae3Var = ((ey2.k0) pf5.u.f435469a.e(c61.l7.class).a(ey2.k0.class)).f338944e;
        if (ae3Var != null) {
            ri2Var.set(17, new r45.hz0());
            r45.hz0 hz0Var = (r45.hz0) ri2Var.m75936x14adae67(17);
            if (hz0Var != null) {
                hz0Var.set(0, ae3Var.f451499d);
            }
            r45.hz0 hz0Var2 = (r45.hz0) ri2Var.m75936x14adae67(17);
            if (hz0Var2 != null) {
                hz0Var2.set(1, ae3Var.f451500e);
            }
            r45.hz0 hz0Var3 = (r45.hz0) ri2Var.m75936x14adae67(17);
            if (hz0Var3 != null) {
                hz0Var3.set(2, ae3Var.f451501f);
            }
            if (str != null) {
                hb2.w0.a(f361623e, str, ri2Var, gcVar, false, false, null, 56, null);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var != null) {
                return;
            }
        }
        if (str != null) {
            hb2.w0.a(this, str, ri2Var, gcVar, false, false, null, 56, null);
        }
    }

    public void s(int i17, int i18, zy2.gc gcVar, java.lang.String str) {
        r45.ri2 ri2Var = new r45.ri2();
        if (i18 == 0) {
            ri2Var.set(23, java.lang.Integer.valueOf(i17));
        } else if (i18 == 1) {
            ri2Var.set(28, java.lang.Integer.valueOf(i17));
        } else if (i18 == 2) {
            ri2Var.set(27, java.lang.Integer.valueOf(i17));
        }
        if (str != null) {
            hb2.w0.a(f361623e, str, ri2Var, gcVar, false, false, null, 56, null);
        }
    }

    public void t(int i17, int i18, zy2.gc gcVar, java.lang.String str) {
        r45.ri2 ri2Var = new r45.ri2();
        ri2Var.set(7, java.lang.Integer.valueOf(i17));
        ri2Var.set(12, java.lang.Integer.valueOf(i18));
        if (str != null) {
            hb2.w0.a(f361623e, str, ri2Var, gcVar, false, false, null, 56, null);
        }
    }

    public void u(boolean z17, zy2.gc gcVar, java.lang.String str) {
        r45.ri2 ri2Var = new r45.ri2();
        ri2Var.set(18, java.lang.Integer.valueOf(z17 ? 1 : 2));
        if (str != null) {
            hb2.w0.a(f361623e, str, ri2Var, gcVar, false, false, null, 56, null);
        }
    }
}
