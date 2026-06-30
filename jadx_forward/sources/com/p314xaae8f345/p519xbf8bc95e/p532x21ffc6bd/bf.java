package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class bf {

    /* renamed from: s, reason: collision with root package name */
    private static final int f130415s = 10;

    /* renamed from: a, reason: collision with root package name */
    final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab f130416a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f130419d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMyLocationChangeListener> f130421f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMyLocationClickListener> f130422g;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e f130426k;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e f130427l;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne f130428m;

    /* renamed from: n, reason: collision with root package name */
    public int f130429n;

    /* renamed from: o, reason: collision with root package name */
    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329 f130430o;

    /* renamed from: t, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e f130434t;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25954xb7e06450 f130417b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f130418c = false;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26016x7851a8f0 f130420e = null;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List<java.lang.ref.WeakReference<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329.LocationRegionChangedListener>> f130423h = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26072x8cb38890 f130424i = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26072x8cb38890();

    /* renamed from: j, reason: collision with root package name */
    public android.location.Location f130425j = null;

    /* renamed from: p, reason: collision with root package name */
    final java.util.concurrent.atomic.AtomicInteger f130431p = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25954xb7e06450.OnLocationChangedListener f130432q = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25954xb7e06450.OnLocationChangedListener() { // from class: com.tencent.mapsdk.internal.bf.1
        @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25954xb7e06450.OnLocationChangedListener
        /* renamed from: onLocationChanged */
        public final void mo36528xcf0f8560(android.location.Location location) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMyLocationChangeListener onMyLocationChangeListener;
            if (location == null) {
                return;
            }
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131758z, "new location changed : ".concat(java.lang.String.valueOf(location)));
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf bfVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf.this;
            android.location.Location location2 = bfVar.f130425j;
            if (location2 == null) {
                bfVar.f130425j = new android.location.Location(location);
            } else {
                try {
                    location2.set(location);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.e(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131736d, "location input format exception:" + e17.fillInStackTrace());
                }
            }
            boolean contains = location.getProvider().contains(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.f49185x24728b);
            boolean z17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf.this.f130431p.getAndIncrement() == 0 || com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf.this.f130431p.get() >= 10;
            if ((contains || z17) && !com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf.this.f130423h.isEmpty()) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131758z, "check location region change times:" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf.this.f130431p.get() + " fromCustomAuto:" + contains);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sm.a().a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf.this.f130428m.mo36630x76847179());
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sm.a();
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc[] c17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sm.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sm.f133008c);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc b17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.b(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df.m35328x3017aa(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(location.getLatitude(), location.getLongitude())));
                if (b17 == null || c17 == null) {
                    return;
                }
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf.this.f130431p.get() >= 10) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf.this.f130431p.set(1);
                }
                boolean a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sm.a(b17, c17);
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329 c26051xb5982329 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329();
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329.RegionName regionName = a17 ? com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329.RegionName.INLAND_WITHOUT_SAR_OF_CHINA : com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329.RegionName.EARTH;
                c26051xb5982329.f49527x89587b9f = regionName;
                c26051xb5982329.f49528xcb7e7191 = location;
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329 c26051xb59823292 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf.this.f130430o;
                if (c26051xb59823292 == null || c26051xb59823292.f49527x89587b9f != regionName) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131758z, "location region changed: isInlandWithoutSAROfChina = ".concat(java.lang.String.valueOf(a17)));
                    java.util.Iterator<java.lang.ref.WeakReference<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329.LocationRegionChangedListener>> it = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf.this.f130423h.iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329.LocationRegionChangedListener locationRegionChangedListener = it.next().get();
                        if (locationRegionChangedListener != null) {
                            locationRegionChangedListener.mo35945x43d64acc(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf.this.f130430o, c26051xb5982329);
                        }
                    }
                }
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf.this.f130430o = c26051xb5982329;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf bfVar2 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf.this;
            if (bfVar2.f130418c) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131758z, "updateMyLocation ".concat(java.lang.String.valueOf(location)));
                bfVar2.a(location);
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26072x8cb38890 c26072x8cb38890 = bfVar2.f130424i;
                if (c26072x8cb38890 != null) {
                    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(location.getLatitude(), location.getLongitude());
                    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26016x7851a8f0 interfaceC26016x7851a8f0 = bfVar2.f130420e;
                    if (interfaceC26016x7851a8f0 != null) {
                        interfaceC26016x7851a8f0.mo36401x6ff2357(c26041x873d1d26);
                        bfVar2.f130420e.mo36405x205ac394(location.getAccuracy());
                    }
                    bfVar2.f130428m.a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df.m35328x3017aa(c26041x873d1d26), 0.0f, 0.0f, false);
                    int m99804xdc46cd51 = c26072x8cb38890.m99804xdc46cd51();
                    if (m99804xdc46cd51 == 1) {
                        bfVar2.f130428m.a(location.getBearing());
                    } else if (m99804xdc46cd51 != 2) {
                        if (m99804xdc46cd51 != 3) {
                            bfVar2.f130428m.a(location.getBearing());
                            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar = bfVar2.f130416a;
                            if (abVar != null) {
                                abVar.a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25951xd3dd04bc.m99100xcf810ec6(c26041x873d1d26));
                            }
                        } else {
                            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar2 = bfVar2.f130416a;
                            if (abVar2 != null) {
                                bfVar2.f130416a.a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25951xd3dd04bc.m99105xfd98fd36(location.getBearing(), abVar2.a().f49414x3652bd));
                            }
                        }
                    }
                }
                java.lang.ref.WeakReference<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMyLocationChangeListener> weakReference = bfVar2.f130421f;
                if (weakReference == null || (onMyLocationChangeListener = weakReference.get()) == null) {
                    return;
                }
                onMyLocationChangeListener.m99168xd1fa7490(location);
            }
        }
    };

    /* renamed from: r, reason: collision with root package name */
    public final android.os.Handler f130433r = new android.os.Handler(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a("gesture"));

    /* renamed from: com.tencent.mapsdk.internal.bf$2, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass2 implements java.lang.Runnable {
        public AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.m99118x9cf0d20b().m99125x8630b4cb();
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf.this.f130419d) {
                if (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.m99118x9cf0d20b().m99123x1ca45c6f()) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf.this.f130433r.postDelayed(this, 300000L);
                } else {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf.this.f130433r.postDelayed(this, 60000L);
                }
            }
        }
    }

    public bf(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar) {
        this.f130428m = neVar;
        this.f130416a = abVar;
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e h() {
        return this.f130426k;
    }

    private void b(android.location.Location location) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMyLocationChangeListener onMyLocationChangeListener;
        if (!this.f130418c || location == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131758z, "updateMyLocation ".concat(java.lang.String.valueOf(location)));
        a(location);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26072x8cb38890 c26072x8cb38890 = this.f130424i;
        if (c26072x8cb38890 != null) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(location.getLatitude(), location.getLongitude());
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26016x7851a8f0 interfaceC26016x7851a8f0 = this.f130420e;
            if (interfaceC26016x7851a8f0 != null) {
                interfaceC26016x7851a8f0.mo36401x6ff2357(c26041x873d1d26);
                this.f130420e.mo36405x205ac394(location.getAccuracy());
            }
            this.f130428m.a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df.m35328x3017aa(c26041x873d1d26), 0.0f, 0.0f, false);
            int m99804xdc46cd51 = c26072x8cb38890.m99804xdc46cd51();
            if (m99804xdc46cd51 == 1) {
                this.f130428m.a(location.getBearing());
            } else if (m99804xdc46cd51 != 2) {
                if (m99804xdc46cd51 != 3) {
                    this.f130428m.a(location.getBearing());
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar = this.f130416a;
                    if (abVar != null) {
                        abVar.a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25951xd3dd04bc.m99100xcf810ec6(c26041x873d1d26));
                    }
                } else {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar2 = this.f130416a;
                    if (abVar2 != null) {
                        this.f130416a.a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25951xd3dd04bc.m99105xfd98fd36(location.getBearing(), abVar2.a().f49414x3652bd));
                    }
                }
            }
        }
        java.lang.ref.WeakReference<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMyLocationChangeListener> weakReference = this.f130421f;
        if (weakReference == null || (onMyLocationChangeListener = weakReference.get()) == null) {
            return;
        }
        onMyLocationChangeListener.m99168xd1fa7490(location);
    }

    private void c() {
        this.f130419d = false;
        a();
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26016x7851a8f0 interfaceC26016x7851a8f0 = this.f130420e;
        if (interfaceC26016x7851a8f0 != null) {
            interfaceC26016x7851a8f0.mo36414xc84af884();
            this.f130420e = null;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25954xb7e06450 interfaceC25954xb7e06450 = this.f130417b;
        if (interfaceC25954xb7e06450 != null) {
            interfaceC25954xb7e06450.mo99129x88fbd074();
            this.f130417b = null;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329.LocationRegionChangedListener m35940xccabb43e = com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70.m35928x9cf0d20b().m35940xccabb43e();
        if (m35940xccabb43e != null) {
            java.util.Iterator<java.lang.ref.WeakReference<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329.LocationRegionChangedListener>> it = this.f130423h.iterator();
            while (it.hasNext()) {
                if (it.next().get() != m35940xccabb43e) {
                    it.remove();
                }
            }
        }
    }

    private void d() {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131758z, "enableMyLocation : " + this.f130418c);
        if (this.f130418c) {
            return;
        }
        this.f130418c = true;
        this.f130428m.e(false);
        this.f130428m.f(false);
        this.f130428m.g(false);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26016x7851a8f0 interfaceC26016x7851a8f0 = this.f130420e;
        if (interfaceC26016x7851a8f0 != null) {
            interfaceC26016x7851a8f0.mo36427xcd1079b0(true);
        }
    }

    private boolean e() {
        return this.f130418c;
    }

    private android.location.Location f() {
        if (this.f130425j == null) {
            return null;
        }
        return new android.location.Location(this.f130425j);
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25954xb7e06450 g() {
        return this.f130417b;
    }

    public final void a() {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131758z, "disableMyLocation " + this.f130418c);
        if (this.f130418c) {
            this.f130418c = false;
            this.f130428m.e(true);
            this.f130428m.f(true);
            this.f130428m.g(true);
            this.f130429n = 0;
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26016x7851a8f0 interfaceC26016x7851a8f0 = this.f130420e;
            if (interfaceC26016x7851a8f0 != null) {
                interfaceC26016x7851a8f0.mo36427xcd1079b0(false);
            }
        }
    }

    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25954xb7e06450 interfaceC25954xb7e06450) {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131758z, "setLocationSource " + interfaceC25954xb7e06450 + " enable " + this.f130418c);
        if (interfaceC25954xb7e06450 == null) {
            return;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25954xb7e06450 interfaceC25954xb7e064502 = this.f130417b;
        if (interfaceC25954xb7e064502 != null) {
            interfaceC25954xb7e064502.mo99129x88fbd074();
        }
        this.f130417b = interfaceC25954xb7e06450;
        interfaceC25954xb7e06450.mo99128x9d4bd4f3(this.f130432q);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329.LocationRegionChangedListener m35940xccabb43e = com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70.m35928x9cf0d20b().m35940xccabb43e();
        if (m35940xccabb43e != null) {
            this.f130423h.add(new java.lang.ref.WeakReference<>(m35940xccabb43e));
        }
        if (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.m99118x9cf0d20b().m99124x52b8616a()) {
            this.f130419d = true;
            this.f130433r.postDelayed(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf.AnonymousClass2(), 1000L);
        }
    }

    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e b() {
        if (this.f130434t == null) {
            this.f130434t = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26011x93ded50c.m99333x3281d66(this.f130428m, "navi_marker_location.png");
        }
        return this.f130434t;
    }

    public final void a(android.location.Location location) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99583xb33869df;
        android.graphics.Bitmap m99320x12501425;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(location.getLatitude(), location.getLongitude());
        if (this.f130420e == null) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26017xfbda878e c26017xfbda878e = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26017xfbda878e();
            c26017xfbda878e.m99403xc80e6c92(location.getAccuracy()).m99387xaeb2cc55(c26041x873d1d26).m99389xbbf043a0(this.f130424i.m99799xbb5db4ea()).m99404x7197ec0b(this.f130424i.m99806x4b6e32d5()).m99405x72aeea6e(this.f130424i.m99807x4c853138());
            int m99797xd4cdb75e = this.f130424i.m99797xd4cdb75e();
            if (m99797xd4cdb75e != -1) {
                c26017xfbda878e.m99401x6219b84(m99797xd4cdb75e);
            }
            c26017xfbda878e.m99409xd4677478(this.f130424i.m99798xdb3ed3de());
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bh bhVar = this.f130428m.f132030J;
            this.f130420e = bhVar == null ? null : bhVar.a(c26017xfbda878e);
        }
        if (this.f130429n == 0) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99802xdc417a90 = this.f130424i.m99802xdc417a90();
            if (m99802xdc417a90 == null) {
                m99802xdc417a90 = b();
            }
            android.graphics.Bitmap m99320x125014252 = m99802xdc417a90.m99320x12501425(this.f130428m.mo36630x76847179());
            if (m99320x125014252 != null && !m99320x125014252.isRecycled()) {
                this.f130426k = m99802xdc417a90;
                this.f130429n = this.f130428m.a(m99802xdc417a90.m99321x981c205a().mo36721xbe9ba820(), this.f130424i.m99795xa62d00a(), this.f130424i.m99796xa62d00b());
            }
            int m99803xac19204d = this.f130424i.m99803xac19204d();
            if (m99803xac19204d != -1) {
                this.f130428m.b(m99803xac19204d);
            }
            this.f130428m.c(this.f130424i.m99805xed6088cf());
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26049xf556c77d m99800x1525e167 = this.f130424i.m99800x1525e167();
            if (m99800x1525e167 != null && m99800x1525e167.m99583xb33869df() != null && (m99320x12501425 = (m99583xb33869df = m99800x1525e167.m99583xb33869df()).m99320x12501425(this.f130428m.mo36630x76847179())) != null && !m99320x12501425.isRecycled()) {
                this.f130427l = m99583xb33869df;
                this.f130428m.c(m99583xb33869df.m99321x981c205a().mo36721xbe9ba820());
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e[] m99582x1a6b975b = m99800x1525e167.m99582x1a6b975b();
                if (m99582x1a6b975b != null && m99582x1a6b975b.length == 4) {
                    java.lang.String[] strArr = new java.lang.String[m99582x1a6b975b.length];
                    for (int i17 = 0; i17 < m99582x1a6b975b.length; i17++) {
                        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e c26010x4177761e = m99582x1a6b975b[i17];
                        if (c26010x4177761e != null) {
                            c26010x4177761e.m99320x12501425(this.f130428m.mo36630x76847179());
                            strArr[i17] = m99582x1a6b975b[i17].m99321x981c205a().mo36721xbe9ba820();
                        } else {
                            strArr[i17] = "";
                        }
                    }
                    this.f130428m.a(m99583xb33869df.m99321x981c205a().mo36721xbe9ba820(), strArr[0], strArr[1], strArr[2], strArr[3]);
                }
            }
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26050x731307b9 m99801xcc918023 = this.f130424i.m99801xcc918023();
            if (m99801xcc918023 != null) {
                this.f130428m.a(m99801xcc918023.m99588x755bd410(), m99801xcc918023.m99586x7444d5ad(), m99801xcc918023.m99587x849c8ad8());
            }
        }
    }

    private void b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329.LocationRegionChangedListener locationRegionChangedListener) {
        if (locationRegionChangedListener != null) {
            java.util.Iterator<java.lang.ref.WeakReference<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329.LocationRegionChangedListener>> it = this.f130423h.iterator();
            while (it.hasNext()) {
                if (it.next().get() != locationRegionChangedListener) {
                    it.remove();
                }
            }
        }
    }

    private static /* synthetic */ void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf bfVar, android.location.Location location) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMyLocationChangeListener onMyLocationChangeListener;
        if (!bfVar.f130418c || location == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131758z, "updateMyLocation ".concat(java.lang.String.valueOf(location)));
        bfVar.a(location);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26072x8cb38890 c26072x8cb38890 = bfVar.f130424i;
        if (c26072x8cb38890 != null) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(location.getLatitude(), location.getLongitude());
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26016x7851a8f0 interfaceC26016x7851a8f0 = bfVar.f130420e;
            if (interfaceC26016x7851a8f0 != null) {
                interfaceC26016x7851a8f0.mo36401x6ff2357(c26041x873d1d26);
                bfVar.f130420e.mo36405x205ac394(location.getAccuracy());
            }
            bfVar.f130428m.a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df.m35328x3017aa(c26041x873d1d26), 0.0f, 0.0f, false);
            int m99804xdc46cd51 = c26072x8cb38890.m99804xdc46cd51();
            if (m99804xdc46cd51 == 1) {
                bfVar.f130428m.a(location.getBearing());
            } else if (m99804xdc46cd51 != 2) {
                if (m99804xdc46cd51 != 3) {
                    bfVar.f130428m.a(location.getBearing());
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar = bfVar.f130416a;
                    if (abVar != null) {
                        abVar.a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25951xd3dd04bc.m99100xcf810ec6(c26041x873d1d26));
                    }
                } else {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar2 = bfVar.f130416a;
                    if (abVar2 != null) {
                        bfVar.f130416a.a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25951xd3dd04bc.m99105xfd98fd36(location.getBearing(), abVar2.a().f49414x3652bd));
                    }
                }
            }
        }
        java.lang.ref.WeakReference<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMyLocationChangeListener> weakReference = bfVar.f130421f;
        if (weakReference == null || (onMyLocationChangeListener = weakReference.get()) == null) {
            return;
        }
        onMyLocationChangeListener.m99168xd1fa7490(location);
    }

    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26072x8cb38890 c26072x8cb38890, android.location.Location location) {
        if (location == null || c26072x8cb38890 == null) {
            return;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(location.getLatitude(), location.getLongitude());
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26016x7851a8f0 interfaceC26016x7851a8f0 = this.f130420e;
        if (interfaceC26016x7851a8f0 != null) {
            interfaceC26016x7851a8f0.mo36401x6ff2357(c26041x873d1d26);
            this.f130420e.mo36405x205ac394(location.getAccuracy());
        }
        this.f130428m.a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df.m35328x3017aa(c26041x873d1d26), 0.0f, 0.0f, false);
        int m99804xdc46cd51 = c26072x8cb38890.m99804xdc46cd51();
        if (m99804xdc46cd51 == 1) {
            this.f130428m.a(location.getBearing());
            return;
        }
        if (m99804xdc46cd51 != 2) {
            if (m99804xdc46cd51 != 3) {
                this.f130428m.a(location.getBearing());
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar = this.f130416a;
                if (abVar != null) {
                    abVar.a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25951xd3dd04bc.m99100xcf810ec6(c26041x873d1d26));
                    return;
                }
                return;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar2 = this.f130416a;
            if (abVar2 != null) {
                this.f130416a.a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25951xd3dd04bc.m99105xfd98fd36(location.getBearing(), abVar2.a().f49414x3652bd));
            }
        }
    }

    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26072x8cb38890 c26072x8cb38890) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99583xb33869df;
        android.graphics.Bitmap m99320x12501425;
        if (c26072x8cb38890 == null) {
            return;
        }
        this.f130424i = c26072x8cb38890;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26016x7851a8f0 interfaceC26016x7851a8f0 = this.f130420e;
        if (interfaceC26016x7851a8f0 != null) {
            interfaceC26016x7851a8f0.mo36403x17b1755e(c26072x8cb38890.m99799xbb5db4ea());
            this.f130420e.mo36392xe1d3a649(c26072x8cb38890.m99806x4b6e32d5());
            this.f130420e.mo36393xe2eaa4ac(c26072x8cb38890.m99807x4c853138());
            int m99797xd4cdb75e = c26072x8cb38890.m99797xd4cdb75e();
            if (m99797xd4cdb75e != -1) {
                this.f130420e.mo35536x534d5c42(m99797xd4cdb75e);
            }
            this.f130420e.mo36429x2cb3cb7a(c26072x8cb38890.m99798xdb3ed3de());
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131758z, "mMyLocationId: " + this.f130429n + ", mIcon " + this.f130426k + ", enableShowMyLocation: " + this.f130418c);
        if (!this.f130418c || this.f130426k == null) {
            return;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99802xdc417a90 = c26072x8cb38890.m99802xdc417a90();
        if (m99802xdc417a90 == null) {
            m99802xdc417a90 = b();
        }
        android.graphics.Bitmap m99320x125014252 = m99802xdc417a90.m99320x12501425(this.f130428m.mo36630x76847179());
        if (m99320x125014252 != null && !m99320x125014252.isRecycled()) {
            java.lang.String mo36721xbe9ba820 = m99802xdc417a90.m99321x981c205a().mo36721xbe9ba820();
            if (!this.f130426k.m99321x981c205a().mo36721xbe9ba820().equals(mo36721xbe9ba820)) {
                this.f130426k = c26072x8cb38890.m99802xdc417a90() == null ? b() : c26072x8cb38890.m99802xdc417a90();
                this.f130429n = this.f130428m.a(mo36721xbe9ba820, c26072x8cb38890.m99795xa62d00a(), c26072x8cb38890.m99796xa62d00b());
            }
        }
        int m99803xac19204d = c26072x8cb38890.m99803xac19204d();
        if (m99803xac19204d != -1) {
            this.f130428m.b(m99803xac19204d);
        }
        this.f130428m.c(c26072x8cb38890.m99805xed6088cf());
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26049xf556c77d m99800x1525e167 = c26072x8cb38890.m99800x1525e167();
        if (m99800x1525e167 != null && m99800x1525e167.m99583xb33869df() != null && (m99320x12501425 = (m99583xb33869df = m99800x1525e167.m99583xb33869df()).m99320x12501425(this.f130428m.mo36630x76847179())) != null && !m99320x12501425.isRecycled()) {
            java.lang.String mo36721xbe9ba8202 = m99583xb33869df.m99321x981c205a().mo36721xbe9ba820();
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e c26010x4177761e = this.f130427l;
            if (!(c26010x4177761e != null ? c26010x4177761e.m99321x981c205a().mo36721xbe9ba820() : "").equals(mo36721xbe9ba8202)) {
                this.f130427l = m99583xb33869df;
                this.f130428m.c(mo36721xbe9ba8202);
            }
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e[] m99582x1a6b975b = m99800x1525e167.m99582x1a6b975b();
            if (m99582x1a6b975b != null && m99582x1a6b975b.length == 4) {
                java.lang.String[] strArr = new java.lang.String[m99582x1a6b975b.length];
                for (int i17 = 0; i17 < m99582x1a6b975b.length; i17++) {
                    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e c26010x4177761e2 = m99582x1a6b975b[i17];
                    if (c26010x4177761e2 != null) {
                        c26010x4177761e2.m99320x12501425(this.f130428m.mo36630x76847179());
                        strArr[i17] = m99582x1a6b975b[i17].m99321x981c205a().mo36721xbe9ba820();
                    } else {
                        strArr[i17] = "";
                    }
                }
                this.f130428m.a(mo36721xbe9ba8202, strArr[0], strArr[1], strArr[2], strArr[3]);
            }
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26050x731307b9 m99801xcc918023 = c26072x8cb38890.m99801xcc918023();
        if (m99801xcc918023 != null) {
            this.f130428m.a(m99801xcc918023.m99588x755bd410(), m99801xcc918023.m99586x7444d5ad(), m99801xcc918023.m99587x849c8ad8());
        }
    }

    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMyLocationChangeListener onMyLocationChangeListener) {
        if (onMyLocationChangeListener == null) {
            return;
        }
        this.f130421f = new java.lang.ref.WeakReference<>(onMyLocationChangeListener);
    }

    private boolean a(float f17, float f18) {
        java.lang.ref.WeakReference<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMyLocationClickListener> weakReference;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMyLocationClickListener onMyLocationClickListener;
        com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.p531xc04b6a6a.C4389x448e86b0 a17 = this.f130428m.f132043j.f130494a.i().a(f17, f18);
        boolean z17 = a17 != null && a17.f17376x368f3a == 6;
        if (!z17 || (weakReference = this.f130422g) == null || (onMyLocationClickListener = weakReference.get()) == null) {
            return z17;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26();
        android.location.Location location = this.f130425j;
        if (location != null) {
            c26041x873d1d26.m99513xeff5e924(location.getAltitude());
            c26041x873d1d26.m99516x63f13b6d(this.f130425j.getLongitude());
            c26041x873d1d26.m99514x20be4aee(this.f130425j.getLatitude());
        }
        return onMyLocationClickListener.m99169x74934b47(c26041x873d1d26);
    }

    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMyLocationClickListener onMyLocationClickListener) {
        if (onMyLocationClickListener == null) {
            return;
        }
        this.f130422g = new java.lang.ref.WeakReference<>(onMyLocationClickListener);
    }

    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329.LocationRegionChangedListener locationRegionChangedListener) {
        if (locationRegionChangedListener != null) {
            this.f130423h.add(new java.lang.ref.WeakReference<>(locationRegionChangedListener));
        }
    }
}
