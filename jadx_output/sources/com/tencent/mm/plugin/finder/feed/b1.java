package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.e1 f106338d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(com.tencent.mm.plugin.finder.feed.e1 e1Var) {
        super(0);
        this.f106338d = e1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        com.tencent.mm.plugin.finder.feed.s1 s1Var = this.f106338d.f106614f;
        if (s1Var != null) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = s1Var.f108964h;
            if (wxRecyclerAdapter == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            i17 = wxRecyclerAdapter.a0();
        } else {
            i17 = 0;
        }
        return java.lang.Integer.valueOf(i17);
    }
}
