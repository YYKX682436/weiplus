package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class rj implements com.tencent.mapsdk.internal.ce {

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f51178b = "PromoteImageLayer";

    /* renamed from: a, reason: collision with root package name */
    final java.util.Map<com.tencent.mapsdk.internal.cc, java.lang.Long> f51179a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private boolean f51180c;

    /* renamed from: d, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.CameraPosition f51181d;

    /* renamed from: e, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.cd f51182e;

    public rj(com.tencent.mapsdk.internal.cd cdVar) {
        this.f51182e = cdVar;
    }

    private long b(com.tencent.mapsdk.internal.cc ccVar) {
        com.tencent.mapsdk.internal.bd bdVar = (com.tencent.mapsdk.internal.bd) this.f51182e.getMapContext();
        java.lang.Long l17 = this.f51179a.get(ccVar);
        if (l17 == null || l17.longValue() == 0) {
            return 0L;
        }
        com.tencent.tencentmap.mapsdk.maps.model.LatLng b17 = ccVar.b();
        com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor b18 = ccVar.b(this.f51180c);
        bdVar.i().a(l17.longValue(), new com.tencent.map.lib.models.MarkerInfo(b17.latitude, b17.longitude, b18.getBDId()).displayLevel(2).iconWidth(b18.getWidth()).iconHeight(b18.getHeight()).minScaleLevel(ccVar.d().f49573b).maxScaleLevel(ccVar.d().f49574c).interactive(false).priority(ccVar.c()));
        return l17.longValue();
    }

    private void c(com.tencent.mapsdk.internal.cc ccVar) {
        com.tencent.mapsdk.internal.bd bdVar = (com.tencent.mapsdk.internal.bd) this.f51182e.getMapContext();
        java.lang.Long remove = this.f51179a.remove(ccVar);
        if (remove == null || remove.longValue() == 0) {
            return;
        }
        bdVar.i().b(remove.longValue());
    }

    @Override // com.tencent.mapsdk.internal.ce
    public final void a() {
        com.tencent.mapsdk.core.utils.log.LogUtil.b(f51178b, "initLayer ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mapsdk.internal.ce
    public final void a(com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition, boolean z17) {
        this.f51180c = z17;
        this.f51181d = cameraPosition;
        com.tencent.mapsdk.internal.bd bdVar = (com.tencent.mapsdk.internal.bd) this.f51182e.getMapContext();
        com.tencent.mapsdk.internal.hg hgVar = ((com.tencent.mapsdk.internal.bn) bdVar).f49000c;
        com.tencent.tencentmap.mapsdk.maps.model.VisibleRegion visibleRegion = bdVar.d().getMap().getProjection().getVisibleRegion();
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(com.tencent.mapsdk.internal.y.c(visibleRegion.farLeft));
        hashSet.add(com.tencent.mapsdk.internal.y.c(visibleRegion.farRight));
        hashSet.add(com.tencent.mapsdk.internal.y.c(visibleRegion.nearRight));
        hashSet.add(com.tencent.mapsdk.internal.y.c(visibleRegion.nearLeft));
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.v.c cVar = (com.tencent.mapsdk.internal.v.c) it.next();
            java.util.List<com.tencent.mapsdk.internal.cc> a17 = this.f51182e.d().a(cVar.f52445a, cVar.f52446b, cVar.f52447c);
            if (a17 != null) {
                for (com.tencent.mapsdk.internal.cc ccVar : a17) {
                    com.tencent.mapsdk.internal.cc.a g17 = ccVar.g();
                    com.tencent.mapsdk.internal.cc.a aVar = com.tencent.mapsdk.internal.cc.a.ADD;
                    if (g17 == aVar && ccVar.d().a((int) cameraPosition.zoom) && visibleRegion.latLngBounds.contains(ccVar.b())) {
                        if (hgVar != null) {
                            hgVar.r().a(ccVar.a());
                        }
                        ccVar.a(com.tencent.mapsdk.internal.cc.a.SHOWING);
                    } else if (ccVar.g() == com.tencent.mapsdk.internal.cc.a.SHOWING && (!visibleRegion.latLngBounds.contains(ccVar.b()) || !ccVar.d().a((int) cameraPosition.zoom))) {
                        ccVar.a(aVar);
                    }
                }
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.ce
    public final void c() {
        com.tencent.mapsdk.core.utils.log.LogUtil.b(f51178b, "destroyLayer ");
        com.tencent.mapsdk.internal.bd bdVar = (com.tencent.mapsdk.internal.bd) this.f51182e.getMapContext();
        for (java.lang.Long l17 : this.f51179a.values()) {
            if (l17 != null && l17.longValue() != 0) {
                bdVar.i().b(l17.longValue());
            }
        }
        this.f51179a.clear();
    }

    @Override // com.tencent.mapsdk.internal.ce
    public final java.util.List<com.tencent.mapsdk.internal.ce.b> b() {
        return com.tencent.mapsdk.internal.hq.a((java.lang.Iterable) this.f51179a.keySet(), (com.tencent.mapsdk.internal.hq.h) new com.tencent.mapsdk.internal.hq.h<com.tencent.mapsdk.internal.cc, com.tencent.mapsdk.internal.ce.b>() { // from class: com.tencent.mapsdk.internal.rj.1

            /* renamed from: b, reason: collision with root package name */
            int f51183b;

            @Override // com.tencent.mapsdk.internal.hq.h
            public final /* synthetic */ com.tencent.mapsdk.internal.ce.b a(com.tencent.mapsdk.internal.cc ccVar) {
                com.tencent.mapsdk.internal.cc ccVar2 = ccVar;
                com.tencent.mapsdk.internal.ce.b bVar = new com.tencent.mapsdk.internal.ce.b();
                bVar.f49127c = ccVar2.g() == com.tencent.mapsdk.internal.cc.a.SHOWING;
                bVar.f49126b = ccVar2.b();
                java.lang.Long l17 = com.tencent.mapsdk.internal.rj.this.f51179a.get(ccVar2);
                int i17 = this.f51183b;
                this.f51183b = i17 + 1;
                bVar.f49128d = i17;
                if (l17 == null) {
                    return null;
                }
                bVar.f49125a = l17.longValue();
                return bVar;
            }

            /* renamed from: a, reason: avoid collision after fix types in other method */
            private com.tencent.mapsdk.internal.ce.b a2(com.tencent.mapsdk.internal.cc ccVar) {
                com.tencent.mapsdk.internal.ce.b bVar = new com.tencent.mapsdk.internal.ce.b();
                bVar.f49127c = ccVar.g() == com.tencent.mapsdk.internal.cc.a.SHOWING;
                bVar.f49126b = ccVar.b();
                java.lang.Long l17 = com.tencent.mapsdk.internal.rj.this.f51179a.get(ccVar);
                int i17 = this.f51183b;
                this.f51183b = i17 + 1;
                bVar.f49128d = i17;
                if (l17 == null) {
                    return null;
                }
                bVar.f49125a = l17.longValue();
                return bVar;
            }
        });
    }

    @Override // com.tencent.mapsdk.internal.ce
    public final com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor a(com.tencent.mapsdk.internal.cc ccVar, byte[] bArr, boolean z17, boolean z18) {
        float o17 = com.tencent.mapsdk.internal.hn.o() * 4.0f;
        float o18 = com.tencent.mapsdk.internal.hn.o() * 1.5f;
        android.util.Pair<java.lang.Integer, java.lang.Integer> e17 = ccVar.e();
        float intValue = ((java.lang.Integer) e17.first).intValue() * com.tencent.mapsdk.internal.hn.o();
        float intValue2 = ((java.lang.Integer) e17.second).intValue() * com.tencent.mapsdk.internal.hn.o();
        float f17 = o17 * 2.0f;
        float f18 = intValue + f17;
        float f19 = f17 + intValue2;
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((int) f18, (int) f19, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length, new android.graphics.BitmapFactory.Options());
        float width = decodeByteArray.getWidth();
        float height = decodeByteArray.getHeight();
        float f27 = o18 + o17;
        android.graphics.RectF rectF = new android.graphics.RectF(f27, f27, (f18 - o18) - o17, (f19 - o18) - o17);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        float f28 = intValue / 4.0f;
        float f29 = intValue2 / 4.0f;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.CLAMP;
        android.graphics.BitmapShader bitmapShader = new android.graphics.BitmapShader(decodeByteArray, tileMode, tileMode);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setRectToRect(new android.graphics.RectF(0.0f, 0.0f, width, height), rectF, android.graphics.Matrix.ScaleToFit.CENTER);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setColor(0);
        paint2.setShadowLayer(o17, 0.0f, 0.0f, com.tencent.mapsdk.internal.hn.p());
        canvas.drawRoundRect(rectF, f28, f29, paint2);
        canvas.drawRoundRect(rectF, f28, f29, paint);
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        paint3.setColor(z17 ? 2130706432 : -1);
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        paint3.setStrokeWidth(o18);
        android.graphics.RectF rectF2 = new android.graphics.RectF(rectF);
        float f37 = o18 / 2.0f;
        rectF2.inset(f37, f37);
        canvas.drawRoundRect(rectF2, f28 - f37, f29 - f37, paint3);
        if (z18) {
            android.graphics.Paint paint4 = new android.graphics.Paint(1);
            paint4.setColor(1056964608);
            paint4.setStyle(android.graphics.Paint.Style.FILL);
            canvas.drawRoundRect(rectF, f28, f29, paint4);
        }
        return com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.fromBitmap(this.f51182e.getMapContext(), createBitmap);
    }

    private long a(com.tencent.mapsdk.internal.cc ccVar) {
        com.tencent.mapsdk.internal.bd bdVar = (com.tencent.mapsdk.internal.bd) this.f51182e.getMapContext();
        com.tencent.tencentmap.mapsdk.maps.model.LatLng b17 = ccVar.b();
        com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor b18 = ccVar.b(this.f51180c);
        long a17 = bdVar.i().a(new com.tencent.map.lib.models.MarkerInfo(b17.latitude, b17.longitude, b18.getBDId()).displayLevel(2).iconWidth(b18.getWidth()).iconHeight(b18.getHeight()).minScaleLevel(ccVar.d().f49573b).maxScaleLevel(ccVar.d().f49574c).interactive(false).priority(ccVar.c()));
        this.f51179a.put(ccVar, java.lang.Long.valueOf(a17));
        return a17;
    }

    @Override // com.tencent.mapsdk.internal.cg.a
    public final void a(java.util.Set<com.tencent.mapsdk.internal.cc> set, java.util.Set<com.tencent.mapsdk.internal.cc> set2, java.util.Set<com.tencent.mapsdk.internal.cc> set3) {
        com.tencent.mapsdk.internal.cc ccVar;
        long j17;
        long j18;
        com.tencent.mapsdk.core.utils.log.LogUtil.b(f51178b, "onHandleSearch... add_ids:" + set + " update_ids:" + set2 + " remove_ids:" + set3);
        long j19 = 0;
        if (set3 != null && set3.size() > 0) {
            for (com.tencent.mapsdk.internal.cc ccVar2 : set3) {
                if (ccVar2.g() == com.tencent.mapsdk.internal.cc.a.WILL_REMOVE) {
                    com.tencent.mapsdk.internal.bd bdVar = (com.tencent.mapsdk.internal.bd) this.f51182e.getMapContext();
                    java.lang.Long remove = this.f51179a.remove(ccVar2);
                    if (remove != null && remove.longValue() != 0) {
                        bdVar.i().b(remove.longValue());
                    }
                    ccVar2.a(com.tencent.mapsdk.internal.cc.a.REMOVE);
                }
            }
        }
        if (set2 != null && set2.size() > 0) {
            for (com.tencent.mapsdk.internal.cc ccVar3 : set2) {
                if (ccVar3.g() == com.tencent.mapsdk.internal.cc.a.WILL_UPDATE) {
                    com.tencent.mapsdk.internal.bd bdVar2 = (com.tencent.mapsdk.internal.bd) this.f51182e.getMapContext();
                    java.lang.Long l17 = this.f51179a.get(ccVar3);
                    if (l17 == null || l17.longValue() == j19) {
                        ccVar = ccVar3;
                        j17 = 0;
                        j18 = 0;
                    } else {
                        com.tencent.tencentmap.mapsdk.maps.model.LatLng b17 = ccVar3.b();
                        com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor b18 = ccVar3.b(this.f51180c);
                        ccVar = ccVar3;
                        bdVar2.i().a(l17.longValue(), new com.tencent.map.lib.models.MarkerInfo(b17.latitude, b17.longitude, b18.getBDId()).displayLevel(2).iconWidth(b18.getWidth()).iconHeight(b18.getHeight()).minScaleLevel(ccVar.d().f49573b).maxScaleLevel(ccVar.d().f49574c).interactive(false).priority(ccVar.c()));
                        j18 = l17.longValue();
                        j17 = 0;
                    }
                    if (j18 > j17) {
                        ccVar.a(com.tencent.mapsdk.internal.cc.a.ADD);
                    }
                }
                j19 = 0;
            }
        }
        if (set != null && set.size() > 0) {
            for (com.tencent.mapsdk.internal.cc ccVar4 : set) {
                if (ccVar4.g() == com.tencent.mapsdk.internal.cc.a.WILL_ADD) {
                    com.tencent.mapsdk.internal.bd bdVar3 = (com.tencent.mapsdk.internal.bd) this.f51182e.getMapContext();
                    com.tencent.tencentmap.mapsdk.maps.model.LatLng b19 = ccVar4.b();
                    com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor b27 = ccVar4.b(this.f51180c);
                    long a17 = bdVar3.i().a(new com.tencent.map.lib.models.MarkerInfo(b19.latitude, b19.longitude, b27.getBDId()).displayLevel(2).iconWidth(b27.getWidth()).iconHeight(b27.getHeight()).minScaleLevel(ccVar4.d().f49573b).maxScaleLevel(ccVar4.d().f49574c).interactive(false).priority(ccVar4.c()));
                    this.f51179a.put(ccVar4, java.lang.Long.valueOf(a17));
                    if (a17 > 0) {
                        ccVar4.a(com.tencent.mapsdk.internal.cc.a.ADD);
                    }
                }
            }
        }
        a(this.f51181d, this.f51180c);
    }
}
