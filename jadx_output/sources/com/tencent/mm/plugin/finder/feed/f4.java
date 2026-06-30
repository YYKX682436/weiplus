package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class f4 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f106701a;

    public f4(com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        this.f106701a = a7Var;
    }

    @Override // ym5.q3
    public void b(int i17) {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.finder.feed.c4(this.f106701a));
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        this.f106701a.M();
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        pm0.v.V(20L, new com.tencent.mm.plugin.finder.feed.d4(this.f106701a));
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f106701a;
        if (a7Var.f106231y0) {
            return;
        }
        a7Var.f106231y0 = true;
        a7Var.I(true);
        com.tencent.mm.plugin.finder.feed.a7 a7Var2 = this.f106701a;
        if (!a7Var2.f106223t) {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.finder.feed.e4(this.f106701a));
        } else {
            fp0.t tVar = a7Var2.F;
            if (tVar != null) {
                tVar.b(new fp0.r(new com.tencent.mm.plugin.finder.feed.w3(a7Var2), null, 2, null));
            }
        }
    }
}
