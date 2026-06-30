package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c;

/* loaded from: classes5.dex */
public class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.k0 f289056d;

    public i0(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.k0 k0Var) {
        this.f289056d = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/banner/NetWarnBanner$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.k0 k0Var = this.f289056d;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.k0.l(k0Var, k0Var.f289070x);
        k0Var.f289070x = 1;
        if (k0Var.E == null) {
            k0Var.getClass();
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.C22387xac19ab7c c22387xac19ab7c = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.C22387xac19ab7c(k0Var, com.p314xaae8f345.mm.app.a0.f134821d);
            k0Var.E = c22387xac19ab7c;
            c22387xac19ab7c.mo48813x58998cd();
        }
        if (k0Var.D == null) {
            k0Var.getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.g0(k0Var), true);
            k0Var.D = b4Var;
            b4Var.c(1000L, 1000L);
        }
        yj0.a.h(this, "com/tencent/mm/ui/conversation/banner/NetWarnBanner$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
