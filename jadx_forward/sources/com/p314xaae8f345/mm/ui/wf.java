package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class wf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int[] f292764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21374x812c2fd3.FitSystemWindowLayoutView f292765e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f292766f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21427xe5bb8a3 f292767g;

    public wf(com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3, int[] iArr, com.p314xaae8f345.mm.ui.C21374x812c2fd3.FitSystemWindowLayoutView fitSystemWindowLayoutView, android.view.ViewGroup viewGroup) {
        this.f292767g = c21427xe5bb8a3;
        this.f292764d = iArr;
        this.f292765e = fitSystemWindowLayoutView;
        this.f292766f = viewGroup;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3 = this.f292767g;
        c21427xe5bb8a3.f278547a.mo2533x106ab264().j().getLocationInWindow(this.f292764d);
        int j17 = c21427xe5bb8a3.j();
        com.p314xaae8f345.mm.ui.C21374x812c2fd3.FitSystemWindowLayoutView fitSystemWindowLayoutView = this.f292765e;
        if (j17 <= 0) {
            if (fp.h.c(20)) {
                fitSystemWindowLayoutView.setOnApplyWindowInsetsListener(new com.p314xaae8f345.mm.ui.vf(this));
            }
        } else {
            android.graphics.Rect rect = new android.graphics.Rect(0, j17, 0, 0);
            ((com.p314xaae8f345.mm.ui.C21374x812c2fd3) c21427xe5bb8a3.f278548b).getClass();
            fitSystemWindowLayoutView.m78431x6229eb06(this.f292766f);
            fitSystemWindowLayoutView.fitSystemWindows(rect);
        }
    }
}
