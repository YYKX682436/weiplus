package com.tencent.mm.plugin.ext.ui;

/* loaded from: classes12.dex */
public class RedirectToQrCodeStubUI extends com.tencent.mm.hellhoundlib.activities.HellActivity {
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.RedirectToQrCodeStubUI", "hy: start to handle qrcode string");
        java.lang.String stringExtra = getIntent().getStringExtra("K_STR");
        int intExtra = getIntent().getIntExtra("K_TYPE", -1);
        int intExtra2 = getIntent().getIntExtra("K_VERSION", -1);
        com.tencent.mm.autogen.events.DealQBarStrEvent dealQBarStrEvent = new com.tencent.mm.autogen.events.DealQBarStrEvent();
        am.r3 r3Var = dealQBarStrEvent.f54079g;
        r3Var.f7781b = this;
        r3Var.f7780a = stringExtra;
        r3Var.f7782c = intExtra;
        r3Var.f7783d = intExtra2;
        r3Var.f7788i = 47;
        dealQBarStrEvent.e();
        finish();
    }
}
