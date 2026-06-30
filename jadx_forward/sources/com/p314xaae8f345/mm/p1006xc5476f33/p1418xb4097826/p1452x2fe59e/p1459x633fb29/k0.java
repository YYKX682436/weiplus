package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f189635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 f189636e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f189637f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f189638g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189639h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189640i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f189641m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189642n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 l0Var, boolean z17, int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3) {
        super(1);
        this.f189635d = j17;
        this.f189636e = l0Var;
        this.f189637f = z17;
        this.f189638g = i17;
        this.f189639h = str;
        this.f189640i = str2;
        this.f189641m = i18;
        this.f189642n = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List list;
        kz5.p0 p0Var;
        so2.j5 j5Var = (so2.j5) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
        boolean z17 = abstractC14490x69736cb5 != null && abstractC14490x69736cb5.getIsHistoryFeed();
        bu2.n nVar = bu2.n.f106083a;
        long j17 = this.f189635d;
        java.util.List e17 = nVar.e(j17, 0L);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 l0Var = this.f189636e;
        if (!z17) {
            if (!(e17 == null)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.f189659h, "***preloadFirstPageComment has cache, feedId = ".concat(pm0.v.u(j17)));
                return jz5.f0.f384359a;
            }
        }
        boolean contains = l0Var.f189665q.contains(java.lang.Long.valueOf(j17));
        java.lang.String str = l0Var.f189659h;
        if (contains) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "***preloadFirstPageComment is loading, feedId = ".concat(pm0.v.u(j17)));
        } else {
            kz5.p0 p0Var2 = kz5.p0.f395529d;
            java.util.List y07 = ((c61.l7) i95.n0.c(c61.l7.class)).Ij().y0(j17);
            if (this.f189637f) {
                list = y07;
                p0Var = p0Var2;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : y07) {
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0) obj2).Y0() != 0) {
                        arrayList.add(obj2);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj3 : y07) {
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0) obj3).Y0() == 0) {
                        arrayList2.add(obj3);
                    }
                }
                list = arrayList2;
                p0Var = arrayList;
            }
            l0Var.f189665q.add(java.lang.Long.valueOf(j17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "***preloadFirstPageComment start request, pos = " + this.f189638g + ", feedId = " + pm0.v.u(j17) + ", isHistoryFeed = " + z17);
            boolean Y = g92.b.f351302e.Y();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = l0Var.f189658g;
            if (Y) {
                long j18 = this.f189635d;
                java.lang.String str2 = this.f189639h;
                java.lang.String str3 = this.f189640i;
                int i17 = this.f189641m;
                java.lang.String str4 = this.f189642n;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Di(context, bu2.j.f106067a.h(j18));
                int i18 = l0Var.f189664p;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                new db2.j4(j18, str2, str3, i17, i18, str4, null, null, 0L, false, nyVar != null ? nyVar.V6() : null, 3, 0, null, 0, 29632, null).l().q(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.h0(l0Var, j18, p0Var, str2, list)).f(l0Var);
            } else {
                long j19 = this.f189635d;
                java.lang.String str5 = this.f189639h;
                java.lang.String str6 = this.f189640i;
                int i19 = this.f189641m;
                java.lang.String str7 = this.f189642n;
                int i27 = this.f189638g;
                int i28 = l0Var.f189664p;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                new db2.g4(j19, str6, i19, i28, str7, false, null, null, 0L, null, false, false, null, nyVar2 != null ? nyVar2.V6() : null, 2, null, false, null, null, null, null, null, 0, 0, null, null, false, str5, null, 402628576, null).l().q(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f0(l0Var, j19, str5, p0Var, list, i27)).f(l0Var);
            }
        }
        return jz5.f0.f384359a;
    }
}
