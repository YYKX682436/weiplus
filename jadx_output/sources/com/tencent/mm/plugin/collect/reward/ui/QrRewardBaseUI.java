package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public abstract class QrRewardBaseUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {
    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        hideActionbarLine();
        setBackBtn(new com.tencent.mm.plugin.collect.reward.ui.a(this), com.tencent.mm.R.raw.actionbar_icon_dark_back);
    }
}
