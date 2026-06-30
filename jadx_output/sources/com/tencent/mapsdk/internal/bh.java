package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class bh {

    /* renamed from: l, reason: collision with root package name */
    private static final java.util.Comparator<com.tencent.mapsdk.internal.ez> f48944l = new java.util.Comparator<com.tencent.mapsdk.internal.ez>() { // from class: com.tencent.mapsdk.internal.bh.1
        private static int a(com.tencent.mapsdk.internal.ez ezVar, com.tencent.mapsdk.internal.ez ezVar2) {
            return ezVar.getLevel() != ezVar2.getLevel() ? java.lang.Float.compare(ezVar.getLevel(), ezVar2.getLevel()) : ezVar.getZIndex() != ezVar2.getZIndex() ? java.lang.Float.compare(ezVar.getZIndex(), ezVar2.getZIndex()) : java.lang.Long.compare(ezVar.o(), ezVar2.o());
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(com.tencent.mapsdk.internal.ez ezVar, com.tencent.mapsdk.internal.ez ezVar2) {
            com.tencent.mapsdk.internal.ez ezVar3 = ezVar;
            com.tencent.mapsdk.internal.ez ezVar4 = ezVar2;
            return ezVar3.getLevel() != ezVar4.getLevel() ? java.lang.Float.compare(ezVar3.getLevel(), ezVar4.getLevel()) : ezVar3.getZIndex() != ezVar4.getZIndex() ? java.lang.Float.compare(ezVar3.getZIndex(), ezVar4.getZIndex()) : java.lang.Long.compare(ezVar3.o(), ezVar4.o());
        }
    };

    /* renamed from: m, reason: collision with root package name */
    private static final java.util.Comparator<com.tencent.mapsdk.internal.ez> f48945m = new java.util.Comparator<com.tencent.mapsdk.internal.ez>() { // from class: com.tencent.mapsdk.internal.bh.2
        private static int a(com.tencent.mapsdk.internal.ez ezVar, com.tencent.mapsdk.internal.ez ezVar2) {
            return ezVar.getLevel() != ezVar2.getLevel() ? java.lang.Float.compare(ezVar2.getLevel(), ezVar.getLevel()) : ezVar.getZIndex() != ezVar2.getZIndex() ? java.lang.Float.compare(ezVar2.getZIndex(), ezVar.getZIndex()) : java.lang.Long.compare(ezVar2.o(), ezVar.o());
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(com.tencent.mapsdk.internal.ez ezVar, com.tencent.mapsdk.internal.ez ezVar2) {
            com.tencent.mapsdk.internal.ez ezVar3 = ezVar;
            com.tencent.mapsdk.internal.ez ezVar4 = ezVar2;
            return ezVar3.getLevel() != ezVar4.getLevel() ? java.lang.Float.compare(ezVar4.getLevel(), ezVar3.getLevel()) : ezVar3.getZIndex() != ezVar4.getZIndex() ? java.lang.Float.compare(ezVar4.getZIndex(), ezVar3.getZIndex()) : java.lang.Long.compare(ezVar4.o(), ezVar3.o());
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map<java.lang.String, com.tencent.mapsdk.internal.ez> f48946a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List<com.tencent.mapsdk.internal.ez> f48947b = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List<com.tencent.mapsdk.internal.ez> f48948c = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List<com.tencent.mapsdk.internal.ez> f48949d = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List<com.tencent.mapsdk.internal.ez> f48950e = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List<com.tencent.mapsdk.internal.ez> f48951f = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List<com.tencent.mapsdk.internal.ez> f48952g = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List<com.tencent.mapsdk.internal.ev> f48953h = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.az f48954i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.be f48955j;

    /* renamed from: k, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding f48956k;

    /* loaded from: classes13.dex */
    public enum a {
        ASC(com.tencent.mapsdk.internal.bh.f48944l),
        DESC(com.tencent.mapsdk.internal.bh.f48945m);


        /* renamed from: c, reason: collision with root package name */
        public final java.util.Comparator<com.tencent.mapsdk.internal.ez> f48960c;

        a(java.util.Comparator comparator) {
            this.f48960c = comparator;
        }

        private java.util.Comparator<com.tencent.mapsdk.internal.ez> a() {
            return this.f48960c;
        }
    }

    public bh(com.tencent.mapsdk.internal.az azVar, com.tencent.mapsdk.internal.bd bdVar) {
        this.f48954i = azVar;
        this.f48955j = new com.tencent.mapsdk.internal.be(bdVar);
    }

    private com.tencent.tencentmap.mapsdk.maps.model.Arc a(com.tencent.tencentmap.mapsdk.maps.model.ArcOptions arcOptions) {
        com.tencent.mapsdk.internal.pl plVar = new com.tencent.mapsdk.internal.pl(arcOptions, this.f48954i);
        com.tencent.mapsdk.internal.ar arVar = new com.tencent.mapsdk.internal.ar(plVar);
        this.f48946a.put(plVar.getId(), arVar);
        this.f48949d.add(arVar);
        a((com.tencent.mapsdk.internal.ev) plVar);
        return arVar;
    }

    private com.tencent.mapsdk.internal.ew b(com.tencent.mapsdk.internal.pp ppVar) {
        com.tencent.mapsdk.internal.ps psVar = new com.tencent.mapsdk.internal.ps((com.tencent.mapsdk.internal.tr) this.f48954i, ppVar);
        this.f48948c.add(psVar);
        return psVar;
    }

    private java.util.List<com.tencent.mapsdk.internal.ez> c(com.tencent.mapsdk.internal.bh.a aVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f48951f);
        arrayList.addAll(this.f48952g);
        java.util.Collections.sort(arrayList, aVar.f48960c);
        return arrayList;
    }

    private java.util.List<com.tencent.mapsdk.internal.ez> f() {
        return c(com.tencent.mapsdk.internal.bh.a.ASC);
    }

    private java.util.List<com.tencent.mapsdk.internal.ez> g() {
        return c(com.tencent.mapsdk.internal.bh.a.ASC);
    }

    private java.util.List<com.tencent.mapsdk.internal.ez> h() {
        return c(com.tencent.mapsdk.internal.bh.a.ASC);
    }

    private java.util.List<com.tencent.tencentmap.mapsdk.maps.model.Arc> i() {
        com.tencent.mapsdk.internal.bh.a aVar = com.tencent.mapsdk.internal.bh.a.ASC;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mapsdk.internal.ez ezVar : this.f48949d) {
            if (ezVar instanceof com.tencent.mapsdk.internal.ar) {
                arrayList.add((com.tencent.mapsdk.internal.ar) ezVar);
            }
        }
        java.util.Collections.sort(arrayList, aVar.f48960c);
        return new java.util.ArrayList(arrayList);
    }

    private java.util.List<com.tencent.mapsdk.internal.ew> j() {
        com.tencent.mapsdk.internal.bh.a aVar = com.tencent.mapsdk.internal.bh.a.ASC;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mapsdk.internal.ez ezVar : this.f48948c) {
            if (ezVar instanceof com.tencent.mapsdk.internal.am) {
                arrayList.add((com.tencent.mapsdk.internal.am) ezVar);
            }
        }
        java.util.Collections.sort(arrayList, aVar.f48960c);
        return new java.util.ArrayList(arrayList);
    }

    private java.util.List<com.tencent.tencentmap.mapsdk.maps.model.Polyline> k() {
        com.tencent.mapsdk.internal.bh.a aVar = com.tencent.mapsdk.internal.bh.a.ASC;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mapsdk.internal.ez ezVar : this.f48950e) {
            if (ezVar instanceof com.tencent.mapsdk.internal.ax) {
                arrayList.add((com.tencent.mapsdk.internal.ax) ezVar);
            }
        }
        java.util.Collections.sort(arrayList, aVar.f48960c);
        return new java.util.ArrayList(arrayList);
    }

    private java.util.List<com.tencent.tencentmap.mapsdk.maps.model.Circle> l() {
        com.tencent.mapsdk.internal.bh.a aVar = com.tencent.mapsdk.internal.bh.a.ASC;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mapsdk.internal.ez ezVar : this.f48952g) {
            if (ezVar instanceof com.tencent.mapsdk.internal.as) {
                arrayList.add((com.tencent.mapsdk.internal.as) ezVar);
            }
        }
        java.util.Collections.sort(arrayList, aVar.f48960c);
        return new java.util.ArrayList(arrayList);
    }

    private void m() {
        java.util.Iterator<com.tencent.mapsdk.internal.ez> it = this.f48946a.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private java.lang.Iterable<com.tencent.mapsdk.internal.ez> n() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f48946a.values());
        java.util.Collections.sort(arrayList, com.tencent.mapsdk.internal.bh.a.ASC.f48960c);
        return arrayList;
    }

    private java.lang.Iterable<com.tencent.mapsdk.internal.ez> o() {
        return this.f48946a.values();
    }

    private java.util.List<com.tencent.tencentmap.mapsdk.maps.model.Arc> d(com.tencent.mapsdk.internal.bh.a aVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mapsdk.internal.ez ezVar : this.f48949d) {
            if (ezVar instanceof com.tencent.mapsdk.internal.ar) {
                arrayList.add((com.tencent.mapsdk.internal.ar) ezVar);
            }
        }
        java.util.Collections.sort(arrayList, aVar.f48960c);
        return new java.util.ArrayList(arrayList);
    }

    private java.util.List<com.tencent.mapsdk.internal.ew> e(com.tencent.mapsdk.internal.bh.a aVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mapsdk.internal.ez ezVar : this.f48948c) {
            if (ezVar instanceof com.tencent.mapsdk.internal.am) {
                arrayList.add((com.tencent.mapsdk.internal.am) ezVar);
            }
        }
        java.util.Collections.sort(arrayList, aVar.f48960c);
        return new java.util.ArrayList(arrayList);
    }

    private java.util.List<com.tencent.tencentmap.mapsdk.maps.model.Marker> f(com.tencent.mapsdk.internal.bh.a aVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mapsdk.internal.ez ezVar : this.f48947b) {
            if (ezVar instanceof com.tencent.mapsdk.internal.av) {
                arrayList.add((com.tencent.mapsdk.internal.av) ezVar);
            }
        }
        java.util.Collections.sort(arrayList, aVar.f48960c);
        return new java.util.ArrayList(arrayList);
    }

    private java.util.List<com.tencent.tencentmap.mapsdk.maps.model.Polyline> g(com.tencent.mapsdk.internal.bh.a aVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mapsdk.internal.ez ezVar : this.f48950e) {
            if (ezVar instanceof com.tencent.mapsdk.internal.ax) {
                arrayList.add((com.tencent.mapsdk.internal.ax) ezVar);
            }
        }
        java.util.Collections.sort(arrayList, aVar.f48960c);
        return new java.util.ArrayList(arrayList);
    }

    private java.util.List<com.tencent.tencentmap.mapsdk.maps.model.Polygon> h(com.tencent.mapsdk.internal.bh.a aVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mapsdk.internal.ez ezVar : this.f48951f) {
            if (ezVar instanceof com.tencent.mapsdk.internal.aw) {
                arrayList.add((com.tencent.mapsdk.internal.aw) ezVar);
            }
        }
        java.util.Collections.sort(arrayList, aVar.f48960c);
        return new java.util.ArrayList(arrayList);
    }

    private boolean b(java.lang.String str) {
        com.tencent.mapsdk.internal.ao f_;
        com.tencent.mapsdk.internal.ez remove = this.f48946a.remove(str);
        if (remove != null) {
            if (remove instanceof com.tencent.mapsdk.internal.av) {
                this.f48947b.remove(remove);
            } else if (remove instanceof com.tencent.mapsdk.internal.ar) {
                this.f48949d.remove(remove);
            } else if (remove instanceof com.tencent.mapsdk.internal.ax) {
                this.f48950e.remove(remove);
            } else if (remove instanceof com.tencent.mapsdk.internal.as) {
                this.f48952g.remove(remove);
            } else if (remove instanceof com.tencent.mapsdk.internal.am) {
                this.f48948c.remove(remove);
            } else if (remove instanceof com.tencent.mapsdk.internal.aw) {
                this.f48951f.remove(remove);
            }
            if ((remove instanceof com.tencent.mapsdk.internal.au) && (f_ = ((com.tencent.mapsdk.internal.au) remove).f_()) != null) {
                this.f48953h.remove(f_);
            }
        }
        return remove != null;
    }

    public final java.util.List<com.tencent.tencentmap.mapsdk.maps.model.Polygon> c() {
        com.tencent.mapsdk.internal.bh.a aVar = com.tencent.mapsdk.internal.bh.a.ASC;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mapsdk.internal.ez ezVar : this.f48951f) {
            if (ezVar instanceof com.tencent.mapsdk.internal.aw) {
                arrayList.add((com.tencent.mapsdk.internal.aw) ezVar);
            }
        }
        java.util.Collections.sort(arrayList, aVar.f48960c);
        return new java.util.ArrayList(arrayList);
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.Circle a(com.tencent.tencentmap.mapsdk.maps.model.CircleOptions circleOptions) {
        com.tencent.mapsdk.internal.pm pmVar = new com.tencent.mapsdk.internal.pm(this.f48954i);
        pmVar.a(circleOptions);
        com.tencent.mapsdk.internal.as asVar = new com.tencent.mapsdk.internal.as(pmVar);
        this.f48946a.put(pmVar.getId(), asVar);
        this.f48952g.add(asVar);
        a((com.tencent.mapsdk.internal.ev) pmVar);
        return asVar;
    }

    private java.util.List<com.tencent.tencentmap.mapsdk.maps.model.Circle> i(com.tencent.mapsdk.internal.bh.a aVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mapsdk.internal.ez ezVar : this.f48952g) {
            if (ezVar instanceof com.tencent.mapsdk.internal.as) {
                arrayList.add((com.tencent.mapsdk.internal.as) ezVar);
            }
        }
        java.util.Collections.sort(arrayList, aVar.f48960c);
        return new java.util.ArrayList(arrayList);
    }

    private com.tencent.tencentmap.mapsdk.maps.model.Polygon a(com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions polygonOptions) {
        com.tencent.mapsdk.internal.pq pqVar = new com.tencent.mapsdk.internal.pq(this.f48954i, polygonOptions);
        com.tencent.mapsdk.internal.aw awVar = new com.tencent.mapsdk.internal.aw(pqVar);
        this.f48946a.put(pqVar.getId(), awVar);
        this.f48951f.add(awVar);
        a((com.tencent.mapsdk.internal.ev) pqVar);
        return awVar;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.Polyline a(com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions polylineOptions) {
        com.tencent.mapsdk.internal.pr prVar = new com.tencent.mapsdk.internal.pr(this.f48954i);
        prVar.setPolylineOptions(polylineOptions);
        com.tencent.mapsdk.internal.ax axVar = new com.tencent.mapsdk.internal.ax(prVar);
        this.f48946a.put(prVar.getId(), axVar);
        this.f48950e.add(axVar);
        a((com.tencent.mapsdk.internal.ev) prVar);
        return axVar;
    }

    private java.util.List<com.tencent.mapsdk.internal.ez> b(com.tencent.mapsdk.internal.bh.a aVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f48950e);
        arrayList.addAll(this.f48949d);
        java.util.Collections.sort(arrayList, aVar.f48960c);
        return arrayList;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.Marker a(com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions) {
        com.tencent.mapsdk.internal.tr trVar = (com.tencent.mapsdk.internal.tr) this.f48954i;
        com.tencent.mapsdk.internal.pp ppVar = new com.tencent.mapsdk.internal.pp(trVar, markerOptions);
        com.tencent.mapsdk.internal.av avVar = new com.tencent.mapsdk.internal.av(ppVar);
        this.f48946a.put(ppVar.getId(), avVar);
        this.f48947b.add(avVar);
        com.tencent.mapsdk.internal.pt ptVar = trVar.f52185af;
        if (ptVar != null) {
            ptVar.a(ppVar);
        }
        a((com.tencent.mapsdk.internal.ev) ppVar);
        return avVar;
    }

    public final java.util.List<com.tencent.tencentmap.mapsdk.maps.model.Marker> b() {
        com.tencent.mapsdk.internal.bh.a aVar = com.tencent.mapsdk.internal.bh.a.ASC;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mapsdk.internal.ez ezVar : this.f48947b) {
            if (ezVar instanceof com.tencent.mapsdk.internal.av) {
                arrayList.add((com.tencent.mapsdk.internal.av) ezVar);
            }
        }
        java.util.Collections.sort(arrayList, aVar.f48960c);
        return new java.util.ArrayList(arrayList);
    }

    private com.tencent.mapsdk.internal.ew a(com.tencent.mapsdk.internal.pp ppVar) {
        com.tencent.mapsdk.internal.pn pnVar = new com.tencent.mapsdk.internal.pn((com.tencent.mapsdk.internal.tr) this.f48954i, ppVar);
        this.f48946a.put(pnVar.getId(), pnVar);
        this.f48948c.add(pnVar);
        return pnVar;
    }

    private void b(com.tencent.mapsdk.internal.ez ezVar) {
        com.tencent.mapsdk.internal.be beVar = this.f48955j;
        if (ezVar != null) {
            synchronized (beVar.f48878a) {
                beVar.f48878a.remove(ezVar);
                beVar.f48879b.add(ezVar);
            }
        }
    }

    public final void a(com.tencent.mapsdk.internal.ev evVar) {
        if (evVar == null || evVar.s() == null) {
            return;
        }
        com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding indoorBuilding = this.f48956k;
        if (indoorBuilding != null) {
            evVar.a(indoorBuilding);
        } else {
            evVar.u();
        }
        this.f48953h.add(evVar);
    }

    public final com.tencent.mapsdk.internal.ez a(java.lang.String str) {
        return this.f48946a.get(str);
    }

    public final <T extends com.tencent.mapsdk.internal.ez> T a(java.lang.String str, java.lang.Class<T> cls) {
        T t17 = (T) this.f48946a.get(str);
        if (t17 == null || t17.getClass() != cls) {
            return null;
        }
        return t17;
    }

    public final void a() {
        synchronized (this) {
            java.util.Iterator<com.tencent.mapsdk.internal.ez> it = this.f48946a.values().iterator();
            while (it.hasNext()) {
                com.tencent.mapsdk.internal.ez next = it.next();
                if (next != null) {
                    next.remove();
                    it.remove();
                }
            }
        }
        this.f48947b.clear();
        this.f48948c.clear();
        this.f48949d.clear();
        this.f48952g.clear();
        this.f48950e.clear();
        this.f48951f.clear();
    }

    public final java.util.List<com.tencent.mapsdk.internal.ez> a(com.tencent.mapsdk.internal.bh.a aVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f48947b);
        java.util.Collections.sort(arrayList, aVar.f48960c);
        return arrayList;
    }

    public final boolean a(com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding indoorBuilding) {
        this.f48956k = indoorBuilding;
        boolean z17 = false;
        for (com.tencent.mapsdk.internal.ev evVar : this.f48953h) {
            if (evVar.s() != null) {
                z17 = true;
                if (indoorBuilding != null) {
                    evVar.a(indoorBuilding);
                } else {
                    evVar.u();
                }
            }
        }
        return z17;
    }

    private void a(com.tencent.mapsdk.internal.ez ezVar) {
        com.tencent.mapsdk.internal.be beVar = this.f48955j;
        synchronized (beVar.f48878a) {
            if (!beVar.f48878a.contains(ezVar)) {
                beVar.f48878a.add(ezVar);
            }
        }
        if (ezVar instanceof com.tencent.mapsdk.internal.ev) {
            a((com.tencent.mapsdk.internal.ev) ezVar);
        }
    }

    private void a(javax.microedition.khronos.opengles.GL10 gl10) {
        this.f48955j.a(gl10);
    }

    private boolean a(float f17, float f18) {
        return this.f48955j.a(f17, f18);
    }
}
