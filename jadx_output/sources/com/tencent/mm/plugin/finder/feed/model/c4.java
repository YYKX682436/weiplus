package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes3.dex */
public final class c4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderLiveWecoinHotLoader f107748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f107749e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(com.tencent.mm.plugin.finder.feed.model.FinderLiveWecoinHotLoader finderLiveWecoinHotLoader, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f107748d = finderLiveWecoinHotLoader;
        this.f107749e = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.l lVar = this.f107748d.f107499i;
        if (lVar != null) {
            lVar.invoke(this.f107749e);
        }
        return jz5.f0.f302826a;
    }
}
