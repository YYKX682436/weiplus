package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes2.dex */
public final class c2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db2.c3 f186967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f186968e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(db2.c3 c3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        super(0);
        this.f186967d = c3Var;
        this.f186968e = abstractC14490x69736cb5;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestRedDotId = ");
        db2.c3 c3Var = this.f186967d;
        sb6.append(pm0.v.u(c3Var.d().m75942xfb822ef2(12)));
        sb6.append(", respFeedId=");
        sb6.append(pm0.v.u(this.f186968e.getFeedObject().getFeedObject().m76784x5db1b11()));
        sb6.append(", tabType = ");
        sb6.append(c3Var.d().m75939xb282bd08(11));
        sb6.append(", requestRedDotTipsId = ");
        sb6.append(c3Var.d().f309442e);
        return sb6.toString();
    }
}
