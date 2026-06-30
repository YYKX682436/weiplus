package xh4;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final xh4.x f536176a = new xh4.x();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f536177b;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(xh4.x r13, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xh4.x.a(xh4.x, com.tencent.mm.ui.MMFragmentActivity, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final boolean d() {
        return j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20237x941ef0b0()) == 1;
    }

    public final void b(android.app.Activity context, yz5.a onContinue, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onContinue, "onContinue");
        if (!uh4.c0.m168057xb411027f().T2()) {
            onContinue.mo152xb9724478();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeUtil", "[checkNeedShowDialogAfterVerifyPwd] show dialog");
            db5.e1.B(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.olk), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571891sq), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new xh4.p(context, onContinue, aVar), new xh4.q(aVar), com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5);
        }
    }

    public final java.lang.Object c(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f, android.content.Intent intent, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        intent.putExtra("Intent_UseResult", true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeUtil", "[checkTeenPwd] startActivityForResult");
        ((com.p314xaae8f345.mm.ui.bd) activityC21401x6ce6f73f.m78751x5dc77fb5(intent)).f279410a = new xh4.t(rVar, activityC21401x6ce6f73f);
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    public final int e(int i17) {
        if (i17 == 1) {
            return 1;
        }
        if (i17 == 2) {
            return 3;
        }
        if (i17 == 3) {
            return 8;
        }
        if (i17 != 4) {
            return i17 != 5 ? 18 : 16;
        }
        return 12;
    }

    public final int f(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        try {
            boolean z17 = true;
            if (android.provider.Settings.Secure.getInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver(), "minors_mode", 0) != 1) {
                z17 = false;
            }
            if (z17) {
                return android.provider.Settings.Secure.getInt(context.getContentResolver(), "minors_mode_age_range", 0);
            }
            return 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TeenModeUtil", "Setting not found: " + e17.getMessage());
            return 0;
        }
    }

    public final boolean g(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int f17 = f(context);
        if (f(context) != 0) {
            r45.kz2 O6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f) ((iz2.c) pf5.u.f435469a.e(zy2.b6.class).c(iz2.c.class))).O6();
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(calendar, "getInstance(...)");
            int m75939xb282bd08 = calendar.get(1) - O6.m75939xb282bd08(0);
            int e17 = e(f17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeUtil", "age change isNeedToShowNotice finderAge: " + m75939xb282bd08 + ", sysAge: " + e17);
            if (m75939xb282bd08 != e17) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String h(int i17) {
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? "" : "Block" : "Allow" : "Limited";
    }

    public final void i(android.content.Context context) {
        ya2.r rVar = ya2.r.f542058a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeUtil", "age change updateTeenModeFinderAge");
        int f17 = f(context);
        int e17 = e(f17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeUtil", "updateTeenModeFinderAge sysAge: " + f17 + ", curAge: " + e17);
        try {
            r45.kz2 kz2Var = new r45.kz2();
            java.lang.String v17 = gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_SYNC_TEEN_MODE_MANAGE_CONFIG_STRING_SYNC, "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v17);
            if (v17.length() > 0) {
                kz2Var.mo11468x92b714fd(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(v17));
            }
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(calendar, "getInstance(...)");
            int i17 = calendar.get(1);
            int i18 = calendar.get(2);
            kz2Var.set(0, java.lang.Integer.valueOf(i17 - e17));
            kz2Var.set(1, java.lang.Integer.valueOf(i18));
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            rVar.e(kz2Var.m75939xb282bd08(0), kz2Var.m75939xb282bd08(1), kz2Var.m75942xfb822ef2(3));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f) ((iz2.c) pf5.u.f435469a.e(zy2.b6.class).c(iz2.c.class))).W6(kz2Var, "systemUpdate");
        } catch (java.lang.Throwable th6) {
            int e18 = e(f(context));
            r45.kz2 kz2Var2 = new r45.kz2();
            java.util.Calendar calendar2 = java.util.Calendar.getInstance();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(calendar2, "getInstance(...)");
            int i19 = calendar2.get(1);
            int i27 = calendar2.get(2) + 1;
            kz2Var2.set(0, java.lang.Integer.valueOf((i19 - e18) + 1));
            kz2Var2.set(1, java.lang.Integer.valueOf(i27));
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            rVar.e(kz2Var2.m75939xb282bd08(0), kz2Var2.m75939xb282bd08(1), kz2Var2.m75942xfb822ef2(3));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_SYNC_TEEN_MODE_MANAGE_CONFIG_STRING_SYNC, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(kz2Var2.mo14344x5f01b1f6()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TeenModeUtil", th6, "getTeenModeManageInfo: parse teen mode config fail, ", new java.lang.Object[0]);
        }
    }
}
