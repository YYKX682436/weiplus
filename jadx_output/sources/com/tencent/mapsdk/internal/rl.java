package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class rl implements com.tencent.mapsdk.internal.cg {

    /* renamed from: k, reason: collision with root package name */
    private static final java.lang.String f51210k = "PromoteImageCache";

    /* renamed from: a, reason: collision with root package name */
    boolean f51211a;

    /* renamed from: b, reason: collision with root package name */
    com.tencent.mapsdk.internal.cg.a f51212b;

    /* renamed from: c, reason: collision with root package name */
    final com.tencent.mapsdk.internal.cd f51213c;

    /* renamed from: d, reason: collision with root package name */
    final com.tencent.mapsdk.internal.rl.b f51214d;

    /* renamed from: e, reason: collision with root package name */
    final java.util.Map<com.tencent.mapsdk.internal.cc, java.lang.Boolean> f51215e;

    /* renamed from: f, reason: collision with root package name */
    final java.util.Map<com.tencent.mapsdk.internal.cc, java.lang.Boolean> f51216f;

    /* renamed from: g, reason: collision with root package name */
    final java.util.Map<com.tencent.mapsdk.internal.cc, java.lang.Boolean> f51217g;

    /* renamed from: h, reason: collision with root package name */
    final java.util.Map<com.tencent.mapsdk.internal.cc, java.lang.Boolean> f51218h;

    /* renamed from: i, reason: collision with root package name */
    final java.util.Map<java.lang.String, java.util.Set<com.tencent.mapsdk.internal.cc>> f51219i;

    /* renamed from: j, reason: collision with root package name */
    final com.tencent.mapsdk.internal.rl.a f51220j;

    /* renamed from: l, reason: collision with root package name */
    private int f51221l;

    /* renamed from: m, reason: collision with root package name */
    private int f51222m;

    /* renamed from: n, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.lw f51223n;

    /* renamed from: o, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.lu f51224o;

    /* renamed from: p, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.ko.a<java.lang.Boolean> f51225p;

    public rl(com.tencent.mapsdk.internal.cd cdVar) {
        com.tencent.mapsdk.internal.lw lwVar = new com.tencent.mapsdk.internal.lw();
        this.f51223n = lwVar;
        this.f51224o = new com.tencent.mapsdk.internal.ma();
        this.f51214d = new com.tencent.mapsdk.internal.rl.b();
        this.f51215e = new java.util.concurrent.ConcurrentHashMap();
        this.f51216f = new java.util.concurrent.ConcurrentHashMap();
        this.f51217g = new java.util.concurrent.ConcurrentHashMap();
        this.f51218h = new java.util.concurrent.ConcurrentHashMap();
        this.f51219i = new java.util.concurrent.ConcurrentHashMap();
        this.f51220j = new com.tencent.mapsdk.internal.rl.a();
        this.f51225p = new com.tencent.mapsdk.internal.ko.a<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.rl.1
            private void a(java.lang.Boolean bool) {
                if (!bool.booleanValue() || com.tencent.mapsdk.internal.rl.this.f51212b == null) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.rl.f51210k, "thisCallbackRunnable do nothing !");
                    return;
                }
                com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.rl.f51210k, "notify layer handle result before :" + com.tencent.mapsdk.internal.rl.this.f51218h.size() + "|" + com.tencent.mapsdk.internal.rl.this.f51217g.size() + "|" + com.tencent.mapsdk.internal.rl.this.f51216f.size());
                com.tencent.mapsdk.internal.rl rlVar = com.tencent.mapsdk.internal.rl.this;
                rlVar.f51212b.a(rlVar.f51218h.keySet(), com.tencent.mapsdk.internal.rl.this.f51217g.keySet(), com.tencent.mapsdk.internal.rl.this.f51216f.keySet());
                for (com.tencent.mapsdk.internal.cc ccVar : com.tencent.mapsdk.internal.rl.this.f51216f.keySet()) {
                    if (ccVar.g() == com.tencent.mapsdk.internal.cc.a.REMOVE) {
                        com.tencent.mapsdk.internal.rl.this.f51216f.remove(ccVar);
                        com.tencent.mapsdk.internal.rl.this.f51215e.remove(ccVar);
                    }
                }
                for (com.tencent.mapsdk.internal.cc ccVar2 : com.tencent.mapsdk.internal.rl.this.f51218h.keySet()) {
                    if (ccVar2.g() == com.tencent.mapsdk.internal.cc.a.ADD) {
                        com.tencent.mapsdk.internal.rl.this.f51218h.remove(ccVar2);
                    }
                }
                for (com.tencent.mapsdk.internal.cc ccVar3 : com.tencent.mapsdk.internal.rl.this.f51217g.keySet()) {
                    if (ccVar3.g() == com.tencent.mapsdk.internal.cc.a.ADD || ccVar3.g() == com.tencent.mapsdk.internal.cc.a.SHOWING) {
                        com.tencent.mapsdk.internal.rl.this.f51217g.remove(ccVar3);
                    }
                }
                com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.rl.f51210k, "notify layer handle result after:" + com.tencent.mapsdk.internal.rl.this.f51218h.size() + "|" + com.tencent.mapsdk.internal.rl.this.f51217g.size() + "|" + com.tencent.mapsdk.internal.rl.this.f51216f.size());
            }

            @Override // com.tencent.mapsdk.internal.ko.a, com.tencent.map.tools.Callback
            public final /* synthetic */ void callback(java.lang.Object obj) {
                if (!((java.lang.Boolean) obj).booleanValue() || com.tencent.mapsdk.internal.rl.this.f51212b == null) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.rl.f51210k, "thisCallbackRunnable do nothing !");
                    return;
                }
                com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.rl.f51210k, "notify layer handle result before :" + com.tencent.mapsdk.internal.rl.this.f51218h.size() + "|" + com.tencent.mapsdk.internal.rl.this.f51217g.size() + "|" + com.tencent.mapsdk.internal.rl.this.f51216f.size());
                com.tencent.mapsdk.internal.rl rlVar = com.tencent.mapsdk.internal.rl.this;
                rlVar.f51212b.a(rlVar.f51218h.keySet(), com.tencent.mapsdk.internal.rl.this.f51217g.keySet(), com.tencent.mapsdk.internal.rl.this.f51216f.keySet());
                for (com.tencent.mapsdk.internal.cc ccVar : com.tencent.mapsdk.internal.rl.this.f51216f.keySet()) {
                    if (ccVar.g() == com.tencent.mapsdk.internal.cc.a.REMOVE) {
                        com.tencent.mapsdk.internal.rl.this.f51216f.remove(ccVar);
                        com.tencent.mapsdk.internal.rl.this.f51215e.remove(ccVar);
                    }
                }
                for (com.tencent.mapsdk.internal.cc ccVar2 : com.tencent.mapsdk.internal.rl.this.f51218h.keySet()) {
                    if (ccVar2.g() == com.tencent.mapsdk.internal.cc.a.ADD) {
                        com.tencent.mapsdk.internal.rl.this.f51218h.remove(ccVar2);
                    }
                }
                for (com.tencent.mapsdk.internal.cc ccVar3 : com.tencent.mapsdk.internal.rl.this.f51217g.keySet()) {
                    if (ccVar3.g() == com.tencent.mapsdk.internal.cc.a.ADD || ccVar3.g() == com.tencent.mapsdk.internal.cc.a.SHOWING) {
                        com.tencent.mapsdk.internal.rl.this.f51217g.remove(ccVar3);
                    }
                }
                com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.rl.f51210k, "notify layer handle result after:" + com.tencent.mapsdk.internal.rl.this.f51218h.size() + "|" + com.tencent.mapsdk.internal.rl.this.f51217g.size() + "|" + com.tencent.mapsdk.internal.rl.this.f51216f.size());
            }
        };
        this.f51213c = cdVar;
        lwVar.a(new com.tencent.mapsdk.internal.mb() { // from class: com.tencent.mapsdk.internal.rl.2
            @Override // com.tencent.mapsdk.internal.mb, com.tencent.mapsdk.internal.lv
            public final void a(java.lang.String str, byte[] bArr) {
                super.a(str, bArr);
                java.util.Set<com.tencent.mapsdk.internal.cc> set = com.tencent.mapsdk.internal.rl.this.f51219i.get(str);
                if (set != null) {
                    java.util.Iterator<com.tencent.mapsdk.internal.cc> it = set.iterator();
                    while (it.hasNext()) {
                        com.tencent.mapsdk.internal.rl.this.a(str, bArr, it.next());
                    }
                }
            }

            @Override // com.tencent.mapsdk.internal.mb, com.tencent.mapsdk.internal.lv
            public final void c(java.lang.String str) {
                super.c(str);
                java.util.Set<com.tencent.mapsdk.internal.cc> remove = com.tencent.mapsdk.internal.rl.this.f51219i.remove(str);
                if (remove != null) {
                    for (com.tencent.mapsdk.internal.cc ccVar : remove) {
                        if (ccVar != null && ccVar.b(com.tencent.mapsdk.internal.rl.this.f51211a) != null) {
                            ccVar.a(com.tencent.mapsdk.internal.cc.a.WILL_ADD);
                            com.tencent.mapsdk.internal.rl.this.f51218h.put(ccVar, java.lang.Boolean.TRUE);
                        }
                    }
                }
                if (!com.tencent.mapsdk.internal.rl.this.f51219i.isEmpty() || com.tencent.mapsdk.internal.rl.this.f51218h.isEmpty()) {
                    return;
                }
                com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.rl.f51210k, "onCompleted all icons to add on layer");
                com.tencent.mapsdk.internal.rl.this.b();
            }

            @Override // com.tencent.mapsdk.internal.mb, com.tencent.mapsdk.internal.lv
            public final void a(java.lang.String str, com.tencent.mapsdk.internal.lx lxVar) {
                com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.rl.f51210k, "download icon " + lxVar + " url : " + str);
                if (lxVar == com.tencent.mapsdk.internal.lx.CANCEL || lxVar == com.tencent.mapsdk.internal.lx.ERROR) {
                    com.tencent.mapsdk.internal.rl.this.f51220j.c(str);
                }
            }
        });
    }

    /* loaded from: classes13.dex */
    public static class a extends com.tencent.mapsdk.internal.lg<java.lang.String, byte[]> {
        public a() {
            super(com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES);
        }

        @Override // com.tencent.mapsdk.internal.lg
        public final /* bridge */ /* synthetic */ int a(byte[] bArr) {
            return bArr.length;
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        private static int a2(byte[] bArr) {
            return bArr.length;
        }
    }

    private boolean b(java.util.List<com.tencent.mapsdk.internal.cc> list) {
        com.tencent.mapsdk.core.utils.log.LogUtil.b(f51210k, "mergeNewImages ... :".concat(java.lang.String.valueOf(list)));
        java.util.List[] a17 = com.tencent.mapsdk.internal.hq.a((java.util.List) new java.util.ArrayList(this.f51215e.keySet()), (java.util.List) list);
        com.tencent.mapsdk.core.utils.log.LogUtil.b(f51210k, "diff :" + a17[0]);
        com.tencent.mapsdk.core.utils.log.LogUtil.b(f51210k, "same :" + a17[1]);
        com.tencent.mapsdk.core.utils.log.LogUtil.b(f51210k, "insert :" + a17[2]);
        com.tencent.mapsdk.core.utils.log.LogUtil.b(f51210k, "merge :" + a17[3]);
        java.util.Iterator it = a17[3].iterator();
        while (it.hasNext()) {
            this.f51215e.put((com.tencent.mapsdk.internal.cc) it.next(), java.lang.Boolean.TRUE);
        }
        if (a17[1].size() > 0) {
            a(this.f51217g, (java.util.List<com.tencent.mapsdk.internal.cc>) a17[1], com.tencent.mapsdk.internal.cc.a.WILL_UPDATE);
        }
        if (a17[2].size() > 0) {
            a(this.f51218h, (java.util.List<com.tencent.mapsdk.internal.cc>) a17[2], com.tencent.mapsdk.internal.cc.a.WILL_ADD);
        }
        return a17[1].size() > 0 || a17[2].size() > 0;
    }

    public final void a(java.lang.String str, byte[] bArr, com.tencent.mapsdk.internal.cc ccVar) {
        com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor a17;
        if (ccVar != null) {
            java.lang.String a18 = ccVar.a(false);
            java.lang.String a19 = ccVar.a(true);
            if (str.equals(a18)) {
                com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor a27 = this.f51213c.a(ccVar, bArr, false, false);
                if (a27 != null) {
                    ccVar.a(a27, false);
                }
                if (com.tencent.mapsdk.internal.hr.a(a19)) {
                    ccVar.a(this.f51213c.a(ccVar, bArr, true, true), true);
                    return;
                }
                return;
            }
            if (!str.equals(a19) || (a17 = this.f51213c.a(ccVar, bArr, true, false)) == null) {
                return;
            }
            ccVar.a(a17, true);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.rl$3, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass3 extends com.tencent.mapsdk.internal.ko.g<java.lang.Boolean> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f51228a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.String f51229b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.tencent.mapsdk.internal.v.c f51230c;

        public AnonymousClass3(java.lang.String str, java.lang.String str2, com.tencent.mapsdk.internal.v.c cVar) {
            this.f51228a = str;
            this.f51229b = str2;
            this.f51230c = cVar;
        }

        private java.lang.Boolean a() {
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.rl.f51210k, "load from network ... range:" + this.f51228a + " level:" + this.f51229b);
            com.tencent.map.tools.net.NetResponse fetchData = com.tencent.mapsdk.internal.cf.b().fetchData(this.f51228a, this.f51229b);
            if (fetchData.available()) {
                java.lang.String data = fetchData.getData();
                com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.rl.f51210k, "fetch json:".concat(java.lang.String.valueOf(data)));
                if (!android.text.TextUtils.isEmpty(data)) {
                    java.util.List<com.tencent.mapsdk.internal.cc> a17 = com.tencent.mapsdk.internal.rl.this.f51213c.a(data);
                    com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.rl.f51210k, "mergeNewImages :" + a17.size());
                    com.tencent.mapsdk.internal.rl.this.f51214d.a(this.f51230c, a17);
                    if (com.tencent.mapsdk.internal.rl.a(com.tencent.mapsdk.internal.rl.this, a17)) {
                        java.util.List[] a18 = com.tencent.mapsdk.internal.hq.a((java.util.List) new java.util.ArrayList(com.tencent.mapsdk.internal.rl.this.f51218h.keySet()), (java.util.List) new java.util.ArrayList(com.tencent.mapsdk.internal.rl.this.f51217g.keySet()));
                        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.rl.f51210k, "notify new or update Images :" + a18[3].size());
                        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.rl.f51210k, "notify downloadIcons :".concat(java.lang.String.valueOf(com.tencent.mapsdk.internal.rl.b(com.tencent.mapsdk.internal.rl.this, a18[3]))));
                        int intValue = ((java.lang.Integer) com.tencent.mapsdk.internal.hq.a((java.lang.Iterable) a18[3], (com.tencent.mapsdk.internal.hq.e) new com.tencent.mapsdk.internal.rl.AnonymousClass3.AnonymousClass1(0))).intValue();
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notify update ? ");
                        sb6.append(intValue > 0);
                        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.rl.f51210k, sb6.toString());
                        return java.lang.Boolean.valueOf(intValue > 0);
                    }
                }
            }
            return java.lang.Boolean.FALSE;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ java.lang.Object call() {
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.rl.f51210k, "load from network ... range:" + this.f51228a + " level:" + this.f51229b);
            com.tencent.map.tools.net.NetResponse fetchData = com.tencent.mapsdk.internal.cf.b().fetchData(this.f51228a, this.f51229b);
            if (fetchData.available()) {
                java.lang.String data = fetchData.getData();
                com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.rl.f51210k, "fetch json:".concat(java.lang.String.valueOf(data)));
                if (!android.text.TextUtils.isEmpty(data)) {
                    java.util.List<com.tencent.mapsdk.internal.cc> a17 = com.tencent.mapsdk.internal.rl.this.f51213c.a(data);
                    com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.rl.f51210k, "mergeNewImages :" + a17.size());
                    com.tencent.mapsdk.internal.rl.this.f51214d.a(this.f51230c, a17);
                    if (com.tencent.mapsdk.internal.rl.a(com.tencent.mapsdk.internal.rl.this, a17)) {
                        java.util.List[] a18 = com.tencent.mapsdk.internal.hq.a((java.util.List) new java.util.ArrayList(com.tencent.mapsdk.internal.rl.this.f51218h.keySet()), (java.util.List) new java.util.ArrayList(com.tencent.mapsdk.internal.rl.this.f51217g.keySet()));
                        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.rl.f51210k, "notify new or update Images :" + a18[3].size());
                        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.rl.f51210k, "notify downloadIcons :".concat(java.lang.String.valueOf(com.tencent.mapsdk.internal.rl.b(com.tencent.mapsdk.internal.rl.this, a18[3]))));
                        int intValue = ((java.lang.Integer) com.tencent.mapsdk.internal.hq.a((java.lang.Iterable) a18[3], (com.tencent.mapsdk.internal.hq.e) new com.tencent.mapsdk.internal.rl.AnonymousClass3.AnonymousClass1(0))).intValue();
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notify update ? ");
                        sb6.append(intValue > 0);
                        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.rl.f51210k, sb6.toString());
                        return java.lang.Boolean.valueOf(intValue > 0);
                    }
                }
            }
            return java.lang.Boolean.FALSE;
        }

        /* renamed from: com.tencent.mapsdk.internal.rl$3$1, reason: invalid class name */
        /* loaded from: classes13.dex */
        public class AnonymousClass1 extends com.tencent.mapsdk.internal.hq.e<com.tencent.mapsdk.internal.cc, java.lang.Integer> {
            public AnonymousClass1(java.lang.Integer num) {
                super(num);
            }

            @Override // com.tencent.mapsdk.internal.hq.e
            public final /* synthetic */ java.lang.Integer a(java.lang.Integer num, com.tencent.mapsdk.internal.cc ccVar) {
                java.lang.Integer num2 = num;
                com.tencent.mapsdk.internal.cc ccVar2 = ccVar;
                if (ccVar2.g() != com.tencent.mapsdk.internal.cc.a.WILL_ADD && ccVar2.g() != com.tencent.mapsdk.internal.cc.a.WILL_UPDATE && ccVar2.g() != com.tencent.mapsdk.internal.cc.a.WILL_REMOVE) {
                    return 0;
                }
                return java.lang.Integer.valueOf(num2.intValue() + 1);
            }

            /* renamed from: a, reason: avoid collision after fix types in other method */
            private static java.lang.Integer a2(java.lang.Integer num, com.tencent.mapsdk.internal.cc ccVar) {
                if (ccVar.g() != com.tencent.mapsdk.internal.cc.a.WILL_ADD && ccVar.g() != com.tencent.mapsdk.internal.cc.a.WILL_UPDATE && ccVar.g() != com.tencent.mapsdk.internal.cc.a.WILL_REMOVE) {
                    return 0;
                }
                return java.lang.Integer.valueOf(num.intValue() + 1);
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.cg
    public final void a(com.tencent.mapsdk.internal.cg.a aVar) {
        this.f51212b = aVar;
    }

    @Override // com.tencent.mapsdk.internal.cg
    public final void a() {
        com.tencent.mapsdk.core.utils.log.LogUtil.b(f51210k, "destroyCache ... ");
        this.f51220j.a();
        this.f51214d.a();
        this.f51215e.clear();
        this.f51218h.clear();
        this.f51216f.clear();
        this.f51217g.clear();
        this.f51219i.clear();
        this.f51212b = null;
    }

    public final void b() {
        this.f51225p.callback(java.lang.Boolean.TRUE);
    }

    public static /* synthetic */ int b(com.tencent.mapsdk.internal.rl rlVar, java.util.List list) {
        com.tencent.mapsdk.core.utils.log.LogUtil.b(f51210k, "downloadIcons ... ");
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.cc ccVar = (com.tencent.mapsdk.internal.cc) it.next();
            com.tencent.mapsdk.internal.cc.a g17 = ccVar.g();
            com.tencent.mapsdk.internal.cc.a aVar = com.tencent.mapsdk.internal.cc.a.PREPARING;
            if (g17 != aVar) {
                java.lang.String a17 = ccVar.a(rlVar.f51211a);
                com.tencent.mapsdk.core.utils.log.LogUtil.b(f51210k, "id[" + ccVar.a() + "]icon url : " + a17);
                com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor b17 = ccVar.b(rlVar.f51211a);
                if (b17 == null) {
                    if (com.tencent.mapsdk.internal.hr.a(a17)) {
                        a17 = ccVar.a(false);
                    }
                    byte[] b18 = rlVar.f51220j.b((com.tencent.mapsdk.internal.rl.a) a17);
                    if (b18 != null && b18.length > 0) {
                        rlVar.a(a17, b18, ccVar);
                    } else {
                        java.util.Set<com.tencent.mapsdk.internal.cc> set = rlVar.f51219i.get(a17);
                        if (set == null) {
                            set = new java.util.concurrent.ConcurrentSkipListSet<>();
                            rlVar.f51219i.put(a17, set);
                        }
                        set.add(ccVar);
                        if (set.size() == 1) {
                            i17++;
                            rlVar.f51223n.a(a17, rlVar.f51224o);
                        }
                        ccVar.a(aVar);
                    }
                } else {
                    android.graphics.Bitmap bitmap = b17.getBitmap(rlVar.f51213c.getMapContext().getContext());
                    if (bitmap == null || bitmap.isRecycled()) {
                        ccVar.a(aVar);
                    }
                }
            }
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.b(f51210k, "<= downloadIcons");
        return i17;
    }

    /* loaded from: classes13.dex */
    public class b extends com.tencent.mapsdk.internal.lg<com.tencent.mapsdk.internal.v.c, java.util.List<com.tencent.mapsdk.internal.cc>> {
        public b() {
            super(9);
        }

        @Override // com.tencent.mapsdk.internal.lg
        public final /* synthetic */ void a(boolean z17, com.tencent.mapsdk.internal.v.c cVar, java.util.List<com.tencent.mapsdk.internal.cc> list, java.util.List<com.tencent.mapsdk.internal.cc> list2) {
            com.tencent.mapsdk.internal.v.c cVar2 = cVar;
            java.util.List<com.tencent.mapsdk.internal.cc> list3 = list;
            java.util.List<com.tencent.mapsdk.internal.cc> list4 = list2;
            super.a(z17, (boolean) cVar2, list3, list4);
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.rl.f51210k, "LRU entryRemoved key:".concat(java.lang.String.valueOf(cVar2)));
            if (((com.tencent.mapsdk.internal.rk) com.tencent.mapsdk.internal.rl.this.f51213c).f51191b == com.tencent.mapsdk.internal.rk.a.f51206c) {
                java.util.List[] a17 = com.tencent.mapsdk.internal.hq.a((java.util.List) list3, (java.util.List) list4);
                if (a17[3].size() > 0) {
                    com.tencent.mapsdk.internal.rl.a(com.tencent.mapsdk.internal.rl.this.f51216f, (java.util.List<com.tencent.mapsdk.internal.cc>) a17[3], com.tencent.mapsdk.internal.cc.a.WILL_REMOVE);
                    if (com.tencent.mapsdk.internal.rl.this.f51216f.isEmpty()) {
                        return;
                    }
                    com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.rl.f51210k, "LRU entryRemoved notify callback to remove");
                    com.tencent.mapsdk.internal.rl.this.b();
                }
            }
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        private void a2(boolean z17, com.tencent.mapsdk.internal.v.c cVar, java.util.List<com.tencent.mapsdk.internal.cc> list, java.util.List<com.tencent.mapsdk.internal.cc> list2) {
            super.a(z17, (boolean) cVar, list, list2);
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.rl.f51210k, "LRU entryRemoved key:".concat(java.lang.String.valueOf(cVar)));
            if (((com.tencent.mapsdk.internal.rk) com.tencent.mapsdk.internal.rl.this.f51213c).f51191b == com.tencent.mapsdk.internal.rk.a.f51206c) {
                java.util.List[] a17 = com.tencent.mapsdk.internal.hq.a((java.util.List) list, (java.util.List) list2);
                if (a17[3].size() > 0) {
                    com.tencent.mapsdk.internal.rl.a(com.tencent.mapsdk.internal.rl.this.f51216f, (java.util.List<com.tencent.mapsdk.internal.cc>) a17[3], com.tencent.mapsdk.internal.cc.a.WILL_REMOVE);
                    if (com.tencent.mapsdk.internal.rl.this.f51216f.isEmpty()) {
                        return;
                    }
                    com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.rl.f51210k, "LRU entryRemoved notify callback to remove");
                    com.tencent.mapsdk.internal.rl.this.b();
                }
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.cg
    public final void a(com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition, boolean z17, int i17, int i18) {
        com.tencent.mapsdk.core.utils.log.LogUtil.b(f51210k, "loadCurrent... pos:" + cameraPosition + " isNight:" + z17 + " minLevel:" + i17 + " maxLevel:" + i18);
        boolean z18 = (this.f51211a == z17 && this.f51221l == i17 && this.f51222m == i18) ? false : true;
        this.f51211a = z17;
        this.f51221l = i17;
        this.f51222m = i18;
        com.tencent.tencentmap.mapsdk.maps.model.VisibleRegion visibleRegion = ((com.tencent.mapsdk.internal.bd) this.f51213c.getMapContext()).d().getMap().getProjection().getVisibleRegion();
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(com.tencent.mapsdk.internal.y.c(visibleRegion.farLeft));
        hashSet.add(com.tencent.mapsdk.internal.y.c(visibleRegion.farRight));
        hashSet.add(com.tencent.mapsdk.internal.y.c(visibleRegion.nearRight));
        hashSet.add(com.tencent.mapsdk.internal.y.c(visibleRegion.nearLeft));
        java.util.ArrayList arrayList = new java.util.ArrayList(hashSet);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(this.f51214d.d().keySet());
        java.util.List[] a17 = com.tencent.mapsdk.internal.hq.a((java.util.List) arrayList2, (java.util.List) arrayList);
        com.tencent.mapsdk.core.utils.log.LogUtil.b(f51210k, "当前瓦片数据：".concat(java.lang.String.valueOf(arrayList2)));
        if (a17[2].size() > 0) {
            for (com.tencent.mapsdk.internal.v.c cVar : a17[2]) {
                com.tencent.mapsdk.core.utils.log.LogUtil.b(f51210k, "新增瓦片[" + cVar + "]");
                if (cVar != null) {
                    com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds build = com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.builder().include(java.util.Arrays.asList(com.tencent.mapsdk.internal.y.a(cVar))).build();
                    if (!build.isEmptySpan()) {
                        com.tencent.mapsdk.internal.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.rl.AnonymousClass3(build.northeast.latitude + "," + build.northeast.longitude + ";" + build.southwest.latitude + "," + build.southwest.longitude, this.f51221l + "," + this.f51222m, cVar)).a((com.tencent.mapsdk.internal.ko.b.a) java.lang.Boolean.FALSE, (com.tencent.mapsdk.internal.ko.a<com.tencent.mapsdk.internal.ko.b.a>) this.f51225p);
                    }
                }
            }
        } else {
            com.tencent.mapsdk.core.utils.log.LogUtil.b(f51210k, "无新增瓦片数据:" + this.f51214d.b());
        }
        if (z18) {
            for (java.util.Map.Entry<com.tencent.mapsdk.internal.v.c, java.util.List<com.tencent.mapsdk.internal.cc>> entry : this.f51214d.d().entrySet()) {
                if (entry != null && entry.getValue() != null && !entry.getValue().isEmpty()) {
                    a(this.f51217g, entry.getValue(), com.tencent.mapsdk.internal.cc.a.WILL_UPDATE);
                    com.tencent.mapsdk.core.utils.log.LogUtil.b(f51210k, "更新瓦片[" + entry.getKey() + "]的数据，总数=" + entry.getValue().size() + " 可更新：" + this.f51217g.size());
                }
            }
            b();
            return;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.b(f51210k, "无更新瓦片数据");
    }

    @Override // com.tencent.mapsdk.internal.cg
    public final java.util.List<com.tencent.mapsdk.internal.cc> a(long j17, long j18, long j19) {
        return this.f51214d.b((com.tencent.mapsdk.internal.rl.b) new com.tencent.mapsdk.internal.v.c(j17, j18, j19));
    }

    private void a(com.tencent.mapsdk.internal.v.c cVar) {
        if (cVar == null) {
            return;
        }
        com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds build = com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.builder().include(java.util.Arrays.asList(com.tencent.mapsdk.internal.y.a(cVar))).build();
        if (build.isEmptySpan()) {
            return;
        }
        com.tencent.mapsdk.internal.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.rl.AnonymousClass3(build.northeast.latitude + "," + build.northeast.longitude + ";" + build.southwest.latitude + "," + build.southwest.longitude, this.f51221l + "," + this.f51222m, cVar)).a((com.tencent.mapsdk.internal.ko.b.a) java.lang.Boolean.FALSE, (com.tencent.mapsdk.internal.ko.a<com.tencent.mapsdk.internal.ko.b.a>) this.f51225p);
    }

    private int a(java.util.List<com.tencent.mapsdk.internal.cc> list) {
        com.tencent.mapsdk.core.utils.log.LogUtil.b(f51210k, "downloadIcons ... ");
        int i17 = 0;
        for (com.tencent.mapsdk.internal.cc ccVar : list) {
            com.tencent.mapsdk.internal.cc.a g17 = ccVar.g();
            com.tencent.mapsdk.internal.cc.a aVar = com.tencent.mapsdk.internal.cc.a.PREPARING;
            if (g17 != aVar) {
                java.lang.String a17 = ccVar.a(this.f51211a);
                com.tencent.mapsdk.core.utils.log.LogUtil.b(f51210k, "id[" + ccVar.a() + "]icon url : " + a17);
                com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor b17 = ccVar.b(this.f51211a);
                if (b17 == null) {
                    if (com.tencent.mapsdk.internal.hr.a(a17)) {
                        a17 = ccVar.a(false);
                    }
                    byte[] b18 = this.f51220j.b((com.tencent.mapsdk.internal.rl.a) a17);
                    if (b18 != null && b18.length > 0) {
                        a(a17, b18, ccVar);
                    } else {
                        java.util.Set<com.tencent.mapsdk.internal.cc> set = this.f51219i.get(a17);
                        if (set == null) {
                            set = new java.util.concurrent.ConcurrentSkipListSet<>();
                            this.f51219i.put(a17, set);
                        }
                        set.add(ccVar);
                        if (set.size() == 1) {
                            i17++;
                            this.f51223n.a(a17, this.f51224o);
                        }
                        ccVar.a(aVar);
                    }
                } else {
                    android.graphics.Bitmap bitmap = b17.getBitmap(this.f51213c.getMapContext().getContext());
                    if (bitmap == null || bitmap.isRecycled()) {
                        ccVar.a(aVar);
                    }
                }
            }
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.b(f51210k, "<= downloadIcons");
        return i17;
    }

    public static void a(java.util.Map<com.tencent.mapsdk.internal.cc, java.lang.Boolean> map, java.util.List<com.tencent.mapsdk.internal.cc> list, com.tencent.mapsdk.internal.cc.a aVar) {
        for (com.tencent.mapsdk.internal.cc ccVar : com.tencent.mapsdk.internal.hq.a((java.util.List) new java.util.ArrayList(map.keySet()), (java.util.List) list)[3]) {
            if (ccVar.a(aVar)) {
                map.put(ccVar, java.lang.Boolean.TRUE);
            }
        }
    }

    public static /* synthetic */ boolean a(com.tencent.mapsdk.internal.rl rlVar, java.util.List list) {
        com.tencent.mapsdk.core.utils.log.LogUtil.b(f51210k, "mergeNewImages ... :".concat(java.lang.String.valueOf(list)));
        java.util.List[] a17 = com.tencent.mapsdk.internal.hq.a((java.util.List) new java.util.ArrayList(rlVar.f51215e.keySet()), list);
        com.tencent.mapsdk.core.utils.log.LogUtil.b(f51210k, "diff :" + a17[0]);
        com.tencent.mapsdk.core.utils.log.LogUtil.b(f51210k, "same :" + a17[1]);
        com.tencent.mapsdk.core.utils.log.LogUtil.b(f51210k, "insert :" + a17[2]);
        com.tencent.mapsdk.core.utils.log.LogUtil.b(f51210k, "merge :" + a17[3]);
        java.util.Iterator it = a17[3].iterator();
        while (it.hasNext()) {
            rlVar.f51215e.put((com.tencent.mapsdk.internal.cc) it.next(), java.lang.Boolean.TRUE);
        }
        if (a17[1].size() > 0) {
            a(rlVar.f51217g, (java.util.List<com.tencent.mapsdk.internal.cc>) a17[1], com.tencent.mapsdk.internal.cc.a.WILL_UPDATE);
        }
        if (a17[2].size() > 0) {
            a(rlVar.f51218h, (java.util.List<com.tencent.mapsdk.internal.cc>) a17[2], com.tencent.mapsdk.internal.cc.a.WILL_ADD);
        }
        return a17[1].size() > 0 || a17[2].size() > 0;
    }
}
