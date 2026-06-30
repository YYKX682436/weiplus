package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class qa implements com.tencent.mapsdk.internal.qb.c, com.tencent.mapsdk.internal.qc.a {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f132387c = "AUTH_MARKER";

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bk f132388a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List<android.os.AsyncTask> f132389b;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr f132390d;

    /* renamed from: e, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sp f132391e;

    /* renamed from: f, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rr f132392f;

    /* renamed from: g, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qh f132393g;

    /* renamed from: h, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qu f132394h;

    /* renamed from: i, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne f132395i;

    /* renamed from: j, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qf f132396j;

    /* renamed from: k, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.so f132397k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f132398l;

    /* renamed from: m, reason: collision with root package name */
    private java.lang.ref.WeakReference<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnAuthResultCallback> f132399m;

    /* renamed from: n, reason: collision with root package name */
    private final java.util.Map<com.tencent.mapsdk.internal.qa.b, java.lang.Boolean> f132400n = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: o, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.qa.b f132401o;

    /* renamed from: p, reason: collision with root package name */
    private final com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4331x8e5805a3 f132402p;

    /* loaded from: classes13.dex */
    public interface a {
        void a(android.graphics.Bitmap bitmap, int i17, int i18);
    }

    /* loaded from: classes13.dex */
    public interface b {
        void a(int i17, java.lang.String str);

        void a(com.tencent.mapsdk.internal.qb.b bVar);
    }

    public qa(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg bgVar) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mapsdk.internal.qa.b bVar = new com.tencent.mapsdk.internal.qa.b() { // from class: com.tencent.mapsdk.internal.qa.1
            @Override // com.tencent.mapsdk.internal.qa.b
            public final void a(com.tencent.mapsdk.internal.qb.b bVar2) {
            }

            @Override // com.tencent.mapsdk.internal.qa.b
            public final void a(int i17, java.lang.String str3) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qa.this.f132390d;
                if (trVar == null || (neVar = trVar.f133806as) == null || (hgVar = neVar.f130533c) == null) {
                    return;
                }
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gs s17 = hgVar.s();
                java.lang.String str4 = i17 + str3;
                com.tencent.mapsdk.internal.gs.a aVar = s17.f131212a.get(str4);
                if (aVar == null) {
                    aVar = new com.tencent.mapsdk.internal.gs.a();
                    s17.f131212a.put(str4, aVar);
                }
                aVar.f131216b = i17;
                aVar.f131217c = str3;
                aVar.f131215a++;
            }
        };
        this.f132401o = bVar;
        this.f132402p = new com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4331x8e5805a3() { // from class: com.tencent.mapsdk.internal.qa.2
            @Override // com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4331x8e5805a3
            /* renamed from: onConnect */
            public final void mo36029x885a7a0b(int i17, int i18) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131744l, "NetStatusListener onConnect .. type:" + i17 + " signalLevel:" + i18);
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qa.this.f132391e.f133049d) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131744l, "NetStatusListener refresh WorldAuth");
                    new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qc(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qa.this.f132395i.mo36630x76847179(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qa.this.f132397k, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qa.this).execute(new java.lang.Object[0]);
                    com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70.m35928x9cf0d20b().m35942xd194a59f(this);
                }
            }

            @Override // com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4331x8e5805a3
            /* renamed from: onLost */
            public final void mo36030xc39c41a3(int i17) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131744l, "NetStatusListener onLost .. reason:".concat(java.lang.String.valueOf(i17)));
            }
        };
        android.content.Context context = bgVar.f130439c;
        this.f132390d = bgVar.f130438b;
        this.f132391e = bgVar.f130438b.f133728j;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bk bkVar = bgVar.f130440d;
        this.f132388a = bkVar;
        this.f132392f = bgVar.f130441e;
        this.f132393g = bgVar.f130442f;
        this.f132394h = bgVar.f130443g;
        this.f132395i = bgVar.f130438b.f133806as;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.so soVar = bgVar.f130438b.f133728j.f133047b;
        this.f132397k = soVar;
        this.f132389b = new java.util.concurrent.CopyOnWriteArrayList();
        if (bgVar.f130438b == null || bgVar.f130438b.M() == null) {
            str = "";
            str2 = str;
        } else {
            java.lang.String m99217x2ff2e2f5 = bgVar.f130438b.M().m99217x2ff2e2f5();
            java.lang.String m99216x7528ddc5 = bgVar.f130438b.M().m99216x7528ddc5();
            this.f132399m = new java.lang.ref.WeakReference<>(bgVar.f130438b.M().m99210x415a9282());
            str = m99217x2ff2e2f5;
            str2 = m99216x7528ddc5;
        }
        this.f132396j = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qf(context, bgVar, str);
        this.f132389b.add(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qb(bkVar.f130517i, str, str2, this, this.f132389b));
        this.f132389b.add(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qc(context, soVar, this));
        a(bVar);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnAuthResultCallback
    /* renamed from: onAuthFail */
    public final void mo36922xfa7237e5(int i17, java.lang.String str) {
        java.lang.ref.WeakReference<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnAuthResultCallback> weakReference = this.f132399m;
        if (weakReference != null && weakReference.get() != null) {
            this.f132399m.get().mo36922xfa7237e5(i17, str);
        }
        java.util.Iterator<com.tencent.mapsdk.internal.qa.b> it = this.f132400n.keySet().iterator();
        while (it.hasNext()) {
            it.next().a(i17, str);
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f132389b.size(); i19++) {
            if (this.f132389b.get(i19) instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qb) {
                i18++;
            }
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(b()).e(com.tencent.mapsdk.internal.la.a.f131796d, "retry count: " + i18 + ", code: " + i17 + ", message: " + str);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnAuthResultCallback
    /* renamed from: onAuthSuccess */
    public final void mo36923x833155dc() {
        java.lang.ref.WeakReference<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnAuthResultCallback> weakReference = this.f132399m;
        if (weakReference != null && weakReference.get() != null) {
            this.f132399m.get().mo36923x833155dc();
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(b()).c(com.tencent.mapsdk.internal.la.a.f131796d, "onAuthSuccess");
    }

    private void a(com.tencent.mapsdk.internal.qa.a aVar, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7) {
        this.f132388a.a(aVar, c25966x7e4576a7);
    }

    private void d() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.Y, b());
        java.util.Iterator<android.os.AsyncTask> it = this.f132389b.iterator();
        while (it.hasNext()) {
            it.next().execute(new java.lang.Object[0]);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f132390d;
        if (trVar == null || (neVar = trVar.f133806as) == null || (hgVar = neVar.f130533c) == null) {
            return;
        }
        hgVar.s().a();
    }

    public final void b(com.tencent.mapsdk.internal.qa.b bVar) {
        this.f132400n.remove(bVar);
    }

    @Override // com.tencent.mapsdk.internal.qb.c
    public final void c() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f132390d;
        if (trVar == null || (neVar = trVar.f133806as) == null || (hgVar = neVar.f130533c) == null) {
            return;
        }
        hgVar.s().a();
    }

    public final void a(com.tencent.mapsdk.internal.qa.b bVar) {
        this.f132400n.put(bVar, java.lang.Boolean.TRUE);
    }

    public final int b() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f132395i;
        if (neVar != null) {
            return neVar.K;
        }
        return -1;
    }

    private void a(com.tencent.mapsdk.internal.qb.b bVar) {
        java.util.Iterator<com.tencent.mapsdk.internal.qa.b> it = this.f132400n.keySet().iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
    }

    private void a(int i17, java.lang.String str) {
        java.util.Iterator<com.tencent.mapsdk.internal.qa.b> it = this.f132400n.keySet().iterator();
        while (it.hasNext()) {
            it.next().a(i17, str);
        }
    }

    private void a(org.json.JSONArray jSONArray, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fx fxVar) {
        java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rq> a17;
        boolean z17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rr rrVar = this.f132392f;
        if (rrVar == null) {
            return;
        }
        org.json.JSONArray m35878x7ace8163 = com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35878x7ace8163(rrVar.f132790e.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.A));
        if (jSONArray != null && (a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rr.a(jSONArray)) != null) {
            synchronized (rrVar.f132789d) {
                rrVar.f132788c.clear();
                rrVar.f132788c.addAll(a17);
            }
            try {
                z17 = !com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35871xd41ebd0c(jSONArray, m35878x7ace8163);
            } catch (java.lang.Throwable unused) {
                z17 = true;
            }
            if (z17) {
                rrVar.f132790e.a();
                rrVar.f132790e.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.A, jSONArray.toString());
            }
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ac acVar = this.f132390d.f133732n;
        if (acVar != null) {
            if (fxVar != null) {
                acVar.f130307b = fxVar;
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131739g, "IndoorAuth:".concat(java.lang.String.valueOf(fxVar)));
                acVar.f130306a.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.B, fxVar.f131029c);
                acVar.f130306a.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.C, fxVar.f131030d);
                org.json.JSONArray jSONArray2 = fxVar.f131031e;
                if (jSONArray2 != null) {
                    acVar.f130306a.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.D, jSONArray2.toString());
                }
                com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9 = acVar.f130309d;
                if (c4430xc2040f9 != null) {
                    c4430xc2040f9.a(acVar.c());
                    if (acVar.c() == 1) {
                        acVar.f130309d.a(acVar.d());
                    }
                }
            } else {
                acVar.f130306a.a(new java.lang.String[]{com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.B, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.C, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.D});
            }
            if (acVar.f130307b == null) {
                acVar.f130307b = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fx();
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ac.AnonymousClass2());
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qf qfVar = this.f132396j;
        java.lang.String a18 = this.f132392f.a();
        java.lang.String a19 = qfVar.a();
        if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qf.f132447e.containsKey(a19)) {
            qfVar.a(a19, qfVar.f132452f);
            return;
        }
        qfVar.a(a19, qfVar.f132452f);
        java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg> weakReference = qfVar.f132452f;
        if (weakReference != null && weakReference.get() != null && qfVar.f132452f.get().f130438b != null) {
            int i17 = qfVar.f132452f.get().f130438b.f130551f;
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(i17).b(com.tencent.mapsdk.internal.la.a.f131797e, "map config check update, styleIds: " + a18 + ", indoorAuth: " + fxVar);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.Z, i17);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.b(new com.tencent.mapsdk.internal.qf.a(qfVar, a18, fxVar));
    }

    public final void a() {
        if (this.f132389b != null) {
            for (int i17 = 0; i17 < this.f132389b.size(); i17++) {
                android.os.AsyncTask asyncTask = this.f132389b.get(i17);
                if (asyncTask instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qb) {
                    ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qb) asyncTask).f132406b.removeCallbacksAndMessages(null);
                }
                asyncTask.cancel(true);
            }
            this.f132389b.clear();
        }
        b(this.f132401o);
        this.f132389b = null;
        this.f132398l = true;
        if (this.f132390d.M() != null) {
            this.f132390d.M().m99248x950fa8e(null);
        }
        com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70.m35928x9cf0d20b().m35942xd194a59f(this.f132402p);
    }

    @Override // com.tencent.mapsdk.internal.qc.a
    public final void a(com.tencent.mapsdk.internal.qc.b bVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.so soVar) {
        if (this.f132390d == null || soVar == null) {
            return;
        }
        boolean z17 = bVar == com.tencent.mapsdk.internal.qc.b.SUCCESS_UPGRADED;
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131744l, "onWorldConfigUpdate isUpdated: " + bVar + " config:" + soVar);
        this.f132390d.a(z17, soVar.c());
        if (z17) {
            this.f132391e.a();
        }
        this.f132391e.f133049d = true;
        if (bVar == com.tencent.mapsdk.internal.qc.b.FAIL_NET) {
            com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70.m35928x9cf0d20b().m35931x7234c322(this.f132402p);
        }
    }

    @Override // com.tencent.mapsdk.internal.qb.c
    public final void a(com.tencent.mapsdk.internal.qb.b bVar, org.json.JSONObject jSONObject) {
        org.json.JSONArray jSONArray;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fx fxVar;
        java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rq> a17;
        boolean z17;
        if (this.f132398l) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(b()).c(com.tencent.mapsdk.internal.la.a.f131796d, "onAuthResult: ".concat(java.lang.String.valueOf(jSONObject)));
        if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.f131343i == 0) {
            java.util.Iterator<com.tencent.mapsdk.internal.qa.b> it = this.f132400n.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(bVar);
            }
        }
        if (bVar != null) {
            jSONArray = bVar.f132422b;
            fxVar = bVar.f132421a;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qg qgVar = bVar.f132424d;
            if (qgVar != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qh qhVar = this.f132393g;
                if (qgVar != null && qgVar.f132461a) {
                    qhVar.f132467b.clear();
                    qhVar.f132467b.addAll(qgVar.f132462b);
                    qhVar.a();
                }
            }
        } else {
            jSONArray = null;
            fxVar = null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rr rrVar = this.f132392f;
        if (rrVar != null) {
            org.json.JSONArray m35878x7ace8163 = com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35878x7ace8163(rrVar.f132790e.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.A));
            if (jSONArray != null && (a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rr.a(jSONArray)) != null) {
                synchronized (rrVar.f132789d) {
                    rrVar.f132788c.clear();
                    rrVar.f132788c.addAll(a17);
                }
                try {
                    z17 = !com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35871xd41ebd0c(jSONArray, m35878x7ace8163);
                } catch (java.lang.Throwable unused) {
                    z17 = true;
                }
                if (z17) {
                    rrVar.f132790e.a();
                    rrVar.f132790e.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.A, jSONArray.toString());
                }
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ac acVar = this.f132390d.f133732n;
            if (acVar != null) {
                if (fxVar != null) {
                    acVar.f130307b = fxVar;
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131739g, "IndoorAuth:".concat(java.lang.String.valueOf(fxVar)));
                    acVar.f130306a.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.B, fxVar.f131029c);
                    acVar.f130306a.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.C, fxVar.f131030d);
                    org.json.JSONArray jSONArray2 = fxVar.f131031e;
                    if (jSONArray2 != null) {
                        acVar.f130306a.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.D, jSONArray2.toString());
                    }
                    com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9 = acVar.f130309d;
                    if (c4430xc2040f9 != null) {
                        c4430xc2040f9.a(acVar.c());
                        if (acVar.c() == 1) {
                            acVar.f130309d.a(acVar.d());
                        }
                    }
                } else {
                    acVar.f130306a.a(new java.lang.String[]{com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.B, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.C, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.D});
                }
                if (acVar.f130307b == null) {
                    acVar.f130307b = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fx();
                }
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ac.AnonymousClass2());
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qf qfVar = this.f132396j;
            java.lang.String a18 = this.f132392f.a();
            java.lang.String a19 = qfVar.a();
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qf.f132447e.containsKey(a19)) {
                qfVar.a(a19, qfVar.f132452f);
            } else {
                qfVar.a(a19, qfVar.f132452f);
                java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg> weakReference = qfVar.f132452f;
                if (weakReference != null && weakReference.get() != null && qfVar.f132452f.get().f130438b != null) {
                    int i17 = qfVar.f132452f.get().f130438b.f130551f;
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(i17).b(com.tencent.mapsdk.internal.la.a.f131797e, "map config check update, styleIds: " + a18 + ", indoorAuth: " + fxVar);
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.Z, i17);
                }
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.b(new com.tencent.mapsdk.internal.qf.a(qfVar, a18, fxVar));
            }
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f132395i;
        if (neVar != null && bVar != null) {
            int i18 = bVar.f132425e;
            if (i18 != com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sa.f132846d && i18 != com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sa.f132847e) {
                neVar.i(false);
            } else {
                neVar.i(true);
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qu quVar = this.f132394h;
            boolean z18 = bVar.f132426f;
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qu.a()) {
                quVar.f132602b = z18;
                quVar.f132601a.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.E, z18);
                quVar.f132603c.i().c(quVar.f132602b);
            } else {
                quVar.f132603c.i().c(false);
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee eeVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee) this.f132395i.mo36632x16607177(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee.class);
            if (eeVar != null) {
                eeVar.a(bVar.f132423c);
            }
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.Y, b());
    }
}
