package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.FindMoreFriendsUI */
/* loaded from: classes8.dex */
public class C21357x5e7365bb extends com.p314xaae8f345.mm.ui.AbstractC21336x64915aa4 implements l75.q0, l75.z0, c01.x8, c01.y8 {
    public static final java.util.List R1 = java.util.Arrays.asList("jd_market_entrance", "find_friends_by_finder", "find_friends_by_finder_live", "find_friends_by_ting", "find_friends_by_ting_play_state", "find_friends_by_finder_live_above_look", "find_friends_by_look", "find_friends_by_near_v3", "find_live_friends_by_near", "find_friends_by_shake", "more_tab_game_recommend");
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d A1;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d B1;
    public final k70.f0 C1;
    public long D1;
    public boolean E1;
    public boolean F1;
    public rg5.x G1;
    public rg5.r H1;
    public p012xc85e97e9.p093xedfae76a.k0 I1;
    public p012xc85e97e9.p093xedfae76a.k0 J1;
    public p012xc85e97e9.p093xedfae76a.k0 K1;
    public boolean L1;
    public rg5.o M1;
    public int N;
    public final java.lang.String N1;
    public final java.util.Random O1;
    public long P;
    public boolean P1;
    public int Q;
    public boolean Q1;
    public long R;
    public int S;
    public android.view.View T;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d V;
    public final l75.q0 W;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d X;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d Y;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d Z;

    /* renamed from: l1, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f278182l1;

    /* renamed from: p0, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b f278183p0;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f278184p1;

    /* renamed from: s, reason: collision with root package name */
    public long f278185s;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 f278189w;

    /* renamed from: x0, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b f278191x0;

    /* renamed from: x1, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.e6 f278192x1;

    /* renamed from: y0, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b f278194y0;

    /* renamed from: y1, reason: collision with root package name */
    public final vg3.d4 f278195y1;

    /* renamed from: z1, reason: collision with root package name */
    public final bm5.p1 f278197z1;

    /* renamed from: t, reason: collision with root package name */
    public final tm0.e f278186t = new tm0.e();

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.k6 f278187u = new com.p314xaae8f345.mm.ui.k6(this);

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.g6 f278188v = new com.p314xaae8f345.mm.ui.g6(this);

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f278190x = "";

    /* renamed from: y, reason: collision with root package name */
    public int f278193y = 0;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f278196z = null;
    public java.lang.String A = null;
    public java.lang.String B = null;
    public java.lang.String C = null;
    public boolean D = false;
    public boolean E = true;
    public boolean F = false;
    public boolean G = false;
    public boolean H = false;
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public int f278181J = 0;
    public long K = 0;
    public boolean L = false;
    public android.widget.AbsListView.OnScrollListener M = null;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 U = new com.p314xaae8f345.mm.ui.y4(this, android.os.Looper.getMainLooper());

