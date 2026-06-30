package com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui;

/* renamed from: com.tencent.mm.plugin.nearlife.ui.SelectPoiCategoryUI */
/* loaded from: classes5.dex */
public class ActivityC16734xf3af640 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f233824m = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a + "poi_categories";

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.ActivityC16734xf3af640.EventListener f233825d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f233826e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ArrayAdapter f233827f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f233828g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemClickListener f233829h = new com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.a0(this);

    /* renamed from: i, reason: collision with root package name */
    public final android.view.MenuItem.OnMenuItemClickListener f233830i = new com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.b0(this);

    /* renamed from: com.tencent.mm.plugin.nearlife.ui.SelectPoiCategoryUI$EventListener */
    /* loaded from: classes5.dex */
    public class EventListener extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5842xa0860b8b> {

        /* renamed from: d, reason: collision with root package name */
        public com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.ActivityC16734xf3af640 f233831d;

        public EventListener(com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.ActivityC16734xf3af640 activityC16734xf3af640, int i17) {
            super(com.p314xaae8f345.mm.app.a0.f134821d, i17);
            this.f39173x3fe91575 = -459979365;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5842xa0860b8b c5842xa0860b8b) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5842xa0860b8b c5842xa0860b8b2 = c5842xa0860b8b;
            if (c5842xa0860b8b2 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5842xa0860b8b) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.ActivityC16734xf3af640 activityC16734xf3af640 = this.f233831d;
                byte[] bArr = c5842xa0860b8b2.f136151g.f88785a;
                activityC16734xf3af640.getClass();
                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.ActivityC16734xf3af640.f233824m;
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
                java.lang.String str2 = a17.f294812f;
                if (str2 != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                    if (!str2.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
                com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
                if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
                    com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                    if (m18.a()) {
                        m18.f294799a.r(m18.f294800b);
                    }
                }
                try {
                    java.lang.String concat = str.concat("/lastest_poi_categories.dat");
                    com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(concat);
                    if (!r6Var.m()) {
                        r6Var.k();
                    }
                    com.p314xaae8f345.mm.vfs.w6.S(concat, bArr, 0, bArr.length);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectPoiCategoryUI", "write file failed: " + e17.getMessage());
                }
                java.lang.String[] split = new java.lang.String(bArr).split("\n");
                ((java.util.ArrayList) activityC16734xf3af640.f233828g).clear();
                for (java.lang.String str3 : split) {
                    ((java.util.ArrayList) activityC16734xf3af640.f233828g).add(str3.trim());
                }
                activityC16734xf3af640.T6();
            }
            return false;
        }
    }

    public final void T6() {
        this.f233827f.clear();
        for (int i17 = 0; i17 < this.f233828g.size(); i17++) {
            this.f233827f.add((java.lang.String) this.f233828g.get(i17));
        }
        this.f233827f.notifyDataSetChanged();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean U6(java.io.InputStream r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L4
            r6 = 0
            return r6
        L4:
            java.util.List r0 = r5.f233828g
            r0.clear()
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L37
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L37
            java.lang.String r3 = "UTF-8"
            r2.<init>(r6, r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L37
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L37
        L16:
            java.lang.String r0 = r1.readLine()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            if (r0 == 0) goto L22
            java.util.List r2 = r5.f233828g     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            r2.add(r0)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            goto L16
        L22:
            r1.close()     // Catch: java.lang.Exception -> L29
            r6.close()     // Catch: java.lang.Exception -> L29
            goto L46
        L29:
            r6 = move-exception
            r6.getMessage()
            goto L46
        L2e:
            r0 = move-exception
            goto L48
        L30:
            r0 = move-exception
            goto L3b
        L32:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L48
        L37:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L3b:
            r0.getMessage()     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L43
            r1.close()     // Catch: java.lang.Exception -> L29
        L43:
            r6.close()     // Catch: java.lang.Exception -> L29
        L46:
            r6 = 1
            return r6
        L48:
            if (r1 == 0) goto L4d
            r1.close()     // Catch: java.lang.Exception -> L51
        L4d:
            r6.close()     // Catch: java.lang.Exception -> L51
            goto L55
        L51:
            r6 = move-exception
            r6.getMessage()
        L55:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.ActivityC16734xf3af640.U6(java.io.InputStream):boolean");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cjz;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.h9v);
        mo54448x9c8c0d33(this.f233830i);
        this.f233827f = new android.widget.ArrayAdapter(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.c9z);
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.bdf);
        this.f233826e = listView;
        listView.setAdapter((android.widget.ListAdapter) this.f233827f);
        this.f233826e.setOnItemClickListener(this.f233829h);
        java.lang.String str = f233824m + "/lastest_poi_categories.dat";
        boolean z17 = false;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
            com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
            if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
                try {
                    z17 = U6(com.p314xaae8f345.mm.vfs.w6.D(a17, b3Var.m(a17, m17)));
                } catch (java.io.FileNotFoundException e17) {
                    e17.getMessage();
                }
            }
        }
        if (!z17) {
            try {
                U6(getAssets().open("default_poi_categories.dat"));
            } catch (java.io.IOException e18) {
                e18.getMessage();
            }
        }
        T6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f233828g = new java.util.ArrayList();
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.ActivityC16734xf3af640.EventListener eventListener = new com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.ActivityC16734xf3af640.EventListener(this, 0);
        this.f233825d = eventListener;
        eventListener.mo48813x58998cd();
        this.f233825d.f233831d = this;
        c01.d9.e().g(new f21.g0(17));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f233825d.mo48814x2efc64();
    }
}
