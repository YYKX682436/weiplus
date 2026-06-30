package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1233x94a68aec.p1234xc2079749.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WmpfVoipCallInProxyActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.wmpfvoip.notify.ui.WmpfVoipCallInProxyActivity */
/* loaded from: classes14.dex */
public final class ActivityC12814x2e180d6e extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        com.p314xaae8f345.mm.ui.bk.j0(this);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        if (getIntent() == null) {
            finish();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WmpfVoipCallInProxyActivity", "onCreate");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WMPFVoip.WmpfVoipWindowFlags", "add, activity: " + this);
        android.view.Window window = getWindow();
        if (window != null) {
            window.addFlags(6815744);
        }
        android.content.Intent intent = getIntent();
        java.lang.String appId = intent != null ? intent.getStringExtra("extra_appid") : null;
        android.content.Intent intent2 = getIntent();
        java.lang.String stringExtra = intent2 != null ? intent2.getStringExtra("extra_enter_path") : null;
        android.content.Intent intent3 = getIntent();
        java.lang.Integer valueOf = intent3 != null ? java.lang.Integer.valueOf(intent3.getIntExtra("version_type", 0)) : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
        int intValue = valueOf.intValue();
        android.content.Intent intent4 = getIntent();
        java.lang.Long valueOf2 = intent4 != null ? java.lang.Long.valueOf(intent4.getLongExtra("calling_instance_id", -1L)) : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf2);
        long longValue = valueOf2.longValue();
        android.content.Intent intent5 = getIntent();
        java.lang.Integer valueOf3 = intent5 != null ? java.lang.Integer.valueOf(intent5.getIntExtra("extra_enter_scene", 2)) : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf3);
        valueOf3.intValue();
        android.content.Intent intent6 = getIntent();
        if (intent6 == null || (str = intent6.getStringExtra("extra_roomid")) == null) {
            str = "";
        }
        android.content.Intent intent7 = getIntent();
        long longExtra = intent7 != null ? intent7.getLongExtra("extra_msg_id", -1L) : -1L;
        android.content.Intent intent8 = getIntent();
        int intExtra = intent8 != null ? intent8.getIntExtra("extra_create_time", -1) : -1;
        if (!(appId == null || appId.length() == 0)) {
            if (!(stringExtra == null || stringExtra.length() == 0)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(28142, str, 6, appId, java.lang.Long.valueOf(longExtra), java.lang.Long.valueOf(intExtra));
                cm1.t.f124849a.a(this, appId, stringExtra, intValue, longValue, new dm1.o(appId, longValue, this));
                if (((uf0.e) i95.n0.c(uf0.e.class)) != null) {
                    ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) mo3.f.f411939a).f(41);
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WmpfVoipCallInProxyActivity", "appId or enterPath is null");
        finish();
    }
}
