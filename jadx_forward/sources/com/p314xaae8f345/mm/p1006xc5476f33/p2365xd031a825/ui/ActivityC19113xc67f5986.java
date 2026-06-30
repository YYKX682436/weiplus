package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI */
/* loaded from: classes9.dex */
public class ActivityC19113xc67f5986 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f261532d;

    /* renamed from: e, reason: collision with root package name */
    public com.p3249xcbb51f6b.p3252x9137034c.C28007xd683f79f f261533e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f261534f = true;

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.a();
        m83105x7498fe14().remove("key_bankcard_cropimg");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f571150d65;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        java.lang.String string = m83105x7498fe14().getString("key_bankcard_id");
        java.lang.String string2 = m83105x7498fe14().getString("key_bankcard_des");
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) m83105x7498fe14().getParcelable("key_bankcard_cropimg");
        if (android.text.TextUtils.isEmpty(string)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletConfirmCardIDUI", "cardID is empty");
            finish();
            return;
        }
        if (bitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletConfirmCardIDUI", "cardID bitmap is null");
            finish();
            return;
        }
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.kkd);
        this.f261532d = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.kao);
        com.p3249xcbb51f6b.p3252x9137034c.C28007xd683f79f c28007xd683f79f = (com.p3249xcbb51f6b.p3252x9137034c.C28007xd683f79f) findViewById(com.p314xaae8f345.mm.R.id.f565682d60);
        this.f261533e = c28007xd683f79f;
        c28007xd683f79f.m121690x765074af(string, string2);
        this.f39901x43041b74 = (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3) findViewById(com.p314xaae8f345.mm.R.id.f78324xe9b380d4);
        this.f39900xbab696ce = findViewById(com.p314xaae8f345.mm.R.id.o1v);
        ((android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.b_v)).setImageBitmap(bitmap);
        this.f261533e.m121688x94991269(this.f39901x43041b74);
        this.f39901x43041b74.m121476x53eb72f9(0);
        ((android.view.inputmethod.InputMethodManager) mo55332x76847179().getSystemService("input_method")).hideSoftInputFromWindow(this.f261533e.getWindowToken(), 0);
        android.view.View view = this.f39900xbab696ce;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletConfirmCardIDUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet_core/ui/WalletConfirmCardIDUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f261533e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d4(this));
        this.f261532d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.e4(this, this.f261533e.m121683x7d902dbb()));
        this.f39901x43041b74 = (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3) findViewById(com.p314xaae8f345.mm.R.id.f78324xe9b380d4);
        this.f39900xbab696ce = findViewById(com.p314xaae8f345.mm.R.id.o1v);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f78325xd41a9ed3);
        if (this.f39901x43041b74 != null && this.f39900xbab696ce != null) {
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.f4(this));
        }
        this.f261533e.setFocusable(false);
        this.f261533e.setFocusableInTouchMode(true);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: needConfirmFinish */
    public boolean mo73847x7d641a7d() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.c4(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        android.os.Bundle bundle = new android.os.Bundle();
        boolean z17 = m83105x7498fe14().getBoolean("key_is_reset_with_new_card", false);
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof ss4.z) {
                ss4.z zVar = (ss4.z) m1Var;
                bundle.putBoolean("key_need_area", zVar.f493685i == 1);
                bundle.putBoolean("key_need_profession", zVar.f493686m == 1);
                bundle.putParcelableArray("key_profession_list", zVar.f493687n);
                bundle.putBoolean("key_need_country", zVar.f493688o == 1);
                bundle.putStringArray("key_country_excludes", zVar.f493689p);
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c = zVar.f493681e;
                if (c19097xe6dc5b4c != null) {
                    if (c19097xe6dc5b4c.f261189p && c19097xe6dc5b4c.c()) {
                        db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.kfs, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
                        return true;
                    }
                    bundle.putBoolean("key_is_reset_with_new_card", z17);
                    bundle.putString("bank_name", zVar.f493681e.f261181e);
                    bundle.putParcelable("elemt_query", zVar.f493681e);
                    bundle.putString("key_card_id", this.f261533e.m121684x15a9108d(false));
                    com.p314xaae8f345.mm.p2802xd031a825.a.d(this, bundle);
                    return true;
                }
                bundle.putBoolean("key_is_reset_with_new_card", z17);
                bundle.putString("bank_name", "");
                bundle.putParcelable("elemt_query", new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c());
                bundle.putString("key_card_id", this.f261533e.m121684x15a9108d(false));
                com.p314xaae8f345.mm.p2802xd031a825.a.d(this, bundle);
            }
        } else if (i18 == 1 && (m1Var instanceof ss4.z)) {
            bundle.putString("bank_name", "");
            bundle.putBoolean("key_is_reset_with_new_card", z17);
            bundle.putParcelable("elemt_query", new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c());
            bundle.putString("key_card_id", this.f261533e.m121684x15a9108d(false));
            com.p314xaae8f345.mm.p2802xd031a825.a.d(this, bundle);
            return true;
        }
        return false;
    }
}
