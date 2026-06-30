package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ou extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.zu f108680d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou(com.tencent.mm.plugin.finder.feed.zu zuVar) {
        super(0);
        this.f108680d = zuVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.zu zuVar = this.f108680d;
        com.tencent.mm.view.RefreshLoadMoreLayout f17 = zuVar.g().f();
        if (f17 != null) {
            f17.postDelayed(new com.tencent.mm.plugin.finder.feed.nu(zuVar), 200L);
        }
        return jz5.f0.f302826a;
    }
}
