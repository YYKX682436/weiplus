package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class c00 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f187966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 f187967e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jz5.l f187968f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rn5.a f187969g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e f187970h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f187971i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f187972m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.List f187973n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CopyOnWriteArrayList f187974o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c00(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 g00Var, jz5.l lVar, rn5.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e eVar, boolean z18, boolean z19, java.util.List list, java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList) {
        super(0);
        this.f187966d = z17;
        this.f187967e = g00Var;
        this.f187968f = lVar;
        this.f187969g = aVar;
        this.f187970h = eVar;
        this.f187971i = z18;
        this.f187972m = z19;
        this.f187973n = list;
        this.f187974o = copyOnWriteArrayList;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (this.f187966d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 g00Var = this.f187967e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(g00Var.f188334f, "requestRefresh after request lbs suc,loc:" + this.f187968f);
            in5.n0 T0 = g00Var.f188330b.T0();
            this.f187967e.k(this.f187969g, this.f187970h, T0 != null ? T0.mo1894x7e414b06() - T0.a0() : 0, this.f187971i, this.f187972m, this.f187973n, this.f187974o);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00.g(this.f187967e, "requestLbsFail", -3, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rz.f190485e, so2.g5.f491896e, 0L, 16, null);
        }
        return jz5.f0.f384359a;
    }
}
