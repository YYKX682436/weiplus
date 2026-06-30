package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class i10 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.r10 f106980d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i10(com.tencent.mm.plugin.finder.feed.r10 r10Var) {
        super(3);
        this.f106980d = r10Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        in5.s0 holder = (in5.s0) obj;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed item = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        ym5.a1.h(itemView, new com.tencent.mm.plugin.finder.feed.h10(this.f106980d, intValue));
        return jz5.f0.f302826a;
    }
}
