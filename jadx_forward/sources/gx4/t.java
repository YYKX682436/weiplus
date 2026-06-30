package gx4;

/* loaded from: classes8.dex */
public enum t {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.bag.C19350xc6738d4f f358976d;

    /* renamed from: e, reason: collision with root package name */
    public gx4.d f358977e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f358978f;

    /* renamed from: g, reason: collision with root package name */
    public long f358979g = -1;

    /* renamed from: h, reason: collision with root package name */
    public final gx4.s f358980h = new gx4.s();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f358981i = new java.util.LinkedList();

    t() {
    }

    public final void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewBagMgr", "attachBag");
        android.view.WindowManager windowManager = (android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window");
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        if (fp.h.c(26)) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2002;
        }
        layoutParams.format = 1;
        layoutParams.packageName = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageName();
        layoutParams.flags = 40;
        layoutParams.gravity = 51;
        int i17 = gx4.e.f358946d;
        layoutParams.width = i17;
        layoutParams.height = i17;
        gx4.s sVar = this.f358980h;
        layoutParams.x = sVar.f358970e;
        layoutParams.y = sVar.f358969d;
        try {
            windowManager.addView(this.f358976d, layoutParams);
            m();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewBagMgr", "add failed %s", e17);
        }
    }

    public void i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewBagMgr", "checkResumeBag mInWebViewUIFromBag:%b", java.lang.Boolean.valueOf(this.f358978f));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f358980h.f358967b) && !this.f358978f) {
            boolean z17 = java.lang.System.currentTimeMillis() - this.f358979g > 500;
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewBagMgr", "click to fast!!!");
            }
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.bag.C19350xc6738d4f c19350xc6738d4f = this.f358976d;
                if (c19350xc6738d4f == null || c19350xc6738d4f.getVisibility() != 0) {
                    o(false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewBagMgr", "checkResumeBag show bag");
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewBagMgr", "already show");
                    this.f358976d.m74424xbc91ffe0(true);
                    return;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.bag.C19350xc6738d4f c19350xc6738d4f2 = this.f358976d;
        if (c19350xc6738d4f2 != null) {
            c19350xc6738d4f2.setVisibility(8);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewBagMgr", "checkResumeBag hide bag");
    }

    public void j() {
        gx4.s sVar = this.f358980h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewBagMgr", "clearBag mCurrentUrl:%s", sVar.f358967b);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.bag.C19350xc6738d4f c19350xc6738d4f = this.f358976d;
        if (c19350xc6738d4f != null) {
            c19350xc6738d4f.setVisibility(8);
        }
        sVar.f358966a = null;
        sVar.f358967b = null;
        sVar.f358968c = null;
        sVar.f358971f = 0L;
        sVar.f358972g = 0;
        sVar.f358973h = new org.json.JSONObject();
        sVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewBagMgr", "unAttachBag");
        if (this.f358976d != null) {
            try {
                ((android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window")).removeView(this.f358976d);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewBagMgr", "remove failed %s", e17);
            }
            this.f358976d = null;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewBagMgr", "unAttachBag mBag null");
        }
        gx4.d dVar = this.f358977e;
        if (dVar != null) {
            try {
                ((android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window")).removeView(dVar.f358934a);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BagCancelController", "whenBagUnAttach remove failed %s", e18);
            }
            this.f358977e = null;
        }
        java.util.Iterator it = this.f358981i.iterator();
        if (it.hasNext()) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
            throw null;
        }
    }

    public final void k(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        gx4.s sVar = this.f358980h;
        g0Var.d(11576, sVar.f358967b, java.lang.Integer.valueOf(i17), 0, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - sVar.f358971f), sVar.f358966a);
    }

    public final void l(java.lang.String str, int i17, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        gx4.s sVar = this.f358980h;
        if (!z17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(sVar.f358966a)) {
            k(23);
            sVar.f358966a = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(java.lang.String.format("bagId#%d#%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), sVar.f358967b));
        }
        sVar.f358967b = str;
        sVar.f358968c = str2;
        sVar.f358972g = i17;
        sVar.f358971f = java.lang.System.currentTimeMillis();
        int i18 = gx4.n.f358956a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (bundle != null) {
            try {
                for (java.lang.String str3 : bundle.keySet()) {
                    jSONObject.put(str3, new gx4.m(bundle.get(str3)));
                }
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewBagIntentLogic", "save exp:%s", e17);
            }
        }
        sVar.f358973h = jSONObject;
        sVar.a();
    }

    public final void m() {
        gx4.s sVar = this.f358980h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewBagMgr", "setAngryInfo mBagInfo.lastActiveTime:%d", java.lang.Long.valueOf(sVar.f358971f));
        if (this.f358976d == null) {
            return;
        }
        if ("1".equals((java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEBVIEW_BAG_TEST_INFO_STRING_SYNC, "0"))) {
            this.f358976d.b(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8, 100, sVar.f358971f + 2000);
        } else {
            this.f358976d.b(3600000, 30000, sVar.f358971f + 3600000);
        }
    }

    public void n(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.bag.C19350xc6738d4f c19350xc6738d4f = this.f358976d;
        if (c19350xc6738d4f == null) {
            return;
        }
        c19350xc6738d4f.setAlpha(f17);
        if (f17 == 0.0f) {
            this.f358976d.setVisibility(8);
        } else {
            this.f358976d.setVisibility(0);
        }
    }

    public final void o(boolean z17) {
        gx4.s sVar = this.f358980h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewBagMgr", "showBag url:%s", sVar.f358967b);
        if (!((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewBagMgr", "showBag: no float window permission");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(sVar.f358967b)) {
            j();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.bag.C19350xc6738d4f c19350xc6738d4f = this.f358976d;
        boolean z18 = c19350xc6738d4f == null;
        if (c19350xc6738d4f == null) {
            this.f358977e = new gx4.d(new gx4.p(this));
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.bag.C19350xc6738d4f c19350xc6738d4f2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.bag.C19350xc6738d4f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, null);
            this.f358976d = c19350xc6738d4f2;
            c19350xc6738d4f2.m74423xc6cf6336(new gx4.q(this));
            this.f358976d.setOnClickListener(new gx4.r(this));
        }
        n(1.0f);
        this.f358976d.m74424xbc91ffe0(true);
        this.f358976d.m74422x764b6bfb(sVar.f358968c);
        m();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewBagMgr", "bag showed needAttach:%b mCurrentBagId:%s", java.lang.Boolean.valueOf(z18), sVar.f358966a);
        if (z18) {
            if (!z17) {
                h();
                return;
            }
            this.f358976d.setVisibility(4);
            h();
            this.f358976d.setVisibility(0);
            this.f358976d.d();
            return;
        }
        if (this.f358976d.getVisibility() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewBagMgr", "already showed");
            return;
        }
        this.f358976d.setVisibility(0);
        if (z17) {
            this.f358976d.d();
        }
    }
}
