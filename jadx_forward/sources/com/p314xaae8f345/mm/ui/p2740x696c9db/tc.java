package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public class tc implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 f292313d;

    public tc(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72) {
        this.f292313d = activityC22543x95896a72;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72 = this.f292313d;
        activityC22543x95896a72.f291759n.getViewTreeObserver().removeOnPreDrawListener(this);
        activityC22543x95896a72.f291768w.c(activityC22543x95896a72.f291759n, activityC22543x95896a72.f291758m, new com.p314xaae8f345.mm.ui.p2740x696c9db.sc(this));
        return true;
    }
}
