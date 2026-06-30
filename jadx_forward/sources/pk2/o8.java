package pk2;

/* loaded from: classes3.dex */
public final class o8 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.d9 f437603e;

    public o8(pk2.o9 o9Var, pk2.d9 d9Var) {
        this.f437602d = o9Var;
        this.f437603e = d9Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        pk2.g8 g8Var;
        pk2.o9 o9Var = this.f437602d;
        o9Var.getClass();
        pk2.d9 d9Var = this.f437603e;
        java.util.Iterator it = d9Var.f437203m.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((qk2.h) obj).y() == menuItem.getItemId()) {
                    break;
                }
            }
        }
        qk2.h hVar = (qk2.h) obj;
        if (hVar != null) {
            hVar.A();
        }
        java.util.Iterator it6 = d9Var.f437204n.iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it6.next();
                if (((qk2.h) obj2).y() == menuItem.getItemId()) {
                    break;
                }
            }
        }
        qk2.h hVar2 = (qk2.h) obj2;
        if (hVar2 != null) {
            hVar2.A();
        }
        java.util.Iterator it7 = d9Var.f437205o.iterator();
        while (true) {
            if (!it7.hasNext()) {
                obj3 = null;
                break;
            } else {
                obj3 = it7.next();
                if (((qk2.h) obj3).y() == menuItem.getItemId()) {
                    break;
                }
            }
        }
        qk2.h hVar3 = (qk2.h) obj3;
        if (hVar3 != null) {
            hVar3.A();
        }
        java.util.Iterator it8 = d9Var.f437203m.iterator();
        while (true) {
            if (!it8.hasNext()) {
                obj4 = null;
                break;
            } else {
                obj4 = it8.next();
                if (((qk2.h) obj4).y() == menuItem.getItemId()) {
                    break;
                }
            }
        }
        qk2.h hVar4 = (qk2.h) obj4;
        boolean x17 = hVar4 != null ? hVar4.x() : true;
        java.util.Iterator it9 = d9Var.f437204n.iterator();
        while (true) {
            if (!it9.hasNext()) {
                obj5 = null;
                break;
            } else {
                obj5 = it9.next();
                if (((qk2.h) obj5).y() == menuItem.getItemId()) {
                    break;
                }
            }
        }
        qk2.h hVar5 = (qk2.h) obj5;
        if (hVar5 != null) {
            x17 = hVar5.x();
        }
        java.util.Iterator it10 = d9Var.f437205o.iterator();
        while (true) {
            if (!it10.hasNext()) {
                obj6 = null;
                break;
            } else {
                obj6 = it10.next();
                if (((qk2.h) obj6).y() == menuItem.getItemId()) {
                    break;
                }
            }
        }
        qk2.h hVar6 = (qk2.h) obj6;
        if (hVar6 != null) {
            x17 = hVar6.x();
        }
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        int i18 = o9Var.f437629m;
        if (valueOf != null && valueOf.intValue() == i18) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "expose isLandscape:" + o9Var.h());
            if (o9Var.h()) {
                pk2.d9 d9Var2 = o9Var.f437615f;
                if (d9Var2 != null && (g8Var = d9Var2.f437191a) != null) {
                    ((pk2.k9) g8Var).b(new pk2.ma(o9Var));
                }
            } else {
                pk2.na.a(o9Var);
            }
            if (o9Var.f437609c == 0) {
                ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                r0Var.getClass();
                ml2.r0.hj(r0Var, ml2.b4.f408769i, null, 0L, null, null, null, null, null, 252, null);
                r0Var.E++;
                i95.m c17 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb.I8((zy2.zb) c17, ml2.u1.T1, kz5.c1.l(new jz5.l("liveid", java.lang.String.valueOf(((mm2.e1) o9Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0))), new jz5.l("feedid", pm0.v.u(((mm2.e1) o9Var.c(mm2.e1.class)).f410516m)), new jz5.l("panel_sence", "3")), null, null, null, null, false, 124, null);
            }
        } else {
            int i19 = o9Var.f437655z;
            if (valueOf != null && valueOf.intValue() == i19) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
                pk2.d9 d9Var3 = o9Var.f437615f;
                if (d9Var3 != null) {
                    i95.m c18 = i95.n0.c(zg0.u2.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = o9Var.f437611d.mo55332x76847179();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                    d9Var3.f437202l = zg0.u2.K2((zg0.u2) c18, mo55332x76847179, "https://game.weixin.qq.com/cgi-bin/h5/static/findercenter/tester.html", null, null, 12, null);
                }
                if (d9Var3 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1) d9Var3.g()).show();
                }
                if (d9Var3 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1) d9Var3.g()).R(new pk2.s6(o9Var));
                }
                if (d9Var3 != null) {
                    ((hg5.d) d9Var3.g()).f362939o = new pk2.t6(o9Var);
                }
            } else {
                int i27 = o9Var.f437652x0;
                if (valueOf != null && valueOf.intValue() == i27) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
                    r45.qw1 qw1Var = ((mm2.c1) o9Var.c(mm2.c1.class)).Q5;
                    java.lang.String m75945x2fec8307 = qw1Var != null ? qw1Var.m75945x2fec8307(0) : null;
                    if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "clickInnerData but innerUrl is null");
                    } else {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("rawUrl", m75945x2fec8307);
                        intent.putExtra("convertActivityFromTranslucent", true);
                        j45.l.j(o9Var.f437611d, "webview", ".ui.tools.WebViewUI", intent, null);
                    }
                } else {
                    pk2.u6.a(o9Var, menuItem != null ? menuItem.getItemId() : -1);
                }
            }
        }
        if (x17) {
            d9Var.h();
        }
    }
}
