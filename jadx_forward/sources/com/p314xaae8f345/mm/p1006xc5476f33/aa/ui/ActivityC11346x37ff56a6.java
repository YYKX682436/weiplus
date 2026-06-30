package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAABeforeUI */
/* loaded from: classes9.dex */
public class ActivityC11346x37ff56a6 extends p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Dialog f154008d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f154009e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f154010f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f154011g = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.d2(this);

    public static void O6(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11346x37ff56a6 activityC11346x37ff56a6, boolean z17) {
        activityC11346x37ff56a6.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("cancel", z17);
        activityC11346x37ff56a6.setResult(-1, intent);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        com.p314xaae8f345.mm.ui.bk.p0(this, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        gm0.j1.i();
        gm0.j1.n().f354821b.a(1809, this.f154011g);
        this.f154009e = getIntent().getStringExtra("pfOrderNo");
        this.f154010f = getIntent().getStringExtra("appid");
        this.f154008d = db5.e1.O(this, null, 3, com.p314xaae8f345.mm.R.C30868x68b1db1.f575789i6, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.e2(this));
        i61.p pVar = new i61.p(this.f154009e, this.f154010f);
        gm0.j1.i();
        gm0.j1.n().f354821b.g(pVar);
        setResult(0);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.i();
        gm0.j1.n().f354821b.q(1809, this.f154011g);
        super.onDestroy();
    }
}
