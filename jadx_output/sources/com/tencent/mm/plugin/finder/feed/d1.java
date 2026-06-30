package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir2.z1 f106532d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(ir2.z1 z1Var) {
        super(1);
        this.f106532d = z1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ir2.v1 state = (ir2.v1) obj;
        kotlin.jvm.internal.o.g(state, "state");
        ir2.z1 z1Var = this.f106532d;
        z1Var.getClass();
        boolean z17 = state instanceof ir2.u1;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = z1Var.f294255d;
        if (z17) {
            refreshLoadMoreLayout.onPreFinishRefresh(((ir2.u1) state).f294227a.a());
        } else if (state instanceof ir2.t1) {
            if (z1Var.f294256e) {
                refreshLoadMoreLayout.onPreFinishLoadMoreSmooth(((ir2.t1) state).f294223a.a());
            } else {
                refreshLoadMoreLayout.onPreFinishLoadMore(((ir2.t1) state).f294223a.a());
            }
        }
        return jz5.f0.f302826a;
    }
}
