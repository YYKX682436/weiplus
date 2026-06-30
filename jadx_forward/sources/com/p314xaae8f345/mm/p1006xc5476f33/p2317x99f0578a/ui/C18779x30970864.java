package com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui;

/* renamed from: com.tencent.mm.plugin.transvoice.ui.TransVoicePanelLayout */
/* loaded from: classes5.dex */
public class C18779x30970864 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22606xbb21161d {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.w0 f256943f;

    public C18779x30970864(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22606xbb21161d, al5.e0
    public void J2(boolean z17, int i17) {
        super.J2(z17, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.w0 w0Var = this.f256943f;
        if (w0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.f0) w0Var).f256963a;
            v0Var.f257032z = z17;
            if (z17) {
                v0Var.B = com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.w.f257035f;
                p001xcca8366f.p003x91727fcf.p004xb069c1be.p005xd1075a44.C0029xbc4672a6 c0029xbc4672a6 = v0Var.R;
                if (c0029xbc4672a6 != null && 3 == c0029xbc4672a6.f90424o) {
                    v0Var.S = com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.x.f257038e;
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = v0Var.f257017n;
                if (c22621x7603e017 != null) {
                    c22621x7603e017.setCursorVisible(true);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0.G(v0Var, true);
                com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0.F(v0Var, false);
                com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0.I(v0Var, false);
                android.widget.ImageView imageView = v0Var.f257022r;
                if (imageView != null) {
                    imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562768o1);
                }
                v0Var.J(true);
            } else {
                p001xcca8366f.p003x91727fcf.p004xb069c1be.p005xd1075a44.C0029xbc4672a6 c0029xbc4672a62 = v0Var.R;
                if ((c0029xbc4672a62 != null && 3 == c0029xbc4672a62.f90424o) && com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.w.f257034e != v0Var.B) {
                    v0Var.S = com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.x.f257037d;
                }
                if (v0Var.B.ordinal() == 2) {
                    v0Var.B = com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.w.f257033d;
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.x.f257038e != v0Var.S) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0.G(v0Var, false);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0.F(v0Var, true);
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = v0Var.f257024t;
                        if (abstractC19636xc6b37291 != null) {
                            abstractC19636xc6b37291.setVisibility(8);
                        }
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = v0Var.f257017n;
                        if (c22621x7603e0172 != null) {
                            c22621x7603e0172.setCursorVisible(false);
                        }
                        v0Var.J(false);
                    }
                }
            }
            if (v0Var.A == i17 || i17 == 0) {
                return;
            }
            v0Var.A = i17;
            fp.w.m(v0Var.getContext(), i17);
            int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.g(v0Var.getContext());
            com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372912 = v0Var.f257024t;
            if (abstractC19636xc6b372912 != null) {
                abstractC19636xc6b372912.mo75342x4b0766b2(g17);
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372913 = v0Var.f257024t;
            android.view.ViewGroup.LayoutParams layoutParams = abstractC19636xc6b372913 != null ? abstractC19636xc6b372913.getLayoutParams() : null;
            if (layoutParams != null) {
                layoutParams.height = g17;
            }
        }
    }

    /* renamed from: setOnInputPanelChange */
    public void m72351x5ef67cab(com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.w0 w0Var) {
        this.f256943f = w0Var;
    }

    public C18779x30970864(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
