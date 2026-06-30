package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes15.dex */
public class m1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1 f226384d;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1 x1Var) {
        this.f226384d = x1Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1 x1Var = this.f226384d;
        x1Var.f226457n.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16296x40c45249 c16296x40c45249 = x1Var.f226457n;
        c16296x40c45249.f226237f.clearAnimation();
        c16296x40c45249.f226237f.startAnimation(c16296x40c45249.f226236e);
    }
}
