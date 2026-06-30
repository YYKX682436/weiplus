package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

/* loaded from: classes12.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f178153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 f178154e;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1, android.content.Context context) {
        this.f178154e = abstractActivityC13156x6363e8e1;
        this.f178153d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        int B = nx1.d.q().B();
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1 = this.f178154e;
        int childCount = abstractActivityC13156x6363e8e1.f178030d.getChildCount();
        if (B == childCount) {
            float f17 = 0.0f;
            for (int i17 = childCount - 1; i17 >= 0; i17--) {
                android.view.View childAt = abstractActivityC13156x6363e8e1.f178030d.getChildAt(i17);
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                float translationY = childAt.getTranslationY();
                if (f17 <= childAt.getBottom() + translationY) {
                    f17 = childAt.getBottom() + translationY;
                }
            }
            if (f17 < com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.f(this.f178153d)[1] && f17 > 0.0f) {
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) abstractActivityC13156x6363e8e1.f178034h.getLayoutParams();
                layoutParams.height = (int) f17;
                abstractActivityC13156x6363e8e1.f178034h.setLayoutParams(layoutParams);
            }
        }
        abstractActivityC13156x6363e8e1.f178034h.setVisibility(0);
        nx1.j jVar = abstractActivityC13156x6363e8e1.f178035i;
        if (jVar != null) {
            int[] iArr = {0, 0};
            android.view.View view = jVar.f422826b;
            view.getLocationOnScreen(iArr);
            jVar.f422825a.showAtLocation(view, 49, 0, iArr[1] + 50);
        }
    }
}
