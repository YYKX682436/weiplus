package at4;

/* loaded from: classes9.dex */
public abstract class l1 {
    public static java.util.ArrayList a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayOrderMgr", "sort bankcard isPos: %s", java.lang.Boolean.valueOf(z17));
        java.util.ArrayList c17 = z17 ? ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().c(true) : ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().a(true);
        at4.x1 fj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
        java.util.List list = fj6.f95536l;
        java.util.List<at4.g> list2 = (list == null || list.size() <= 0) ? null : fj6.f95536l;
        if (list2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletPayOrderMgr", "empty bankinfo list");
            return c17;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (at4.g gVar : list2) {
            java.util.Iterator it = c17.iterator();
            while (true) {
                if (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) it.next();
                    if (c19091x9511676c.f69225xed6d60f6.equals(gVar.f95388a)) {
                        c17.remove(c19091x9511676c);
                        arrayList.add(c19091x9511676c);
                        break;
                    }
                }
            }
        }
        if (!c17.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletPayOrderMgr", "has unsort bankcard");
            arrayList.addAll(c17);
        }
        return arrayList;
    }

    public static boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c) {
        if (c19091x9511676c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayOrderMgr", "canSetAsOfflinePayDefaultCard bankcard is null");
            return false;
        }
        int i17 = c19091x9511676c.f69232xff761ac5;
        if (!c19091x9511676c.z0()) {
            return i17 != 1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayOrderMgr", "canSetAsOfflinePayDefaultCard bankcard is fqf");
        return i17 == 2;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c(boolean z17) {
        ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().getClass();
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(196633, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayOrderMgr", " defaultLocalOfflineBankcard：%s，needJudgeDefaultCardState：%s", str, java.lang.Boolean.valueOf(z17));
        java.util.ArrayList b17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().b(true);
        if (b17 == null) {
            b17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().a(true);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayOrderMgr", "way1：getLastBankcard");
        for (int i17 = 0; !android.text.TextUtils.isEmpty(str) && i17 < b17.size(); i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) b17.get(i17);
            if (c19091x9511676c != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayOrderMgr", "compared bankcard: %s status：%s", c19091x9511676c.f69225xed6d60f6, java.lang.Integer.valueOf(c19091x9511676c.f69232xff761ac5));
            }
            if (c19091x9511676c != null && str.equals(c19091x9511676c.f69225xed6d60f6)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayOrderMgr", "find bindSerial:%s，micropay: %s, forbidword: %s，defaultCardState：%s", c19091x9511676c.f69225xed6d60f6, java.lang.Boolean.valueOf(c19091x9511676c.f69260x2a326a79), c19091x9511676c.f69239x93565523, java.lang.Integer.valueOf(c19091x9511676c.f69232xff761ac5));
                boolean b18 = b(c19091x9511676c);
                if (!c19091x9511676c.f69260x2a326a79) {
                    continue;
                } else {
                    if (!z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayOrderMgr", " final get LastBankcard");
                        return c19091x9511676c;
                    }
                    if (b18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayOrderMgr", " final get LastBankcard（needJudgeDefaultCardState）");
                        return c19091x9511676c;
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayOrderMgr", "clear default bindserial");
        ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().E("");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayOrderMgr", "way2：mainBankcard");
        ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c k17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().k(null, null, true, true);
        if (k17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletUserInfoManger", "defaultBankcards == null");
        }
        if (k17 != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k17.f69239x93565523)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayOrderMgr", "mainBankcard bindSerial：%s, type：%s，defaultCardState：%s", k17.f69225xed6d60f6, k17.f69223x58802fcb, java.lang.Integer.valueOf(k17.f69232xff761ac5));
            boolean b19 = b(k17);
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayOrderMgr", "final get mainBankcard");
                return k17;
            }
            if (b19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayOrderMgr", " final get mainBankcard（needJudgeDefaultCardState）");
                return k17;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayOrderMgr", "way3：get balance");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95532h;
        if (c19091x9511676c2 != null && c19091x9511676c2.f69260x2a326a79) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayOrderMgr", "get balance：%s，type：%s，defaultCardState：%s", c19091x9511676c2.f69225xed6d60f6, c19091x9511676c2.f69223x58802fcb, java.lang.Integer.valueOf(c19091x9511676c2.f69232xff761ac5));
            boolean b27 = b(c19091x9511676c2);
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayOrderMgr", " final get balance");
                return c19091x9511676c2;
            }
            if (b27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayOrderMgr", " final get balance（needJudgeDefaultCardState）");
                return c19091x9511676c2;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayOrderMgr", "way4：get first card");
        for (int i18 = 0; i18 < b17.size(); i18++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) b17.get(i18);
            if (c19091x9511676c3 != null && c19091x9511676c3.f69260x2a326a79 && !c19091x9511676c3.v0()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayOrderMgr", "get first card:%s，type：%s，defaultCardState：%s", c19091x9511676c3.f69225xed6d60f6, c19091x9511676c3.f69223x58802fcb, java.lang.Integer.valueOf(c19091x9511676c3.f69232xff761ac5));
                boolean b28 = b(c19091x9511676c3);
                if (!z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayOrderMgr", " final get first card");
                    return c19091x9511676c3;
                }
                if (b28) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayOrderMgr", " final get first card（needJudgeDefaultCardState）");
                    return c19091x9511676c3;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayOrderMgr", "way5：get lqt ");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c4 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95537m;
        if (c19091x9511676c4 != null && c19091x9511676c4.f69260x2a326a79 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c4.f69239x93565523)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayOrderMgr", " get lqt : %s，type：%s，defaultCardState：%s", java.lang.Integer.valueOf(c19091x9511676c4.f69232xff761ac5), c19091x9511676c4.f69223x58802fcb, java.lang.Integer.valueOf(c19091x9511676c4.f69232xff761ac5));
            boolean b29 = b(c19091x9511676c4);
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayOrderMgr", " final get lqt");
                return c19091x9511676c4;
            }
            if (b29) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayOrderMgr", " final get lqt（needJudgeDefaultCardState）");
                return c19091x9511676c4;
            }
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayOrderMgr", "final way");
            for (int i19 = 0; i19 < b17.size(); i19++) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c5 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) b17.get(i19);
                if (c19091x9511676c5 != null && c19091x9511676c5.f69260x2a326a79) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayOrderMgr", "final get card：%s，type：%s", c19091x9511676c5.f69225xed6d60f6, c19091x9511676c5.f69223x58802fcb);
                    return c19091x9511676c5;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayOrderMgr", " do not get any card");
        return null;
    }
}
