package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class r5 implements al5.z3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f282869a;

    public r5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b) {
        this.f282869a = viewOnClickListenerC21748xb3d38e6b;
    }

    @Override // al5.z3
    public void a() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282869a;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = viewOnClickListenerC21748xb3d38e6b.f282144g;
        if (k1Var != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta v17 = k1Var.v();
            v17.d();
            if (v17.f282969n.getVisibility() == 0) {
                yd5.q.f542678a.a(3, 2, viewOnClickListenerC21748xb3d38e6b.X1.m81464xb7cf71c7());
            } else {
                yd5.q.f542678a.a(2, 2, viewOnClickListenerC21748xb3d38e6b.X1.m81464xb7cf71c7());
            }
        }
    }

    @Override // al5.z3
    /* renamed from: onDoubleTap */
    public void mo2317xce1d2af3(float f17, float f18) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282869a;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = viewOnClickListenerC21748xb3d38e6b.f282144g;
        if (k1Var == null) {
            return;
        }
        if (k1Var.w() == null || !viewOnClickListenerC21748xb3d38e6b.f282144g.w().m78014x7b98c171()) {
            if (viewOnClickListenerC21748xb3d38e6b.f282144g.w() == null || !viewOnClickListenerC21748xb3d38e6b.f282144g.w().J2()) {
                return;
            }
            viewOnClickListenerC21748xb3d38e6b.X1.m81477xae17c85(false);
            return;
        }
        viewOnClickListenerC21748xb3d38e6b.X1.m81477xae17c85(true);
        if (!viewOnClickListenerC21748xb3d38e6b.X1.getAddTouchView()) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta v17 = viewOnClickListenerC21748xb3d38e6b.f282144g.v();
            v17.d();
            if (v17.f282971p instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta v18 = viewOnClickListenerC21748xb3d38e6b.f282144g.v();
                v18.d();
                android.view.View m72040xfdad4e88 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465) v18.f282971p).m72040xfdad4e88();
                if (m72040xfdad4e88 != null && (m72040xfdad4e88 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18692xd171d8a0)) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18692xd171d8a0) m72040xfdad4e88).mo70831x49dc7633(true);
                    android.graphics.Rect rect = new android.graphics.Rect();
                    m72040xfdad4e88.getGlobalVisibleRect(rect);
                    if (rect.bottom - rect.top > 0) {
                        viewOnClickListenerC21748xb3d38e6b.X1.m81482x1405e56c(r1 - r3);
                        viewOnClickListenerC21748xb3d38e6b.X1.m81485xbdd8ccab(rect);
                    } else {
                        viewOnClickListenerC21748xb3d38e6b.X1.m81482x1405e56c(0.0f);
                        viewOnClickListenerC21748xb3d38e6b.X1.getViewRect().setEmpty();
                    }
                }
            }
            viewOnClickListenerC21748xb3d38e6b.U7();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19737x80a67750 c19737x80a67750 = viewOnClickListenerC21748xb3d38e6b.L1;
            if (c19737x80a67750 != null) {
                android.graphics.Rect rect2 = new android.graphics.Rect();
                c19737x80a67750.getHitRect(rect2);
                viewOnClickListenerC21748xb3d38e6b.X1.m81475x5caef802(rect2);
            }
            viewOnClickListenerC21748xb3d38e6b.X1.b(viewOnClickListenerC21748xb3d38e6b.f282144g.z(viewOnClickListenerC21748xb3d38e6b.f282170n.m80830xfda78ef6()));
        }
        viewOnClickListenerC21748xb3d38e6b.X1.e(f17, f18);
    }
}
