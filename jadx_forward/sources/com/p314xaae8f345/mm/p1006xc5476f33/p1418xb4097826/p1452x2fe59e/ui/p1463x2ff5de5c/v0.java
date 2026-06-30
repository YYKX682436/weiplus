package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c;

/* loaded from: classes10.dex */
public final class v0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084 f191438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager f191439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f191440f;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084 activityC14126xa5cf9084, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, int i17) {
        this.f191438d = activityC14126xa5cf9084;
        this.f191439e = layoutManager;
        this.f191440f = i17;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.ViewTreeObserver viewTreeObserver;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084 activityC14126xa5cf9084 = this.f191438d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = activityC14126xa5cf9084.f191310u;
        if (c1163xf1deaba4 != null && (viewTreeObserver = c1163xf1deaba4.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f191439e;
        int i17 = this.f191440f;
        android.view.View mo7935xa188593e = layoutManager.mo7935xa188593e(i17);
        if (mo7935xa188593e != null) {
            android.os.Bundle bundle = activityC14126xa5cf9084.I;
            if (!activityC14126xa5cf9084.H) {
                activityC14126xa5cf9084.H = true;
                android.graphics.Rect rect = activityC14126xa5cf9084.M;
                if (rect == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderCommentImageFlowUI", "currentCommentImageRect is null");
                    activityC14126xa5cf9084.finish();
                } else {
                    int i18 = rect.left;
                    int i19 = rect.top;
                    int width = rect.width();
                    int height = rect.height();
                    com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var = activityC14126xa5cf9084.F;
                    s4Var.e(i18, i19, width, height);
                    if (bundle == null) {
                        android.view.View findViewById = mo7935xa188593e.findViewById(com.p314xaae8f345.mm.R.id.u76);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
                        com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b89 = (com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89) findViewById;
                        android.view.View findViewById2 = mo7935xa188593e.findViewById(com.p314xaae8f345.mm.R.id.ssh);
                        s4Var.c(c22506x89e75b89, activityC14126xa5cf9084.f191315z, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.o0(activityC14126xa5cf9084));
                        if (activityC14126xa5cf9084.P && i17 == 0) {
                            c22506x89e75b89.mo55654x9bfee16e(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.n0(c22506x89e75b89, activityC14126xa5cf9084));
                        }
                        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.setDuration(200L);
                        ofFloat.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.p0(findViewById2, activityC14126xa5cf9084));
                        ofFloat.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.q0(findViewById2, activityC14126xa5cf9084));
                        ofFloat.start();
                    }
                }
            }
        }
        return true;
    }
}
