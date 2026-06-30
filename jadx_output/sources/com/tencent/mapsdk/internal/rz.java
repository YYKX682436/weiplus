package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class rz {

    /* renamed from: a, reason: collision with root package name */
    final java.util.Map<java.lang.String, com.tencent.mapsdk.internal.rz.a> f51306a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.bi f51307b;

    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final com.tencent.mapsdk.internal.oc f51308a;

        /* renamed from: b, reason: collision with root package name */
        final com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail f51309b;

        public a(com.tencent.mapsdk.internal.oc ocVar, com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail detail) {
            this.f51308a = ocVar;
            this.f51309b = detail;
        }
    }

    public rz(com.tencent.mapsdk.internal.bi biVar) {
        this.f51307b = biVar;
    }

    private java.util.Map<java.lang.String, com.tencent.mapsdk.internal.rz.a> b() {
        return this.f51306a;
    }

    private void c() {
        a();
    }

    public final void a(java.util.List<com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail> list) {
        int i17;
        if (this.f51307b == null || list.isEmpty()) {
            return;
        }
        for (com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail detail : list) {
            java.lang.String str = detail.basic.icon_normal;
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf != -1 && (i17 = lastIndexOf + 1) <= str.length()) {
                java.lang.String substring = str.substring(i17);
                com.tencent.mapsdk.core.utils.log.LogUtil.a(com.tencent.mapsdk.internal.kx.f50213n, "type:" + detail.basic.type + ", coord:" + detail.basic.coord_lat + ", " + detail.basic.coord_lon + ", minScale:" + detail.basic.min_scale + ", maxScale:" + detail.basic.max_scale);
                com.tencent.mapsdk.internal.rz.a aVar = this.f51306a.get(detail.basic.eventid);
                if (aVar == null) {
                    com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Basic basic = detail.basic;
                    com.tencent.mapsdk.internal.oe oeVar = new com.tencent.mapsdk.internal.oe(basic.coord_lat, basic.coord_lon, substring);
                    com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Basic basic2 = detail.basic;
                    oeVar.anchor(basic2.anchor_x, basic2.anchor_y);
                    oeVar.minScaleLevel(detail.basic.min_scale);
                    oeVar.maxScaleLevel(detail.basic.max_scale);
                    oeVar.avoidAnnotation(true);
                    oeVar.avoidOtherMarker(true);
                    oeVar.displayLevel(2);
                    this.f51306a.put(detail.basic.eventid, new com.tencent.mapsdk.internal.rz.a((com.tencent.mapsdk.internal.oc) this.f51307b.a((com.tencent.mapsdk.internal.bi) oeVar), detail));
                } else {
                    com.tencent.mapsdk.internal.oe oeVar2 = (com.tencent.mapsdk.internal.oe) aVar.f51308a.f50567d;
                    com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Basic basic3 = detail.basic;
                    oeVar2.position(basic3.coord_lat, basic3.coord_lon);
                    oeVar2.iconName(substring);
                    oeVar2.avoidAnnotation(true);
                    oeVar2.avoidOtherMarker(true);
                    com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Basic basic4 = detail.basic;
                    oeVar2.anchor(basic4.anchor_x, basic4.anchor_y);
                    oeVar2.minScaleLevel(detail.basic.min_scale);
                    oeVar2.maxScaleLevel(detail.basic.max_scale);
                    oeVar2.displayLevel(2);
                    aVar.f51308a.a((com.tencent.mapsdk.internal.oc) oeVar2);
                }
            }
        }
    }

    public final void b(java.util.List<com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail> list) {
        if (list.isEmpty()) {
            return;
        }
        for (com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail detail : list) {
            com.tencent.mapsdk.internal.rz.a aVar = this.f51306a.get(detail.basic.eventid);
            if (aVar != null) {
                aVar.f51308a.remove();
                this.f51306a.remove(detail.basic.eventid);
            }
        }
    }

    public final void a() {
        java.util.Iterator<java.lang.String> it = this.f51306a.keySet().iterator();
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.rz.a aVar = this.f51306a.get(it.next());
            if (aVar != null) {
                aVar.f51308a.remove();
            }
        }
        this.f51306a.clear();
    }
}
