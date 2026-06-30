package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* loaded from: classes9.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l1 f259221a = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l1();

    public final int a(android.app.Activity activity, java.lang.String url, android.os.Bundle bundle) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.f1 f1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.g1.f259170d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.f1 f1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.g1.f259170d;
        int i18 = bundle.getInt("fromScene", 0);
        f1Var.getClass();
        for (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.g1 g1Var : com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.g1.m73805xcee59d22()) {
            if (g1Var.ordinal() == i18) {
                java.lang.String string = bundle.getString("bindSerial");
                java.lang.String string2 = bundle.getString("amountString");
                if (r26.i0.y(url, "weixin://wcpay/lqt/detail", false)) {
                    boolean l17 = j62.e.g().l("clicfg_android_balance_jump_route_change", false, false, true);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LqtNativeUrlJumpHandler", "[jumpToLqtDetailTest] enable: " + l17);
                    if (l17) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c3.b(url);
                        if (((h45.q) i95.n0.c(h45.q.class)).mo24812x391b2a71(activity)) {
                            return 32769;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LqtNativeUrlJumpHandler", "jumpToLqtDetailForKinda not available, start failed");
                        return 32769;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c3.b(url);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("key_account_type", 1);
                    j45.l.n(activity, "wallet", ".balance.ui.lqt.WalletLqtDetailUI", intent, 32769);
                    return 32769;
                }
                if (!r26.i0.y(url, "weixin://wcpay/lqt/save", false)) {
                    return -1;
                }
                boolean l18 = j62.e.g().l("clicfg_android_balance_jump_route_change", false, false, true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LqtNativeUrlJumpHandler", "[jumpToLqtSaveTest] enable: " + l18);
                if (l18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c3.b(url);
                    java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c3.a(url);
                    int ordinal = g1Var.ordinal();
                    if (ordinal == 0) {
                        i17 = 3;
                    } else {
                        if (ordinal != 1) {
                            throw new jz5.j();
                        }
                        i17 = 8;
                    }
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("entrance_type", i17);
                    intent2.putExtra("operate_id", a17);
                    if (string2 != null) {
                        if (!(string2.length() > 0)) {
                            string2 = null;
                        }
                        if (string2 != null) {
                            intent2.putExtra("fill_money", string2);
                        }
                    }
                    if (string != null) {
                        if (!(string.length() > 0)) {
                            string = null;
                        }
                        if (string != null) {
                            intent2.putExtra("card_serial", string);
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LqtNativeUrlJumpHandler", "start lqt save use case (kinda only), entranceType: " + i17);
                    if (!((h45.q) i95.n0.c(h45.q.class)).mo24819x8648fb0d(activity, intent2, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.k1.f259199a)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LqtNativeUrlJumpHandler", "startLqtSaveUseCase not available, start failed");
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c3.b(url);
                    java.lang.String a18 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c3.a(url);
                    android.app.Dialog e17 = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.e(activity, false, false, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.e1 e1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.e1(activity);
                    e1Var.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.i1(e17, activity, g1Var, e1Var, a18, string2, string), new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.j1(activity, e17));
                }
                return 32770;
            }
        }
        throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
    }
}
