package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class gl extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tl f106852d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl(com.tencent.mm.plugin.finder.feed.tl tlVar) {
        super(1);
        this.f106852d = tlVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        java.lang.Object obj2 = this.f106852d.f().f293125i;
        if (obj2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            return (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj2;
        }
        return null;
    }
}
