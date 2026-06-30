package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class mb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f211048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15048xbc5a5f5e f211049e;

    public mb(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15048xbc5a5f5e activityC15048xbc5a5f5e) {
        this.f211048d = c1163xf1deaba4;
        this.f211049e = activityC15048xbc5a5f5e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View contentView;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f211048d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 q07 = c1163xf1deaba4.q0(c1162x665295de.w(), false);
            in5.s0 s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
            if (s0Var == null) {
                return;
            }
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rm rmVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rm(context, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15048xbc5a5f5e activityC15048xbc5a5f5e = this.f211049e;
            rmVar.setContentView(com.p314xaae8f345.mm.ui.id.b(activityC15048xbc5a5f5e).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570570b41, (android.view.ViewGroup) null, false));
            android.widget.TextView textView = (android.widget.TextView) rmVar.getContentView().findViewById(com.p314xaae8f345.mm.R.id.o5r);
            if (textView != null) {
                i95.m c17 = i95.n0.c(zy2.s6.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                java.lang.String str = (java.lang.String) ((jz5.n) activityC15048xbc5a5f5e.F).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "<get-thankTipsContent>(...)");
                textView.setText(zy2.s6.l6((zy2.s6) c17, str, (int) textView.getTextSize(), true, null, 0, false, null, 120, null));
                rmVar.f214507m = 5000L;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.f566019ee3);
                if (viewGroup != null) {
                    int childCount = viewGroup.getChildCount();
                    for (int i17 = 0; i17 < childCount; i17++) {
                        android.view.View childAt = viewGroup.getChildAt(i17);
                        if (childAt.getVisibility() == 0) {
                            if ((childAt.getAlpha() == 1.0f) && childAt.getId() != com.p314xaae8f345.mm.R.id.gbz) {
                                arrayList.add(childAt);
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                                arrayList2.add(java.lang.Float.valueOf(0.3f));
                                java.util.Collections.reverse(arrayList2);
                                yj0.a.d(childAt, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderMsgFeedDetailUI$showThankTips$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                childAt.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                                yj0.a.f(childAt, "com/tencent/mm/plugin/finder/ui/FinderMsgFeedDetailUI$showThankTips$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            }
                        }
                    }
                }
                rmVar.setOnDismissListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.lb(arrayList));
                android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.a_4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
                if (!rmVar.f214504j) {
                    rmVar.getContentView().measure(0, 0);
                    rmVar.f214504j = true;
                }
                int measuredWidth = rmVar.getContentView().getMeasuredWidth();
                int measuredHeight = rmVar.getContentView().getMeasuredHeight();
                p17.getHeight();
                int[] iArr = new int[2];
                p17.getLocationInWindow(iArr);
                com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(rmVar.f214498d);
                int i18 = (iArr[1] - rmVar.f214505k) - measuredHeight;
                rmVar.setAnimationStyle(com.p314xaae8f345.mm.R.C30868x68b1db1.f576143rl);
                rmVar.showAtLocation(p17, 0, 0, i18);
                if (rmVar.f214507m > 0 && (contentView = rmVar.getContentView()) != null) {
                    contentView.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qm(rmVar.f214509o), rmVar.f214507m);
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(java.lang.String.format("showWithTop: popX:%s, popY:%s, sw:%s, sh:%s, pw:%s, ph:%s", java.util.Arrays.copyOf(new java.lang.Object[]{0, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(a17.f278668a), java.lang.Integer.valueOf(a17.f278669b), java.lang.Integer.valueOf(measuredWidth), java.lang.Integer.valueOf(measuredHeight)}, 6)), "format(...)");
            }
        }
    }
}
