package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class w6 implements com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d7 f201681a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c f201682b;

    public w6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d7 d7Var, com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c) {
        this.f201681a = d7Var;
        this.f201682b = c2678xa407981c;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.e
    public final void a(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c, int i17) {
        int height = c2678xa407981c.getHeight() * (-1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d7 d7Var = this.f201681a;
        if (i17 == height && d7Var.X != 1) {
            d7Var.W = false;
            d7Var.X = 0;
            android.view.View view = d7Var.R;
            if (view == null) {
                return;
            }
            view.setBackground(null);
            return;
        }
        if (i17 != 0 || d7Var.X == 2) {
            return;
        }
        d7Var.W = true;
        d7Var.X = 0;
        android.view.View view2 = d7Var.R;
        if (view2 == null) {
            return;
        }
        view2.setBackground(this.f201682b.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563308a80));
    }
}
