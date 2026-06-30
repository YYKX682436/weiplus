package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class lx {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer f103953a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f103954b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f103955c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f103956d;

    public lx(com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataList, yz5.a dispatcher) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        this.f103953a = dataList;
        this.f103954b = dispatcher;
        this.f103955c = "ProgressUpdateOperator";
        this.f103956d = new java.util.LinkedHashSet();
    }

    public final void a(kotlinx.coroutines.y0 lifeCycleScope) {
        kotlin.jvm.internal.o.g(lifeCycleScope, "lifeCycleScope");
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.s0().r()).booleanValue()) {
            kotlinx.coroutines.l.d(lifeCycleScope, null, null, new com.tencent.mm.plugin.finder.convert.kx(this, null), 3, null);
        }
    }

    public final void b(java.lang.String from) {
        kotlin.jvm.internal.o.g(from, "from");
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.s0().r()).booleanValue()) {
            java.util.Set set = this.f103956d;
            java.util.Set X0 = kz5.n0.X0(set);
            com.tencent.mars.xlog.Log.i(this.f103955c, "updatePlayProgressChange from:" + from + " idList:" + X0);
            if (X0.isEmpty()) {
                return;
            }
            int i17 = 0;
            for (java.lang.Object obj : this.f103953a) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                so2.j5 j5Var = (so2.j5) obj;
                if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                    long id6 = ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getFeedObject().getId();
                    if (X0.contains(java.lang.Long.valueOf(id6))) {
                        jz5.x.a(id6);
                        ((com.tencent.mm.plugin.finder.feed.model.internal.j0) this.f103954b.invoke()).c(i17, 1, 2002);
                    }
                }
                i17 = i18;
            }
            set.removeAll(X0);
        }
    }
}
