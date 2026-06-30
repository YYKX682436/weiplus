package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class a3 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderFollowTimelineUI f109646d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(com.tencent.mm.plugin.finder.feed.ui.FinderFollowTimelineUI finderFollowTimelineUI) {
        super(2);
        this.f109646d = finderFollowTimelineUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj2;
        kotlin.jvm.internal.o.g(it, "it");
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.z2(it, this.f109646d));
        return jz5.f0.f302826a;
    }
}
