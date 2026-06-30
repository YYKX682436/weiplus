package st2;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f493769a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14979x1ca33895 f493770b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f493771c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f493772d;

    public c(android.view.View rootView, if2.b controller) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.f493769a = rootView;
        this.f493770b = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14979x1ca33895) rootView.findViewById(com.p314xaae8f345.mm.R.id.uez);
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.rhd);
        this.f493771c = findViewById;
        new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(rootView.getContext(), 0, false);
        findViewById.setOnClickListener(new st2.a(this));
    }

    public static final void a(st2.c cVar) {
        android.view.View view = cVar.f493769a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveCouponCardListWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/FinderLiveCouponCardListWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
