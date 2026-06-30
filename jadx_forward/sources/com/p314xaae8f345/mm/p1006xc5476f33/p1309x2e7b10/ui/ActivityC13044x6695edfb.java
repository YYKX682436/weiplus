package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.card.ui.CardAddEntranceUI */
/* loaded from: classes8.dex */
public class ActivityC13044x6695edfb extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f176281f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f176282g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f176279d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f176280e = "";

    /* renamed from: h, reason: collision with root package name */
    public int f176283h = 8;

    /* renamed from: i, reason: collision with root package name */
    public int f176284i = 0;

    public final void T6(int i17, java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("_wxapi_add_card_to_wx_card_list", str);
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str2 = this.f176281f;
        ((kt.c) i0Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str2);
        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11231x5a668f69.Resp resp = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11231x5a668f69.Resp(bundle);
        if (h17 != null) {
            resp.f32869xc3c3c505 = h17.f67384x996f3ea;
        }
        java.lang.String str3 = this.f176282g;
        resp.f32870x7fa0d2de = str3;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = this.f176281f;
        objArr[1] = h17 == null ? "null appinfo" : h17.f67372x453d1e07;
        objArr[2] = h17 != null ? h17.f67384x996f3ea : "null appinfo";
        objArr[3] = str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAddEntranceUI", "setResultToSDK, appid : %s, appname : %s, openid : %s, transcation : %s", objArr);
        resp.mo48431x792022dd(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAddEntranceUI", "setResultToSDK result:" + i17);
        if (i17 == -1) {
            resp.f32867xa7c470f2 = 0;
        } else {
            resp.f32867xa7c470f2 = -2;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args args = new com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args();
        args.f32706x6a744ba6 = this.f176280e;
        args.f32701xaddf3082 = bundle;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.g(bundle);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.h(bundle);
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.m48400x35cf88(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, args);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569809ou;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i18 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI RESULT_OK");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI RESULT_CANCELED");
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = this.f176279d.iterator();
        while (it.hasNext()) {
            r45.hu huVar = (r45.hu) it.next();
            xt1.g gVar = new xt1.g();
            gVar.f457979d = huVar.f457979d;
            gVar.f457980e = huVar.f457980e;
            linkedList.add(gVar);
        }
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI REQUEST_CARD_DETAIL");
            int i19 = this.f176283h;
            if (i19 == 7 || i19 == 16) {
                android.content.Intent intent2 = new android.content.Intent();
                if (i18 == -1) {
                    if (intent != null && linkedList.size() > 0) {
                        ((xt1.g) linkedList.get(0)).f538010f = intent.getStringExtra("key_code");
                    }
                    intent2.putExtra("card_list", lu1.v.b(linkedList, true, this.f176283h));
                    setResult(-1, intent2);
                } else if (i18 == 0) {
                    intent2.putExtra("card_list", lu1.v.b(linkedList, false, this.f176283h));
                    setResult(0, intent2);
                }
            } else if (i19 == 26) {
                android.content.Intent intent3 = new android.content.Intent();
                if (i18 == -1) {
                    if (intent != null && linkedList.size() > 0) {
                        ((xt1.g) linkedList.get(0)).f538010f = intent.getStringExtra("key_code");
                    }
                    intent3.putExtra("card_list", lu1.v.b(linkedList, true, this.f176283h));
                    setResult(-1, intent3);
                } else if (i18 == 0) {
                    intent3.putExtra("card_list", lu1.v.b(linkedList, false, this.f176283h));
                    setResult(0, intent3);
                }
            } else if (i18 == -1) {
                if (intent != null && linkedList.size() > 0) {
                    ((xt1.g) linkedList.get(0)).f538010f = intent.getStringExtra("key_code");
                }
                T6(-1, lu1.v.b(linkedList, true, this.f176283h));
            } else if (i18 == 0) {
                T6(0, lu1.v.b(linkedList, false, i19));
            }
        } else if (i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI REQUEST_CARD_ACCEPT_CARD_LIST");
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("card_list") : "";
            int i27 = this.f176283h;
            if (i27 == 7 || i27 == 16) {
                android.content.Intent intent4 = new android.content.Intent();
                if (i18 != -1) {
                    if (i18 == 0) {
                        if (intent == null || android.text.TextUtils.isEmpty(stringExtra)) {
                            intent4.putExtra("card_list", lu1.v.b(linkedList, false, this.f176283h));
                            intent4.putExtra("result_code", 1);
                            setResult(0, intent4);
                        } else {
                            intent.putExtra("card_list", lu1.v.c(stringExtra, this.f176283h));
                            setResult(0, intent);
                        }
                    }
                } else if (intent == null || android.text.TextUtils.isEmpty(stringExtra)) {
                    intent4.putExtra("card_list", lu1.v.b(linkedList, true, this.f176283h));
                    setResult(-1, intent4);
                } else {
                    intent.putExtra("card_list", lu1.v.c(stringExtra, this.f176283h));
                    setResult(-1, intent);
                }
            } else if (i27 == 26) {
                android.content.Intent intent5 = new android.content.Intent();
                if (i18 != -1) {
                    if (i18 == 0) {
                        if (intent == null || android.text.TextUtils.isEmpty(stringExtra)) {
                            intent5.putExtra("card_list", lu1.v.b(linkedList, false, this.f176283h));
                            intent5.putExtra("result_code", 1);
                            setResult(0, intent5);
                        } else {
                            intent.putExtra("card_list", lu1.v.c(stringExtra, this.f176283h));
                            setResult(0, intent);
                        }
                    }
                } else if (intent == null || android.text.TextUtils.isEmpty(stringExtra)) {
                    intent5.putExtra("card_list", lu1.v.b(linkedList, true, this.f176283h));
                    setResult(-1, intent5);
                } else {
                    intent.putExtra("card_list", lu1.v.c(stringExtra, this.f176283h));
                    setResult(-1, intent);
                }
            } else if (i18 != -1) {
                if (i18 == 0) {
                    if (android.text.TextUtils.isEmpty(stringExtra)) {
                        T6(0, lu1.v.b(linkedList, false, this.f176283h));
                    } else {
                        T6(0, stringExtra);
                    }
                }
            } else if (android.text.TextUtils.isEmpty(stringExtra)) {
                T6(-1, lu1.v.b(linkedList, true, this.f176283h));
            } else {
                T6(-1, stringExtra);
            }
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI onCreate() intent == null");
            setResult(0);
            finish();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI doRediect() handle data");
        java.lang.String stringExtra = intent.getStringExtra("key_in_card_list");
        this.f176283h = intent.getIntExtra("key_from_scene", 8);
        this.f176284i = intent.getIntExtra("key_stastic_scene", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAddEntranceUI", "doRediect() from_scene:" + this.f176283h + "  from_origin_scene:" + this.f176284i);
        this.f176280e = intent.getStringExtra("key_package_name");
        java.lang.String stringExtra2 = intent.getStringExtra("key_sign");
        java.lang.String stringExtra3 = getIntent().getStringExtra("src_username");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAddEntranceUI", "doRediect() src_username:" + stringExtra3);
        java.lang.String stringExtra4 = getIntent().getStringExtra("js_url");
        this.f176281f = getIntent().getStringExtra("key_app_id");
        this.f176282g = getIntent().getStringExtra("key_transaction");
        java.lang.String stringExtra5 = getIntent().getStringExtra("key_consumed_card_id");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAddEntranceUI", "doRediect() consumedCardId:" + stringExtra5);
        java.lang.String stringExtra6 = getIntent().getStringExtra("key_template_id");
        java.util.ArrayList a17 = lu1.v.a(stringExtra, this.f176283h);
        if (a17 == null || a17.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI initView () tempList == null || tempList.size() == 0");
            setResult(0);
            finish();
            return;
        }
        java.util.LinkedList linkedList = this.f176279d;
        linkedList.clear();
        linkedList.addAll(a17);
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("key_from_scene", this.f176283h);
        intent2.putExtra("key_stastic_scene", this.f176284i);
        if (a17.size() != 1) {
            intent2.putExtra("key_in_card_list", stringExtra);
            intent2.putExtra("key_package_name", this.f176280e);
            intent2.putExtra("key_sign", stringExtra2);
            intent2.putExtra("src_username", stringExtra3);
            intent2.putExtra("js_url", stringExtra4);
            intent2.putExtra("key_consumed_card_id", stringExtra5);
            intent2.putExtra("key_template_id", stringExtra6);
            intent2.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13043x76f8a15a.class);
            startActivityForResult(intent2, 2);
            return;
        }
        r45.hu huVar = (r45.hu) a17.get(0);
        intent2.putExtra("key_card_id", huVar.f457979d);
        intent2.putExtra("key_card_ext", huVar.f457980e);
        intent2.putExtra("src_username", stringExtra3);
        intent2.putExtra("js_url", stringExtra4);
        intent2.putExtra("key_consumed_card_id", stringExtra5);
        intent2.putExtra("key_template_id", stringExtra6);
        intent2.putExtra("key_from_appbrand_type", intent.getIntExtra("key_from_appbrand_type", 0));
        intent2.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5.class);
        startActivityForResult(intent2, 1);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
