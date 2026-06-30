package com.p314xaae8f345.mm.p1006xc5476f33.p1977xbdf5c67e.ui;

@gm0.a2
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.readerapp.ui.ReaderAppUI */
/* loaded from: classes9.dex */
public class ActivityC16956x7944e152 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: u, reason: collision with root package name */
    public static float f236588u;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 f236589d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.GestureDetectorOnGestureListenerC21510x15ed9d8c f236590e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f236591f;

    /* renamed from: g, reason: collision with root package name */
    public ts3.a f236592g;

    /* renamed from: q, reason: collision with root package name */
    public rl5.r f236599q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.FrameLayout f236600r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f236601s;

    /* renamed from: h, reason: collision with root package name */
    public int f236593h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f236594i = 0;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f236595m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f236596n = "";

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.i0 f236597o = null;

    /* renamed from: p, reason: collision with root package name */
    public int f236598p = 0;

    /* renamed from: t, reason: collision with root package name */
    public final db5.t4 f236602t = new ts3.r(this);

    public android.view.View.OnClickListener T6(c01.ta taVar, int i17, int i18, int i19, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        if (taVar != null) {
            java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.y9.a(taVar.h());
            java.lang.String a18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.y9.a(str);
            java.lang.String a19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.y9.a(str2);
            taVar.i();
            if (taVar.f119022v == 5) {
                xj.i iVar = (xj.i) i95.n0.c(xj.i.class);
                taVar.i();
                ((wj.j0) iVar).mj(taVar.f119026z, wj.w0.f528074d, null);
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    xj.i iVar2 = (xj.i) i95.n0.c(xj.i.class);
                    taVar.i();
                    int i27 = 1;
                    if (!(((wj.j0) iVar2).Ai(taVar.f119026z) == wj.n.f527983g)) {
                        i27 = 0;
                    }
                    jSONObject.put("yuanbao_app_status", i27);
                    str3 = jSONObject.toString();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ReaderAppUI", "gen featureValue error " + e17);
                }
                java.lang.String str4 = str3;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                taVar.i();
                java.lang.String str5 = taVar.f119023w;
                java.lang.String g17 = taVar.g();
                taVar.i();
                java.lang.Integer valueOf = java.lang.Integer.valueOf(taVar.f119022v);
                taVar.i();
                g0Var.d(15413, 9, a18, a19, str5, g17, a17, valueOf, java.lang.Integer.valueOf(taVar.f119021u), this.f236595m, str4);
            }
            str3 = "";
            java.lang.String str42 = str3;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            taVar.i();
            java.lang.String str52 = taVar.f119023w;
            java.lang.String g172 = taVar.g();
            taVar.i();
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(taVar.f119022v);
            taVar.i();
            g0Var2.d(15413, 9, a18, a19, str52, g172, a17, valueOf2, java.lang.Integer.valueOf(taVar.f119021u), this.f236595m, str42);
        }
        return new ts3.o(this, i17, taVar, str, str2, i19);
    }

    public void U6() {
        android.widget.ScrollView scrollView = (android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.dfo);
        if (this.f236592g.getCount() == 0) {
            this.f236590e.setVisibility(8);
            scrollView.setVisibility(0);
        } else {
            scrollView.setVisibility(8);
            this.f236590e.setVisibility(0);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 v3Var = this.f236589d;
        if (v3Var == null || !(this.f236592g instanceof ts3.d0)) {
            return;
        }
        v3Var.m75893x3498a0(new ts3.q(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cbz;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0143  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo43517x10010bd5() {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1977xbdf5c67e.ui.ActivityC16956x7944e152.mo43517x10010bd5():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1977xbdf5c67e.ui.ActivityC16956x7944e152.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        ts3.a aVar = this.f236592g;
        if (aVar != null) {
            aVar.c();
            this.f236592g.f294144h = null;
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).f145049b = "";
        ss3.d0.Di().mo49775xc84af884(this.f236592g);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().b0(this.f236596n);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f236593h == 20) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.fvh);
        } else {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.fvk);
        }
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).f145049b = this.f236596n;
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).h(this.f236596n);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().b0(this.f236596n);
        ss3.d0.Di().add(this.f236592g);
        this.f236592g.f();
        U6();
    }
}
