package com.p314xaae8f345.mm.p1006xc5476f33.ext.ui;

/* renamed from: com.tencent.mm.plugin.ext.ui.RedirectToQrCodeStubUI */
/* loaded from: classes12.dex */
public class ActivityC13507xb8a6ca47 extends com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c {
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedirectToQrCodeStubUI", "hy: start to handle qrcode string");
        java.lang.String stringExtra = getIntent().getStringExtra("K_STR");
        int intExtra = getIntent().getIntExtra("K_TYPE", -1);
        int intExtra2 = getIntent().getIntExtra("K_VERSION", -1);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197 c5292x67f91197 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197();
        am.r3 r3Var = c5292x67f91197.f135612g;
        r3Var.f89314b = this;
        r3Var.f89313a = stringExtra;
        r3Var.f89315c = intExtra;
        r3Var.f89316d = intExtra2;
        r3Var.f89321i = 47;
        c5292x67f91197.e();
        finish();
    }
}
