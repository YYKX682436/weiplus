package dn2;

/* loaded from: classes.dex */
public final class h0 implements dn2.e {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f323450a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f323451b;

    @Override // dn2.e
    public java.lang.Integer a() {
        return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.b1u);
    }

    @Override // dn2.e
    public android.view.View c(android.view.View rootView, dk2.zf liveMsg, cn2.p0 widget) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveMsg, "liveMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.f566107er2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f323450a = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.b1u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f323451b = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.reo);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("show MMFinder_LiveAppMsg_Type_LOCAL_SELF_ENTER ");
        java.lang.Object D = liveMsg.D();
        if (D == null) {
            D = "";
        }
        sb6.append(pm0.b0.g(D));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveSelfEnterBulletItem", sb6.toString());
        java.lang.Object D2 = liveMsg.D();
        r45.vw1 vw1Var = D2 instanceof r45.vw1 ? (r45.vw1) D2 : null;
        if (vw1Var != null) {
            if (vw1Var.m75939xb282bd08(0) == 5) {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).Cj(ml2.g5.f409032z, 1);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveSelfEnterBulletItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveSelfEnterBulletItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view = this.f323450a;
                if (view == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContent");
                    throw null;
                }
                view.setOnClickListener(dn2.f0.f323442d);
                android.view.View view2 = this.f323450a;
                if (view2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContent");
                    throw null;
                }
                view2.setBackground(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.d3p));
            } else {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).Cj(ml2.g5.f409032z, 2);
                android.view.View view3 = this.f323450a;
                if (view3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContent");
                    throw null;
                }
                view3.setOnClickListener(dn2.g0.f323444d);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveSelfEnterBulletItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveSelfEnterBulletItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = this.f323450a;
                if (view4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContent");
                    throw null;
                }
                view4.setBackground(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a1k));
            }
            android.widget.TextView textView = this.f323451b;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
                throw null;
            }
            textView.setText(vw1Var.m75945x2fec8307(1));
        }
        android.widget.TextView textView2 = this.f323451b;
        if (textView2 != null) {
            textView2.setTextColor(rootView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
            return rootView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
        throw null;
    }

    @Override // dn2.e
    /* renamed from: getLayoutId */
    public int mo125815x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dqy;
    }
}
