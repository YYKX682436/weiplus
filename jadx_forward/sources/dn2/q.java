package dn2;

/* loaded from: classes3.dex */
public final class q implements dn2.e {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f323494a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f323495b;

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
        this.f323494a = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.b1u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f323495b = textView;
        textView.setTextColor(rootView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
        android.view.View view = this.f323494a;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContent");
            throw null;
        }
        view.setBackground(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a1k));
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f565048b23);
        if (findViewById3 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveFollowBulletItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveFollowBulletItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        android.content.Context context = rootView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.widget.TextView textView2 = this.f323495b;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
            throw null;
        }
        android.text.TextPaint paint = textView2.getPaint();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(paint, "getPaint(...)");
        java.lang.String k17 = liveMsg.k();
        if (k17 == null) {
            k17 = "";
        }
        java.lang.String obj = c61.yb.nf(ybVar, context, paint, k17, 0, 8, null).toString();
        java.lang.Object D = liveMsg.D();
        if (D != null && (D instanceof r45.bj1)) {
            java.lang.String str = obj + ' ' + ((r45.bj1) D).m75945x2fec8307(1);
            android.widget.TextView textView3 = this.f323495b;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
                throw null;
            }
            textView3.setText(str);
            cn2.l.f125101a.c(2, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveFollowBulletItem", "show bullet: " + str);
        }
        return rootView;
    }

    @Override // dn2.e
    /* renamed from: getLayoutId */
    public int mo125815x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dex;
    }
}
