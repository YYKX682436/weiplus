package qs3;

/* loaded from: classes13.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public int f447896a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f447897b;

    /* renamed from: c, reason: collision with root package name */
    public final qs3.m0 f447898c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16953xeaa414a7 f447899d;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16953xeaa414a7 c16953xeaa414a7) {
        this.f447899d = c16953xeaa414a7;
        android.content.Context context = c16953xeaa414a7.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f447897b = context.getResources().getDisplayMetrics().densityDpi <= 240;
        this.f447898c = new qs3.m0(this);
    }

    public final android.view.animation.Animation a() {
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this.f447899d.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f81541do);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(loadAnimation, "loadAnimation(...)");
        return loadAnimation;
    }

    public final void b(int i17, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        qs3.m0 m0Var = this.f447898c;
        android.os.Message mo50288x733c63a2 = m0Var.mo50288x733c63a2();
        java.lang.Object tag = view.getTag(this.f447899d.f236582u);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        mo50288x733c63a2.what = num != null ? num.intValue() : -1;
        mo50288x733c63a2.obj = view;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/radar/ui/RadarViewController$AvatarAnimator", "show", "(ILandroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/radar/ui/RadarViewController$AvatarAnimator", "show", "(ILandroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m0Var.mo50311x7ab51103(mo50288x733c63a2, (i17 + 1) * 500);
    }
}
