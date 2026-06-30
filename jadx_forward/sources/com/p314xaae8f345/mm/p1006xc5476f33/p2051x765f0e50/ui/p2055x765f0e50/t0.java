package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17370xd188836f f243089d;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17370xd188836f activityC17370xd188836f) {
        this.f243089d = activityC17370xd188836f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17370xd188836f.f241657u;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17370xd188836f activityC17370xd188836f = this.f243089d;
        if (activityC17370xd188836f.W6().m84154x92d2fac5() > 1) {
            android.view.ViewGroup.LayoutParams layoutParams = activityC17370xd188836f.W6().getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.setMargins(0, 0, 0, (int) (activityC17370xd188836f.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz) / i65.a.m(activityC17370xd188836f)));
                activityC17370xd188836f.W6().setLayoutParams(layoutParams2);
            }
        }
        activityC17370xd188836f.X6().getLayoutParams().width = (int) (activityC17370xd188836f.X6().getWidth() / i65.a.m(activityC17370xd188836f));
        activityC17370xd188836f.X6().getLayoutParams().height = (int) (activityC17370xd188836f.X6().getHeight() / i65.a.m(activityC17370xd188836f));
        activityC17370xd188836f.W6().requestLayout();
        activityC17370xd188836f.X6().requestLayout();
        if (!c01.e2.R(activityC17370xd188836f.m68953x6bf53a6c())) {
            java.lang.String Y6 = activityC17370xd188836f.Y6(activityC17370xd188836f.W6().a().toString(), "...", "", activityC17370xd188836f.W6(), true);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 W6 = activityC17370xd188836f.W6();
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float m84164x40077844 = activityC17370xd188836f.W6().m84164x40077844();
            ((ke0.e) xVar).getClass();
            W6.b(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(activityC17370xd188836f, Y6, m84164x40077844));
            return;
        }
        java.lang.String Y62 = activityC17370xd188836f.Y6(activityC17370xd188836f.W6().a().toString(), "...", "@@@@", activityC17370xd188836f.W6(), true);
        android.graphics.drawable.Drawable drawable = activityC17370xd188836f.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80791xd2795aeb);
        drawable.setBounds(0, 0, activityC17370xd188836f.W6().m84155xcf821e31(), activityC17370xd188836f.W6().m84155xcf821e31());
        android.text.style.ImageSpan imageSpan = new android.text.style.ImageSpan(drawable);
        android.text.SpannableString spannableString = new android.text.SpannableString(Y62);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 W62 = activityC17370xd188836f.W6();
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        float m84164x400778442 = activityC17370xd188836f.W6().m84164x40077844();
        ((ke0.e) xVar2).getClass();
        android.text.SpannableString j17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(activityC17370xd188836f, spannableString, m84164x400778442);
        j17.setSpan(imageSpan, Y62.length() - 4, Y62.length(), 18);
        W62.b(j17);
    }
}
