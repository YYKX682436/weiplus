package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class yv extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.cw f111209d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv(com.tencent.mm.plugin.finder.feed.cw cwVar) {
        super(1);
        this.f111209d = cwVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.finder.feed.cw cwVar = this.f111209d;
        if (intValue == -6) {
            return new com.tencent.mm.plugin.finder.convert.sk(cwVar);
        }
        hc2.l.a(cwVar.f106509h, intValue);
        return new com.tencent.mm.plugin.finder.convert.z2();
    }
}
