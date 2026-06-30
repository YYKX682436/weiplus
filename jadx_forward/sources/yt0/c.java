package yt0;

/* loaded from: classes5.dex */
public interface c {
    static /* synthetic */ void Q5(yt0.c cVar, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k kVar, java.util.Map map, boolean z17, zw0.b bVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openPanel");
        }
        if ((i17 & 2) != 0) {
            map = null;
        }
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        if ((i17 & 8) != 0) {
            bVar = zw0.b.f558084e;
        }
        cVar.N0(kVar, map, z17, bVar);
    }

    static void V(yt0.c cVar, java.lang.String moduleName, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markStartLoading");
        }
        java.lang.String str3 = (i18 & 2) != 0 ? "" : str;
        java.lang.String str4 = (i18 & 4) != 0 ? "" : str2;
        int i19 = (i18 & 8) != 0 ? -1 : i17;
        cVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleName, "moduleName");
        i95.m c17 = i95.n0.c(w40.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.z(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a, moduleName, str3, str4, i19, 0L, 16, null);
    }

    static /* synthetic */ java.lang.Object o(yt0.c cVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showStateLoadingDialog");
        }
        if ((i17 & 1) != 0) {
            str = null;
        }
        return cVar.A6(str, interfaceC29045xdcb5ca57);
    }

    void A2();

    boolean A4();

    java.lang.Object A6(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57);

    default void C6() {
    }

    java.lang.Object E4(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57);

    android.util.SizeF J1();

    default void L(java.lang.String moduleName, java.lang.String str, java.lang.String str2, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleName, "moduleName");
        i95.m c17 = i95.n0.c(w40.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((qs2.q) ((w40.e) c17)).rj(moduleName, str, str2, i17);
    }

    void N0(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k kVar, java.util.Map map, boolean z17, zw0.b bVar);

    java.util.List N5();

    default boolean O4(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!h2()) {
            Z2(false);
            return false;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(context);
        i0Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.lle);
        i0Var.f(com.p314xaae8f345.mm.R.C30867xcad56011.lkr);
        int color = j65.q.a(context).getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.acu, null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
        aVar.W = color;
        aVar.E = new yt0.a(this);
        i0Var.e(com.p314xaae8f345.mm.R.C30867xcad56011.apj);
        i0Var.h();
        return true;
    }

    default void Y1(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        i95.m c17 = i95.n0.c(m40.k0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        i95.m c18 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = ((cq.k) c18).f302759g.f323818b;
        boolean i17 = o4Var != null ? o4Var.i("KEY_FINDER_HAS_SHOW_SAVE_EDITED_MEDIA_TIPS", false) : false;
        if (!h2() || i17) {
            A2();
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(activity, 2, 0, false, false);
        z2Var.y(activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
        z2Var.F = new yt0.b(z2Var, this);
        z2Var.x(1);
        android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ejb, (android.view.ViewGroup) null);
        z2Var.j(inflate);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.obc);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.b(textView);
        }
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o_w);
        java.lang.String string = activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p6p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(string);
        android.graphics.drawable.Drawable e17 = com.p314xaae8f345.mm.ui.uk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.raw.f80836xa9233cb2, textView2.getCurrentTextColor());
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561224cq);
        e17.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        int L = r26.n0.L(spannableStringBuilder, "#", 0, false, 6, null);
        if (L >= 0) {
            spannableStringBuilder.setSpan(new al5.v(e17, 2), L, L + 1, 17);
        }
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o_w);
        if (textView3 != null) {
            textView3.setText(new android.text.SpannableString(spannableStringBuilder));
        }
        z2Var.C();
        i95.m c19 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = ((cq.k) c19).f302759g.f323818b;
        if (o4Var2 != null) {
            o4Var2.G("KEY_FINDER_HAS_SHOW_SAVE_EDITED_MEDIA_TIPS", true);
        }
    }

    void Z2(boolean z17);

    default bu0.c f1(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        java.lang.String string;
        byte[] byteArray;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        if (z17 && c16997xb0aa383a == null) {
            return new bu0.c(configProvider.M.getString("ShootComposingUI.KEY_ORIGIN_MUSIC_ID"), configProvider.M.getByteArray("ShootComposingUI.KEY_ORIGIN_MUSIC_INFO"), java.lang.Integer.valueOf(configProvider.M.getInt("ShootComposingUI.KEY_MEDIA_EXTRA_MUSIC_SOURCE")), configProvider.M.getByteArray("ShootComposingUI.MEDIA_EXTRA_MUSIC"));
        }
        if (c16997xb0aa383a == null || !c16997xb0aa383a.f237255s) {
            if (c16997xb0aa383a == null || c16997xb0aa383a.f237255s) {
                return null;
            }
            return new bu0.c(null, null, java.lang.Integer.valueOf(c16997xb0aa383a.f237252p), c16997xb0aa383a.f237243d.mo14344x5f01b1f6());
        }
        android.os.Bundle bundle = configProvider.M;
        if (bundle == null || (string = bundle.getString("KEY_FINDER_POST_ORIGIN_MUSIC_ID")) == null) {
            android.os.Bundle bundle2 = configProvider.M;
            string = bundle2 != null ? bundle2.getString("KEY_ORIGIN_MUSIC_ID") : null;
        }
        android.os.Bundle bundle3 = configProvider.M;
        if (bundle3 == null || (byteArray = bundle3.getByteArray("KEY_FINDER_POST_ORIGIN_MUSIC_INFO")) == null) {
            android.os.Bundle bundle4 = configProvider.M;
            byteArray = bundle4 != null ? bundle4.getByteArray("KEY_ORIGIN_MUSIC_INFO") : null;
        }
        return new bu0.c(string, byteArray, null, null);
    }

    yw0.n f2();

    boolean h2();

    void j();

    com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.uic.C10955x675e70c1 l2();

    nv0.d v6();
}
