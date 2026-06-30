package com.tencent.mm.plugin.account.ui;

@db5.a(7)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/account/ui/WxPayThirdAppProxyUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmWizardActivity;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-account_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class WxPayThirdAppProxyUI extends com.tencent.mm.plugin.mvvmbase.BaseMvvmWizardActivity implements com.tencent.mm.modelbase.u0 {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onSceneEnd] scene?.type: ");
        sb6.append(m1Var != null ? java.lang.Integer.valueOf(m1Var.getType()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPayThirdAppProxyUI", sb6.toString());
    }
}
