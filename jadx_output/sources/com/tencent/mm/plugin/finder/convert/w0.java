package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.b1 f104827e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.SimpleTouchableLayout f104828f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f104829g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f104830h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f104831i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(in5.s0 s0Var, com.tencent.mm.plugin.finder.convert.b1 b1Var, com.tencent.mm.plugin.finder.view.SimpleTouchableLayout simpleTouchableLayout, long j17, int i17, so2.u1 u1Var) {
        super(0);
        this.f104826d = s0Var;
        this.f104827e = b1Var;
        this.f104828f = simpleTouchableLayout;
        this.f104829g = j17;
        this.f104830h = i17;
        this.f104831i = u1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        in5.s0 s0Var = this.f104826d;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC finderSpeedControlUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC) a17;
        if (finderSpeedControlUIC.f133650u) {
            finderSpeedControlUIC.S6(s0Var);
            com.tencent.mm.plugin.finder.convert.b1 b1Var = this.f104827e;
            b1Var.B = 0L;
            b1Var.f102920x.invoke(this.f104828f, java.lang.Long.valueOf(this.f104829g), java.lang.Boolean.FALSE);
            com.tencent.mm.plugin.finder.convert.b1.v(b1Var, s0Var, false);
            androidx.recyclerview.widget.RecyclerView o17 = s0Var.o();
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = o17 != null ? o17.getLayoutManager() : null;
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
            if (finderLinearLayoutManager != null) {
                finderLinearLayoutManager.D = true;
            }
            int i17 = this.f104830h;
            so2.u1 u1Var = this.f104831i;
            com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
            android.content.Context context2 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            lz5.m mVar = new lz5.m();
            com.tencent.mm.plugin.finder.report.s sVar = com.tencent.mm.plugin.finder.report.s.f125337a;
            int i18 = b1Var.f102917u;
            r45.en2 en2Var = b1Var.f102918v;
            mVar.putAll(sVar.a(u1Var, i17, i18, en2Var != null ? (r45.ey0) en2Var.getCustom(11) : null, b1Var.f102918v));
            mVar.putAll(new com.tencent.mm.plugin.finder.report.r(b1Var.s(), u1Var, context2, b1Var.f104057o).b("long_press_accelerate_play"));
            com.tencent.mm.plugin.finder.report.d2.i(d2Var, context2, "column_card", "long_press_accelerate_play", false, kz5.b1.b(mVar), 8, null);
        }
        return jz5.f0.f302826a;
    }
}
