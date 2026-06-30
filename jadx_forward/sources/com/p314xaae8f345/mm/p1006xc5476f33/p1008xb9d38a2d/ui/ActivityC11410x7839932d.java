package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.account.ui.LoginFastSwitchUI */
/* loaded from: classes4.dex */
public class ActivityC11410x7839932d extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f154848d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f154849e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f154850f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f154851g;

    /* renamed from: h, reason: collision with root package name */
    public final x51.c1 f154852h = new x51.c1();

    /* renamed from: i, reason: collision with root package name */
    public int f154853i = 200;

    public final void T6() {
        long j17;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginFastSwitchUI", "doCheckLogin %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.LoginFastSwitchUI$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11410x7839932d activityC11410x7839932d = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11410x7839932d.this;
                java.lang.String UUID = activityC11410x7839932d.f154850f;
                byte[] bArr = activityC11410x7839932d.f154851g;
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.C11412xb40e8d95 c11412xb40e8d95 = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.C11412xb40e8d95(activityC11410x7839932d);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(UUID, "UUID");
                p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(activityC11410x7839932d), p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new q61.a(UUID, bArr, c11412xb40e8d95, null), 2, null);
            }
        };
        int i17 = this.f154853i;
        if (i17 > 2000) {
            j17 = 2000;
        } else {
            int i18 = i17 + 200;
            this.f154853i = i18;
            j17 = i18;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnable, j17);
    }

    public void U6(java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(ya.b.f77504xbb80cbe3, false);
        intent.putExtra("err_msg", str);
        intent.putExtra("block", bool);
        intent.putExtra("show_toast", bool2);
        intent.putExtra("UUID", this.f154850f);
        setResult(-1, intent);
        finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559363co);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570763ej1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567235ud2);
        this.f154848d = textView;
        textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.paq));
        com.p314xaae8f345.mm.ui.bk.s0(this.f154848d.getPaint());
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f567234ud1);
        this.f154849e = button;
        button.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.pap));
        com.p314xaae8f345.mm.ui.bk.s0(this.f154849e.getPaint());
        this.f154849e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.h4(this));
        mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.i4(this), com.p314xaae8f345.mm.R.raw.f78350xe9269a14);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginFastSwitchUI", "onCreate");
        mo43517x10010bd5();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        android.content.Intent intent = getIntent();
        if (intent != null) {
            this.f154850f = intent.getStringExtra("UUID");
            this.f154851g = intent.getByteArrayExtra("NotifyKey");
            T6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        this.f154852h.c(this, i17, strArr, iArr);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
    }
}
