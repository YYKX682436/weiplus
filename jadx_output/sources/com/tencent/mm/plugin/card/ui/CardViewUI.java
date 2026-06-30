package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class CardViewUI extends com.tencent.mm.plugin.card.base.CardBaseUI {
    public int C;
    public int D;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f94916y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f94917z;

    /* renamed from: w, reason: collision with root package name */
    public int f94914w = 1;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f94915x = new java.util.LinkedList();
    public java.lang.String A = "";
    public java.lang.String B = "";

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public android.widget.BaseAdapter T6() {
        return this.f94914w == 0 ? new com.tencent.mm.plugin.card.ui.s2(getApplicationContext()) : super.T6();
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public xt1.r U6() {
        return xt1.r.CAN_GIFT_TYPE;
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public void V6() {
        int i17 = this.f94914w;
        if (i17 == 0) {
            setMMTitle(com.tencent.mm.R.string.aw7);
        } else if (i17 == 1) {
            setMMTitle(com.tencent.mm.R.string.asn);
        }
        gm0.j1.n().f273288b.a(1099, this);
        int i18 = this.f94914w;
        int i19 = com.tencent.mm.R.string.ar6;
        if (i18 == 0) {
            j7(true);
            r45.pd6 pd6Var = new r45.pd6();
            java.lang.String str = this.A;
            pd6Var.f382969d = str;
            com.tencent.mars.xlog.Log.i("MicroMsg.CardViewUI", "doBatchGetCardItemByTpInfo templateId:%s", str);
            gm0.j1.n().f273288b.g(new xt1.b0(this.f94915x, pd6Var, this.C));
        } else if (i18 == 1) {
            android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.f488336qi, null);
            this.f94917z = inflate;
            android.widget.LinearLayout linearLayout = this.f94635h;
            if (linearLayout != null) {
                linearLayout.addView(inflate);
            }
            i19 = com.tencent.mm.R.string.avm;
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.kbw);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardViewUI", "initBaseUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/card/ui/CardViewUI", "initBaseUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.kby)).setText(i19);
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public boolean Y6() {
        if (this.f94914w == 1) {
            return false;
        }
        return !(this instanceof com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI);
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public void a7(com.tencent.mm.plugin.card.model.CardInfo cardInfo) {
        if (this.f94914w == 1) {
            this.f94640p = cardInfo;
            k7(this.f94916y, 1, true);
            return;
        }
        super.a7(cardInfo);
        if (this.f94640p != null) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f94640p.s0().f388550i);
            com.tencent.mm.plugin.card.model.CardInfo cardInfo2 = this.f94640p;
            g0Var.d(11582, "OperGift", 4, valueOf, cardInfo2.field_card_tp_id, cardInfo2.field_card_id, this.f94916y);
        }
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public void b7(tt1.j jVar, int i17) {
        if (this.f94914w != 0) {
            super.b7(jVar, i17);
            return;
        }
        com.tencent.mm.plugin.card.model.CardInfo cardInfo = (com.tencent.mm.plugin.card.model.CardInfo) jVar;
        xt1.t0.Di().f449296b = cardInfo;
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.card.ui.CardDetailUI.class);
        intent.putExtra("key_card_id", cardInfo.field_card_id);
        intent.putExtra("key_from_scene", 51);
        intent.putExtra("key_from_appbrand_type", this.D);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardViewUI", "onGotoCardDetailUI", "(Lcom/tencent/mm/plugin/card/base/ICardInfo;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/card/ui/CardViewUI", "onGotoCardDetailUI", "(Lcom/tencent/mm/plugin/card/base/ICardInfo;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public void c7() {
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public void d7(tt1.j jVar, int i17) {
        if (this.f94914w == 1) {
            a7((com.tencent.mm.plugin.card.model.CardInfo) jVar);
        } else {
            super.d7(jVar, i17);
        }
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardViewUI", "onCreate intent is null");
            finish();
            return;
        }
        this.C = intent.getIntExtra("key_previous_scene", 7);
        this.D = intent.getIntExtra("key_from_appbrand_type", 0);
        this.f94914w = intent.getIntExtra("view_type", 0);
        this.f94916y = intent.getStringExtra("user_name");
        this.B = intent.getStringExtra("key_app_id");
        java.lang.String stringExtra = intent.getStringExtra("card_list");
        this.A = getIntent().getStringExtra("key_template_id");
        if (this.f94914w == 0) {
            if (android.text.TextUtils.isEmpty(stringExtra)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardViewUI", "oncreate card_list is empty");
                finish();
                return;
            }
            java.util.LinkedList a17 = lu1.x.a(stringExtra, this.C, this.B);
            if (a17 != null && a17.size() > 0) {
                java.util.LinkedList linkedList = this.f94915x;
                linkedList.clear();
                linkedList.addAll(a17);
            }
        }
        initView();
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.n().f273288b.q(1099, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI, com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof xt1.b0)) {
            super.onSceneEnd(i17, i18, str, m1Var);
            return;
        }
        j7(false);
        if (i17 != 0 || i18 != 0) {
            lu1.r.d(this, str, i18);
            return;
        }
        java.util.LinkedList linkedList = ((xt1.b0) m1Var).f456452f;
        if (linkedList == null || linkedList.size() <= 0) {
            return;
        }
        android.widget.BaseAdapter baseAdapter = this.f94632e;
        if (baseAdapter instanceof com.tencent.mm.plugin.card.ui.s2) {
            com.tencent.mm.plugin.card.ui.s2 s2Var = (com.tencent.mm.plugin.card.ui.s2) baseAdapter;
            java.util.ArrayList arrayList = (java.util.ArrayList) s2Var.f95155e;
            arrayList.clear();
            arrayList.addAll(linkedList);
            java.util.ArrayList arrayList2 = (java.util.ArrayList) s2Var.f95156f;
            arrayList2.clear();
            for (int i19 = 0; i19 < linkedList.size(); i19++) {
                arrayList2.add(java.lang.Boolean.TRUE);
            }
        }
        this.f94632e.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        super.onSwipeBack();
        if (this.C == 26) {
            overridePendingTransition(0, 0);
        }
    }
}
