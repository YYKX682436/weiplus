package lj2;

/* loaded from: classes3.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f400434a;

    /* renamed from: b, reason: collision with root package name */
    public final qf2.q3 f400435b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14313x19517c77 f400436c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f400437d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f400438e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f400439f;

    /* renamed from: g, reason: collision with root package name */
    public int f400440g;

    public o0(android.view.View root, qf2.q3 controller) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.f400434a = root;
        this.f400435b = controller;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14313x19517c77 c14313x19517c77 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14313x19517c77) root.findViewById(com.p314xaae8f345.mm.R.id.rmw);
        this.f400436c = c14313x19517c77;
        this.f400437d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) root.findViewById(com.p314xaae8f345.mm.R.id.kqr);
        this.f400438e = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.rzs);
        this.f400439f = root.findViewById(com.p314xaae8f345.mm.R.id.imn);
        c14313x19517c77.m57298x60aa2427(new lj2.j0(this));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(root, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayMicLinkWidget", "<init>", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/controller/mic/FinderLivePayMicController;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        root.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(root, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayMicLinkWidget", "<init>", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/controller/mic/FinderLivePayMicController;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.ViewGroup.LayoutParams layoutParams = c14313x19517c77.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = c14313x19517c77.defaultTranslationY;
    }

    public final void a(int i17, int i18) {
        this.f400440g = i18;
        android.widget.TextView textView = this.f400438e;
        android.view.View view = this.f400434a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f400437d;
        if (i18 != 2) {
            android.view.View view2 = this.f400439f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayMicLinkWidget", "changeToLoadingState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayMicLinkWidget", "changeToLoadingState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c22699x3dcdb352.setVisibility(8);
            textView.setText(view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mkf));
            return;
        }
        int i19 = i17 == 2 ? com.p314xaae8f345.mm.R.raw.f79942x9dbaf4ba : com.p314xaae8f345.mm.R.raw.f79653xc84c6d76;
        android.view.View view3 = this.f400439f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayMicLinkWidget", "changeToWaitingState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayMicLinkWidget", "changeToWaitingState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c22699x3dcdb352.setVisibility(0);
        c22699x3dcdb352.setImageResource(i19);
        textView.setText(view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dnt));
    }

    public final void b() {
        if (this.f400434a.getVisibility() == 0) {
            return;
        }
        pm0.v.X(new lj2.n0(this));
    }
}
