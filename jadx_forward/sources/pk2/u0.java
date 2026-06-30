package pk2;

/* loaded from: classes3.dex */
public final class u0 extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437808i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f437809j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437808i = "AnchorDesignedGiftOption";
        this.f437809j = n() ? "anchorlive.more.morefunction.designedgift" : "startlive.more.morefunction.designedgift";
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437809j;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        ya2.b2 b17;
        boolean n17 = n();
        pk2.o9 o9Var = this.f445960a;
        if (n17) {
            return ((mm2.c1) o9Var.c(mm2.c1.class)).C;
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        pk2.j9 j9Var = o9Var.f437617g;
        return pm0.v.z((int) ((j9Var == null || (b17 = j9Var.b()) == null) ? 0L : b17.f69326x798040b1), 8388608);
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 bottomSheet, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        android.view.View view = bottomSheet.f213492f;
        boolean m76 = n() ? ((mm2.c1) o9Var.c(mm2.c1.class)).m7() : zl2.r4.f555483a.U1(o9Var.f437607b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.t38);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o9Var.f437611d;
            java.lang.String string = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.owm);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String string2 = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.owl, string);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            android.text.SpannableString spannableString = new android.text.SpannableString(string2);
            int L = r26.n0.L(string2, string, 0, false, 6, null);
            if (L >= 0 && string.length() + L <= string2.length()) {
                spannableString.setSpan(new pk2.q0(this, abstractActivityC21394xb3d2c0cf), L, string.length() + L, 33);
            }
            textView.setText(spannableString);
            textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        }
        boolean w17 = w(o9Var);
        if (!m76 || !o()) {
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.u98);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorDesignedGiftOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AnchorDesignedGiftOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.u98);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorDesignedGiftOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/moreaction/AnchorDesignedGiftOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc g17 = o9Var.g(view, com.p314xaae8f345.mm.R.id.vbp, w17);
        p3325xe03a0797.p3326xc267989b.y0 j17 = j();
        if (j17 != null) {
            g17.g(j17, new pk2.o0(this, o9Var), new pk2.p0(this, g17, o9Var, null));
        }
    }

    @Override // qk2.d
    public java.lang.Integer u() {
        return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.t3h);
    }

    public final boolean w(pk2.o9 o9Var) {
        long j17;
        r45.kz0 kz0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        if (n()) {
            m92.b I1 = g92.a.I1(g92.b.f351302e, false, 1, null);
            j17 = (I1 == null || (kz0Var = I1.f68702x723e3d5f) == null) ? 0L : kz0Var.m75942xfb822ef2(0);
        } else {
            j17 = ((mm2.c1) o9Var.c(mm2.c1.class)).f410399q;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "isDesignedGiftSwitchOn anchorStatusFlag=" + j17 + ", isAnchorLiving=" + n() + ", flag=4294967296");
        return pm0.v.A(j17, 4294967296L);
    }
}
