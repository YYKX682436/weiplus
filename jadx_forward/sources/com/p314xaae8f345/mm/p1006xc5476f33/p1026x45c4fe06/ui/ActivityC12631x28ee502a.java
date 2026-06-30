package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/AppBrandAuthRealNameProxyEmptyUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthRealNameProxyEmptyUI */
/* loaded from: classes7.dex */
public final class ActivityC12631x28ee502a extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f170816d = 0;

    public final void T6() {
        com.p314xaae8f345.mm.ui.v9.e(getWindow());
        com.p314xaae8f345.mm.ui.v9.c(getWindow(), false);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        db5.f.c(this, null);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        boolean z17 = false;
        overridePendingTransition(0, 0);
        T6();
        android.content.Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("key_process_is_end", false)) {
            z17 = true;
        }
        if (z17) {
            finish();
            return;
        }
        android.content.Intent intent2 = getIntent();
        if (intent2 == null || (str = intent2.getStringExtra("action")) == null) {
            str = "";
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("startRealNameVerify", str)) {
            finish();
            return;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("realname_verify_process_jump_activity", ".ui.AppBrandAuthRealNameProxyEmptyUI");
        bundle2.putString("realname_verify_process_jump_plugin", "appbrand");
        bundle2.putInt("real_name_verify_mode", 4);
        bundle2.putInt("entry_scene", 1);
        ((ps4.g) ((o05.l) i95.n0.c(o05.l.class))).Bi(mo55332x76847179(), bundle2);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        T6();
    }
}
