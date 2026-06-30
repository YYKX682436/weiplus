package com.tencent.mm.plugin.card.ui;

/* loaded from: classes5.dex */
public class u1 implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v1 f95176a;

    public u1(com.tencent.mm.plugin.card.ui.v1 v1Var) {
        this.f95176a = v1Var;
    }

    @Override // zb0.a0
    public void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.card.ui.v1 v1Var = this.f95176a;
        dp.a.makeText(v1Var.f95180d.getContext(), v1Var.f95180d.getContext().getString(com.tencent.mm.R.string.k7b, q75.c.c(str2)), 1).show();
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        androidx.appcompat.app.AppCompatActivity context = v1Var.f95180d.getContext();
        ((ub0.r) oVar).getClass();
        q75.c.f(str2, context);
    }

    @Override // zb0.a0
    public void b(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.card.ui.v1 v1Var = this.f95176a;
        dp.a.makeText(v1Var.f95180d.getContext(), v1Var.f95180d.getContext().getString(com.tencent.mm.R.string.k7a), 1).show();
    }
}
