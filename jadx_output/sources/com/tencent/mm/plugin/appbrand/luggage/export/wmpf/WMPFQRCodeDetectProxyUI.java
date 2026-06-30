package com.tencent.mm.plugin.appbrand.luggage.export.wmpf;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/luggage/export/wmpf/WMPFQRCodeDetectProxyUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "bh1/b", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class WMPFQRCodeDetectProxyUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: e, reason: collision with root package name */
    public static final bh1.b f85675e = new bh1.b(null);

    /* renamed from: d, reason: collision with root package name */
    public boolean f85676d;

    public static final void T6(android.content.Context context, java.lang.String str) {
        f85675e.a(context, str);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WMPFQRCodeDetectProxyUI", "finish() " + hashCode() + ' ' + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WMPFQRCodeDetectProxyUI", "onCreate " + hashCode());
        super.onCreate(bundle);
        android.content.UriMatcher uriMatcher = com.tencent.mm.plugin.appbrand.luggage.export.wmpf.WMPFAccessibleProvider.f85673d;
        if (!com.tencent.mm.plugin.appbrand.luggage.export.wmpf.WMPFAccessibleProvider.f85674e) {
            finish();
            return;
        }
        android.content.Intent intent = getIntent();
        final java.lang.String stringExtra = intent != null ? intent.getStringExtra("KEY_QRCODE_PATH") : null;
        if ((stringExtra == null || stringExtra.length() == 0) || !com.tencent.mm.vfs.w6.j(stringExtra)) {
            finish();
            return;
        }
        db5.e1.Q(this, "正在识别...", "", true, false, bh1.c.f20849d);
        com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent();
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent>() { // from class: com.tencent.mm.plugin.appbrand.luggage.export.wmpf.WMPFQRCodeDetectProxyUI$onCreate$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(com.tencent.mm.plugin.appbrand.luggage.export.wmpf.WMPFQRCodeDetectProxyUI.this);
                this.__eventId = 812146647;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent) {
                com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent event = recogQBarOfImageFileResultEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.cq cqVar = event.f54661g;
                java.lang.String str = cqVar != null ? cqVar.f6368a : null;
                java.lang.String str2 = stringExtra;
                if (!kotlin.jvm.internal.o.b(str2, str)) {
                    return false;
                }
                com.tencent.mm.pluginsdk.ui.tools.s6 s6Var = com.tencent.mm.pluginsdk.ui.tools.s6.f191898a;
                int c17 = s6Var.c(event);
                java.lang.String e17 = s6Var.e(event);
                int d17 = s6Var.d(event);
                com.tencent.mm.autogen.events.DealQBarStrEvent dealQBarStrEvent = new com.tencent.mm.autogen.events.DealQBarStrEvent();
                com.tencent.mm.plugin.appbrand.luggage.export.wmpf.WMPFQRCodeDetectProxyUI wMPFQRCodeDetectProxyUI = com.tencent.mm.plugin.appbrand.luggage.export.wmpf.WMPFQRCodeDetectProxyUI.this;
                am.r3 r3Var = dealQBarStrEvent.f54079g;
                r3Var.f7781b = wMPFQRCodeDetectProxyUI;
                r3Var.f7780a = e17;
                r3Var.f7782c = c17;
                r3Var.f7783d = d17;
                r3Var.f7788i = 4;
                r3Var.f7792m = str2;
                r3Var.f7794o = true;
                r3Var.f7796q = com.tencent.mm.pluginsdk.ui.tools.s6.b(event);
                dealQBarStrEvent.e();
                return true;
            }
        }.alive();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        am.aq aqVar = recogQBarOfImageFileEvent.f54659g;
        aqVar.f6174a = currentTimeMillis;
        aqVar.f6175b = stringExtra;
        aqVar.f6177d = new java.util.HashSet();
        recogQBarOfImageFileEvent.e();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WMPFQRCodeDetectProxyUI", "onDestroy() " + hashCode());
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WMPFQRCodeDetectProxyUI", "onPause() " + hashCode());
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WMPFQRCodeDetectProxyUI", "onResume() " + hashCode());
        super.onResume();
        if (this.f85676d) {
            moveTaskToBack(true);
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WMPFQRCodeDetectProxyUI", "onStart() " + hashCode());
        super.onStart();
        if (this.f85676d) {
            moveTaskToBack(true);
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        super.startActivityForResult(intent, i17, bundle);
        this.f85676d = true;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i17) {
        super.startActivityForResult(intent, i17);
        this.f85676d = true;
    }
}
