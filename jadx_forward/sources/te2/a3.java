package te2;

/* loaded from: classes14.dex */
public final class a3 implements te2.c2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f499389d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f499390e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f499391f;

    /* renamed from: g, reason: collision with root package name */
    public final te2.b2 f499392g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f499393h;

    /* renamed from: i, reason: collision with root package name */
    public final int f499394i;

    /* renamed from: m, reason: collision with root package name */
    public final int f499395m;

    /* renamed from: n, reason: collision with root package name */
    public final int f499396n;

    /* renamed from: o, reason: collision with root package name */
    public final int f499397o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f499398p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f499399q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f499400r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f499401s;

    /* renamed from: t, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f499402t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f499403u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.TextView f499404v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.TextView f499405w;

    /* renamed from: x, reason: collision with root package name */
    public final te2.n2 f499406x;

    /* renamed from: y, reason: collision with root package name */
    public int f499407y;

    public a3(android.view.View root, qo0.c statusMonitor, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, te2.b2 b2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f499389d = root;
        this.f499390e = statusMonitor;
        this.f499391f = activity;
        this.f499392g = b2Var;
        this.f499393h = "Finder.FinderLiveCastScreenViewCallback";
        this.f499394i = -1;
        this.f499395m = 1;
        this.f499396n = 2;
        this.f499397o = 3;
        this.f499398p = root.findViewById(com.p314xaae8f345.mm.R.id.f566124eu4);
        this.f499399q = root.findViewById(com.p314xaae8f345.mm.R.id.f566122eu2);
        this.f499400r = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.f566123eu3);
        this.f499401s = root.findViewById(com.p314xaae8f345.mm.R.id.f566120eu0);
        this.f499402t = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) root.findViewById(com.p314xaae8f345.mm.R.id.f566121eu1);
        this.f499403u = root.findViewById(com.p314xaae8f345.mm.R.id.etx);
        this.f499404v = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.etw);
        this.f499405w = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.etv);
        this.f499406x = new te2.n2(this);
        this.f499407y = -1;
    }

    public final int a() {
        return this.f499389d.getContext().getResources().getConfiguration().orientation == 2 ? 1 : 2;
    }

    public final void g(int i17) {
        gk2.e eVar;
        x91.h hVar;
        x91.c cVar;
        if (i17 != this.f499407y) {
            this.f499407y = i17;
            te2.b2 b2Var = this.f499392g;
            if (i17 == 0) {
                android.view.View view = this.f499398p;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = this.f499399q;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view3 = this.f499401s;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = this.f499403u;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (b2Var != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = ((te2.l2) b2Var).f499732o;
                    b4Var.d();
                    b4Var.c(0L, 3000L);
                    return;
                }
                return;
            }
            int i18 = this.f499395m;
            android.view.View view5 = this.f499389d;
            if (i17 == i18) {
                android.view.View view6 = this.f499398p;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view7 = this.f499399q;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view7, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view8 = this.f499401s;
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(view8, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view9 = this.f499403u;
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                arrayList8.add(8);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(view9, arrayList8.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(view9, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.text.SpannableString spannableString = new android.text.SpannableString(view5.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d8e));
                int L = r26.n0.L(spannableString, "，", 0, false, 6, null);
                if (L != -1 && L > 0 && L < spannableString.length() - 1) {
                    spannableString.setSpan(new te2.z2(), L + 1, spannableString.length(), 33);
                    android.widget.TextView textView = this.f499400r;
                    textView.setText(spannableString);
                    textView.setOnClickListener(new te2.y2(this));
                }
                ((ml2.r0) i95.n0.c(ml2.r0.class)).xj(ml2.n1.f409262n, a());
                return;
            }
            if (i17 == this.f499396n) {
                android.view.View view10 = this.f499398p;
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList9.add(8);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(view10, arrayList9.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view10.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(view10, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view11 = this.f499399q;
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                arrayList10.add(8);
                java.util.Collections.reverse(arrayList10);
                yj0.a.d(view11, arrayList10.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                yj0.a.f(view11, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view12 = this.f499401s;
                java.util.ArrayList arrayList11 = new java.util.ArrayList();
                arrayList11.add(0);
                java.util.Collections.reverse(arrayList11);
                yj0.a.d(view12, arrayList11.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view12.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                yj0.a.f(view12, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view13 = this.f499403u;
                java.util.ArrayList arrayList12 = new java.util.ArrayList();
                arrayList12.add(8);
                java.util.Collections.reverse(arrayList12);
                yj0.a.d(view13, arrayList12.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view13.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
                yj0.a.f(view13, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (i17 == this.f499397o) {
                android.view.View view14 = this.f499398p;
                java.util.ArrayList arrayList13 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList13.add(8);
                java.util.Collections.reverse(arrayList13);
                yj0.a.d(view14, arrayList13.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view14.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
                yj0.a.f(view14, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view15 = this.f499399q;
                java.util.ArrayList arrayList14 = new java.util.ArrayList();
                arrayList14.add(8);
                java.util.Collections.reverse(arrayList14);
                yj0.a.d(view15, arrayList14.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view15.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
                yj0.a.f(view15, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view16 = this.f499401s;
                java.util.ArrayList arrayList15 = new java.util.ArrayList();
                arrayList15.add(8);
                java.util.Collections.reverse(arrayList15);
                yj0.a.d(view16, arrayList15.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view16.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
                yj0.a.f(view16, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view17 = this.f499403u;
                java.util.ArrayList arrayList16 = new java.util.ArrayList();
                arrayList16.add(0);
                java.util.Collections.reverse(arrayList16);
                yj0.a.d(view17, arrayList16.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view17.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
                yj0.a.f(view17, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.content.res.Resources resources = view5.getContext().getResources();
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = (b2Var == null || (eVar = ((te2.l2) b2Var).f499724d) == null || (hVar = ((je2.i) eVar.a(je2.i.class)).f380768f) == null || (cVar = hVar.f534180a) == null) ? null : cVar.f534172g;
                this.f499404v.setText(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d8c, objArr));
            }
        }
    }

    @Override // fs2.c
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
        return this.f499391f;
    }
}
