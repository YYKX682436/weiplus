package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public final class h extends com.tencent.mm.plugin.appbrand.widget.recent.d implements com.tencent.mm.plugin.appbrand.appusage.z5 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.z5 f91988g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.appbrand.appusage.z5 delegate) {
        super(delegate);
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this.f91988g = delegate;
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.z5
    public int Dc(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        if (!m2(str, i17)) {
            return ((com.tencent.mm.plugin.appbrand.appusage.z5) this.f91960d).Dc(str, i17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCollectionStorageWithCache", "isCollection reorder");
        com.tencent.mm.plugin.appbrand.widget.recent.s1 s1Var = com.tencent.mm.plugin.appbrand.widget.recent.q0.f92037a;
        java.util.List V0 = kz5.n0.V0(xi(s1Var.f92053b, s1Var.f92054c));
        java.util.ArrayList arrayList = (java.util.ArrayList) V0;
        java.util.Iterator it = arrayList.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = (com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) it.next();
            if (kotlin.jvm.internal.o.b(localUsageInfo.f76361d, str) && localUsageInfo.f76363f == i17) {
                break;
            }
            i18++;
        }
        if (i18 < 0) {
            return -1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCollectionStorageWithCache", "addCollection exist, remove and insert: " + str + " atPos:" + i18);
        arrayList.add((com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) arrayList.remove(i18));
        return Lg(V0, 0) ? 0 : -1;
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.z5
    public boolean Lg(java.util.List list, int i17) {
        return this.f91988g.Lg(list, i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.z5
    public boolean Y1(java.lang.String str, int i17) {
        return this.f91988g.Y1(str, i17);
    }

    @Override // l75.l0
    public void add(java.lang.String str, l75.q0 q0Var) {
        this.f91988g.add(str, q0Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.d
    public void c(l75.q0 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        ((com.tencent.mm.plugin.appbrand.appusage.z5) this.f91960d).add(listener);
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.z5
    public int ce(java.lang.String str, int i17, boolean z17) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        if (!m2(str, i17)) {
            return ((com.tencent.mm.plugin.appbrand.appusage.z5) this.f91960d).ce(str, i17, z17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCollectionStorageWithCache", "isCollection reorder");
        com.tencent.mm.plugin.appbrand.widget.recent.s1 s1Var = com.tencent.mm.plugin.appbrand.widget.recent.q0.f92037a;
        java.util.List V0 = kz5.n0.V0(xi(s1Var.f92053b, s1Var.f92054c));
        java.util.ArrayList arrayList = (java.util.ArrayList) V0;
        java.util.Iterator it = arrayList.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = (com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) it.next();
            if (kotlin.jvm.internal.o.b(localUsageInfo.f76361d, str) && localUsageInfo.f76363f == i17) {
                break;
            }
            i18++;
        }
        if (i18 < 0) {
            return -1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCollectionStorageWithCache", "addCollection exist, remove and insert: " + str + " atPos:" + i18);
        arrayList.add((com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) arrayList.remove(i18));
        return Lg(V0, 0) ? 0 : -1;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.d
    public void f(java.lang.String str, l75.w0 eventData) {
        kotlin.jvm.internal.o.g(eventData, "eventData");
        fs.g.b(com.tencent.mm.plugin.appbrand.appusage.c6.class, new com.tencent.mm.plugin.appbrand.widget.recent.g(str, eventData));
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.z5
    public int getCount() {
        return this.f91988g.getCount();
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.d
    public java.lang.Object k(java.lang.Object[] args) {
        kotlin.jvm.internal.o.g(args, "args");
        java.util.Iterator a17 = kotlin.jvm.internal.c.a(args);
        com.tencent.mm.plugin.appbrand.appusage.z5 z5Var = (com.tencent.mm.plugin.appbrand.appusage.z5) this.f91960d;
        kotlin.jvm.internal.b bVar = (kotlin.jvm.internal.b) a17;
        java.lang.Object next = bVar.next();
        kotlin.jvm.internal.o.e(next, "null cannot be cast to non-null type kotlin.Int");
        java.util.List xi6 = z5Var.xi(((java.lang.Integer) next).intValue(), (com.tencent.mm.plugin.appbrand.appusage.y5) bVar.next());
        return xi6 == null ? kz5.p0.f313996d : xi6;
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.z5
    public boolean m2(java.lang.String str, int i17) {
        return this.f91988g.m2(str, i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.z5
    public boolean nh(java.lang.String str, int i17) {
        return this.f91988g.nh(str, i17);
    }

    @Override // l75.l0
    public void remove(l75.q0 q0Var) {
        if (q0Var != null) {
            l(q0Var);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.z5
    public java.util.List xi(int i17, com.tencent.mm.plugin.appbrand.appusage.y5 y5Var) {
        return (java.util.List) i(java.lang.Integer.valueOf(i17), y5Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.z5
    public int y7() {
        return this.f91988g.y7();
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.z5
    public java.util.List ye(int i17, com.tencent.mm.plugin.appbrand.appusage.y5 y5Var, int i18) {
        return this.f91988g.ye(i17, y5Var, i18);
    }

    @Override // l75.l0
    public void add(l75.q0 q0Var) {
        if (q0Var != null) {
            b(q0Var);
        }
    }
}
