package e04;

/* loaded from: classes15.dex */
public class p implements com.p314xaae8f345.mm.p944x882e457a.u0, com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.n, e04.l {

    /* renamed from: J, reason: collision with root package name */
    public static final java.lang.String f327575J = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fye) + "/qr/";
    public static final java.lang.String K = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fye) + "/sjt/qr";
    public int A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public int E;
    public java.lang.String F;
    public wu5.c G;
    public java.util.TimerTask H;
    public boolean I;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f327576d;

    /* renamed from: e, reason: collision with root package name */
    public int f327577e;

    /* renamed from: f, reason: collision with root package name */
    public int f327578f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f327579g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f327580h;

    /* renamed from: i, reason: collision with root package name */
    public int f327581i;

    /* renamed from: m, reason: collision with root package name */
    public int f327582m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f327583n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f327584o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f327585p;

    /* renamed from: q, reason: collision with root package name */
    public int f327586q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f327587r;

    /* renamed from: s, reason: collision with root package name */
    public android.os.Bundle f327588s;

    /* renamed from: t, reason: collision with root package name */
    public r45.db0 f327589t;

    /* renamed from: u, reason: collision with root package name */
    public int f327590u;

    /* renamed from: v, reason: collision with root package name */
    public android.app.ProgressDialog f327591v;

    /* renamed from: w, reason: collision with root package name */
    public rz3.e f327592w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.s f327593x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.Map f327594y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f327595z;

    public p() {
        this.f327578f = 0;
        this.f327585p = false;
        this.f327586q = -1;
        this.f327587r = false;
        this.f327591v = null;
        this.f327592w = null;
        this.f327593x = null;
        this.f327594y = new java.util.HashMap();
        this.f327595z = null;
        this.G = null;
        this.H = null;
        this.I = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "onResume");
        gm0.j1.d().a(106, this);
        gm0.j1.d().a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d, this);
        gm0.j1.d().a(ma1.i.f72803x366c91de, this);
        gm0.j1.d().a(vb1.e.f77260x366c91de, this);
        gm0.j1.d().a(3512, this);
        gm0.j1.d().a(7424, this);
        gm0.j1.d().a(5900, this);
        gm0.j1.d().a(6277, this);
        gm0.j1.d().a(6963, this);
        this.f327578f = 0;
    }

    public static void c(e04.p pVar, com.p314xaae8f345.mm.p944x882e457a.m1 scene) {
        pVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        if (scene.mo808xfb85f7b0() == 233 || scene.mo808xfb85f7b0() == 106 || scene.mo808xfb85f7b0() == 1061) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "OfflineScan onCancelScene processOfflineScan: %b, offlineScanNetworkType: %d", java.lang.Boolean.valueOf(pVar.f327584o), java.lang.Integer.valueOf(pVar.f327586q));
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.j0 j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.j0.f240470a;
            java.lang.String str = pVar.f327579g;
            java.lang.String str2 = pVar.f327583n;
            int i17 = pVar.f327585p ? 2 : 1;
            boolean z17 = pVar.f327584o;
            j0Var.a(str, str2, i17, z17 ? pVar.f327586q : 3, z17 ? 1 : 0, pVar.f327595z);
        }
    }

    public static int i(int i17) {
        if (i17 == 30 || i17 == 37 || i17 == 38 || i17 == 40) {
            return 13;
        }
        if (i17 == 4 || i17 == 47) {
            return 12;
        }
        return i17 == 34 ? 24 : 0;
    }

    public static boolean p(int i17) {
        boolean z17;
        if (((h0.n) i95.n0.c(h0.n.class)) == null) {
            return false;
        }
        switch (i17) {
            case -200460:
            case -200459:
            case -200458:
            case -200457:
            case -200456:
            case -200455:
            case -200453:
            case -200452:
            case -200447:
            case -200446:
            case -200231:
            case -200224:
            case -200030:
                z17 = true;
                break;
            default:
                z17 = false;
                break;
        }
        return z17;
    }

    public static boolean y(int i17) {
        return i17 == 2 || i17 == 4;
    }

    public final void A(int i17) {
        if (j() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422) {
            int i18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422) j()).E1;
            if (i18 != 1) {
                i18 = 2;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.p(i17, 1, i18, ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422) j()).D1, ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422) j()).S);
        }
    }

    public final void B(int i17) {
        java.lang.String str;
        android.os.Bundle bundle = this.f327588s;
        if (bundle != null) {
            java.lang.String string = bundle.getString("stat_url");
            int i18 = this.A;
            if ((i18 == 6 || i18 == 0) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                java.lang.String str2 = "";
                if (string == null) {
                    string = "";
                }
                try {
                    str = java.net.URLEncoder.encode(string, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                    try {
                        java.lang.String str3 = this.f327579g;
                        if (str3 == null) {
                            str3 = "";
                        }
                        str2 = java.net.URLEncoder.encode(str3, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                    } catch (java.io.UnsupportedEncodingException e17) {
                        e = e17;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.QBarStringHandler", e, "", new java.lang.Object[0]);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13329, str, str2, java.lang.Integer.valueOf(i17));
                    }
                } catch (java.io.UnsupportedEncodingException e18) {
                    e = e18;
                    str = "";
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13329, str, str2, java.lang.Integer.valueOf(i17));
            }
        }
    }

    public final void C(android.app.Activity activity, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "search finder contact %s", str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        db2.u5 u5Var = new db2.u5(arrayList);
        ((java.util.HashMap) this.f327594y).put(u5Var, 1);
        gm0.j1.d().g(u5Var);
        this.f327591v = db5.e1.R(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_b), true, true, new e04.y(this, u5Var));
    }

    public void D(boolean z17) {
        if (!z17) {
            t(true, null);
            return;
        }
        rz3.e eVar = this.f327592w;
        if (eVar != null) {
            eVar.a(1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E(l90.l r12) {
        /*
            r11 = this;
            r0 = r12
            tg3.r1 r0 = (tg3.r1) r0
            boolean r0 = r0.f500748f
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.ref.WeakReference r0 = r11.f327576d
            if (r0 == 0) goto L14
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 != 0) goto L18
            return r1
        L18:
            tg3.r1 r12 = (tg3.r1) r12
            r45.iw5 r12 = r12.H()
            int r2 = r12.f458899q
            boolean r2 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.D3(r2)
            if (r2 == 0) goto Lbe
            r45.va0 r2 = r12.C
            if (r2 == 0) goto Lbe
            java.lang.String r2 = r2.f469555e
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r2)
            if (r2 != 0) goto Lbe
            r45.va0 r12 = r12.C
            java.lang.String r12 = r12.f469555e
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r12)
            r3 = 1
            if (r2 == 0) goto L3e
            goto L55
        L3e:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L55
            r2.<init>(r12)     // Catch: org.json.JSONException -> L55
            java.lang.String r12 = "BindWxaInfo"
            org.json.JSONObject r12 = r2.optJSONObject(r12)     // Catch: org.json.JSONException -> L55
            if (r12 == 0) goto L55
            java.lang.String r2 = "openWxaByBizQRCode"
            int r12 = r12.optInt(r2, r1)     // Catch: org.json.JSONException -> L55
            if (r12 <= 0) goto L55
            r12 = r3
            goto L56
        L55:
            r12 = r1
        L56:
            if (r12 == 0) goto Lbe
            int r12 = r11.E
            if (r12 <= 0) goto L5d
            goto L63
        L5d:
            int r12 = r11.f327577e
            int r12 = r11.z(r12)
        L63:
            java.lang.String r2 = r11.f327579g
            int r4 = r11.f327577e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r12 = new java.lang.Object[]{r2, r4, r12}
            java.lang.String r2 = "MicroMsg.QBarStringHandler"
            java.lang.String r4 = "getA8Key text:%s, mQBarStringSource: %s, sceneValue: %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r4, r12)
            java.lang.Class<w60.j> r12 = w60.j.class
            i95.m r12 = i95.n0.c(r12)
            w60.j r12 = (w60.j) r12
            java.lang.String r5 = r11.f327579g
            r6 = 0
            r7 = 43
            r8 = 0
            r9 = 0
            byte[] r10 = new byte[r1]
            r4 = r12
            v60.u r4 = (v60.u) r4
            w60.k r12 = r4.Ai(r5, r6, r7, r8, r9, r10)
            java.util.Map r1 = r11.f327594y
            r2 = r12
            com.tencent.mm.modelbase.m1 r2 = (com.p314xaae8f345.mm.p944x882e457a.m1) r2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r1 = (java.util.HashMap) r1
            r1.put(r2, r4)
            com.tencent.mm.modelbase.r1 r1 = gm0.j1.d()
            r1.g(r2)
            android.app.ProgressDialog r1 = r11.f327591v
            if (r1 == 0) goto Lae
            r1.dismiss()
        Lae:
            r1 = 2131773398(0x7f1047d6, float:1.9178182E38)
            java.lang.String r0 = r0.getString(r1)
            e04.p0 r1 = new e04.p0
            r1.<init>(r11, r12)
            r11.F(r0, r1)
            return r3
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e04.p.E(l90.l):boolean");
    }

    public final void F(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.r rVar) {
        if (this.f327593x == null || !this.f327587r) {
            G(str, rVar);
            return;
        }
        e();
        this.H = new e04.o2(this.f327593x, new e04.a0(this), rVar);
        this.G = ((ku5.t0) ku5.t0.f394148d).k(this.H, 500L);
    }

    public final void G(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.r rVar) {
        android.app.ProgressDialog progressDialog = this.f327591v;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        java.lang.ref.WeakReference weakReference = this.f327576d;
        android.content.Context context = weakReference != null ? (android.content.Context) weakReference.get() : null;
        if (context == null) {
            return;
        }
        this.f327591v = db5.e1.Q(context, "", str, true, true, new e04.m0(this, rVar));
    }

    public final void a(android.app.Activity activity, int i17, java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "start search contact %s", str);
        l90.k kVar = (l90.k) i95.n0.c(l90.k.class);
        int i18 = y(i17) ? 2 : 1;
        ((k90.l) kVar).getClass();
        tg3.r1 r1Var = new tg3.r1(str, i18, 5, z17);
        ((java.util.HashMap) this.f327594y).put(r1Var, 1);
        gm0.j1.d().g(r1Var);
        e04.w wVar = new e04.w(this, r1Var);
        if (activity != null) {
            if (!z17 || !this.I) {
                F(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_b), wVar);
                return;
            }
            java.lang.String string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_b);
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.s sVar = this.f327593x;
            if (sVar == null || !this.f327587r) {
                G(string, wVar);
            } else {
                this.I = true;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422) sVar).u7(true, false, wVar);
            }
        }
    }

    public final void b(android.app.Activity activity, java.lang.String str, w60.k kVar) {
        r45.bx5 bx5Var;
        int i17 = kVar != null ? ((r45.r83) ((com.p314xaae8f345.mm.p957x53236a1b.k0) kVar).f152889e.f152243a.f152217a).f466151o : 0;
        r45.db0 db0Var = this.f327589t;
        int i18 = (db0Var == null || (bx5Var = db0Var.f453814d) == null) ? 0 : bx5Var.f452665d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "start search contact %s, searchOpenIMContactScene: %d, getA8KeyScene: %s", str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        ab0.b0 b0Var = (ab0.b0) i95.n0.c(ab0.b0.class);
        r45.db0 db0Var2 = this.f327589t;
        r45.bx5 bx5Var2 = db0Var2 != null ? db0Var2.f453814d : null;
        ((za0.k) b0Var).getClass();
        l41.e0 e0Var = new l41.e0(str, false, i18, i17, bx5Var2);
        ((java.util.HashMap) this.f327594y).put(e0Var, 1);
        gm0.j1.d().g(e0Var);
        e04.x xVar = new e04.x(this, e0Var);
        if (activity != null) {
            if (!this.I) {
                F(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_b), xVar);
                return;
            }
            java.lang.String string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_b);
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.s sVar = this.f327593x;
            if (sVar == null || !this.f327587r) {
                G(string, xVar);
            } else {
                this.I = true;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422) sVar).u7(true, false, xVar);
            }
        }
    }

    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "cancel Deal");
        this.f327579g = null;
        java.lang.ref.WeakReference weakReference = this.f327576d;
        if (weakReference != null) {
            weakReference.clear();
            this.f327576d = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "onPause");
        gm0.j1.d().q(106, this);
        gm0.j1.d().q(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d, this);
        gm0.j1.d().q(ma1.i.f72803x366c91de, this);
        gm0.j1.d().q(vb1.e.f77260x366c91de, this);
        gm0.j1.d().q(3512, this);
        gm0.j1.d().q(7424, this);
        gm0.j1.d().q(5900, this);
        gm0.j1.d().q(6277, this);
        gm0.j1.d().q(6963, this);
    }

    public final void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "cancelLoading");
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.s sVar = this.f327593x;
        if (sVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422) sVar).u7(false, false, null);
        }
        android.app.ProgressDialog progressDialog = this.f327591v;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f327591v.dismiss();
        }
        wu5.c cVar = this.G;
        if (cVar != null) {
            cVar.cancel(false);
        }
        java.util.TimerTask timerTask = this.H;
        if (timerTask != null) {
            timerTask.cancel();
        }
    }

    public final void f(android.app.Activity activity, java.lang.String str, int i17, int i18, int i19, java.lang.String str2, boolean z17, int i27) {
        int i28;
        java.lang.String str3;
        int i29;
        int i37;
        int i38;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "continue get a8key");
        if (i19 > 0) {
            i28 = i19;
        } else {
            i28 = this.E;
            if (i28 <= 0) {
                i28 = z(this.f327577e);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "getA8Key text:%s, mQBarStringSource: %s, sceneValue: %s", str, java.lang.Integer.valueOf(this.f327577e), java.lang.Integer.valueOf(i28));
        android.os.Bundle bundle = this.f327588s;
        int i39 = 0;
        if (bundle != null) {
            int i47 = bundle.getInt("stat_geta8key_msg_scene", 0);
            java.lang.String string = this.f327588s.getString("stat_send_msg_user");
            java.lang.String string2 = this.f327588s.getString("stat_msg_id");
            int i48 = this.f327588s.getInt("stat_scene", 0);
            java.lang.String string3 = this.f327588s.getString("stat_scene_note");
            java.lang.String string4 = this.f327588s.getString("weapp_username");
            java.lang.String replace = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2) ? string2.replace("msg_", "").replace("sns_", "") : "";
            java.lang.String string5 = this.f327588s.getString("stat_chat_talker_username");
            java.lang.String string6 = this.f327588s.getString("wxappPathWithQuery");
            java.lang.String string7 = this.f327588s.getString("stat_url");
            if (str2 == null) {
                str11 = string7;
                str12 = this.f327588s.getString("stat_app_id");
            } else {
                str11 = string7;
                str12 = str2;
            }
            str7 = string4;
            i39 = 0;
            str8 = string;
            str9 = replace;
            i38 = i48;
            str10 = string3;
            i29 = i47;
            str4 = string5;
            str6 = string6;
            str5 = str11;
            i37 = this.f327588s.getInt("geta8key_init_request_id", 0);
            str3 = str12;
        } else {
            str3 = str2;
            i29 = 0;
            i37 = 0;
            i38 = 0;
            str4 = "";
            str5 = str4;
            str6 = str5;
            str7 = str6;
            str8 = str7;
            str9 = str8;
            str10 = str9;
        }
        byte[] bArr = new byte[i39];
        ((v60.u) ((w60.j) i95.n0.c(w60.j.class))).getClass();
        com.p314xaae8f345.mm.p957x53236a1b.k0 k0Var = new com.p314xaae8f345.mm.p957x53236a1b.k0(str, i39);
        com.p314xaae8f345.mm.p944x882e457a.o oVar = k0Var.f152889e;
        r45.r83 r83Var = (r45.r83) oVar.f152243a.f152217a;
        r83Var.f466143d = 2;
        r45.du5 du5Var = new r45.du5();
        du5Var.f454289d = str;
        du5Var.f454290e = true;
        r83Var.f466148i = du5Var;
        r83Var.f466151o = i28;
        r83Var.f466152p = str4;
        r83Var.G = str8;
        r83Var.H = str9;
        r83Var.f466155s = 0;
        r83Var.f466159w = i17;
        r83Var.f466160x = i18;
        r83Var.f466161y = i27;
        r45.du5 du5Var2 = new r45.du5();
        du5Var2.f454289d = str3;
        du5Var2.f454290e = true;
        r83Var.f466145f = du5Var2;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bArr);
        r83Var.B = cu5Var;
        r45.j83 j83Var = new r45.j83();
        j83Var.f459174g = i29;
        j83Var.f459176i = i38;
        j83Var.f459177m = str10;
        j83Var.f459175h = str7 != null ? str7 : "";
        try {
            r83Var.M = x51.j1.a(j83Var.mo14344x5f01b1f6());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneGetA8Key", e17, "GetA8KeyClientParam byteArrayToSKBuffer", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(bArr);
        int a17 = com.p314xaae8f345.mm.ui.i2.a(this.f327577e);
        ((r45.r83) oVar.f152243a.f152217a).D = a17;
        if (str5 != null && str5.startsWith("http")) {
            ((r45.r83) oVar.f152243a.f152217a).C = str5;
        }
        com.p314xaae8f345.mm.p944x882e457a.m mVar = oVar.f152243a;
        ((r45.r83) mVar.f152217a).I = str6;
        if (i37 != 0) {
            r45.j83 j83Var2 = new r45.j83();
            j83Var2.f459173f = i37;
            try {
                ((r45.r83) mVar.f152217a).M = x51.j1.a(j83Var2.mo14344x5f01b1f6());
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneGetA8Key", e18, "GetA8KeyClientParam byteArrayToSKBuffer", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "getA8Key currentUrl:%s, qBarScene: %d, wxaPathWithQuery: %s, appId=%s, initReqId=%d", str5, java.lang.Integer.valueOf(a17), str6, str3, java.lang.Integer.valueOf(i37));
        ((java.util.HashMap) this.f327594y).put(k0Var, 1);
        gm0.j1.d().g(k0Var);
        android.app.ProgressDialog progressDialog = this.f327591v;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        F(activity != null ? activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hq_) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hq_), new e04.g0(this, k0Var));
        if (i19 == 4 || i19 == 34) {
            pz3.c.f440715a.b(str, i19, null);
        } else if (i19 != 0) {
            pz3.c cVar = pz3.c.f440715a;
            r45.db0 db0Var = this.f327589t;
            cVar.b(str, i19, db0Var != null ? db0Var.f453814d : null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v63, types: [nr4.a, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v65 */
    public void g(android.app.Activity context, java.lang.String str, int i17, int i18, int i19, java.lang.String str2, int i27, int i28, rz3.e eVar, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.s sVar, android.os.Bundle bundle, boolean z17, int i29, boolean z18, com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab c25309x51dbc9ab, r45.db0 db0Var) {
        java.lang.String str3;
        int i37;
        android.content.Context context2;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        int i38;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.String str14;
        java.lang.String str15;
        java.lang.String str16;
        boolean z19;
        java.lang.String str17;
        ?? r27;
        int i39;
        int i47;
        int i48;
        java.lang.String str18;
        int i49;
        android.os.Bundle bundle2;
        boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str19 = str == null ? "" : str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "[handleCode-dealQBarString] info ： dealQBarString %s, scanUIScene: %d, source:%d, codeType: %s, codeVersion: %s, getA8KeyScene: %d, processOfflineScan: %b, networkStatus: %d, isFromScanUI: %b", str19, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2, java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(gm0.j1.d().n()), java.lang.Boolean.valueOf(z18));
        this.f327576d = new java.lang.ref.WeakReference(context);
        this.f327577e = i18;
        this.f327578f = i17;
        this.f327579g = str19;
        this.f327581i = i27;
        this.f327582m = i28;
        this.f327583n = str2;
        this.f327592w = eVar;
        this.f327588s = bundle;
        this.f327589t = db0Var;
        this.f327584o = z17;
        this.f327587r = z18;
        this.f327585p = i18 == 1;
        this.f327586q = i29;
        this.f327593x = sVar;
        java.lang.String string = bundle != null ? bundle.getString("stat_url", "") : "";
        if (android.text.TextUtils.isEmpty(str19)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QBarStringHandler", "qbarString is empty");
        }
        android.content.Context context3 = (android.content.Context) this.f327576d.get();
        int n17 = gm0.j1.d().n();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.j0 j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.j0.f240470a;
        if (n17 == 0) {
            boolean m40080x23b734ff = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(context3);
            if (this.f327592w != null) {
                if (q(str19)) {
                    bundle2 = new android.os.Bundle();
                    i39 = 0;
                    bundle2.putBoolean("key_offline_scan_show_tips", false);
                } else {
                    i39 = 0;
                    bundle2 = null;
                }
                this.f327592w.a(i39, bundle2);
                this.f327592w.a(6, bundle2);
            } else {
                i39 = 0;
            }
            int i57 = m40080x23b734ff ? 2 : 1;
            boolean z28 = this.f327584o;
            if (z28 || !z18) {
                int i58 = i39;
                if (z28 && z18) {
                    java.lang.String showMsg = context3.getString(m40080x23b734ff ? com.p314xaae8f345.mm.R.C30867xcad56011.i_t : com.p314xaae8f345.mm.R.C30867xcad56011.i_w);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(showMsg, "showMsg");
                    db5.e1.y(context, showMsg, "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571988vj), null);
                    i47 = i58;
                } else {
                    dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572033wu), i58 == true ? 1 : 0).show();
                    i47 = i58;
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QBarStringHandler", "dealQBarString network unavailable and deal with offline, isConnected: %b", java.lang.Boolean.valueOf(m40080x23b734ff));
                if (q(str19)) {
                    i48 = i39;
                    str18 = str19;
                    i49 = 1;
                } else {
                    boolean z29 = i39;
                    i49 = 1;
                    str18 = str19;
                    e04.o.f327567a.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17277xe9e90aaf(this.f327595z, context, i57, str18, i18, i27, i28, this.f327583n, this.f327585p, bundle), context3.getString(m40080x23b734ff ? com.p314xaae8f345.mm.R.C30867xcad56011.i_t : com.p314xaae8f345.mm.R.C30867xcad56011.i_w), z29);
                    i48 = z29;
                }
                java.lang.String str20 = this.f327583n;
                if (this.f327585p) {
                    i49 = 2;
                }
                j0Var.a(str18, str20, i49, i57, 0, this.f327595z);
                i47 = i48;
            }
            A(i47);
            return;
        }
        if (str19.startsWith("weixin://qr/")) {
            str3 = str19.substring(12) + "@qr";
        } else {
            str3 = "";
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            a(context, i18, str3, false);
            A(0);
            return;
        }
        if (q(str19)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "dealQBarString isPayCode and report");
            if (!z17 && z18) {
                j0Var.a(str19, this.f327583n, this.f327585p ? 2 : 1, 4, 0, this.f327595z);
            }
        }
        int a17 = o45.cg.a();
        this.f327590u = a17;
        if (i19 > 0) {
            i37 = i19;
        } else {
            i37 = this.E;
            if (i37 <= 0) {
                i37 = z(this.f327577e);
            }
        }
        java.lang.String str21 = string;
        nz3.c.a(new oz3.e(i37, a17, str19, i27, i18, db0Var != null ? db0Var.f453815e : null, c25309x51dbc9ab, oz3.f.f431798e));
        java.lang.String str22 = str19;
        if (str22.startsWith("weixin://wxpay/bizpayurl")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "do native pay");
            rz3.e eVar2 = this.f327592w;
            if (eVar2 != null) {
                eVar2.a(5, null);
            }
            int z37 = z(this.f327577e);
            int i59 = i(z37);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5834xa4df3853 c5834xa4df3853 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5834xa4df3853();
            am.bo boVar = c5834xa4df3853.f136141g;
            boVar.f87798a = str22;
            boVar.f87800c = i59;
            boVar.f87799b = z37;
            boVar.f87801d = context3;
            if (bundle != null) {
                java.lang.String string2 = bundle.getString("stat_chat_talker_username");
                java.lang.String string3 = bundle.getString("stat_send_msg_user");
                jz5.l b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.v0.b(this.E, string2, string3);
                boVar.f87802e = ((java.lang.Integer) b17.f384366d).intValue();
                boVar.f87803f = ((java.lang.Integer) b17.f384367e).intValue();
                boVar.f87804g = bundle.getInt("pay_qrcode_session_type", 0);
                boVar.f87805h = bundle.getString("pay_qrcode_session_name");
                boVar.f87806i = bundle.getString("pay_qrcode_timeline_objid");
                boVar.f87807j = string3;
                boVar.f87808k = bundle.getString("stat_msg_id");
                java.lang.String string4 = bundle.getString("payInitRawUrl");
                long j17 = bundle.getLong("payInitTimestamp", 0L);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string4)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "PayAuthNativeEvent initRawUrl is empty, use qbarString as fallback");
                    string4 = str22;
                }
                if (j17 == 0) {
                    j17 = c01.id.a() / 1000;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "PayAuthNativeEvent initTimestamp is 0, use current timestamp as fallback");
                }
                boVar.f87809l = string4;
                boVar.f87810m = j17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "PayAuthNativeEvent set initRawUrl: " + string4 + ", initTimestamp: " + j17);
            } else {
                boVar.f87809l = str22;
                boVar.f87810m = c01.id.a() / 1000;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "PayAuthNativeEvent statObj is null, use qbarString and current timestamp");
            }
            c5834xa4df3853.f273897d = new e04.q0(this, context3, c5834xa4df3853);
            c5834xa4df3853.b(android.os.Looper.myLooper());
            if (!((h45.q) i95.n0.c(h45.q.class)).mo24754xf742bfee()) {
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50297x7c4d7ca2(new e04.r0(this, c5834xa4df3853), com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
            }
            B(11);
            A(11);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16472, 2, str22, str21);
            return;
        }
        if (str22.startsWith("weixin://wxpay/pcpayurl")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "[do UniPcPay]");
            rz3.e eVar3 = this.f327592w;
            if (eVar3 != null) {
                eVar3.a(5, null);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6185x2d8542e8 c6185x2d8542e8 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6185x2d8542e8();
            am.pz pzVar = c6185x2d8542e8.f136443g;
            pzVar.f89205a = str22;
            pzVar.f89206b = 12;
            pzVar.f89207c = 88;
            if (bundle != null) {
                java.lang.String string5 = bundle.getString("stat_chat_talker_username");
                java.lang.String string6 = bundle.getString("stat_send_msg_user");
                jz5.l b18 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.v0.b(this.E, string5, string6);
                pzVar.f89208d = bundle.getInt("pay_qrcode_session_type");
                pzVar.f89209e = bundle.getString("pay_qrcode_session_name");
                pzVar.f89210f = string6;
                pzVar.f89211g = bundle.getString("pay_qrcode_timeline_objid");
                pzVar.f89212h = ((java.lang.Integer) b18.f384366d).intValue();
                pzVar.f89213i = ((java.lang.Integer) b18.f384367e).intValue();
                pzVar.f89214j = bundle.getString("stat_msg_id");
            }
            pzVar.f89215k = new java.lang.ref.WeakReference(context3);
            pzVar.f89216l = new e04.s0(this, c6185x2d8542e8);
            c6185x2d8542e8.e();
            return;
        }
        if (str22.startsWith("https://wx.tenpay.com/f2f")) {
            context2 = context3;
            str4 = "MicroMsg.QBarStringHandler";
            str5 = "payInitRawUrl";
            str6 = "pay_qrcode_sender_username";
            str7 = "stat_msg_id";
            str8 = str21;
            str9 = "payInitTimestamp";
            str10 = str22;
        } else {
            if (!str22.startsWith("wxp://f2f")) {
                if (str22.startsWith("wxp://wbf2f")) {
                    rz3.e eVar4 = this.f327592w;
                    if (eVar4 != null) {
                        r27 = 0;
                        eVar4.a(5, null);
                    } else {
                        r27 = 0;
                    }
                    int i66 = i(z(this.f327577e));
                    ((ng0.q) ((og0.o) i95.n0.c(og0.o.class))).getClass();
                    h45.a0.i(context3, 6, str22, i66, r27);
                    t(true, r27);
                    B(11);
                    A(11);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16472, 3, str22, str21);
                    return;
                }
                if (i27 == 22 && str22.startsWith("m")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "go to reward");
                    rz3.e eVar5 = this.f327592w;
                    if (eVar5 != null) {
                        eVar5.a(5, null);
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.DiscoveryScanPayReward.k(context3, new e04.u0(this))) {
                        A(0);
                        return;
                    }
                    int i67 = i(z(this.f327577e));
                    int i68 = this.E;
                    int i69 = i68 == 37 ? 2 : i68 == 38 ? 3 : i68 == 40 ? 4 : 1;
                    android.os.Bundle bundle3 = new android.os.Bundle();
                    if (bundle != null) {
                        jz5.l b19 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.v0.b(this.E, bundle.getString("stat_chat_talker_username"), bundle.getString("stat_send_msg_user"));
                        bundle3.putInt("key_chat_type", ((java.lang.Integer) b19.f384366d).intValue());
                        bundle3.putInt("key_send_type", ((java.lang.Integer) b19.f384367e).intValue());
                    }
                    ((ng0.q) ((og0.o) i95.n0.c(og0.o.class))).Ni(context3, str22, i67, str21, i69, bundle3);
                    t(true, null);
                    B(11);
                    A(11);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16472, 6, str22, str21);
                    return;
                }
                if (str22.startsWith(f327575J) || str22.startsWith("https://payapp.wechatpay.cn/qr/")) {
                    rz3.e eVar6 = this.f327592w;
                    if (eVar6 != null) {
                        eVar6.a(5, null);
                    }
                    int i76 = i(z(this.f327577e));
                    ((ng0.q) ((og0.o) i95.n0.c(og0.o.class))).getClass();
                    h45.a0.i(context3, 1, str22, i76, null);
                    t(true, null);
                    B(11);
                    A(11);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16472, 5, str22, str21);
                    if (c25309x51dbc9ab == null || c25309x51dbc9ab.f296781m) {
                        return;
                    }
                    ((ku5.t0) ku5.t0.f394148d).g(new zs5.o0(c25309x51dbc9ab, str22));
                    return;
                }
                if (str22.startsWith(K) || str22.startsWith("https://payapp.wechatpay.cn/sjt/qr/")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "merchant pay");
                    rz3.e eVar7 = this.f327592w;
                    if (eVar7 != null) {
                        eVar7.a(5, null);
                    }
                    int i77 = i(z(this.f327577e));
                    android.os.Bundle bundle4 = new android.os.Bundle();
                    bundle4.putString("qrcodeUrl", str22);
                    if (bundle != null) {
                        jz5.l b27 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.v0.b(this.E, bundle.getString("stat_chat_talker_username"), bundle.getString("stat_send_msg_user"));
                        bundle4.putInt("chat_type", ((java.lang.Integer) b27.f384366d).intValue());
                        bundle4.putInt("send_type", ((java.lang.Integer) b27.f384367e).intValue());
                        bundle4.putInt("qrcodeSessionType", bundle.getInt("pay_qrcode_session_type", 0));
                        if (bundle.getInt("pay_qrcode_session_type", 0) == 2) {
                            bundle4.putString("qrcodeSessionName", bundle.getString("pay_qrcode_session_name"));
                        } else {
                            gm0.j1.i();
                            bundle4.putString("qrcodeSessionName", (java.lang.String) gm0.j1.u().c().l(2, null));
                        }
                        bundle4.putString("qrcodeTimelineObjId", bundle.getString("pay_qrcode_timeline_objid"));
                        bundle4.putString("msg_svr_id", bundle.getString("stat_msg_id"));
                        bundle4.putString("qrcode_sender_username", bundle.getString("pay_qrcode_sender_username"));
                        str16 = "payInitRawUrl";
                        java.lang.String string7 = bundle.getString(str16);
                        str15 = "payInitTimestamp";
                        long j18 = bundle.getLong(str15, 0L);
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string7)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "startMerchantPay initRawUrl is empty, use qbarString as fallback");
                        } else {
                            str22 = string7;
                        }
                        if (j18 == 0) {
                            j18 = c01.id.a() / 1000;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "startMerchantPay initTimestamp is 0, use current timestamp as fallback");
                        }
                        if (str22 == null) {
                            str22 = "";
                        }
                        bundle4.putString(str16, str22);
                        bundle4.putLong(str15, j18);
                    } else {
                        str15 = "payInitTimestamp";
                        str16 = "payInitRawUrl";
                        bundle4.putString(str16, str22);
                        bundle4.putLong(str15, c01.id.a() / 1000);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "startMerchantPay initRawUrl: %s, initTimestamp: %d", bundle4.getString(str16, ""), java.lang.Long.valueOf(bundle4.getLong(str15, 0L)));
                    ((ng0.q) ((og0.o) i95.n0.c(og0.o.class))).getClass();
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 7);
                    intent.putExtra("pay_channel", i77);
                    intent.putExtra("ScanScene", i19);
                    intent.putExtras(bundle4);
                    j45.l.j(context3, "remittance", ".ui.RemittanceAdapterUI", intent, null);
                    t(true, null);
                    A(0);
                    return;
                }
                if (i27 == 22 && str22.startsWith("n")) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.DiscoveryScanPayReward.k(context3, new e04.v0(this))) {
                        rz3.e eVar8 = this.f327592w;
                        if (eVar8 != null) {
                            eVar8.a(5, null);
                        }
                        A(0);
                        return;
                    }
                    rz3.e eVar9 = this.f327592w;
                    if (eVar9 != null) {
                        eVar9.a(5, null);
                    }
                    int z38 = z(this.f327577e);
                    int i78 = i(z38);
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5967xa7660a29 c5967xa7660a29 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5967xa7660a29();
                    am.us usVar = c5967xa7660a29.f136264g;
                    usVar.f89663a = str22;
                    usVar.f89664b = z38;
                    usVar.f89665c = 1;
                    usVar.f89666d = new java.lang.ref.WeakReference(context3);
                    c5967xa7660a29.f136264g.f89667e = new e04.w0(this, c5967xa7660a29, context3, i78, str21, z38);
                    c5967xa7660a29.e();
                    B(11);
                    A(11);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16472, 7, str22, str21);
                    return;
                }
                if (str22.startsWith("weixin://wxpay/bindurl")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "fast bind card qrcode");
                    rz3.e eVar10 = this.f327592w;
                    if (eVar10 != null) {
                        eVar10.a(5, null);
                    }
                    ((h45.q) i95.n0.c(h45.q.class)).mo24802xdd1fdf9c(str22, i(z(this.f327577e)), new e04.q(this));
                    A(0);
                    return;
                }
                if (str22.startsWith("weixin://rtos_authcode")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "rtos watch prefix");
                    rz3.e eVar11 = this.f327592w;
                    if (eVar11 != null) {
                        eVar11.a(5, null);
                    }
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                    java.lang.String i79 = com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().j(gm0.j1.b().k(), false), false);
                    android.net.Uri parse = android.net.Uri.parse(this.f327579g);
                    java.lang.String queryParameter = parse.getQueryParameter(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52914x1ed75ebb);
                    java.lang.String queryParameter2 = parse.getQueryParameter("nat");
                    java.lang.String queryParameter3 = parse.getQueryParameter("js");
                    java.lang.String queryParameter4 = parse.getQueryParameter("type");
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("avatar", i79);
                    intent2.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52914x1ed75ebb, queryParameter);
                    if (queryParameter2 != null) {
                        intent2.putExtra("native_ver", queryParameter2);
                    }
                    if (queryParameter3 != null) {
                        intent2.putExtra("jsapp_ver", queryParameter3);
                    }
                    if (queryParameter4 != null) {
                        intent2.putExtra("channel_type", queryParameter4);
                    }
                    j45.l.j(context3, "exdevice", "com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI", intent2, null);
                    D(false);
                    A(0);
                    return;
                }
                java.lang.String str23 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                if (z65.c.a() && str22.startsWith("nirvana://")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "hy: debug enter scan nirvana url, content: %s", str22);
                    e();
                    dp.a.m125854x26a183b(context3, str22, 1).show();
                    ((g10.v) ((c00.i4) i95.n0.c(c00.i4.class))).Ri(str22);
                    D(false);
                    return;
                }
                if (z65.c.a() && str22.startsWith("weixin://template")) {
                    o(context3, str22);
                    return;
                }
                if (!str22.startsWith("wedropf2fhb://")) {
                    if (!str22.startsWith("wxhb://f2f")) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17260xffb9d775 c17260xffb9d775 = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17260xffb9d775();
                        c17260xffb9d775.f240149g = str22;
                        c17260xffb9d775.f240150h = i27;
                        c17260xffb9d775.f240151i = i28;
                        c17260xffb9d775.e();
                        if (l(str22, i19, this.f327577e)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "WPHK handle HK wallet CGP url");
                            return;
                        }
                        f(context, str22, i27, i28, i19, this.D, z17, a17);
                        rz3.e eVar12 = this.f327592w;
                        if (eVar12 != null) {
                            eVar12.a(5, null);
                            return;
                        }
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "scan f2f hb url");
                    if (i27 != 19) {
                        A(0);
                        return;
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.DiscoveryScanFace2Face.k(context3, new e04.u(this))) {
                        rz3.e eVar13 = this.f327592w;
                        if (eVar13 != null) {
                            eVar13.a(5, null);
                        }
                        A(0);
                        return;
                    }
                    rz3.e eVar14 = this.f327592w;
                    if (eVar14 != null) {
                        eVar14.a(5, null);
                    }
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.putExtra("key_share_url", str22);
                    j45.l.n(context3, "luckymoney", ".f2f.ui.LuckyMoneyF2FReceiveUI", intent3, 1001);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16472, 4, str22, str21);
                    B(11);
                    A(11);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "scan f2f hongbao 2026, open liteapp");
                rz3.e eVar15 = this.f327592w;
                if (eVar15 != null) {
                    eVar15.a(5, null);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.l("scan_red_packet_code_handler");
                if (i19 == 4) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "scan f2f hongbao 2026, from scan, open liteapp");
                    try {
                        kd0.r2 r2Var = (kd0.r2) i95.n0.c(kd0.r2.class);
                        str17 = "url=" + java.net.URLEncoder.encode(str22, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c) + "&scan_entrance=" + com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240459g + "&face2face_status=" + (r2Var != null ? ((yz3.m) r2Var).wi() : 0);
                    } catch (java.io.UnsupportedEncodingException unused) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QBarStringHandler", "encode query fail, content: %s", str22);
                        str17 = "";
                    }
                    android.os.Bundle bundle5 = new android.os.Bundle();
                    bundle5.putString("appId", "wxalite70ed975435b06b901f7fcb14ef1a3f57@pay");
                    bundle5.putString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f, "pages/redirect-entry/index");
                    bundle5.putString("query", str17);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
                    sVar2.f225700d = new e04.r(this, context3);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "startLiteApp, appId = %s, path = %s, query = %s", "wxalite70ed975435b06b901f7fcb14ef1a3f57@pay", "pages/redirect-entry/index", str17);
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(context3, bundle5, true, false, sVar2, new e04.s(this));
                    z19 = false;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "scan f2f hongbao 2026, not from scan, show error , getA8KeyScene = %s", java.lang.Integer.valueOf(i19));
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                    u1Var.g(j().getString(com.p314xaae8f345.mm.R.C30867xcad56011.njg));
                    u1Var.n(j().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
                    u1Var.l(new e04.t(this));
                    z19 = false;
                    u1Var.q(false);
                }
                D(z19);
                return;
            }
            context2 = context3;
            str4 = "MicroMsg.QBarStringHandler";
            str10 = str22;
            str5 = "payInitRawUrl";
            str6 = "pay_qrcode_sender_username";
            str7 = "stat_msg_id";
            str8 = str21;
            str9 = "payInitTimestamp";
        }
        rz3.e eVar16 = this.f327592w;
        java.lang.String str24 = str4;
        java.lang.String str25 = str9;
        if (eVar16 != null) {
            eVar16.a(5, null);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.DiscoveryScanPayCode.k(context2, new e04.t0(this))) {
            A(0);
            return;
        }
        int i86 = i(z(this.f327577e));
        android.os.Bundle bundle6 = new android.os.Bundle();
        if (bundle != null) {
            java.lang.String string8 = bundle.getString("stat_chat_talker_username");
            java.lang.String string9 = bundle.getString("stat_send_msg_user");
            i38 = i86;
            jz5.l b28 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.v0.b(this.E, string8, string9);
            bundle6.putInt("chat_type", ((java.lang.Integer) b28.f384366d).intValue());
            bundle6.putInt("send_type", ((java.lang.Integer) b28.f384367e).intValue());
            bundle6.putString("qrcode_sender_username", bundle.getString(str6));
            bundle6.putString("msg_svr_id", bundle.getString(str7));
            bundle6.putInt("qrcodeSessionType", bundle.getInt("pay_qrcode_session_type", 0));
            if (bundle.getInt("pay_qrcode_session_type", 0) == 2) {
                bundle6.putString("qrcodeSessionName", bundle.getString("pay_qrcode_session_name"));
            } else {
                gm0.j1.i();
                bundle6.putString("qrcodeSessionName", (java.lang.String) gm0.j1.u().c().l(2, null));
            }
            bundle6.putString("stat_send_msg_user", string9);
            java.lang.String string10 = bundle.getString(str5);
            str11 = str25;
            long j19 = bundle.getLong(str11, 0L);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string10)) {
                str13 = str24;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str13, "startF2FPay initRawUrl is empty, use qbarString as fallback");
                str14 = str10;
            } else {
                str13 = str24;
                str14 = string10;
            }
            if (j19 == 0) {
                j19 = c01.id.a() / 1000;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str13, "startF2FPay initTimestamp is 0, use current timestamp as fallback");
            }
            if (str14 == null) {
                str14 = "";
            }
            bundle6.putString(str5, str14);
            bundle6.putLong(str11, j19);
            str12 = str10;
        } else {
            str11 = str25;
            i38 = i86;
            str12 = str10;
            str13 = str24;
            bundle6.putString(str5, str12);
            bundle6.putLong(str11, c01.id.a() / 1000);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str13, "startF2FPay initRawUrl: %s, initTimestamp: %d", bundle6.getString(str5, ""), java.lang.Long.valueOf(bundle6.getLong(str11, 0L)));
        ((ng0.q) ((og0.o) i95.n0.c(og0.o.class))).getClass();
        h45.a0.j(context2, 1, str12, i38, null, bundle6);
        t(true, null);
        B(11);
        A(11);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16472, 1, str12, str8);
        if (c25309x51dbc9ab == null || c25309x51dbc9ab.f296781m) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new zs5.o0(c25309x51dbc9ab, str12));
    }

    public void h(android.app.Activity activity, java.lang.String str, int i17, java.lang.String str2, int i18, int i19, rz3.e eVar, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.s sVar, android.os.Bundle bundle, boolean z17, int i27, boolean z18) {
        g(activity, str, 0, i17, z(i17), str2, i18, i19, eVar, sVar, bundle, z17, i27, z18, null, null);
    }

    public android.content.Context j() {
        java.lang.ref.WeakReference weakReference = this.f327576d;
        if (weakReference != null) {
            return (android.content.Context) weakReference.get();
        }
        return null;
    }

    public boolean l(java.lang.String str, int i17, int i18) {
        boolean mo24799x802b81ba = ((h45.q) i95.n0.c(h45.q.class)).mo24799x802b81ba(str);
        if (mo24799x802b81ba) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "WPHK start handle HK wallet CGP url");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1882, 115);
            ((h45.q) i95.n0.c(h45.q.class)).mo24771x42240bbb(str, i18, new e04.v(this, i17));
            rz3.e eVar = this.f327592w;
            if (eVar != null) {
                eVar.a(5, null);
            }
        }
        return mo24799x802b81ba;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(r45.iw5 r21) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e04.p.m(r45.iw5):boolean");
    }

    public final boolean n(r45.cx5 cx5Var) {
        java.lang.String str = cx5Var.f453433d;
        e();
        java.lang.ref.WeakReference weakReference = this.f327576d;
        android.content.Context context = weakReference != null ? (android.content.Context) weakReference.get() : null;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if ((str == null ? "" : str).length() <= 0) {
            if (context != null) {
                dp.a.m125853x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.iar, 0).show();
            }
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        int i17 = this.f327577e != 1 ? 30 : 45;
        android.content.Intent intent = new android.content.Intent();
        qk.p.b(intent, cx5Var, i17);
        if (n17 != null && !n17.r2()) {
            intent.putExtra("Contact_IsLBSFriend", true);
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str)) {
            intent.putExtra("key_add_contact_desc_wording_id", cx5Var.f453446t);
            intent.putExtra("key_save_contact", true);
        }
        if (context != null) {
            ((com.p314xaae8f345.mm.app.y7) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.i1.a()).l(intent, context);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[6];
            objArr[0] = 2;
            objArr[1] = java.lang.Integer.valueOf(this.A);
            objArr[2] = java.lang.Integer.valueOf(this.f327577e);
            objArr[3] = this.B;
            objArr[4] = this.f327579g;
            java.lang.String str2 = this.C;
            objArr[5] = str2 != null ? str2 : "";
            g0Var.d(14268, objArr);
        }
        return true;
    }

    public final void o(android.content.Context context, java.lang.String url) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "debug scan template url, content: %s", url);
        e();
        if (((su4.x0) i95.n0.c(su4.x0.class)) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.QBarStringHandler", "handleTemplateUrl: IPluginWebSearch not available");
            D(true);
            return;
        }
        D(false);
        uv4.z zVar = new uv4.z(context, new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.C19223x6a3bf07());
        android.os.Handler handler = uv4.c0.f512958a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateScanHandler", "handle: start, url=%s", url);
        android.net.Uri parse = android.net.Uri.parse(url);
        java.lang.String queryParameter = parse.getQueryParameter("type");
        java.lang.String queryParameter2 = parse.getQueryParameter("query");
        if (queryParameter2 != null) {
            try {
                queryParameter2 = java.net.URLDecoder.decode(queryParameter2, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchTemplateScanHandler", "handle: decode query failed: %s", e17.getMessage());
            }
        } else {
            queryParameter2 = null;
        }
        java.lang.String queryParameter3 = parse.getQueryParameter("url");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("fts", queryParameter)) {
            java.lang.String errorMsg = "未识别模板类型: " + queryParameter;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMsg, "errorMsg");
            dp.a.m125854x26a183b(zVar.f513000a, errorMsg, 1).show();
            return;
        }
        if (queryParameter3 == null || queryParameter3.length() == 0) {
            dp.a.m125854x26a183b(zVar.f513000a, "模板 URL 为空", 1).show();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f263095a = queryParameter3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateScanHandler", "handle: set sDebugRemoteUrl=%s", queryParameter3);
        uv4.c0.f512958a.post(new uv4.b0(zVar, queryParameter2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0851  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0854  */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r44, int r45, java.lang.String r46, com.p314xaae8f345.mm.p944x882e457a.m1 r47) {
        /*
            Method dump skipped, instructions count: 4300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e04.p.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    public final boolean q(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "[isPayCode] check, qBarString：%s", str);
        return str.startsWith("weixin://wxpay/bizpayurl") || str.startsWith("https://wx.tenpay.com/f2f") || str.startsWith("wxp://f2f") || str.startsWith("https://payapp.wechatpay.cn/qr/") || str.startsWith("wxhb://f2f") || str.startsWith("wxp://wbf2f") || str.startsWith("m") || str.startsWith(f327575J) || str.startsWith("n") || str.startsWith(K) || str.startsWith("https://payapp.wechatpay.cn/sjt/qr/") || str.startsWith("weixin://wxpay/pcpayurl") || str.startsWith("wedropf2fhb://");
    }

    public final void r(android.app.Activity activity, java.lang.String str) {
        bi4.n1 n1Var = new bi4.n1(null);
        n1Var.f436497f = str;
        n1Var.f436498g = true;
        n1Var.f436499h = 11;
        int i17 = this.E;
        if (i17 <= 0) {
            i17 = z(this.f327577e);
        }
        n1Var.f436500i = i17;
        this.f327591v = db5.e1.R(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_b), true, true, new e04.f0(this, ((com.p314xaae8f345.mm.p689xc5a27af6.p765xa4f4bf5f.C10691x3b04d9e9) ((xe0.g0) i95.n0.c(xe0.g0.class))).Ui(activity, n1Var, new e04.e0(this, activity))));
    }

    public final void s(boolean z17) {
        t(z17, null);
    }

    public final void t(boolean z17, android.os.Bundle bundle) {
        if (this.f327592w != null) {
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            bundle.putBoolean("key_scan_qr_code_result", z17);
            this.f327592w.a(3, bundle);
        }
    }

    public final void u(android.app.Activity activity, java.lang.String shortUrl) {
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shortUrl, "shortUrl");
        db2.s5 s5Var = new db2.s5(shortUrl);
        ((java.util.HashMap) this.f327594y).put(s5Var, 1);
        gm0.j1.d().g(s5Var);
        this.f327591v = db5.e1.R(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_b), true, true, new e04.b0(this, s5Var));
    }

    public final void v(android.app.Activity activity, java.lang.String qrUrl) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "openFinderProfileOrLive: qrcode_url=" + qrUrl);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qrUrl, "qrUrl");
        zy2.rc rcVar = new zy2.rc(qrUrl);
        ((java.util.HashMap) this.f327594y).put(rcVar, 1);
        gm0.j1.d().g(rcVar);
        this.f327591v = db5.e1.R(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_b), true, true, new e04.z(this, rcVar));
    }

    public final void w(android.app.Activity activity, java.lang.String shortUrl) {
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shortUrl, "shortUrl");
        y92.c cVar = new y92.c(shortUrl);
        ((java.util.HashMap) this.f327594y).put(cVar, 1);
        gm0.j1.d().g(cVar);
        this.f327591v = db5.e1.R(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_b), true, true, new e04.c0(this, cVar));
    }

    public final boolean x(int i17, int i18, java.lang.String str) {
        java.lang.ref.WeakReference weakReference = this.f327576d;
        android.content.Context context = weakReference != null ? (android.content.Context) weakReference.get() : null;
        if (i17 != 1) {
            if (i17 != 2) {
                return false;
            }
            if (context != null) {
                dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572033wu), 1).show();
            }
            return true;
        }
        if (context != null) {
            if (gm0.j1.d().m()) {
                gm0.j1.d().l();
            } else if (com.p314xaae8f345.mm.p971x6de15a2e.y2.a(context)) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l5.a(context);
            } else {
                dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcf, 1, java.lang.Integer.valueOf(i18)), 1).show();
            }
        }
        return true;
    }

    public final int z(int i17) {
        if (i17 == 1) {
            return 34;
        }
        if (i17 == 0) {
            return 4;
        }
        return i17 == 3 ? 42 : 30;
    }

    public p(java.lang.String str) {
        this();
        this.f327595z = str;
    }
}
