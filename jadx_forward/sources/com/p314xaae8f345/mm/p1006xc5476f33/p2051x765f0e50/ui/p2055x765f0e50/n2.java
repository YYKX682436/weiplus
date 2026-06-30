package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes3.dex */
public class n2 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17388xa7b1222e f242877d;

    public n2(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17388xa7b1222e activityC17388xa7b1222e) {
        this.f242877d = activityC17388xa7b1222e;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17388xa7b1222e activityC17388xa7b1222e = this.f242877d;
        activityC17388xa7b1222e.f241717p.getViewTreeObserver().removeOnPreDrawListener(this);
        int a17 = com.p314xaae8f345.mm.ui.zk.a(activityC17388xa7b1222e.mo55332x76847179(), 500);
        if (activityC17388xa7b1222e.f241717p.getWidth() > a17) {
            android.view.ViewGroup.LayoutParams layoutParams = activityC17388xa7b1222e.f241717p.getLayoutParams();
            layoutParams.width = a17;
            activityC17388xa7b1222e.f241717p.setLayoutParams(layoutParams);
        }
        android.widget.LinearLayout linearLayout = activityC17388xa7b1222e.f241718q;
        if (linearLayout == null || linearLayout.getWidth() <= a17) {
            return true;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = activityC17388xa7b1222e.f241718q.getLayoutParams();
        layoutParams2.width = a17;
        activityC17388xa7b1222e.f241718q.setLayoutParams(layoutParams2);
        return true;
    }
}
