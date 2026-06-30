package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes15.dex */
public class j4 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.ActivityC19658x8101466c f272414d;

    public j4(com.p314xaae8f345.mm.p2470x93e71c27.ui.ActivityC19658x8101466c activityC19658x8101466c) {
        this.f272414d = activityC19658x8101466c;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.ActivityC19658x8101466c activityC19658x8101466c = this.f272414d;
        activityC19658x8101466c.f271404d.post(new com.p314xaae8f345.mm.p2470x93e71c27.ui.i4(this));
        activityC19658x8101466c.f271404d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
