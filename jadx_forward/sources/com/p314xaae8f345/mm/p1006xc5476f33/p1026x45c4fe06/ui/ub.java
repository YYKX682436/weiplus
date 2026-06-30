package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes5.dex */
public final class ub implements android.view.View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12693xccd93dc7 f171792a;

    public ub(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12693xccd93dc7 activityC12693xccd93dc7) {
        this.f171792a = activityC12693xccd93dc7;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i17) {
        if ((i17 & 4) == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12693xccd93dc7 activityC12693xccd93dc7 = this.f171792a;
            android.view.View decorView = activityC12693xccd93dc7.getWindow().getDecorView();
            activityC12693xccd93dc7.getClass();
            decorView.setSystemUiVisibility(1280);
        }
    }
}
