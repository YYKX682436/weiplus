package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes12.dex */
public class k2 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13594x1487ddc7 f182284d;

    public k2(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13594x1487ddc7 activityC13594x1487ddc7) {
        this.f182284d = activityC13594x1487ddc7;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13594x1487ddc7 activityC13594x1487ddc7 = this.f182284d;
        activityC13594x1487ddc7.f182197o.getViewTreeObserver().removeOnPreDrawListener(this);
        activityC13594x1487ddc7.f182205w.c(activityC13594x1487ddc7.f182197o, activityC13594x1487ddc7.f182196n, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.j2(this));
        return true;
    }
}
