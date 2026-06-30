package su4;

/* loaded from: classes.dex */
public class w1 extends su4.a implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f494655i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f494656m;

    /* renamed from: n, reason: collision with root package name */
    public final int f494657n;

    /* renamed from: o, reason: collision with root package name */
    public final int f494658o;

    /* renamed from: p, reason: collision with root package name */
    public r45.aa7 f494659p;

    /* renamed from: q, reason: collision with root package name */
    public final r45.z97 f494660q;

    /* renamed from: r, reason: collision with root package name */
    public final su4.r1 f494661r;

    /* renamed from: s, reason: collision with root package name */
    public long f494662s = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public w1(su4.r1 r1Var) {
        java.lang.String str;
        float f17;
        float f18;
        long j17;
        java.lang.String str2;
        c01.l2 e17;
        this.f494661r = r1Var;
        java.lang.String str3 = r1Var.f494595b;
        this.f494336e = str3;
        this.f494338g = r1Var.f494618y;
        this.f494337f = r1Var.f494596c;
        int i17 = r1Var.f494599f;
        this.f494335d = r1Var.f494610q;
        this.f494657n = r1Var.f494594a;
        this.f494339h = r1Var.f494619z;
        java.lang.Object[] objArr = i17 >= 4001 && i17 <= 4500;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) && objArr != true) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.NetSceneWebSearch", "keyword is unavailable");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.NetSceneWebSearch", "Constructors: keyword=%s", r1Var.f494595b);
        int i18 = r1Var.f494599f;
        this.f494658o = i18;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        if ((r1Var.f494612s == 1) == true) {
            lVar.f152200d = 2676;
            str = "/cgi-bin/mmux-bin/wxaapp/mmuxwxa_weappsearch";
        } else {
            int i19 = r1Var.A;
            if (i19 == 1) {
                lVar.f152200d = 1011;
                str = "/cgi-bin/mmsearch-bin/chatsearch";
            } else if (i19 == 3) {
                lVar.f152200d = 1532;
                str = "/cgi-bin/mmbiz-bin/usrmsg/aiscan_image_retrieval";
            } else if (r1Var.D) {
                lVar.f152200d = 4858;
                str = "/cgi-bin/mmsearch-bin/mmtagsearch";
            } else if (i18 == 123 || i18 == 125 || (1000 <= i18 && i18 <= 1500)) {
                lVar.f152200d = 11451;
                str = "/cgi-bin/mmsearch-bin/mmwebfindersearch";
            } else if (i18 >= 4001 && i18 <= 4500) {
                lVar.f152200d = 8704;
                str = "/cgi-bin/mmsearch-bin/circlesearch_retrieval";
            } else if (i18 >= 4501 && i18 <= 4600) {
                lVar.f152200d = 7775;
                str = "/cgi-bin/mmsearch-bin/mmwebpresentsearch";
            } else if (i18 == 3147 || i18 == 3205 || (i18 >= 8100 && i18 <= 8500)) {
                lVar.f152200d = 16651;
                str = "/cgi-bin/mmsearch-bin/mmwebecsearchv2";
            } else {
                lVar.f152200d = 719;
                str = "/cgi-bin/micromsg-bin/mmwebsearch";
            }
        }
        lVar.f152199c = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.NetSceneWebSearch", "NetSceneWebSearch cgi is:%s", str);
        if (r1Var.A == 3) {
            lVar.f152197a = new r45.t97();
            lVar.f152198b = new r45.u97();
        } else {
            lVar.f152197a = new r45.z97();
            lVar.f152198b = new r45.aa7();
        }
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f494656m = a17;
        if (r1Var.A == 3) {
            this.f494660q = new r45.z97();
        } else {
            this.f494660q = (r45.z97) a17.f152243a.f152217a;
        }
        r45.z97 z97Var = this.f494660q;
        z97Var.f473355e = r1Var.f494595b;
        z97Var.f473354d = r1Var.f494594a;
        z97Var.f473357g = r1Var.f494597d;
        z97Var.f473359i = su4.r2.i();
        r45.z97 z97Var2 = this.f494660q;
        z97Var2.f473356f = r1Var.f494596c;
        int i27 = r1Var.H;
        z97Var2.f473358h = i27 == 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(0) : i27;
        r45.z97 z97Var3 = this.f494660q;
        java.util.LinkedList linkedList = r1Var.f494598e;
        z97Var3.f473360m = linkedList;
        z97Var3.f473361n = r1Var.f494599f;
        z97Var3.f473362o = r1Var.f494600g;
        z97Var3.f473363p = r1Var.f494601h;
        z97Var3.f473364q = r1Var.f494602i;
        z97Var3.f473366s = r1Var.f494604k;
        z97Var3.f473365r = r1Var.f494603j;
        z97Var3.f473367t = r1Var.f494605l;
        java.util.LinkedList linkedList2 = r1Var.f494608o;
        z97Var3.f473370w = linkedList2;
        r45.zj6 zj6Var = null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList2)) {
            java.util.Iterator it = linkedList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str2 = null;
                    break;
                }
                r45.x50 x50Var = (r45.x50) it.next();
                if (x50Var != null && "parentSearchID".equals(x50Var.f471321d)) {
                    str2 = x50Var.f471323f;
                    break;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.NetSceneWebSearch", "parentSearchID=%s", str2);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && (e17 = c01.n2.d().e(str2)) != null) {
                java.lang.String f19 = e17.f("extQueryInfo", "");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f19)) {
                    r45.x50 x50Var2 = new r45.x50();
                    x50Var2.f471321d = "extQueryInfo";
                    x50Var2.f471323f = f19;
                    linkedList2.add(x50Var2);
                }
            }
        }
        r45.z97 z97Var4 = this.f494660q;
        z97Var4.f473369v = r1Var.f494607n;
        z97Var4.f473371x = r1Var.f494609p;
        z97Var4.f473372y = r1Var.f494611r;
        z97Var4.A = r1Var.f494615v;
        z97Var4.F = com.p314xaae8f345.mm.ui.bk.C() ? 1 : 0;
        this.f494660q.G = su4.r2.g();
        r45.z97 z97Var5 = this.f494660q;
        int i28 = this.f494658o;
        if (i28 == 79 || i28 == 80) {
            r45.zj6 zj6Var2 = new r45.zj6();
            zj6Var2.f473684f = 1;
            java.lang.String str4 = r1Var.F;
            if (!android.text.TextUtils.isEmpty(str4)) {
                java.lang.String[] split = str4.split("#");
                if (i28 == 79) {
                    if (split.length >= 2) {
                        zj6Var2.f473682d = split[0];
                        zj6Var2.f473686h = split[1];
                    }
                } else if (i28 == 80 && split.length >= 3) {
                    zj6Var2.f473682d = split[0];
                    zj6Var2.f473686h = split[1];
                    zj6Var2.f473683e = split[2];
                }
                zj6Var2.f473685g = r1Var.G;
                zj6Var = zj6Var2;
            }
        }
        z97Var5.H = zj6Var;
        if (r1Var.f494614u == null) {
            r1Var.f494614u = new r45.v97();
        }
        r45.v97 v97Var = r1Var.f494614u;
        if (v97Var.f469548e == null) {
            v97Var.f469548e = new r45.yn();
        }
        r45.yn ynVar = r1Var.f494614u.f469548e;
        int i29 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDisplayMetrics().widthPixels;
        zx5.k kVar = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429501a;
        ynVar.f472765q = (com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.m120125x97d401de() == com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS && org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.o() && org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46407x44d8fa6c)) != false ? org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429508h : false ? java.lang.Math.round(i29 / i65.a.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) : java.lang.Math.round(i29 / j65.f.f());
        int i37 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDisplayMetrics().widthPixels;
        int i38 = r1Var.f494614u.f469548e.f472765q;
        float f27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDisplayMetrics().density;
        if (this.f494660q.f473359i != null) {
            r45.yn ynVar2 = r1Var.f494614u.f469548e;
            ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
            ynVar2.f472763o = !i11.h.e().h() ? 1 : 0;
            r45.e64 e64Var = this.f494660q.f473359i;
            f17 = e64Var.f454579d;
            f18 = e64Var.f454580e;
        } else {
            r1Var.f494614u.f469548e.f472763o = 1;
            f17 = 0.0f;
            f18 = 0.0f;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.NetSceneWebSearch", "websearch location: longitude[%f], latitude[%f], isUsingCached[%d]", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Integer.valueOf(r1Var.f494614u.f469548e.f472763o));
        if (!android.text.TextUtils.isEmpty(r1Var.f494617x)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(java.net.URLDecoder.decode(r1Var.f494617x));
                r45.j95 j95Var = new r45.j95();
                j95Var.f459202f = jSONObject.optString("city");
                j95Var.f459201e = jSONObject.optString("country");
                j95Var.f459204h = (float) jSONObject.optDouble("latitude");
                j95Var.f459205i = (float) jSONObject.optDouble("longitude");
                j95Var.f459200d = jSONObject.optString("poiId");
                j95Var.f459203g = jSONObject.optString("poiName");
                java.lang.String optString = jSONObject.optString("snsId");
                if (android.text.TextUtils.isEmpty(optString)) {
                    j17 = 0;
                } else {
                    long longValue = new java.math.BigInteger(optString).longValue();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchApiLogic", "seq %s to snsId %d ", optString, java.lang.Long.valueOf(longValue));
                    j17 = longValue;
                }
                j95Var.f459207n = j17;
                if (!android.text.TextUtils.isEmpty(j95Var.f459200d)) {
                    this.f494660q.E = j95Var;
                }
            } catch (org.json.JSONException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.NetSceneWebSearch", e18, "", new java.lang.Object[0]);
            }
        }
        r45.v97 v97Var2 = r1Var.f494614u;
        if (v97Var2 != null) {
            try {
                v97Var2.f469549f = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.l8) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r5.class))).Ai();
                this.f494660q.B = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(r1Var.f494614u.mo14344x5f01b1f6());
                r45.v97 v97Var3 = r1Var.f494614u;
                long j18 = v97Var3.f469547d;
                java.lang.String str5 = v97Var3.f469548e.f472755d;
            } catch (java.lang.Exception unused) {
            }
        }
        if (r1Var.f494613t != null) {
            try {
                this.f494660q.f473373z = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(r1Var.f494613t.mo14344x5f01b1f6());
            } catch (java.lang.Exception unused2) {
            }
        }
        java.lang.Object[] objArr2 = new java.lang.Object[7];
        objArr2[0] = java.lang.Boolean.valueOf(this.f494660q.f473359i != null);
        objArr2[1] = java.lang.Integer.valueOf(linkedList.size());
        objArr2[2] = java.lang.Integer.valueOf(r1Var.f494599f);
        objArr2[3] = java.lang.Integer.valueOf(r1Var.f494597d);
        objArr2[4] = java.lang.Integer.valueOf(this.f494657n);
        objArr2[5] = java.lang.Integer.valueOf(r1Var.f494601h);
        objArr2[6] = java.lang.Integer.valueOf(r1Var.f494610q);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.NetSceneWebSearch", "contains location = %b | matchUserSize=%d | scene=%d | businessType=%d | isHomePage=%b | sceneActionType=%d | webViewId=%d", objArr2);
        if (this.f494660q.f473359i != null) {
            v90.x xVar = (v90.x) i95.n0.c(v90.x.class);
            r45.e64 e64Var2 = this.f494660q.f473359i;
            ((u90.v) xVar).wi(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46359x61685111, e64Var2.f454579d, e64Var2.f454580e, e64Var2.f454581f);
        }
        if (r1Var.A == 3) {
            r45.t97 t97Var = (r45.t97) this.f494656m.f152243a.f152217a;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("action", "retrieval_by_req_key_circle_search");
            hashMap.put("req_key", r1Var.B);
            hashMap.put("req_business_buffer", android.util.Base64.encodeToString(this.f494660q.m75963xebb06ba0(), 2));
            t97Var.f467755d = new org.json.JSONObject(hashMap).toString();
        }
        su4.k2.d(r1Var.f494599f, r1Var.f494615v, r1Var.f494616w, r1Var.f494600g, r1Var.f494596c, r1Var.f494594a == 1, r1Var.f494618y, r1Var.f494595b, r1Var.f494597d);
    }

    @Override // su4.a
    public java.lang.String H() {
        r45.aa7 aa7Var = this.f494659p;
        return aa7Var != null ? aa7Var.f451410f : "";
    }

    @Override // su4.a
    public java.lang.String I() {
        r45.aa7 aa7Var = this.f494659p;
        if (aa7Var == null) {
            return null;
        }
        try {
            return new java.lang.String(android.util.Base64.encode(aa7Var.mo14344x5f01b1f6(), 2));
        } catch (java.io.IOException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.NetSceneWebSearch", "encode resp base64 fail");
            return null;
        }
    }

    @Override // su4.a
    public int J() {
        r45.aa7 aa7Var = this.f494659p;
        if (aa7Var != null) {
            return aa7Var.f451408d;
        }
        return 0;
    }

    @Override // su4.a
    public void K(java.util.LinkedList linkedList) {
        r45.z97 z97Var = this.f494660q;
        z97Var.f473360m = linkedList;
        r45.h86 h86Var = new r45.h86();
        h86Var.f457475d = linkedList.size();
        z97Var.C = h86Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f494662s = c01.id.c();
        su4.k3.g(this.f494658o, 2, 0, 0, "");
        this.f494655i = u0Var;
        return mo9409x10f9447a(sVar, this.f494656m, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        su4.r1 r1Var = this.f494661r;
        int i17 = r1Var.A;
        if (i17 == 1) {
            return 1011;
        }
        if (i17 == 3) {
            return 1532;
        }
        return r1Var.D ? 4858 : 719;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        int i27;
        java.lang.String str2;
        int i28;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.NetSceneWebSearch", "onGYNetEnd netId %d | errType %d | errCode %d | errMsg %s useTime: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Long.valueOf(c01.id.a() - this.f494662s));
        boolean z17 = i18 == 0 && i19 == 0;
        int i29 = this.f494658o;
        su4.r1 r1Var = this.f494661r;
        if (i18 != 0 || i19 != 0) {
            this.f494655i.mo815x76e0bfae(i18, i19, str, this);
            su4.k2.e(r1Var.f494599f, r1Var.f494615v, r1Var.f494616w, r1Var.f494600g, r1Var.f494596c, r1Var.f494594a == 1, r1Var.f494618y, z17, r1Var.f494595b, r1Var.f494597d);
            su4.k3.g(i29, 3, i18, i19, "");
            return;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f494656m.f152244b.f152233a;
        if (fVar instanceof r45.u97) {
            r45.u97 u97Var = (r45.u97) fVar;
            r45.aa7 aa7Var = new r45.aa7();
            this.f494659p = aa7Var;
            aa7Var.mo11485x1f73abb4(u97Var.mo11484xe92ab0a8());
            this.f494659p.f451410f = u97Var.f468696d;
        } else if (fVar instanceof r45.aa7) {
            this.f494659p = (r45.aa7) fVar;
        }
        if (this.f494659p != null) {
            int i37 = r1Var.f494599f;
            java.lang.String str3 = r1Var.f494615v;
            java.lang.String str4 = r1Var.f494616w;
            java.lang.String str5 = r1Var.f494600g;
            int i38 = r1Var.f494596c;
            i27 = i29;
            i28 = 3;
            str2 = "";
            su4.k2.e(i37, str3, str4, str5, i38, r1Var.f494594a == 1, r1Var.f494618y, z17, r1Var.f494595b, r1Var.f494597d);
            java.lang.String str6 = this.f494659p.f451410f;
        } else {
            i27 = i29;
            str2 = "";
            i28 = 3;
        }
        this.f494655i.mo815x76e0bfae(i18, i19, str, this);
        su4.k3.g(i27, i28, i18, i19, str2);
    }
}
