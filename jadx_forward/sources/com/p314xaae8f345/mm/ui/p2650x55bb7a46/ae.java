package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes3.dex */
public class ae extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f f279996a;

    public ae(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f activityC21642xe60a98f) {
        this.f279996a = activityC21642xe60a98f;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        if (view == null || outline == null) {
            return;
        }
        outline.setAlpha(0.35f);
        int f17 = i65.a.f(this.f279996a.mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj);
        int i17 = -f17;
        outline.setRoundRect(i17, i17, view.getWidth() + f17, view.getHeight() + f17, i65.a.f(r0.mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
    }
}
