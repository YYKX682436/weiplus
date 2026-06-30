package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes2.dex */
public final class b2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f186942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db2.b3 f186943e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f186944f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f186945g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(long j17, db2.b3 b3Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar) {
        super(0);
        this.f186942d = j17;
        this.f186943e = b3Var;
        this.f186944f = i17;
        this.f186945g = jbVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("redDotFeedId = ");
        sb6.append(pm0.v.u(this.f186942d));
        sb6.append(", requestFeedId=");
        db2.b3 b3Var = this.f186943e;
        sb6.append(pm0.v.u(b3Var.m75942xfb822ef2(12)));
        sb6.append(", tabType = ");
        sb6.append(this.f186944f);
        sb6.append(", findPageRedDotTipsId = ");
        sb6.append(this.f186945g.f65880x11c19d58);
        sb6.append(", requestRedDotTipsId = ");
        sb6.append(b3Var.f309442e);
        return sb6.toString();
    }
}
