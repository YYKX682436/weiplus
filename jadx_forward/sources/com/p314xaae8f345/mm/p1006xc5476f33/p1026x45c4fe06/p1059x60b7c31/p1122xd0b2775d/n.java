package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d;

/* loaded from: classes.dex */
public final class n implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.o f165306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f165307b;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.o oVar, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f165306a = oVar;
        this.f165307b = rVar;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f165306a.f165308d, "[WeCoin] getWeCoinBalance onFailed,errorType:" + i17 + ",errorCode:" + i18 + ",msg:" + str);
        this.f165307b.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898(-1L));
    }

    @Override // js4.o
    /* renamed from: onSuccess */
    public void mo14245xe05b4124(java.lang.Object obj) {
        r45.fs3 data = (r45.fs3) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f165306a.f165308d, "[WeCoin] getWeCoinBalance onSuccess,data:" + data);
        this.f165307b.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898(data.f456118d));
    }
}
