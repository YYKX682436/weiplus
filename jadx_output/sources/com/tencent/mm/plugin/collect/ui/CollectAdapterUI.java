package com.tencent.mm.plugin.collect.ui;

@db5.a(7)
/* loaded from: classes5.dex */
public class CollectAdapterUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentViewVisibility(8);
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.CollectAdapterUI", "walletRegion: %s", java.lang.Integer.valueOf(intValue));
        if (intValue == 8) {
            j45.l.j(this, "collect", ".ui.CollectHKMainUI", getIntent(), null);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CollectAdapterUI", "openNewStyleConfig ：%s ", java.lang.Boolean.TRUE);
            j45.l.j(this, "collect", ".ui.WalletCollectQrCodeUI", getIntent(), null);
        }
        finish();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
