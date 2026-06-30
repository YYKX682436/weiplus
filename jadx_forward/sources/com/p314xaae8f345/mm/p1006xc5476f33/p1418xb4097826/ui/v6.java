package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes5.dex */
public final class v6 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f211476d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15035xa57e2b0a f211477e;

    public v6(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15035xa57e2b0a activityC15035xa57e2b0a) {
        this.f211476d = view;
        this.f211477e = activityC15035xa57e2b0a;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f211476d.getViewTreeObserver().removeOnPreDrawListener(this);
        android.graphics.Bitmap bitmap = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15035xa57e2b0a.f210114e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15035xa57e2b0a activityC15035xa57e2b0a = this.f211477e;
        activityC15035xa57e2b0a.m78513xc2a54588().postDelayed(activityC15035xa57e2b0a.f210115d, 300L);
        return true;
    }
}
