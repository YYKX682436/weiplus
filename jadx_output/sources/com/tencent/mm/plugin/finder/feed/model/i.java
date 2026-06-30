package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.m f107927d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.finder.feed.model.m mVar) {
        super(0);
        this.f107927d = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3("FinderAdInfoPreLoader", new com.tencent.mm.plugin.finder.feed.model.h(this.f107927d));
        n3Var.setLogging(false);
        return n3Var;
    }
}
