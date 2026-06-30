package hz2;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final hz2.d f367846a = new hz2.d();

    public final boolean a(java.lang.String business) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(business, "business");
        int b17 = b(business);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSpamLogic", "checkFunctionSpam function spam action:" + b17 + " business:" + business);
        if (b17 == 0) {
            return false;
        }
        m(c(business));
        jx3.f.INSTANCE.mo68477x336bdfd8(1264L, 3L, 1L, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSpamLogic", "function spam ".concat(business));
        return true;
    }

    public final int b(java.lang.String business) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(business, "business");
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderSpamObject");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSpamLogic", "getFunctionSpamAction " + d17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            return 0;
        }
        try {
            return new cl0.g(d17).b(business).mo15080xc3ca103c("action", 0);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSpamLogic", "getFunctionSpamAction spamValue " + d17);
            return 0;
        }
    }

    public final java.lang.String c(java.lang.String business) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(business, "business");
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderSpamObject");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            return "";
        }
        try {
            java.lang.String mo15083x48bce8a4 = new cl0.g(d17).b(business).mo15083x48bce8a4("tip", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15083x48bce8a4, "optString(...)");
            return mo15083x48bce8a4;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSpamLogic", "getFunctionSpamTip spamValue " + d17);
            return "";
        }
    }

    public final void d(int i17, int i18, java.lang.String str) {
        if (i17 == 4 && i18 == -4010) {
            if (str != null) {
                f367846a.m(str);
            }
            jx3.f.INSTANCE.mo68477x336bdfd8(1264L, 4L, 1L, false);
        }
    }

    public final void e(int i17, int i18, java.lang.String str) {
        if (i17 == 4) {
            if ((i18 == -5300 || i18 == -5000) && str != null) {
                f367846a.m(str);
            }
        }
    }

    public final void f(int i17, int i18, java.lang.String str) {
        if (i17 == 4 && i18 == -4013 && str != null) {
            f367846a.m(str);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5458x17ab858b c5458x17ab858b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5458x17ab858b();
            am.ua uaVar = c5458x17ab858b.f135797g;
            uaVar.f89601a = i18;
            uaVar.f89602b = str;
            c5458x17ab858b.e();
        }
    }

    public final void g(int i17, int i18, java.lang.String str) {
        if (i17 == 4 && i18 == -4005) {
            if (str != null) {
                f367846a.m(str);
            }
            jx3.f.INSTANCE.mo68477x336bdfd8(1264L, 5L, 1L, false);
        }
    }

    public final void h(int i17, int i18, java.lang.String str) {
        if (i17 == 4) {
            if (i18 == -5800) {
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ctn);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                m(string);
                return;
            }
            hz2.d dVar = f367846a;
            if (i18 == -4017) {
                if (str != null) {
                    dVar.m(str);
                }
                jx3.f.INSTANCE.mo68477x336bdfd8(1264L, 2L, 1L, false);
            } else if (i18 == -5002) {
                if (str != null) {
                    dVar.o(str);
                }
                jx3.f.INSTANCE.mo68477x336bdfd8(1264L, 1L, 1L, false);
            } else if (i18 == -5001) {
                if (str != null) {
                    dVar.n(str);
                }
                jx3.f.INSTANCE.mo68477x336bdfd8(1264L, 1L, 1L, false);
            } else if (i18 == -4007) {
                if (str != null) {
                    dVar.m(str);
                }
                jx3.f.INSTANCE.mo68477x336bdfd8(1264L, 1L, 1L, false);
            } else if (i18 == -4006) {
                if (str != null) {
                    dVar.m(str);
                }
                jx3.f.INSTANCE.mo68477x336bdfd8(1264L, 0L, 1L, false);
            }
        }
    }

    public final void i(int i17, int i18, java.lang.String str) {
        if (i17 == 4 && i18 == -4019) {
            if (str != null) {
                f367846a.m(str);
            }
            jx3.f.INSTANCE.mo68477x336bdfd8(1264L, 6L, 1L, false);
        }
    }

    public final boolean j(int i17, int i18, r45.qp1 qp1Var) {
        if (i17 != 4) {
            return false;
        }
        if (i18 != -200046) {
            switch (i18) {
                case -200012:
                case -200011:
                case -200010:
                case -200009:
                case -200008:
                    break;
                default:
                    return false;
            }
        }
        if (qp1Var == null) {
            return false;
        }
        int m75939xb282bd08 = qp1Var.m75939xb282bd08(0);
        if (m75939xb282bd08 == 1) {
            hz2.d dVar = f367846a;
            java.lang.String m75945x2fec8307 = qp1Var.m75945x2fec8307(1);
            dVar.m(m75945x2fec8307 != null ? m75945x2fec8307 : "");
        } else {
            if (m75939xb282bd08 != 3) {
                return false;
            }
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.lang.String m75945x2fec83072 = qp1Var.m75945x2fec8307(1);
            db5.t7.m(context, m75945x2fec83072 != null ? m75945x2fec83072 : "");
        }
        return true;
    }

    public final void k(android.content.Context context, int i17, int i18, cl0.g gVar) {
        if (i17 == 1) {
            return;
        }
        java.lang.String mo15082x48bce8a4 = gVar.a("link_h5").mo15082x48bce8a4("link");
        cl0.g a17 = gVar.a("toast_config");
        java.lang.String mo15082x48bce8a42 = a17.mo15082x48bce8a4("msg");
        java.lang.String mo15082x48bce8a43 = a17.mo15082x48bce8a4("cancel");
        java.lang.String mo15082x48bce8a44 = a17.mo15082x48bce8a4("confirm");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.g(mo15082x48bce8a42);
        u1Var.a(true);
        u1Var.j(mo15082x48bce8a43);
        u1Var.n(mo15082x48bce8a44);
        u1Var.b(new hz2.a(mo15082x48bce8a4, i18, context));
        u1Var.q(false);
    }

    public final void l(android.content.Context context, int i17, int i18, cl0.g gVar) {
        cl0.g b17 = gVar.b("link_lite_app");
        if (b17 == null) {
            return;
        }
        java.lang.String mo15082x48bce8a4 = b17.mo15082x48bce8a4(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd);
        java.lang.String mo15082x48bce8a42 = b17.mo15082x48bce8a4(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f);
        java.lang.String mo15082x48bce8a43 = b17.mo15082x48bce8a4("query");
        java.lang.String mo15082x48bce8a44 = b17.mo15082x48bce8a4("default_url");
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f542005a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a42);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a43);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a44);
        e1Var.K(context, mo15082x48bce8a4, mo15082x48bce8a42, mo15082x48bce8a43, mo15082x48bce8a44);
    }

    public final void m(java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ll());
        u1Var.g(errMsg);
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.l_e);
        u1Var.a(true);
        u1Var.l(hz2.b.f367843a);
        u1Var.q(false);
    }

    public final void n(java.lang.String str) {
        android.content.Context ll6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ll();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSpamLogic", "[showSpamDialogWithH5] json = " + str);
            cl0.g gVar = new cl0.g(str);
            java.lang.String mo15082x48bce8a4 = gVar.mo15082x48bce8a4("msg");
            java.lang.String mo15082x48bce8a42 = gVar.mo15082x48bce8a4("cancel");
            java.lang.String mo15082x48bce8a43 = gVar.mo15082x48bce8a4("confirm");
            java.lang.String mo15082x48bce8a44 = gVar.mo15082x48bce8a4("confirm_link");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(ll6);
            u1Var.g(mo15082x48bce8a4);
            u1Var.a(true);
            u1Var.j(mo15082x48bce8a42);
            u1Var.n(mo15082x48bce8a43);
            u1Var.b(new hz2.c(mo15082x48bce8a44, ll6));
            u1Var.q(false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSpamLogic", "[showSpamDialogWithH5] catch exception:" + e17.getMessage());
        }
    }

    public final void o(java.lang.String str) {
        android.content.Context ll6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ll();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSpamLogic", "[showSpamDialogWithJumpErrMsg] json = " + str);
            cl0.g gVar = new cl0.g(str);
            int mo15072xb58848b9 = gVar.mo15072xb58848b9("show_type");
            int mo15072xb58848b92 = gVar.mo15072xb58848b9("link_type");
            hz2.d dVar = f367846a;
            if (mo15072xb58848b92 == 1) {
                dVar.k(ll6, mo15072xb58848b9, mo15072xb58848b92, gVar);
            } else if (mo15072xb58848b92 == 2) {
                dVar.l(ll6, mo15072xb58848b9, mo15072xb58848b92, gVar);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSpamLogic", "[showSpamDialogWithJumpErrMsg] catch exception:" + e17.getMessage());
        }
    }
}
