package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class qf {

    /* renamed from: e, reason: collision with root package name */
    public static volatile java.util.Map<java.lang.String, java.util.List<java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bg>>> f50914e = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f50915a = false;

    /* renamed from: b, reason: collision with root package name */
    java.lang.String f50916b;

    /* renamed from: c, reason: collision with root package name */
    com.tencent.mapsdk.internal.mv f50917c;

    /* renamed from: d, reason: collision with root package name */
    com.tencent.mapsdk.internal.mz f50918d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bg> f50919f;

    /* renamed from: g, reason: collision with root package name */
    java.lang.String f50920g;

    /* renamed from: h, reason: collision with root package name */
    java.lang.String f50921h;

    /* renamed from: i, reason: collision with root package name */
    java.lang.String f50922i;

    /* renamed from: j, reason: collision with root package name */
    java.lang.String f50923j;

    /* renamed from: k, reason: collision with root package name */
    java.lang.String f50924k;

    /* loaded from: classes13.dex */
    public static class a implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.ref.WeakReference<com.tencent.mapsdk.internal.qf> f50925a;

        /* renamed from: b, reason: collision with root package name */
        private final java.lang.String f50926b;

        /* renamed from: c, reason: collision with root package name */
        private final com.tencent.mapsdk.internal.fx f50927c;

        public a(com.tencent.mapsdk.internal.qf qfVar, java.lang.String str, com.tencent.mapsdk.internal.fx fxVar) {
            this.f50925a = new java.lang.ref.WeakReference<>(qfVar);
            this.f50926b = str;
            this.f50927c = fxVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            java.lang.ref.WeakReference<com.tencent.mapsdk.internal.qf> weakReference = this.f50925a;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            com.tencent.mapsdk.internal.qf qfVar = this.f50925a.get();
            java.lang.String str = this.f50926b;
            com.tencent.mapsdk.internal.fx fxVar = this.f50927c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(new com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq(com.tencent.mapsdk.internal.ep.f49364i, qfVar.f50917c.b(com.tencent.mapsdk.internal.er.f49382a), qfVar.f50917c.a(com.tencent.mapsdk.internal.er.f49401t)));
            arrayList.add(new com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq("poi_icon", qfVar.f50917c.b(com.tencent.mapsdk.internal.er.f49384c), qfVar.f50917c.a(com.tencent.mapsdk.internal.er.f49402u)));
            arrayList.add(new com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq(com.tencent.mapsdk.internal.ep.f49365j, qfVar.f50917c.b(com.tencent.mapsdk.internal.er.f49385d), qfVar.f50917c.a(com.tencent.mapsdk.internal.er.f49403v)));
            arrayList.add(new com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq(com.tencent.mapsdk.internal.ep.f49371p, qfVar.f50917c.b("escalator_night_version"), qfVar.f50917c.a("escalator_night_md5")));
            if (fxVar != null && fxVar.a()) {
                arrayList.add(new com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq(com.tencent.mapsdk.internal.ep.f49367l, qfVar.f50917c.b("indoormap_style_version"), qfVar.f50917c.a("indoormap_style_md5")));
                arrayList.add(new com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq(com.tencent.mapsdk.internal.ep.f49368m, qfVar.f50917c.b("indoormap_style_night_version"), qfVar.f50917c.a("indoormap_style_night_md5")));
                arrayList.add(new com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq(com.tencent.mapsdk.internal.ep.f49369n, qfVar.f50917c.b(com.tencent.mapsdk.internal.er.f49400s), qfVar.f50917c.a(com.tencent.mapsdk.internal.er.f49406y)));
                arrayList.add(new com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq(com.tencent.mapsdk.internal.ep.f49370o, qfVar.f50917c.b("indoorpoi_icon_3d_night_version"), qfVar.f50917c.a("indoorpoi_icon_3d_night_md5")));
            }
            java.lang.String a17 = qfVar.a();
            com.tencent.mapsdk.core.components.protocol.jce.conf.CSFileUpdateReq cSFileUpdateReq = new com.tencent.mapsdk.core.components.protocol.jce.conf.CSFileUpdateReq(arrayList, a17, com.tencent.mapsdk.internal.hn.n(), null, qfVar.f50916b, str);
            qfVar.f50921h = qfVar.f50918d.a(qfVar.f50920g);
            qfVar.f50922i = qfVar.f50918d.b(qfVar.f50920g);
            qfVar.f50923j = qfVar.f50918d.c(qfVar.f50920g) + "config/";
            qfVar.f50924k = qfVar.f50918d.c(qfVar.f50920g) + "assets/";
            com.tencent.mapsdk.internal.kt.a(qfVar.f50923j);
            com.tencent.mapsdk.internal.kt.a(qfVar.f50924k);
            java.util.List<com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp> a18 = new com.tencent.mapsdk.internal.qd().a(qfVar.f50918d.c(qfVar.f50920g) + "config/", qfVar.f50918d.c(qfVar.f50920g) + "assets/", a17, cSFileUpdateReq, qfVar);
            if (a18 == null) {
                qfVar.f50915a = false;
                com.tencent.mapsdk.internal.qf.a(qfVar, false);
                return;
            }
            if (qfVar.f50915a) {
                if (!qfVar.a(qfVar.f50923j, qfVar.f50921h) || !qfVar.a(qfVar.f50924k, qfVar.f50922i)) {
                    qfVar.f50915a = false;
                    com.tencent.mapsdk.internal.qf.a(qfVar, false);
                    return;
                } else {
                    for (int i17 = 0; i17 < a18.size(); i17++) {
                        com.tencent.mapsdk.internal.qf.a(qfVar, a18.get(i17));
                    }
                }
            }
            com.tencent.mapsdk.internal.qf.a(qfVar, true);
        }
    }

    public qf(android.content.Context context, com.tencent.mapsdk.internal.bg bgVar, java.lang.String str) {
        this.f50918d = com.tencent.mapsdk.internal.mz.a(context, (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null);
        this.f50916b = "";
        if (bgVar != null && bgVar.f48905b != null && bgVar.f48905b.e_ != 0) {
            this.f50916b = ((com.tencent.mapsdk.vector.VectorMap) bgVar.f48905b.e_).z();
        }
        this.f50919f = new java.lang.ref.WeakReference<>(bgVar);
        this.f50920g = str;
        com.tencent.mapsdk.internal.mv a17 = com.tencent.mapsdk.internal.mx.a(context, str);
        this.f50917c = a17;
        if (a17 != null) {
            a17.a(new java.lang.String[]{"mapPoiIconIndoorVersion", "poiIconIndoorMd5"});
        }
    }

    private java.util.List<com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp> b(java.lang.String str, com.tencent.mapsdk.internal.fx fxVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq(com.tencent.mapsdk.internal.ep.f49364i, this.f50917c.b(com.tencent.mapsdk.internal.er.f49382a), this.f50917c.a(com.tencent.mapsdk.internal.er.f49401t)));
        arrayList.add(new com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq("poi_icon", this.f50917c.b(com.tencent.mapsdk.internal.er.f49384c), this.f50917c.a(com.tencent.mapsdk.internal.er.f49402u)));
        arrayList.add(new com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq(com.tencent.mapsdk.internal.ep.f49365j, this.f50917c.b(com.tencent.mapsdk.internal.er.f49385d), this.f50917c.a(com.tencent.mapsdk.internal.er.f49403v)));
        arrayList.add(new com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq(com.tencent.mapsdk.internal.ep.f49371p, this.f50917c.b("escalator_night_version"), this.f50917c.a("escalator_night_md5")));
        if (fxVar != null && fxVar.a()) {
            arrayList.add(new com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq(com.tencent.mapsdk.internal.ep.f49367l, this.f50917c.b("indoormap_style_version"), this.f50917c.a("indoormap_style_md5")));
            arrayList.add(new com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq(com.tencent.mapsdk.internal.ep.f49368m, this.f50917c.b("indoormap_style_night_version"), this.f50917c.a("indoormap_style_night_md5")));
            arrayList.add(new com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq(com.tencent.mapsdk.internal.ep.f49369n, this.f50917c.b(com.tencent.mapsdk.internal.er.f49400s), this.f50917c.a(com.tencent.mapsdk.internal.er.f49406y)));
            arrayList.add(new com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq(com.tencent.mapsdk.internal.ep.f49370o, this.f50917c.b("indoorpoi_icon_3d_night_version"), this.f50917c.a("indoorpoi_icon_3d_night_md5")));
        }
        java.lang.String a17 = a();
        com.tencent.mapsdk.core.components.protocol.jce.conf.CSFileUpdateReq cSFileUpdateReq = new com.tencent.mapsdk.core.components.protocol.jce.conf.CSFileUpdateReq(arrayList, a17, com.tencent.mapsdk.internal.hn.n(), null, this.f50916b, str);
        this.f50921h = this.f50918d.a(this.f50920g);
        this.f50922i = this.f50918d.b(this.f50920g);
        this.f50923j = this.f50918d.c(this.f50920g) + "config/";
        this.f50924k = this.f50918d.c(this.f50920g) + "assets/";
        com.tencent.mapsdk.internal.kt.a(this.f50923j);
        com.tencent.mapsdk.internal.kt.a(this.f50924k);
        return new com.tencent.mapsdk.internal.qd().a(this.f50918d.c(this.f50920g) + "config/", this.f50918d.c(this.f50920g) + "assets/", a17, cSFileUpdateReq, this);
    }

    private void c() {
        com.tencent.mapsdk.internal.mv mvVar = this.f50917c;
        if (mvVar == null) {
            return;
        }
        mvVar.a(new java.lang.String[]{"mapPoiIconIndoorVersion", "poiIconIndoorMd5"});
    }

    private void a(java.lang.String str, com.tencent.mapsdk.internal.fx fxVar) {
        java.lang.String a17 = a();
        if (f50914e.containsKey(a17)) {
            a(a17, this.f50919f);
            return;
        }
        a(a17, this.f50919f);
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bg> weakReference = this.f50919f;
        if (weakReference != null && weakReference.get() != null && this.f50919f.get().f48905b != null) {
            int i17 = this.f50919f.get().f48905b.f49018f;
            com.tencent.mapsdk.core.utils.log.LogUtil.a(i17).b(com.tencent.mapsdk.internal.la.a.f50264e, "map config check update, styleIds: " + str + ", indoorAuth: " + fxVar);
            com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.Z, i17);
        }
        com.tencent.mapsdk.internal.ko.b(new com.tencent.mapsdk.internal.qf.a(this, str, fxVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(java.lang.String str, java.lang.String str2) {
        com.tencent.mapsdk.internal.bg bgVar;
        com.tencent.mapsdk.internal.oq oqVar;
        boolean a17;
        com.tencent.mapsdk.internal.oq oqVar2;
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bg> weakReference = this.f50919f;
        if (weakReference != null && (bgVar = weakReference.get()) != null && bgVar.f48905b != null && bgVar.f48905b.e_ != 0) {
            int i17 = bgVar.f48905b.f49018f;
            com.tencent.mapsdk.vector.VectorMap vectorMap = (com.tencent.mapsdk.vector.VectorMap) bgVar.f48905b.e_;
            java.io.File file = new java.io.File(str);
            if (file.exists() && file.isDirectory()) {
                java.io.File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.a(i17).e(com.tencent.mapsdk.internal.la.a.f50264e, "moveConfigFile, tmpDirPath: " + str + ", targetDirPath: " + str2 + " tmp list files null");
                    return false;
                }
                boolean z17 = true;
                java.io.FileInputStream fileInputStream = null;
                for (java.io.File file2 : listFiles) {
                    try {
                        java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(file2);
                        try {
                            int length = (int) file2.length();
                            byte[] bArr = new byte[length];
                            fileInputStream2.read(bArr, 0, length);
                            if (str2.equals(this.f50921h)) {
                                java.lang.String name = file2.getName();
                                com.tencent.mapsdk.internal.w wVar = vectorMap.f52512o.f50518r;
                                if (wVar != null && (oqVar2 = wVar.f52455b) != null) {
                                    a17 = com.tencent.mapsdk.internal.w.a(new java.io.File(oqVar2.c()), name, bArr, wVar.f52457d);
                                    z17 &= a17;
                                }
                                a17 = false;
                                z17 &= a17;
                            } else if (str2.equals(this.f50922i)) {
                                java.lang.String name2 = file2.getName();
                                com.tencent.mapsdk.internal.w wVar2 = vectorMap.f52512o.f50518r;
                                if (wVar2 != null && (oqVar = wVar2.f52455b) != null) {
                                    a17 = com.tencent.mapsdk.internal.w.a(new java.io.File(oqVar.e()), name2, bArr, wVar2.f52458e);
                                    z17 &= a17;
                                }
                                a17 = false;
                                z17 &= a17;
                            }
                            com.tencent.mapsdk.internal.kt.a((java.io.Closeable) fileInputStream2);
                            fileInputStream = fileInputStream2;
                        } catch (java.io.FileNotFoundException | java.io.IOException unused) {
                            fileInputStream = fileInputStream2;
                            com.tencent.mapsdk.internal.kt.a((java.io.Closeable) fileInputStream);
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            fileInputStream = fileInputStream2;
                            com.tencent.mapsdk.internal.kt.a((java.io.Closeable) fileInputStream);
                            throw th;
                        }
                    } catch (java.io.FileNotFoundException | java.io.IOException unused2) {
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                    }
                }
                return z17;
            }
            com.tencent.mapsdk.core.utils.log.LogUtil.d("Config temp dir not exists:".concat(java.lang.String.valueOf(str)));
            com.tencent.mapsdk.core.utils.log.LogUtil.a(i17).e(com.tencent.mapsdk.internal.la.a.f50264e, "moveConfigFile, tmpDirPath: " + str + ", targetDirPath: " + str2 + " temp dir not exists");
        }
        return false;
    }

    public final java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bg>[] b() {
        java.util.List<java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bg>> list = f50914e.get(a());
        if (list == null) {
            return null;
        }
        return (java.lang.ref.WeakReference[]) list.toArray(new java.lang.ref.WeakReference[list.size()]);
    }

    private void a(boolean z17) {
        com.tencent.mapsdk.internal.bg bgVar;
        com.tencent.mapsdk.internal.tr trVar;
        M m17;
        com.tencent.mapsdk.internal.ne neVar;
        com.tencent.mapsdk.internal.rq a17;
        this.f50917c.a(com.tencent.mapsdk.internal.er.f49383b, java.lang.System.currentTimeMillis());
        com.tencent.mapsdk.internal.kt.c(this.f50923j);
        com.tencent.mapsdk.internal.kt.c(this.f50924k);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (!z17) {
            currentTimeMillis = 0;
        }
        java.util.List<java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bg>> list = f50914e.get(a());
        if (list == null) {
            return;
        }
        int size = list.size();
        java.lang.ref.WeakReference[] weakReferenceArr = (java.lang.ref.WeakReference[]) list.toArray(new java.lang.ref.WeakReference[size]);
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.ref.WeakReference weakReference = weakReferenceArr[i17];
            if (weakReference != null && (bgVar = (com.tencent.mapsdk.internal.bg) weakReference.get()) != null && (trVar = bgVar.f48905b) != null && (m17 = trVar.e_) != 0) {
                com.tencent.mapsdk.vector.VectorMap vectorMap = (com.tencent.mapsdk.vector.VectorMap) m17;
                com.tencent.mapsdk.internal.hg hgVar = trVar.f52273as.f49000c;
                if (this.f50915a) {
                    vectorMap.u();
                    com.tencent.mapsdk.internal.rr rrVar = bgVar.f48908e;
                    if (rrVar != null && (neVar = (com.tencent.mapsdk.internal.ne) trVar.d_) != null && (a17 = rrVar.a(rrVar.f51258f)) != null) {
                        neVar.f50508h.b(a17.f51249a);
                    }
                    vectorMap.f52512o.f50522v = true;
                    com.tencent.mapsdk.internal.ne neVar2 = trVar.f52273as;
                    if (neVar2 != null) {
                        neVar2.R();
                    }
                    trVar.f52277aw = true;
                    if (hgVar != null) {
                        hgVar.a().a(false, currentTimeMillis);
                        hgVar.a().b(z17, currentTimeMillis);
                    }
                } else if (!z17 && hgVar != null) {
                    hgVar.a().b(z17, currentTimeMillis);
                }
                vectorMap.f52511n = true;
            }
        }
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bg> weakReference2 = this.f50919f;
        int i18 = (weakReference2 == null || weakReference2.get() == null || this.f50919f.get().f48905b == null) ? -1 : this.f50919f.get().f48905b.f49018f;
        f50914e.clear();
        com.tencent.mapsdk.internal.mx.b();
        com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.la.Z, i18);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x005d, code lost:
    
        if (r0.equals(com.tencent.mapsdk.internal.ep.f49368m) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp r5) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.qf.a(com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp):void");
    }

    public final java.lang.String a() {
        java.lang.String str = this.f50920g;
        return com.tencent.mapsdk.internal.hr.a(str) ? com.tencent.mapsdk.internal.hn.a() : str;
    }

    public final synchronized void a(java.lang.String str, java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bg> weakReference) {
        if (f50914e.containsKey(str)) {
            java.util.List<java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bg>> list = f50914e.get(str);
            if (list != null) {
                list.add(weakReference);
            }
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(weakReference);
            f50914e.put(str, arrayList);
        }
    }

    public static /* synthetic */ void a(com.tencent.mapsdk.internal.qf qfVar, boolean z17) {
        com.tencent.mapsdk.internal.bg bgVar;
        com.tencent.mapsdk.internal.tr trVar;
        M m17;
        com.tencent.mapsdk.internal.ne neVar;
        com.tencent.mapsdk.internal.rq a17;
        qfVar.f50917c.a(com.tencent.mapsdk.internal.er.f49383b, java.lang.System.currentTimeMillis());
        com.tencent.mapsdk.internal.kt.c(qfVar.f50923j);
        com.tencent.mapsdk.internal.kt.c(qfVar.f50924k);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (!z17) {
            currentTimeMillis = 0;
        }
        java.util.List<java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bg>> list = f50914e.get(qfVar.a());
        if (list != null) {
            int size = list.size();
            java.lang.ref.WeakReference[] weakReferenceArr = (java.lang.ref.WeakReference[]) list.toArray(new java.lang.ref.WeakReference[size]);
            for (int i17 = 0; i17 < size; i17++) {
                java.lang.ref.WeakReference weakReference = weakReferenceArr[i17];
                if (weakReference != null && (bgVar = (com.tencent.mapsdk.internal.bg) weakReference.get()) != null && (trVar = bgVar.f48905b) != null && (m17 = trVar.e_) != 0) {
                    com.tencent.mapsdk.vector.VectorMap vectorMap = (com.tencent.mapsdk.vector.VectorMap) m17;
                    com.tencent.mapsdk.internal.hg hgVar = trVar.f52273as.f49000c;
                    if (qfVar.f50915a) {
                        vectorMap.u();
                        com.tencent.mapsdk.internal.rr rrVar = bgVar.f48908e;
                        if (rrVar != null && (neVar = (com.tencent.mapsdk.internal.ne) trVar.d_) != null && (a17 = rrVar.a(rrVar.f51258f)) != null) {
                            neVar.f50508h.b(a17.f51249a);
                        }
                        vectorMap.f52512o.f50522v = true;
                        com.tencent.mapsdk.internal.ne neVar2 = trVar.f52273as;
                        if (neVar2 != null) {
                            neVar2.R();
                        }
                        trVar.f52277aw = true;
                        if (hgVar != null) {
                            hgVar.a().a(false, currentTimeMillis);
                            hgVar.a().b(z17, currentTimeMillis);
                        }
                    } else if (!z17 && hgVar != null) {
                        hgVar.a().b(z17, currentTimeMillis);
                    }
                    vectorMap.f52511n = true;
                }
            }
            java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bg> weakReference2 = qfVar.f50919f;
            int i18 = (weakReference2 == null || weakReference2.get() == null || qfVar.f50919f.get().f48905b == null) ? -1 : qfVar.f50919f.get().f48905b.f49018f;
            f50914e.clear();
            com.tencent.mapsdk.internal.mx.b();
            com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.la.Z, i18);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005c, code lost:
    
        if (r0.equals(com.tencent.mapsdk.internal.ep.f49368m) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.tencent.mapsdk.internal.qf r4, com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp r5) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.qf.a(com.tencent.mapsdk.internal.qf, com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp):void");
    }
}
