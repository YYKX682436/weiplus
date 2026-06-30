package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class g1 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.s1 f106810d;

    public g1(com.tencent.mm.plugin.finder.feed.s1 s1Var) {
        this.f106810d = s1Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.feed.h2 h2Var = (com.tencent.mm.plugin.finder.feed.h2) this.f106810d;
        h2Var.getClass();
        int a07 = i17 - ((in5.n0) adapter).a0();
        com.tencent.mm.plugin.finder.feed.e1 g17 = h2Var.g();
        g17.f106613e.S6(new com.tencent.mm.plugin.finder.feed.g2(a07, h2Var, i17, view));
    }
}
