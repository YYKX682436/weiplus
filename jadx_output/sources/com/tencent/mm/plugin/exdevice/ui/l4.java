package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class l4 implements h32.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI f99555a;

    public l4(com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI) {
        this.f99555a = exdeviceProfileUI;
    }

    @Override // h32.b
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            int i19 = com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.M;
            com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI = this.f99555a;
            exdeviceProfileUI.getClass();
            exdeviceProfileUI.runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.v4(exdeviceProfileUI));
            exdeviceProfileUI.runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.k4(this));
        }
    }
}
