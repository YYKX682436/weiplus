package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public final class j1 extends com.tencent.mm.plugin.appbrand.widget.recent.d implements com.tencent.mm.plugin.appbrand.appusage.b6 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.b6 f91992g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(com.tencent.mm.plugin.appbrand.appusage.b6 delegate) {
        super(delegate);
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this.f91992g = delegate;
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.b6
    public java.util.List Ca(int i17, int i18) {
        return this.f91992g.Ca(i17, i18);
    }

    @Override // l75.l0
    public void add(l75.q0 q0Var) {
        if (q0Var != null) {
            b(q0Var);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.d
    public void c(l75.q0 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        ((com.tencent.mm.plugin.appbrand.appusage.b6) this.f91960d).add(listener);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.d
    public void f(java.lang.String str, l75.w0 eventData) {
        kotlin.jvm.internal.o.g(eventData, "eventData");
        fs.g.b(com.tencent.mm.plugin.appbrand.appusage.e6.class, new com.tencent.mm.plugin.appbrand.widget.recent.i1(str, eventData));
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.b6
    public int getCount() {
        return this.f91992g.getCount();
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.d
    public java.lang.Object k(java.lang.Object[] args) {
        kotlin.jvm.internal.o.g(args, "args");
        java.util.Iterator a17 = kotlin.jvm.internal.c.a(args);
        com.tencent.mm.plugin.appbrand.appusage.b6 b6Var = (com.tencent.mm.plugin.appbrand.appusage.b6) this.f91960d;
        java.lang.Object next = ((kotlin.jvm.internal.b) a17).next();
        kotlin.jvm.internal.o.e(next, "null cannot be cast to non-null type kotlin.Int");
        java.util.List t07 = b6Var.t0(((java.lang.Integer) next).intValue());
        if (t07 == null) {
            t07 = kz5.p0.f313996d;
        }
        int i17 = 0;
        for (java.lang.Object obj : t07) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = (com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) obj;
            if (i17 < 8) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUsageStorageWithCache.AppBrandUsageStorageWithCache", "ccf-log [queryByDelegate] name=%s iconUrl=%s", localUsageInfo.f76365h, localUsageInfo.f76368n);
            }
            i17 = i18;
        }
        return t07;
    }

    @Override // l75.l0
    public void remove(l75.q0 q0Var) {
        if (q0Var != null) {
            l(q0Var);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.b6
    public java.util.List t0(int i17) {
        return (java.util.List) i(java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.b6
    public boolean x0(java.lang.String str, int i17) {
        return this.f91992g.x0(str, i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.b6
    public java.util.List ze(long j17, int i17) {
        return this.f91992g.ze(j17, i17);
    }
}
