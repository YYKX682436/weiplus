package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class x3 implements h32.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI f99720a;

    public x3(com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI) {
        this.f99720a = exdeviceProfileUI;
    }

    @Override // h32.b
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Sport.ExdeviceProfileUI", "on NetSceneAddFollow end,errType:" + i17 + "  errCode:" + i18 + "  errMsg:" + str);
        if (i17 == 0 && i18 == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KeyNeedUpdateRank", true);
            com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI = this.f99720a;
            exdeviceProfileUI.setResult(-1, intent);
            exdeviceProfileUI.finish();
        }
    }
}
