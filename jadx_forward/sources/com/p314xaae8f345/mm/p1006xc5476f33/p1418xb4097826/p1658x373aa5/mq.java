package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class mq {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mq f214206a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mq();

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mq mqVar, gk2.e eVar, db5.g4 g4Var) {
        mqVar.getClass();
        if (pm0.v.z(((mm2.c1) eVar.a(mm2.c1.class)).Q1, 32768)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCommentPopupWindowCreater", "addTopComment spam, flag:" + ((mm2.c1) eVar.a(mm2.c1.class)).Q1);
        } else if (g4Var.findItem(152) == null) {
            g4Var.h(152, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.daa), com.p314xaae8f345.mm.R.raw.f79244x4272aad7, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a18));
        }
    }

    public static final boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mq mqVar, gk2.e eVar, dk2.zf zfVar) {
        r45.a84 a84Var;
        boolean z17;
        mqVar.getClass();
        p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f3Var = ((mm2.n0) eVar.a(mm2.n0.class)).f410804p;
        if (f3Var == null || (a84Var = (r45.a84) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.l2) f3Var).mo144003x754a37bb()) == null) {
            return false;
        }
        java.lang.String a17 = zfVar.a();
        if (a17 == null) {
            a17 = "";
        }
        if (a17.length() == 0) {
            return false;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        if ((e17.length() > 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, e17)) {
            return false;
        }
        java.lang.String str = ((mm2.c1) eVar.a(mm2.c1.class)).f410385o;
        if (!(str.length() > 0) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, str)) {
            java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa> m75941xfb821914 = a84Var.m75941xfb821914(1);
            if (m75941xfb821914 == null) {
                return false;
            }
            if (!m75941xfb821914.isEmpty()) {
                for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa : m75941xfb821914) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c19782x23db1cfa != null ? c19782x23db1cfa.m76197x6c03c64c() : null, a17)) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            if (!z17) {
                return false;
            }
        }
        return true;
    }

    public final void c(gk2.e buContext, db5.g4 menu, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mm2.c1) buContext.a(mm2.c1.class)).f410313b2.get(username), java.lang.Boolean.TRUE)) {
            menu.g(158, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.da6), com.p314xaae8f345.mm.R.raw.f79686xdea0447);
        } else {
            menu.g(158, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573038da5), com.p314xaae8f345.mm.R.raw.f79687x455d6577);
        }
    }

    public final void d(db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        if (menu.findItem(155) == null) {
            menu.i(155, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573216dx2), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a18), com.p314xaae8f345.mm.R.raw.f79692xc84ca28d, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a18));
        }
    }

    public final void e(db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        menu.i(171, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nsd), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a18), com.p314xaae8f345.mm.R.raw.f78981x94e209af, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a18));
    }

    public final void f(db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        menu.i(170, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nsc), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a18), com.p314xaae8f345.mm.R.raw.f79628x9c0b0a94, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a18));
    }

    public final void g(db5.g4 menu, dk2.zf msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (menu.findItem(165) == null && (msg instanceof dk2.cg)) {
            if (((dk2.cg) msg).o()) {
                menu.i(166, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572784ci5), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560581oc), com.p314xaae8f345.mm.R.raw.f79655x5636c5e6, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560581oc));
            } else {
                menu.i(165, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ci6), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a18), com.p314xaae8f345.mm.R.raw.f79655x5636c5e6, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a18));
            }
        }
    }

    public final void h(db5.g4 menu, dk2.zf msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (menu.findItem(154) != null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(msg.a(), c01.z1.r())) {
            return;
        }
        java.lang.String a17 = msg.a();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, xy2.c.e(context)) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(msg.a(), c01.z1.k())) {
            return;
        }
        menu.i(154, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573003d61), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a18), com.p314xaae8f345.mm.R.raw.f79890x421682d2, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a18));
    }

    public final void i(gk2.e buContext, db5.g4 menu, dk2.zf msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (menu.findItem(156) != null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(msg.a(), c01.z1.r())) {
            return;
        }
        java.lang.String a17 = msg.a();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, xy2.c.e(context)) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(msg.a(), c01.z1.k()) || ((mm2.c1) buContext.a(mm2.c1.class)).T) {
            return;
        }
        if (((mm2.n0) buContext.a(mm2.n0.class)).f410806r) {
            return;
        }
        menu.i(156, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573232dy4), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a18), com.p314xaae8f345.mm.R.raw.f79891x20253fac, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a18));
    }

    public final void j(gk2.e buContext, db5.g4 menu, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mm2.c1) buContext.a(mm2.c1.class)).f410318c2.get(username), java.lang.Boolean.TRUE)) {
            menu.g(be1.r0.f4232x366c91de, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.da_), com.p314xaae8f345.mm.R.raw.f79732xb79b69e4);
        } else {
            menu.g(be1.r0.f4232x366c91de, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.da9), com.p314xaae8f345.mm.R.raw.f79728x90830a4a);
        }
    }

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mq mqVar, db5.g4 g4Var) {
        mqVar.getClass();
        java.util.List list = g4Var.f309877d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 >= 0) {
                android.view.MenuItem menuItem = (android.view.MenuItem) next;
                db5.h4 h4Var = menuItem instanceof db5.h4 ? (db5.h4) menuItem : null;
                if (h4Var != null && i17 >= 4) {
                    if (i17 < 8) {
                        h4Var.D = true;
                    } else {
                        h4Var.E = true;
                    }
                }
                i17 = i18;
            } else {
                kz5.c0.p();
                throw null;
            }
        }
    }
}
