package eb2;

/* loaded from: classes2.dex */
public final class e0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.qt2 f332268d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f332269e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f332270f = true;

    /* renamed from: g, reason: collision with root package name */
    public volatile int f332271g;

    public e0(r45.qt2 qt2Var, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f332268d = qt2Var;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d5 b(r45.jt4 itemInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemInfo, "itemInfo");
        if (itemInfo.m75939xb282bd08(0) == 1) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d5(itemInfo);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNativeDramaRecommendItemConvertFactory", "not support type " + itemInfo.m75939xb282bd08(0));
        return null;
    }

    public final void c(boolean z17, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 n0Var) {
        pm0.v.T(new db2.o4(this.f332268d, this.f332269e).l(), new eb2.d0(z17, i17, this, n0Var));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchInit */
    public void mo56023xb639f2ea(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f332269e = null;
        this.f332270f = true;
        c(false, 1000, callback);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchLoadMore */
    public void mo56024xaef8a235(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (this.f332270f) {
            c(true, 2, callback);
        } else {
            callback.mo55587xb461ee3d(new eb2.c0(0, 0, null));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchRefresh */
    public void mo56025xae25fec1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f332269e = null;
        this.f332270f = true;
        int i17 = this.f332271g;
        if (this.f332271g == 0) {
            this.f332271g = 1;
        }
        c(false, i17, callback);
    }
}
