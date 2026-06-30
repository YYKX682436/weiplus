package com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingChooseUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingChooseUI */
/* loaded from: classes12.dex */
public final class ActivityC13114x1e1a279a extends com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 {

    /* renamed from: d, reason: collision with root package name */
    public int f177255d;

    /* renamed from: e, reason: collision with root package name */
    public long f177256e;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570149a15;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i18 == -1 && intent != null) {
            this.f177256e += intent.getLongExtra("tds", 0L);
            setResult(-1, new android.content.Intent().putExtra("tds", this.f177256e));
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo78530x8b45058f();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.bxx);
        mo54448x9c8c0d33(new cw1.g3(this));
        this.f177255d = getIntent().getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        yv1.g1 b17 = yv1.g1.f547573p.b(getIntent().getIntExtra("session", -1));
        boolean booleanExtra = getIntent().getBooleanExtra("withOrigin", true);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.u07);
        findViewById.setOnClickListener(new cw1.h3(this, booleanExtra));
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.u09);
        findViewById2.setOnClickListener(new cw1.i3(this));
        cw1.u3 u3Var = cw1.q4.f304796s;
        cw1.e4 e4Var = (cw1.e4) cw1.q4.f304797t.get(new cw1.i4(null, null, ot1.h.Q, new long[]{0, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697}, 0, null, 0, booleanExtra, false, false));
        if (e4Var != null) {
            if (yv1.h1.f547600c) {
                e4Var.f106365e = true;
            }
            e4Var.d();
        }
        mt1.b0.s(28, 0L, new java.lang.Long[0]);
        dy1.a.f(this, iy1.c.ChatHistoryManagePage);
        java.lang.String str = b17.f547576b;
        dy1.a.g(this, "storage_manage_sessionid", str);
        dy1.a.h(this, 4, 32903);
        dy1.a.i(findViewById, "sort_by_chat_size_chat_history");
        dy1.a.j(findViewById, "storage_manage_sessionid", str);
        dy1.a.l(findViewById, 8, 32903);
        dy1.a.i(findViewById2, "sort_by_file_size_chat_history");
        dy1.a.j(findViewById2, "storage_manage_sessionid", str);
        dy1.a.l(findViewById2, 8, 32903);
    }
}
