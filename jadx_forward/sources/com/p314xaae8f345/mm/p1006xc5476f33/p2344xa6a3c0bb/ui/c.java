package com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui;

/* loaded from: classes15.dex */
public class c implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.AbstractActivityC18835xbdcc0e00 f257771d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.AbstractActivityC18835xbdcc0e00 abstractActivityC18835xbdcc0e00) {
        this.f257771d = abstractActivityC18835xbdcc0e00;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.C18848xa06e1dbc c18848xa06e1dbc = this.f257771d.f257701h;
        if (c18848xa06e1dbc.f257759f.getAnimation() == null) {
            android.widget.TextView textView = c18848xa06e1dbc.f257759f;
            android.content.Context context = c18848xa06e1dbc.getContext();
            com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.u0 u0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.u0(c18848xa06e1dbc);
            textView.getWidth();
            textView.getLocationInWindow(new int[2]);
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559434ep);
            loadAnimation.setDuration(200L);
            loadAnimation.setStartOffset(0L);
            loadAnimation.setRepeatCount(0);
            loadAnimation.setFillAfter(true);
            loadAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.z0(u0Var));
            textView.startAnimation(loadAnimation);
        }
        return false;
    }
}
