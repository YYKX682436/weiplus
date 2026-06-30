package at4;

/* loaded from: classes9.dex */
public class t1 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f13973a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f13974b;

    public com.tencent.mm.plugin.wallet_core.model.Bankcard a(java.lang.String str) {
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = null;
        if (this.f13973a.size() > 0) {
            java.util.Iterator it = this.f13973a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = (com.tencent.mm.plugin.wallet_core.model.Bankcard) it.next();
                if (bankcard2.field_bindSerial.equals(str)) {
                    bankcard = bankcard2;
                    break;
                }
            }
            if (bankcard == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletRepaymentBankcardMgr", "getBankcardBySerialNo return null");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletRepaymentBankcardMgr", "getBankcardBySerialNo succ");
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletRepaymentBankcardMgr", "repayment bankcard list size is 0");
        }
        return bankcard;
    }

    public com.tencent.mm.plugin.wallet_core.model.Bankcard b() {
        if (!c()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletRepaymentBankcardMgr", "Repayment card list is null");
            return null;
        }
        if (!android.text.TextUtils.isEmpty(this.f13974b)) {
            return a(this.f13974b);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletRepaymentBankcardMgr", "last_use_card_serialno is empty,return the first one");
        return (com.tencent.mm.plugin.wallet_core.model.Bankcard) this.f13973a.get(0);
    }

    public boolean c() {
        return this.f13973a.size() > 0;
    }
}
