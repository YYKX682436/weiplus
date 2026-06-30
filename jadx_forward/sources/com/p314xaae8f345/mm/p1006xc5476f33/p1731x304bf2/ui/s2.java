package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes5.dex */
public class s2 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15954xd8d7563b f223286d;

    public s2(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15954xd8d7563b activityC15954xd8d7563b) {
        this.f223286d = activityC15954xd8d7563b;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15954xd8d7563b activityC15954xd8d7563b = this.f223286d;
        if (activityC15954xd8d7563b.f222283i.getLineCount() > 3) {
            activityC15954xd8d7563b.f222284m.setVisibility(0);
        } else {
            activityC15954xd8d7563b.f222284m.setVisibility(8);
        }
    }
}
