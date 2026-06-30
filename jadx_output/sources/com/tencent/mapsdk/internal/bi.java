package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class bi implements com.tencent.mapsdk.internal.bb, com.tencent.mapsdk.internal.qa.a, com.tencent.mapsdk.internal.sj.c {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.bd f48961a;

    /* renamed from: b, reason: collision with root package name */
    com.tencent.mapsdk.internal.kp.a f48962b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.bh f48963c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mapsdk.internal.fa f48964d;

    /* renamed from: f, reason: collision with root package name */
    int f48966f;

    /* renamed from: i, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.Marker f48969i;

    /* renamed from: j, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.Marker f48970j;

    /* renamed from: k, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.Marker f48971k;

    /* renamed from: g, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.Marker f48967g = null;

    /* renamed from: h, reason: collision with root package name */
    private boolean f48968h = false;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map<java.lang.Class<? extends com.tencent.mapsdk.internal.ni>, com.tencent.mapsdk.internal.nh<?>> f48965e = new java.util.concurrent.ConcurrentHashMap();

    public bi(com.tencent.mapsdk.internal.bh bhVar, com.tencent.mapsdk.internal.bd bdVar) {
        this.f48966f = -1;
        this.f48961a = bdVar;
        this.f48963c = bhVar;
        this.f48966f = ((com.tencent.mapsdk.internal.ne) bdVar).K;
    }

    private void d(com.tencent.mapsdk.internal.ez ezVar) {
        a(ezVar);
    }

    private void e(com.tencent.mapsdk.internal.ez ezVar) {
        a(ezVar);
    }

    private void f(com.tencent.mapsdk.internal.ez ezVar) {
        a(ezVar);
    }

    private void c(com.tencent.mapsdk.internal.ez ezVar) {
        a(ezVar);
    }

    private com.tencent.mapsdk.internal.bh d() {
        return this.f48963c;
    }

    private void e() {
        java.util.Collection<com.tencent.mapsdk.internal.nh<?>> values = this.f48965e.values();
        if (values.isEmpty()) {
            return;
        }
        java.util.Iterator<com.tencent.mapsdk.internal.nh<?>> it = values.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    private boolean f() {
        com.tencent.mapsdk.internal.nh<?> nhVar = this.f48965e.get(com.tencent.mapsdk.internal.nr.class);
        if (nhVar != null) {
            return nhVar.f();
        }
        return false;
    }

    public final void b(com.tencent.mapsdk.internal.ez ezVar) {
        com.tencent.mapsdk.internal.be beVar = this.f48963c.f48955j;
        if (ezVar != null) {
            synchronized (beVar.f48878a) {
                beVar.f48878a.remove(ezVar);
                beVar.f48879b.add(ezVar);
            }
        }
    }

    public final void a(com.tencent.mapsdk.internal.ez ezVar) {
        com.tencent.mapsdk.internal.bh bhVar = this.f48963c;
        com.tencent.mapsdk.internal.be beVar = bhVar.f48955j;
        synchronized (beVar.f48878a) {
            if (!beVar.f48878a.contains(ezVar)) {
                beVar.f48878a.add(ezVar);
            }
        }
        if (ezVar instanceof com.tencent.mapsdk.internal.ev) {
            bhVar.a((com.tencent.mapsdk.internal.ev) ezVar);
        }
    }

    @Override // com.tencent.mapsdk.internal.sj.c
    public final void c() {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f48970j;
        if (marker != null) {
            marker.setVisible(true);
        }
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker2 = this.f48969i;
        if (marker2 != null) {
            marker2.setVisible(true);
        }
    }

    private boolean b(float f17, float f18) {
        com.tencent.mapsdk.engine.jni.models.TappedElement a17 = this.f48961a.i().a(f17, f18);
        return a17 != null && a17.type == 6;
    }

    public final void b() {
        java.util.Collection<com.tencent.mapsdk.internal.nh<?>> values = this.f48965e.values();
        if (!values.isEmpty()) {
            java.util.Iterator<com.tencent.mapsdk.internal.nh<?>> it = values.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
        this.f48968h = false;
        this.f48967g = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <O extends com.tencent.mapsdk.internal.ni, L extends com.tencent.mapsdk.internal.ng<O>> L a(O o17) {
        com.tencent.mapsdk.internal.bd bdVar = this.f48961a;
        if (o17 == null || bdVar == null) {
            return null;
        }
        com.tencent.mapsdk.internal.nh<?> nhVar = this.f48965e.get(o17.getClass());
        if (nhVar == null) {
            if (o17.getClass() == com.tencent.mapsdk.internal.oe.class) {
                nhVar = new com.tencent.mapsdk.internal.od(bdVar.i());
            } else if (o17.getClass() == com.tencent.mapsdk.internal.np.class) {
                nhVar = new com.tencent.mapsdk.internal.no(bdVar.i());
            } else if (o17.getClass() == com.tencent.mapsdk.internal.nl.class) {
                nhVar = new com.tencent.mapsdk.internal.nm(bdVar.i());
            } else if (o17.getClass() == com.tencent.mapsdk.internal.nv.class) {
                nhVar = new com.tencent.mapsdk.internal.nu(bdVar.i());
            } else if (o17.getClass() == com.tencent.mapsdk.internal.ny.class) {
                nhVar = new com.tencent.mapsdk.internal.nx(bdVar.i());
            } else if (o17.getClass() == com.tencent.mapsdk.internal.ob.class) {
                nhVar = new com.tencent.mapsdk.internal.nz(bdVar.i());
            } else if (o17.getClass() == com.tencent.mapsdk.internal.oh.class) {
                nhVar = new com.tencent.mapsdk.internal.og(bdVar.i());
            } else if (o17.getClass() == com.tencent.mapsdk.internal.ok.class) {
                nhVar = new com.tencent.mapsdk.internal.oj(bdVar.i());
            } else if (o17.getClass() == com.tencent.mapsdk.internal.nr.class) {
                nhVar = new com.tencent.mapsdk.internal.nq(bdVar.i());
            }
            com.tencent.mapsdk.internal.nh<?> nhVar2 = (com.tencent.mapsdk.internal.nh) this.f48965e.put(o17.getClass(), nhVar);
            if (nhVar2 != null) {
                this.f48965e.put(o17.getClass(), nhVar2);
                nhVar = nhVar2;
            }
        }
        return (L) nhVar.b((com.tencent.mapsdk.internal.nh<?>) o17);
    }

    @Override // com.tencent.mapsdk.internal.sj.c
    public final void b(android.view.View view, android.graphics.Rect rect, boolean z17) {
        android.graphics.Bitmap a17;
        if (view == null || (a17 = com.tencent.mapsdk.internal.hl.a(view)) == null) {
            return;
        }
        if (this.f48970j == null) {
            com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions visible = new com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions().anchor(0.0f, 0.0f).visible(false);
            visible.tag(com.tencent.mapsdk.internal.qa.f50854c);
            visible.fastLoad(true);
            com.tencent.tencentmap.mapsdk.maps.model.Marker a18 = this.f48963c.a(visible);
            this.f48970j = a18;
            a18.setClickable(false);
        }
        this.f48970j.setFixingPoint(rect.left, rect.top);
        this.f48970j.setIcon(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.fromBitmap(this.f48961a, a17));
        this.f48970j.setVisible(z17);
        com.tencent.mapsdk.internal.kt.a(a17);
    }

    private <O extends com.tencent.mapsdk.internal.ni, L extends com.tencent.mapsdk.internal.ng<O>> void a(int i17, O o17) {
        com.tencent.mapsdk.internal.ng<?> a17;
        com.tencent.mapsdk.internal.nh<?> nhVar = this.f48965e.get(o17.getClass());
        if (nhVar == null || (a17 = nhVar.a(i17)) == null) {
            return;
        }
        a17.a((com.tencent.mapsdk.internal.ng<?>) o17);
        nhVar.a(a17);
    }

    public final <O extends com.tencent.mapsdk.internal.ni, L extends com.tencent.mapsdk.internal.ng<O>> L a(java.lang.Class<L> cls, int i17) {
        L l17;
        com.tencent.mapsdk.internal.nh<?> nhVar = this.f48965e.get(((java.lang.reflect.ParameterizedType) cls.getGenericSuperclass()).getActualTypeArguments()[0]);
        if (nhVar == null || (l17 = (L) nhVar.a(i17)) == null) {
            return null;
        }
        return l17;
    }

    private <O extends com.tencent.mapsdk.internal.ni, L extends com.tencent.mapsdk.internal.ng<O>> boolean a(int i17, java.lang.Class<L> cls) {
        com.tencent.mapsdk.internal.ng a17 = a(cls, i17);
        if (a17 == null) {
            return false;
        }
        a17.remove();
        return true;
    }

    @java.lang.Deprecated
    private boolean a(javax.microedition.khronos.opengles.GL10 gl10) {
        this.f48963c.f48955j.a(gl10);
        return true;
    }

    private void a(com.tencent.mapsdk.internal.fa faVar) {
        this.f48964d = faVar;
    }

    private boolean a(float f17, float f18) {
        com.tencent.mapsdk.engine.jni.models.TappedElement a17 = this.f48961a.i().a(f17, f18);
        if (a17 == null || a17.type != 3) {
            return false;
        }
        com.tencent.mapsdk.internal.fa faVar = this.f48964d;
        if (faVar == null) {
            return true;
        }
        faVar.o_();
        return true;
    }

    @Override // com.tencent.mapsdk.internal.bb
    public final void a(android.view.MotionEvent motionEvent) {
        com.tencent.mapsdk.internal.bd bdVar = this.f48961a;
        if (bdVar == null || !this.f48968h || this.f48967g == null) {
            return;
        }
        com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerDragListener t17 = bdVar.t();
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                this.f48967g.setPosition(com.tencent.mapsdk.internal.kr.a(this.f48961a.f().a(new com.tencent.mapsdk.internal.fu((int) motionEvent.getX(), (int) motionEvent.getY()))));
                if (t17 != null) {
                    t17.onMarkerDrag(this.f48967g);
                    return;
                }
                return;
            }
            if (action != 3 && action != 4) {
                return;
            }
        }
        this.f48968h = false;
        if (t17 != null) {
            t17.onMarkerDragEnd(this.f48967g);
        }
        this.f48967g = null;
    }

    @Override // com.tencent.mapsdk.internal.bb
    public final void a(java.lang.String str) {
        if (str.trim().length() == 0) {
            this.f48967g = null;
            this.f48968h = false;
            return;
        }
        com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerDragListener t17 = this.f48961a.t();
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = (com.tencent.tencentmap.mapsdk.maps.model.Marker) this.f48963c.a(str, com.tencent.mapsdk.internal.av.class);
        this.f48967g = marker;
        if (marker != null) {
            com.tencent.tencentmap.mapsdk.maps.TencentMapContext tencentMapContext = this.f48961a;
            if (tencentMapContext instanceof com.tencent.mapsdk.internal.bn) {
                if ((marker == null || marker != this.f48969i) ? false : com.tencent.mapsdk.internal.go.a((com.tencent.mapsdk.internal.bn) tencentMapContext)) {
                    return;
                }
            }
            if (!this.f48967g.isDraggable()) {
                this.f48967g = null;
                this.f48968h = false;
            } else {
                this.f48968h = true;
                if (t17 != null) {
                    t17.onMarkerDragStart(this.f48967g);
                }
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.bb
    public final void a() {
        this.f48968h = false;
        this.f48967g = null;
    }

    private boolean a(com.tencent.mapsdk.internal.bn bnVar, com.tencent.tencentmap.mapsdk.maps.model.Marker marker) {
        if (marker == null || marker != this.f48969i) {
            return false;
        }
        return com.tencent.mapsdk.internal.go.a(bnVar);
    }

    @Override // com.tencent.mapsdk.internal.sj.c
    public final void a(android.view.View view, android.graphics.Rect rect, boolean z17) {
        android.graphics.Bitmap a17;
        if (view == null || rect == null || (a17 = com.tencent.mapsdk.internal.hl.a(view)) == null) {
            return;
        }
        if (this.f48969i == null) {
            com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions visible = new com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions().anchor(0.0f, 0.0f).visible(false);
            visible.tag(com.tencent.mapsdk.internal.qa.f50854c);
            visible.fastLoad(true);
            com.tencent.tencentmap.mapsdk.maps.model.Marker a18 = this.f48963c.a(visible);
            this.f48969i = a18;
            com.tencent.mapsdk.internal.av avVar = (com.tencent.mapsdk.internal.av) this.f48963c.a(a18.getId(), com.tencent.mapsdk.internal.av.class);
            if (avVar != null) {
                avVar.f48864b.a(new com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerClickListener() { // from class: com.tencent.mapsdk.internal.bi.1
                    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerClickListener
                    public final boolean onMarkerClick(com.tencent.tencentmap.mapsdk.maps.model.Marker marker) {
                        com.tencent.mapsdk.internal.bi biVar = com.tencent.mapsdk.internal.bi.this;
                        if (biVar.f48962b == null) {
                            biVar.f48962b = com.tencent.mapsdk.internal.kp.a(biVar.f48961a.getContext(), null, " ", 0);
                        }
                        com.tencent.mapsdk.core.utils.log.LogUtil.a(com.tencent.mapsdk.internal.bi.this.f48966f).a(com.tencent.mapsdk.internal.bi.this.f48961a.getContext(), com.tencent.mapsdk.internal.bi.this.f48962b);
                        return false;
                    }
                });
            }
        }
        this.f48969i.setFixingPoint(rect.left, rect.top);
        this.f48969i.setIcon(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.fromBitmap(this.f48961a, a17));
        this.f48969i.setVisible(z17);
        com.tencent.mapsdk.internal.kt.a(a17);
    }

    @Override // com.tencent.mapsdk.internal.sj.c
    public final void a(com.tencent.mapsdk.internal.sj sjVar) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f48970j;
        if (marker != null) {
            marker.setVisible(false);
        }
        if (this.f48969i == null || sjVar.k()) {
            return;
        }
        this.f48969i.setVisible(false);
    }

    @Override // com.tencent.mapsdk.internal.qa.a
    public final void a(android.graphics.Bitmap bitmap, int i17, int i18) {
        com.tencent.tencentmap.mapsdk.maps.model.Marker marker = this.f48971k;
        if (marker == null) {
            com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions = new com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions();
            markerOptions.anchor(0.5f, 0.5f);
            markerOptions.tag(com.tencent.mapsdk.internal.qa.f50854c);
            markerOptions.icon(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.fromBitmap(this.f48961a, bitmap));
            com.tencent.tencentmap.mapsdk.maps.model.Marker a17 = this.f48963c.a(markerOptions);
            this.f48971k = a17;
            a17.setFixingPoint(i17 / 2, i18 / 2);
            this.f48971k.setClickable(false);
        } else {
            marker.setIcon(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.fromBitmap(this.f48961a, bitmap));
            this.f48971k.setFixingPoint(i17 / 2, i18 / 2);
        }
        com.tencent.mapsdk.internal.kt.a(bitmap);
    }

    private android.util.Pair<com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay, com.tencent.tencentmap.mapsdk.maps.TencentMap.IClickedObject> a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, long j17, java.lang.String str, java.lang.String str2) {
        com.tencent.mapsdk.internal.nh<?> nhVar = this.f48965e.get(com.tencent.mapsdk.internal.nr.class);
        if (nhVar != null) {
            return nhVar.a(latLng, j17, str, str2);
        }
        return new android.util.Pair<>(null, null);
    }
}
