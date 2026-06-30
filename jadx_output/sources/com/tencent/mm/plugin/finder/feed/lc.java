package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class lc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.id f107287d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc(com.tencent.mm.plugin.finder.feed.id idVar) {
        super(0);
        this.f107287d = idVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f107287d.f107003f;
        if (finderItem != null) {
            return finderItem.getFeedObject();
        }
        return null;
    }
}
