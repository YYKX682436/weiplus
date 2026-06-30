package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.c2 f106341d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(com.tencent.mm.plugin.finder.feed.c2 c2Var) {
        super(1);
        this.f106341d = c2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ir2.v1 state = (ir2.v1) obj;
        kotlin.jvm.internal.o.g(state, "state");
        boolean z17 = state instanceof ir2.u1;
        com.tencent.mm.plugin.finder.feed.c2 c2Var = this.f106341d;
        if (z17) {
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.z1(state, c2Var));
        } else if (state instanceof ir2.t1) {
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.a2(c2Var, state));
        }
        return jz5.f0.f302826a;
    }
}
