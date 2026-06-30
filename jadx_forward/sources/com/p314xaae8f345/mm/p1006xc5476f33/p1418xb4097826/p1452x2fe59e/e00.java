package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class e00 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uz {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 f188137a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rn5.a f188138b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e f188139c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f188140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f188141e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f188142f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f188143g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CopyOnWriteArrayList f188144h;

    public e00(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 g00Var, rn5.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e eVar, int i17, boolean z17, boolean z18, java.util.List list, java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList) {
        this.f188137a = g00Var;
        this.f188138b = aVar;
        this.f188139c = eVar;
        this.f188140d = i17;
        this.f188141e = z17;
        this.f188142f = z18;
        this.f188143g = list;
        this.f188144h = copyOnWriteArrayList;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uz
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.sz type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00.b(this.f188137a, "requestRefresh_onPoiRequest_" + type);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uz
    public void b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 g00Var = this.f188137a;
        g00Var.f188330b.i1(-3);
        jz5.l P6 = g00Var.d().P6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(g00Var.f188334f, "requestRefresh hasLocationPermission=" + z17 + ",fragmentVisible=" + g00Var.f188339k + ",location=" + P6);
        if (z17) {
            if (((java.lang.Number) P6.f384366d).floatValue() == 0.0f) {
                if (((java.lang.Number) P6.f384367e).floatValue() == 0.0f) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 g00Var2 = this.f188137a;
                    if (g00Var2.f188336h) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(g00Var2.f188334f, "requestRefresh isRequestingLbs");
                        return;
                    } else {
                        g00Var2.f188336h = true;
                        pm0.v.L("LbsPresenter_requestLbs", true, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.d00(g00Var2, this.f188138b, this.f188139c, this.f188141e, this.f188142f, this.f188143g, this.f188144h));
                        return;
                    }
                }
            }
        }
        this.f188137a.k(this.f188138b, this.f188139c, this.f188140d, this.f188141e, this.f188142f, this.f188143g, this.f188144h);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uz
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.sz type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f188137a.f188334f, "requestRefresh onFrozen type=" + type);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00.g(this.f188137a, "requestRefresh", -3, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rz.f190485e, type == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.sz.f190549d ? so2.g5.f491895d : so2.g5.f491896e, 0L, 16, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uz
    public void d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.qz forbiddenReason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forbiddenReason, "forbiddenReason");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00.g(this.f188137a, "requestLbsNoPermission", -4, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rz.f190485e, forbiddenReason.i(), 0L, 16, null);
    }
}
