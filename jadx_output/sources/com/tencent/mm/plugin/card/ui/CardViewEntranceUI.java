package com.tencent.mm.plugin.card.ui;

@db5.a(3)
/* loaded from: classes.dex */
public class CardViewEntranceUI extends com.tencent.mm.ui.MMActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488276ou;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardViewEntranceUI", "CardViewEntranceUI onCreate() intent == null");
            setResult(0, intent);
            finish();
            return;
        }
        int intExtra = intent.getIntExtra("key_from_scene", 50);
        com.tencent.mars.xlog.Log.i("MicroMsg.CardViewEntranceUI", "CardViewEntranceUI doRediect() handle data");
        java.lang.String stringExtra = intent.getStringExtra("card_list");
        java.lang.String stringExtra2 = intent.getStringExtra("key_app_id");
        if (android.text.TextUtils.isEmpty(stringExtra)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardViewEntranceUI", "CardViewEntranceUI oncreate card_list is empty");
            setResult(0, intent);
            finish();
            return;
        }
        java.util.LinkedList a17 = lu1.x.a(stringExtra, intExtra, stringExtra2);
        if (a17 == null || a17.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardViewEntranceUI", "CardViewEntranceUI oncreate tempList size is empty");
            setResult(0, intent);
            finish();
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        if (a17.size() == 1) {
            intent2.putExtra("card_list", stringExtra);
            intent2.putExtra("key_app_id", stringExtra2);
            intent2.putExtra("key_from_scene", 50);
            intent2.putExtra("key_previous_scene", intExtra);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(intent.getStringExtra("key_template_id"))) {
                intent2.putExtra("key_template_id", intent.getStringExtra("key_template_id"));
            }
            intent2.putExtra("key_from_appbrand_type", intent.getIntExtra("key_from_appbrand_type", 0));
            intent2.setClass(this, com.tencent.mm.plugin.card.ui.CardDetailUI.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardViewEntranceUI", "doRediect", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/card/ui/CardViewEntranceUI", "doRediect", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            intent2.putExtra("view_type", 0);
            intent2.putExtra("card_list", stringExtra);
            intent2.putExtra("key_previous_scene", intExtra);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(intent.getStringExtra("key_template_id"))) {
                intent2.putExtra("key_template_id", intent.getStringExtra("key_template_id"));
            }
            intent2.putExtra("key_app_id", stringExtra2);
            intent2.putExtra("key_from_appbrand_type", intent.getIntExtra("key_from_appbrand_type", 0));
            intent2.setClass(this, com.tencent.mm.plugin.card.ui.CardViewUI.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardViewEntranceUI", "doRediect", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/card/ui/CardViewEntranceUI", "doRediect", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.CardViewEntranceUI", "CardViewEntranceUI onCreate() parameter is ok");
        setResult(-1, intent);
        finish();
    }
}
