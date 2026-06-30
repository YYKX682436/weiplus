package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class su extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.zu f109009d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(com.tencent.mm.plugin.finder.feed.zu zuVar) {
        super(0);
        this.f109009d = zuVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.zu zuVar = this.f109009d;
        if (!zuVar.f111299n) {
            zuVar.f111299n = true;
            pm0.v.L("LbsPresenter_requestLbs", true, new com.tencent.mm.plugin.finder.feed.ru(zuVar));
        }
        return jz5.f0.f302826a;
    }
}
