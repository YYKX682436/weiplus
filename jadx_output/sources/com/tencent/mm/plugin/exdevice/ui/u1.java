package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes5.dex */
public class u1 implements h32.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectedRouterActivateStateUI f99687a;

    public u1(com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectedRouterActivateStateUI exdeviceConnectedRouterActivateStateUI) {
        this.f99687a = exdeviceConnectedRouterActivateStateUI;
    }

    @Override // h32.b
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectedRouterActivateStateUI exdeviceConnectedRouterActivateStateUI = this.f99687a;
        try {
            if (exdeviceConnectedRouterActivateStateUI.isFinishing()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ConnectedRouterActivateStateUi", "ExdeviceConnectedRouter destroyed.");
            } else {
                exdeviceConnectedRouterActivateStateUI.runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.t1(this, i18, i17));
            }
        } catch (java.lang.Exception e17) {
            e17.toString();
        }
    }
}
