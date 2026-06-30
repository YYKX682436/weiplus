package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f171032a = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.a1.class, "forceCenterInside", "getForceCenterInside()Z", 0)), p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.a1.class, "forceNotCenterInside", "getForceNotCenterInside()Z", 0))};

    public a1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a() {
        return ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.b1.m52933x1ef03e0e().b(this, f171032a[0])).booleanValue();
    }

    public final boolean b() {
        return ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.b1.m52934x64f7a4b7().b(this, f171032a[1])).booleanValue();
    }

    public final boolean c(android.content.Context context) {
        boolean booleanValue;
        boolean z17;
        if (b()) {
            return true;
        }
        java.lang.String m17 = wo.w0.m();
        java.util.Locale US = java.util.Locale.US;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(US, "US");
        java.lang.String lowerCase = m17.toLowerCase(US);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, "M2011J18C")) {
            return true;
        }
        if (context != null && com.p314xaae8f345.mm.ui.bk.v0() && com.p314xaae8f345.mm.ui.bk.P(context)) {
            booleanValue = false;
        } else {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.b1.m52935xa4ad2059() == null) {
                if (u75.c.a()) {
                    nf.y yVar = nf.x.f418149b;
                    if (!(yVar != null ? yVar.f() : false)) {
                        z17 = true;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.b1.m52936x9f968365(java.lang.Boolean.valueOf(z17));
                    }
                }
                z17 = false;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.b1.m52936x9f968365(java.lang.Boolean.valueOf(z17));
            }
            java.lang.Boolean m52935xa4ad2059 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.b1.m52935xa4ad2059();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m52935xa4ad2059);
            booleanValue = m52935xa4ad2059.booleanValue();
        }
        return booleanValue;
    }
}
