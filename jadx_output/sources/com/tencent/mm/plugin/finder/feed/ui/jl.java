package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class jl extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI f110198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f110199e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl(com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI finderSharePostUI, int i17) {
        super(0);
        this.f110198d = finderSharePostUI;
        this.f110199e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI finderSharePostUI = this.f110198d;
        db5.t7.makeText(finderSharePostUI, this.f110199e, 0).show();
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI.B;
        finderSharePostUI.c7();
        return jz5.f0.f302826a;
    }
}
