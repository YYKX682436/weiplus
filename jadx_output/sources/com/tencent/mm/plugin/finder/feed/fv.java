package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class fv extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.hv f106781d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv(com.tencent.mm.plugin.finder.feed.hv hvVar) {
        super(1);
        this.f106781d = hvVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        if (intValue == -1) {
            com.tencent.mm.plugin.finder.feed.hv hvVar = this.f106781d;
            return new com.tencent.mm.plugin.finder.convert.i8(new com.tencent.mm.plugin.finder.feed.dv(hvVar), new com.tencent.mm.plugin.finder.feed.ev(hvVar), null, false, 12, null);
        }
        hc2.l.a("RecyclerViewAdapterEx", intValue);
        return new com.tencent.mm.plugin.finder.convert.z2();
    }
}
