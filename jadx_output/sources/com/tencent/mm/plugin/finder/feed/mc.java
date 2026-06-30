package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class mc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.id f107368d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc(com.tencent.mm.plugin.finder.feed.id idVar) {
        super(0);
        this.f107368d = idVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f107368d.f107003f;
        if (finderItem != null) {
            jz5.l k17 = nv2.n1.f340551h.k(finderItem.getFeedObject());
            boolean booleanValue = ((java.lang.Boolean) k17.f302833d).booleanValue();
            boolean booleanValue2 = ((java.lang.Boolean) k17.f302834e).booleanValue();
            if (booleanValue && !booleanValue2) {
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
