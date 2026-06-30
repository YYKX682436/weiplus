package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class f5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.q6 f103337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView f103338e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(com.tencent.mm.plugin.finder.convert.q6 q6Var, com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView) {
        super(1);
        this.f103337d = q6Var;
        this.f103338e = finderCollapsibleTextView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.MotionEvent ev6 = (android.view.MotionEvent) obj;
        boolean z17 = true;
        if (ev6 != null && ev6.getAction() == 0) {
            com.tencent.mm.plugin.finder.convert.q6 q6Var = this.f103337d;
            if (q6Var.f104340e.l0()) {
                q6Var.f104340e.B0(false);
                return java.lang.Boolean.valueOf(z17);
            }
        }
        if (ev6 != null && ev6.getAction() == 0) {
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = this.f103338e;
            finderCollapsibleTextView.getClass();
            kotlin.jvm.internal.o.g(ev6, "ev");
            finderCollapsibleTextView.getCollapseTextView().getHitRect(new android.graphics.Rect());
            int[] iArr = new int[2];
            finderCollapsibleTextView.getCollapseTextView().getLocationOnScreen(iArr);
            int i17 = iArr[0];
            android.graphics.Rect rect = finderCollapsibleTextView.f130895t;
            if (new android.graphics.Rect(i17 - rect.left, iArr[1] - rect.top, i17 + finderCollapsibleTextView.getCollapseTextView().getWidth() + finderCollapsibleTextView.f130895t.right, iArr[1] + finderCollapsibleTextView.getCollapseTextView().getHeight() + finderCollapsibleTextView.f130895t.bottom).contains((int) ev6.getRawX(), (int) ev6.getRawY())) {
                finderCollapsibleTextView.getCollapseTextView().performClick();
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
