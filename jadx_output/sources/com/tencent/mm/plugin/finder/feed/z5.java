package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class z5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f111229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f111230e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f111231f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f111232g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(com.tencent.mm.plugin.finder.feed.a7 a7Var, so2.y0 y0Var, long j17, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        super(1);
        this.f111229d = a7Var;
        this.f111230e = y0Var;
        this.f111231f = j17;
        this.f111232g = baseFinderFeed;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.bs2 resp = (r45.bs2) obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.y5(this.f111229d, this.f111230e, this.f111231f, resp, this.f111232g));
        return jz5.f0.f302826a;
    }
}
