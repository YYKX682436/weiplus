package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes14.dex */
public class i6 implements com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.i2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6 f224407a;

    public i6(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6 l6Var) {
        this.f224407a = l6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.i2
    public void a(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6 l6Var = this.f224407a;
        if (z17) {
            if (l6Var.f224458x == null) {
                l6Var.f224439e.setVisibility(8);
            } else {
                l6Var.f224439e.setVisibility(4);
            }
            l6Var.f224439e.setVisibility(8);
            l6Var.f224438d.setVisibility(8);
            l6Var.f224435a.setText("");
            l6Var.f224436b.setText("");
            l6Var.f224444j.setVisibility(0);
        } else {
            if (l6Var.f224458x != null) {
                l6Var.f224439e.setVisibility(0);
                l6Var.f224438d.setVisibility(8);
            } else {
                l6Var.f224438d.setVisibility(0);
                l6Var.f224439e.setVisibility(8);
            }
            l6Var.h(l6Var.f224454t);
            l6Var.f224444j.setVisibility(4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12057, 0, 0, 1, 0);
    }
}
