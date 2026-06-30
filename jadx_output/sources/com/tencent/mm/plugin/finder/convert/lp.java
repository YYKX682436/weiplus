package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class lp extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.rp f103940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103941b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ so2.i f103942c;

    public lp(com.tencent.mm.plugin.finder.convert.rp rpVar, in5.s0 s0Var, so2.i iVar) {
        this.f103940a = rpVar;
        this.f103941b = s0Var;
        this.f103942c = iVar;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            com.tencent.mm.plugin.finder.convert.rp.q(this.f103940a, this.f103941b.f293121e, 2L, this.f103942c.f410411d);
        }
    }
}
