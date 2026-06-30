package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class CardListSelectedUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0, wt1.a0 {
    public static final /* synthetic */ int K = 0;
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public int D;
    public java.lang.String E;
    public java.lang.String G;

    /* renamed from: J, reason: collision with root package name */
    public xt1.a f94872J;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f94874e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f94875f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RelativeLayout f94876g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f94877h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f94878i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.BaseAdapter f94879m;

    /* renamed from: t, reason: collision with root package name */
    public boolean f94886t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f94887u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f94888v;

    /* renamed from: w, reason: collision with root package name */
    public int f94889w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f94890x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f94891y;

    /* renamed from: z, reason: collision with root package name */
    public int f94892z;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f94873d = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f94880n = false;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f94881o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f94882p = new java.util.HashMap();

    /* renamed from: q, reason: collision with root package name */
    public boolean f94883q = true;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f94884r = null;

    /* renamed from: s, reason: collision with root package name */
    public boolean f94885s = false;
    public java.lang.String F = "";
    public boolean H = false;
    public int I = 0;

    @Override // wt1.a0
    public void A1(java.lang.String str, wt1.b0 b0Var, java.lang.String str2) {
        U6(false);
        if (!android.text.TextUtils.isEmpty(str) && !str.equals(this.f94872J.f456432j)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardListSelectedUI", "onMarkFail(), the mark card id is diff from current id!");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardListSelectedUI", "onMarkFail()");
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = getString(com.tencent.mm.R.string.atz);
        }
        lu1.r.c(this, str2);
    }

    @Override // wt1.a0
    public void C5(java.lang.String str, wt1.b0 b0Var) {
        java.util.HashMap hashMap;
        int i17 = 0;
        U6(false);
        if (!android.text.TextUtils.isEmpty(str) && !str.equals(this.f94872J.f456432j)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardListSelectedUI", "onMarkSuccess(), the mark card id is diff from current id!");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardListSelectedUI", "onMarkSuccess()");
        com.tencent.mars.xlog.Log.i("MicroMsg.CardListSelectedUI", "markSucc:" + b0Var.f449250b + " markCardId: " + b0Var.f449251c);
        if (b0Var.f449250b != 1) {
            lu1.r.c(this, getString(com.tencent.mm.R.string.f490796au0));
            return;
        }
        if (android.text.TextUtils.isEmpty(b0Var.f449251c) || str.equals(b0Var.f449251c)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardListSelectedUI", "markCardId is same as now id!");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardListSelectedUI", "markCardId is diff as now id!");
            int i18 = 0;
            while (true) {
                java.util.LinkedList linkedList = this.f94881o;
                if (i18 >= linkedList.size()) {
                    break;
                }
                if (((xt1.a) linkedList.get(i18)).f456432j == b0Var.f449251c) {
                    while (true) {
                        int size = linkedList.size();
                        hashMap = this.f94882p;
                        if (i17 >= size) {
                            break;
                        }
                        hashMap.put(java.lang.Integer.valueOf(i17), java.lang.Boolean.FALSE);
                        i17++;
                    }
                    hashMap.put(java.lang.Integer.valueOf(i18), java.lang.Boolean.TRUE);
                } else {
                    i18++;
                }
            }
        }
        x();
    }

    public final void T6() {
        if (this.f94885s) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardListSelectedUI", "doNetSceneGetShareCardsLayout, isDoingGetData is true");
            return;
        }
        if (this.f94884r == null) {
            this.f94886t = false;
            this.f94887u = false;
        }
        gm0.j1.n().f273288b.a(ib1.n.CTRL_INDEX, this);
        gm0.j1.n().f273288b.g(new xt1.q0(this.f94888v, this.f94889w, this.f94890x, this.f94891y, this.f94892z, this.A, this.B, this.C, this.f94884r));
        U6(true);
        this.f94885s = true;
        if (this.D == 1) {
            this.f94880n = true;
        }
    }

    public void U6(boolean z17) {
        if (z17) {
            this.f94873d = com.tencent.mm.ui.widget.dialog.u3.f(this, getString(com.tencent.mm.R.string.ggc), false, 0, null);
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f94873d;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        this.f94873d.dismiss();
        this.f94873d = null;
    }

    public final void V6(int i17, java.lang.String str) {
        if (this.I != 8) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardListSelectedUI", "setResultToSDK need MM_CARD_ITEM_FROM_SCENE_OPENAPI scene, the fromscene is " + this.I);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("_wxapi_choose_card_from_wx_card_list", str);
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str2 = this.f94888v;
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str2);
        com.tencent.mm.opensdk.modelbiz.ChooseCardFromWXCardPackage.Resp resp = new com.tencent.mm.opensdk.modelbiz.ChooseCardFromWXCardPackage.Resp(bundle);
        if (h17 != null) {
            resp.openId = h17.field_openId;
        }
        java.lang.String str3 = this.G;
        resp.transaction = str3;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = this.f94888v;
        objArr[1] = h17 == null ? "null appinfo" : h17.field_appName;
        objArr[2] = h17 != null ? h17.field_openId : "null appinfo";
        objArr[3] = str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardListSelectedUI", "setResultToSDK, appid : %s, appname : %s, openid : %s, transcation : %s", objArr);
        resp.toBundle(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.CardListSelectedUI", "setResultToSDK result:" + i17);
        if (i17 == -1) {
            resp.errCode = 0;
        } else {
            resp.errCode = -2;
        }
        com.tencent.mm.opensdk.channel.MMessageActV2.Args args = new com.tencent.mm.opensdk.channel.MMessageActV2.Args();
        args.targetPkgName = this.F;
        args.bundle = bundle;
        args.flags = 268435456;
        com.tencent.mm.pluginsdk.model.app.j1.g(bundle);
        com.tencent.mm.pluginsdk.model.app.j1.h(bundle);
        com.tencent.mm.opensdk.channel.MMessageActV2.send(com.tencent.mm.sdk.platformtools.x2.f193071a, args);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488339ql;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        if (this.H) {
            setMMTitle(com.tencent.mm.R.string.atu);
            setMMSubTitle(com.tencent.mm.R.string.ats);
        } else {
            setMMTitle(com.tencent.mm.R.string.att);
        }
        setBackBtn(new com.tencent.mm.plugin.card.ui.u2(this));
        if (!this.H) {
            addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490441v5), new com.tencent.mm.plugin.card.ui.v2(this));
            enableOptionMenu(false);
        }
        this.f94874e = (android.widget.ListView) findViewById(com.tencent.mm.R.id.bae);
        if (this.H) {
            this.f94879m = new com.tencent.mm.plugin.card.ui.b3(this);
        } else {
            this.f94879m = new com.tencent.mm.plugin.card.ui.a3(this);
        }
        this.f94874e.setAdapter((android.widget.ListAdapter) this.f94879m);
        this.f94874e.setOnItemClickListener(new com.tencent.mm.plugin.card.ui.w2(this));
        this.f94874e.setOnScrollListener(new com.tencent.mm.plugin.card.ui.x2(this));
        this.f94875f = findViewById(com.tencent.mm.R.id.cho);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kby);
        if (this.H) {
            textView.setText(getString(com.tencent.mm.R.string.aur));
        }
        this.f94876g = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.hfi);
        this.f94877h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hfz);
        this.f94878i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hfu);
        if (!this.H) {
            this.f94876g.setVisibility(8);
            return;
        }
        this.f94876g.setVisibility(0);
        this.f94877h.setOnClickListener(new com.tencent.mm.plugin.card.ui.y2(this));
        this.f94878i.setOnClickListener(new com.tencent.mm.plugin.card.ui.z2(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        wt1.c0 Ri = xt1.t0.Ri();
        if (Ri.f449259d == null) {
            Ri.f449259d = new java.util.ArrayList();
        }
        ((java.util.ArrayList) Ri.f449259d).add(new java.lang.ref.WeakReference(this));
        android.content.Intent intent = getIntent();
        com.tencent.mars.xlog.Log.i("MicroMsg.CardListSelectedUI", "initData()");
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardListSelectedUI", "doGetCardList()  intent == null");
            setResult(1);
            V6(1, "");
            finish();
        } else {
            this.I = intent.getIntExtra("key_from_scene", 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.CardListSelectedUI", "mFromScene:" + this.I);
            this.f94888v = intent.getStringExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID);
            this.f94889w = intent.getIntExtra("shop_id", 0);
            this.f94890x = intent.getStringExtra("sign_type");
            this.f94891y = intent.getStringExtra("card_sign");
            this.f94892z = intent.getIntExtra("time_stamp", 0);
            this.A = intent.getStringExtra("nonce_str");
            this.B = intent.getStringExtra("card_tp_id");
            this.C = intent.getStringExtra("card_type");
            this.D = intent.getIntExtra("can_multi_select", 0);
            this.F = intent.getStringExtra("key_package_name");
            this.G = intent.getStringExtra("key_transaction");
            com.tencent.mars.xlog.Log.i("MicroMsg.CardListSelectedUI", "app_id:" + this.f94888v + " shop_id:" + this.f94889w + " sign_type:" + this.f94890x + " time_stamp:" + this.f94892z);
            com.tencent.mars.xlog.Log.i("MicroMsg.CardListSelectedUI", "nonce_str:" + this.A + " card_tp_id:" + this.B + " card_type:" + this.C + " canMultiSelect:" + this.D + " packateName:" + this.F);
            if ("INVOICE".equalsIgnoreCase(this.C)) {
                this.H = true;
            }
            if (android.text.TextUtils.isEmpty(this.f94888v)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardListSelectedUI", "doGetCardList()  app_id is nulls");
                setResult(1);
                V6(1, "app_id  or card_sign is empty!");
                finish();
            }
        }
        T6();
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        xt1.t0.Ri().f(this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            setResult(0);
            V6(0, "");
            finish();
        }
        return super.onKeyDown(i17, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0085 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r10, int r11, java.lang.String r12, com.tencent.mm.modelbase.m1 r13) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.card.ui.CardListSelectedUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // wt1.a0
    public void p4(java.lang.String str, wt1.b0 b0Var) {
    }

    public final void x() {
        android.content.Intent intent = new android.content.Intent();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        while (true) {
            java.util.LinkedList linkedList = this.f94881o;
            if (i17 >= linkedList.size()) {
                break;
            }
            java.lang.Boolean bool = (java.lang.Boolean) this.f94882p.get(java.lang.Integer.valueOf(i17));
            if (bool != null && bool.booleanValue()) {
                arrayList.add((xt1.a) linkedList.get(i17));
            }
            i17++;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            if (i18 != 0) {
                sb6.append(",");
            }
            xt1.a aVar = (xt1.a) arrayList.get(i18);
            sb6.append("{\"card_id\":");
            sb6.append("\"" + aVar.f456423a + "\"");
            sb6.append(",\"encrypt_code\":");
            sb6.append("\"" + aVar.f456429g + "\"");
            if (this.H) {
                sb6.append(",\"app_id\":");
                sb6.append("\"" + aVar.f456431i + "\"");
            }
            sb6.append("}");
        }
        sb6.append("]");
        java.lang.String sb7 = sb6.toString();
        if (this.H) {
            intent.putExtra("choose_invoice_info", sb7);
        } else {
            intent.putExtra("choose_card_info", sb7);
        }
        setResult(-1, intent);
        V6(-1, sb7);
        finish();
    }
}
