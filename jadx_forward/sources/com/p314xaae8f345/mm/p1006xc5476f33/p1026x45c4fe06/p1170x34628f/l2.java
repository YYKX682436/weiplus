package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class l2 extends android.widget.RelativeLayout implements zl1.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1 f168379d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1 y1Var, android.content.Context context) {
        super(context);
        this.f168379d = y1Var;
    }

    public void a(zl1.t tVar, boolean z17) {
        android.widget.FrameLayout frameLayout;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1 y1Var = this.f168379d;
        if (y1Var.A1 || (frameLayout = y1Var.f168799l1) == null || !(frameLayout.getLayoutParams() instanceof android.widget.RelativeLayout.LayoutParams)) {
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) y1Var.f168799l1.getLayoutParams();
        if (layoutParams.getRule(2) != y1Var.f168804y0.getId()) {
            layoutParams.addRule(2, y1Var.f168804y0.getId());
            layoutParams.removeRule(12);
            y1Var.f168799l1.requestLayout();
        }
    }
}
