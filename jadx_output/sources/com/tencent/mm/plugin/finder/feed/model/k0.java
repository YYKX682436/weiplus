package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f108102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.l0 f108103e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f108104f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f108105g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f108106h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f108107i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f108108m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f108109n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(long j17, com.tencent.mm.plugin.finder.feed.model.l0 l0Var, boolean z17, int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3) {
        super(1);
        this.f108102d = j17;
        this.f108103e = l0Var;
        this.f108104f = z17;
        this.f108105g = i17;
        this.f108106h = str;
        this.f108107i = str2;
        this.f108108m = i18;
        this.f108109n = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List list;
        kz5.p0 p0Var;
        so2.j5 j5Var = (so2.j5) obj;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
        boolean z17 = baseFinderFeed != null && baseFinderFeed.getIsHistoryFeed();
        bu2.n nVar = bu2.n.f24550a;
        long j17 = this.f108102d;
        java.util.List e17 = nVar.e(j17, 0L);
        com.tencent.mm.plugin.finder.feed.model.l0 l0Var = this.f108103e;
        if (!z17) {
            if (!(e17 == null)) {
                com.tencent.mars.xlog.Log.i(l0Var.f108126h, "***preloadFirstPageComment has cache, feedId = ".concat(pm0.v.u(j17)));
                return jz5.f0.f302826a;
            }
        }
        boolean contains = l0Var.f108132q.contains(java.lang.Long.valueOf(j17));
        java.lang.String str = l0Var.f108126h;
        if (contains) {
            com.tencent.mars.xlog.Log.i(str, "***preloadFirstPageComment is loading, feedId = ".concat(pm0.v.u(j17)));
        } else {
            kz5.p0 p0Var2 = kz5.p0.f313996d;
            java.util.List y07 = ((c61.l7) i95.n0.c(c61.l7.class)).Ij().y0(j17);
            if (this.f108104f) {
                list = y07;
                p0Var = p0Var2;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : y07) {
                    if (((com.tencent.mm.plugin.finder.storage.yj0) obj2).Y0() != 0) {
                        arrayList.add(obj2);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj3 : y07) {
                    if (((com.tencent.mm.plugin.finder.storage.yj0) obj3).Y0() == 0) {
                        arrayList2.add(obj3);
                    }
                }
                list = arrayList2;
                p0Var = arrayList;
            }
            l0Var.f108132q.add(java.lang.Long.valueOf(j17));
            com.tencent.mars.xlog.Log.i(str, "***preloadFirstPageComment start request, pos = " + this.f108105g + ", feedId = " + pm0.v.u(j17) + ", isHistoryFeed = " + z17);
            boolean Y = g92.b.f269769e.Y();
            androidx.appcompat.app.AppCompatActivity context = l0Var.f108125g;
            if (Y) {
                long j18 = this.f108102d;
                java.lang.String str2 = this.f108106h;
                java.lang.String str3 = this.f108107i;
                int i17 = this.f108108m;
                java.lang.String str4 = this.f108109n;
                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Di(context, bu2.j.f24534a.h(j18));
                int i18 = l0Var.f108131p;
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                new db2.j4(j18, str2, str3, i17, i18, str4, null, null, 0L, false, nyVar != null ? nyVar.V6() : null, 3, 0, null, 0, 29632, null).l().q(new com.tencent.mm.plugin.finder.feed.model.h0(l0Var, j18, p0Var, str2, list)).f(l0Var);
            } else {
                long j19 = this.f108102d;
                java.lang.String str5 = this.f108106h;
                java.lang.String str6 = this.f108107i;
                int i19 = this.f108108m;
                java.lang.String str7 = this.f108109n;
                int i27 = this.f108105g;
                int i28 = l0Var.f108131p;
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                new db2.g4(j19, str6, i19, i28, str7, false, null, null, 0L, null, false, false, null, nyVar2 != null ? nyVar2.V6() : null, 2, null, false, null, null, null, null, null, 0, 0, null, null, false, str5, null, 402628576, null).l().q(new com.tencent.mm.plugin.finder.feed.model.f0(l0Var, j19, str5, p0Var, list, i27)).f(l0Var);
            }
        }
        return jz5.f0.f302826a;
    }
}
