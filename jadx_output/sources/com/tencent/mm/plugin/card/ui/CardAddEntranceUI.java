package com.tencent.mm.plugin.card.ui;

@db5.a(3)
/* loaded from: classes8.dex */
public class CardAddEntranceUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f94748f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f94749g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f94746d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f94747e = "";

    /* renamed from: h, reason: collision with root package name */
    public int f94750h = 8;

    /* renamed from: i, reason: collision with root package name */
    public int f94751i = 0;

    public final void T6(int i17, java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("_wxapi_add_card_to_wx_card_list", str);
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str2 = this.f94748f;
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str2);
        com.tencent.mm.opensdk.modelbiz.AddCardToWXCardPackage.Resp resp = new com.tencent.mm.opensdk.modelbiz.AddCardToWXCardPackage.Resp(bundle);
        if (h17 != null) {
            resp.openId = h17.field_openId;
        }
        java.lang.String str3 = this.f94749g;
        resp.transaction = str3;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = this.f94748f;
        objArr[1] = h17 == null ? "null appinfo" : h17.field_appName;
        objArr[2] = h17 != null ? h17.field_openId : "null appinfo";
        objArr[3] = str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardAddEntranceUI", "setResultToSDK, appid : %s, appname : %s, openid : %s, transcation : %s", objArr);
        resp.toBundle(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.CardAddEntranceUI", "setResultToSDK result:" + i17);
        if (i17 == -1) {
            resp.errCode = 0;
        } else {
            resp.errCode = -2;
        }
        com.tencent.mm.opensdk.channel.MMessageActV2.Args args = new com.tencent.mm.opensdk.channel.MMessageActV2.Args();
        args.targetPkgName = this.f94747e;
        args.bundle = bundle;
        com.tencent.mm.pluginsdk.model.app.j1.g(bundle);
        com.tencent.mm.pluginsdk.model.app.j1.h(bundle);
        com.tencent.mm.opensdk.channel.MMessageActV2.send(com.tencent.mm.sdk.platformtools.x2.f193071a, args);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488276ou;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i18 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI RESULT_OK");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI RESULT_CANCELED");
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = this.f94746d.iterator();
        while (it.hasNext()) {
            r45.hu huVar = (r45.hu) it.next();
            xt1.g gVar = new xt1.g();
            gVar.f376446d = huVar.f376446d;
            gVar.f376447e = huVar.f376447e;
            linkedList.add(gVar);
        }
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI REQUEST_CARD_DETAIL");
            int i19 = this.f94750h;
            if (i19 == 7 || i19 == 16) {
                android.content.Intent intent2 = new android.content.Intent();
                if (i18 == -1) {
                    if (intent != null && linkedList.size() > 0) {
                        ((xt1.g) linkedList.get(0)).f456477f = intent.getStringExtra("key_code");
                    }
                    intent2.putExtra("card_list", lu1.v.b(linkedList, true, this.f94750h));
                    setResult(-1, intent2);
                } else if (i18 == 0) {
                    intent2.putExtra("card_list", lu1.v.b(linkedList, false, this.f94750h));
                    setResult(0, intent2);
                }
            } else if (i19 == 26) {
                android.content.Intent intent3 = new android.content.Intent();
                if (i18 == -1) {
                    if (intent != null && linkedList.size() > 0) {
                        ((xt1.g) linkedList.get(0)).f456477f = intent.getStringExtra("key_code");
                    }
                    intent3.putExtra("card_list", lu1.v.b(linkedList, true, this.f94750h));
                    setResult(-1, intent3);
                } else if (i18 == 0) {
                    intent3.putExtra("card_list", lu1.v.b(linkedList, false, this.f94750h));
                    setResult(0, intent3);
                }
            } else if (i18 == -1) {
                if (intent != null && linkedList.size() > 0) {
                    ((xt1.g) linkedList.get(0)).f456477f = intent.getStringExtra("key_code");
                }
                T6(-1, lu1.v.b(linkedList, true, this.f94750h));
            } else if (i18 == 0) {
                T6(0, lu1.v.b(linkedList, false, i19));
            }
        } else if (i17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI REQUEST_CARD_ACCEPT_CARD_LIST");
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("card_list") : "";
            int i27 = this.f94750h;
            if (i27 == 7 || i27 == 16) {
                android.content.Intent intent4 = new android.content.Intent();
                if (i18 != -1) {
                    if (i18 == 0) {
                        if (intent == null || android.text.TextUtils.isEmpty(stringExtra)) {
                            intent4.putExtra("card_list", lu1.v.b(linkedList, false, this.f94750h));
                            intent4.putExtra("result_code", 1);
                            setResult(0, intent4);
                        } else {
                            intent.putExtra("card_list", lu1.v.c(stringExtra, this.f94750h));
                            setResult(0, intent);
                        }
                    }
                } else if (intent == null || android.text.TextUtils.isEmpty(stringExtra)) {
                    intent4.putExtra("card_list", lu1.v.b(linkedList, true, this.f94750h));
                    setResult(-1, intent4);
                } else {
                    intent.putExtra("card_list", lu1.v.c(stringExtra, this.f94750h));
                    setResult(-1, intent);
                }
            } else if (i27 == 26) {
                android.content.Intent intent5 = new android.content.Intent();
                if (i18 != -1) {
                    if (i18 == 0) {
                        if (intent == null || android.text.TextUtils.isEmpty(stringExtra)) {
                            intent5.putExtra("card_list", lu1.v.b(linkedList, false, this.f94750h));
                            intent5.putExtra("result_code", 1);
                            setResult(0, intent5);
                        } else {
                            intent.putExtra("card_list", lu1.v.c(stringExtra, this.f94750h));
                            setResult(0, intent);
                        }
                    }
                } else if (intent == null || android.text.TextUtils.isEmpty(stringExtra)) {
                    intent5.putExtra("card_list", lu1.v.b(linkedList, true, this.f94750h));
                    setResult(-1, intent5);
                } else {
                    intent.putExtra("card_list", lu1.v.c(stringExtra, this.f94750h));
                    setResult(-1, intent);
                }
            } else if (i18 != -1) {
                if (i18 == 0) {
                    if (android.text.TextUtils.isEmpty(stringExtra)) {
                        T6(0, lu1.v.b(linkedList, false, this.f94750h));
                    } else {
                        T6(0, stringExtra);
                    }
                }
            } else if (android.text.TextUtils.isEmpty(stringExtra)) {
                T6(-1, lu1.v.b(linkedList, true, this.f94750h));
            } else {
                T6(-1, stringExtra);
            }
        }
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI onCreate() intent == null");
            setResult(0);
            finish();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI doRediect() handle data");
        java.lang.String stringExtra = intent.getStringExtra("key_in_card_list");
        this.f94750h = intent.getIntExtra("key_from_scene", 8);
        this.f94751i = intent.getIntExtra("key_stastic_scene", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.CardAddEntranceUI", "doRediect() from_scene:" + this.f94750h + "  from_origin_scene:" + this.f94751i);
        this.f94747e = intent.getStringExtra("key_package_name");
        java.lang.String stringExtra2 = intent.getStringExtra("key_sign");
        java.lang.String stringExtra3 = getIntent().getStringExtra("src_username");
        com.tencent.mars.xlog.Log.i("MicroMsg.CardAddEntranceUI", "doRediect() src_username:" + stringExtra3);
        java.lang.String stringExtra4 = getIntent().getStringExtra("js_url");
        this.f94748f = getIntent().getStringExtra("key_app_id");
        this.f94749g = getIntent().getStringExtra("key_transaction");
        java.lang.String stringExtra5 = getIntent().getStringExtra("key_consumed_card_id");
        com.tencent.mars.xlog.Log.i("MicroMsg.CardAddEntranceUI", "doRediect() consumedCardId:" + stringExtra5);
        java.lang.String stringExtra6 = getIntent().getStringExtra("key_template_id");
        java.util.ArrayList a17 = lu1.v.a(stringExtra, this.f94750h);
        if (a17 == null || a17.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI initView () tempList == null || tempList.size() == 0");
            setResult(0);
            finish();
            return;
        }
        java.util.LinkedList linkedList = this.f94746d;
        linkedList.clear();
        linkedList.addAll(a17);
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("key_from_scene", this.f94750h);
        intent2.putExtra("key_stastic_scene", this.f94751i);
        if (a17.size() != 1) {
            intent2.putExtra("key_in_card_list", stringExtra);
            intent2.putExtra("key_package_name", this.f94747e);
            intent2.putExtra("key_sign", stringExtra2);
            intent2.putExtra("src_username", stringExtra3);
            intent2.putExtra("js_url", stringExtra4);
            intent2.putExtra("key_consumed_card_id", stringExtra5);
            intent2.putExtra("key_template_id", stringExtra6);
            intent2.setClass(this, com.tencent.mm.plugin.card.ui.CardAcceptCardListUI.class);
            startActivityForResult(intent2, 2);
            return;
        }
        r45.hu huVar = (r45.hu) a17.get(0);
        intent2.putExtra("key_card_id", huVar.f376446d);
        intent2.putExtra("key_card_ext", huVar.f376447e);
        intent2.putExtra("src_username", stringExtra3);
        intent2.putExtra("js_url", stringExtra4);
        intent2.putExtra("key_consumed_card_id", stringExtra5);
        intent2.putExtra("key_template_id", stringExtra6);
        intent2.putExtra("key_from_appbrand_type", intent.getIntExtra("key_from_appbrand_type", 0));
        intent2.setClass(this, com.tencent.mm.plugin.card.ui.CardDetailUI.class);
        startActivityForResult(intent2, 1);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
