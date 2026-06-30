package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f289810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int[] f289811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21374x812c2fd3.FitSystemWindowLayoutView f289812f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f289813g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 f289814h;

    public z(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8, android.view.View view, int[] iArr, com.p314xaae8f345.mm.ui.C21374x812c2fd3.FitSystemWindowLayoutView fitSystemWindowLayoutView, android.view.ViewGroup viewGroup) {
        this.f289814h = activityC22359x66709fa8;
        this.f289810d = view;
        this.f289811e = iArr;
        this.f289812f = fitSystemWindowLayoutView;
        this.f289813g = viewGroup;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f289810d;
        int[] iArr = this.f289811e;
        view.getLocationInWindow(iArr);
        int i17 = iArr[1];
        com.p314xaae8f345.mm.ui.C21374x812c2fd3.FitSystemWindowLayoutView fitSystemWindowLayoutView = this.f289812f;
        if (i17 > 0) {
            this.f289814h.V6(fitSystemWindowLayoutView, i17, new android.graphics.Rect(0, i17, 0, 0), this.f289813g);
        } else if (fp.h.c(20)) {
            fitSystemWindowLayoutView.setOnApplyWindowInsetsListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.y(this));
        }
    }
}
