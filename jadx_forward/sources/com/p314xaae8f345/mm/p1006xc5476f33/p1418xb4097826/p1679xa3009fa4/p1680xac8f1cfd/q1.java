package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes8.dex */
public final class q1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f2 f217178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f217179e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f217180f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f2 f2Var, java.lang.Object obj, int i17) {
        super(0);
        this.f217178d = f2Var;
        this.f217179e = obj;
        this.f217180f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f2 f2Var = this.f217178d;
            java.lang.Object item = this.f217179e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "$item");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f2.O6(f2Var, (so2.u1) item, this.f217180f);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderAddHistoryUIC", "addOrUpdateHistory: addToTaskbar, ", th6);
        }
        return jz5.f0.f384359a;
    }
}
