package at4;

/* loaded from: classes9.dex */
public class t1 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f95506a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f95507b;

    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = null;
        if (this.f95506a.size() > 0) {
            java.util.Iterator it = this.f95506a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) it.next();
                if (c19091x9511676c2.f69225xed6d60f6.equals(str)) {
                    c19091x9511676c = c19091x9511676c2;
                    break;
                }
            }
            if (c19091x9511676c == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletRepaymentBankcardMgr", "getBankcardBySerialNo return null");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletRepaymentBankcardMgr", "getBankcardBySerialNo succ");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletRepaymentBankcardMgr", "repayment bankcard list size is 0");
        }
        return c19091x9511676c;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c b() {
        if (!c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletRepaymentBankcardMgr", "Repayment card list is null");
            return null;
        }
        if (!android.text.TextUtils.isEmpty(this.f95507b)) {
            return a(this.f95507b);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletRepaymentBankcardMgr", "last_use_card_serialno is empty,return the first one");
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) this.f95506a.get(0);
    }

    public boolean c() {
        return this.f95506a.size() > 0;
    }
}
