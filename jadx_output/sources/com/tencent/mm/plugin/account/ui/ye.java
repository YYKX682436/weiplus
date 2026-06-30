package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class ye implements com.tencent.mm.sdk.platformtools.s3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI f74345a;

    public ye(com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI regByMobileRegAIOUI) {
        this.f74345a = regByMobileRegAIOUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.s3
    public boolean a() {
        return true;
    }

    @Override // com.tencent.mm.sdk.platformtools.s3
    public boolean b() {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(null);
        com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI regByMobileRegAIOUI = this.f74345a;
        if (!K0) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(("" + ((java.lang.Object) regByMobileRegAIOUI.C.getText())).trim())) {
                regByMobileRegAIOUI.C.setText(null);
            }
        }
        if (!fp.i.b()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RegByMobileRegAIOUI", "SDcard is not available");
            return false;
        }
        android.graphics.Bitmap bitmap = regByMobileRegAIOUI.E;
        if (bitmap != null && !bitmap.isRecycled() && !regByMobileRegAIOUI.f73582z) {
            regByMobileRegAIOUI.A.setImageBitmap(regByMobileRegAIOUI.E);
            regByMobileRegAIOUI.B.setVisibility(8);
            regByMobileRegAIOUI.f73582z = true;
        }
        return true;
    }

    public java.lang.String toString() {
        return super.toString() + "|initView2";
    }
}
