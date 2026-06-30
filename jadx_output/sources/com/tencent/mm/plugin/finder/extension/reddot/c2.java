package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes2.dex */
public final class c2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db2.c3 f105434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f105435e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(db2.c3 c3Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        super(0);
        this.f105434d = c3Var;
        this.f105435e = baseFinderFeed;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestRedDotId = ");
        db2.c3 c3Var = this.f105434d;
        sb6.append(pm0.v.u(c3Var.d().getLong(12)));
        sb6.append(", respFeedId=");
        sb6.append(pm0.v.u(this.f105435e.getFeedObject().getFeedObject().getId()));
        sb6.append(", tabType = ");
        sb6.append(c3Var.d().getInteger(11));
        sb6.append(", requestRedDotTipsId = ");
        sb6.append(c3Var.d().f227909e);
        return sb6.toString();
    }
}
