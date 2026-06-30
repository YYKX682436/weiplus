package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

@gm0.a2
/* renamed from: com.tencent.mm.plugin.aa.ui.AAEntranceUI */
/* loaded from: classes3.dex */
public class ActivityC11338x9bb0fc0a extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f153959f = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f153960d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f153961e;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569396a0;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i18 != -1) {
            return;
        }
        if (i17 == 1) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AAEntranceUI", "select chatroom：%s", stringExtra);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                android.content.Intent intent2 = new android.content.Intent(mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907.class);
                intent2.putExtra("enter_scene", 2);
                intent2.putExtra("chatroom_name", stringExtra);
                if (getIntent().getExtras() != null) {
                    intent2.putExtras(getIntent().getExtras());
                }
                startActivityForResult(intent2, 2);
            }
        } else if (i17 == 2) {
            finish();
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m78503xa10faa4c(true);
        super.onCreate(bundle);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78530x8b45058f();
        mo54450xbf7c1df6("");
        this.f153960d = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.hu8);
        this.f153961e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.bs9);
        this.f153960d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.c(this));
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.b6s);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.w0(this.f153961e, string, 0, string.length(), new com.p314xaae8f345.mm.p2802xd031a825.ui.a0((com.p314xaae8f345.mm.p2802xd031a825.ui.z) new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.d(this), true), mo55332x76847179());
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.e(this));
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f563823ae)).getPaint(), 0.8f);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(h61.b.class);
    }
}
