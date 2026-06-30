package pk2;

/* loaded from: classes3.dex */
public final class q5 extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437725i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f437726j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437725i = "AssistantDesignedGiftOption";
        this.f437726j = "assistant.more.morefunction.designedgift";
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437726j;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        return ((mm2.c1) this.f445960a.c(mm2.c1.class)).C;
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 bottomSheet, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        android.view.View view = bottomSheet.f213492f;
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
                spannableString.setSpan(new pk2.o5(this, abstractActivityC21394xb3d2c0cf), L, string.length() + L, 33);
            }
            textView.setText(spannableString);
            textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        }
        boolean A = pm0.v.A(((mm2.c1) o9Var.c(mm2.c1.class)).f410399q, 4294967296L);
        if (!o()) {
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.u98);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AssistantDesignedGiftOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AssistantDesignedGiftOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.u98);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AssistantDesignedGiftOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/moreaction/AssistantDesignedGiftOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc g17 = o9Var.g(view, com.p314xaae8f345.mm.R.id.vbp, A);
        p3325xe03a0797.p3326xc267989b.y0 j17 = j();
        if (j17 != null) {
            g17.g(j17, new pk2.m5(this, o9Var), new pk2.n5(this, o9Var, null));
        }
    }

    @Override // qk2.d
    public java.lang.Integer u() {
        return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.t3h);
    }
}
