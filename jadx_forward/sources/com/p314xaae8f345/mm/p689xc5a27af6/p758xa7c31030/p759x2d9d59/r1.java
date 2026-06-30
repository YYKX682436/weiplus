package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59;

/* loaded from: classes12.dex */
public final class r1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1 f149005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x0 f149006e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1 x1Var, com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x0 x0Var) {
        super(0);
        this.f149005d = x1Var;
        this.f149006e = x0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.List f17 = this.f149005d.f();
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1 x1Var = this.f149005d;
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x0 x0Var = this.f149006e;
        synchronized (f17) {
            for (ob0.e eVar : x1Var.f()) {
                if (eVar instanceof com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.b) {
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.b) eVar).j(x0Var);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
