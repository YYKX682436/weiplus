package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes14.dex */
public final class k2 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16262x8382bfc0 f225963d;

    public k2(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16262x8382bfc0 activityC16262x8382bfc0) {
        this.f225963d = activityC16262x8382bfc0;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        int i39 = i27 - i18;
        int i47 = i38 - i29;
        if (i19 - i17 == i37 - i28 && i39 == i47) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16262x8382bfc0 activityC16262x8382bfc0 = this.f225963d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0 c16237x250976b0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0) activityC16262x8382bfc0.findViewById(com.p314xaae8f345.mm.R.id.gd9);
        if (c16237x250976b0 != null) {
            c16237x250976b0.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.j2(activityC16262x8382bfc0, c16237x250976b0));
        }
    }
}
