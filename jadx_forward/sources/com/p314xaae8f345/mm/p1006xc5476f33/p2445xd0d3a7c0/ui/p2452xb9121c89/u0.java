package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89;

/* loaded from: classes12.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f269810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 f269811e;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3, android.content.Context context) {
        this.f269811e = activityC19519x7af4daf3;
        this.f269810d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = this.f269811e;
        int D = activityC19519x7af4daf3.J1.D();
        int childCount = activityC19519x7af4daf3.f269681n.getChildCount();
        if (D == childCount) {
            float f17 = 0.0f;
            for (int i17 = childCount - 1; i17 >= 0; i17--) {
                android.view.View childAt = activityC19519x7af4daf3.f269681n.getChildAt(i17);
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                float translationY = childAt.getTranslationY();
                if (f17 <= childAt.getBottom() + translationY) {
                    f17 = childAt.getBottom() + translationY;
                }
            }
            if (f17 < com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.f(this.f269810d)[1] && f17 > 0.0f) {
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) activityC19519x7af4daf3.f269687r.getLayoutParams();
                layoutParams.height = (int) f17;
                activityC19519x7af4daf3.f269687r.setLayoutParams(layoutParams);
            }
        }
        activityC19519x7af4daf3.f269687r.setVisibility(0);
        mz4.a0 a0Var = activityC19519x7af4daf3.f269688s;
        if (a0Var != null) {
            int[] iArr = {0, 0};
            android.view.View view = a0Var.f414754b;
            view.getLocationOnScreen(iArr);
            a0Var.f414753a.showAtLocation(view, 49, 0, iArr[1] + 50);
        }
    }
}
