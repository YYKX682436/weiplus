package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class c00 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f106433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.g00 f106434e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jz5.l f106435f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rn5.a f106436g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.e f106437h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f106438i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f106439m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.List f106440n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CopyOnWriteArrayList f106441o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c00(boolean z17, com.tencent.mm.plugin.finder.feed.g00 g00Var, jz5.l lVar, rn5.a aVar, com.tencent.mm.plugin.finder.feed.model.e eVar, boolean z18, boolean z19, java.util.List list, java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList) {
        super(0);
        this.f106433d = z17;
        this.f106434e = g00Var;
        this.f106435f = lVar;
        this.f106436g = aVar;
        this.f106437h = eVar;
        this.f106438i = z18;
        this.f106439m = z19;
        this.f106440n = list;
        this.f106441o = copyOnWriteArrayList;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f106433d) {
            com.tencent.mm.plugin.finder.feed.g00 g00Var = this.f106434e;
            com.tencent.mars.xlog.Log.i(g00Var.f106801f, "requestRefresh after request lbs suc,loc:" + this.f106435f);
            in5.n0 T0 = g00Var.f106797b.T0();
            this.f106434e.k(this.f106436g, this.f106437h, T0 != null ? T0.getItemCount() - T0.a0() : 0, this.f106438i, this.f106439m, this.f106440n, this.f106441o);
        } else {
            com.tencent.mm.plugin.finder.feed.g00.g(this.f106434e, "requestLbsFail", -3, com.tencent.mm.plugin.finder.feed.rz.f108952e, so2.g5.f410363e, 0L, 16, null);
        }
        return jz5.f0.f302826a;
    }
}
