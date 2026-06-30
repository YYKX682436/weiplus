package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionCommonUsedWeAppRecyclerView */
/* loaded from: classes8.dex */
public class C18564x29fd1ad8 extends com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80 {
    public C18564x29fd1ad8(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80
    /* renamed from: getMaxCount */
    public int mo71638x92a0b781() {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.c0) ((ft.j) i95.n0.c(ft.j.class))).getClass();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158000a;
        if (i17 == 0) {
            r45.a60 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.b();
            i17 = b17 != null ? b17.f451290e : 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158000a = i17;
        }
        return i17 == 1 ? 4 : 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80
    public void h1(int i17, cl1.n0 n0Var) {
        this.f254248j2.f(n0Var, i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80
    public void i1() {
        super.i1();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7) this.f254251m2).e(true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80
    public void k1() {
        m7964x8d4ad49c(new rh4.k());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80
    public void n1(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, android.view.View view, cl1.n0 n0Var, int i17) {
        rh4.j0 j0Var = this.f254248j2;
        if (j0Var != null) {
            j0Var.p(k3Var, view, n0Var, i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80
    public void o1(int i17, boolean z17, boolean z18) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80
    public void p1(float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12766x2cdb734f c12766x2cdb734f = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12766x2cdb734f) this.f254251m2;
        this.f254247i2 = c12766x2cdb734f.c(f17, f18) && c12766x2cdb734f.d(f17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80
    public void q1() {
        rh4.j0 j0Var = this.f254248j2;
        if (j0Var != null) {
            j0Var.r(7);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80
    public boolean t1() {
        rh4.j0 j0Var = this.f254248j2;
        if (j0Var != null) {
            return j0Var.m();
        }
        return true;
    }

    public C18564x29fd1ad8(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
