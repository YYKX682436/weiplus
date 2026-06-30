package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class k40 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f200342a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f200343b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f200344c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f200345d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f200346e;

    /* renamed from: f, reason: collision with root package name */
    public android.animation.ValueAnimator f200347f;

    public k40(android.view.ViewGroup root) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        this.f200342a = root;
        this.f200343b = "FinderLiveWarnningCountWidget";
    }

    public final void a(int i17) {
        if (!(1 <= i17 && i17 < 4)) {
            b();
            return;
        }
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d8z);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        if (this.f200344c == null) {
            android.view.ViewGroup viewGroup = this.f200342a;
            android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b1w, viewGroup, false);
            this.f200344c = inflate;
            this.f200345d = inflate != null ? (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cjv) : null;
            android.view.View view = this.f200344c;
            this.f200346e = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f568112lq3) : null;
            android.view.View view2 = this.f200344c;
            if (view2 != null) {
                view2.setBackgroundColor(-16777216);
            }
            if (viewGroup.indexOfChild(this.f200344c) == -1) {
                viewGroup.addView(this.f200344c);
            }
        }
        android.view.View view3 = this.f200344c;
        if (!(view3 != null && view3.getVisibility() == 0)) {
            android.animation.ValueAnimator valueAnimator = this.f200347f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 0.6f);
            ofFloat.setDuration(i17 * 1000);
            ofFloat.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i40(this));
            ofFloat.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.j40(this));
            this.f200347f = ofFloat;
            ofFloat.start();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start alpha anim:duration$");
            android.animation.ValueAnimator valueAnimator2 = this.f200347f;
            sb6.append(valueAnimator2 != null ? java.lang.Long.valueOf(valueAnimator2.getDuration()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f200343b, sb6.toString());
        }
        android.view.View view4 = this.f200344c;
        if (view4 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveWarnningCountWidget", "show", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveWarnningCountWidget", "show", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = this.f200345d;
        if (textView != null) {
            textView.setText(java.lang.String.valueOf(i17));
        }
        android.widget.TextView textView2 = this.f200346e;
        if (textView2 == null) {
            return;
        }
        textView2.setText(string);
    }

    public final void b() {
        android.view.View view = this.f200344c;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveWarnningCountWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveWarnningCountWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.animation.ValueAnimator valueAnimator = this.f200347f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
