package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class pt extends com.tencent.map.lib.models.MapExploreByTouchHelper implements com.tencent.mapsdk.internal.fq {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> f50780a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> f50781b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mapsdk.internal.tr f50782c;

    /* renamed from: d, reason: collision with root package name */
    private android.os.Handler f50783d;

    public pt(android.view.View view, com.tencent.mapsdk.internal.tr trVar) {
        super(view);
        this.f50780a = new java.util.ArrayList();
        this.f50781b = new java.util.ArrayList();
        this.f50783d = new android.os.Handler();
        this.f50782c = trVar;
        ((com.tencent.mapsdk.vector.VectorMap) trVar.e_).a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r2.getBounds().contains((int) r6, (int) r7) != false) goto L16;
     */
    @Override // com.tencent.map.lib.models.MapExploreByTouchHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getTargetPoiItemIdx(float r6, float r7) {
        /*
            r5 = this;
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r5.accessibleTouchItems
            r1 = -1
            if (r0 == 0) goto L5b
            int r0 = r0.size()
            if (r0 <= 0) goto L5b
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r5.accessibleTouchItems
            if (r0 == 0) goto L36
            int r0 = r0.size()
            if (r0 <= 0) goto L36
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r5.accessibleTouchItems
            int r0 = r0.size()
            int r0 = r0 + (-1)
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r2 = r5.accessibleTouchItems
            java.lang.Object r2 = r2.get(r0)
            com.tencent.map.lib.models.AccessibleTouchItem r2 = (com.tencent.map.lib.models.AccessibleTouchItem) r2
            boolean r3 = r2 instanceof com.tencent.mapsdk.internal.pu
            if (r3 == 0) goto L36
            android.graphics.Rect r2 = r2.getBounds()
            int r3 = (int) r6
            int r4 = (int) r7
            boolean r2 = r2.contains(r3, r4)
            if (r2 == 0) goto L36
            goto L37
        L36:
            r0 = r1
        L37:
            if (r0 == r1) goto L3a
            return r0
        L3a:
            r0 = 0
        L3b:
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r2 = r5.accessibleTouchItems
            int r2 = r2.size()
            if (r0 >= r2) goto L5b
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r2 = r5.accessibleTouchItems
            java.lang.Object r2 = r2.get(r0)
            com.tencent.map.lib.models.AccessibleTouchItem r2 = (com.tencent.map.lib.models.AccessibleTouchItem) r2
            android.graphics.Rect r2 = r2.getBounds()
            int r3 = (int) r6
            int r4 = (int) r7
            boolean r2 = r2.contains(r3, r4)
            if (r2 == 0) goto L58
            return r0
        L58:
            int r0 = r0 + 1
            goto L3b
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.pt.getTargetPoiItemIdx(float, float):int");
    }

    @Override // com.tencent.map.lib.models.MapExploreByTouchHelper
    public final boolean onItemClicked(int i17) {
        com.tencent.map.lib.models.AccessibleTouchItem accessibleTouchItem;
        if (i17 >= this.accessibleTouchItems.size() || (accessibleTouchItem = this.accessibleTouchItems.get(i17)) == null) {
            return false;
        }
        invalidateVirtualView(i17);
        sendEventForVirtualView(i17, 1);
        accessibleTouchItem.onClick();
        return true;
    }

    @Override // com.tencent.map.lib.models.MapExploreByTouchHelper
    public final void onTalkBackActivate(android.view.View view) {
        super.onTalkBackActivate(view);
        ((com.tencent.mapsdk.vector.VectorMap) this.f50782c.e_).a(this);
        u();
    }

    @Override // com.tencent.map.lib.models.MapExploreByTouchHelper
    public final void onTalkBackDeActivate(android.view.View view) {
        super.onTalkBackDeActivate(view);
        ((com.tencent.mapsdk.vector.VectorMap) this.f50782c.e_).b(this);
    }

    @Override // com.tencent.mapsdk.internal.fq
    public final void u() {
        this.f50783d.post(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.pt.1
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mapsdk.internal.pt.this.accessibleTouchItems.clear();
                com.tencent.mapsdk.internal.pt.this.f50780a.clear();
                com.tencent.mapsdk.internal.pt.this.f50781b.clear();
                if (com.tencent.mapsdk.internal.pt.this.f50782c != null) {
                    java.util.List<com.tencent.mapsdk.internal.an> ai6 = com.tencent.mapsdk.internal.pt.this.f50782c.ai();
                    com.tencent.mapsdk.internal.tr trVar = com.tencent.mapsdk.internal.pt.this.f50782c;
                    trVar.f52187ah.clear();
                    com.tencent.mapsdk.internal.ne neVar = ((com.tencent.mapsdk.vector.VectorMap) trVar.e_).f52512o;
                    com.tencent.mapsdk.internal.an anVar = null;
                    java.util.ArrayList<com.tencent.tencentmap.mapsdk.maps.model.MapPoi> Q = neVar == null ? null : neVar.Q();
                    trVar.f52187ah = Q;
                    if (ai6 != null) {
                        for (com.tencent.mapsdk.internal.an anVar2 : ai6) {
                            java.lang.String contentDescription = anVar2.getContentDescription();
                            if (!com.tencent.mapsdk.internal.hr.a(contentDescription)) {
                                if (contentDescription.startsWith(com.tencent.map.lib.models.AccessibleTouchItem.MY_LOCATION_PREFIX)) {
                                    anVar = anVar2;
                                } else {
                                    com.tencent.mapsdk.internal.pt.this.f50780a.add(new com.tencent.mapsdk.internal.pu(com.tencent.mapsdk.internal.pt.this.f50782c, anVar2));
                                }
                            }
                        }
                        java.util.Collections.sort(com.tencent.mapsdk.internal.pt.this.f50780a);
                        com.tencent.mapsdk.internal.pt.this.accessibleTouchItems.addAll(com.tencent.mapsdk.internal.pt.this.f50780a);
                    }
                    if (Q != null) {
                        for (com.tencent.tencentmap.mapsdk.maps.model.MapPoi mapPoi : Q) {
                            if (!com.tencent.mapsdk.internal.hr.a(mapPoi.getName())) {
                                com.tencent.mapsdk.internal.pt.this.f50781b.add(new com.tencent.mapsdk.internal.pv(com.tencent.mapsdk.internal.pt.this.f50782c, mapPoi));
                            }
                        }
                        java.util.Collections.sort(com.tencent.mapsdk.internal.pt.this.f50781b);
                        com.tencent.mapsdk.internal.pt.this.accessibleTouchItems.addAll(com.tencent.mapsdk.internal.pt.this.f50781b);
                    }
                    if (anVar != null) {
                        com.tencent.mapsdk.internal.pt.this.accessibleTouchItems.add(new com.tencent.mapsdk.internal.pu(com.tencent.mapsdk.internal.pt.this.f50782c, anVar));
                    }
                }
            }
        });
    }

    private int a(float f17, float f18) {
        java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> list = this.accessibleTouchItems;
        if (list == null || list.size() <= 0) {
            return -1;
        }
        int size = this.accessibleTouchItems.size() - 1;
        com.tencent.map.lib.models.AccessibleTouchItem accessibleTouchItem = this.accessibleTouchItems.get(size);
        if ((accessibleTouchItem instanceof com.tencent.mapsdk.internal.pu) && accessibleTouchItem.getBounds().contains((int) f17, (int) f18)) {
            return size;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if ((r7 instanceof com.tencent.mapsdk.internal.pu) != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.tencent.mapsdk.internal.pp r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r7.getContentDescription()
            boolean r1 = com.tencent.mapsdk.internal.hr.a(r0)
            if (r1 == 0) goto Le
            return
        Le:
            com.tencent.mapsdk.internal.tr r1 = r7.F
            r2 = 1
            if (r1 == 0) goto L35
            android.graphics.Rect r1 = r7.j()
            com.tencent.mapsdk.internal.tr r3 = r7.F
            int r3 = r3.aj()
            com.tencent.mapsdk.internal.tr r4 = r7.F
            int r4 = r4.ak()
            int r5 = r1.left
            if (r5 < 0) goto L35
            int r5 = r1.top
            if (r5 < 0) goto L35
            int r5 = r1.right
            if (r5 > r3) goto L35
            int r1 = r1.bottom
            if (r1 > r4) goto L35
            r1 = r2
            goto L36
        L35:
            r1 = 0
        L36:
            if (r1 != 0) goto L39
            return
        L39:
            com.tencent.mapsdk.internal.pu r1 = new com.tencent.mapsdk.internal.pu
            com.tencent.mapsdk.internal.tr r3 = r6.f50782c
            r1.<init>(r3, r7)
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r7 = r6.accessibleTouchItems
            int r7 = r7.size()
            if (r7 <= 0) goto L5c
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r7 = r6.accessibleTouchItems
            int r3 = r7.size()
            int r3 = r3 - r2
            java.lang.Object r7 = r7.get(r3)
            com.tencent.map.lib.models.AccessibleTouchItem r7 = (com.tencent.map.lib.models.AccessibleTouchItem) r7
            if (r7 == 0) goto L5c
            boolean r2 = r7 instanceof com.tencent.mapsdk.internal.pu
            if (r2 == 0) goto L5c
            goto L5d
        L5c:
            r7 = 0
        L5d:
            java.lang.String r2 = "我的位置"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L6c
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r7 = r6.accessibleTouchItems
            r7.add(r1)
            return
        L6c:
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r6.accessibleTouchItems
            r0.clear()
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r6.f50780a
            r0.add(r1)
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r6.f50780a
            java.util.Collections.sort(r0)
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r6.accessibleTouchItems
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r1 = r6.f50780a
            r0.addAll(r1)
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r6.accessibleTouchItems
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r1 = r6.f50781b
            r0.addAll(r1)
            if (r7 == 0) goto L90
            java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> r0 = r6.accessibleTouchItems
            r0.add(r7)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.pt.a(com.tencent.mapsdk.internal.pp):void");
    }

    private void a() {
        ((com.tencent.mapsdk.vector.VectorMap) this.f50782c.e_).b(this);
        this.accessibleTouchItems.clear();
        this.f50780a.clear();
        this.f50781b.clear();
    }
}
