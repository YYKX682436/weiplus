package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class de implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f f281980d;

    public de(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f activityC21642xe60a98f) {
        this.f281980d = activityC21642xe60a98f;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f activityC21642xe60a98f = this.f281980d;
        activityC21642xe60a98f.f279858d.getViewTreeObserver().removeOnPreDrawListener(this);
        if (activityC21642xe60a98f.f279858d.getLineCount() != 1) {
            return false;
        }
        activityC21642xe60a98f.f279858d.setGravity(1);
        return false;
    }
}
