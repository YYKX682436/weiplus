package lp;

/* loaded from: classes9.dex */
public class v implements q25.a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f401778a = 0;

    static {
        q25.b.b(new lp.v(), "//pay");
    }

    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        if (strArr.length < 2) {
            return true;
        }
        java.lang.String str2 = strArr[1];
        str2.getClass();
        char c17 = 65535;
        switch (str2.hashCode()) {
            case -1943286194:
                if (str2.equals("forcenewcashier")) {
                    c17 = 0;
                    break;
                }
                break;
            case -1543416301:
                if (str2.equals("resethbguide")) {
                    c17 = 1;
                    break;
                }
                break;
            case -1326045846:
                if (str2.equals("dorder")) {
                    c17 = 2;
                    break;
                }
                break;
            case -15397537:
                if (str2.equals("kindatest")) {
                    c17 = 3;
                    break;
                }
                break;
            case 99657:
                if (str2.equals("dot")) {
                    c17 = 4;
                    break;
                }
                break;
            case 174797075:
                if (str2.equals("sethassource")) {
                    c17 = 5;
                    break;
                }
                break;
            case 1110195625:
                if (str2.equals("fackchatting")) {
                    c17 = 6;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                if (strArr.length >= 3) {
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FORCE_USE_NEW_CASHIER_INT_SYNC, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], 0)));
                }
                return true;
            case 1:
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_STORY_GUIDE_TIME_INT_SYNC, 0);
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_STORY_PREVIEW_GUIDE_TIME_INT_SYNC, 0);
                return true;
            case 2:
                j45.l.h(context, "wallet", ".pwd.ui.WalletUniversalPayOrderUI");
                return true;
            case 3:
                ((h45.q) i95.n0.c(h45.q.class)).mo24835x9385bc48("");
                return true;
            case 4:
                ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                bk0.a.g().q(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_New_MY_ENTRY_TAB_REDDOT_STRING_SYNC, true);
                return true;
            case 5:
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_ENVELOPE_HAS_SOURCE_INT_SYNC, 1);
                return true;
            case 6:
                ((pg0.a3) ((qg0.b0) i95.n0.c(qg0.b0.class))).Ai(context, new java.util.HashMap(), new lp.u(this));
                return true;
            default:
                return false;
        }
    }
}
