package bp3;

/* loaded from: classes9.dex */
public class e extends com.tencent.mm.wallet_core.h {
    @Override // com.tencent.mm.wallet_core.h
    public com.tencent.mm.wallet_core.h A(android.app.Activity activity, android.os.Bundle bundle) {
        B(activity, com.tencent.mm.plugin.order.ui.MallOrderRecordListUI.class, bundle);
        return this;
    }

    @Override // com.tencent.mm.wallet_core.h
    public void c(android.app.Activity activity, int i17) {
        m(activity);
    }

    @Override // com.tencent.mm.wallet_core.h
    public java.lang.String e() {
        return "ShowOrdersInfoProcess";
    }

    @Override // com.tencent.mm.wallet_core.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        g(activity);
    }

    @Override // com.tencent.mm.wallet_core.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        if (activity instanceof com.tencent.mm.plugin.order.ui.MallOrderRecordListUI) {
            B(activity, com.tencent.mm.plugin.order.ui.MallOrderTransactionInfoUI.class, bundle);
            return;
        }
        if (!(activity instanceof com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI)) {
            if ((activity instanceof com.tencent.mm.plugin.order.ui.MallOrderProductListUI) || (activity instanceof com.tencent.mm.plugin.order.ui.MallOrderTransactionInfoUI)) {
                m(activity);
                return;
            }
            return;
        }
        int i18 = bundle.getInt("key_enter_id");
        if (i18 == 0) {
            B(activity, com.tencent.mm.plugin.order.ui.MallOrderProductListUI.class, bundle);
        } else if (i18 == 1) {
            B(activity, com.tencent.mm.plugin.order.ui.MallOrderTransactionInfoUI.class, bundle);
        }
    }

    @Override // com.tencent.mm.wallet_core.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return false;
    }
}
