package ct3;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final ct3.d f303836a = new ct3.d();

    public final void a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, ot0.q qVar, int i17, long j17) {
        if (qVar == null) {
            return;
        }
        b(f9Var, new ct3.a(qVar), i17, j17);
    }

    public final void b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, ct3.c cVar, int i17, long j17) {
        java.lang.Boolean bool;
        if (f9Var == null || cVar == null) {
            bool = null;
        } else {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6451x3dd66ca4 c6451x3dd66ca4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6451x3dd66ca4();
            c6451x3dd66ca4.f137911g = i17;
            c6451x3dd66ca4.f137908d = c6451x3dd66ca4.b("FileId", cVar.c(), true);
            c6451x3dd66ca4.f137909e = cVar.b() == 1 ? 7 : 5;
            c6451x3dd66ca4.f137910f = cVar.d();
            java.lang.String a17 = cVar.a();
            if (a17 == null) {
                a17 = "";
            }
            java.util.Locale locale = java.util.Locale.getDefault();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "getDefault(...)");
            java.lang.String lowerCase = a17.toLowerCase(locale);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
            c6451x3dd66ca4.f137913i = c6451x3dd66ca4.b("FileExt", lowerCase, true);
            c6451x3dd66ca4.f137915k = 1L;
            c6451x3dd66ca4.f137917m = c6451x3dd66ca4.b("MsgSvrId", java.lang.String.valueOf(j17), true);
            c6451x3dd66ca4.f137924t = c6451x3dd66ca4.b("FileName", com.p314xaae8f345.mm.vfs.w6.q(cVar.mo122711x7531c8a2()), true);
            f303836a.d(c6451x3dd66ca4, f9Var);
            c6451x3dd66ca4.o();
            bool = java.lang.Boolean.valueOf(c6451x3dd66ca4.k());
        }
        if (bool == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileMsgActionReporter", "msg or content is null");
        }
    }

    public final void c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, r45.gp0 gp0Var, int i17, int i18) {
        java.lang.Boolean bool;
        if (f9Var == null || gp0Var == null) {
            bool = null;
        } else {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6451x3dd66ca4 c6451x3dd66ca4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6451x3dd66ca4();
            c6451x3dd66ca4.f137911g = i17;
            c6451x3dd66ca4.f137908d = c6451x3dd66ca4.b("FileId", gp0Var.f456967s, true);
            c6451x3dd66ca4.f137909e = i18;
            c6451x3dd66ca4.f137910f = gp0Var.R;
            java.lang.String str = gp0Var.K;
            if (str == null) {
                str = "";
            }
            java.util.Locale locale = java.util.Locale.getDefault();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "getDefault(...)");
            java.lang.String lowerCase = str.toLowerCase(locale);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
            c6451x3dd66ca4.f137913i = c6451x3dd66ca4.b("FileExt", lowerCase, true);
            c6451x3dd66ca4.f137915k = 2L;
            c6451x3dd66ca4.f137916l = c6451x3dd66ca4.b("DataId", gp0Var.T, true);
            c6451x3dd66ca4.f137917m = c6451x3dd66ca4.b("MsgSvrId", java.lang.String.valueOf(f9Var.I0()), true);
            c6451x3dd66ca4.f137924t = c6451x3dd66ca4.b("FileName", com.p314xaae8f345.mm.vfs.w6.q(gp0Var.f456937d), true);
            f303836a.d(c6451x3dd66ca4, f9Var);
            c6451x3dd66ca4.o();
            bool = java.lang.Boolean.valueOf(c6451x3dd66ca4.k());
        }
        if (bool == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileMsgActionReporter", "msg or dataItem is null");
        }
    }

    public final void d(com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6451x3dd66ca4 c6451x3dd66ca4, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        c6451x3dd66ca4.f137912h = (c01.id.c() - f9Var.mo78012x3fdd41df()) / 1000;
        c6451x3dd66ca4.f137914j = c6451x3dd66ca4.b("ChatName", f9Var.Q0(), true);
        c6451x3dd66ca4.f137918n = f9Var.mo78012x3fdd41df();
        c6451x3dd66ca4.f137919o = c01.id.c();
        c6451x3dd66ca4.f137920p = 202502L;
        c6451x3dd66ca4.f137921q = c6451x3dd66ca4.b("SenderUsername", f9Var.V1(), true);
        java.lang.Object l17 = gm0.j1.u().c().l(2, null);
        java.lang.String str = l17 instanceof java.lang.String ? (java.lang.String) l17 : null;
        if (str == null) {
            str = "";
        }
        c6451x3dd66ca4.f137922r = c6451x3dd66ca4.b("ActionUsername", str, true);
        c6451x3dd66ca4.f137923s = c6451x3dd66ca4.b("isThisDeviceUpload", f9Var.Z1() == 0 ? "1" : "0", true);
    }
}
