package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderEmojiListLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/p0", "com/tencent/mm/plugin/finder/feed/model/u0", "com/tencent/mm/plugin/finder/feed/model/v0", "com/tencent/mm/plugin/finder/feed/model/w0", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class FinderEmojiListLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f107398d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.w0 f107399e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.p0 f107400f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f107401g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f107402h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.wechat.aff.emoticon.s f107403i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.wechat.aff.emoticon.i f107404m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f107405n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f107406o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f107407p;

    public FinderEmojiListLoader(r45.qt2 qt2Var, boolean z17) {
        super(qt2Var);
        this.f107398d = z17;
        this.f107399e = com.tencent.mm.plugin.finder.feed.model.w0.f108419d;
        this.f107400f = com.tencent.mm.plugin.finder.feed.model.p0.f108237d;
        this.f107405n = new java.util.ArrayList();
    }

    public final void c(com.tencent.wechat.aff.emoticon.s sVar, com.tencent.wechat.aff.emoticon.i iVar) {
        java.util.List list = this.f107405n;
        boolean z17 = this.f107398d;
        if (z17 && iVar != null) {
            this.f107404m = iVar;
            java.util.ArrayList arrayList = iVar.f216646c;
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
        this.f107403i = sVar;
        java.util.ArrayList arrayList3 = sVar.f216665c;
        java.util.ArrayList arrayList4 = sVar.f216666d;
        java.util.ArrayList arrayList5 = sVar.f216667e;
        ((java.util.ArrayList) list).clear();
        if (z17) {
            return;
        }
        this.f107406o = !arrayList4.isEmpty();
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
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.le6);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            ((java.util.ArrayList) list).add(new js2.e(string, true));
            if (this.f107406o) {
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
        if (this.f107406o) {
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.le7);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            ((java.util.ArrayList) list).add(new js2.e(string2, false));
            java.util.ArrayList arrayList9 = new java.util.ArrayList(kz5.d0.q(arrayList4, 10));
            java.util.Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                arrayList9.add(new so2.n0((r45.ri0) it.next()));
            }
            ((java.util.ArrayList) list).addAll(arrayList9);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new com.tencent.mm.plugin.finder.feed.model.u0(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new com.tencent.mm.plugin.finder.feed.model.y0(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        yz5.a aVar;
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchDone(response);
        this.f107400f = getDataListJustForAdapter().size() > 0 ? com.tencent.mm.plugin.finder.feed.model.p0.f108239f : com.tencent.mm.plugin.finder.feed.model.p0.f108238e;
        if (isInitOperation(response)) {
            return;
        }
        if (!this.f107407p) {
            this.f107407p = true;
            yz5.a aVar2 = this.f107402h;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        }
        if (response.getHasMore() || (aVar = this.f107401g) == null) {
            return;
        }
        aVar.invoke();
    }
}
