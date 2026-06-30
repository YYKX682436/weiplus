package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class rh extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f190445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uh f190446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f190447f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh(java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uh uhVar, boolean z17) {
        super(0);
        this.f190445d = list;
        this.f190446e = uhVar;
        this.f190447f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tobe mergeData from db data from DB:");
        java.util.List list = this.f190445d;
        sb6.append(list.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMention.NotifyPresenter", sb6.toString());
        long uptimeMillis = android.os.SystemClock.uptimeMillis() - com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.mi.f188917a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        pm0.v.V(uptimeMillis >= ((java.lang.Number) t70Var.F2().r()).longValue() ? 0L : ((java.lang.Number) t70Var.F2().r()).longValue() - uptimeMillis, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.qh(this.f190446e, list, this.f190447f));
        return jz5.f0.f384359a;
    }
}
