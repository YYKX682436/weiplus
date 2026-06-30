package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes12.dex */
public class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13592x95a8d706 f182231d;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13592x95a8d706 activityC13592x95a8d706) {
        this.f182231d = activityC13592x95a8d706;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/detail/FavoriteSightDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (iq.b.C(view.getContext()) || iq.b.v(view.getContext()) || iq.b.e(view.getContext())) {
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteSightDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13592x95a8d706 activityC13592x95a8d706 = this.f182231d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteSightDetailUI", "click item favid %d, localid %d, itemstatus %d", java.lang.Integer.valueOf(activityC13592x95a8d706.f182174r.f67643xc8a07680), java.lang.Long.valueOf(activityC13592x95a8d706.f182174r.f67645x88be67a1), java.lang.Integer.valueOf(activityC13592x95a8d706.f182174r.f67644x3059914a));
        if (!activityC13592x95a8d706.f182174r.I0()) {
            o72.r2 r2Var = activityC13592x95a8d706.f182174r;
            if (r2Var.f67644x3059914a == 8) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC13592x95a8d706.f182175s.f456967s)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13592x95a8d706.Z6(activityC13592x95a8d706, false, view.getContext());
                    yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteSightDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            } else if (r2Var.J0() || activityC13592x95a8d706.f182174r.Q0()) {
                if (activityC13592x95a8d706.f182171o.getVisibility() == 8) {
                    activityC13592x95a8d706.b7(false);
                }
                yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteSightDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        } else if (o72.x1.i0(activityC13592x95a8d706.f182175s)) {
            o72.o3.b(o72.k3.EnterFullScreen, activityC13592x95a8d706.f182174r);
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13592x95a8d706.Z6(activityC13592x95a8d706, true, view.getContext());
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteSightDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC13592x95a8d706.f182175s.f456967s)) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13592x95a8d706.Z6(activityC13592x95a8d706, false, view.getContext());
                yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteSightDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteSightDetailUI", "? info is done, source file not exist, cdn data url is not null");
        }
        if (activityC13592x95a8d706.f182174r.P0()) {
            o72.x1.D0(activityC13592x95a8d706.f182174r, true);
        } else {
            o72.x1.C0(activityC13592x95a8d706.f182174r, true);
        }
        activityC13592x95a8d706.b7(false);
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteSightDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
