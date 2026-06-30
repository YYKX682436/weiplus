package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class py implements com.tencent.mapsdk.internal.fh, com.tencent.tencentmap.mapsdk.maps.model.AoiLayer.OnAoiLayerLoadListener {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.ne f50842b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapPoiClickListener f50843c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List<com.tencent.mapsdk.internal.pw> f50841a = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map<java.lang.String, com.tencent.tencentmap.mapsdk.maps.model.AoiLayer.OnAoiLayerLoadListener> f50844d = new java.util.HashMap();

    public py(com.tencent.mapsdk.internal.ne neVar) {
        this.f50842b = neVar;
    }

    private com.tencent.mapsdk.internal.ne b() {
        return this.f50842b;
    }

    private void c() {
        this.f50843c = null;
        this.f50841a.clear();
        this.f50844d.clear();
    }

    @Override // com.tencent.mapsdk.internal.fh
    public final void a(com.tencent.mapsdk.internal.ga gaVar) {
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.AoiLayer.OnAoiLayerLoadListener
    public final void onAoiLayerLoaded(boolean z17, com.tencent.tencentmap.mapsdk.maps.model.AoiLayer aoiLayer) {
        com.tencent.mapsdk.internal.hg hgVar;
        if (aoiLayer == null || this.f50842b == null) {
            return;
        }
        com.tencent.tencentmap.mapsdk.maps.model.AoiLayer.OnAoiLayerLoadListener onAoiLayerLoadListener = this.f50844d.get(aoiLayer.getId());
        if (onAoiLayerLoadListener != null) {
            onAoiLayerLoadListener.onAoiLayerLoaded(z17, aoiLayer);
        }
        if (!z17 || (hgVar = this.f50842b.f49000c) == null) {
            return;
        }
        hgVar.g().f49677a++;
    }

    private com.tencent.mapsdk.internal.bn a() {
        return this.f50842b;
    }

    private com.tencent.tencentmap.mapsdk.maps.model.AoiLayer a(java.lang.String str, com.tencent.tencentmap.mapsdk.maps.model.AoiLayerOptions aoiLayerOptions, com.tencent.tencentmap.mapsdk.maps.model.AoiLayer.OnAoiLayerLoadListener onAoiLayerLoadListener) {
        com.tencent.mapsdk.internal.pw pwVar;
        java.util.Iterator<com.tencent.mapsdk.internal.pw> it = this.f50841a.iterator();
        while (true) {
            if (!it.hasNext()) {
                pwVar = null;
                break;
            }
            pwVar = it.next();
            if (pwVar.getId() != null && pwVar.getId().equals(str)) {
                break;
            }
        }
        if (pwVar == null) {
            pwVar = new com.tencent.mapsdk.internal.pw(this, str, aoiLayerOptions, this);
            this.f50841a.add(pwVar);
            if (onAoiLayerLoadListener != null) {
                this.f50844d.put(str, onAoiLayerLoadListener);
            }
        }
        pwVar.a(aoiLayerOptions);
        return pwVar;
    }

    private void a(com.tencent.mapsdk.internal.pw pwVar) {
        this.f50841a.remove(pwVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        r4 = com.tencent.mapsdk.internal.pw.a(r0.getId(), r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(com.tencent.mapsdk.engine.jni.models.TappedElement r11) {
        /*
            r10 = this;
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapPoiClickListener r0 = r10.f50843c
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            if (r11 == 0) goto L6d
            int r0 = r11.type
            r2 = 4
            if (r0 != r2) goto L6d
            long r2 = r11.itemId
            java.util.List<com.tencent.mapsdk.internal.pw> r11 = r10.f50841a
            java.util.Iterator r11 = r11.iterator()
        L15:
            boolean r0 = r11.hasNext()
            r4 = 0
            if (r0 == 0) goto L64
            java.lang.Object r0 = r11.next()
            com.tencent.mapsdk.internal.pw r0 = (com.tencent.mapsdk.internal.pw) r0
            com.tencent.mapsdk.internal.px r5 = r0.f50791b
            if (r5 == 0) goto L5a
            com.tencent.mapsdk.internal.px$d r5 = r5.f50810a
            if (r5 == 0) goto L5a
            java.util.List<com.tencent.mapsdk.internal.px$d> r5 = r5.f50828j
            if (r5 == 0) goto L5a
            java.util.Iterator r5 = r5.iterator()
        L32:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L5a
            java.lang.Object r6 = r5.next()
            com.tencent.mapsdk.internal.px$d r6 = (com.tencent.mapsdk.internal.px.d) r6
            com.tencent.mapsdk.internal.py r7 = r0.f50790a
            com.tencent.mapsdk.internal.ne r7 = r7.f50842b
            com.tencent.mapsdk.internal.bi r7 = r7.f50510j
            int r8 = r6.f50819a
            java.lang.Class<com.tencent.mapsdk.internal.oc> r9 = com.tencent.mapsdk.internal.oc.class
            com.tencent.mapsdk.internal.ng r7 = r7.a(r9, r8)
            com.tencent.mapsdk.internal.oc r7 = (com.tencent.mapsdk.internal.oc) r7
            if (r7 == 0) goto L32
            int r7 = r7.a()
            long r7 = (long) r7
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 != 0) goto L32
            r4 = r6
        L5a:
            if (r4 == 0) goto L15
            java.lang.String r11 = r0.getId()
            com.tencent.tencentmap.mapsdk.maps.model.SubPoi r4 = com.tencent.mapsdk.internal.pw.a(r11, r4)
        L64:
            if (r4 == 0) goto L6d
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapPoiClickListener r11 = r10.f50843c
            r11.onClicked(r4)
            r11 = 1
            return r11
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.py.a(com.tencent.mapsdk.engine.jni.models.TappedElement):boolean");
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapPoiClickListener onMapPoiClickListener) {
        this.f50843c = onMapPoiClickListener;
    }
}
