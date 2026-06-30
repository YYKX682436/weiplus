package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes15.dex */
public class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1 f226351d;

    public f2(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1 y1Var) {
        this.f226351d = y1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1 y1Var = this.f226351d;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) y1Var.m(com.p314xaae8f345.mm.R.id.jbp);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) y1Var.W.findViewById(com.p314xaae8f345.mm.R.id.in_);
        if (frameLayout == null || relativeLayout.getHeight() < 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TrackMapUI", "mapcontent is null!");
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        }
        layoutParams.height = frameLayout.getHeight() - relativeLayout.getHeight();
        frameLayout.setLayoutParams(layoutParams);
        y1Var.f226274t.mo1014xb96b113b(new int[]{24, 24});
    }
}
