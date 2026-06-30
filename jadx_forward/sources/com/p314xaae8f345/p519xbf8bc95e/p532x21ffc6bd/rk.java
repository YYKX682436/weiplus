package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class rk extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cd, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fr, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oz, com.tencent.mapsdk.internal.qa.b {

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.String f132718c = "PromoteImage";

    /* renamed from: d, reason: collision with root package name */
    private static final java.lang.String f132719d = "promote-image-enable";

    /* renamed from: e, reason: collision with root package name */
    private static final java.lang.String f132720e = "promote-image-max-zoom";

    /* renamed from: f, reason: collision with root package name */
    private static final java.lang.String f132721f = "promote-image-min-zoom";

    /* renamed from: g, reason: collision with root package name */
    private static final int f132722g = 22;

    /* renamed from: h, reason: collision with root package name */
    private static final int f132723h = 15;

    /* renamed from: b, reason: collision with root package name */
    int f132724b = com.tencent.mapsdk.internal.rk.a.f132737a;

    /* renamed from: i, reason: collision with root package name */
    private boolean f132725i;

    /* renamed from: m, reason: collision with root package name */
    private int f132726m;

    /* renamed from: n, reason: collision with root package name */
    private int f132727n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f132728o;

    /* renamed from: p, reason: collision with root package name */
    private android.content.SharedPreferences f132729p;

    /* renamed from: q, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e f132730q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f132731r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f132732s;

    /* renamed from: t, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cg f132733t;

    /* renamed from: u, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ce f132734u;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes13.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f132737a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f132738b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f132739c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f132740d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final int f132741e = 5;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ int[] f132742f = {1, 2, 3, 4, 5};

        private a(java.lang.String str, int i17) {
        }

        private static int[] a() {
            return (int[]) f132742f.clone();
        }
    }

    private int l() {
        return this.f132724b;
    }

    private void m() {
        if (this.f132734u == null) {
            this.f132734u = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rj(this);
        }
    }

    private void n() {
        if (this.f132733t == null) {
            this.f132733t = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rl(this);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm
    public final synchronized void c_() {
        super.c_();
        h();
        i();
        this.f132732s = true;
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132718c, "onDestroy...");
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cd
    public final void e() {
        if (this.f132725i) {
            int i17 = this.f132724b;
            if (i17 == com.tencent.mapsdk.internal.rk.a.f132737a || i17 == com.tencent.mapsdk.internal.rk.a.f132741e) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132718c, "startWatchingCamera");
                new com.tencent.mapsdk.internal.cg.b();
                n();
                new com.tencent.mapsdk.internal.ce.a();
                m();
                this.f132724b = com.tencent.mapsdk.internal.rk.a.f132738b;
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cd
    public final void f() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az azVar;
        int i17 = this.f132724b;
        if (i17 == com.tencent.mapsdk.internal.rk.a.f132738b || i17 == com.tencent.mapsdk.internal.rk.a.f132740d) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132718c, "resumeWatchingCamera");
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn mo36621x2de760a9 = mo36621x2de760a9();
            if (mo36621x2de760a9 == null || (azVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az) mo36621x2de760a9.f130532b) == null) {
                return;
            }
            com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 mo36068xb5885626 = azVar.mo36068xb5885626();
            if (mo36068xb5885626 == null) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.e(f132718c, "resumeWatchingCamera tencentMap null.");
            } else {
                if (mo36068xb5885626.mo37451xd2ef9864() == null) {
                    return;
                }
                a(this.f132733t, this.f132734u);
                ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne) mo36621x2de760a9).a(this);
                mo36068xb5885626.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fr) this);
                this.f132724b = com.tencent.mapsdk.internal.rk.a.f132739c;
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cd
    public final void g() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az azVar;
        if (this.f132724b == com.tencent.mapsdk.internal.rk.a.f132739c) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132718c, "notifyUpdate");
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn mo36621x2de760a9 = mo36621x2de760a9();
            if (mo36621x2de760a9 == null || (azVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az) mo36621x2de760a9.f130532b) == null) {
                return;
            }
            com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 mo36068xb5885626 = azVar.mo36068xb5885626();
            if (mo36068xb5885626 == null) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.e(f132718c, "notifyUpdate tencentMap null.");
                return;
            }
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e mo37451xd2ef9864 = mo36068xb5885626.mo37451xd2ef9864();
            if (mo37451xd2ef9864 == null) {
                return;
            }
            float f17 = mo37451xd2ef9864.f49415x3923d3;
            if (!(f17 >= ((float) this.f132727n) && f17 <= ((float) this.f132726m)) || (mo37451xd2ef9864.m99379xb2c87fbf(this.f132730q) && !this.f132731r)) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132718c, "the current position level[" + mo37451xd2ef9864.f49415x3923d3 + "] is not in valid level range");
                return;
            }
            if (this.f132734u != null) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132718c, "notifyUpdate to Layer");
                this.f132734u.a(mo37451xd2ef9864, this.f132728o);
            }
            if (this.f132733t != null) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132718c, "notifyUpdate to TileCache");
                this.f132733t.a(mo37451xd2ef9864, this.f132728o, this.f132727n, this.f132726m);
            }
            this.f132730q = mo37451xd2ef9864;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cd
    public final void h() {
        int i17 = this.f132724b;
        if (i17 == com.tencent.mapsdk.internal.rk.a.f132738b || i17 == com.tencent.mapsdk.internal.rk.a.f132739c) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132718c, "pauseWatchingCamera");
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne) mo36621x2de760a9();
            if (neVar != null) {
                neVar.b(this);
            }
            this.f132724b = com.tencent.mapsdk.internal.rk.a.f132740d;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cd
    public final void i() {
        int i17 = this.f132724b;
        if (i17 == com.tencent.mapsdk.internal.rk.a.f132738b || i17 == com.tencent.mapsdk.internal.rk.a.f132739c || i17 == com.tencent.mapsdk.internal.rk.a.f132740d) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132718c, "stopWatchingCamera");
            this.f132724b = com.tencent.mapsdk.internal.rk.a.f132741e;
            this.f132734u.c();
            this.f132733t.a();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oz
    public final void j() {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oz
    public final void k() {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132718c, "onMapCameraChangeStopped");
        g();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cd
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ce m_() {
        return this.f132734u;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm
    public final void a(android.content.Context context) {
        super.a(context);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132718c, "onCreate");
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm
    public final void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar) {
        super.b(bnVar);
        h();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm
    public final void c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar) {
        super.c(bnVar);
        f();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm
    public final synchronized void d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar) {
        super.d(bnVar);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132718c, "onUnregistered");
        if (bnVar == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az azVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az) bnVar.f130532b;
        if (azVar != null) {
            azVar.b(this);
        }
        ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne) bnVar).b(this);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm
    public final synchronized void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar) {
        super.a(bnVar);
        if (bnVar == null) {
            return;
        }
        this.f132732s = false;
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132718c, "onRegistered");
        android.content.SharedPreferences a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ku.a(c(), bnVar.F().c());
        this.f132729p = a17;
        this.f132725i = a17.getBoolean(f132719d, false);
        this.f132726m = java.lang.Math.min(22, this.f132729p.getInt(f132720e, 22));
        this.f132727n = java.lang.Math.max(15, this.f132729p.getInt(f132721f, 15));
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az azVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az) bnVar.f130532b;
        if (azVar != null) {
            azVar.a(this);
        }
        if (this.f132725i) {
            e();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fr
    public final void i(int i17) {
        boolean o17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn mo36621x2de760a9 = mo36621x2de760a9();
        if (mo36621x2de760a9 == null || this.f132728o == (o17 = mo36621x2de760a9.o())) {
            return;
        }
        this.f132728o = o17;
        this.f132731r = true;
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132718c, "onStyleChanged isDarkMode ? ".concat(java.lang.String.valueOf(o17)));
        g();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cd
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cg d() {
        return this.f132733t;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cd
    public final boolean a() {
        return this.f132725i;
    }

    private static void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cg cgVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ce ceVar) {
        ceVar.a();
        cgVar.a(ceVar);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cd
    public final java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc> a(java.lang.String str) {
        try {
            return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hq.a((java.lang.Iterable) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35880xd8ef724c(new org.json.JSONObject(str).optJSONArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ri.class, new java.lang.Object[0]), (com.tencent.mapsdk.internal.hq.h) new com.tencent.mapsdk.internal.hq.h<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ri, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc>() { // from class: com.tencent.mapsdk.internal.rk.1
                @Override // com.tencent.mapsdk.internal.hq.h
                public final /* synthetic */ com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ri riVar) {
                    int i17;
                    int i18;
                    int i19;
                    int i27;
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ri riVar2 = riVar;
                    if (riVar2.b().f49501xaa2bac6c != 0.0d && riVar2.b().f49502x83009af != 0.0d && java.lang.Integer.parseInt(riVar2.f132699g) >= java.lang.Integer.parseInt(riVar2.f132700h) && !com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(riVar2.f132693a) && !com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(riVar2.f132698f) && (i17 = riVar2.f132696d) > 0 && (i18 = riVar2.f132697e) > 0 && i17 <= 32 && i18 <= 32 && i17 % 4 == 0 && i18 % 4 == 0 && (i19 = riVar2.f132694b) <= (i27 = riVar2.f132695c) && i27 <= com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rk.this.f132726m && i19 >= com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rk.this.f132727n) {
                        return riVar2;
                    }
                    return null;
                }

                /* renamed from: a, reason: avoid collision after fix types in other method */
                private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc a2(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ri riVar) {
                    int i17;
                    int i18;
                    int i19;
                    int i27;
                    if (riVar.b().f49501xaa2bac6c != 0.0d && riVar.b().f49502x83009af != 0.0d && java.lang.Integer.parseInt(riVar.f132699g) >= java.lang.Integer.parseInt(riVar.f132700h) && !com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(riVar.f132693a) && !com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(riVar.f132698f) && (i17 = riVar.f132696d) > 0 && (i18 = riVar.f132697e) > 0 && i17 <= 32 && i18 <= 32 && i17 % 4 == 0 && i18 % 4 == 0 && (i19 = riVar.f132694b) <= (i27 = riVar.f132695c) && i27 <= com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rk.this.f132726m && i19 >= com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rk.this.f132727n) {
                        return riVar;
                    }
                    return null;
                }
            });
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cd
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cc ccVar, byte[] bArr, boolean z17, boolean z18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ce ceVar = this.f132734u;
        if (ceVar != null) {
            return ceVar.a(ccVar, bArr, z17, z18);
        }
        return null;
    }

    private void a(int i17) {
        this.f132724b = i17;
    }

    private boolean a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e c26015xa89e978e) {
        float f17 = c26015xa89e978e.f49415x3923d3;
        return f17 >= ((float) this.f132727n) && f17 <= ((float) this.f132726m);
    }

    @Override // com.tencent.mapsdk.internal.qa.b
    public final void a(com.tencent.mapsdk.internal.qb.b bVar) {
        org.json.JSONObject jSONObject;
        if (bVar == null || (jSONObject = bVar.f132427g) == null) {
            return;
        }
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("wechat_logo");
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132718c, "onMapAuthoritySuccess... : ".concat(java.lang.String.valueOf(optJSONObject)));
        if (optJSONObject != null) {
            this.f132725i = optJSONObject.optInt("enable", 0) == 1;
            com.tencent.mapsdk.internal.ku.a a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ku.a(this.f132729p);
            a17.f131724a.putBoolean(f132719d, this.f132725i);
            a17.f131724a.commit();
            this.f132726m = optJSONObject.optInt("zoom_max", 22);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ku.a(this.f132729p).a(f132720e, this.f132726m);
            this.f132727n = java.lang.Math.max(optJSONObject.optInt("zoom_min", 15), 15);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ku.a(this.f132729p).a(f132721f, this.f132727n);
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132718c, "thisFeatureZoom : [" + this.f132727n + "~" + this.f132726m + "]");
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.rk.2
            @Override // java.lang.Runnable
            public final void run() {
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rk.this.f132732s) {
                    return;
                }
                if (!com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rk.this.f132725i) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rk.this.h();
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rk.this.i();
                } else {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rk.this.e();
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rk.this.f();
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rk.this.g();
                }
            }
        });
    }

    @Override // com.tencent.mapsdk.internal.qa.b
    public final void a(int i17, java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(f132718c, "onMapAuthorityFail... code:" + i17 + " msg:" + str);
        i();
    }
}
