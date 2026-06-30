package ir2;

/* loaded from: classes2.dex */
public abstract class o implements mv2.w0 {

    /* renamed from: d, reason: collision with root package name */
    public final ir2.a1 f375721d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.y f375722e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.qt2 f375723f;

    /* renamed from: g, reason: collision with root package name */
    public final int f375724g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1600x6d921b3.C14599xd763cd7f f375725h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1600x6d921b3.C14600xc4484ec1 f375726i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1600x6d921b3.C14601xee587e44 f375727m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1600x6d921b3.C14598x4d725944 f375728n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f375729o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1600x6d921b3.C14597x793771de f375730p;

    /* JADX WARN: Type inference failed for: r3v2, types: [com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$feedDeleteListener$1] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$feedProgressListener$1] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$liveUninterestedListener$1] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$feedChangeListener$1] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$createLiveListener$1] */
    public o(ir2.a1 loader, p012xc85e97e9.p093xedfae76a.y lifeCycleOwner, r45.qt2 qt2Var, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        qt2Var = (i18 & 4) != 0 ? null : qt2Var;
        i17 = (i18 & 8) != 0 ? 0 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loader, "loader");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifeCycleOwner, "lifeCycleOwner");
        this.f375721d = loader;
        this.f375722e = lifeCycleOwner;
        this.f375723f = qt2Var;
        this.f375724g = i17;
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = lifeCycleOwner.mo273xed6858b4();
        p012xc85e97e9.p093xedfae76a.o oVar = mo273xed6858b4.b() != p012xc85e97e9.p093xedfae76a.n.DESTROYED ? mo273xed6858b4 : null;
        if (oVar != null) {
            oVar.a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$2
                @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
                /* renamed from: onDestroy */
                public final void m58544xac79a11b() {
                    ir2.o oVar2 = ir2.o.this;
                    oVar2.getClass();
                    ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
                    mv2.f0.f413094a.t(oVar2);
                    oVar2.f375725h.mo48814x2efc64();
                    oVar2.f375727m.mo48814x2efc64();
                    oVar2.f375728n.mo48814x2efc64();
                    oVar2.f375726i.mo48814x2efc64();
                    oVar2.f375730p.mo48814x2efc64();
                }
            });
        }
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f375725h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11>(a0Var) { // from class: com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$feedDeleteListener$1
            {
                this.f39173x3fe91575 = -108499199;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 c5437xe8b43b11) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 event = c5437xe8b43b11;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                pm0.v.X(new ir2.h(event, ir2.o.this));
                return false;
            }
        };
        this.f375726i = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f>(a0Var) { // from class: com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$feedProgressListener$1
            {
                this.f39173x3fe91575 = 1870727551;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f c5442xd807898f) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f event = c5442xd807898f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedProgressListener localId:");
                am.ga gaVar = event.f135783g;
                sb6.append(gaVar.f88282a);
                sb6.append(", progress:");
                sb6.append(gaVar.f88283b);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DefaultLoaderActions", sb6.toString());
                long j17 = gaVar.f88282a;
                ir2.o oVar2 = ir2.o.this;
                oVar2.getClass();
                if (j17 <= 0) {
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DefaultLoaderActions", "updateProgressByLocalId localId:" + j17);
                pm0.v.X(new ir2.n(oVar2, j17));
                return true;
            }
        };
        this.f375727m = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5502x94939ae6>(a0Var) { // from class: com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$liveUninterestedListener$1
            {
                this.f39173x3fe91575 = -1131845930;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5502x94939ae6 c5502x94939ae6) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5502x94939ae6 event = c5502x94939ae6;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                pm0.v.X(new ir2.j(ir2.o.this, event.f135834g.f88203a));
                return true;
            }
        };
        this.f375728n = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3>(a0Var) { // from class: com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$feedChangeListener$1
            {
                this.f39173x3fe91575 = 439877283;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 event = c5445x963cab3;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                pm0.v.V(0L, new ir2.g(event, ir2.o.this));
                return false;
            }
        };
        this.f375729o = new java.util.ArrayList();
        this.f375730p = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5289xa7f51752>(a0Var) { // from class: com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$createLiveListener$1
            {
                this.f39173x3fe91575 = -1194767550;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5289xa7f51752 c5289xa7f51752) {
                java.lang.Object obj;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5289xa7f51752 event = c5289xa7f51752;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createLiveListener localId:");
                am.o3 o3Var = event.f135609g;
                sb6.append(o3Var.f89042a);
                sb6.append(", progress:");
                sb6.append(o3Var.f89043b);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DefaultLoaderActions", sb6.toString());
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = o3Var.f89042a;
                if (c19792x256d2725 != null) {
                    ir2.o oVar2 = ir2.o.this;
                    java.util.Iterator it = ((java.util.ArrayList) oVar2.f375729o).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((java.lang.Number) obj).longValue() == c19792x256d2725.m76784x5db1b11()) {
                            break;
                        }
                    }
                    if (obj == null) {
                        ((java.util.ArrayList) oVar2.f375729o).add(java.lang.Long.valueOf(c19792x256d2725.m76784x5db1b11()));
                        oVar2.f375721d.Q6(oVar2.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 0)), 0, true);
                    }
                }
                return true;
            }
        };
    }

    public static final void c(ir2.o oVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        oVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(-1);
        arrayList.addAll(new java.util.ArrayList());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            if (intValue >= 0) {
                bu2.e0.f106031a.m(abstractC14490x69736cb5.mo2128x1ed62e84(), intValue, abstractC14490x69736cb5.getFeedObject().getFeedObject());
            }
        }
    }

    public static /* synthetic */ void g(ir2.o oVar, int i17, int i18, java.lang.Object obj, so2.j5 j5Var, int i19, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }
        if ((i19 & 4) != 0) {
            obj = null;
        }
        if ((i19 & 8) != 0) {
            j5Var = null;
        }
        oVar.f(i17, i18, obj, j5Var);
    }

    public static void i(ir2.o oVar, long j17, yz5.l lVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateItem");
        }
        if ((i17 & 2) != 0) {
            lVar = null;
        }
        oVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f17 = cu2.u.f303974a.f(j17);
        if (f17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DefaultLoaderActions", "updateItem localId:" + j17 + " itemLoadId:" + f17.m59260x51f8f5b0() + " itemId:" + f17.m59251x5db1b11());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 e17 = oVar.e(f17);
            if (lVar != null) {
                lVar.mo146xb9724478(e17);
            }
            oVar.h(e17, true);
        }
    }

    public abstract void d(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3);

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedObj, "feedObj");
        return cu2.u.f303974a.p(feedObj);
    }

    public final void f(int i17, int i18, java.lang.Object obj, so2.j5 j5Var) {
        ir2.a1 a1Var = this.f375721d;
        a1Var.getClass();
        pf5.e.m158343xd39de650(a1Var, null, null, new ir2.y0(i17, j5Var, obj, false, a1Var, null), 3, null);
    }

    public final void h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 newFeed, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newFeed, "newFeed");
        if (newFeed.getFeedObject().m59260x51f8f5b0() <= 0) {
            return;
        }
        this.f375721d.S6(new ir2.i(new ir2.m(newFeed, z17, this)));
    }

    @Override // mv2.w0
    /* renamed from: onPostErr */
    public void mo56114x385435c6(long j17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DefaultLoaderActions", "onPostEnd :" + j17);
        i(this, j17, null, 2, null);
    }

    @Override // mv2.w0
    /* renamed from: onPostFakeOk */
    public void mo56115x10614c10(long j17) {
        i(this, j17, null, 2, null);
    }

    @Override // mv2.w0
    /* renamed from: onPostNotify */
    public void mo56116x1ed18348(long j17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DefaultLoaderActions", "onPostNotify :" + j17);
        i(this, j17, null, 2, null);
    }

    @Override // mv2.w0
    /* renamed from: onPostOk */
    public void mo56117x5465d15b(long j17, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DefaultLoaderActions", "onPostOk :" + j17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(j18);
        if (h17 != null) {
            h17.m59392xc56a4324(j17);
        }
        if (h17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DefaultLoaderActions", "updateItem localId:" + j17 + " itemLoadId:" + h17.m59260x51f8f5b0() + " itemId:" + h17.m59251x5db1b11());
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(xc2.k0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            xc2.k0 k0Var = (xc2.k0) a17;
            java.util.List c17 = kz5.b0.c(h17);
            r45.qt2 qt2Var = this.f375723f;
            xc2.k0.f7(k0Var, c17, qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0, null, 0, null, null, 60, null);
            abstractC14490x69736cb5 = e(h17);
            h(abstractC14490x69736cb5, true);
        } else {
            abstractC14490x69736cb5 = null;
        }
        if (abstractC14490x69736cb5 != null) {
            abstractC14490x69736cb5.j1(true);
        }
    }

    @Override // mv2.w0
    /* renamed from: onPostStart */
    public void mo55429x74e3dc83(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DefaultLoaderActions", "onPostStart :" + j17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f17 = cu2.u.f303974a.f(j17);
        ir2.a1 a1Var = this.f375721d;
        java.util.List list = a1Var.f375624d;
        if (f17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 e17 = e(f17);
            if (e17.getFeedObject().m59317xe8cd5cb1()) {
                return;
            }
            if (this.f375724g == 1 && e17.h() == 2) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DefaultLoaderActions", "onPostStart localId " + j17 + " feed " + e17);
            e17.V1(hc2.s.b() ^ true);
            e17.X1(false);
            if (kz5.n0.Z(list) instanceof so2.i1) {
                pm0.v.X(new ir2.k(this, e17));
            } else {
                a1Var.Q6(e17, 0, true);
            }
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(zy2.b6.class).a(xc2.k0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            xc2.k0 k0Var = (xc2.k0) a17;
            java.util.List c17 = kz5.b0.c(f17);
            r45.qt2 qt2Var = this.f375723f;
            xc2.k0.f7(k0Var, c17, qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0, null, 0, null, null, 60, null);
        }
    }
}
