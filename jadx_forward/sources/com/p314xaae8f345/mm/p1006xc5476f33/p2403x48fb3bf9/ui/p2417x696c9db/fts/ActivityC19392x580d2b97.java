package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppSearchWebViewUI */
/* loaded from: classes8.dex */
public class ActivityC19392x580d2b97 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19391xc941d0e {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19391xc941d0e, tj5.n
    public boolean G0() {
        java.util.ArrayList<java.lang.String> stringArrayListExtra;
        tj5.z zVar = this.F4;
        if (zVar != null) {
            zVar.mo81005xdc5215a6().d();
        }
        int intExtra = getIntent().getIntExtra(com.p314xaae8f345.mm.ui.w2.f292734n, 0);
        if (intExtra != 0 && (stringArrayListExtra = getIntent().getStringArrayListExtra(com.p314xaae8f345.mm.ui.w2.f292735o)) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(intExtra, stringArrayListExtra);
        }
        super.G0();
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74
    public android.graphics.drawable.Drawable M9(int i17) {
        return this.f265788l4 ? getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80357xc7839d17) : super.M9(i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19391xc941d0e
    public java.lang.String ga() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f265791p4)) {
            return this.f265791p4;
        }
        boolean z17 = this.f265788l4;
        int i17 = com.p314xaae8f345.mm.R.C30867xcad56011.l5_;
        if (z17) {
            if (this.I4 != 8) {
                return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572082y8);
            }
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572082y8) + getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5_);
        }
        java.lang.String stringExtra = getIntent().getStringExtra("key_search_input_hint");
        if (!android.text.TextUtils.isEmpty(stringExtra)) {
            return stringExtra;
        }
        int i18 = this.I4;
        if (i18 == 1) {
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.id8;
        } else if (i18 == 2) {
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.id7;
        } else if (i18 != 8) {
            if (i18 != 16) {
                if (i18 != 64) {
                    if (i18 == 128) {
                        i17 = com.p314xaae8f345.mm.R.C30867xcad56011.ffs;
                    } else if (i18 == 256 || i18 == 384) {
                        i17 = com.p314xaae8f345.mm.R.C30867xcad56011.ffr;
                    } else if (i18 == 512) {
                        i17 = com.p314xaae8f345.mm.R.C30867xcad56011.f573691fg1;
                    } else if (i18 == 1024) {
                        i17 = com.p314xaae8f345.mm.R.C30867xcad56011.f573692fg2;
                    } else if (i18 != 262208) {
                        i17 = -1;
                    }
                }
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.f571648lc;
            } else {
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.f573693fg3;
            }
        }
        int i19 = this.K4;
        if (i19 == 56) {
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.ids;
        }
        if (i18 == 0 && (i19 == 135 || i19 == 136 || i19 == 137 || i19 == 244)) {
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.idt;
        }
        return i17 < 0 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572082y8) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.id6, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(i17));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceUIMode */
    public int mo48756xbf6603cc() {
        if (this.J4) {
            return 1;
        }
        return super.mo48756xbf6603cc();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19391xc941d0e, tj5.y
    /* renamed from: onClickCancelBtn */
    public void mo74458x91b34899(android.view.View view) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f265779c4);
        java.util.HashMap hashMap = this.f265794s4;
        if (K0) {
            hashMap.put("query", N9());
        } else {
            hashMap.put("query", this.f265779c4);
        }
        hashMap.put("exittype", "5");
        super.mo74458x91b34899(view);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19391xc941d0e, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (fp.h.c(23)) {
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                Q8(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ael), false);
            } else {
                Q8(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aem), false);
            }
        }
        if (this.J4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWeAppSearchWebViewUI", "isforceShowNightMode.");
            tj5.z zVar = this.F4;
            if (zVar == null || zVar.mo81005xdc5215a6() == null) {
                return;
            }
            this.F4.mo81005xdc5215a6().f291348f.getDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19391xc941d0e, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        su4.k3.l();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19391xc941d0e, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59;
        if (this.J4 && (c22633x83752a59 = this.f265348f) != null) {
            c22633x83752a59.mo120153xd15cf999().B(2);
        }
        super.onResume();
        su4.k3.f494512a.f494499c = java.lang.System.currentTimeMillis();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public void q8(int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f265348f;
        if (c22633x83752a59 == null || c22633x83752a59.mo120153xd15cf999() == null) {
            return;
        }
        mo55332x76847179().getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0);
        float b17 = j65.c.b(mo55332x76847179());
        if (b17 >= i65.a.v(mo55332x76847179())) {
            this.f265348f.mo120153xd15cf999().O(140);
            return;
        }
        if (b17 >= i65.a.u(mo55332x76847179())) {
            this.f265348f.mo120153xd15cf999().O(140);
            return;
        }
        if (b17 >= i65.a.t(mo55332x76847179())) {
            this.f265348f.mo120153xd15cf999().O(140);
            return;
        }
        if (b17 >= i65.a.s(mo55332x76847179())) {
            this.f265348f.mo120153xd15cf999().O(130);
            return;
        }
        if (b17 >= i65.a.z(mo55332x76847179())) {
            this.f265348f.mo120153xd15cf999().O(120);
            return;
        }
        if (b17 >= i65.a.w(mo55332x76847179())) {
            this.f265348f.mo120153xd15cf999().O(110);
            return;
        }
        i65.a.x(mo55332x76847179());
        if (b17 >= 1.0f) {
            this.f265348f.mo120153xd15cf999().O(100);
        } else if (b17 >= i65.a.y(mo55332x76847179())) {
            this.f265348f.mo120153xd15cf999().O(90);
        } else {
            this.f265348f.mo120153xd15cf999().O(80);
        }
    }
}
