package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderEmojiListLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/p0", "com/tencent/mm/plugin/finder/feed/model/u0", "com/tencent/mm/plugin/finder/feed/model/v0", "com/tencent/mm/plugin/finder/feed/model/w0", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderEmojiListLoader */
/* loaded from: classes15.dex */
public final class C13857x71711a11 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f188931d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.w0 f188932e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p0 f188933f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f188934g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f188935h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.s f188936i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.i f188937m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f188938n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f188939o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f188940p;

    public C13857x71711a11(r45.qt2 qt2Var, boolean z17) {
        super(qt2Var);
        this.f188931d = z17;
        this.f188932e = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.w0.f189952d;
        this.f188933f = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p0.f189770d;
        this.f188938n = new java.util.ArrayList();
    }

    public final void c(com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.s sVar, com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.i iVar) {
        java.util.List list = this.f188938n;
        boolean z17 = this.f188931d;
        if (z17 && iVar != null) {
            this.f188937m = iVar;
            java.util.ArrayList arrayList = iVar.f298179c;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            int i17 = 0;
            for (java.lang.Object obj : arrayList) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                arrayList2.add(new so2.p((bw5.ra) obj, i17 != 0));
                i17 = i18;
            }
            ((java.util.ArrayList) list).addAll(arrayList2);
            return;
        }
        if (sVar == null) {
            return;
        }
        this.f188936i = sVar;
        java.util.ArrayList arrayList3 = sVar.f298198c;
        java.util.ArrayList arrayList4 = sVar.f298199d;
        java.util.ArrayList arrayList5 = sVar.f298200e;
        ((java.util.ArrayList) list).clear();
        if (z17) {
            return;
        }
        this.f188939o = !arrayList4.isEmpty();
        if (arrayList4.isEmpty() && arrayList5.isEmpty()) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
            int i19 = 0;
            for (java.lang.Object obj2 : arrayList3) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                arrayList6.add(new so2.p((bw5.ra) obj2, i19 != 0));
                i19 = i27;
            }
            ((java.util.ArrayList) list).addAll(arrayList6);
            return;
        }
        if (!arrayList5.isEmpty()) {
            ((java.util.ArrayList) list).add(new so2.l0(arrayList5));
        }
        if (!arrayList3.isEmpty()) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.le6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            ((java.util.ArrayList) list).add(new js2.e(string, true));
            if (this.f188939o) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
                int i28 = 0;
                for (java.lang.Object obj3 : arrayList3) {
                    int i29 = i28 + 1;
                    if (i28 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    arrayList7.add(new so2.p((bw5.ra) obj3, i28 != 0));
                    i28 = i29;
                }
                ((java.util.ArrayList) list).addAll(kz5.n0.K0(arrayList7, 5));
                if (arrayList3.size() >= 5) {
                    ((java.util.ArrayList) list).add(new js2.d());
                }
            } else {
                java.util.ArrayList arrayList8 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
                int i37 = 0;
                for (java.lang.Object obj4 : arrayList3) {
                    int i38 = i37 + 1;
                    if (i37 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    arrayList8.add(new so2.p((bw5.ra) obj4, i37 != 0));
                    i37 = i38;
                }
                ((java.util.ArrayList) list).addAll(arrayList8);
            }
        }
        if (this.f188939o) {
            java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.le7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            ((java.util.ArrayList) list).add(new js2.e(string2, false));
            java.util.ArrayList arrayList9 = new java.util.ArrayList(kz5.d0.q(arrayList4, 10));
            java.util.Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                arrayList9.add(new so2.n0((r45.ri0) it.next()));
            }
            ((java.util.ArrayList) list).addAll(arrayList9);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: createDataFetch */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 mo55585x919c3b94() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.u0(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13922x2e8bf6c7
    /* renamed from: createDataMerger */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0 mo55748xaddc49a0() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y0(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0
    /* renamed from: onFetchDone */
    public void mo55587xb461ee3d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        yz5.a aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        super.mo55587xb461ee3d(response);
        this.f188933f = m56388xcaeb60d0().size() > 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p0.f189772f : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p0.f189771e;
        if (m56362x40f3992d(response)) {
            return;
        }
        if (!this.f188940p) {
            this.f188940p = true;
            yz5.a aVar2 = this.f188935h;
            if (aVar2 != null) {
                aVar2.mo152xb9724478();
            }
        }
        if (response.getHasMore() || (aVar = this.f188934g) == null) {
            return;
        }
        aVar.mo152xb9724478();
    }
}
