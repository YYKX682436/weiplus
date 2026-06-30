package com.tencent.mm.plugin.account.ui;

/* loaded from: classes12.dex */
public class kh implements com.tencent.mm.sdk.platformtools.s3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegSetInfoUI f73989a;

    public kh(com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI) {
        this.f73989a = regSetInfoUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.s3
    public boolean a() {
        return true;
    }

    @Override // com.tencent.mm.sdk.platformtools.s3
    public boolean b() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(null)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI = this.f73989a;
            sb6.append((java.lang.Object) regSetInfoUI.f73629d.getText());
            if (com.tencent.mm.sdk.platformtools.t8.K0(sb6.toString().trim())) {
                regSetInfoUI.f73629d.setText((java.lang.CharSequence) null);
            }
        }
        if (fp.i.b()) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.RegSetInfoUI", "SDcard is not available");
        return false;
    }

    public java.lang.String toString() {
        return super.toString() + "|initView";
    }
}
