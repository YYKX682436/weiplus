package com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui;

/* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPaySelectCardTypeUI */
/* loaded from: classes9.dex */
public class ActivityC16106x38110247 extends com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.AbstractActivityC16095x9d29d312 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f223916i = 0;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f223917f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f223918g;

    /* renamed from: h, reason: collision with root package name */
    public int f223919h;

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16106x38110247 activityC16106x38110247, long j17, long j18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        activityC16106x38110247.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HoneyPaySelectCardTypeUI", "go to give card");
        android.content.Intent intent = new android.content.Intent(activityC16106x38110247, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16101x10c7b82.class);
        intent.putExtra("key_max_credit_line", j17);
        intent.putExtra("key_min_credit_line", j18);
        intent.putExtra("key_true_name", str);
        intent.putExtra("key_take_message", str2);
        intent.putExtra("key_username", str3);
        intent.putExtra("key_wishing", str4);
        intent.putExtra("key_icon_url", str5);
        intent.putExtra("key_cardtype", activityC16106x38110247.f223919h);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
            intent.putExtra("key_notice_item", str6);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC16106x38110247, arrayList.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPaySelectCardTypeUI", "gotoGiveCardUI", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16106x38110247.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC16106x38110247, "com/tencent/mm/plugin/honey_pay/ui/HoneyPaySelectCardTypeUI", "gotoGiveCardUI", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bjy;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f223917f = (android.widget.LinearLayout) $(com.p314xaae8f345.mm.R.id.h5d);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: needExecuteBackListener */
    public boolean mo48644xb863f65a() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1) {
            if (i18 == -1) {
                java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HoneyPaySelectCardTypeUI", "select friend: %s", stringExtra);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HoneyPaySelectCardTypeUI", "do check user: %s", stringExtra);
                r73.b bVar = new r73.b(stringExtra, this.f223919h);
                bVar.K(this);
                m83099x5406100e(bVar, true);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HoneyPaySelectCardTypeUI", "cancel add friend");
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.AbstractActivityC16095x9d29d312, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.view.View view;
        this.f223794e = com.p314xaae8f345.mm.R.C30859x5a72f63.f560767tm;
        super.onCreate(bundle);
        m83090x14f40144(2618);
        m83090x14f40144(2926);
        mo54450xbf7c1df6("");
        java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.p1777x633fb29.C16094x601fe117> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("key_card_type_list");
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            this.f223918g = new java.util.ArrayList();
            try {
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.p1777x633fb29.C16094x601fe117 c16094x601fe117 : parcelableArrayListExtra) {
                    r45.av3 av3Var = new r45.av3();
                    av3Var.mo11468x92b714fd(c16094x601fe117.f223792d);
                    this.f223918g.add(av3Var);
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.HoneyPaySelectCardTypeUI", e17, "", new java.lang.Object[0]);
            }
        }
        mo43517x10010bd5();
        this.f223917f.removeAllViews();
        java.util.List list = this.f223918g;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (r45.av3 av3Var2 : this.f223918g) {
            v73.p1 p1Var = new v73.p1(this, null);
            if (av3Var2.f451809i == null) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
                view = android.view.LayoutInflater.from(mo55332x76847179).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bjw, (android.view.ViewGroup) this.f223917f, false);
                p1Var.a(view, av3Var2);
            } else {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
                android.view.View inflate = android.view.LayoutInflater.from(mo55332x768471792).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bjx, (android.view.ViewGroup) this.f223917f, false);
                p1Var.a(inflate, av3Var2);
                p1Var.f515261d = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) inflate.findViewById(com.p314xaae8f345.mm.R.id.h5b);
                p1Var.f515262e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.h5c);
                p1Var.f515261d.m75396xca029dad(av3Var2.f451809i.f473908g);
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                spannableStringBuilder.append((java.lang.CharSequence) av3Var2.f451809i.f473905d);
                spannableStringBuilder.append((java.lang.CharSequence) av3Var2.f451809i.f473906e);
                spannableStringBuilder.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7(2, new v73.n1(p1Var, av3Var2, mo55332x768471792)), av3Var2.f451809i.f473905d.length(), spannableStringBuilder.length(), 34);
                p1Var.f515262e.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(mo55332x768471792));
                p1Var.f515262e.setClickable(true);
                p1Var.f515262e.setText(spannableStringBuilder);
                view = inflate;
            }
            this.f223917f.addView(view);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        m83121xf6ff5b27(2618);
        m83121xf6ff5b27(2926);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof r73.b)) {
            return true;
        }
        r73.b bVar = (r73.b) m1Var;
        bVar.O(new v73.m1(this, bVar));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(v73.s1.class);
    }
}
