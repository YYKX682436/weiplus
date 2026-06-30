package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* renamed from: com.tencent.mm.ui.tools.MultiStageCitySelectUI */
/* loaded from: classes15.dex */
public class ActivityC22513x4a79ed20 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static java.util.List F;
    public java.lang.String B;
    public java.util.ArrayList C;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f291626d;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5[] f291635p;

    /* renamed from: v, reason: collision with root package name */
    public boolean f291641v;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.C22561x90a7947 f291643x;

    /* renamed from: y, reason: collision with root package name */
    public i11.e f291644y;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f291627e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f291628f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f291629g = null;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f291630h = null;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f291631i = null;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f291632m = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f291633n = false;

    /* renamed from: o, reason: collision with root package name */
    public int f291634o = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f291636q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f291637r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f291638s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f291639t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f291640u = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f291642w = true;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2740x696c9db.c9 f291645z = new com.p314xaae8f345.mm.ui.p2740x696c9db.c9(true, true);
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 A = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
    public final i11.c D = new com.p314xaae8f345.mm.ui.p2740x696c9db.e7(this);
    public final java.lang.Runnable E = new com.p314xaae8f345.mm.ui.p2740x696c9db.i7(this);

    public void V6() {
        com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5[] n17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        if (this.f291634o == 3) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5[] g17 = com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().g();
            if (g17 != null) {
                for (com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5 c21050xe4d9f0f5 : g17) {
                    if ("HK".equalsIgnoreCase(c21050xe4d9f0f5.m77919xfb7e1663()) || "TW".equalsIgnoreCase(c21050xe4d9f0f5.m77919xfb7e1663()) || "MO".equalsIgnoreCase(c21050xe4d9f0f5.m77919xfb7e1663())) {
                        arrayList.add(c21050xe4d9f0f5);
                    }
                }
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5[] n18 = com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().n("CN");
            int length = n18.length;
            n17 = (com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5[]) java.util.Arrays.copyOf(n18, arrayList.size() + length);
            java.util.Iterator it = arrayList.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                n17[length + i17] = (com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5) it.next();
                i17++;
            }
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f291627e)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5[] g18 = com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().g();
            if (this.f291639t) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                if (g18 != null) {
                    for (com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5 c21050xe4d9f0f52 : g18) {
                        if (!this.C.contains(c21050xe4d9f0f52.m77919xfb7e1663()) && !"CN".equalsIgnoreCase(c21050xe4d9f0f52.m77919xfb7e1663()) && !"HK".equalsIgnoreCase(c21050xe4d9f0f52.m77919xfb7e1663()) && !"TW".equalsIgnoreCase(c21050xe4d9f0f52.m77919xfb7e1663()) && !"MO".equalsIgnoreCase(c21050xe4d9f0f52.m77919xfb7e1663())) {
                            arrayList2.add(c21050xe4d9f0f52);
                        }
                    }
                }
                n17 = new com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5[arrayList2.size()];
                arrayList2.toArray(n17);
            } else {
                if (g18 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    for (com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5 c21050xe4d9f0f53 : g18) {
                        if (!this.C.contains(c21050xe4d9f0f53.m77919xfb7e1663())) {
                            arrayList3.add(c21050xe4d9f0f53);
                        }
                    }
                    g18 = new com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5[arrayList3.size()];
                    arrayList3.toArray(g18);
                }
                n17 = g18;
            }
        } else {
            n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f291628f) ? com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().n(this.f291627e) : com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().e(this.f291627e, this.f291628f);
        }
        this.f291635p = n17;
        if (n17 == null || n17.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiStageCitySelectUI", "initZoneItems error ,check zone lists!");
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f291626d).t();
        if (getIntent().getBooleanExtra("SetSelectLocation", false)) {
            str = getIntent().getStringExtra("SelectedCountryCode");
            str2 = getIntent().getStringExtra("SelectedProvinceCode");
            str3 = getIntent().getStringExtra("SelectedCityCode");
        } else {
            str = (java.lang.String) c01.d9.b().p().l(12324, null);
            str2 = (java.lang.String) c01.d9.b().p().l(12325, null);
            str3 = (java.lang.String) c01.d9.b().p().l(12326, null);
        }
        this.f291638s = getIntent().getBooleanExtra("ShowSelectedLocation", true);
        if (getIntent().getBooleanExtra("NeedUnshowItem", false)) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.C22560xff26e1c7 c22560xff26e1c7 = new com.p314xaae8f345.mm.ui.p2740x696c9db.C22560xff26e1c7(this, null);
            com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5 c21050xe4d9f0f54 = new com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5();
            c21050xe4d9f0f54.m77932x764daa0d(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f4f));
            c21050xe4d9f0f54.m77931x7e7ad4f7(false);
            c21050xe4d9f0f54.m77929xea55e0d4(false);
            c21050xe4d9f0f54.m77928x7648dd6f("unshow");
            c22560xff26e1c7.N(c21050xe4d9f0f54);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f291626d).d(c22560xff26e1c7, -1);
            if ("unshow".equals(str)) {
                c22560xff26e1c7.G(com.p314xaae8f345.mm.R.C30867xcad56011.iop);
            }
        }
        int i18 = 0;
        while (true) {
            com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5[] c21050xe4d9f0f5Arr = this.f291635p;
            if (i18 >= c21050xe4d9f0f5Arr.length) {
                break;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5 c21050xe4d9f0f55 = c21050xe4d9f0f5Arr[i18];
            if (c21050xe4d9f0f55 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21050xe4d9f0f55.m77919xfb7e1663()) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f291635p[i18].m77921xfb82e301())) {
                com.p314xaae8f345.mm.ui.p2740x696c9db.C22560xff26e1c7 c22560xff26e1c72 = new com.p314xaae8f345.mm.ui.p2740x696c9db.C22560xff26e1c7(this, null);
                c22560xff26e1c72.N(this.f291635p[i18]);
                if (!this.f291638s) {
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f291626d).d(c22560xff26e1c72, -1);
                } else if (this.f291634o == 0 && this.f291635p[i18].m77919xfb7e1663().equalsIgnoreCase(str)) {
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f291626d).d(c22560xff26e1c72, 0);
                    c22560xff26e1c72.G(com.p314xaae8f345.mm.R.C30867xcad56011.ioq);
                } else if (this.f291634o == 1 && this.f291635p[i18].m77919xfb7e1663().equalsIgnoreCase(str2)) {
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f291626d).d(c22560xff26e1c72, 0);
                    c22560xff26e1c72.G(com.p314xaae8f345.mm.R.C30867xcad56011.ioq);
                } else if (this.f291634o == 2 && this.f291635p[i18].m77919xfb7e1663().equalsIgnoreCase(str3)) {
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f291626d).d(c22560xff26e1c72, 0);
                    c22560xff26e1c72.G(com.p314xaae8f345.mm.R.C30867xcad56011.ioq);
                } else {
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f291626d).d(c22560xff26e1c72, -1);
                }
            }
            i18++;
        }
        if (this.f291634o == 3) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.C22562x445aade9 c22562x445aade9 = new com.p314xaae8f345.mm.ui.p2740x696c9db.C22562x445aade9(this, null);
            c22562x445aade9.L = getString(com.p314xaae8f345.mm.R.C30867xcad56011.iol);
            c22562x445aade9.M = new com.p314xaae8f345.mm.ui.p2740x696c9db.f7(this);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f291626d).d(c22562x445aade9, -1);
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f291626d).d(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21561x79ac8f19(mo55332x76847179()), -1);
        int i19 = this.f291634o;
        if (i19 == 0 || i19 == 3) {
            if (this.f291637r) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b c21568x1a71b23b = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b(this, null);
                c21568x1a71b23b.J(com.p314xaae8f345.mm.R.C30867xcad56011.ioj);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f291626d).d(c21568x1a71b23b, 0);
                com.p314xaae8f345.mm.ui.p2740x696c9db.C22561x90a7947 c22561x90a7947 = new com.p314xaae8f345.mm.ui.p2740x696c9db.C22561x90a7947(this, null);
                this.f291643x = c22561x90a7947;
                c22561x90a7947.C("current_location");
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f291626d).d(this.f291643x, 1);
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b c21568x1a71b23b2 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b(this, null);
            c21568x1a71b23b2.J(com.p314xaae8f345.mm.R.C30867xcad56011.ioi);
            if (this.f291637r) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f291626d).d(c21568x1a71b23b2, 2);
            } else {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f291626d).d(c21568x1a71b23b2, 0);
            }
        }
    }

    public final void W6() {
        c01.fb a17 = c01.fb.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiStageCitySelectUI", "oplog: " + a17);
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(1, c01.fb.e(a17)));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.da8;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.h5u);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.ui.p2740x696c9db.j7(this));
        this.f291636q = getIntent().getBooleanExtra("GetAddress", false);
        this.f291627e = getIntent().getStringExtra("Country");
        this.f291628f = getIntent().getStringExtra("Provice");
        this.f291630h = getIntent().getStringExtra("CountryName");
        this.f291631i = getIntent().getStringExtra("ProviceName");
        this.f291637r = getIntent().getBooleanExtra("IsAutoPosition", !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P0(this));
        this.f291633n = getIntent().getBooleanExtra("IsRealNameVerifyScene", false);
        this.f291639t = getIntent().getBooleanExtra("IsSelectNonChinaCountry", false);
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("BlockedCountries");
        this.C = stringArrayListExtra;
        if (stringArrayListExtra == null) {
            this.C = new java.util.ArrayList();
        }
        this.f291640u = getIntent().getBooleanExtra("IsNeedShowSearchBar", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiStageCitySelectUI", " country = " + this.f291627e + " province =" + this.f291628f + " city = " + this.f291629g + " " + this.f291630h + " " + this.f291631i + " " + this.f291633n + " " + this.f291639t);
        if (this.f291633n) {
            this.f291634o = 3;
        } else if (this.f291627e == null) {
            this.f291634o = 0;
            this.f291628f = null;
            this.f291629g = null;
        } else if (this.f291628f == null) {
            this.f291634o = 1;
            this.f291629g = null;
        } else {
            this.f291634o = 2;
        }
        V6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1 && i18 == -1) {
            setResult(-1, intent);
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        int i17 = this.f291634o;
        if (i17 == 0) {
            this.f291627e = null;
        } else if (i17 == 1) {
            this.f291628f = null;
        } else if (i17 == 2) {
            this.f291629g = null;
        }
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onBusinessPermissionDenied */
    public void mo53824x34301f29(java.lang.String str) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x017c, code lost:
    
        if (r11 == null) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0186  */
    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22513x4a79ed20.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        c01.d9.e().q(665, this);
        i11.e eVar = this.f291644y;
        if (eVar != null) {
            ((i11.h) eVar).m(this.D);
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        if (!(c21560x1fce98fb instanceof com.p314xaae8f345.mm.ui.p2740x696c9db.C22560xff26e1c7)) {
            if (!c21560x1fce98fb.f279313q.equals("current_location")) {
                return false;
            }
            com.p314xaae8f345.mm.ui.p2740x696c9db.C22561x90a7947 c22561x90a7947 = this.f291643x;
            if (!(c22561x90a7947.P == 1)) {
                return false;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5[] c21050xe4d9f0f5Arr = {c22561x90a7947.L, c22561x90a7947.M, c22561x90a7947.N};
            if (!this.f291636q) {
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 p17 = c01.d9.b().p();
                com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5 c21050xe4d9f0f5 = c21050xe4d9f0f5Arr[0];
                p17.w(12324, c21050xe4d9f0f5 == null ? null : c21050xe4d9f0f5.m77919xfb7e1663());
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 p18 = c01.d9.b().p();
                com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5 c21050xe4d9f0f52 = c21050xe4d9f0f5Arr[1];
                p18.w(12325, c21050xe4d9f0f52 == null ? null : c21050xe4d9f0f52.m77919xfb7e1663());
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 p19 = c01.d9.b().p();
                com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5 c21050xe4d9f0f53 = c21050xe4d9f0f5Arr[2];
                p19.w(12326, c21050xe4d9f0f53 == null ? null : c21050xe4d9f0f53.m77919xfb7e1663());
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(4, 5);
                W6();
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5 c21050xe4d9f0f54 = c21050xe4d9f0f5Arr[0];
            java.lang.String m77919xfb7e1663 = c21050xe4d9f0f54 == null ? null : c21050xe4d9f0f54.m77919xfb7e1663();
            com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5 c21050xe4d9f0f55 = c21050xe4d9f0f5Arr[0];
            java.lang.String m77921xfb82e301 = c21050xe4d9f0f55 == null ? null : c21050xe4d9f0f55.m77921xfb82e301();
            com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5 c21050xe4d9f0f56 = c21050xe4d9f0f5Arr[1];
            java.lang.String m77919xfb7e16632 = c21050xe4d9f0f56 == null ? null : c21050xe4d9f0f56.m77919xfb7e1663();
            com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5 c21050xe4d9f0f57 = c21050xe4d9f0f5Arr[1];
            java.lang.String m77921xfb82e3012 = c21050xe4d9f0f57 == null ? null : c21050xe4d9f0f57.m77921xfb82e301();
            if ("CN".equalsIgnoreCase(m77919xfb7e1663) || "HK".equalsIgnoreCase(m77919xfb7e1663) || "MO".equalsIgnoreCase(m77919xfb7e1663) || "TW".equalsIgnoreCase(m77919xfb7e1663)) {
                m77921xfb82e301 = null;
            } else {
                m77921xfb82e3012 = null;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("CountryName", m77921xfb82e301);
            intent.putExtra("ProviceName", m77921xfb82e3012);
            com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5 c21050xe4d9f0f58 = c21050xe4d9f0f5Arr[2];
            intent.putExtra("CityName", c21050xe4d9f0f58 == null ? null : c21050xe4d9f0f58.m77921xfb82e301());
            intent.putExtra("Country", m77919xfb7e1663);
            intent.putExtra("Contact_Province", m77919xfb7e16632);
            com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5 c21050xe4d9f0f59 = c21050xe4d9f0f5Arr[2];
            intent.putExtra("Contact_City", c21050xe4d9f0f59 == null ? null : c21050xe4d9f0f59.m77919xfb7e1663());
            mo48674x36654fab();
            setResult(-1, intent);
            finish();
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5 c21050xe4d9f0f510 = ((com.p314xaae8f345.mm.ui.p2740x696c9db.C22560xff26e1c7) c21560x1fce98fb).L;
        if (c21050xe4d9f0f510 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21050xe4d9f0f510.m77919xfb7e1663())) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPreferenceTreeClick error item, code:");
            sb6.append(c21050xe4d9f0f510 == null ? -1 : c21050xe4d9f0f510.m77919xfb7e1663());
            sb6.append(" ,name:");
            sb6.append(c21050xe4d9f0f510 == null ? "null" : c21050xe4d9f0f510.m77921xfb82e301());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiStageCitySelectUI", sb6.toString());
            return false;
        }
        if (this.f291634o == 3) {
            this.f291627e = "CN";
            this.f291628f = c21050xe4d9f0f510.m77919xfb7e1663();
            this.f291631i = c21050xe4d9f0f510.m77921xfb82e301();
        }
        int i17 = this.f291634o;
        if (i17 == 0) {
            this.f291627e = c21050xe4d9f0f510.m77919xfb7e1663();
            this.f291630h = c21050xe4d9f0f510.m77921xfb82e301();
        } else if (i17 == 1) {
            this.f291628f = c21050xe4d9f0f510.m77919xfb7e1663();
            this.f291631i = c21050xe4d9f0f510.m77921xfb82e301();
        } else if (i17 == 2) {
            this.f291629g = c21050xe4d9f0f510.m77919xfb7e1663();
            this.f291632m = c21050xe4d9f0f510.m77921xfb82e301();
            if ("CN".equalsIgnoreCase(this.f291627e) || "HK".equalsIgnoreCase(this.f291627e) || "MO".equalsIgnoreCase(this.f291627e) || "TW".equalsIgnoreCase(this.f291627e)) {
                this.f291630h = null;
            } else {
                this.f291631i = null;
            }
        } else if (i17 == 4) {
            if (c21050xe4d9f0f510.m77922x29c22ba0() != null && !c21050xe4d9f0f510.m77923xe3f1ab9()) {
                this.f291629g = c21050xe4d9f0f510.m77919xfb7e1663();
                this.f291632m = c21050xe4d9f0f510.m77921xfb82e301();
                this.f291628f = c21050xe4d9f0f510.m77922x29c22ba0().m77919xfb7e1663();
                this.f291631i = c21050xe4d9f0f510.m77922x29c22ba0().m77921xfb82e301();
                this.f291627e = c21050xe4d9f0f510.m77920x81cc056d();
                this.f291630h = null;
            } else if (!c21050xe4d9f0f510.m77923xe3f1ab9() || c21050xe4d9f0f510.m77922x29c22ba0() == null) {
                this.f291627e = c21050xe4d9f0f510.m77919xfb7e1663();
                this.f291630h = c21050xe4d9f0f510.m77921xfb82e301();
                this.f291628f = null;
                this.f291631i = null;
                this.f291629g = null;
                this.f291632m = null;
            } else {
                this.f291628f = c21050xe4d9f0f510.m77919xfb7e1663();
                this.f291631i = c21050xe4d9f0f510.m77921xfb82e301();
                this.f291627e = c21050xe4d9f0f510.m77920x81cc056d();
                this.f291630h = null;
            }
        }
        if (c21050xe4d9f0f510.m77923xe3f1ab9()) {
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22513x4a79ed20.class);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("Country", this.f291627e);
            bundle.putString("Provice", this.f291628f);
            bundle.putString("CountryName", this.f291630h);
            bundle.putString("ProviceName", this.f291631i);
            bundle.putBoolean("GetAddress", this.f291636q);
            bundle.putBoolean("ShowSelectedLocation", this.f291638s);
            bundle.putString("SelectedCountryCode", getIntent().getStringExtra("SelectedCountryCode"));
            bundle.putString("SelectedProvinceCode", getIntent().getStringExtra("SelectedProvinceCode"));
            bundle.putString("SelectedCityCode", getIntent().getStringExtra("SelectedCityCode"));
            bundle.putBoolean("IsAutoPosition", false);
            if (this.f291633n) {
                java.lang.String m77920x81cc056d = c21050xe4d9f0f510.m77920x81cc056d();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m77920x81cc056d)) {
                    m77920x81cc056d = this.f291627e;
                }
                if ("CN".equalsIgnoreCase(m77920x81cc056d) || "HK".equalsIgnoreCase(m77920x81cc056d) || "MO".equalsIgnoreCase(m77920x81cc056d) || "TW".equalsIgnoreCase(m77920x81cc056d)) {
                    bundle.putBoolean("IsNeedShowSearchBar", true);
                }
                java.lang.String m77919xfb7e16633 = c21050xe4d9f0f510.m77919xfb7e1663();
                if ("HK".equalsIgnoreCase(m77919xfb7e16633) || "MO".equalsIgnoreCase(m77919xfb7e16633) || "TW".equalsIgnoreCase(m77919xfb7e16633)) {
                    bundle.putString("Country", m77919xfb7e16633);
                    bundle.putString("CountryName", c21050xe4d9f0f510.m77921xfb82e301());
                    bundle.remove("Provice");
                }
            }
            intent2.putExtras(bundle);
            mo48674x36654fab();
            startActivityForResult(intent2, 1);
        } else {
            if (!this.f291636q) {
                c01.d9.b().p().w(12324, this.f291627e);
                c01.d9.b().p().w(12325, this.f291628f);
                c01.d9.b().p().w(12326, this.f291629g);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(4, 5);
                W6();
            }
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("CountryName", this.f291630h);
            intent3.putExtra("ProviceName", this.f291631i);
            intent3.putExtra("CityName", this.f291632m);
            intent3.putExtra("Country", this.f291627e);
            intent3.putExtra("Contact_Province", this.f291628f);
            intent3.putExtra("Contact_City", this.f291629g);
            mo48674x36654fab();
            setResult(-1, intent3);
            finish();
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiStageCitySelectUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiStageCitySelectUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (iArr.length == 0 || i17 != 64 || iArr[0] == 0) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22561x90a7947 c22561x90a7947 = this.f291643x;
        if (c22561x90a7947 != null) {
            c22561x90a7947.P = 2;
            c22561x90a7947.M();
        }
        this.f291642w = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f291642w && this.f291637r) {
            boolean Di = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this, new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 64, null, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiStageCitySelectUI", "settings district,checkPermission checkLocation[%b]", java.lang.Boolean.valueOf(Di));
            if (Di) {
                if (this.f291644y == null) {
                    ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
                    this.f291644y = i11.h.e();
                }
                if (this.f291637r) {
                    if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ni(d85.g0.LOCAION, new com.p314xaae8f345.mm.ui.p2740x696c9db.g7(this))) {
                        return;
                    }
                    ((i11.h) this.f291644y).l(this.D, true, false, false);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r8, int r9, java.lang.String r10, com.p314xaae8f345.mm.p944x882e457a.m1 r11) {
        /*
            r7 = this;
            r10 = 2
            if (r8 != 0) goto La9
            if (r9 != 0) goto La9
            int r8 = r11.mo808xfb85f7b0()
            r9 = 665(0x299, float:9.32E-43)
            if (r8 != r9) goto Lb2
            va3.y r11 = (va3.y) r11
            java.lang.String r8 = r11.f515919f
            java.lang.String r9 = r11.f515920g
            java.lang.String r11 = r11.f515921h
            java.lang.Object[] r0 = new java.lang.Object[]{r8, r9, r11}
            java.lang.String r1 = "MicroMsg.MultiStageCitySelectUI"
            java.lang.String r2 = "current location country %s, province %s, city %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r0)
            com.tencent.mm.storage.ha r0 = com.p314xaae8f345.mm.p2621x8fb0427b.ha.k()
            com.tencent.mm.storage.RegionCodeDecoder$Region[] r0 = r0.g()
            r1 = 0
            if (r0 == 0) goto L86
            int r2 = r0.length
            r3 = 0
            r4 = r3
        L2e:
            if (r4 >= r2) goto L86
            r5 = r0[r4]
            java.lang.String r6 = r5.m77919xfb7e1663()
            boolean r6 = r6.equalsIgnoreCase(r8)
            if (r6 == 0) goto L83
            com.tencent.mm.storage.ha r8 = com.p314xaae8f345.mm.p2621x8fb0427b.ha.k()
            java.lang.String r0 = r5.m77919xfb7e1663()
            com.tencent.mm.storage.RegionCodeDecoder$Region[] r8 = r8.n(r0)
            int r0 = r8.length
            r2 = r3
        L4a:
            if (r2 >= r0) goto L7f
            r4 = r8[r2]
            java.lang.String r6 = r4.m77919xfb7e1663()
            boolean r6 = r6.equalsIgnoreCase(r9)
            if (r6 == 0) goto L7c
            com.tencent.mm.storage.ha r8 = com.p314xaae8f345.mm.p2621x8fb0427b.ha.k()
            java.lang.String r9 = r5.m77919xfb7e1663()
            java.lang.String r0 = r4.m77919xfb7e1663()
            com.tencent.mm.storage.RegionCodeDecoder$Region[] r8 = r8.e(r9, r0)
            int r9 = r8.length
        L69:
            if (r3 >= r9) goto L80
            r0 = r8[r3]
            java.lang.String r2 = r0.m77919xfb7e1663()
            boolean r2 = r2.equalsIgnoreCase(r11)
            if (r2 == 0) goto L79
            r1 = r0
            goto L80
        L79:
            int r3 = r3 + 1
            goto L69
        L7c:
            int r2 = r2 + 1
            goto L4a
        L7f:
            r4 = r1
        L80:
            r8 = r1
            r1 = r5
            goto L88
        L83:
            int r4 = r4 + 1
            goto L2e
        L86:
            r8 = r1
            r4 = r8
        L88:
            if (r1 != 0) goto L98
            if (r4 != 0) goto L98
            if (r8 != 0) goto L98
            com.tencent.mm.ui.tools.ZoneRecommandPreference r8 = r7.f291643x
            if (r8 == 0) goto La8
            r8.P = r10
            r8.M()
            goto La8
        L98:
            com.tencent.mm.ui.tools.ZoneRecommandPreference r9 = r7.f291643x
            if (r9 == 0) goto La8
            r10 = 1
            r9.P = r10
            r9.L = r1
            r9.M = r4
            r9.N = r8
            r9.M()
        La8:
            return
        La9:
            com.tencent.mm.ui.tools.ZoneRecommandPreference r8 = r7.f291643x
            if (r8 == 0) goto Lb2
            r8.P = r10
            r8.M()
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22513x4a79ed20.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
