package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class s8 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s8 f214560a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s8();

    public final java.lang.Integer a(int i17) {
        if (i17 == 32 || i17 == 33) {
            return 1;
        }
        return (i17 == 136 || i17 == 137) ? 2 : null;
    }

    public final void b(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.h8 config) {
        android.view.View view;
        android.view.View findViewById;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        long j17 = c01.z1.j();
        pr2.a aVar = pr2.a.f439482a;
        if ((34359738368L & j17) != 0) {
            aVar.b(j17, "Finder.FinderEntranceDialog");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderEntranceDialog", "openFinderEntryAndShowSnackBar: finder entry already opened, only show snackbar");
        }
        java.lang.String string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575330p41);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        int dimension = (int) activity.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        int dimension2 = (int) activity.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        java.lang.String string2 = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575331p42);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        int i17 = al5.u4.f87591t;
        al5.t4 t4Var = new al5.t4(activity);
        al5.u4 d17 = t4Var.d();
        t4Var.f87575e = hc2.x0.k(string, activity, '#', com.p314xaae8f345.mm.R.raw.f78821xb211a201, com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an, dimension, dimension, 0, dimension2, 2, 64, null);
        t4Var.a(string2);
        t4Var.f87572b = 1;
        t4Var.f87578h = (int) activity.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561193bx);
        t4Var.f87571a.f87547b = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.j8(activity, d17);
        t4Var.i();
        t4Var.g();
        if (!(!config.f213759l.isEmpty()) || (view = d17.f87598m) == null || (findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.qp_)) == null) {
            return;
        }
        hc2.v0.e(findViewById, "open_entrance_tips_set", 0, 0, false, false, config.f213759l, null, 94, null);
    }

    public final gx2.q c(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.h8 config) {
        int i17;
        boolean z17;
        int i18;
        su2.h hVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        android.view.Window window = activity.getWindow();
        android.view.View decorView = window != null ? window.getDecorView() : null;
        android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
        if (viewGroup == null) {
            return null;
        }
        android.view.LayoutInflater b17 = com.p314xaae8f345.mm.ui.id.b(activity);
        android.view.View inflate = b17.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570622ee5, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        if (textView != null) {
            textView.setText(config.f213748a);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.h9o);
        if (imageView != null) {
            boolean C = com.p314xaae8f345.mm.ui.bk.C();
            int ordinal = config.f213749b.ordinal();
            if (ordinal == 0) {
                hVar = C ? su2.h.f494278h : su2.h.f494277g;
            } else {
                if (ordinal != 1) {
                    throw new jz5.j();
                }
                hVar = C ? su2.h.f494280m : su2.h.f494279i;
            }
            p3325xe03a0797.p3326xc267989b.l.d(v65.m.a(imageView), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.k8(hVar, imageView, null), 3, null);
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.b09);
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            int ordinal2 = config.f213750c.ordinal();
            if (ordinal2 == 0) {
                i18 = com.p314xaae8f345.mm.R.C30864xbddafb2a.f570621ee4;
            } else {
                if (ordinal2 != 1) {
                    throw new jz5.j();
                }
                i18 = com.p314xaae8f345.mm.R.C30864xbddafb2a.f570620ee3;
            }
            viewGroup2.addView(b17.inflate(i18, viewGroup2, false));
        }
        float dimension = activity.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f562028ap3);
        gx2.a aVar = new gx2.a();
        aVar.f358870c = dimension;
        aVar.f358872e = new hx2.c(inflate);
        aVar.f358871d = new hx2.g(activity, 0, 0, 0, false, false, 62, null);
        aVar.f358873f = new hx2.b(activity, true);
        gx2.q b18 = aVar.b(viewGroup);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.c_x);
        if (textView2 != null) {
            textView2.setText(config.f213751d);
            textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.l8(config, b18));
            if (config.f213756i.length() > 0) {
                hc2.v0.e(textView2, config.f213756i, 8, 0, false, false, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.m8(config), 60, null);
            }
        }
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.b5w);
        if (textView3 != null) {
            textView3.setText(config.f213752e);
            textView3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.n8(config, b18));
            if (config.f213757j.length() > 0) {
                hc2.v0.e(textView3, config.f213757j, 8, 0, false, false, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.o8(config), 60, null);
            }
        }
        if (config.f213758k.length() > 0) {
            z17 = false;
            i17 = 1;
            hc2.v0.e(inflate, config.f213758k, 32, 0, false, false, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p8(config), 60, null);
        } else {
            i17 = 1;
            z17 = false;
        }
        b18.m132480x7ba98ee6(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.q8(config));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.m(b18, z17, i17, null);
        return b18;
    }

    public final gx2.q d(android.app.Activity activity, java.lang.String authorFinderUsername) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authorFinderUsername, "authorFinderUsername");
        java.lang.String string = activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p3x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.i8 i8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.i8.f213826d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.d8 d8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.d8.f213414e;
        java.lang.String string2 = activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575329p40);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        java.lang.String string3 = activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p3z);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        return e(activity, "follow", new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.h8(string, i8Var, d8Var, string2, string3, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.r8(activity), null, null, "profile_set_entrance_open", "profile_set_entrance_unopen", "profile_set_entrance_halfscreen", kz5.c1.k(new jz5.l("author_finder_username", authorFinderUsername), new jz5.l("action_type", 1)), 192, null));
    }

    public final gx2.q e(android.app.Activity activity, java.lang.String scene, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.h8 config) {
        android.app.Activity activity2 = activity;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Oe).mo141623x754a37bb()).r()).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderEntranceDialog", "showWithRateLimit: switch off, skip. scene=".concat(scene));
            return null;
        }
        int i17 = 0;
        if (!((c01.z1.j() & 34359738368L) != 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderEntranceDialog", "showWithRateLimit: finder entry already opened, skip. scene=".concat(scene));
            return null;
        }
        i95.m c18 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        dq.b bVar = ((cq.k) c18).f302759g;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) bVar.f323820d).mo141623x754a37bb();
        boolean i18 = o4Var != null ? o4Var.i("KEY_FINDER_OPEN_ENTRANCE_DIALOG_SHOWN", false) : false;
        boolean z17 = !i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMMKVManager", "canShowOpenFinderEntranceDialog: shown=" + i18 + ", ok=" + z17);
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderEntranceDialog", "showWithRateLimit: rate limited, skip. scene=".concat(scene));
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = activity2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        java.lang.Integer a17 = a(nyVar != null ? nyVar.V6().m75939xb282bd08(5) : 0);
        if (a17 != null) {
            i17 = a17.intValue();
        } else {
            android.content.Intent intent = activity.getIntent();
            java.lang.Integer a18 = a(intent != null ? intent.getIntExtra("KEY_OPEN_FINDER_ENTRANCE_REF_COMMENT_SCENE", 0) : 0);
            if (a18 != null) {
                i17 = a18.intValue();
            }
        }
        java.util.Map n17 = kz5.c1.n(config.f213759l, new jz5.l("profile_screen_type", java.lang.Integer.valueOf(i17)));
        java.lang.CharSequence title = config.f213748a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.i8 imageStyle = config.f213749b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageStyle, "imageStyle");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.d8 buttonStyle = config.f213750c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buttonStyle, "buttonStyle");
        java.lang.CharSequence confirmText = config.f213751d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(confirmText, "confirmText");
        java.lang.CharSequence cancelText = config.f213752e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cancelText, "cancelText");
        yz5.l onConfirm = config.f213753f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onConfirm, "onConfirm");
        yz5.a onCancel = config.f213754g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onCancel, "onCancel");
        yz5.a onDismiss = config.f213755h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onDismiss, "onDismiss");
        java.lang.String reportConfirmKey = config.f213756i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportConfirmKey, "reportConfirmKey");
        java.lang.String reportCancelKey = config.f213757j;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportCancelKey, "reportCancelKey");
        java.lang.String reportPopupKey = config.f213758k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportPopupKey, "reportPopupKey");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.h8 h8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.h8(title, imageStyle, buttonStyle, confirmText, cancelText, onConfirm, onCancel, onDismiss, reportConfirmKey, reportCancelKey, reportPopupKey, n17);
        if (lk5.s.b(activity)) {
            com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = activity2 instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 ? (com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) activity2 : null;
            activity2 = abstractActivityC22579xbed01a37 != null ? abstractActivityC22579xbed01a37.m81193x1252e2cf() : null;
        }
        if (activity2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderEntranceDialog", "showWithRateLimit, hostActivity not found");
            return null;
        }
        gx2.q c19 = c(activity2, h8Var);
        if (c19 == null) {
            return null;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) bVar.f323820d).mo141623x754a37bb();
        if (o4Var2 != null && o4Var2.T("KEY_FINDER_OPEN_ENTRANCE_DIALOG_SHOWN", java.lang.Boolean.TRUE)) {
            if (o4Var2.U()) {
                java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = o4Var2.f274434g;
                readLock.lock();
                o4Var2.c(o4Var2.f274432e);
                o4Var2.f274431d.m84090xb2963e16("KEY_FINDER_OPEN_ENTRANCE_DIALOG_SHOWN", true, 604800);
                readLock.unlock();
            } else {
                o4Var2.f274431d.m84090xb2963e16("KEY_FINDER_OPEN_ENTRANCE_DIALOG_SHOWN", true, 604800);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMMKVManager", "markOpenFinderEntranceDialogShown (auto-expire in 604800s)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderEntranceDialog", "showWithRateLimit: shown. scene=".concat(scene));
        return c19;
    }
}