    /* renamed from: com.tencent.mm.ui.FindMoreFriendsUI$17, reason: invalid class name */
    /* loaded from: classes8.dex */
    public class AnonymousClass17 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6263xa2759cdc> {
        public AnonymousClass17(p012xc85e97e9.p093xedfae76a.y yVar) {
            super(yVar);
            this.f39173x3fe91575 = -1764466964;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6263xa2759cdc c6263xa2759cdc) {
            com.p314xaae8f345.mm.ui.C21357x5e7365bb.this.m78646xc2a54588().post(new com.p314xaae8f345.mm.ui.w4(this));
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.FindMoreFriendsUI$4, reason: invalid class name */
    /* loaded from: classes8.dex */
    public class AnonymousClass4 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6130x1c2ecb67> {
        public AnonymousClass4(p012xc85e97e9.p093xedfae76a.y yVar) {
            super(yVar);
            this.f39173x3fe91575 = 1510396759;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6130x1c2ecb67 c6130x1c2ecb67) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6130x1c2ecb67 c6130x1c2ecb672 = c6130x1c2ecb67;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "mark sns read %d", java.lang.Integer.valueOf(c6130x1c2ecb672.f136402g.f90145a));
            if (c6130x1c2ecb672.f136402g.f90145a != 9) {
                return true;
            }
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.ui.v5(this));
            return true;
        }
    }

    public C21357x5e7365bb() {
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.V = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5982xbac3ddd5>(a0Var) { // from class: com.tencent.mm.ui.FindMoreFriendsUI.2
            {
                this.f39173x3fe91575 = 1507664325;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5982xbac3ddd5 c5982xbac3ddd5) {
                java.util.List list = com.p314xaae8f345.mm.ui.C21357x5e7365bb.R1;
                com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb = com.p314xaae8f345.mm.ui.C21357x5e7365bb.this;
                c21357x5e7365bb.z1();
                c21357x5e7365bb.A0();
                return false;
            }
        };
        this.W = new com.p314xaae8f345.mm.ui.u5(this);
        this.X = new com.p314xaae8f345.mm.ui.C21357x5e7365bb.AnonymousClass4(a0Var);
        this.Y = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5649xf3beb8a3>(a0Var) { // from class: com.tencent.mm.ui.FindMoreFriendsUI.5
            {
                this.f39173x3fe91575 = 1450669203;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5649xf3beb8a3 c5649xf3beb8a3) {
                k35.q a17 = k35.r.a();
                com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb = com.p314xaae8f345.mm.ui.C21357x5e7365bb.this;
                if (a17 != null) {
                    java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().Vi().f253662a;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        str = com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().Ui();
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().Zi().f253666b;
                    java.util.List list = com.p314xaae8f345.mm.ui.C21357x5e7365bb.R1;
                    g0Var.d(11178, str, str2, java.lang.Integer.valueOf(c21357x5e7365bb.H0()));
                }
                java.util.List list2 = com.p314xaae8f345.mm.ui.C21357x5e7365bb.R1;
                c21357x5e7365bb.B1(true);
                c21357x5e7365bb.f278189w.notifyDataSetChanged();
                return true;
            }
        };
        this.Z = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5313xa7be6d80>(a0Var, 1) { // from class: com.tencent.mm.ui.FindMoreFriendsUI.6
            {
                this.f39173x3fe91575 = -443124368;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5313xa7be6d80 c5313xa7be6d80) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "dynamic config file change");
                com.p314xaae8f345.mm.ui.C21357x5e7365bb.this.U.mo50305x3d8a09a2(1);
                return true;
            }
        };
        this.f278183p0 = new com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b() { // from class: com.tencent.mm.ui.FindMoreFriendsUI.7
            @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b
            public void c(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
                if (abstractC20979x809547d1 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5577x8d968bcb) {
                    com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb = com.p314xaae8f345.mm.ui.C21357x5e7365bb.this;
                    if (c21357x5e7365bb.f278188v.a()) {
                        return;
                    }
                    com.p314xaae8f345.mm.ui.C21357x5e7365bb.w0(c21357x5e7365bb, true, false);
                    c21357x5e7365bb.f278189w.notifyDataSetChanged();
                }
            }
        };
        this.f278191x0 = new com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b() { // from class: com.tencent.mm.ui.FindMoreFriendsUI.8
            @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b
            public void c(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
                if (abstractC20979x809547d1 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5575x5e210224) {
                    com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb = com.p314xaae8f345.mm.ui.C21357x5e7365bb.this;
                    if (c21357x5e7365bb.f278188v.b()) {
                        return;
                    }
                    com.p314xaae8f345.mm.ui.C21357x5e7365bb.w0(c21357x5e7365bb, true, true);
                    c21357x5e7365bb.f278189w.notifyDataSetChanged();
                }
            }
        };
        this.f278194y0 = new com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b() { // from class: com.tencent.mm.ui.FindMoreFriendsUI.9
            @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b
            public void c(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
                if (abstractC20979x809547d1 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6012xa63c8377) {
                    java.util.List list = com.p314xaae8f345.mm.ui.C21357x5e7365bb.R1;
                    com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb = com.p314xaae8f345.mm.ui.C21357x5e7365bb.this;
                    c21357x5e7365bb.A1();
                    c21357x5e7365bb.f278189w.notifyDataSetChanged();
                }
            }
        };
        this.f278182l1 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6011x25991f46>(a0Var) { // from class: com.tencent.mm.ui.FindMoreFriendsUI.10
            {
                this.f39173x3fe91575 = -994942154;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6011x25991f46 c6011x25991f46) {
                if (!(c6011x25991f46 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6011x25991f46)) {
                    return false;
                }
                java.util.List list = com.p314xaae8f345.mm.ui.C21357x5e7365bb.R1;
                com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb = com.p314xaae8f345.mm.ui.C21357x5e7365bb.this;
                c21357x5e7365bb.A1();
                c21357x5e7365bb.f278189w.notifyDataSetChanged();
                return false;
            }
        };
        this.f278192x1 = com.p314xaae8f345.mm.ui.e6.TYPE_NONE;
        this.f278195y1 = new com.p314xaae8f345.mm.ui.r4(this);
        this.f278197z1 = new com.p314xaae8f345.mm.ui.t4(this);
        this.A1 = new com.p314xaae8f345.mm.ui.C21357x5e7365bb.AnonymousClass17(a0Var);
        this.B1 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5600x21ae9db5>(a0Var) { // from class: com.tencent.mm.ui.FindMoreFriendsUI.18
            {
                this.f39173x3fe91575 = -1188553307;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5600x21ae9db5 c5600x21ae9db5) {
                c5600x21ae9db5.f135925g.f89536a = com.p314xaae8f345.mm.ui.C21357x5e7365bb.this.F;
                return false;
            }
        };
        this.C1 = new com.p314xaae8f345.mm.ui.d5(this);
        this.D1 = 0L;
        this.E1 = false;
        this.F1 = false;
        this.G1 = null;
        this.H1 = null;
        this.I1 = null;
        this.J1 = null;
        this.K1 = null;
        this.L1 = false;
        this.M1 = null;
        this.N1 = "find_friends_by_finder";
        this.O1 = new java.util.Random();
        this.P1 = false;
        this.Q1 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void w0(com.p314xaae8f345.mm.ui.C21357x5e7365bb r4, boolean r5, boolean r6) {
        /*
            r4.getClass()
            if (r6 == 0) goto L1b
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.K
            long r0 = r0 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L19
            long r0 = java.lang.System.currentTimeMillis()
            r4.K = r0
            goto L1b
        L19:
            r6 = 0
            goto L1c
        L1b:
            r6 = 1
        L1c:
            if (r6 == 0) goto L28
            r4.w1()
            if (r5 == 0) goto L28
            com.tencent.mm.ui.base.preference.h0 r4 = r4.f278189w
            r4.notifyDataSetChanged()
        L28:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.C21357x5e7365bb.w0(com.tencent.mm.ui.FindMoreFriendsUI, boolean, boolean):void");
    }

    public final void A0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "checkLookVisibility");
        if (!this.f279301h || !m7481x7a6e8df6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "checkLookVisibility preference not add");
            return;
        }
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.DiscoveryChannels.h()) {
                this.f278189w.m("find_friends_by_finder", true);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.DiscoveryChannelsLive.h() && com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c()) {
                this.f278189w.m("find_friends_by_finder_live", true);
            }
            if (!U0()) {
                this.f278189w.m("find_friends_by_look", true);
                if (Q0()) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(953L, 3L, 1L);
                return;
            }
            ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
            java.lang.String optString = su4.o2.d("discoverRecommendEntry").optString("wording");
            com.p314xaae8f345.mm.ui.C21446xfcab30d8 c21446xfcab30d8 = (com.p314xaae8f345.mm.ui.C21446xfcab30d8) this.f278189w.h("find_friends_by_look");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                c21446xfcab30d8.L(m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.cfz));
            } else {
                c21446xfcab30d8.L(optString);
            }
            c21446xfcab30d8.n0(this.f278189w);
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().k(c21446xfcab30d8);
            k70.f0 f0Var = this.C1;
            com.p314xaae8f345.mm.ui.q4 q4Var = new com.p314xaae8f345.mm.ui.q4(this);
            c21446xfcab30d8.f233893d2 = f0Var;
            c21446xfcab30d8.f233894e2 = q4Var;
            c21446xfcab30d8.h0();
            this.S++;
            this.f278189w.m("find_friends_by_look", false);
            this.f278187u.c(c21446xfcab30d8);
            wm4.p pVar = (wm4.p) ((wm4.o) i95.n0.c(wm4.o.class));
            pVar.getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new wm4.r(pVar), 5000L);
            ((wm4.p) ((wm4.o) i95.n0.c(wm4.o.class))).Ai();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FindMoreFriendsUI", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    public final void A1() {
        boolean z17;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) this.f278189w.h("find_friends_by_shake");
        if (c21549x15041e54 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FindMoreFriendsUI", "updateShakeEntry prefShake null and return");
            return;
        }
        boolean z18 = true;
        if (((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Vi()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FindMoreFriendsUI", "updateShakeEntry enable ting and hide shake");
            this.f278189w.m("find_friends_by_shake", true);
            return;
        }
        if (!((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Bi()) {
            this.f278189w.m("find_friends_by_shake", true);
            return;
        }
        boolean z19 = (this.Q & 256) == 0;
        j45.l.g("shake");
        boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "openShake %s, plugin installed %s, isTeenMode:%s", java.lang.Boolean.valueOf(z19), java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(mo168058x74219ae7));
        if (!z19 || mo168058x74219ae7) {
            this.f278189w.m("find_friends_by_shake", true);
            if (Q0()) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(953L, 2L, 1L);
            return;
        }
        this.S++;
        this.f278189w.m("find_friends_by_shake", false);
        int f17 = r21.w.Di().f() + o25.u1.a().mo69127xf0c91463();
        if (f17 > 0) {
            c21549x15041e54.a0(0);
            int b17 = com.p314xaae8f345.mm.ui.p2740x696c9db.pd.b(mo7438x76847179(), f17);
            c21549x15041e54.V = "" + f17;
            c21549x15041e54.W = b17;
        } else {
            c21549x15041e54.a0(8);
            c21549x15041e54.V = "";
            c21549x15041e54.W = -1;
        }
        c21549x15041e54.T(8);
        o25.u1.a().mo69123x3909afe4();
        if (o25.u1.a().mo69128x555c596c()) {
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            z17 = bk0.a.g().b(262154, 266258);
        } else {
            z17 = false;
        }
        if (z17) {
            java.lang.String str = (java.lang.String) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_TEXT_STRING_SYNC, "");
            if (!android.text.TextUtils.isEmpty(str)) {
                c21549x15041e54.c0(8);
                c21549x15041e54.a0(0);
                c21549x15041e54.V = "" + str;
                c21549x15041e54.W = com.p314xaae8f345.mm.R.C30861xcebc809e.b8d;
            } else if (f17 > 0) {
                c21549x15041e54.c0(0);
            } else {
                c21549x15041e54.c0(0);
                c21549x15041e54.a0(8);
                c21549x15041e54.V = "";
                c21549x15041e54.W = -1;
            }
        } else {
            c21549x15041e54.c0(8);
        }
        java.lang.String str2 = (java.lang.String) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IBEACON_PUSH_BEACONINFO_STRING, null);
        boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1((java.lang.Boolean) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IBEACON_PUSH_IS_OPEN_BOOLEAN, null), false));
        int intValue = ((java.lang.Integer) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IBEACON_SHAKE_TAB_DISPLAY_INT, 0)).intValue();
        if (!valueOf.booleanValue() || str2.equals("") || f17 > 0 || z17) {
            c21549x15041e54.b0(8);
        } else if (intValue == 0) {
            c21549x15041e54.c0(8);
            c21549x15041e54.b0(0);
            java.lang.String[] split = str2.split(",");
            if (split.length > 0) {
                c21549x15041e54.d0(split[0], -1, android.graphics.Color.parseColor("#8c8c8c"));
            }
            c21549x15041e54.e0(true);
            c21549x15041e54.Y(8);
        } else if (intValue == 1) {
            c21549x15041e54.b0(8);
            c21549x15041e54.a0(0);
            c21549x15041e54.S1 = true;
        }
        if (f17 <= 0 && !z17) {
            z18 = false;
        }
        b1("find_friends_by_shake", z18);
    }

    @Override // com.p314xaae8f345.mm.ui.y7
    public void B() {
        tm0.e eVar = this.f278186t;
        eVar.b();
        eVar.f501993f = false;
        eVar.a().mo127124xc2079749(kz5.b0.c(new tm0.a(tm0.b.f501984g, eVar)));
        eVar.c(false);
        this.F = false;
        this.P1 = false;
        this.Q1 = false;
        this.H = false;
        this.L = false;
        su4.g3.f494435d.f494438c = null;
        wg0.a aVar = (wg0.a) ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).aj();
        aVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchRedDotReporter", "resetAllExpose");
        ((java.util.concurrent.ConcurrentHashMap) aVar.f527241a).clear();
        ((java.util.concurrent.ConcurrentHashMap) aVar.f527242b).clear();
        ((ef0.z3) ((qk.d9) i95.n0.c(qk.d9.class))).getClass();
        ((java.util.concurrent.ConcurrentHashMap) em4.c.f336747b).clear();
        ((pg3.v) ((n40.n) i95.n0.c(n40.n.class))).wi(true);
        p1();
        g1();
    }

    public final void B0(final com.p314xaae8f345.mm.ui.p2746xf1c361fc.C22594xcb88ef3a c22594xcb88ef3a, java.lang.String str, final boolean z17, final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, final r45.f03 f03Var, final boolean z18, final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar2, final r45.f03 f03Var2) {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.ui.FindMoreFriendsUI$$a
            @Override // java.lang.Runnable
            public final void run() {
                boolean z19;
                java.lang.String str2;
                r45.f03 f03Var3;
                r45.f03 f03Var4 = f03Var2;
                java.util.List list = com.p314xaae8f345.mm.ui.C21357x5e7365bb.R1;
                com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb = com.p314xaae8f345.mm.ui.C21357x5e7365bb.this;
                c21357x5e7365bb.getClass();
                com.p314xaae8f345.mm.ui.p2746xf1c361fc.C22594xcb88ef3a c22594xcb88ef3a2 = c22594xcb88ef3a;
                if (c22594xcb88ef3a2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FindMoreFriendsUI", "controlWebSearchRedDot, preference is null.");
                    return;
                }
                boolean z27 = true;
                if (!((c22594xcb88ef3a2.W2 == null || c22594xcb88ef3a2.X2 == null || c22594xcb88ef3a2.Y2 == null) ? false : true)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FindMoreFriendsUI", "controlWebSearchRedDot, preference hasn't bound view.");
                    return;
                }
                c21357x5e7365bb.b1("find_friends_by_search", false);
                ((wd0.s1) i95.n0.c(wd0.s1.class)).getClass();
                if (!z18 || f03Var4 == null) {
                    z19 = false;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "controlWebSearchRedDot, showing mentionEntrance, counter: " + f03Var4.f455421e);
                    r45.pm6 pm6Var = new r45.pm6();
                    pm6Var.f464719d = f03Var4.f455421e;
                    c22594xcb88ef3a2.Z3(true, pm6Var);
                    ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).hj("Search.MentionEntrance", true);
                    if (com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78442x336b58a0() == 2 && c21357x5e7365bb.F) {
                        ((wg0.a) ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).aj()).b(jbVar2, f03Var4);
                    }
                    z19 = true;
                }
                if (!z17 || (f03Var3 = f03Var) == null) {
                    str2 = "Search.Entrance";
                    z27 = z19;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "controlWebSearchRedDot, showing entrance.");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar3 = jbVar;
                    str2 = "Search.Entrance";
                    c21357x5e7365bb.z0(f03Var3, c22594xcb88ef3a2, false, true, jbVar3 != null && jbVar3.N.m75939xb282bd08(19) == 1, f03Var4);
                    ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).hj(str2, true);
                    if (com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78442x336b58a0() == 2 && c21357x5e7365bb.F) {
                        ((wg0.a) ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).aj()).b(jbVar3, f03Var3);
                    }
                }
                c21357x5e7365bb.b1("find_friends_by_search", z27);
                if (z27) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "controlWebSearchRedDot, no valid red-dot, hide it.");
                c22594xcb88ef3a2.Z3(false, new r45.pm6());
                c22594xcb88ef3a2.y(false);
                ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).hj(str2, false);
                ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).hj("Search.MentionEntrance", false);
            }
        };
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            runnable.run();
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
        }
    }

    public final void B1(boolean z17) {
        boolean P0 = P0(4194304L);
        boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        boolean z18 = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "openShoppingEntry %s, isTeenMode:%s", java.lang.Boolean.valueOf(!P0), java.lang.Boolean.valueOf(mo168058x74219ae7));
        if (P0 || mo168058x74219ae7) {
            this.f278189w.m("jd_market_entrance", true);
            if (Q0()) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(953L, 7L, 1L);
            return;
        }
        if (k35.r.a() != null) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().aj()) {
                this.S++;
                com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.o Zi = com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().Zi();
                com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056 c16742x4f474056 = (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056) this.f278189w.h("jd_market_entrance");
                c16742x4f474056.L(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().Ri());
                c16742x4f474056.n0(this.f278189w);
                ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                rn3.i.Di().k(c16742x4f474056);
                k70.f0 f0Var = this.C1;
                com.p314xaae8f345.mm.ui.e5 e5Var = new com.p314xaae8f345.mm.ui.e5(this);
                c16742x4f474056.f233893d2 = f0Var;
                c16742x4f474056.f233894e2 = e5Var;
                c16742x4f474056.h0();
                boolean z19 = com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().bj() && Zi.e() && !Zi.d();
                ((vd0.o2) ((wd0.s1) i95.n0.c(wd0.s1.class))).getClass();
                if (!((c01.z1.h() & 512) != 512)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "JudgeRedDot dont show reddot! ReddotService interrupt");
                    z19 = false;
                }
                if (!c16742x4f474056.o0(z19 && !(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi.f253671g) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi.f253672h) && !Zi.f253670f))) {
                    c16742x4f474056.a0(8);
                    c16742x4f474056.c0(8);
                    c16742x4f474056.b0(8);
                    c16742x4f474056.e0(false);
                    c16742x4f474056.Y(8);
                    if (z19) {
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi.f253671g)) {
                            c16742x4f474056.a0(8);
                            c16742x4f474056.c0(8);
                            c16742x4f474056.d0(Zi.f253671g, -1, -7566196);
                            c16742x4f474056.b0(0);
                        }
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi.f253672h)) {
                            android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(Zi.f253672h);
                            c16742x4f474056.Y(0);
                            c16742x4f474056.T(0);
                            c16742x4f474056.V(0);
                            c16742x4f474056.e0(false);
                            if (Bi != null) {
                                this.C = null;
                                c16742x4f474056.R(Bi);
                            } else {
                                ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(Zi.f253672h, f0Var);
                                this.C = Zi.f253672h;
                            }
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi.f253671g)) {
                                c16742x4f474056.e5(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_REDPOINT_ICON, true);
                            } else {
                                c16742x4f474056.e5(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE_ICON, true);
                            }
                        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi.f253671g)) {
                            c16742x4f474056.e0(true);
                            c16742x4f474056.e5(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE, true);
                        } else if (Zi.f253670f) {
                            c16742x4f474056.c0(0);
                            c16742x4f474056.V = "";
                            c16742x4f474056.W = -1;
                            c16742x4f474056.a0(8);
                            c16742x4f474056.e5(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_REDPOINT, true);
                        } else {
                            c16742x4f474056.h0();
                        }
                    } else {
                        c16742x4f474056.h0();
                    }
                    b1("jd_market_entrance", z19);
                }
                if (z17) {
                    this.f278189w.notifyDataSetChanged();
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_JD_ENTRANCE_RESET_EXPOSURE_FLAG_BOOLEAN_SYNC;
                boolean o17 = c17.o(u3Var, false);
                if (!Q0() || o17) {
                    java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().Vi().f253662a;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        str = com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().Ui();
                    }
                    gm0.j1.u().c().x(u3Var, java.lang.Boolean.FALSE);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    g0Var.A(931, 12);
                    g0Var.d(11178, str, com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().Zi().f253666b, java.lang.Integer.valueOf(H0()), 2);
                }
                this.f278189w.m("jd_market_entrance", z18);
            }
            java.lang.String Ri = com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().Ri();
            java.lang.String Ni = com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().Ni();
            if (!Q0() && com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.m()) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Ri)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(931, 2);
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Ni)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(931, 4);
                }
            }
        }
        z18 = true;
        this.f278189w.m("jd_market_entrance", z18);
    }

    public void C0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10958, "4");
        com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 activityC21387x976b8e54 = (com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54) mo7438x76847179();
        if (activityC21387x976b8e54 != null) {
            activityC21387x976b8e54.f7().o("tab_find_friend");
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String Cj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Cj(com.p314xaae8f345.mm.ui.p2731xc84c5534.e0.b(), intent);
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187090a.c(Cj, 0);
        m25.a.a(mo7438x76847179(), intent);
    }

    public final void C1() {
        boolean z17;
        boolean z18 = (this.Q & 32768) == 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "openSns %s, plugin installed %s", java.lang.Boolean.valueOf(z18), java.lang.Boolean.TRUE);
        if (!z18) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_ENTRY_SWITCH_INT;
            if (c17.r(u3Var, 0) == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FindMoreFriendsUI", "opened sns entry recently");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(150, 71);
            } else if (gm0.j1.u().c().r(u3Var, 0) == -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "closed sns entry recently");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(150, 70);
            }
        }
        if (!z18) {
            this.f278189w.m("album_dyna_photo_ui_title", true);
            if (Q0()) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(953L, 0L, 1L);
            return;
        }
        this.S++;
        this.f278189w.m("album_dyna_photo_ui_title", false);
        com.p314xaae8f345.mm.ui.C21368x560b7e55 c21368x560b7e55 = (com.p314xaae8f345.mm.ui.C21368x560b7e55) this.f278189w.h("album_dyna_photo_ui_title");
        c21368x560b7e55.U = com.p314xaae8f345.mm.ui.zk.d(mo7438x76847179(), com.p314xaae8f345.mm.R.C30857x2dd9f1.f559717cx);
        boolean n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1((java.lang.Boolean) c01.d9.b().p().l(48, null));
        c21368x560b7e55.a0(8);
        c21368x560b7e55.V(8);
        if (n17) {
            c21368x560b7e55.a0(0);
            c21368x560b7e55.V = m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572034wv);
            c21368x560b7e55.W = com.p314xaae8f345.mm.R.C30861xcebc809e.asx;
        }
        java.lang.String str = (java.lang.String) c01.d9.b().p().l(68377, null);
        this.f278190x = str;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78442x336b58a0() == 2 && c01.d9.b().p().q(68419, 0) == 0) {
            gm0.j1.i();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.t0.a(2, (java.lang.String) gm0.j1.u().c().l(68418, ""), this.f278193y);
            c01.d9.b().p().w(68419, 1);
        }
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_MEDIA_COLLAPSE_SNS_ID_LONG, null);
        long longValue = m17 == null ? 0L : ((java.lang.Long) m17).longValue();
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.String str2 = this.f278190x;
        if (str2 == null) {
            str2 = "";
        }
        objArr[0] = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "newer snsobj %s", objArr);
        c21368x560b7e55.Y(0);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f278190x)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableShowErrorIcon", "com.tencent.mm.plugin.sns.snstimeline.SnsPostActionFailedHandler");
            if (gm0.j1.b().m()) {
                java.lang.Object l17 = gm0.j1.u().c().l(589825, java.lang.Boolean.FALSE);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(l17, "null cannot be cast to non-null type kotlin.Boolean");
                z17 = ((java.lang.Boolean) l17).booleanValue() || wa4.p.f525807b;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPostActionFailedHandler", "account hasInitialized, enableShowErrorIcon: show = [" + z17 + ']');
            } else {
                z17 = wa4.p.f525807b;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPostActionFailedHandler", "enableShowErrorIcon: show = [" + z17 + ']');
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableShowErrorIcon", "com.tencent.mm.plugin.sns.snstimeline.SnsPostActionFailedHandler");
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "updateSnsEntry: show right icon warning");
                c21368x560b7e55.h0(null);
                c21368x560b7e55.S(com.p314xaae8f345.mm.R.raw.f81210x36d951ba);
                c21368x560b7e55.T(0);
                c21368x560b7e55.V(8);
            } else if (longValue == 0 || !((n34.v4) ((p94.s0) i95.n0.c(p94.s0.class))).wi(longValue)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "updateSnsEntry: no right Image");
                c21368x560b7e55.T(8);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "updateSnsEntry: show RightProspect Collapsed");
                c21368x560b7e55.T(0);
                c21368x560b7e55.V(0);
                c21368x560b7e55.Y1 = null;
                c21368x560b7e55.Q = -1;
                c21368x560b7e55.Z1 = longValue;
                if (longValue != 0 && c21368x560b7e55.S != null) {
                    ((n34.v4) ((p94.s0) i95.n0.c(p94.s0.class))).Bi(c21368x560b7e55.Z1, c21368x560b7e55.S, c21368x560b7e55.f279303d.hashCode());
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "updateSnsEntry: show RightAvatar");
            c21368x560b7e55.T(0);
            c21368x560b7e55.V(((vd0.o2) ((wd0.s1) i95.n0.c(wd0.s1.class))).Di() ? 0 : 8);
            c21368x560b7e55.h0(this.f278190x);
        }
        if (p94.w0.a() != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w1 w1Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w1) p94.w0.a();
            w1Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isHoldUnread", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            boolean z19 = w1Var.f247690e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isHoldUnread", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            if (z19) {
                this.f278193y = 0;
            } else {
                this.f278193y = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w1) p94.w0.a()).L0();
            }
        }
        if (this.f278193y != 0) {
            c21368x560b7e55.a0(0);
            java.lang.String str3 = this.f278193y + "";
            int b17 = com.p314xaae8f345.mm.ui.p2740x696c9db.pd.b(mo7438x76847179(), this.f278193y);
            c21368x560b7e55.V = str3;
            c21368x560b7e55.W = b17;
        }
        c21368x560b7e55.c0(8);
        c21368x560b7e55.b0(8);
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6186x35b2dd7b().e();
        b1("album_dyna_photo_ui_title", (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f278190x) && this.f278193y == 0) ? false : true);
        boolean z27 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f278190x) && this.f278193y == 0) ? false : true;
        gz2.c.f359262b = z27;
        zs.c.f556757b = z27;
        zs.c.f556762g = this.f278193y;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0934  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0ba4  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0c32  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0c59  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0d00  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0d14  */
    /* JADX WARN: Removed duplicated region for block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0c79  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0b89  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D1() {
        /*
            Method dump skipped, instructions count: 3387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.C21357x5e7365bb.D1():void");
    }

    public final synchronized void F0(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5863x4343d0ad c5863x4343d0ad, com.p314xaae8f345.mm.ui.C21370x5ce6d0c6 c21370x5ce6d0c6, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5863x4343d0ad c5863x4343d0ad2, java.lang.String str, java.lang.String str2, boolean z17) {
        am.ep epVar = c5863x4343d0ad.f136170g;
        java.lang.String str3 = epVar.f88103d;
        int i17 = epVar.f88104e;
        int i18 = epVar.f88105f;
        boolean z18 = epVar.f88106g;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) && c21370x5ce6d0c6 != null && c21370x5ce6d0c6.S != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "gamelog.reddot, finder, update, download entrance image : %s, width: %d, height: %d", str3, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (i17 <= 0 || i18 <= 0) {
                c21370x5ce6d0c6.Z(i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 32), i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 32));
            } else {
                c21370x5ce6d0c6.Z(i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i17), i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i18));
            }
            if (this.f278188v.b()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "gamelog.reddot, finder, update, skip download entrance image ");
                this.D = true;
                this.f278188v.c(c5863x4343d0ad);
                am.ep epVar2 = c5863x4343d0ad.f136170g;
                n1(epVar2.f88107h, epVar2.f88100a, str2, z17);
                return;
            }
            am.ep epVar3 = c5863x4343d0ad2.f136170g;
            long j17 = epVar3.f88107h;
            int i19 = epVar3.f88100a;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5578x677d556e c5578x677d556e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5578x677d556e();
            am.ue ueVar = c5578x677d556e.f135900g;
            ueVar.f89611a = 1;
            ueVar.f89612b = str3;
            c5578x677d556e.e();
            if (c5578x677d556e.f135901h.f89727b) {
                java.lang.String str4 = c5578x677d556e.f135901h.f89726a + kk.k.g(str3.getBytes());
                o11.f fVar = new o11.f();
                fVar.f423611b = true;
                fVar.f423615f = str4;
                n11.a.b().k(str3, null, fVar.a(), new com.p314xaae8f345.mm.ui.o5(this, c5578x677d556e), new com.p314xaae8f345.mm.ui.s5(this, c5863x4343d0ad, z18, c5578x677d556e, c21370x5ce6d0c6, i19, j17, str2, z17, str));
            }
        }
    }

    public final zy2.na G0(com.p314xaae8f345.mm.ui.C21363x65d29512 c21363x65d29512) {
        java.lang.String str;
        zy2.na naVar = new zy2.na();
        if (c21363x65d29512 == null) {
            return naVar;
        }
        if (c21363x65d29512.J2 == 999) {
            return c21363x65d29512.C0();
        }
        int B0 = c21363x65d29512.B0();
        r45.za0 za0Var = r45.za0.NO_DSL_THUMBNAIL_CONTENT;
        if (B0 == 0) {
            r45.pm6 pm6Var = c21363x65d29512.M2;
            if (!((pm6Var == null || (str = pm6Var.f464720e) == null || !str.equals(c21363x65d29512.f278230j2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.esk))) ? false : true)) {
                za0Var = r45.za0.NO_DSL_ORIGINAL_CONTENT;
            }
        } else if (c21363x65d29512.B0() != 1) {
            za0Var = r45.za0.NO_DSL_AUTO_ELLIPSE_CONTENT;
        }
        return new zy2.na(za0Var, 0, false, "", c21363x65d29512.H0(), null, null);
    }

    public final int H0() {
        if (k35.r.a() != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.o Zi = com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().Zi();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().bj() && Zi.e() && !Zi.d()) {
                if ("3".equals(Zi.f253665a) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi.f253679o)) {
                    return 6;
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi.f253671g)) {
                    return 3;
                }
                if (Zi.f253670f) {
                    return 2;
                }
            }
        }
        return 1;
    }

    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 J0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("FinderEntrance");
        if (L0 == null) {
            return null;
        }
        r45.f03 I0 = L0.I0("FinderEntrance");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) L0.N.m75936x14adae67(20);
        if (I0 == null || c19786x6a1e2862 == null || c19786x6a1e2862.m76503x92bc3c07() != 3 || !((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().f0()) {
            return null;
        }
        return c19786x6a1e2862;
    }

    public final int K0() {
        int i17;
        int a17 = com.p314xaae8f345.mm.ui.bl.a(mo7438x76847179());
        int i18 = com.p314xaae8f345.mm.ui.bl.i(mo7438x76847179(), -1);
        android.view.View findViewById = m7474xfb86a31b().getRootView().findViewById(com.p314xaae8f345.mm.R.id.f563968ei);
        if (com.p314xaae8f345.mm.ui.bk.Y()) {
            return findViewById != null ? a17 + findViewById.getTop() : a17 + i18;
        }
        int i19 = android.os.Build.VERSION.SDK_INT;
        boolean isInMultiWindowMode = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b() != null ? com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b().isInMultiWindowMode() : false;
        if (!isInMultiWindowMode) {
            android.content.SharedPreferences d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d();
            if (((d17 != null ? d17.getBoolean("Main_need_read_top_margin", false) : false) || i19 >= 31) && (i17 = d17.getInt("Main_top_marign", -1)) >= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "getTopHeight statusHeight:%s, topMargin:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
                return a17 + i17;
            }
        }
        if (isInMultiWindowMode) {
            i18 = findViewById != null ? findViewById.getTop() : 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "getTopHeight statusHeight:%s, isInMultiWindowMode:%s", java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(isInMultiWindowMode));
        return a17 + i18;
    }

    public final void L0() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w1) ((zy2.e9) i95.n0.c(zy2.e9.class))).f187481i = 7;
        zs.a aVar = zs.b.f556755a;
        zs.b.f556755a = zs.a.f556749m;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.h(1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FindMoreFriendsUI", "fts h5 template not avail");
            return;
        }
        ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
        java.lang.String optString = su4.o2.d("discoverRecommendEntry").optString("wording");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FindMoreFriendsUI", "empty query");
            return;
        }
        this.F1 = true;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("isNewLifeRedDotEntranceShow", ra0.b0.f474996f);
        bundle.putBoolean("isNewLifeRedDotMentionEntranceShow", ra0.b0.f474997g);
        bundle.putBoolean("isRecentNewLifeRedDotMentionEntranceShow", ra0.b0.f474998h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "look one look clikced, isNewLifeRedDotEntranceShow: %b, isNewLifeRedDotMentionEntranceShow: %b isRecentNewLifeRedDotMentionEntranceShow: %b", java.lang.Boolean.valueOf(ra0.b0.f474996f), java.lang.Boolean.valueOf(ra0.b0.f474997g), java.lang.Boolean.valueOf(ra0.b0.f474998h));
        android.app.Activity mo7438x76847179 = mo7438x76847179();
        o11.g gVar = wm4.u.f528842a;
        wm4.u.u(mo7438x76847179, 21, bundle, "", new java.util.HashMap());
        ((ty4.n) ((uy4.v) i95.n0.c(uy4.v.class))).Di("labs_browse");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5808xcfc568fb c5808xcfc568fb = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5808xcfc568fb();
        c5808xcfc568fb.f136116g.f87895a = 0;
        c5808xcfc568fb.e();
        su4.k3.a(21, optString);
        su4.k3.f(21, 0);
        ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().I();
        ra0.x xVar = (ra0.x) i95.n0.c(ra0.x.class);
        boolean z17 = ra0.b0.f474996f;
        boolean z18 = ra0.b0.f474997g;
        nn3.f fVar = (nn3.f) xVar;
        fVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLifeReporter", "reportNewLifeRedDotClick [%b] [%b]", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        if (z17) {
            fVar.Vi("NewLife.Entrance", 1);
        }
        if (z18) {
            fVar.Vi("NewLife.MentionEntrance", 1);
            fVar.Vi("NewLife.OfficialMsgEntrance", 1);
            fVar.Vi("K1k.MentionEntrance", 1);
        }
        int s17 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().s();
        if (s17 > 0) {
            ra0.x xVar2 = (ra0.x) i95.n0.c(ra0.x.class);
            java.lang.String str = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().r().f465646d;
            nn3.f fVar2 = (nn3.f) xVar2;
            fVar2.getClass();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("view_id", "ws_reddot");
            hashMap.put("tipsid", str);
            hashMap.put("show_path", "wesee");
            hashMap.put("message_num", java.lang.Integer.valueOf(s17));
            fVar2.Ni("view_clk", null, hashMap, false);
        }
    }

    public final void M0(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17065, 1, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()), java.lang.Integer.valueOf(this.f278192x1.ordinal()), gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.MY_LIFE_AROUND_APP_RED_DOT_IMG_URL_STRING, ""), gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.MY_LIFE_AROUND_APP_RED_DOT_TEXT_STRING, ""), gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.MY_LIFE_AROUND_APP_RED_DOT_TYPE_STRING, "0"));
        if (this.f278192x1.equals(com.p314xaae8f345.mm.ui.e6.TYPE_NEW_HINT)) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.MY_LIFE_AROUND_APP_NEW_RED_DOT_TAG_BOOLEAN, java.lang.Boolean.FALSE);
            this.f278192x1 = com.p314xaae8f345.mm.ui.e6.TYPE_NONE;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) this.f278189w.h("my_life_around");
            c21549x15041e54.a0(8);
            c21549x15041e54.V = "";
            c21549x15041e54.W = -1;
        }
        boolean booleanValue = ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.MY_LIFE_AROUND_APP_RED_DOT_TAG_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue();
        ((ty4.n) ((uy4.v) i95.n0.c(uy4.v.class))).Di("labs_nearbylife");
        ((ty4.n) ((uy4.v) i95.n0.c(uy4.v.class))).getClass();
        sy4.m mVar = sy4.m.f495417c;
        java.lang.String str = mVar.b("labs_nearbylife").f66650x2d9d11b9;
        ((ty4.n) ((uy4.v) i95.n0.c(uy4.v.class))).getClass();
        int i17 = mVar.b("labs_nearbylife").f66648xeff64168;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
        c12559xbdae8559.f169323f = 1112;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).aj(mo7438x76847179(), str, null, i17, 0, (((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("LifeAppEntranceBringRedDot", 0) == 0 || !booleanValue) ? null : "?hasRedDot=true", c12559xbdae8559);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N0() {
        /*
            Method dump skipped, instructions count: 1535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.C21357x5e7365bb.N0():void");
    }

    public boolean P0(long j17) {
        return (j17 & this.P) != 0;
    }

    public boolean Q0() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.T0(gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.FIND_MORE_UI_ENTRY_LAST_REPORT_TIME_LONG_SYNC, 0L), this.f278185s);
    }

    public final boolean R0() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_jd_entrance_declare, 0);
        boolean o17 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_JD_ENTRANCE_DECLARE_CLICK_BOOLEAN_SYNC, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "show declare needShow %d, hasShow %s", java.lang.Integer.valueOf(Ni), java.lang.Boolean.valueOf(o17));
        return (Ni == 0 || o17) ? false : true;
    }

    @Override // com.p314xaae8f345.mm.ui.y7
    public void T() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "on tab recreate ui");
    }

    public final boolean T0() {
        boolean el6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el();
        boolean z17 = !P0(34359738368L);
        boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        int G8 = ((uh4.c0) i95.n0.c(uh4.c0.class)).G8();
        boolean z18 = mo168058x74219ae7 && G8 == 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "[isShowFinderEntrance] show:%s open:%s, isTeenMode:%s teenModeFinderOption:%s isTeenModeAndNothing:%s", java.lang.Boolean.valueOf(el6), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(mo168058x74219ae7), java.lang.Integer.valueOf(G8), java.lang.Boolean.valueOf(z18));
        return el6 && z17 && !z18;
    }

    public final boolean U0() {
        boolean D = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().D();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "[isShowTopStoryEntrance] show:%s ", java.lang.Boolean.valueOf(D));
        return D;
    }

    @Override // com.p314xaae8f345.mm.ui.y7
    public void V() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "turn to fg");
    }

    public final void V0(boolean z17, boolean z18) {
        jz5.f0 f0Var;
        jz5.f0 f0Var2;
        com.p314xaae8f345.mm.ui.C21363x65d29512 c21363x65d29512;
        int rk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).rk();
        jx3.f.INSTANCE.mo68477x336bdfd8(1279L, 0L, 1L, false);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = this.f278189w;
        zy2.na dslRenderInfo = (h0Var == null || (c21363x65d29512 = (com.p314xaae8f345.mm.ui.C21363x65d29512) h0Var.h("find_friends_by_finder")) == null) ? null : c21363x65d29512.C0();
        android.content.Intent intent = new android.content.Intent();
        java.lang.String Bj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(1, 1, rk6, intent);
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dslRenderInfo, "dslRenderInfo");
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187090a.d(Bj, 0, 0, dslRenderInfo);
        intent.putExtra("key_red_dot_id", d17);
        if (z17) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            java.lang.String g17 = p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15063x2c6bbac6.class).g();
            if (g17 == null) {
                g17 = "";
            }
            intent.putExtra("KEY_ROUTE_TO_PAGE", g17);
        } else if (z18) {
            intent.putExtra("KEY_ROUTE_TO_TOPIC", true);
        }
        intent.putExtra("KEY_FROM_PATH", "FinderEntrance");
        intent.removeExtra("key_yreportsdk_reddot_info");
        if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().f0()) {
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "bindRedDotInfoInFinder cost[%d] size[%d]", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - android.os.SystemClock.elapsedRealtime()), java.lang.Integer.valueOf(l1(intent, "FinderEntrance", ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().i0("FinderMentionEntrance", "reddot_", "_left", "push_type;scene;live_sub_recall_type;order_uid;enter_action;put_strategy;"))));
        }
        intent.putExtra("isEnableShowUnreadFeed", true);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f542005a.D(mo7438x76847179(), intent, true);
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zj(Bj, "Enter");
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        o3Var.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6390x60018a6e c6390x60018a6e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6390x60018a6e();
        c6390x60018a6e.f137362n = c6390x60018a6e.b("ContextId", Bj, true);
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        c6390x60018a6e.f137361m = c6390x60018a6e.b("SessionId", Ri, true);
        pf5.u uVar = pf5.u.f435469a;
        p012xc85e97e9.p093xedfae76a.c1 a17 = uVar.e(c61.l7.class).a(ey2.t0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        ey2.t0 t0Var = (ey2.t0) a17;
        c6390x60018a6e.f137359k = t0Var.Q6();
        p012xc85e97e9.p093xedfae76a.c1 a18 = uVar.e(c61.l7.class).a(ey2.k0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
        ey2.k0 k0Var = (ey2.k0) a18;
        c6390x60018a6e.f137354f = k0Var.N6() ? 1L : 0L;
        r45.ae3 ae3Var = k0Var.f338944e;
        jz5.f0 f0Var3 = jz5.f0.f384359a;
        if (ae3Var != null) {
            c6390x60018a6e.f137353e = 1L;
            f0Var = f0Var3;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            c6390x60018a6e.f137353e = 0L;
        }
        if (d17 != null) {
            c6390x60018a6e.f137352d = 1L;
            c6390x60018a6e.f137360l = c6390x60018a6e.b("EnterRedDotId", d17, true);
            c6390x60018a6e.f137358j = 0L;
            c6390x60018a6e.f137357i = 0L;
            c6390x60018a6e.f137355g = 0L;
            c6390x60018a6e.f137356h = 0L;
            c6390x60018a6e.f137363o = 1L;
            f0Var2 = f0Var3;
        } else {
            f0Var2 = null;
        }
        if (f0Var2 == null) {
            c6390x60018a6e.f137352d = 0L;
            c6390x60018a6e.f137360l = c6390x60018a6e.b("EnterRedDotId", "", true);
            c6390x60018a6e.f137363o = t0Var.R6(t0Var.Q6()) ? 2L : 1L;
            long j17 = t0Var.N6(3).f338978e;
            if (j17 < 0) {
                j17 = 0;
            }
            c6390x60018a6e.f137355g = j17;
            long j18 = t0Var.N6(2).f338978e;
            if (j18 < 0) {
                j18 = 0;
            }
            c6390x60018a6e.f137357i = j18;
            long j19 = t0Var.N6(1).f338978e;
            if (j19 < 0) {
                j19 = 0;
            }
            c6390x60018a6e.f137356h = j19;
            long j27 = t0Var.N6(4).f338978e;
            c6390x60018a6e.f137358j = j27 >= 0 ? j27 : 0L;
        }
        c6390x60018a6e.k();
        o3Var.Zk(c6390x60018a6e);
        gz2.c.a("finder");
        zs.a aVar = zs.b.f556755a;
        zs.b.f556755a = zs.a.f556745f;
    }

    public void W0() {
        zy2.na naVar = new zy2.na();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = this.f278189w;
        if (h0Var != null) {
            naVar = G0((com.p314xaae8f345.mm.ui.C21363x65d29512) h0Var.h(this.M1.b()));
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String Cj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Cj(com.p314xaae8f345.mm.ui.p2731xc84c5534.e0.a(), intent);
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187090a.b(Cj, 1, naVar);
        y0(intent, "FinderLiveEntrance");
        ((v40.s) ((uc.n) i95.n0.c(uc.n.class))).Ai(mo7438x76847179(), intent);
        zs.a aVar = zs.b.f556755a;
        zs.b.f556755a = zs.a.f556746g;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X0() {
        /*
            Method dump skipped, instructions count: 1343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.C21357x5e7365bb.X0():void");
    }

    public final void Z0(com.p314xaae8f345.mm.ui.C21363x65d29512 c21363x65d29512, int i17, boolean z17, long j17) {
        this.U.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.ui.b6(this, i17, c21363x65d29512, z17, false), j17);
    }

    @Override // c01.y8
    public void a0() {
        if (this.f278189w == null) {
            return;
        }
        this.N = c01.z1.p();
        D1();
    }

    public final void a1(r45.pm6 pm6Var) {
        ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.G2).mo141623x754a37bb()).r()).intValue();
        java.util.Random random = new java.util.Random();
        if (intValue <= 0 || pm6Var == null) {
            return;
        }
        pm6Var.f464723h = "8.6万人";
        pm6Var.f464724i = "#FA9D3B";
        pm6Var.f464726n = "#56FA9D3B";
        if (intValue == 2 || intValue == 4) {
            if (random.nextInt(10) % 2 == 0) {
                pm6Var.f464725m = "http://dldir1v6.qq.com/weixin/checkresupdate/icons_filled_fire_v1_3e6119848137473b86dd83e917afe31b.png";
            } else {
                pm6Var.f464725m = "http://dldir1v6.qq.com/weixin/checkresupdate/heart_d0713c51c1cb4a18b62d562fafefac53.png";
            }
        }
        if (intValue == 3 || intValue == 4) {
            pm6Var.f464727o = true;
        }
    }

    public void b1(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "note entry red dot [%s] entry [%b]", str, java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5448xc852f7dc c5448xc852f7dc = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5448xc852f7dc();
        am.la laVar = c5448xc852f7dc.f135788g;
        laVar.f88765a = str;
        laVar.f88766b = z17;
        c5448xc852f7dc.e();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = this.f278189w;
        if (h0Var != null) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = h0Var.h(str);
            if (h17 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) {
                c1((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) h17);
            }
        }
    }

    public final void c1(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54) {
        java.lang.String str;
        if (c21549x15041e54 == null || (str = c21549x15041e54.f279313q) == null || str.equals("")) {
            return;
        }
        android.view.View view = c21549x15041e54.W1;
        if (view == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FindMoreFriendsUI", "entryKey = [%s] get root view is null", str);
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5767x4bcc9474 c5767x4bcc9474 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5767x4bcc9474();
        am.wl wlVar = c5767x4bcc9474.f136084g;
        wlVar.f89829a = view;
        wlVar.f89830b = str;
        wlVar.f89831c = c21549x15041e54.V1;
        f55.e eVar = f55.e.f341304e;
        wlVar.f89832d = 2;
        wlVar.f89833e = this.f278189w.q(str);
        c5767x4bcc9474.e();
    }

    public final boolean d1(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().a(11);
        h45.g0.f360478a = 9;
        if (k35.r.a() != null) {
            java.lang.String Ui = com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().Ui();
            com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.n Vi = com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().Vi();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "jumpUrl %s, jumpWeapp %s", Ui, Vi);
            int H0 = H0();
            com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().wi();
            com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().Ai();
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) c21560x1fce98fb;
            c21549x15041e54.V = "";
            c21549x15041e54.W = -1;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Vi.f253662a)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "jump to jd weapp %s", Vi.f253662a);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11179, Vi.f253662a, com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().Zi().f253666b, java.lang.Integer.valueOf(H0));
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_dialog_optimize_switch, 1) == 1) {
                    l81.b1 b1Var = new l81.b1();
                    b1Var.f398545a = Vi.f253662a;
                    b1Var.f398551d = Vi.f253664c;
                    b1Var.f398555f = Vi.f253663b;
                    b1Var.f398565k = 1112;
                    if (R0()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11565x2acac113 c11565x2acac113 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11565x2acac113();
                        c11565x2acac113.f156519d = 1;
                        c11565x2acac113.f156521f = m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.bq7);
                        c11565x2acac113.f156522g = m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.g6n);
                        c11565x2acac113.f156523h = m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi);
                        c11565x2acac113.f156524i = false;
                        b1Var.B = c11565x2acac113;
                    }
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(mo7438x76847179(), b1Var);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "onClickOfJDEntrance clicfg_appbrand_dialog_optimize_switch close");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
                    c12559xbdae8559.f169323f = 1112;
                    if (R0()) {
                        db5.e1.G(mo7438x76847179(), m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.g6n), m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.bq7), false, new com.p314xaae8f345.mm.ui.h5(this, Vi, c12559xbdae8559));
                    } else {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).aj(mo7438x76847179(), Vi.f253662a, "", 0, Vi.f253664c, Vi.f253663b, c12559xbdae8559);
                    }
                }
                return true;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Ui)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "jump to jd webview %s", Ui);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11179, Ui, com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Di().Zi().f253666b, java.lang.Integer.valueOf(H0));
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", Ui);
                intent.putExtra("useJs", true);
                intent.putExtra("vertical_scroll", true);
                intent.putExtra("minimize_secene", 1);
                intent.putExtra("KPublisherId", "jd_store");
                com.p314xaae8f345.mm.ui.i5 i5Var = new com.p314xaae8f345.mm.ui.i5(this, intent);
                if (R0()) {
                    db5.e1.G(mo7438x76847179(), m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.g6n), m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.bq7), false, new com.p314xaae8f345.mm.ui.j5(this, i5Var));
                } else {
                    i5Var.run();
                }
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.y7
    public void e0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "turn to bg");
    }

    public final void e1() {
        if (this.f278189w != null) {
            android.widget.AbsListView.OnScrollListener wi6 = ((e55.f) ((f55.g) i95.n0.c(f55.g.class))).wi();
            if (wi6 != null) {
                this.f278189w.c(wi6);
            }
            android.widget.ListView listView = this.f278189w.f279352u;
            if (listView != null) {
                f55.g gVar = (f55.g) i95.n0.c(f55.g.class);
                f55.e eVar = f55.e.f341304e;
                ((e55.f) gVar).getClass();
                if (e55.e.f331200a.n()) {
                    e55.m mVar = e55.m.f331214a;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 g17 = mVar.g();
                    android.os.Message mo50288x733c63a2 = mVar.g().mo50288x733c63a2();
                    mo50288x733c63a2.what = 1015;
                    mo50288x733c63a2.obj = nm5.j.c(2, new java.lang.ref.WeakReference(listView));
                    g17.mo50308x2936bf5f(mo50288x733c63a2);
                }
            }
        }
    }

    public final void f1() {
        this.E1 = false;
        if (!t1()) {
            ((sg0.h3) ((su4.f1) i95.n0.c(su4.f1.class))).getClass();
            java.lang.Boolean bool = true;
            if (bool.booleanValue() && mo7438x76847179() != null) {
                ((sg0.h3) ((su4.f1) i95.n0.c(su4.f1.class))).Ai(20, mo7438x76847179());
            }
            if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.c()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "try preload search webView in discover page");
                su4.r2.o();
                if (su4.r2.h(false) != 0) {
                    su4.r2.p(0L, false, true, 1);
                }
                ((sg0.a2) ((su4.z0) i95.n0.c(su4.z0.class))).cj(20, 0);
            }
        }
        if (U0() && wm4.u.r() && mo7438x76847179() != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "[TopStoryLiteApp]try preload top story liteApp");
            lf0.d0 d0Var = (lf0.d0) i95.n0.c(lf0.d0.class);
            android.app.Activity context = mo7438x76847179();
            d0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            if (((q80.g0) i95.n0.c(q80.g0.class)) == null) {
                return;
            }
            d0Var.Di(context, "wxalite71e155e932f19de48da8333a8f225708", "pages/videotab/main", false);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = lf0.d0.f399734e;
            wu5.c cVar = (wu5.c) concurrentHashMap.get("wxalite71e155e932f19de48da8333a8f225708pages/videotab/main");
            if (cVar != null) {
                cVar.cancel(false);
            }
            concurrentHashMap.remove("wxalite71e155e932f19de48da8333a8f225708pages/videotab/main");
            ((ku5.t0) ku5.t0.f394148d).B(new lf0.b0("wxalite71e155e932f19de48da8333a8f225708", "pages/videotab/main", context));
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "onNotifyChange(MStorageEx)");
        if (com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78442x336b58a0() == 2) {
            boolean z18 = true;
            if (this.N != c01.z1.p()) {
                this.N = c01.z1.p();
                z17 = true;
            } else {
                z17 = false;
            }
            if (this.P != c01.z1.j()) {
                this.P = c01.z1.j();
                z17 = true;
            }
            if (this.Q != c01.z1.n()) {
                this.Q = c01.z1.n();
                z17 = true;
            }
            if (this.R != c01.z1.h()) {
                this.R = c01.z1.h();
            } else {
                z18 = z17;
            }
            if (z18) {
                D1();
            }
            if ((obj instanceof java.lang.Integer) && ((java.lang.Integer) obj).intValue() == 68377) {
                C1();
            }
            if (a1Var instanceof com.p314xaae8f345.mm.p2621x8fb0427b.m4) {
                this.f278189w.notifyDataSetChanged();
            }
        }
    }

    public final void g1() {
        su4.h2 Ni;
        if (!t1()) {
            ((sg0.h3) ((su4.f1) i95.n0.c(su4.f1.class))).getClass();
            java.lang.Boolean bool = true;
            if (bool.booleanValue() && !this.E1 && (Ni = ((sg0.h3) ((su4.f1) i95.n0.c(su4.f1.class))).Ni(20)) != null && Ni.f494443e) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = sg0.h3.f489255d;
                wu5.c cVar = (wu5.c) concurrentHashMap.get(Ni.a());
                if (cVar != null) {
                    cVar.cancel(false);
                }
                java.lang.String a17 = Ni.a();
                ku5.u0 u0Var = ku5.t0.f394148d;
                sg0.f3 f3Var = new sg0.f3(20, Ni);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                wu5.c z17 = t0Var.z(f3Var, 180000L, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(z17, "uiDelay(...)");
                concurrentHashMap.put(a17, z17);
            }
        }
        if (!U0() || this.F1 || !wm4.u.r() || mo7438x76847179() == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "[TopStoryLiteApp]try release top story preload res");
        ((lf0.d0) i95.n0.c(lf0.d0.class)).getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = lf0.d0.f399734e;
        wu5.c cVar2 = (wu5.c) concurrentHashMap2.get("wxalite71e155e932f19de48da8333a8f225708pages/videotab/main");
        if (cVar2 != null) {
            cVar2.cancel(false);
        }
        ku5.u0 u0Var2 = ku5.t0.f394148d;
        lf0.c0 c0Var = new lf0.c0("wxalite71e155e932f19de48da8333a8f225708", "pages/videotab/main");
        ku5.t0 t0Var2 = (ku5.t0) u0Var2;
        t0Var2.getClass();
        wu5.c z18 = t0Var2.z(c0Var, 180000L, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(z18, "uiDelay(...)");
        concurrentHashMap2.put("wxalite71e155e932f19de48da8333a8f225708pages/videotab/main", z18);
    }

    public final void h1() {
        this.Y.mo48814x2efc64();
        this.V.mo48814x2efc64();
        this.Z.mo48814x2efc64();
        this.X.mo48814x2efc64();
        this.f278182l1.mo48814x2efc64();
        this.A1.mo48814x2efc64();
        this.B1.mo48814x2efc64();
        if (gm0.j1.a()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi().mo49775xc84af884(this.W);
            com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b.e(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5577x8d968bcb.class.getName(), this.f278183p0);
            com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b.e(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6012xa63c8377.class.getName(), this.f278194y0);
            com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b.e(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5575x5e210224.class.getName(), this.f278191x0);
            r21.w.Di().mo49775xc84af884(this);
            ((l75.a1) c01.d9.b().r()).e(this);
            c01.d9.b().G(this);
            c01.d9.b().p().e(this);
            if (this.C != null) {
                ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).aj(this.C);
            }
        }
        if (o25.w1.b() != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4) o25.w1.b()).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeNotifyListener", "com.tencent.mm.plugin.sns.model.SnsCore");
            java.util.List list = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c3.f245646h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeNotifyListener", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            ((java.util.LinkedList) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c3.f245646h).remove(this);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeNotifyListener", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeNotifyListener", "com.tencent.mm.plugin.sns.model.SnsCore");
        }
    }

    public final void i1(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.h0 h0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.h0) m33.a1.a();
        if (!h0Var.f220987e) {
            boolean z18 = false;
            if (((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).Bi(e42.d0.game_luggage, true)) {
                if (((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).Bi(e42.d0.preload_game_webcore, false)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDelegateImpl", "hit expt preload");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    g0Var.C(939L, 4L, 1L);
                    if (y7.c.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) < 2014) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDelegateImpl", "device score smaller than 2014");
                        g0Var.C(939L, 5L, 1L);
                    } else {
                        if (java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("game_center_pref", 0).getLong("game_index_last_visit_time", 0L) > 21600000) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDelegateImpl", "larger than 6 hours");
                            if (z17) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 m17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().m();
                                if (m17 == null || java.lang.System.currentTimeMillis() - (m17.f68475xee5f688b * 1000) > 21600000) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDelegateImpl", "red dot larger than 6 hours");
                                    g0Var.C(939L, 7L, 1L);
                                }
                            } else {
                                g0Var.C(939L, 6L, 1L);
                            }
                        }
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDelegateImpl", "isGPVersion");
                            g0Var.C(939L, 8L, 1L);
                        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r53.f.g())) {
                            g0Var.C(939L, 9L, 1L);
                        } else {
                            z18 = true;
                        }
                    }
                }
            }
            h0Var.f220986d = z18;
            h0Var.f220987e = true;
        }
        if (h0Var.f220986d) {
            java.lang.String g17 = r53.f.g();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDelegateImpl", "preload");
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5756xf590b991 c5756xf590b991 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5756xf590b991();
            am.nl nlVar = c5756xf590b991.f136075g;
            nlVar.f88966a = 3;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", g17);
            nlVar.f88968c = intent;
            c5756xf590b991.e();
        }
    }

    public final int l1(android.content.Intent intent, java.lang.String str, java.util.HashMap hashMap) {
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.HashMap i07 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().i0(str, "reddot_", "", "push_type;scene;live_sub_recall_type;order_uid;enter_action;put_strategy;");
        if (!i07.isEmpty()) {
            hashMap2.putAll(i07);
        }
        if (hashMap != null && !hashMap.isEmpty()) {
            hashMap2.putAll(hashMap);
        }
        if (intent == null || hashMap2.isEmpty()) {
            return 0;
        }
        intent.putExtra("key_yreportsdk_reddot_info", hashMap2);
        return hashMap2.size();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractC21556x9c39960b
    public int m0() {
        return com.p314xaae8f345.mm.R.xml.f576408ag;
    }

    public final void m1(boolean z17, com.p314xaae8f345.mm.ui.C21363x65d29512 c21363x65d29512, r45.f03 f03Var) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var;
        com.p314xaae8f345.mm.ui.C21363x65d29512 c21363x65d295122 = c21363x65d29512;
        java.lang.String str = this.N1;
        if (c21363x65d295122 != null && !str.equals(c21363x65d295122.f279313q) && ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).Ui()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FindMoreFriendsUI", "reportFindPageRedDotExpose %s invalid!", c21363x65d295122.f279313q);
            return;
        }
        if (c21363x65d295122 == null && (h0Var = this.f278189w) != null) {
            c21363x65d295122 = (com.p314xaae8f345.mm.ui.C21363x65d29512) h0Var.h(str);
        }
        com.p314xaae8f345.mm.ui.C21363x65d29512 c21363x65d295123 = c21363x65d295122;
        if (c21363x65d295123 != null) {
            int H0 = c21363x65d295123.H0();
            int B0 = c21363x65d295123.B0();
            zy2.na C0 = c21363x65d295123.C0();
            int i17 = f03Var != null ? f03Var.f455420d : 0;
            ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).getClass();
            boolean z18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ca.f186980b;
            java.lang.String str2 = c21363x65d295123.f279313q;
            ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).getClass();
            boolean t17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a.t();
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
            r45.za0 za0Var = C0.f559018a;
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(C0.f559019b);
            java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(z18);
            boolean z19 = C0.f559020c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "reportFindPageRedDotExpose %s, ignoreDuplicatedId=%s, renderStatus:%s,remarkFlag:%s,enableDslRenderStateNewReportLogic:%s,init:%s,title:%s,showStyle:%s, ignoreReportBeforeRenderFinished:%s", str2, valueOf, za0Var, valueOf2, valueOf3, java.lang.Boolean.valueOf(z19), C0.f559021d, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(t17));
            if (z18 && str.equals(str2) && i17 == 999 && !z19) {
                if (this.I1 == null) {
                    this.I1 = new com.p314xaae8f345.mm.ui.a6(this, c21363x65d295123, t17, this, z17);
                }
                ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).Ni(this, this.I1, false);
                return;
            }
            if (str.equals(c21363x65d295123.f279313q) && t17) {
                if (!this.F) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "return because not in find page!");
                    return;
                } else if (i17 == 999 && (!z19 || !c21363x65d295123.N0())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "return because DSL view has not shown! hasInit:%s", java.lang.Boolean.valueOf(z19));
                    return;
                }
            }
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).cj(z17, H0, B0, C0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:307:0x0c59, code lost:
    
        if (r0 == false) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0ba8, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.DiscoveryNearby.k(mo7438x76847179(), null) == false) goto L301;
     */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [android.content.DialogInterface$OnClickListener, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r10v8 */
    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractC21556x9c39960b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean n0(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r r29, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb r30, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.n0 r31) {
        /*
            Method dump skipped, instructions count: 3171
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.C21357x5e7365bb.n0(com.tencent.mm.ui.base.preference.r, com.tencent.mm.ui.base.preference.Preference, com.tencent.mm.ui.base.preference.n0):boolean");
    }

    public final void n1(long j17, int i17, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 L0;
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.GAME_ENTRANCE_MSG_ID_LONG_SYNC;
        if (j17 == c17.t(u3Var, 0L) || !this.I || this.f278188v.a()) {
            return;
        }
        gm0.j1.i();
        gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(j17));
        if (m33.a1.a() == null || (L0 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().L0(j17)) == null) {
            return;
        }
        L0.t0();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("reddot_strategy", com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.d.a() ? "1" : "0");
        hashMap.put("channel", java.lang.Integer.toString(L0.f68450xa09e2abe));
        hashMap.put("other_score", str == null ? "" : str);
        hashMap.put("expo_times", "1");
        if (z17) {
            hashMap.put("cexpo_times", "1");
        }
        java.lang.String a17 = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.a("resource", java.lang.String.valueOf(i17), L0.U2, hashMap);
        if (L0.f68470x672cb5cf) {
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 9, 901, 1, 1, 0, L0.f68449x28d45f97, 0, L0.S2, L0.f68458xd54c6aa5, L0.T2, a17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(858L, 2L, 1L, false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: noActionBar */
    public boolean mo48374x69604d3c() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractC21556x9c39960b
    public boolean o0(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb, android.view.View view) {
        boolean z17;
        boolean z18 = false;
        if ("find_friends_by_finder".equals(c21560x1fce98fb.f279313q) && i95.n0.c(zy2.b6.class) != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                android.app.Activity activity = mo7438x76847179();
                ((c61.l7) b6Var).getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                try {
                    int i17 = com.tencent.mm.plugin.finder.ui.FinderKitUI.d;
                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.finder.ui.FinderKitUI.class);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/FinderCommonFeatureService", "showFinderEntranceDebugSheet", "(Landroid/app/Activity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activity.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(activity, "com/tencent/mm/plugin/FinderCommonFeatureService", "showFinderEntranceDebugSheet", "(Landroid/app/Activity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (java.lang.Throwable th6) {
                    if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
                        z18 = true;
                    } else {
                        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    }
                    if (z18) {
                        throw th6;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderCommonFeatureService", "activity FinderKitUI not found");
                }
                return true;
            }
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        if ("find_friends_by_look".equals(c21560x1fce98fb.f279313q) && i95.n0.c(zy2.b6.class) != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.setClassName(mo7438x76847179(), "com.tencent.mm.plugin.repairer.ui.demo.RepairerNewLifeDebugUI");
                m7587x5dc77fb5(intent2, 0);
                return true;
            }
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        try {
            if ("album_dyna_photo_ui_title".equals(c21560x1fce98fb.f279313q)) {
                java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                if (z65.c.a()) {
                    android.app.Activity mo7438x76847179 = mo7438x76847179();
                    int i18 = com.tencent.mm.plugin.sns.ui.SnsSettingUI.g;
                    android.content.Intent intent3 = new android.content.Intent(mo7438x76847179, (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.SnsSettingUI.class);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent3);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/ui/FindMoreFriendsUI", "onPreferenceTreeLongClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;Landroid/view/View;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    mo7585xa4df9991((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(this, "com/tencent/mm/ui/FindMoreFriendsUI", "onPreferenceTreeLongClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;Landroid/view/View;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return true;
                }
            }
        } catch (java.lang.Exception unused) {
        }
        if ("app_brand_entrance".equals(c21560x1fce98fb.f279313q)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k6 k6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k6.class);
            android.app.Activity context = mo7438x76847179();
            if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.t2) k6Var).Bi() || ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.j0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.j0.class)) == null) {
                z17 = false;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                try {
                    java.lang.Class.forName(com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI.class.getName());
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) context, 1, false);
                    k0Var.f293405n = q91.a.f442419d;
                    k0Var.f293414s = new q91.c(k0Var, context);
                    k0Var.v();
                } catch (java.lang.Throwable unused2) {
                }
                z17 = true;
            }
            if (z17) {
                return true;
            }
        }
        if ("more_tab_game_recommend".equals(c21560x1fce98fb.f279313q) && i95.n0.c(m33.r1.class) != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
                m33.r1 r1Var = (m33.r1) i95.n0.c(m33.r1.class);
                android.app.Activity mo7438x768471792 = mo7438x76847179();
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) r1Var).getClass();
                if (mo7438x768471792 != null) {
                    android.content.Intent intent4 = new android.content.Intent(mo7438x768471792, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15950x42a237a6.class);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(intent4);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(mo7438x768471792, arrayList3.toArray(), "com/tencent/mm/plugin/game/GameService", "showGameDebugView", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    mo7438x768471792.startActivity((android.content.Intent) arrayList3.get(0));
                    yj0.a.f(mo7438x768471792, "com/tencent/mm/plugin/game/GameService", "showGameDebugView", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
                return true;
            }
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        return false;
    }

    public void o1(java.lang.String str, java.lang.Boolean bool) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "safeReportFinderLiveRedDotExpose source=" + str);
        rg5.o oVar = this.M1;
        if (oVar == null || this.f278189w == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("needCheckShowingRedDotOnExposeReport: ");
        jz5.g gVar = oVar.f476802i;
        sb6.append(((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEntryPreferenceMgr", sb6.toString());
        boolean booleanValue = ((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue();
        com.p314xaae8f345.mm.ui.C21363x65d29512 c21363x65d29512 = (com.p314xaae8f345.mm.ui.C21363x65d29512) this.f278189w.h(this.M1.b());
        if (c21363x65d29512 != null) {
            zy2.na G0 = G0(c21363x65d29512);
            if (!G0.f559020c && c21363x65d29512.J2 == 999) {
                if (this.J1 == null) {
                    this.J1 = new com.p314xaae8f345.mm.ui.c6(this, c21363x65d29512, booleanValue, str);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "finderEntranceDslRender Action listener");
                ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).Ni(this, this.J1, false);
                return;
            }
            if (booleanValue) {
                int i17 = c21363x65d29512.J2;
                if (i17 == 0 || i17 == 8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "safeReportFinderLiveRedDotExpose return for no red dot");
                    return;
                } else if (i17 == 999 && !c21363x65d29512.N0()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "safeReportFinderLiveRedDotExpose return for red dot invisible");
                    return;
                } else if (!this.F) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "safeReportFinderLiveRedDotExpose return for not in findEntrance");
                    return;
                }
            }
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).fj(str + "_otherRender", bool.booleanValue(), this.M1.e(), G0);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractC21336x64915aa4, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractC21556x9c39960b, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityCreated */
    public void mo7495x78cb4fa(android.os.Bundle bundle) {
        super.mo7495x78cb4fa(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "onActivityCreated");
        if (this.M1 == null) {
            rg5.o oVar = new rg5.o(mo7438x76847179(), this);
            this.M1 = oVar;
            oVar.f();
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        u1();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractC21336x64915aa4, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        if (this.K1 != null) {
            zy2.ca caVar = (zy2.ca) i95.n0.c(zy2.ca.class);
            p012xc85e97e9.p093xedfae76a.k0 observer = this.K1;
            ((c61.t8) caVar).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186892d.mo522xb5bdeb7a(observer);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = this.f278189w;
        if (h0Var != null) {
            h0Var.u(this.M);
        }
        if (this.J1 != null) {
            ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).Ni(this, this.J1, true);
        }
        rg5.o oVar = this.M1;
        if (oVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEntryPreferenceMgr", "onDestroy");
            oVar.f476801h.m43072x2efc64();
            oVar.g();
            this.M1 = null;
        }
        zs.a aVar = zs.b.f556755a;
        zs.b.f556755a = zs.a.f556743d;
        zs.c.f556757b = false;
        zs.c.f556758c = false;
        zs.c.f556759d = false;
        zs.c.f556761f = 0;
        zs.c.f556762g = 0;
        rg5.x xVar = this.G1;
        if (xVar != null) {
            ef0.k2 k2Var = (ef0.k2) ((qk.n8) i95.n0.c(qk.n8.class));
            k2Var.getClass();
            rg5.u listener = xVar.f476822d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
            k2Var.f333788g.remove(listener);
        }
        com.p314xaae8f345.mm.ui.g6 g6Var = this.f278188v;
        if (g6Var != null) {
            synchronized (g6Var.f290153b) {
                g6Var.f290154c.mo48814x2efc64();
                g6Var.f290152a = null;
            }
        }
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "onNotifyChange(MStorage)");
        if (com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78442x336b58a0() == 2) {
            boolean z18 = true;
            if (this.N != c01.z1.p()) {
                this.N = c01.z1.p();
                z17 = true;
            } else {
                z17 = false;
            }
            if (this.P != c01.z1.j()) {
                this.P = c01.z1.j();
                z17 = true;
            }
            if (this.Q != c01.z1.n()) {
                this.Q = c01.z1.n();
                z17 = true;
            }
            if (this.R != c01.z1.h()) {
                this.R = c01.z1.h();
            } else {
                z18 = z17;
            }
            if (z18) {
                D1();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractC21336x64915aa4
    public void p0(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "on tab create");
        tm0.e stateOwner = this.f278186t;
        stateOwner.f501995h.d();
        stateOwner.f501993f = stateOwner.b();
        stateOwner.a().mo127124xc2079749(kz5.b0.c(new tm0.a(tm0.b.f501981d, stateOwner)));
        this.f278189w = this.f279297d;
        this.N = c01.z1.p();
        this.Q = c01.z1.n();
        this.P = c01.z1.j();
        this.R = c01.z1.h();
        new rl5.r(mo7438x76847179());
        if (com.p314xaae8f345.mm.ui.a4.f278650a.h(mo78409x676b27cd())) {
            this.f278189w.m("bottom_empty_place_holder", false);
        } else {
            this.f278189w.m("bottom_empty_place_holder", true);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "on tab create end");
        this.f278189w.m("find_friends_by_shake", true);
        this.f278189w.m("ip_call_entrance", true);
        zs.a aVar = zs.b.f556755a;
        zs.b.f556755a = zs.a.f556743d;
        zs.c.f556757b = false;
        zs.c.f556758c = false;
        zs.c.f556759d = false;
        zs.c.f556761f = 0;
        zs.c.f556762g = 0;
        en3.g0 g0Var = (en3.g0) ((ra0.z) i95.n0.c(ra0.z.class));
        g0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stateOwner, "stateOwner");
        new java.lang.ref.WeakReference(stateOwner);
        stateOwner.a().m127129x5f6d8be8(g0Var, new en3.f0(g0Var));
        e1();
    }

    public final void p1() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5988x830151a7 c5988x830151a7 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5988x830151a7();
        c5988x830151a7.f136283g.f88715a = this.F;
        c5988x830151a7.e();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractC21336x64915aa4
    public void q0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "on tab destroy");
        tm0.e eVar = this.f278186t;
        eVar.a().mo127124xc2079749(kz5.b0.c(new tm0.a(tm0.b.f501986i, eVar)));
        eVar.f501995h.e();
        h1();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) ((vg3.f4) i95.n0.c(vg3.f4.class))).getClass();
        c01.ad.f118594a.i("lifeappreddot", this.f278195y1);
    }

    public final void q1(com.p314xaae8f345.mm.ui.C21370x5ce6d0c6 c21370x5ce6d0c6, int i17, int i18, int i19, boolean z17, int i27, int i28, int i29) {
        c21370x5ce6d0c6.a0(i17);
        c21370x5ce6d0c6.c0(i18);
        c21370x5ce6d0c6.b0(i19);
        c21370x5ce6d0c6.e0(z17);
        c21370x5ce6d0c6.Y(i27);
        c21370x5ce6d0c6.T(i28);
        c21370x5ce6d0c6.V(i29);
        b1("more_tab_game_recommend", i17 == 0 || i18 == 0 || i19 == 0 || z17 || i27 == 0 || i28 == 0 || i29 == 0);
    }

    @Override // com.p314xaae8f345.mm.ui.y7
    public void r() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "on tab switch in isTabSwitchInReport:%b isTabResumeReport:%b", java.lang.Boolean.valueOf(this.P1), java.lang.Boolean.valueOf(this.Q1));
        tm0.e eVar = this.f278186t;
        eVar.b();
        eVar.f501993f = true;
        eVar.a().mo127124xc2079749(kz5.b0.c(new tm0.a(tm0.b.f501983f, eVar)));
        eVar.c(eVar.f501992e && eVar.f501993f);
        this.F = true;
        this.H = true;
        this.L = true;
        p1();
        nm.j.f419976g.a(new com.p314xaae8f345.mm.ui.d6(this));
        su4.o2.f(null, 20, 0L, null, false);
        ((pg3.v) ((n40.n) i95.n0.c(n40.n.class))).wi(false);
        f1();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractC21336x64915aa4
    public void r0() {
        android.widget.AbsListView.OnScrollListener wi6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "on tab pause");
        tm0.e eVar = this.f278186t;
        eVar.b();
        if (eVar.b() && eVar.f501992e) {
            eVar.f501992e = false;
            eVar.c(false);
            eVar.a().mo127124xc2079749(kz5.b0.c(new tm0.a(tm0.b.f501985h, eVar)));
        }
        if (this.f278189w != null && (wi6 = ((e55.f) ((f55.g) i95.n0.c(f55.g.class))).wi()) != null) {
            this.f278189w.u(wi6);
        }
        this.F = false;
        this.P1 = false;
        this.Q1 = false;
        this.H = false;
        this.L = false;
        su4.g3.f494435d.f494438c = null;
        wg0.a aVar = (wg0.a) ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).aj();
        aVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchRedDotReporter", "resetAllExpose");
        ((java.util.concurrent.ConcurrentHashMap) aVar.f527241a).clear();
        ((java.util.concurrent.ConcurrentHashMap) aVar.f527242b).clear();
        ((ef0.z3) ((qk.d9) i95.n0.c(qk.d9.class))).getClass();
        ((java.util.concurrent.ConcurrentHashMap) em4.c.f336747b).clear();
        ((pg3.v) ((n40.n) i95.n0.c(n40.n.class))).wi(true);
        p1();
        h1();
        g1();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).yj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.b3.f186947e);
    }

    public final void r1(com.p314xaae8f345.mm.ui.C21370x5ce6d0c6 c21370x5ce6d0c6, int i17, int i18, int i19, boolean z17, int i27, int i28, int i29, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5863x4343d0ad c5863x4343d0ad) {
        com.p314xaae8f345.mm.ui.g6 g6Var = this.f278188v;
        if (g6Var.b()) {
            g6Var.c(c5863x4343d0ad);
            this.D = true;
            q1(c21370x5ce6d0c6, 8, 8, 8, false, 8, 8, 8);
        } else {
            if (this.D) {
                c21370x5ce6d0c6.y(false);
            }
            this.D = false;
            q1(c21370x5ce6d0c6, i17, i18, i19, z17, i27, i28, i29);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractC21336x64915aa4
    public void s0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "on tab resume isTabSwitchInReport:%b isTabResumeReport:%b", java.lang.Boolean.valueOf(this.P1), java.lang.Boolean.valueOf(this.Q1));
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.b3 b3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.b3.f186947e;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = this.f278189w;
        c61.l7 l7Var = (c61.l7) b6Var;
        l7Var.getClass();
        l7Var.nk().r(b3Var, h0Var);
        tm0.e eVar = this.f278186t;
        eVar.b();
        if (eVar.b() && !eVar.f501992e) {
            eVar.f501992e = true;
            eVar.c(eVar.f501993f);
            eVar.a().mo127124xc2079749(kz5.b0.c(new tm0.a(tm0.b.f501982e, eVar)));
        }
        e1();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var2 = this.f278189w;
        if ((h0Var2 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) && h0Var2.A == 0) {
            h0Var2.A = java.lang.System.currentTimeMillis();
        }
        this.F = true;
        this.H = true;
        this.L = true;
        p1();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi().add(this.W);
        com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b.d(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5577x8d968bcb.class.getName(), this.f278183p0);
        com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b.d(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6012xa63c8377.class.getName(), this.f278194y0);
        com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b.d(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5575x5e210224.class.getName(), this.f278191x0);
        this.Y.mo48813x58998cd();
        this.V.mo48813x58998cd();
        this.Z.mo48813x58998cd();
        this.X.mo48813x58998cd();
        this.f278182l1.mo48813x58998cd();
        this.A1.mo48813x58998cd();
        this.B1.mo48813x58998cd();
        r21.w.Di().add(this);
        ((l75.a1) c01.d9.b().r()).a(this);
        c01.d9.b().a(this);
        c01.d9.b().p().a(this);
        if (o25.w1.b() != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4) o25.w1.b()).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addNotifyListener", "com.tencent.mm.plugin.sns.model.SnsCore");
            java.util.List list = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c3.f245646h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addNotifyListener", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            java.util.LinkedList linkedList = (java.util.LinkedList) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c3.f245646h;
            if (!linkedList.contains(this)) {
                linkedList.add(this);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addNotifyListener", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addNotifyListener", "com.tencent.mm.plugin.sns.model.SnsCore");
        }
        android.view.View mo26077x4ff8c0f0 = mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.imk);
        if (mo26077x4ff8c0f0 != null && mo26077x4ff8c0f0.getVisibility() != 8) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.ui.t5(this, mo26077x4ff8c0f0));
        }
        if (m7481x7a6e8df6()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.w5(this));
        }
        u1();
        if (!this.P1 && !this.Q1) {
            if (T0()) {
                ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).getClass();
                p012xc85e97e9.p093xedfae76a.j0 j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ca.f186979a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0 aj0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ca.f186980b = (aj0Var.K() ? ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f209965a.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a, "是否使用新的DSL红点曝光上报逻辑（修复completeType错误问题）", e42.d0.clicfg_finder_dsl_render_state_new_report_logic, 0, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ce0.f208115d)).intValue() : ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f208000u).mo141623x754a37bb()).r()).intValue()) == 1;
                if (aj0Var.K()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70 z70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f209965a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                    e42.d0 d0Var = e42.d0.clicfg_gallery_image_edit_icon_hide;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14993xc432da87 c14993xc432da87 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14993xc432da87) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f209968d).mo141623x754a37bb();
                    c14993xc432da87.getClass();
                } else {
                    ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f208000u).mo141623x754a37bb()).l();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ca.f186981c = (aj0Var.K() ? ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f209965a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a, "DSL红点保存RenderState", e42.d0.clicfg_finder_dsl_cache_render_state_for_report, 1, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.nd0.f208780d, 8, null)).intValue() : ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.P).mo141623x754a37bb()).r()).intValue()) == 1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedDotRenderNotify", "renderStateReportNewLogic=" + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ca.f186980b + ",dslCacheRenderState=" + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ca.f186981c);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x2) ((c61.l7) i95.n0.c(c61.l7.class)).nk()).Y0(false, "findMoreFriendsTabResume");
                m1(true, null, ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0("FinderEntrance"));
                gz2.c.e("finder");
            }
            if (U0()) {
                ((nn3.f) ((ra0.x) i95.n0.c(ra0.x.class))).cj(ra0.b0.f474996f, ra0.b0.f474997g, true, 108);
                int s17 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().s();
                if (s17 > 0) {
                    ((nn3.f) ((ra0.x) i95.n0.c(ra0.x.class))).hj(s17, ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().r().f465646d, true);
                }
            }
            rg5.o oVar = this.M1;
            boolean e17 = oVar != null ? oVar.e() : true;
            o1("onTabResume", java.lang.Boolean.TRUE);
            if (e17) {
                gz2.c.e("live");
            }
            if ((this.Q & 32768) == 0) {
                gz2.c.e("sns");
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.x5(this));
            this.Q1 = true;
        }
        ((jd0.c) ((kd0.e2) i95.n0.c(kd0.e2.class))).getClass();
        uy3.z.b(2, 0L);
        ((pg3.v) ((n40.n) i95.n0.c(n40.n.class))).wi(false);
        f1();
        if (com.p314xaae8f345.mm.ui.a4.f278650a.h(mo78409x676b27cd())) {
            ((com.p314xaae8f345.mm.ui.C21369x9726cc7b) mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.jlt)).a(true, 0, 0.0f);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "on tab resume end");
    }

    public final void s1(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54, int i17, int i18, boolean z17, int i19, int i27, int i28) {
        c21549x15041e54.c0(i17);
        c21549x15041e54.b0(i18);
        c21549x15041e54.e0(z17);
        c21549x15041e54.Y(i19);
        c21549x15041e54.T(i27);
        c21549x15041e54.V(i28);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: supportNavigationSwipeBack */
    public boolean mo25471x430f73e() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractC21336x64915aa4
    public void t0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "on tab start");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) ((vg3.f4) i95.n0.c(vg3.f4.class))).getClass();
        c01.ad.f118594a.c("lifeappreddot", this.f278195y1);
    }

    public final boolean t1() {
        boolean P0 = P0(2097152L);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        boolean l17 = su4.r2.l();
        j45.l.g(ya.a.f77450x918d59a8);
        boolean z17 = P0 || l17;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "openSearch %s, plugin installed %s isTeenMode: %s", java.lang.Boolean.valueOf(!P0), java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(l17));
        }
        return z17;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractC21336x64915aa4
    public void u0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "on tab stop");
    }

    public final void u1() {
        android.view.View findViewById = m7474xfb86a31b().getRootView().findViewById(com.p314xaae8f345.mm.R.id.huj);
        int a17 = com.p314xaae8f345.mm.ui.bl.a(mo7438x76847179());
        int i17 = com.p314xaae8f345.mm.ui.bl.i(mo7438x76847179(), -1);
        com.p314xaae8f345.mm.ui.v4 v4Var = new com.p314xaae8f345.mm.ui.v4(this, findViewById);
        if (i17 <= 0) {
            m7474xfb86a31b().post(v4Var);
            return;
        }
        int K0 = K0();
        int height = findViewById.getHeight();
        if (com.p314xaae8f345.mm.ui.a4.f278650a.h(mo78409x676b27cd())) {
            m7474xfb86a31b().setPadding(0, K0, 0, 0);
        } else {
            m7474xfb86a31b().setPadding(0, K0, 0, height);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "[trySetParentViewPadding] statusHeight:%s actionBarHeight:%s tabBarHeight:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a17), java.lang.Integer.valueOf(height));
        m7474xfb86a31b().postDelayed(v4Var, 100L);
    }

    public final void v1() {
        m3.d[] dVarArr = new m3.d[11];
        dVarArr[0] = new m3.d("find_friends_by_near", com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.DiscoveryNearby);
        dVarArr[1] = new m3.d("find_live_friends_by_near", com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c() ? com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.DiscoveryNearbyLiveFriends_GP : com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.DiscoveryNearbyLiveFriends);
        dVarArr[2] = new m3.d("find_friends_by_shake", com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.DiscoveryShake);
        dVarArr[3] = new m3.d("find_friends_by_qrcode", com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.GlobalScan);
        dVarArr[4] = new m3.d("more_tab_game_recommend", com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.DiscoveryGame);
        dVarArr[5] = new m3.d("jd_market_entrance", com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.DiscoveryShop);
        dVarArr[6] = new m3.d("app_brand_entrance", com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.DiscoveryAppbrand);
        dVarArr[7] = new m3.d("find_friends_by_search", com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.DiscoverySearch);
        dVarArr[8] = new m3.d("find_friends_by_look", com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.DiscoveryLooks);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.f9 f9Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.DiscoveryChannels;
        dVarArr[9] = new m3.d("find_friends_by_finder", f9Var);
        dVarArr[10] = new m3.d("find_friends_by_finder_live", f9Var);
        for (m3.d dVar : java.util.Arrays.asList(dVarArr)) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = this.f278189w.h((java.lang.String) dVar.f404625a);
            if (h17 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) h17;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.f9 f9Var2 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9) dVar.f404626b;
                if (f9Var2.h()) {
                    this.f278189w.m((java.lang.String) dVar.f404625a, true);
                }
                f9Var2.getClass();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.m(f9Var2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.p(f9Var2.f274242d)) {
                    c21549x15041e54.getClass();
                }
            }
        }
    }

    public final void w1() {
        boolean z17 = false;
        this.I = false;
        com.p314xaae8f345.mm.ui.C21370x5ce6d0c6 c21370x5ce6d0c6 = (com.p314xaae8f345.mm.ui.C21370x5ce6d0c6) this.f278189w.h("more_tab_game_recommend");
        if (c21370x5ce6d0c6 == null) {
            return;
        }
        if (this.M == null) {
            this.M = new com.p314xaae8f345.mm.ui.k5(this, c21370x5ce6d0c6);
        }
        android.view.View view = c21370x5ce6d0c6.W1;
        if (view == null) {
            this.f278189w.c(this.M);
            return;
        }
        int firstVisiblePosition = this.f278189w.f279352u.getFirstVisiblePosition();
        if (this.f278189w.o("more_tab_game_recommend") > this.f278189w.f279352u.getLastVisiblePosition() || this.f278189w.o("more_tab_game_recommend") < firstVisiblePosition) {
            this.f278189w.c(this.M);
        } else {
            android.graphics.Rect rect = new android.graphics.Rect();
            boolean localVisibleRect = view.getLocalVisibleRect(rect);
            this.I = localVisibleRect;
            if (localVisibleRect) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.l1 l1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.l1) ((m33.q1) i95.n0.c(m33.q1.class));
                l1Var.getClass();
                try {
                    ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.k1(l1Var, "game.gameEntryExpose", new cl0.g()), "GameLiteAppStoreService.SerialQueue");
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e("MicroMsg.GameLiteAppStoreService", "notifyGameEntryExpose exp:" + e17);
                }
                if (rect.height() == view.getHeight() && rect.width() == view.getWidth()) {
                    this.f278189w.u(this.M);
                    z17 = true;
                } else {
                    this.f278189w.c(this.M);
                }
            } else {
                this.f278189w.c(this.M);
            }
        }
        c21370x5ce6d0c6.n0(this.f278189w);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(c21370x5ce6d0c6);
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.ui.l5(this, z17), "updateGame");
    }

    public final void x0(r45.pm6 pm6Var, r45.lb lbVar) {
        r45.v80 v80Var;
        r45.eh6 eh6Var;
        if (lbVar == null || (v80Var = lbVar.f460817d) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "analysisRedDotXml attributeXml empty");
            return;
        }
        if (android.text.TextUtils.isEmpty(v80Var.f469514d) && ((eh6Var = lbVar.f460817d.f469515e) == null || (android.text.TextUtils.isEmpty(eh6Var.f455034d) && android.text.TextUtils.isEmpty(lbVar.f460817d.f469515e.f455035e)))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "analysisRedDotXml invalid attributeXml!");
            return;
        }
        r45.v80 v80Var2 = lbVar.f460817d;
        pm6Var.f464720e = v80Var2.f469514d;
        r45.eh6 eh6Var2 = v80Var2.f469515e;
        if (eh6Var2 != null) {
            pm6Var.f464723h = eh6Var2.f455034d;
            pm6Var.f464725m = eh6Var2.f455035e;
            pm6Var.f464724i = eh6Var2.f455036f;
            pm6Var.f464726n = eh6Var2.f455037g;
            pm6Var.f464730r = eh6Var2.f455038h;
            pm6Var.f464731s = eh6Var2.f455039i;
        }
        pm6Var.f464729q = v80Var2.f469516f;
        pm6Var.f464727o = true;
    }

    public final boolean x1(java.lang.String str, java.lang.String str2) {
        boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        boolean z18 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2);
        com.p314xaae8f345.mm.ui.e6 e6Var = (z17 && z18) ? com.p314xaae8f345.mm.ui.e6.TYPE_IMG_TEXT : z18 ? com.p314xaae8f345.mm.ui.e6.TYPE_IMG : z17 ? com.p314xaae8f345.mm.ui.e6.TYPE_TEXT : com.p314xaae8f345.mm.ui.e6.TYPE_NORMAL;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "new type: %s, now type: %s.", e6Var, this.f278192x1);
        if (e6Var.compareTo(this.f278192x1) < 0) {
            return false;
        }
        this.f278192x1 = e6Var;
        return true;
    }

    public final void y0(android.content.Intent intent, java.lang.String str) {
        if (intent != null) {
            intent.removeExtra("key_yreportsdk_reddot_info");
        }
        if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().E()) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "bindRedDotInfoInFinderLive cost[%d] size[%d]", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - android.os.SystemClock.elapsedRealtime()), java.lang.Integer.valueOf(l1(intent, str, null)));
        }
    }

    public final void y1() {
        java.lang.String str;
        if (this.H1 == null) {
            this.H1 = new rg5.r(mo7438x76847179(), this);
        }
        rg5.r rVar = this.H1;
        rVar.getClass();
        boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb = rVar.f476809b;
        if (mo168058x74219ae7) {
            c21357x5e7365bb.f278189w.m("find_friends_by_near", true);
            c21357x5e7365bb.f278189w.m("find_live_friends_by_near", true);
            c21357x5e7365bb.f278189w.m("find_friends_by_near_v3", true);
            if (!c21357x5e7365bb.Q0()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(953L, 5L, 1L);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyEntryPreferenceMgr", "updateNearbyEntry return for isTeenMode.");
        } else {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            vd2.t3 t3Var = vd2.t3.f517454a;
            boolean booleanValue = ((java.lang.Boolean) ((lb2.j) ((jz5.n) ae2.in.f85431v1).mo141623x754a37bb()).r()).booleanValue();
            com.p314xaae8f345.mm.ui.p2731xc84c5534.e0 e0Var = com.p314xaae8f345.mm.ui.p2731xc84c5534.e0.f291166a;
            if (booleanValue && ((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).Ai()) {
                c21357x5e7365bb.f278189w.m("find_friends_by_near", true);
                c21357x5e7365bb.f278189w.m("find_live_friends_by_near", true);
                boolean z17 = !c21357x5e7365bb.P0(70368744177664L);
                boolean z18 = (c21357x5e7365bb.Q & 512) == 0;
                if (z17) {
                    if (c21357x5e7365bb.F) {
                        com.p314xaae8f345.mm.ui.p2731xc84c5534.e0.f291167b = "";
                        str = "null cannot be cast to non-null type com.tencent.mm.ui.FinderIconViewTipPreference";
                        e0Var.e(1L, 2L, com.p314xaae8f345.mm.ui.p2731xc84c5534.e0.b());
                    } else {
                        str = "null cannot be cast to non-null type com.tencent.mm.ui.FinderIconViewTipPreference";
                    }
                    c21357x5e7365bb.f278189w.m("find_friends_by_near_v3", false);
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = c21357x5e7365bb.f278189w.h("find_friends_by_near_v3");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(h17, str);
                    rVar.a((com.p314xaae8f345.mm.ui.C21363x65d29512) h17, z18);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyEntryPreferenceMgr", "updateNearbyEntryV3");
                    r5 = 1;
                } else {
                    c21357x5e7365bb.f278189w.m("find_friends_by_near_v3", true);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyEntryPreferenceMgr", "updateNearbyEntryV3 return for openNearbyLiveFriends:%s", java.lang.Boolean.valueOf(z17));
                }
            } else {
                c21357x5e7365bb.f278189w.m("find_friends_by_near_v3", true);
                if (m25.a.b()) {
                    c21357x5e7365bb.f278189w.m("find_friends_by_near", true);
                    boolean z19 = !c21357x5e7365bb.P0(70368744177664L);
                    boolean z27 = (c21357x5e7365bb.Q & 512) == 0;
                    if (z19) {
                        if (c21357x5e7365bb.F) {
                            com.p314xaae8f345.mm.ui.p2731xc84c5534.e0.f291167b = "";
                            com.p314xaae8f345.mm.ui.p2731xc84c5534.e0.f291168c = "";
                            e0Var.e(1L, 0L, com.p314xaae8f345.mm.ui.p2731xc84c5534.e0.b());
                        }
                        c21357x5e7365bb.f278189w.m("find_live_friends_by_near", false);
                        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h18 = c21357x5e7365bb.f278189w.h("find_live_friends_by_near");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(h18, "null cannot be cast to non-null type com.tencent.mm.ui.FinderIconViewTipPreference");
                        com.p314xaae8f345.mm.ui.C21363x65d29512 c21363x65d29512 = (com.p314xaae8f345.mm.ui.C21363x65d29512) h18;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyEntryPreferenceMgr", "updateNearbyLiveFriendsEntry");
                        if ((z27 ? r21.w.Bi().f() : 0) <= 0) {
                            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FIRST_SHOW_NEARBY_REDDOT_BOOLEAN_SYNC;
                            if (c17.o(u3Var, true) && ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().v()) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyEntryPreferenceMgr", "updateNearbyLiveFriendsEntry: add nearby new red dot");
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.na naVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.na) ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().j0();
                                naVar.getClass();
                                r45.vs2 vs2Var = new r45.vs2();
                                vs2Var.f470023h = java.lang.String.valueOf(c01.id.c());
                                vs2Var.f470019d = 100000;
                                vs2Var.f470020e = 1011;
                                r45.f03 f03Var = new r45.f03();
                                f03Var.f455420d = 6;
                                f03Var.f455424h = 1;
                                f03Var.f455425i = "NearbyEntrance";
                                vs2Var.f470022g.add(f03Var);
                                naVar.f187262a.w(vs2Var, "addNearbyNewRedDot");
                                gm0.j1.u().c().x(u3Var, java.lang.Boolean.FALSE);
                            }
                        }
                        rVar.a(c21363x65d29512, z27);
                        rVar.b(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().v());
                        r5 = 1;
                    } else {
                        c21357x5e7365bb.f278189w.m("find_live_friends_by_near", true);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyEntryPreferenceMgr", "updateNearbyLiveFriendsEntry return for openNearbyLiveFriends:%s", java.lang.Boolean.valueOf(z19));
                    }
                } else {
                    c21357x5e7365bb.f278189w.m("find_live_friends_by_near", true);
                    p012xc85e97e9.p093xedfae76a.k0 k0Var = rVar.f476810c;
                    if (k0Var != null) {
                        ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186892d.mo522xb5bdeb7a(k0Var);
                    }
                    boolean z28 = (c21357x5e7365bb.Q & 512) == 0;
                    j45.l.g("nearby");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyEntryPreferenceMgr", "updateNearbyFriendsEntry enableNearbyFriends:" + z28 + ", nearbyPluginInstalled:true");
                    if (z28) {
                        c21357x5e7365bb.f278189w.m("find_friends_by_near", false);
                        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h19 = c21357x5e7365bb.f278189w.h("find_friends_by_near");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(h19, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.IconPreference");
                        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) h19;
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5674x5f4457f4 c5674x5f4457f4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5674x5f4457f4();
                        c5674x5f4457f4.f135999g.f89154a = 7;
                        c5674x5f4457f4.e();
                        boolean z29 = c5674x5f4457f4.f136000h.f89246a;
                        android.content.Context context = rVar.f476808a;
                        if (z29) {
                            c21549x15041e54.T(8);
                        } else {
                            c21549x15041e54.T(0);
                            c21549x15041e54.Y(0);
                            android.graphics.drawable.Drawable e17 = com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79748xeaccd352, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560227eb));
                            c21549x15041e54.R = e17;
                            c21549x15041e54.f279289y1 = null;
                            c21549x15041e54.Q = -1;
                            android.widget.ImageView imageView = c21549x15041e54.S;
                            if (imageView != null) {
                                imageView.setImageDrawable(e17);
                            }
                            c21549x15041e54.Z(com.p314xaae8f345.mm.ui.zk.e(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs), com.p314xaae8f345.mm.ui.zk.e(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs));
                        }
                        int f17 = r21.w.Bi().f();
                        if (!m25.a.c() || m25.a.b()) {
                            if (f17 > 0) {
                                c21549x15041e54.a0(0);
                                int b17 = com.p314xaae8f345.mm.ui.p2740x696c9db.pd.b(context, f17);
                                c21549x15041e54.V = "" + f17;
                                c21549x15041e54.W = b17;
                                com.p314xaae8f345.mm.ui.p2731xc84c5534.e0.c(f17);
                            } else {
                                c21549x15041e54.a0(8);
                                c21549x15041e54.V = "";
                                c21549x15041e54.W = -1;
                            }
                        } else if (f17 > 0) {
                            c21549x15041e54.c0(0);
                            com.p314xaae8f345.mm.ui.p2731xc84c5534.e0.c(f17);
                        } else {
                            c21549x15041e54.c0(8);
                        }
                        r5 = 1;
                    } else {
                        c21357x5e7365bb.f278189w.m("find_friends_by_near", true);
                        if (!c21357x5e7365bb.Q0()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(953L, 5L, 1L);
                        }
                    }
                }
            }
        }
        if (r5 != 0) {
            this.S++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x03f0, code lost:
    
        if (r3 != 23) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x03f3, code lost:
    
        r7 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z0(r45.f03 r30, com.p314xaae8f345.mm.ui.C21363x65d29512 r31, boolean r32, boolean r33, boolean r34, r45.f03 r35) {
        /*
            Method dump skipped, instructions count: 1274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.C21357x5e7365bb.z0(r45.f03, com.tencent.mm.ui.FinderIconViewTipPreference, boolean, boolean, boolean, r45.f03):void");
    }

    public final void z1() {
        if (t1()) {
            this.f278189w.m("find_friends_by_search", true);
            if (Q0()) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(953L, 4L, 1L);
            return;
        }
        this.S++;
        this.f278189w.m("find_friends_by_search", false);
        try {
            ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
            org.json.JSONObject d17 = su4.o2.d("discoverSearchEntry");
            java.lang.String optString = d17.optString("wording");
            d17.optString("androidIcon");
            com.p314xaae8f345.mm.ui.p2746xf1c361fc.C22594xcb88ef3a c22594xcb88ef3a = (com.p314xaae8f345.mm.ui.p2746xf1c361fc.C22594xcb88ef3a) this.f278189w.h("find_friends_by_search");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                c22594xcb88ef3a.L(m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572774cg4));
            } else {
                c22594xcb88ef3a.L(optString);
            }
            c22594xcb88ef3a.n0(this.f278189w);
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().k(c22594xcb88ef3a);
            k70.f0 f0Var = this.C1;
            com.p314xaae8f345.mm.ui.y5 y5Var = new com.p314xaae8f345.mm.ui.y5(this);
            c22594xcb88ef3a.f233893d2 = f0Var;
            c22594xcb88ef3a.f233894e2 = y5Var;
            c22594xcb88ef3a.h0();
            ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
            if (!ug0.q.f509005n) {
                B0(c22594xcb88ef3a, null, false, null, null, false, null, null);
                su4.g3 g3Var = su4.g3.f494435d;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.u4(this, c22594xcb88ef3a, g3Var.f494436a));
                if (com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78442x336b58a0() == 2) {
                    g3Var.a(1);
                    return;
                }
                return;
            }
            bm5.p1 p1Var = this.f278197z1;
            if (!p1Var.c()) {
                tg0.w1 w1Var = (tg0.w1) i95.n0.c(tg0.w1.class);
                e75.a aVar = (e75.a) p1Var.b();
                sg0.u3 u3Var = (sg0.u3) w1Var;
                j75.f Ai = u3Var.Ai();
                j75.f fVar = null;
                if (Ai != null && (Ai.mo140437x75286adb() instanceof ug0.x)) {
                    fVar = u3Var.Ai();
                }
                fVar.m3(this, new sg0.t3(u3Var, aVar));
            }
            ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).Zi(new tg0.p2("FindMoreFriendsUI<updateSearchEntry>"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "updateSearchEntry, start observing WebSearchState.");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FindMoreFriendsUI", e17, "update search entry exception!", new java.lang.Object[0]);
        }
    }
}
