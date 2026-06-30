package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class vq extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.kr f110924d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq(com.tencent.mm.plugin.finder.feed.kr krVar) {
        super(1);
        this.f110924d = krVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.xr xrVar = this.f110924d.f107247x;
        if (xrVar != null) {
            com.tencent.mm.plugin.finder.feed.kr krVar = xrVar.f111097f;
            if (krVar.f107235i) {
                com.tencent.mars.xlog.Log.i(xrVar.f111096e, "onFetchTop");
                xrVar.g(krVar.f107236m);
            }
        }
        return jz5.f0.f302826a;
    }
}
