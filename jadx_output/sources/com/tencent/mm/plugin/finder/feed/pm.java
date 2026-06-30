package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class pm extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.um f108736d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm(com.tencent.mm.plugin.finder.feed.um umVar) {
        super(1);
        this.f108736d = umVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        if (intValue == -1) {
            return new com.tencent.mm.plugin.finder.convert.i8(new com.tencent.mm.plugin.finder.feed.om(this.f108736d), null, null, true, 6, null);
        }
        if (intValue == com.tencent.mm.plugin.finder.feed.model.d5.class.hashCode()) {
            return new com.tencent.mm.plugin.finder.convert.ar();
        }
        hc2.l.a("FinderNativeDramaFeedUIContract", intValue);
        return new com.tencent.mm.plugin.finder.convert.z2();
    }
}
