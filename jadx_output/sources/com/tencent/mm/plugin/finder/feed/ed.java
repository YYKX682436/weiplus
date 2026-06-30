package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ed extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.id f106644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f106645e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed(com.tencent.mm.plugin.finder.feed.id idVar, com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        super(0);
        this.f106644d = idVar;
        this.f106645e = finderItem;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yw2.n nVar = this.f106644d.f107010p;
        if (nVar != null) {
            nVar.p();
        }
        com.tencent.mm.plugin.finder.feed.id.m(this.f106644d, this.f106645e, false, null, 6, null);
        return jz5.f0.f302826a;
    }
}
