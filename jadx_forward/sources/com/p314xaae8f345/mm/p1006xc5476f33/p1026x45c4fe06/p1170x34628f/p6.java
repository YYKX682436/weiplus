package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class p6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f168530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f168531e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f168532f;

    public p6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, android.content.Context context, android.view.View view) {
        this.f168532f = v5Var;
        this.f168530d = context;
        this.f168531e = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f168530d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168532f;
        v5Var.F = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a7(v5Var, context);
        android.view.View k17 = v5Var.k1(v5Var.F);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7 Q1 = v5Var.Q1();
        android.view.View view = this.f168531e;
        android.widget.RelativeLayout.LayoutParams q17 = Q1.q(view, k17);
        if (k17 != null) {
            v5Var.F.addView(view, r0.getChildCount() - 1, q17);
        } else {
            v5Var.F.addView(view, q17);
        }
        v5Var.Q1().z(view);
    }
}
