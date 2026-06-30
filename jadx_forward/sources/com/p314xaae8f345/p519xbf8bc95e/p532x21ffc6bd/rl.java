package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class rl implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cg {

    /* renamed from: k, reason: collision with root package name */
    private static final java.lang.String f132743k = "PromoteImageCache";

    /* renamed from: a, reason: collision with root package name */
    boolean f132744a;

    /* renamed from: b, reason: collision with root package name */
    com.tencent.mapsdk.internal.cg.a f132745b;

    /* renamed from: c, reason: collision with root package name */
    final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cd f132746c;

    /* renamed from: d, reason: collision with root package name */
    final com.tencent.mapsdk.internal.rl.b f132747d;

    /* renamed from: e, reason: collision with root package name */
    final java.util.Map<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc, java.lang.Boolean> f132748e;

    /* renamed from: f, reason: collision with root package name */
    final java.util.Map<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc, java.lang.Boolean> f132749f;

    /* renamed from: g, reason: collision with root package name */
    final java.util.Map<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc, java.lang.Boolean> f132750g;

    /* renamed from: h, reason: collision with root package name */
    final java.util.Map<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc, java.lang.Boolean> f132751h;

    /* renamed from: i, reason: collision with root package name */
    final java.util.Map<java.lang.String, java.util.Set<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc>> f132752i;

    /* renamed from: j, reason: collision with root package name */
    final com.tencent.mapsdk.internal.rl.a f132753j;

    /* renamed from: l, reason: collision with root package name */
    private int f132754l;

    /* renamed from: m, reason: collision with root package name */
    private int f132755m;

    /* renamed from: n, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lw f132756n;

    /* renamed from: o, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lu f132757o;

    /* renamed from: p, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.ko.a<java.lang.Boolean> f132758p;

    public rl(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cd cdVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lw lwVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lw();
        this.f132756n = lwVar;
        this.f132757o = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ma();
        this.f132747d = new com.tencent.mapsdk.internal.rl.b();
        this.f132748e = new java.util.concurrent.ConcurrentHashMap();
        this.f132749f = new java.util.concurrent.ConcurrentHashMap();
        this.f132750g = new java.util.concurrent.ConcurrentHashMap();
        this.f132751h = new java.util.concurrent.ConcurrentHashMap();
        this.f132752i = new java.util.concurrent.ConcurrentHashMap();
        this.f132753j = new com.tencent.mapsdk.internal.rl.a();
        this.f132758p = new com.tencent.mapsdk.internal.ko.a<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.rl.1
            private void a(java.lang.Boolean bool) {
                if (!bool.booleanValue() || com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132745b == null) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.f132743k, "thisCallbackRunnable do nothing !");
                    return;
                }
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.f132743k, "notify layer handle result before :" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132751h.size() + "|" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132750g.size() + "|" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132749f.size());
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl rlVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this;
                rlVar.f132745b.a(rlVar.f132751h.keySet(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132750g.keySet(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132749f.keySet());
                for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc ccVar : com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132749f.keySet()) {
                    if (ccVar.g() == com.tencent.mapsdk.internal.cc.a.REMOVE) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132749f.remove(ccVar);
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132748e.remove(ccVar);
                    }
                }
                for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc ccVar2 : com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132751h.keySet()) {
                    if (ccVar2.g() == com.tencent.mapsdk.internal.cc.a.ADD) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132751h.remove(ccVar2);
                    }
                }
                for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc ccVar3 : com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132750g.keySet()) {
                    if (ccVar3.g() == com.tencent.mapsdk.internal.cc.a.ADD || ccVar3.g() == com.tencent.mapsdk.internal.cc.a.SHOWING) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132750g.remove(ccVar3);
                    }
                }
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.f132743k, "notify layer handle result after:" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132751h.size() + "|" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132750g.size() + "|" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132749f.size());
            }

            @Override // com.tencent.mapsdk.internal.ko.a, com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465
            /* renamed from: callback */
            public final /* synthetic */ void mo35806xf5bc2045(java.lang.Object obj) {
                if (!((java.lang.Boolean) obj).booleanValue() || com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132745b == null) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.f132743k, "thisCallbackRunnable do nothing !");
                    return;
                }
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.f132743k, "notify layer handle result before :" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132751h.size() + "|" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132750g.size() + "|" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132749f.size());
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl rlVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this;
                rlVar.f132745b.a(rlVar.f132751h.keySet(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132750g.keySet(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132749f.keySet());
                for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc ccVar : com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132749f.keySet()) {
                    if (ccVar.g() == com.tencent.mapsdk.internal.cc.a.REMOVE) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132749f.remove(ccVar);
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132748e.remove(ccVar);
                    }
                }
                for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc ccVar2 : com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132751h.keySet()) {
                    if (ccVar2.g() == com.tencent.mapsdk.internal.cc.a.ADD) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132751h.remove(ccVar2);
                    }
                }
                for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc ccVar3 : com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132750g.keySet()) {
                    if (ccVar3.g() == com.tencent.mapsdk.internal.cc.a.ADD || ccVar3.g() == com.tencent.mapsdk.internal.cc.a.SHOWING) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132750g.remove(ccVar3);
                    }
                }
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.f132743k, "notify layer handle result after:" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132751h.size() + "|" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132750g.size() + "|" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132749f.size());
            }
        };
        this.f132746c = cdVar;
        lwVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mb() { // from class: com.tencent.mapsdk.internal.rl.2
            @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mb, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lv
            public final void a(java.lang.String str, byte[] bArr) {
                super.a(str, bArr);
                java.util.Set<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc> set = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132752i.get(str);
                if (set != null) {
                    java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc> it = set.iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.a(str, bArr, it.next());
                    }
                }
            }

            @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mb, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lv
            public final void c(java.lang.String str) {
                super.c(str);
                java.util.Set<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc> remove = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132752i.remove(str);
                if (remove != null) {
                    for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc ccVar : remove) {
                        if (ccVar != null && ccVar.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132744a) != null) {
                            ccVar.a(com.tencent.mapsdk.internal.cc.a.WILL_ADD);
                            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132751h.put(ccVar, java.lang.Boolean.TRUE);
                        }
                    }
                }
                if (!com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132752i.isEmpty() || com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132751h.isEmpty()) {
                    return;
                }
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.f132743k, "onCompleted all icons to add on layer");
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.b();
            }

            @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mb, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lv
            public final void a(java.lang.String str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx lxVar) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.f132743k, "download icon " + lxVar + " url : " + str);
                if (lxVar == com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.CANCEL || lxVar == com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.ERROR) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132753j.c(str);
                }
            }
        });
    }

    /* loaded from: classes13.dex */
    public static class a extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lg<java.lang.String, byte[]> {
        public a() {
            super(com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb);
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lg
        public final /* bridge */ /* synthetic */ int a(byte[] bArr) {
            return bArr.length;
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        private static int a2(byte[] bArr) {
            return bArr.length;
        }
    }

    private boolean b(java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc> list) {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132743k, "mergeNewImages ... :".concat(java.lang.String.valueOf(list)));
        java.util.List[] a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hq.a((java.util.List) new java.util.ArrayList(this.f132748e.keySet()), (java.util.List) list);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132743k, "diff :" + a17[0]);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132743k, "same :" + a17[1]);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132743k, "insert :" + a17[2]);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132743k, "merge :" + a17[3]);
        java.util.Iterator it = a17[3].iterator();
        while (it.hasNext()) {
            this.f132748e.put((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc) it.next(), java.lang.Boolean.TRUE);
        }
        if (a17[1].size() > 0) {
            a(this.f132750g, (java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc>) a17[1], com.tencent.mapsdk.internal.cc.a.WILL_UPDATE);
        }
        if (a17[2].size() > 0) {
            a(this.f132751h, (java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc>) a17[2], com.tencent.mapsdk.internal.cc.a.WILL_ADD);
        }
        return a17[1].size() > 0 || a17[2].size() > 0;
    }

    public final void a(java.lang.String str, byte[] bArr, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc ccVar) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e a17;
        if (ccVar != null) {
            java.lang.String a18 = ccVar.a(false);
            java.lang.String a19 = ccVar.a(true);
            if (str.equals(a18)) {
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e a27 = this.f132746c.a(ccVar, bArr, false, false);
                if (a27 != null) {
                    ccVar.a(a27, false);
                }
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(a19)) {
                    ccVar.a(this.f132746c.a(ccVar, bArr, true, true), true);
                    return;
                }
                return;
            }
            if (!str.equals(a19) || (a17 = this.f132746c.a(ccVar, bArr, true, false)) == null) {
                return;
            }
            ccVar.a(a17, true);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.rl$3, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass3 extends com.tencent.mapsdk.internal.ko.g<java.lang.Boolean> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f132761a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.String f132762b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.tencent.mapsdk.internal.v.c f132763c;

        public AnonymousClass3(java.lang.String str, java.lang.String str2, com.tencent.mapsdk.internal.v.c cVar) {
            this.f132761a = str;
            this.f132762b = str2;
            this.f132763c = cVar;
        }

        private java.lang.Boolean a() {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.f132743k, "load from network ... range:" + this.f132761a + " level:" + this.f132762b);
            com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m36672xb6377d84 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cf.b().m36672xb6377d84(this.f132761a, this.f132762b);
            if (m36672xb6377d84.mo36017xd4418ac9()) {
                java.lang.String m36020xfb7e5820 = m36672xb6377d84.m36020xfb7e5820();
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.f132743k, "fetch json:".concat(java.lang.String.valueOf(m36020xfb7e5820)));
                if (!android.text.TextUtils.isEmpty(m36020xfb7e5820)) {
                    java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc> a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132746c.a(m36020xfb7e5820);
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.f132743k, "mergeNewImages :" + a17.size());
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132747d.a(this.f132763c, a17);
                    if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this, a17)) {
                        java.util.List[] a18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hq.a((java.util.List) new java.util.ArrayList(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132751h.keySet()), (java.util.List) new java.util.ArrayList(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132750g.keySet()));
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.f132743k, "notify new or update Images :" + a18[3].size());
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.f132743k, "notify downloadIcons :".concat(java.lang.String.valueOf(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this, a18[3]))));
                        int intValue = ((java.lang.Integer) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hq.a((java.lang.Iterable) a18[3], (com.tencent.mapsdk.internal.hq.e) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.AnonymousClass3.AnonymousClass1(0))).intValue();
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notify update ? ");
                        sb6.append(intValue > 0);
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.f132743k, sb6.toString());
                        return java.lang.Boolean.valueOf(intValue > 0);
                    }
                }
            }
            return java.lang.Boolean.FALSE;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ java.lang.Object call() {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.f132743k, "load from network ... range:" + this.f132761a + " level:" + this.f132762b);
            com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m36672xb6377d84 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cf.b().m36672xb6377d84(this.f132761a, this.f132762b);
            if (m36672xb6377d84.mo36017xd4418ac9()) {
                java.lang.String m36020xfb7e5820 = m36672xb6377d84.m36020xfb7e5820();
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.f132743k, "fetch json:".concat(java.lang.String.valueOf(m36020xfb7e5820)));
                if (!android.text.TextUtils.isEmpty(m36020xfb7e5820)) {
                    java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc> a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132746c.a(m36020xfb7e5820);
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.f132743k, "mergeNewImages :" + a17.size());
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132747d.a(this.f132763c, a17);
                    if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this, a17)) {
                        java.util.List[] a18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hq.a((java.util.List) new java.util.ArrayList(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132751h.keySet()), (java.util.List) new java.util.ArrayList(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132750g.keySet()));
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.f132743k, "notify new or update Images :" + a18[3].size());
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.f132743k, "notify downloadIcons :".concat(java.lang.String.valueOf(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this, a18[3]))));
                        int intValue = ((java.lang.Integer) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hq.a((java.lang.Iterable) a18[3], (com.tencent.mapsdk.internal.hq.e) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.AnonymousClass3.AnonymousClass1(0))).intValue();
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notify update ? ");
                        sb6.append(intValue > 0);
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.f132743k, sb6.toString());
                        return java.lang.Boolean.valueOf(intValue > 0);
                    }
                }
            }
            return java.lang.Boolean.FALSE;
        }

        /* renamed from: com.tencent.mapsdk.internal.rl$3$1, reason: invalid class name */
        /* loaded from: classes13.dex */
        public class AnonymousClass1 extends com.tencent.mapsdk.internal.hq.e<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc, java.lang.Integer> {
            public AnonymousClass1(java.lang.Integer num) {
                super(num);
            }

            @Override // com.tencent.mapsdk.internal.hq.e
            public final /* synthetic */ java.lang.Integer a(java.lang.Integer num, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc ccVar) {
                java.lang.Integer num2 = num;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc ccVar2 = ccVar;
                if (ccVar2.g() != com.tencent.mapsdk.internal.cc.a.WILL_ADD && ccVar2.g() != com.tencent.mapsdk.internal.cc.a.WILL_UPDATE && ccVar2.g() != com.tencent.mapsdk.internal.cc.a.WILL_REMOVE) {
                    return 0;
                }
                return java.lang.Integer.valueOf(num2.intValue() + 1);
            }

            /* renamed from: a, reason: avoid collision after fix types in other method */
            private static java.lang.Integer a2(java.lang.Integer num, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc ccVar) {
                if (ccVar.g() != com.tencent.mapsdk.internal.cc.a.WILL_ADD && ccVar.g() != com.tencent.mapsdk.internal.cc.a.WILL_UPDATE && ccVar.g() != com.tencent.mapsdk.internal.cc.a.WILL_REMOVE) {
                    return 0;
                }
                return java.lang.Integer.valueOf(num.intValue() + 1);
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cg
    public final void a(com.tencent.mapsdk.internal.cg.a aVar) {
        this.f132745b = aVar;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cg
    public final void a() {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132743k, "destroyCache ... ");
        this.f132753j.a();
        this.f132747d.a();
        this.f132748e.clear();
        this.f132751h.clear();
        this.f132749f.clear();
        this.f132750g.clear();
        this.f132752i.clear();
        this.f132745b = null;
    }

    public final void b() {
        this.f132758p.mo35806xf5bc2045(java.lang.Boolean.TRUE);
    }

    public static /* synthetic */ int b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl rlVar, java.util.List list) {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132743k, "downloadIcons ... ");
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc ccVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc) it.next();
            com.tencent.mapsdk.internal.cc.a g17 = ccVar.g();
            com.tencent.mapsdk.internal.cc.a aVar = com.tencent.mapsdk.internal.cc.a.PREPARING;
            if (g17 != aVar) {
                java.lang.String a17 = ccVar.a(rlVar.f132744a);
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132743k, "id[" + ccVar.a() + "]icon url : " + a17);
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e b17 = ccVar.b(rlVar.f132744a);
                if (b17 == null) {
                    if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(a17)) {
                        a17 = ccVar.a(false);
                    }
                    byte[] b18 = rlVar.f132753j.b((com.tencent.mapsdk.internal.rl.a) a17);
                    if (b18 != null && b18.length > 0) {
                        rlVar.a(a17, b18, ccVar);
                    } else {
                        java.util.Set<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc> set = rlVar.f132752i.get(a17);
                        if (set == null) {
                            set = new java.util.concurrent.ConcurrentSkipListSet<>();
                            rlVar.f132752i.put(a17, set);
                        }
                        set.add(ccVar);
                        if (set.size() == 1) {
                            i17++;
                            rlVar.f132756n.a(a17, rlVar.f132757o);
                        }
                        ccVar.a(aVar);
                    }
                } else {
                    android.graphics.Bitmap m99320x12501425 = b17.m99320x12501425(rlVar.f132746c.mo36621x2de760a9().mo36630x76847179());
                    if (m99320x12501425 == null || m99320x12501425.isRecycled()) {
                        ccVar.a(aVar);
                    }
                }
            }
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132743k, "<= downloadIcons");
        return i17;
    }

    /* loaded from: classes13.dex */
    public class b extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lg<com.tencent.mapsdk.internal.v.c, java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc>> {
        public b() {
            super(9);
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lg
        public final /* synthetic */ void a(boolean z17, com.tencent.mapsdk.internal.v.c cVar, java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc> list, java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc> list2) {
            com.tencent.mapsdk.internal.v.c cVar2 = cVar;
            java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc> list3 = list;
            java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc> list4 = list2;
            super.a(z17, (boolean) cVar2, list3, list4);
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.f132743k, "LRU entryRemoved key:".concat(java.lang.String.valueOf(cVar2)));
            if (((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rk) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132746c).f132724b == com.tencent.mapsdk.internal.rk.a.f132739c) {
                java.util.List[] a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hq.a((java.util.List) list3, (java.util.List) list4);
                if (a17[3].size() > 0) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132749f, (java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc>) a17[3], com.tencent.mapsdk.internal.cc.a.WILL_REMOVE);
                    if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132749f.isEmpty()) {
                        return;
                    }
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.f132743k, "LRU entryRemoved notify callback to remove");
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.b();
                }
            }
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        private void a2(boolean z17, com.tencent.mapsdk.internal.v.c cVar, java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc> list, java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc> list2) {
            super.a(z17, (boolean) cVar, list, list2);
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.f132743k, "LRU entryRemoved key:".concat(java.lang.String.valueOf(cVar)));
            if (((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rk) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132746c).f132724b == com.tencent.mapsdk.internal.rk.a.f132739c) {
                java.util.List[] a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hq.a((java.util.List) list, (java.util.List) list2);
                if (a17[3].size() > 0) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132749f, (java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc>) a17[3], com.tencent.mapsdk.internal.cc.a.WILL_REMOVE);
                    if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.f132749f.isEmpty()) {
                        return;
                    }
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.f132743k, "LRU entryRemoved notify callback to remove");
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.this.b();
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cg
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e c26015xa89e978e, boolean z17, int i17, int i18) {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132743k, "loadCurrent... pos:" + c26015xa89e978e + " isNight:" + z17 + " minLevel:" + i17 + " maxLevel:" + i18);
        boolean z18 = (this.f132744a == z17 && this.f132754l == i17 && this.f132755m == i18) ? false : true;
        this.f132744a = z17;
        this.f132754l = i17;
        this.f132755m = i18;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26100x627095e6 mo37073xf0312250 = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd) this.f132746c.mo36621x2de760a9()).d().mo36068xb5885626().mo37464x78d58245().mo37073xf0312250();
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.c(mo37073xf0312250.f49841xbfac3bbe));
        hashSet.add(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.c(mo37073xf0312250.f49842x36319d45));
        hashSet.add(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.c(mo37073xf0312250.f49845x83b822d4));
        hashSet.add(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.c(mo37073xf0312250.f49844x2d87484f));
        java.util.ArrayList arrayList = new java.util.ArrayList(hashSet);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(this.f132747d.d().keySet());
        java.util.List[] a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hq.a((java.util.List) arrayList2, (java.util.List) arrayList);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132743k, "当前瓦片数据：".concat(java.lang.String.valueOf(arrayList2)));
        if (a17[2].size() > 0) {
            for (com.tencent.mapsdk.internal.v.c cVar : a17[2]) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132743k, "新增瓦片[" + cVar + "]");
                if (cVar != null) {
                    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b m99563x59bc66e = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b.m99525xdc3ef9b().m99565x73c954a8(java.util.Arrays.asList(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.a(cVar))).m99563x59bc66e();
                    if (!m99563x59bc66e.m99558xf199c42d()) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a((com.tencent.mapsdk.internal.ko.g) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.AnonymousClass3(m99563x59bc66e.f49513x1a6ba282.f49501xaa2bac6c + "," + m99563x59bc66e.f49513x1a6ba282.f49502x83009af + ";" + m99563x59bc66e.f49514x9e7cbcfc.f49501xaa2bac6c + "," + m99563x59bc66e.f49514x9e7cbcfc.f49502x83009af, this.f132754l + "," + this.f132755m, cVar)).a((com.tencent.mapsdk.internal.ko.b.a) java.lang.Boolean.FALSE, (com.tencent.mapsdk.internal.ko.a<com.tencent.mapsdk.internal.ko.b.a>) this.f132758p);
                    }
                }
            }
        } else {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132743k, "无新增瓦片数据:" + this.f132747d.b());
        }
        if (z18) {
            for (java.util.Map.Entry<com.tencent.mapsdk.internal.v.c, java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc>> entry : this.f132747d.d().entrySet()) {
                if (entry != null && entry.getValue() != null && !entry.getValue().isEmpty()) {
                    a(this.f132750g, entry.getValue(), com.tencent.mapsdk.internal.cc.a.WILL_UPDATE);
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132743k, "更新瓦片[" + entry.getKey() + "]的数据，总数=" + entry.getValue().size() + " 可更新：" + this.f132750g.size());
                }
            }
            b();
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132743k, "无更新瓦片数据");
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cg
    public final java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc> a(long j17, long j18, long j19) {
        return this.f132747d.b((com.tencent.mapsdk.internal.rl.b) new com.tencent.mapsdk.internal.v.c(j17, j18, j19));
    }

    private void a(com.tencent.mapsdk.internal.v.c cVar) {
        if (cVar == null) {
            return;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b m99563x59bc66e = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b.m99525xdc3ef9b().m99565x73c954a8(java.util.Arrays.asList(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.a(cVar))).m99563x59bc66e();
        if (m99563x59bc66e.m99558xf199c42d()) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a((com.tencent.mapsdk.internal.ko.g) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl.AnonymousClass3(m99563x59bc66e.f49513x1a6ba282.f49501xaa2bac6c + "," + m99563x59bc66e.f49513x1a6ba282.f49502x83009af + ";" + m99563x59bc66e.f49514x9e7cbcfc.f49501xaa2bac6c + "," + m99563x59bc66e.f49514x9e7cbcfc.f49502x83009af, this.f132754l + "," + this.f132755m, cVar)).a((com.tencent.mapsdk.internal.ko.b.a) java.lang.Boolean.FALSE, (com.tencent.mapsdk.internal.ko.a<com.tencent.mapsdk.internal.ko.b.a>) this.f132758p);
    }

    private int a(java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc> list) {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132743k, "downloadIcons ... ");
        int i17 = 0;
        for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc ccVar : list) {
            com.tencent.mapsdk.internal.cc.a g17 = ccVar.g();
            com.tencent.mapsdk.internal.cc.a aVar = com.tencent.mapsdk.internal.cc.a.PREPARING;
            if (g17 != aVar) {
                java.lang.String a17 = ccVar.a(this.f132744a);
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132743k, "id[" + ccVar.a() + "]icon url : " + a17);
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e b17 = ccVar.b(this.f132744a);
                if (b17 == null) {
                    if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(a17)) {
                        a17 = ccVar.a(false);
                    }
                    byte[] b18 = this.f132753j.b((com.tencent.mapsdk.internal.rl.a) a17);
                    if (b18 != null && b18.length > 0) {
                        a(a17, b18, ccVar);
                    } else {
                        java.util.Set<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc> set = this.f132752i.get(a17);
                        if (set == null) {
                            set = new java.util.concurrent.ConcurrentSkipListSet<>();
                            this.f132752i.put(a17, set);
                        }
                        set.add(ccVar);
                        if (set.size() == 1) {
                            i17++;
                            this.f132756n.a(a17, this.f132757o);
                        }
                        ccVar.a(aVar);
                    }
                } else {
                    android.graphics.Bitmap m99320x12501425 = b17.m99320x12501425(this.f132746c.mo36621x2de760a9().mo36630x76847179());
                    if (m99320x12501425 == null || m99320x12501425.isRecycled()) {
                        ccVar.a(aVar);
                    }
                }
            }
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132743k, "<= downloadIcons");
        return i17;
    }

    public static void a(java.util.Map<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc, java.lang.Boolean> map, java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc> list, com.tencent.mapsdk.internal.cc.a aVar) {
        for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc ccVar : com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hq.a((java.util.List) new java.util.ArrayList(map.keySet()), (java.util.List) list)[3]) {
            if (ccVar.a(aVar)) {
                map.put(ccVar, java.lang.Boolean.TRUE);
            }
        }
    }

    public static /* synthetic */ boolean a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl rlVar, java.util.List list) {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132743k, "mergeNewImages ... :".concat(java.lang.String.valueOf(list)));
        java.util.List[] a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hq.a((java.util.List) new java.util.ArrayList(rlVar.f132748e.keySet()), list);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132743k, "diff :" + a17[0]);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132743k, "same :" + a17[1]);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132743k, "insert :" + a17[2]);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132743k, "merge :" + a17[3]);
        java.util.Iterator it = a17[3].iterator();
        while (it.hasNext()) {
            rlVar.f132748e.put((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc) it.next(), java.lang.Boolean.TRUE);
        }
        if (a17[1].size() > 0) {
            a(rlVar.f132750g, (java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc>) a17[1], com.tencent.mapsdk.internal.cc.a.WILL_UPDATE);
        }
        if (a17[2].size() > 0) {
            a(rlVar.f132751h, (java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc>) a17[2], com.tencent.mapsdk.internal.cc.a.WILL_ADD);
        }
        return a17[1].size() > 0 || a17[2].size() > 0;
    }
}
