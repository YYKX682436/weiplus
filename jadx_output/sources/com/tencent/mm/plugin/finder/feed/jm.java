package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes.dex */
public final class jm extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.km f107120d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm(com.tencent.mm.plugin.finder.feed.km kmVar) {
        super(0);
        this.f107120d = kmVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.w2.a("FinderStreamMoreLikeDividerFeed_" + this.f107120d.f107221d.getLong(3)).hashCode());
    }
}
