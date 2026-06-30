package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.u2 f72808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.v2 f72809e;

    public t2(com.tencent.mm.plugin.aa.ui.v2 v2Var, com.tencent.mm.plugin.aa.ui.u2 u2Var) {
        this.f72809e = v2Var;
        this.f72808d = u2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.aa.ui.u2 u2Var = this.f72808d;
        int top = (u2Var.f72829g.getTop() - u2Var.f72827e.getBottom()) - i65.a.b(this.f72809e.f72851e.getContext(), 8);
        if (top < 0) {
            top = 0;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) u2Var.f72829g.getLayoutParams();
        layoutParams.topMargin = -top;
        u2Var.f72829g.setLayoutParams(layoutParams);
    }
}
