package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class rj implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ce {

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f132711b = "PromoteImageLayer";

    /* renamed from: a, reason: collision with root package name */
    final java.util.Map<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc, java.lang.Long> f132712a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private boolean f132713c;

    /* renamed from: d, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e f132714d;

    /* renamed from: e, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cd f132715e;

    public rj(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cd cdVar) {
        this.f132715e = cdVar;
    }

    private long b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc ccVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd) this.f132715e.mo36621x2de760a9();
        java.lang.Long l17 = this.f132712a.get(ccVar);
        if (l17 == null || l17.longValue() == 0) {
            return 0L;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 b17 = ccVar.b();
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e b18 = ccVar.b(this.f132713c);
        bdVar.i().a(l17.longValue(), new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4254xb9489c28(b17.f49501xaa2bac6c, b17.f49502x83009af, b18.m99319xfb7cfd53()).m35396x5f34bbe2(2).m35405xaca9e4cd(b18.m99323x755bd410()).m35402xcec3bb00(b18.m99322x1c4fb41d()).m35409x985d244c(ccVar.d().f131106b).m35408x2bbef4de(ccVar.d().f131107c).m35406x6deacee2(false).m35411xba8879a4(ccVar.c()));
        return l17.longValue();
    }

    private void c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc ccVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd) this.f132715e.mo36621x2de760a9();
        java.lang.Long remove = this.f132712a.remove(ccVar);
        if (remove == null || remove.longValue() == 0) {
            return;
        }
        bdVar.i().b(remove.longValue());
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ce
    public final void a() {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132711b, "initLayer ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ce
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e c26015xa89e978e, boolean z17) {
        this.f132713c = z17;
        this.f132714d = c26015xa89e978e;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd) this.f132715e.mo36621x2de760a9();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn) bdVar).f130533c;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26100x627095e6 mo37073xf0312250 = bdVar.d().mo36068xb5885626().mo37464x78d58245().mo37073xf0312250();
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.c(mo37073xf0312250.f49841xbfac3bbe));
        hashSet.add(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.c(mo37073xf0312250.f49842x36319d45));
        hashSet.add(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.c(mo37073xf0312250.f49845x83b822d4));
        hashSet.add(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.c(mo37073xf0312250.f49844x2d87484f));
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.v.c cVar = (com.tencent.mapsdk.internal.v.c) it.next();
            java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc> a17 = this.f132715e.d().a(cVar.f133978a, cVar.f133979b, cVar.f133980c);
            if (a17 != null) {
                for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc ccVar : a17) {
                    com.tencent.mapsdk.internal.cc.a g17 = ccVar.g();
                    com.tencent.mapsdk.internal.cc.a aVar = com.tencent.mapsdk.internal.cc.a.ADD;
                    if (g17 == aVar && ccVar.d().a((int) c26015xa89e978e.f49415x3923d3) && mo37073xf0312250.f49843xc187b75b.m99538xde2d761f(ccVar.b())) {
                        if (hgVar != null) {
                            hgVar.r().a(ccVar.a());
                        }
                        ccVar.a(com.tencent.mapsdk.internal.cc.a.SHOWING);
                    } else if (ccVar.g() == com.tencent.mapsdk.internal.cc.a.SHOWING && (!mo37073xf0312250.f49843xc187b75b.m99538xde2d761f(ccVar.b()) || !ccVar.d().a((int) c26015xa89e978e.f49415x3923d3))) {
                        ccVar.a(aVar);
                    }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ce
    public final void c() {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132711b, "destroyLayer ");
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd) this.f132715e.mo36621x2de760a9();
        for (java.lang.Long l17 : this.f132712a.values()) {
            if (l17 != null && l17.longValue() != 0) {
                bdVar.i().b(l17.longValue());
            }
        }
        this.f132712a.clear();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ce
    public final java.util.List<com.tencent.mapsdk.internal.ce.b> b() {
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hq.a((java.lang.Iterable) this.f132712a.keySet(), (com.tencent.mapsdk.internal.hq.h) new com.tencent.mapsdk.internal.hq.h<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc, com.tencent.mapsdk.internal.ce.b>() { // from class: com.tencent.mapsdk.internal.rj.1

            /* renamed from: b, reason: collision with root package name */
            int f132716b;

            @Override // com.tencent.mapsdk.internal.hq.h
            public final /* synthetic */ com.tencent.mapsdk.internal.ce.b a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc ccVar) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc ccVar2 = ccVar;
                com.tencent.mapsdk.internal.ce.b bVar = new com.tencent.mapsdk.internal.ce.b();
                bVar.f130660c = ccVar2.g() == com.tencent.mapsdk.internal.cc.a.SHOWING;
                bVar.f130659b = ccVar2.b();
                java.lang.Long l17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rj.this.f132712a.get(ccVar2);
                int i17 = this.f132716b;
                this.f132716b = i17 + 1;
                bVar.f130661d = i17;
                if (l17 == null) {
                    return null;
                }
                bVar.f130658a = l17.longValue();
                return bVar;
            }

            /* renamed from: a, reason: avoid collision after fix types in other method */
            private com.tencent.mapsdk.internal.ce.b a2(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc ccVar) {
                com.tencent.mapsdk.internal.ce.b bVar = new com.tencent.mapsdk.internal.ce.b();
                bVar.f130660c = ccVar.g() == com.tencent.mapsdk.internal.cc.a.SHOWING;
                bVar.f130659b = ccVar.b();
                java.lang.Long l17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rj.this.f132712a.get(ccVar);
                int i17 = this.f132716b;
                this.f132716b = i17 + 1;
                bVar.f130661d = i17;
                if (l17 == null) {
                    return null;
                }
                bVar.f130658a = l17.longValue();
                return bVar;
            }
        });
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ce
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc ccVar, byte[] bArr, boolean z17, boolean z18) {
        float o17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.o() * 4.0f;
        float o18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.o() * 1.5f;
        android.util.Pair<java.lang.Integer, java.lang.Integer> e17 = ccVar.e();
        float intValue = ((java.lang.Integer) e17.first).intValue() * com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.o();
        float intValue2 = ((java.lang.Integer) e17.second).intValue() * com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.o();
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
        paint2.setShadowLayer(o17, 0.0f, 0.0f, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.p());
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
        return com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26011x93ded50c.m99336x63040d79(this.f132715e.mo36621x2de760a9(), createBitmap);
    }

    private long a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc ccVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd) this.f132715e.mo36621x2de760a9();
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 b17 = ccVar.b();
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e b18 = ccVar.b(this.f132713c);
        long a17 = bdVar.i().a(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4254xb9489c28(b17.f49501xaa2bac6c, b17.f49502x83009af, b18.m99319xfb7cfd53()).m35396x5f34bbe2(2).m35405xaca9e4cd(b18.m99323x755bd410()).m35402xcec3bb00(b18.m99322x1c4fb41d()).m35409x985d244c(ccVar.d().f131106b).m35408x2bbef4de(ccVar.d().f131107c).m35406x6deacee2(false).m35411xba8879a4(ccVar.c()));
        this.f132712a.put(ccVar, java.lang.Long.valueOf(a17));
        return a17;
    }

    @Override // com.tencent.mapsdk.internal.cg.a
    public final void a(java.util.Set<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc> set, java.util.Set<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc> set2, java.util.Set<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc> set3) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc ccVar;
        long j17;
        long j18;
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132711b, "onHandleSearch... add_ids:" + set + " update_ids:" + set2 + " remove_ids:" + set3);
        long j19 = 0;
        if (set3 != null && set3.size() > 0) {
            for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc ccVar2 : set3) {
                if (ccVar2.g() == com.tencent.mapsdk.internal.cc.a.WILL_REMOVE) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd) this.f132715e.mo36621x2de760a9();
                    java.lang.Long remove = this.f132712a.remove(ccVar2);
                    if (remove != null && remove.longValue() != 0) {
                        bdVar.i().b(remove.longValue());
                    }
                    ccVar2.a(com.tencent.mapsdk.internal.cc.a.REMOVE);
                }
            }
        }
        if (set2 != null && set2.size() > 0) {
            for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc ccVar3 : set2) {
                if (ccVar3.g() == com.tencent.mapsdk.internal.cc.a.WILL_UPDATE) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar2 = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd) this.f132715e.mo36621x2de760a9();
                    java.lang.Long l17 = this.f132712a.get(ccVar3);
                    if (l17 == null || l17.longValue() == j19) {
                        ccVar = ccVar3;
                        j17 = 0;
                        j18 = 0;
                    } else {
                        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 b17 = ccVar3.b();
                        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e b18 = ccVar3.b(this.f132713c);
                        ccVar = ccVar3;
                        bdVar2.i().a(l17.longValue(), new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4254xb9489c28(b17.f49501xaa2bac6c, b17.f49502x83009af, b18.m99319xfb7cfd53()).m35396x5f34bbe2(2).m35405xaca9e4cd(b18.m99323x755bd410()).m35402xcec3bb00(b18.m99322x1c4fb41d()).m35409x985d244c(ccVar.d().f131106b).m35408x2bbef4de(ccVar.d().f131107c).m35406x6deacee2(false).m35411xba8879a4(ccVar.c()));
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
            for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc ccVar4 : set) {
                if (ccVar4.g() == com.tencent.mapsdk.internal.cc.a.WILL_ADD) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar3 = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd) this.f132715e.mo36621x2de760a9();
                    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 b19 = ccVar4.b();
                    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e b27 = ccVar4.b(this.f132713c);
                    long a17 = bdVar3.i().a(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4254xb9489c28(b19.f49501xaa2bac6c, b19.f49502x83009af, b27.m99319xfb7cfd53()).m35396x5f34bbe2(2).m35405xaca9e4cd(b27.m99323x755bd410()).m35402xcec3bb00(b27.m99322x1c4fb41d()).m35409x985d244c(ccVar4.d().f131106b).m35408x2bbef4de(ccVar4.d().f131107c).m35406x6deacee2(false).m35411xba8879a4(ccVar4.c()));
                    this.f132712a.put(ccVar4, java.lang.Long.valueOf(a17));
                    if (a17 > 0) {
                        ccVar4.a(com.tencent.mapsdk.internal.cc.a.ADD);
                    }
                }
            }
        }
        a(this.f132714d, this.f132713c);
    }
}
