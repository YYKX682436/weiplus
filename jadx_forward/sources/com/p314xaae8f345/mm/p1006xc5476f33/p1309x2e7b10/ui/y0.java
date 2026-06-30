package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes12.dex */
public class y0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13050xc93b9c8f f176990d;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13050xc93b9c8f activityC13050xc93b9c8f) {
        this.f176990d = activityC13050xc93b9c8f;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13050xc93b9c8f activityC13050xc93b9c8f = this.f176990d;
        activityC13050xc93b9c8f.f176339g.getViewTreeObserver().removeOnPreDrawListener(this);
        activityC13050xc93b9c8f.f176346q.c(activityC13050xc93b9c8f.f176339g, activityC13050xc93b9c8f.f176338f, null);
        return true;
    }
}
