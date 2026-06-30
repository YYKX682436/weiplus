package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class l0 extends com.tencent.mm.ui.ac {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI f96315e;

    public l0(com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI qrRewardSetMoneyUI) {
        this.f96315e = qrRewardSetMoneyUI;
    }

    @Override // com.tencent.mm.ui.ac
    public void a(android.view.View view) {
        com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI qrRewardSetMoneyUI = this.f96315e;
        if (com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI.U6(qrRewardSetMoneyUI)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardSetMoneyUI", "amt error!");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardSetMoneyUI", "do set code");
            java.lang.String replace = qrRewardSetMoneyUI.f96272g.getText().toString().replace("\n", "");
            java.util.LinkedList linkedList = new java.util.LinkedList(qrRewardSetMoneyUI.f96279q);
            boolean z17 = qrRewardSetMoneyUI.f96282t;
            boolean z18 = false;
            int i17 = 0;
            while (true) {
                if (i17 >= qrRewardSetMoneyUI.f96278p.size()) {
                    break;
                }
                if (!((java.lang.Integer) qrRewardSetMoneyUI.f96278p.get(i17)).equals(((java.util.ArrayList) qrRewardSetMoneyUI.f96279q).get(i17))) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardSetMoneyUI", "modify money: %s, %s", qrRewardSetMoneyUI.f96278p.get(i17), ((java.util.ArrayList) qrRewardSetMoneyUI.f96279q).get(i17));
                    z18 = true;
                    break;
                }
                i17++;
            }
            xw1.i iVar = new xw1.i(linkedList, replace, z17, z18);
            iVar.f457660g = new java.lang.ref.WeakReference(qrRewardSetMoneyUI);
            qrRewardSetMoneyUI.doSceneProgress(iVar, true);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14721, 1, 2);
    }
}
