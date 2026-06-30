package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class cl extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tl f106482d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl(com.tencent.mm.plugin.finder.feed.tl tlVar) {
        super(1);
        this.f106482d = tlVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        qg3.w wVar;
        int intValue = ((java.lang.Number) obj).intValue();
        ao2.a aVar = this.f106482d.f109070e;
        if (aVar != null && (wVar = aVar.f12543l) != null) {
            urgen.ur_54A4.UR_720C.UR_EA00(((qg3.x) wVar).getCppPointer(), "CgiRelatedList", intValue);
        }
        return jz5.f0.f302826a;
    }
}
