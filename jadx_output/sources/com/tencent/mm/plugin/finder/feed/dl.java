package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class dl extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tl f106576d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl(com.tencent.mm.plugin.finder.feed.tl tlVar) {
        super(3);
        this.f106576d = tlVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        qg3.w wVar;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
        ao2.a aVar = this.f106576d.f109070e;
        if (aVar != null && (wVar = aVar.f12543l) != null) {
            urgen.ur_54A4.UR_720C.UR_0403(((qg3.x) wVar).getCppPointer(), "CgiRelatedList", booleanValue, intValue2, intValue);
        }
        return jz5.f0.f302826a;
    }
}
