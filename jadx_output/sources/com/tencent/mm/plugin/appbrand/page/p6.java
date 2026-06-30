package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class p6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f86997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f86998e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f86999f;

    public p6(com.tencent.mm.plugin.appbrand.page.v5 v5Var, android.content.Context context, android.view.View view) {
        this.f86999f = v5Var;
        this.f86997d = context;
        this.f86998e = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f86997d;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86999f;
        v5Var.F = new com.tencent.mm.plugin.appbrand.page.a7(v5Var, context);
        android.view.View k17 = v5Var.k1(v5Var.F);
        com.tencent.mm.plugin.appbrand.page.d7 Q1 = v5Var.Q1();
        android.view.View view = this.f86998e;
        android.widget.RelativeLayout.LayoutParams q17 = Q1.q(view, k17);
        if (k17 != null) {
            v5Var.F.addView(view, r0.getChildCount() - 1, q17);
        } else {
            v5Var.F.addView(view, q17);
        }
        v5Var.Q1().z(view);
    }
}
