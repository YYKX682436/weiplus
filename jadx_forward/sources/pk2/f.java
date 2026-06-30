package pk2;

/* loaded from: classes3.dex */
public final class f extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437253i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437253i = "";
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437253i;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        boolean z17;
        zl2.r4 r4Var = zl2.r4.f555483a;
        gk2.e buContext = this.f445960a.f437607b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        if (((mm2.c1) buContext.a(mm2.c1.class)).a8()) {
            long j17 = ((mm2.c1) buContext.a(mm2.c1.class)).Q1;
            qs5.h[] hVarArr = qs5.h.f447966d;
            z17 = pm0.v.A(j17, 256);
        } else {
            z17 = pm0.v.z((int) gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC, 0L), 131072);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", "[isAiAssistantMasterEnabled] result = " + z17);
        return z17;
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 bottomSheet, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        android.view.View view = bottomSheet.f213492f;
        if (view == null) {
            return;
        }
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f567026u91);
        if (o()) {
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorAiAssistantOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AnchorAiAssistantOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
            w(o9Var, view, findViewById, com.p314xaae8f345.mm.R.id.vbg, com.p314xaae8f345.mm.R.id.vhc, 8589934592L, new pk2.a(view, this));
        } else if (findViewById != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorAiAssistantOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AnchorAiAssistantOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        boolean z17 = (((mm2.c1) o9Var.c(mm2.c1.class)).f410399q & 8589934592L) == 0;
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.f567027u92);
        if (!o() || !z17) {
            if (findViewById2 == null) {
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorAiAssistantOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/moreaction/AnchorAiAssistantOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (findViewById2 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorAiAssistantOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/moreaction/AnchorAiAssistantOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById2);
        w(o9Var, view, findViewById2, com.p314xaae8f345.mm.R.id.vbh, com.p314xaae8f345.mm.R.id.vhd, 536870912L, null);
    }

    public final void w(pk2.o9 o9Var, android.view.View view, android.view.View view2, int i17, int i18, long j17, yz5.l lVar) {
        java.lang.String str;
        java.lang.CharSequence text;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc g17 = o9Var.g(view, i17, (((mm2.c1) o9Var.c(mm2.c1.class)).f410399q & j17) == 0);
        p3325xe03a0797.p3326xc267989b.y0 j18 = j();
        if (j18 != null) {
            g17.g(j18, new pk2.b(o9Var, j17), new pk2.e(this, view, i18, view2, g17, o9Var, j17, lVar, null));
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(i18);
        if (textView == null || (text = textView.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) view.findViewById(i17);
        if (viewOnClickListenerC22631x1cc07cc8 == null) {
            return;
        }
        v(str, view2, viewOnClickListenerC22631x1cc07cc8);
    }
}
