package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class qf {

    /* renamed from: e, reason: collision with root package name */
    public static volatile java.util.Map<java.lang.String, java.util.List<java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg>>> f132447e = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f132448a = false;

    /* renamed from: b, reason: collision with root package name */
    java.lang.String f132449b;

    /* renamed from: c, reason: collision with root package name */
    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mv f132450c;

    /* renamed from: d, reason: collision with root package name */
    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz f132451d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg> f132452f;

    /* renamed from: g, reason: collision with root package name */
    java.lang.String f132453g;

    /* renamed from: h, reason: collision with root package name */
    java.lang.String f132454h;

    /* renamed from: i, reason: collision with root package name */
    java.lang.String f132455i;

    /* renamed from: j, reason: collision with root package name */
    java.lang.String f132456j;

    /* renamed from: k, reason: collision with root package name */
    java.lang.String f132457k;

    /* loaded from: classes13.dex */
    public static class a implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qf> f132458a;

        /* renamed from: b, reason: collision with root package name */
        private final java.lang.String f132459b;

        /* renamed from: c, reason: collision with root package name */
        private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fx f132460c;

        public a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qf qfVar, java.lang.String str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fx fxVar) {
            this.f132458a = new java.lang.ref.WeakReference<>(qfVar);
            this.f132459b = str;
            this.f132460c = fxVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qf> weakReference = this.f132458a;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qf qfVar = this.f132458a.get();
            java.lang.String str = this.f132459b;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fx fxVar = this.f132460c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4366x94692cd9(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130897i, qfVar.f132450c.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130915a), qfVar.f132450c.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130934t)));
            arrayList.add(new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4366x94692cd9("poi_icon", qfVar.f132450c.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130917c), qfVar.f132450c.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130935u)));
            arrayList.add(new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4366x94692cd9(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130898j, qfVar.f132450c.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130918d), qfVar.f132450c.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130936v)));
            arrayList.add(new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4366x94692cd9(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130904p, qfVar.f132450c.b("escalator_night_version"), qfVar.f132450c.a("escalator_night_md5")));
            if (fxVar != null && fxVar.a()) {
                arrayList.add(new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4366x94692cd9(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130900l, qfVar.f132450c.b("indoormap_style_version"), qfVar.f132450c.a("indoormap_style_md5")));
                arrayList.add(new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4366x94692cd9(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130901m, qfVar.f132450c.b("indoormap_style_night_version"), qfVar.f132450c.a("indoormap_style_night_md5")));
                arrayList.add(new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4366x94692cd9(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130902n, qfVar.f132450c.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130933s), qfVar.f132450c.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130939y)));
                arrayList.add(new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4366x94692cd9(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130903o, qfVar.f132450c.b("indoorpoi_icon_3d_night_version"), qfVar.f132450c.a("indoorpoi_icon_3d_night_md5")));
            }
            java.lang.String a17 = qfVar.a();
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4365x53be5a69 c4365x53be5a69 = new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4365x53be5a69(arrayList, a17, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.n(), null, qfVar.f132449b, str);
            qfVar.f132454h = qfVar.f132451d.a(qfVar.f132453g);
            qfVar.f132455i = qfVar.f132451d.b(qfVar.f132453g);
            qfVar.f132456j = qfVar.f132451d.c(qfVar.f132453g) + "config/";
            qfVar.f132457k = qfVar.f132451d.c(qfVar.f132453g) + "assets/";
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(qfVar.f132456j);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(qfVar.f132457k);
            java.util.List<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4367x94692e8a> a18 = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qd().a(qfVar.f132451d.c(qfVar.f132453g) + "config/", qfVar.f132451d.c(qfVar.f132453g) + "assets/", a17, c4365x53be5a69, qfVar);
            if (a18 == null) {
                qfVar.f132448a = false;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qf.a(qfVar, false);
                return;
            }
            if (qfVar.f132448a) {
                if (!qfVar.a(qfVar.f132456j, qfVar.f132454h) || !qfVar.a(qfVar.f132457k, qfVar.f132455i)) {
                    qfVar.f132448a = false;
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qf.a(qfVar, false);
                    return;
                } else {
                    for (int i17 = 0; i17 < a18.size(); i17++) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qf.a(qfVar, a18.get(i17));
                    }
                }
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qf.a(qfVar, true);
        }
    }

    public qf(android.content.Context context, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg bgVar, java.lang.String str) {
        this.f132451d = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz.a(context, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7) null);
        this.f132449b = "";
        if (bgVar != null && bgVar.f130438b != null && bgVar.f130438b.e_ != 0) {
            this.f132449b = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) bgVar.f130438b.e_).z();
        }
        this.f132452f = new java.lang.ref.WeakReference<>(bgVar);
        this.f132453g = str;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mv a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mx.a(context, str);
        this.f132450c = a17;
        if (a17 != null) {
            a17.a(new java.lang.String[]{"mapPoiIconIndoorVersion", "poiIconIndoorMd5"});
        }
    }

    private java.util.List<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4367x94692e8a> b(java.lang.String str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fx fxVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4366x94692cd9(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130897i, this.f132450c.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130915a), this.f132450c.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130934t)));
        arrayList.add(new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4366x94692cd9("poi_icon", this.f132450c.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130917c), this.f132450c.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130935u)));
        arrayList.add(new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4366x94692cd9(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130898j, this.f132450c.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130918d), this.f132450c.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130936v)));
        arrayList.add(new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4366x94692cd9(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130904p, this.f132450c.b("escalator_night_version"), this.f132450c.a("escalator_night_md5")));
        if (fxVar != null && fxVar.a()) {
            arrayList.add(new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4366x94692cd9(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130900l, this.f132450c.b("indoormap_style_version"), this.f132450c.a("indoormap_style_md5")));
            arrayList.add(new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4366x94692cd9(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130901m, this.f132450c.b("indoormap_style_night_version"), this.f132450c.a("indoormap_style_night_md5")));
            arrayList.add(new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4366x94692cd9(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130902n, this.f132450c.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130933s), this.f132450c.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130939y)));
            arrayList.add(new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4366x94692cd9(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130903o, this.f132450c.b("indoorpoi_icon_3d_night_version"), this.f132450c.a("indoorpoi_icon_3d_night_md5")));
        }
        java.lang.String a17 = a();
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4365x53be5a69 c4365x53be5a69 = new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4365x53be5a69(arrayList, a17, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.n(), null, this.f132449b, str);
        this.f132454h = this.f132451d.a(this.f132453g);
        this.f132455i = this.f132451d.b(this.f132453g);
        this.f132456j = this.f132451d.c(this.f132453g) + "config/";
        this.f132457k = this.f132451d.c(this.f132453g) + "assets/";
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(this.f132456j);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(this.f132457k);
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qd().a(this.f132451d.c(this.f132453g) + "config/", this.f132451d.c(this.f132453g) + "assets/", a17, c4365x53be5a69, this);
    }

    private void c() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mv mvVar = this.f132450c;
        if (mvVar == null) {
            return;
        }
        mvVar.a(new java.lang.String[]{"mapPoiIconIndoorVersion", "poiIconIndoorMd5"});
    }

    private void a(java.lang.String str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fx fxVar) {
        java.lang.String a17 = a();
        if (f132447e.containsKey(a17)) {
            a(a17, this.f132452f);
            return;
        }
        a(a17, this.f132452f);
        java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg> weakReference = this.f132452f;
        if (weakReference != null && weakReference.get() != null && this.f132452f.get().f130438b != null) {
            int i17 = this.f132452f.get().f130438b.f130551f;
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(i17).b(com.tencent.mapsdk.internal.la.a.f131797e, "map config check update, styleIds: " + str + ", indoorAuth: " + fxVar);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.Z, i17);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.b(new com.tencent.mapsdk.internal.qf.a(this, str, fxVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg bgVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oq oqVar;
        boolean a17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oq oqVar2;
        java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg> weakReference = this.f132452f;
        if (weakReference != null && (bgVar = weakReference.get()) != null && bgVar.f130438b != null && bgVar.f130438b.e_ != 0) {
            int i17 = bgVar.f130438b.f130551f;
            com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9 = (com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) bgVar.f130438b.e_;
            java.io.File file = new java.io.File(str);
            if (file.exists() && file.isDirectory()) {
                java.io.File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(i17).e(com.tencent.mapsdk.internal.la.a.f131797e, "moveConfigFile, tmpDirPath: " + str + ", targetDirPath: " + str2 + " tmp list files null");
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
                            if (str2.equals(this.f132454h)) {
                                java.lang.String name = file2.getName();
                                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.w wVar = c4430xc2040f9.f134045o.f132051r;
                                if (wVar != null && (oqVar2 = wVar.f133988b) != null) {
                                    a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.w.a(new java.io.File(oqVar2.c()), name, bArr, wVar.f133990d);
                                    z17 &= a17;
                                }
                                a17 = false;
                                z17 &= a17;
                            } else if (str2.equals(this.f132455i)) {
                                java.lang.String name2 = file2.getName();
                                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.w wVar2 = c4430xc2040f9.f134045o.f132051r;
                                if (wVar2 != null && (oqVar = wVar2.f133988b) != null) {
                                    a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.w.a(new java.io.File(oqVar.e()), name2, bArr, wVar2.f133991e);
                                    z17 &= a17;
                                }
                                a17 = false;
                                z17 &= a17;
                            }
                            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) fileInputStream2);
                            fileInputStream = fileInputStream2;
                        } catch (java.io.FileNotFoundException | java.io.IOException unused) {
                            fileInputStream = fileInputStream2;
                            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) fileInputStream);
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            fileInputStream = fileInputStream2;
                            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) fileInputStream);
                            throw th;
                        }
                    } catch (java.io.FileNotFoundException | java.io.IOException unused2) {
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                    }
                }
                return z17;
            }
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d("Config temp dir not exists:".concat(java.lang.String.valueOf(str)));
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(i17).e(com.tencent.mapsdk.internal.la.a.f131797e, "moveConfigFile, tmpDirPath: " + str + ", targetDirPath: " + str2 + " temp dir not exists");
        }
        return false;
    }

    public final java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg>[] b() {
        java.util.List<java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg>> list = f132447e.get(a());
        if (list == null) {
            return null;
        }
        return (java.lang.ref.WeakReference[]) list.toArray(new java.lang.ref.WeakReference[list.size()]);
    }

    private void a(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg bgVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar;
        M m17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rq a17;
        this.f132450c.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130916b, java.lang.System.currentTimeMillis());
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.c(this.f132456j);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.c(this.f132457k);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (!z17) {
            currentTimeMillis = 0;
        }
        java.util.List<java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg>> list = f132447e.get(a());
        if (list == null) {
            return;
        }
        int size = list.size();
        java.lang.ref.WeakReference[] weakReferenceArr = (java.lang.ref.WeakReference[]) list.toArray(new java.lang.ref.WeakReference[size]);
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.ref.WeakReference weakReference = weakReferenceArr[i17];
            if (weakReference != null && (bgVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg) weakReference.get()) != null && (trVar = bgVar.f130438b) != null && (m17 = trVar.e_) != 0) {
                com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9 = (com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) m17;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar = trVar.f133806as.f130533c;
                if (this.f132448a) {
                    c4430xc2040f9.u();
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rr rrVar = bgVar.f130441e;
                    if (rrVar != null && (neVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne) trVar.d_) != null && (a17 = rrVar.a(rrVar.f132791f)) != null) {
                        neVar.f132041h.b(a17.f132782a);
                    }
                    c4430xc2040f9.f134045o.f132055v = true;
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar2 = trVar.f133806as;
                    if (neVar2 != null) {
                        neVar2.R();
                    }
                    trVar.f133810aw = true;
                    if (hgVar != null) {
                        hgVar.a().a(false, currentTimeMillis);
                        hgVar.a().b(z17, currentTimeMillis);
                    }
                } else if (!z17 && hgVar != null) {
                    hgVar.a().b(z17, currentTimeMillis);
                }
                c4430xc2040f9.f134044n = true;
            }
        }
        java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg> weakReference2 = this.f132452f;
        int i18 = (weakReference2 == null || weakReference2.get() == null || this.f132452f.get().f130438b == null) ? -1 : this.f132452f.get().f130438b.f130551f;
        f132447e.clear();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mx.b();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.Z, i18);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x005d, code lost:
    
        if (r0.equals(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130901m) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4367x94692e8a r5) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qf.a(com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp):void");
    }

    public final java.lang.String a() {
        java.lang.String str = this.f132453g;
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(str) ? com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.a() : str;
    }

    public final synchronized void a(java.lang.String str, java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg> weakReference) {
        if (f132447e.containsKey(str)) {
            java.util.List<java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg>> list = f132447e.get(str);
            if (list != null) {
                list.add(weakReference);
            }
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(weakReference);
            f132447e.put(str, arrayList);
        }
    }

    public static /* synthetic */ void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qf qfVar, boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg bgVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar;
        M m17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rq a17;
        qfVar.f132450c.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130916b, java.lang.System.currentTimeMillis());
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.c(qfVar.f132456j);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.c(qfVar.f132457k);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (!z17) {
            currentTimeMillis = 0;
        }
        java.util.List<java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg>> list = f132447e.get(qfVar.a());
        if (list != null) {
            int size = list.size();
            java.lang.ref.WeakReference[] weakReferenceArr = (java.lang.ref.WeakReference[]) list.toArray(new java.lang.ref.WeakReference[size]);
            for (int i17 = 0; i17 < size; i17++) {
                java.lang.ref.WeakReference weakReference = weakReferenceArr[i17];
                if (weakReference != null && (bgVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg) weakReference.get()) != null && (trVar = bgVar.f130438b) != null && (m17 = trVar.e_) != 0) {
                    com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9 = (com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) m17;
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar = trVar.f133806as.f130533c;
                    if (qfVar.f132448a) {
                        c4430xc2040f9.u();
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rr rrVar = bgVar.f130441e;
                        if (rrVar != null && (neVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne) trVar.d_) != null && (a17 = rrVar.a(rrVar.f132791f)) != null) {
                            neVar.f132041h.b(a17.f132782a);
                        }
                        c4430xc2040f9.f134045o.f132055v = true;
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar2 = trVar.f133806as;
                        if (neVar2 != null) {
                            neVar2.R();
                        }
                        trVar.f133810aw = true;
                        if (hgVar != null) {
                            hgVar.a().a(false, currentTimeMillis);
                            hgVar.a().b(z17, currentTimeMillis);
                        }
                    } else if (!z17 && hgVar != null) {
                        hgVar.a().b(z17, currentTimeMillis);
                    }
                    c4430xc2040f9.f134044n = true;
                }
            }
            java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg> weakReference2 = qfVar.f132452f;
            int i18 = (weakReference2 == null || weakReference2.get() == null || qfVar.f132452f.get().f130438b == null) ? -1 : qfVar.f132452f.get().f130438b.f130551f;
            f132447e.clear();
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mx.b();
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.Z, i18);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005c, code lost:
    
        if (r0.equals(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130901m) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qf r4, com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4367x94692e8a r5) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qf.a(com.tencent.mapsdk.internal.qf, com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp):void");
    }
}
