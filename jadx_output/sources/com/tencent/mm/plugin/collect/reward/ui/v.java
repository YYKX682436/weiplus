package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class v implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI f96334d;

    public v(com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI qrRewardMainUI) {
        this.f96334d = qrRewardMainUI;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardMainUI", "action: %s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI qrRewardMainUI = this.f96334d;
        qrRewardMainUI.A = qrRewardMainUI.f96237p.getText().toString();
        qrRewardMainUI.X6();
        if (com.tencent.mm.sdk.platformtools.t8.K0(qrRewardMainUI.A)) {
            qrRewardMainUI.a7(true);
        }
        qrRewardMainUI.hideVKB();
        return false;
    }
}
