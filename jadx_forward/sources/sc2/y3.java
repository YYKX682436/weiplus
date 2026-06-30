package sc2;

/* loaded from: classes2.dex */
public final class y3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ad2.h f487917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ad2.h f487918e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sc2.z3 f487919f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f487920g;

    public y3(ad2.h hVar, ad2.h hVar2, sc2.z3 z3Var, long j17) {
        this.f487917d = hVar;
        this.f487918e = hVar2;
        this.f487919f = z3Var;
        this.f487920g = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View findViewById;
        ad2.h hVar = this.f487917d;
        android.view.View view = hVar.f84676d;
        ad2.h hVar2 = this.f487918e;
        android.view.View view2 = hVar2.f84676d;
        sc2.z3 z3Var = this.f487919f;
        long j17 = this.f487920g;
        if (view == null || view2 == null) {
            return;
        }
        r45.wf6 wf6Var = hVar.f84682m;
        if (wf6Var != null && wf6Var.m75939xb282bd08(2) == 0) {
            r45.wf6 wf6Var2 = hVar2.f84682m;
            if (wf6Var2 != null && wf6Var2.m75939xb282bd08(2) == 5) {
                android.view.View view3 = hVar.f84676d;
                android.view.View view4 = hVar2.f84676d;
                if (view3 == null || view4 == null) {
                    return;
                }
                r45.wf6 wf6Var3 = hVar2.f84682m;
                z3Var.G(j17, wf6Var3 != null ? wf6Var3.m75939xb282bd08(2) : -1);
                android.view.View findViewById2 = view3.findViewById(com.p314xaae8f345.mm.R.id.h1u);
                if (findViewById2 == null || (findViewById = view4.findViewById(com.p314xaae8f345.mm.R.id.h1u)) == null) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver", "handleExpand", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver", "handleExpand", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver", "handleExpand", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                findViewById.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver", "handleExpand", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                findViewById.post(new sc2.w3(findViewById2, z3Var, findViewById, view4));
                return;
            }
        }
        hVar.g(200L, view, true, new sc2.x3(z3Var, j17, hVar2, view2));
    }
}
