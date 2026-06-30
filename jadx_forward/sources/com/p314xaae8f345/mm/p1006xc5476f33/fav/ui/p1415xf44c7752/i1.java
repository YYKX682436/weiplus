package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public class i1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.w1 f182510d;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.x1 x1Var, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.w1 w1Var) {
        this.f182510d = w1Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.w1 w1Var = this.f182510d;
        w1Var.f182625d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        w1Var.f182628g.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(w1Var.f182625d.getWidth(), w1Var.f182625d.getHeight()));
    }
}
