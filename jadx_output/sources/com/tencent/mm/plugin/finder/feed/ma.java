package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes.dex */
public final class ma extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.c f107365d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma(in5.c cVar) {
        super(1);
        this.f107365d = cVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed it = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(this.f107365d.getItemId() == it.getItemId());
    }
}
