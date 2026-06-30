package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class h4 implements h32.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI f99475a;

    public h4(com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI) {
        this.f99475a = exdeviceProfileUI;
    }

    @Override // h32.b
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        p32.j jVar = (p32.j) m1Var;
        com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI = this.f99475a;
        if (exdeviceProfileUI.isFinishing() || exdeviceProfileUI.f99321y) {
            int i19 = com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.M;
            exdeviceProfileUI.runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.v4(exdeviceProfileUI));
            com.tencent.mars.xlog.Log.i("MicroMsg.Sport.ExdeviceProfileUI", "ExdeviceProfileUI has been destroyed.");
            return;
        }
        if (i17 == 0 && i18 == 0 && jVar != null) {
            exdeviceProfileUI.runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.v3(this, jVar));
            exdeviceProfileUI.f99309m = jVar.f351478p;
            exdeviceProfileUI.f99317u = jVar.f351477o;
            exdeviceProfileUI.f99318v = jVar.f351480r;
            exdeviceProfileUI.f99320x = jVar.f351481s;
            exdeviceProfileUI.A = jVar.f351482t;
            exdeviceProfileUI.B = jVar.f351474i;
            exdeviceProfileUI.runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.w3(this));
            if (!exdeviceProfileUI.f99319w) {
                exdeviceProfileUI.runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.y3(exdeviceProfileUI));
            }
            exdeviceProfileUI.runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.v4(exdeviceProfileUI));
        }
    }
}
