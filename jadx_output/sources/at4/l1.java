package at4;

/* loaded from: classes9.dex */
public abstract class l1 {
    public static java.util.ArrayList a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayOrderMgr", "sort bankcard isPos: %s", java.lang.Boolean.valueOf(z17));
        java.util.ArrayList c17 = z17 ? ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().c(true) : ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().a(true);
        at4.x1 fj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
        java.util.List list = fj6.f14003l;
        java.util.List<at4.g> list2 = (list == null || list.size() <= 0) ? null : fj6.f14003l;
        if (list2 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletPayOrderMgr", "empty bankinfo list");
            return c17;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (at4.g gVar : list2) {
            java.util.Iterator it = c17.iterator();
            while (true) {
                if (it.hasNext()) {
                    com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) it.next();
                    if (bankcard.field_bindSerial.equals(gVar.f13855a)) {
                        c17.remove(bankcard);
                        arrayList.add(bankcard);
                        break;
                    }
                }
            }
        }
        if (!c17.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletPayOrderMgr", "has unsort bankcard");
            arrayList.addAll(c17);
        }
        return arrayList;
    }

    public static boolean b(com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        if (bankcard == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayOrderMgr", "canSetAsOfflinePayDefaultCard bankcard is null");
            return false;
        }
        int i17 = bankcard.field_defaultCardState;
        if (!bankcard.z0()) {
            return i17 != 1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayOrderMgr", "canSetAsOfflinePayDefaultCard bankcard is fqf");
        return i17 == 2;
    }

    public static com.tencent.mm.plugin.wallet_core.model.Bankcard c(boolean z17) {
        ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().getClass();
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(196633, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayOrderMgr", " defaultLocalOfflineBankcard：%s，needJudgeDefaultCardState：%s", str, java.lang.Boolean.valueOf(z17));
        java.util.ArrayList b17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().b(true);
        if (b17 == null) {
            b17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().a(true);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayOrderMgr", "way1：getLastBankcard");
        for (int i17 = 0; !android.text.TextUtils.isEmpty(str) && i17 < b17.size(); i17++) {
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) b17.get(i17);
            if (bankcard != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayOrderMgr", "compared bankcard: %s status：%s", bankcard.field_bindSerial, java.lang.Integer.valueOf(bankcard.field_defaultCardState));
            }
            if (bankcard != null && str.equals(bankcard.field_bindSerial)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayOrderMgr", "find bindSerial:%s，micropay: %s, forbidword: %s，defaultCardState：%s", bankcard.field_bindSerial, java.lang.Boolean.valueOf(bankcard.field_support_micropay), bankcard.field_forbidWord, java.lang.Integer.valueOf(bankcard.field_defaultCardState));
                boolean b18 = b(bankcard);
                if (!bankcard.field_support_micropay) {
                    continue;
                } else {
                    if (!z17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayOrderMgr", " final get LastBankcard");
                        return bankcard;
                    }
                    if (b18) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayOrderMgr", " final get LastBankcard（needJudgeDefaultCardState）");
                        return bankcard;
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayOrderMgr", "clear default bindserial");
        ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().E("");
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayOrderMgr", "way2：mainBankcard");
        ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().getClass();
        com.tencent.mm.plugin.wallet_core.model.Bankcard k17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().k(null, null, true, true);
        if (k17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletUserInfoManger", "defaultBankcards == null");
        }
        if (k17 != null && com.tencent.mm.sdk.platformtools.t8.K0(k17.field_forbidWord)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayOrderMgr", "mainBankcard bindSerial：%s, type：%s，defaultCardState：%s", k17.field_bindSerial, k17.field_bankcardType, java.lang.Integer.valueOf(k17.field_defaultCardState));
            boolean b19 = b(k17);
            if (!z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayOrderMgr", "final get mainBankcard");
                return k17;
            }
            if (b19) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayOrderMgr", " final get mainBankcard（needJudgeDefaultCardState）");
                return k17;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayOrderMgr", "way3：get balance");
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f13999h;
        if (bankcard2 != null && bankcard2.field_support_micropay) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayOrderMgr", "get balance：%s，type：%s，defaultCardState：%s", bankcard2.field_bindSerial, bankcard2.field_bankcardType, java.lang.Integer.valueOf(bankcard2.field_defaultCardState));
            boolean b27 = b(bankcard2);
            if (!z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayOrderMgr", " final get balance");
                return bankcard2;
            }
            if (b27) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayOrderMgr", " final get balance（needJudgeDefaultCardState）");
                return bankcard2;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayOrderMgr", "way4：get first card");
        for (int i18 = 0; i18 < b17.size(); i18++) {
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard3 = (com.tencent.mm.plugin.wallet_core.model.Bankcard) b17.get(i18);
            if (bankcard3 != null && bankcard3.field_support_micropay && !bankcard3.v0()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayOrderMgr", "get first card:%s，type：%s，defaultCardState：%s", bankcard3.field_bindSerial, bankcard3.field_bankcardType, java.lang.Integer.valueOf(bankcard3.field_defaultCardState));
                boolean b28 = b(bankcard3);
                if (!z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayOrderMgr", " final get first card");
                    return bankcard3;
                }
                if (b28) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayOrderMgr", " final get first card（needJudgeDefaultCardState）");
                    return bankcard3;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayOrderMgr", "way5：get lqt ");
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard4 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f14004m;
        if (bankcard4 != null && bankcard4.field_support_micropay && com.tencent.mm.sdk.platformtools.t8.K0(bankcard4.field_forbidWord)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayOrderMgr", " get lqt : %s，type：%s，defaultCardState：%s", java.lang.Integer.valueOf(bankcard4.field_defaultCardState), bankcard4.field_bankcardType, java.lang.Integer.valueOf(bankcard4.field_defaultCardState));
            boolean b29 = b(bankcard4);
            if (!z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayOrderMgr", " final get lqt");
                return bankcard4;
            }
            if (b29) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayOrderMgr", " final get lqt（needJudgeDefaultCardState）");
                return bankcard4;
            }
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayOrderMgr", "final way");
            for (int i19 = 0; i19 < b17.size(); i19++) {
                com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard5 = (com.tencent.mm.plugin.wallet_core.model.Bankcard) b17.get(i19);
                if (bankcard5 != null && bankcard5.field_support_micropay) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayOrderMgr", "final get card：%s，type：%s", bankcard5.field_bindSerial, bankcard5.field_bankcardType);
                    return bankcard5;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayOrderMgr", " do not get any card");
        return null;
    }
}
