package id2;

/* loaded from: classes.dex */
public final class y4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f372425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.f5 f372426e;

    public y4(android.view.View view, id2.f5 f5Var) {
        this.f372425d = view;
        this.f372426e = f5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveRemindRestrictConsumeUIC$onViewCreated$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        android.content.Context context = this.f372425d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context;
        android.content.Intent m158359x1e885992 = this.f372426e.m158359x1e885992();
        ((c61.p2) ybVar).getClass();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).getClass();
        if (m158359x1e885992 == null) {
            m158359x1e885992 = new android.content.Intent();
        }
        m158359x1e885992.setClass(activity, (java.lang.Class) ((jz5.n) jz2.x0.f384310x).mo141623x754a37bb());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(0);
        arrayList2.add(m158359x1e885992);
        java.util.Collections.reverse(arrayList2);
        yj0.a.k(activity, arrayList2.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLiveRemindConsumeWecoinUI", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveRemindRestrictConsumeUIC$onViewCreated$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
