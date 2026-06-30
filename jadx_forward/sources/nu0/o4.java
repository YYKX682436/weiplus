package nu0;

/* loaded from: classes5.dex */
public final class o4 extends lw0.l {

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f421589s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f421590t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f421589s = jz5.h.b(new nu0.n4(this));
        this.f421590t = jz5.h.b(new nu0.m4(this));
    }

    @Override // lw0.l
    public boolean l7(kw0.e state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4058x7a492233 x76 = x7();
        boolean z17 = false;
        if (x76 == null) {
            return false;
        }
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 of6 = com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78.of(x76.m33049x3b4d09f6());
        kw0.a b17 = fv0.e.b(state);
        if (zu0.i.f557209f != (b17 != null ? b17.f394322b : null) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(x76.m33054xd8cf7878(), b17.f394321a.f129757b)) {
            return false;
        }
        boolean e17 = x76.e(b17.f394321a.f129757b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageWhenWhereEditPanelUIC", "onWhenWhereReplaced: updateResult " + e17);
        if (!e17) {
            return false;
        }
        if (x76.m33060xc1a3f665() && x76.m33057x2b69a60() == 0) {
            x76.f(w7().e7());
        }
        boolean m33061xc818667f = x76.m33061xc818667f();
        jz5.g gVar = this.f421589s;
        if (!m33061xc818667f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageWhenWhereEditPanelUIC", "onWhenWhereReplaced: isDisplayingLocation false ");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(of6);
            gx0.hf.V6((nu0.i4) ((jz5.n) gVar).mo141623x754a37bb(), of6, null, 2, null);
            return true;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4186x9bb007e5 m33048x39079369 = x76.m33048x39079369();
        if (m33048x39079369 != null) {
            java.lang.String m34564x40fe68a6 = m33048x39079369.m34564x40fe68a6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34564x40fe68a6, "getProvince(...)");
            if (m34564x40fe68a6.length() == 0) {
                java.lang.String m34562x76e49360 = m33048x39079369.m34562x76e49360();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34562x76e49360, "getCountry(...)");
                if (m34562x76e49360.length() == 0) {
                    java.lang.String m34561xfb7e01e1 = m33048x39079369.m34561xfb7e01e1();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34561xfb7e01e1, "getCity(...)");
                    if (m34561xfb7e01e1.length() == 0) {
                        java.lang.String m34565x2d5f49ea = m33048x39079369.m34565x2d5f49ea();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34565x2d5f49ea, "getRegion(...)");
                        if (m34565x2d5f49ea.length() == 0) {
                            java.lang.String m34563xfb82e301 = m33048x39079369.m34563xfb82e301();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34563xfb82e301, "getName(...)");
                            if (m34563xfb82e301.length() == 0) {
                                java.lang.String m34560xf964d7be = m33048x39079369.m34560xf964d7be();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34560xf964d7be, "getAddress(...)");
                                if (m34560xf964d7be.length() == 0) {
                                    z17 = true;
                                }
                            }
                        }
                    }
                }
            }
            if (!z17) {
                x76.d(m33048x39079369);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(of6);
                gx0.hf.V6((nu0.i4) ((jz5.n) gVar).mo141623x754a37bb(), of6, null, 2, null);
                return true;
            }
        }
        du0.i0 P6 = P6();
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e Z6 = w7().Z6();
        P6.O6(Z6 != null ? Z6.m33107xed29dd2b() : null, new nu0.l4(x76, this, of6));
        return true;
    }

    @Override // lw0.l
    public lw0.d o7() {
        java.lang.String m34563xfb82e301;
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4058x7a492233 x76 = x7();
        if (x76 == null) {
            return null;
        }
        java.lang.String m33054xd8cf7878 = x76.m33054xd8cf7878();
        java.lang.String str = "";
        if (m33054xd8cf7878 == null) {
            m33054xd8cf7878 = "";
        }
        long m33057x2b69a60 = x76.m33057x2b69a60();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4186x9bb007e5 m33048x39079369 = x76.m33048x39079369();
        if (m33048x39079369 != null && (m34563xfb82e301 = m33048x39079369.m34563xfb82e301()) != null) {
            str = m34563xfb82e301;
        }
        return new lw0.d(m33054xd8cf7878, m33057x2b69a60, str);
    }

    @Override // lw0.l
    public void q7(java.util.Calendar calendarDate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(calendarDate, "calendarDate");
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4058x7a492233 x76 = x7();
        if (x76 == null) {
            return;
        }
        x76.f(calendarDate.getTimeInMillis());
        nu0.q0.Y6(w7(), false, null, 3, null);
    }

    @Override // lw0.l
    public void r7(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4186x9bb007e5 geographicInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(geographicInfo, "geographicInfo");
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4058x7a492233 x76 = x7();
        if (x76 == null) {
            return;
        }
        x76.d(geographicInfo);
        nu0.q0.Y6(w7(), false, null, 3, null);
    }

    @Override // lw0.l
    public void s7() {
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4058x7a492233 x76 = x7();
        if (x76 != null) {
            if (x76.m33060xc1a3f665()) {
                com.p314xaae8f345.p457x3304c6.p479x4179489f.e m33047xc45e8eed = x76.m33047xc45e8eed();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33047xc45e8eed, "getDateTimeDisplayOptions(...)");
                k7(m33047xc45e8eed, x76.m33057x2b69a60());
            } else if (x76.m33061xc818667f()) {
                m7(x76.m33048x39079369());
            }
        }
    }

    @Override // lw0.l
    public void t7() {
    }

    @Override // lw0.l
    public void u7() {
    }

    public final nu0.q0 w7() {
        return (nu0.q0) ((jz5.n) this.f421590t).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4058x7a492233 x7() {
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 m146398x95ce11a9;
        lw0.c cVar = (lw0.c) this.f150773i;
        return w7().b7((cVar == null || (m146398x95ce11a9 = cVar.m146398x95ce11a9()) == null) ? null : m146398x95ce11a9.m32425x6ac9171());
    }
}
