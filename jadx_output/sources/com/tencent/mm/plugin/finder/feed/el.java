package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class el extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xj f106660d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el(com.tencent.mm.plugin.finder.feed.xj xjVar) {
        super(1);
        this.f106660d = xjVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (!it.getHasMore()) {
            this.f106660d.f111074c.f();
        }
        return jz5.f0.f302826a;
    }
}
