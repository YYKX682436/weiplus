package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2421x2dcbb45b;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.emojistore.BaseEmojiStoreSearchWebViewUI */
/* loaded from: classes8.dex */
public class ActivityC19359xdcffabf9 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d implements com.p314xaae8f345.mm.ui.p2740x696c9db.b9 {
    public com.p314xaae8f345.mm.ui.p2740x696c9db.c9 A3;
    public java.lang.String B3;
    public int C3;
    public boolean D3;
    public boolean E3 = true;
    public int F3;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public void B8() {
        super.B8();
        this.B3 = getIntent().getStringExtra("keyword");
        this.C3 = getIntent().getIntExtra("type", 0);
        this.D3 = getIntent().getBooleanExtra("showkeyboard", false);
        this.F3 = getIntent().getIntExtra("sence", 0);
        this.f265348f.setOnTouchListener(new nx4.a(this));
        com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.c9();
        this.A3 = c9Var;
        m78489xd6d59aa8(true, c9Var);
        this.A3.c(false);
        this.A3.f291857i = this;
        mo74408xb0dfae51(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.s7 s7Var = this.f265337a3;
        if (s7Var != null) {
            s7Var.e(true);
        }
        this.f265348f.setOnLongClickListener(new nx4.b(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void H0() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void P4(java.lang.String str) {
        if (this.E3 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.E3 = false;
            if (!this.D3) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new nx4.c(this), 500L);
                return;
            }
            com.p314xaae8f345.mm.ui.p2740x696c9db.o3 o3Var = this.A3.f291856h;
            if (o3Var != null) {
                o3Var.d();
            }
            mo26063x7b383410();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public void Q7(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.BaseEmojiStoreSearchWebViewUI", "handleEmojiStoreAction action:%d", java.lang.Integer.valueOf(i17));
        switch (i17) {
            case com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54070x4810c209 /* 80001 */:
                java.lang.String string = bundle.getString("emoji_store_json_data");
                boolean z17 = bundle.getBoolean("emoji_store_new_query", true);
                java.lang.String string2 = bundle.getString("emoji_store_page_buf");
                long j17 = bundle.getLong("emoji_store_search_id");
                nw4.n nVar = this.f265377p0;
                if (!nVar.f422428i) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "onEmojiStoreGetSearchData fail, not ready");
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandler", "onEmojiStoreGetSearchData success, ready");
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("json", string);
                hashMap.put("newQuery", java.lang.Boolean.valueOf(z17));
                hashMap.put("nextPageBuffer", string2);
                nVar.O = j17;
                java.lang.String c17 = nw4.x2.c("getSearchEmotionDataCallBack", hashMap, nVar.f422436q, nVar.f422437r);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandler", "event:%s", c17);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new nw4.z1(nVar, c17));
                return;
            case 80002:
                this.f265377p0.F(true);
                return;
            default:
                super.Q7(i17, bundle);
                return;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void V5() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e76 = super.e7();
        e76.C(new nx4.e(this, null));
        return e76;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public boolean e8() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a8t;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public boolean n5(java.lang.String str) {
        if (str != null) {
            str = str.trim();
        }
        this.B3 = str;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.B3 = str;
            this.Q2.mo50293x3498a0(new nx4.d(this));
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("type", this.C3);
            bundle.putString("nextPageBuffer", "");
            bundle.putString("keyword", this.B3);
            bundle.putInt("webview_instance_id", hashCode());
            bundle.putLong("searchID", this.f265377p0.O);
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 v0Var = this.K1;
                if (v0Var != null) {
                    v0Var.j7(1, bundle);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.BaseEmojiStoreSearchWebViewUI", "invoker should not be null");
                }
            } catch (android.os.RemoteException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.emoji.BaseEmojiStoreSearchWebViewUI", e17, "doSearch", new java.lang.Object[0]);
            }
        }
        mo48674x36654fab();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13054, java.lang.Integer.valueOf(this.F3), 1, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? "" : str.replace(",", " "));
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public void o8() {
        finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = this.A3;
        if (c9Var == null) {
            return true;
        }
        c9Var.j(this, menu);
        this.A3.q(getString(com.p314xaae8f345.mm.R.C30867xcad56011.bxt));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public boolean t8() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void v() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.o3 o3Var = this.A3.f291856h;
        if (o3Var != null) {
            o3Var.d();
        }
        mo26063x7b383410();
    }
}
