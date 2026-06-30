package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes12.dex */
public class y1 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13052x7242bfaf f176991d;

    public y1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13052x7242bfaf activityC13052x7242bfaf) {
        this.f176991d = activityC13052x7242bfaf;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13052x7242bfaf activityC13052x7242bfaf = this.f176991d;
        activityC13052x7242bfaf.f176378g.getViewTreeObserver().removeOnPreDrawListener(this);
        activityC13052x7242bfaf.f176389u.c(activityC13052x7242bfaf.f176378g, activityC13052x7242bfaf.f176379h, null);
        return true;
    }
}
