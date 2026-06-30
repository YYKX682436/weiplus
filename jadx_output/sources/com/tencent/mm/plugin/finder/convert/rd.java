package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class rd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f104462d;

    public rd(kotlin.jvm.internal.h0 h0Var) {
        this.f104462d = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        kotlin.jvm.internal.h0 h0Var = this.f104462d;
        cy1.a aVar = (cy1.a) rVar;
        aVar.pk(h0Var.f310123d, "from_finderuin_sns");
        aVar.ik(h0Var.f310123d, 32, 25496);
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        android.content.Context context = ((android.view.View) h0Var.f310123d).getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        zy2.ra Sj = ((c61.p2) ybVar).Sj(context);
        aVar.Ai(h0Var.f310123d, new com.tencent.mm.plugin.finder.convert.qd(Sj != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).V6() : null));
    }
}
