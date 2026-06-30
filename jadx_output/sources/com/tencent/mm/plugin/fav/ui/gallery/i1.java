package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class i1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.w1 f100977d;

    public i1(com.tencent.mm.plugin.fav.ui.gallery.x1 x1Var, com.tencent.mm.plugin.fav.ui.gallery.w1 w1Var) {
        this.f100977d = w1Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.fav.ui.gallery.w1 w1Var = this.f100977d;
        w1Var.f101092d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        w1Var.f101095g.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(w1Var.f101092d.getWidth(), w1Var.f101092d.getHeight()));
    }
}
