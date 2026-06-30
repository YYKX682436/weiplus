package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class fa extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.oa f106730d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa(com.tencent.mm.plugin.finder.feed.oa oaVar) {
        super(1);
        this.f106730d = oaVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        if (intValue == -1) {
            return new com.tencent.mm.plugin.finder.convert.i8(new com.tencent.mm.plugin.finder.feed.ea(this.f106730d), null, null, true, 6, null);
        }
        hc2.l.a("FinderFollowFeedUIContract", intValue);
        return new com.tencent.mm.plugin.finder.convert.z2();
    }
}
