package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class ym implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f192312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14103x2367d69b f192313e;

    public ym(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14103x2367d69b activityC14103x2367d69b) {
        this.f192312d = view;
        this.f192313e = activityC14103x2367d69b;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f192312d.getViewTreeObserver().removeOnPreDrawListener(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14103x2367d69b activityC14103x2367d69b = this.f192313e;
        int h17 = com.p314xaae8f345.mm.ui.bl.h(activityC14103x2367d69b);
        android.widget.RelativeLayout relativeLayout = activityC14103x2367d69b.A;
        if (relativeLayout != null) {
            android.view.ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.height += h17;
            relativeLayout.setLayoutParams(layoutParams);
            relativeLayout.setPadding(0, h17, 0, 0);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) activityC14103x2367d69b.mo55332x76847179().findViewById(com.p314xaae8f345.mm.R.id.cl7);
        android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        layoutParams2.height += h17;
        imageView.setLayoutParams(layoutParams2);
        return true;
    }
}
