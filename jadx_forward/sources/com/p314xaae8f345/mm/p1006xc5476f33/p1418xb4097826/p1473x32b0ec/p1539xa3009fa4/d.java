package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class d implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f198548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.g f198549b;

    public d(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.g gVar) {
        this.f198548a = z17;
        this.f198549b = gVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.bu5 bu5Var;
        java.lang.String m75945x2fec8307;
        java.lang.String str;
        java.lang.String m75945x2fec83072;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.g gVar = this.f198549b;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.pr1 pr1Var = (r45.pr1) fVar.f152151d;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pr1Var != null ? pr1Var.m75945x2fec8307(1) : null)) {
                java.lang.String str2 = "";
                if (!this.f198548a) {
                    if (!gVar.f198635h) {
                        if (gVar.f198636i != null) {
                            lt.r0 r0Var = (lt.r0) i95.n0.c(lt.r0.class);
                            r45.n46 n46Var = gVar.f198636i;
                            java.lang.String str3 = (n46Var == null || (bu5Var = (r45.bu5) n46Var.m75936x14adae67(1)) == null || (m75945x2fec8307 = bu5Var.m75945x2fec8307(0)) == null) ? "" : m75945x2fec8307;
                            java.lang.String str4 = gVar.f198633f;
                            ((kt.s0) r0Var).Ai(str3, "", str4 == null ? "" : str4, -1, "");
                        } else {
                            r45.xl6 xl6Var = gVar.f198637m;
                            java.lang.String m75945x2fec83073 = xl6Var != null ? xl6Var.m75945x2fec8307(0) : null;
                            if (m75945x2fec83073 != null) {
                                pm0.z.b(xy2.b.f539688b, "AUTH_ERROR_2", false, null, null, false, false, null, 124, null);
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w7.f184189a.e(-2, m75945x2fec83073);
                            }
                        }
                    }
                    gVar.m158354x19263085().finish();
                    return f0Var;
                }
                r45.pr1 pr1Var2 = (r45.pr1) fVar.f152151d;
                java.lang.String m75945x2fec83074 = pr1Var2 != null ? pr1Var2.m75945x2fec8307(1) : null;
                if (m75945x2fec83074 == null) {
                    m75945x2fec83074 = "";
                }
                gVar.getClass();
                gVar.f198633f = m75945x2fec83074;
                r45.pr1 pr1Var3 = (r45.pr1) fVar.f152151d;
                if (pr1Var3 == null || (str = pr1Var3.m75945x2fec8307(4)) == null) {
                    str = "";
                }
                r45.xl6 xl6Var2 = gVar.f198637m;
                if (xl6Var2 != null) {
                    xl6Var2.set(4, str);
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("thirdAppInfo authCode:");
                r45.xl6 xl6Var3 = gVar.f198637m;
                sb6.append(xl6Var3 != null ? xl6Var3.m75945x2fec8307(4) : null);
                java.lang.String sb7 = sb6.toString();
                java.lang.String str5 = gVar.f198631d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str5, sb7);
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("thirdAppInfo platformId:");
                r45.xl6 xl6Var4 = gVar.f198637m;
                sb8.append(xl6Var4 != null ? java.lang.Integer.valueOf(xl6Var4.m75939xb282bd08(2)) : null);
                sb8.append(", gameUserId:");
                r45.xl6 xl6Var5 = gVar.f198637m;
                sb8.append(xl6Var5 != null ? xl6Var5.m75945x2fec8307(3) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str5, sb8.toString());
                boolean z17 = gVar.f198635h;
                ke2.y yVar = new ke2.y(gVar.f198633f, z17 ? 1 : 0, false, null, false, null, 60, null);
                r45.gv1 gv1Var = yVar.f388534u;
                gv1Var.set(6, str);
                r45.xl6 xl6Var6 = gVar.f198637m;
                gv1Var.set(8, java.lang.Integer.valueOf(xl6Var6 != null ? xl6Var6.m75939xb282bd08(2) : 0));
                r45.xl6 xl6Var7 = gVar.f198637m;
                if (xl6Var7 != null && (m75945x2fec83072 = xl6Var7.m75945x2fec8307(3)) != null) {
                    str2 = m75945x2fec83072;
                }
                gv1Var.set(9, str2);
                if (gVar.f198637m != null) {
                    gv1Var.set(7, 1);
                }
                yVar.t(gVar.m158354x19263085(), gVar.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 500L);
                pq5.g l17 = yVar.l();
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = gVar.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveAuthUI");
                l17.f((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13961x4185f9c0) m158354x19263085);
                l17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c(gVar, z17 ? 1 : 0, str));
                return l17;
            }
        }
        int i18 = fVar.f152149b;
        java.lang.String str6 = fVar.f152150c;
        r45.pr1 pr1Var4 = (r45.pr1) fVar.f152151d;
        gVar.getClass();
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("dealError ");
        sb9.append(i18);
        sb9.append(", appid:");
        sb9.append(pr1Var4 != null ? pr1Var4.m75945x2fec8307(1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gVar.f198631d, sb9.toString());
        android.app.Activity context = gVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b) a17;
        switch (i18) {
            case -200118:
                java.lang.String string = gVar.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l4r);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                if (str6 == null) {
                    str6 = gVar.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l4q);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str6, "getString(...)");
                }
                bVar.P6(false, string, str6);
                break;
            case -200096:
                java.lang.String string2 = gVar.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l4p);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                java.lang.String string3 = gVar.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l4o);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                bVar.P6(false, string2, string3);
                break;
            case -200095:
                java.lang.String string4 = gVar.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l4n);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
                java.lang.String string5 = gVar.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l4m);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
                bVar.P6(false, string4, string5);
                break;
            case -200093:
                java.lang.String string6 = gVar.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gcu);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string6, "getString(...)");
                java.lang.String spannableString = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3.f183555a.h(gVar.m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.l4w, false).toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(spannableString, "toString(...)");
                bVar.P6(false, string6, spannableString);
                break;
            case -200091:
                java.lang.String string7 = gVar.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l4k);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string7, "getString(...)");
                java.lang.String string8 = gVar.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l4q);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string8, "getString(...)");
                bVar.P6(false, string7, string8);
                break;
            case -200035:
                java.lang.String string9 = gVar.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l4l);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string9, "getString(...)");
                java.lang.String string10 = gVar.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l4q);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string10, "getString(...)");
                bVar.P6(false, string9, string10);
                break;
            default:
                java.lang.String string11 = gVar.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l4r);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string11, "getString(...)");
                java.lang.String string12 = gVar.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l4q);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string12, "getString(...)");
                bVar.P6(false, string11, string12);
                break;
        }
        gVar.P6();
        bVar.Q6();
        if (i18 != -200093) {
            return f0Var;
        }
        android.view.View findViewById = bVar.h().findViewById(com.p314xaae8f345.mm.R.id.g6a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        ((android.widget.TextView) findViewById).setText(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3.f183555a.h(gVar.m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.l4w, false));
        return f0Var;
    }
}
