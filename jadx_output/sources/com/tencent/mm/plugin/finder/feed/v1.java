package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class v1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.c2 f110860d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(com.tencent.mm.plugin.finder.feed.c2 c2Var) {
        super(1);
        this.f110860d = c2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        if (intValue == -6) {
            return new com.tencent.mm.plugin.finder.convert.sk(new com.tencent.mm.plugin.finder.feed.u1(this.f110860d));
        }
        hc2.l.a("Finder.FinderCampaginFeedUIContract.TopicFeedPresenter", intValue);
        return new com.tencent.mm.plugin.finder.convert.z2();
    }
}
