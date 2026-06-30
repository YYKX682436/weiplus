package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class m6 implements h32.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI f99570a;

    public m6(com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI) {
        this.f99570a = exdeviceRankInfoUI;
    }

    @Override // h32.b
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        p32.l lVar = (p32.l) m1Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.Sport.ExdeviceRankInfoUI", "onNetSceneEndCallback, errType(%s), errCode(%s), errMsg(%s).", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI = this.f99570a;
        if (exdeviceRankInfoUI.isFinishing() || exdeviceRankInfoUI.N) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sport.ExdeviceRankInfoUI", "ExdeviceRankInfoUI has been destroyed.");
            return;
        }
        exdeviceRankInfoUI.runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.c6(this));
        if (i17 != 0 || i18 != 0) {
            java.util.List list = exdeviceRankInfoUI.B;
            if (list == null || list.size() == 0) {
                exdeviceRankInfoUI.runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.d6(this));
                return;
            }
            return;
        }
        exdeviceRankInfoUI.G = lVar.f351494s;
        exdeviceRankInfoUI.H = lVar.f351495t;
        exdeviceRankInfoUI.f99332J = lVar.f351498w;
        exdeviceRankInfoUI.I = lVar.f351497v;
        exdeviceRankInfoUI.P = lVar.f351499x;
        exdeviceRankInfoUI.Q = ((r45.tq3) lVar.H()).f386700w;
        exdeviceRankInfoUI.R = ((r45.tq3) lVar.H()).f386701x;
        exdeviceRankInfoUI.runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.f6(this));
    }
}
