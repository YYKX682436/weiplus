package at4;

/* loaded from: classes9.dex */
public class a1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f95332a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f95333b;

    /* renamed from: c, reason: collision with root package name */
    public int f95334c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f95335d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f95336e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f95337f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f95338g;

    public static at4.a1 a() {
        return b(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d((java.lang.String) ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BALANCE_FREEZE_MESSAGE_STRING_SYNC, ""), "sysmsg", null));
    }

    public static at4.a1 b(java.util.Map map) {
        if (map == null) {
            return null;
        }
        at4.a1 a1Var = new at4.a1();
        a1Var.f95332a = (java.lang.String) map.get(".sysmsg.paymsg.BalanceNotice.wording");
        a1Var.f95333b = (java.lang.String) map.get(".sysmsg.paymsg.BalanceNotice.wording_color");
        a1Var.f95335d = (java.lang.String) map.get(".sysmsg.paymsg.BalanceNotice.bg_color");
        a1Var.f95336e = (java.lang.String) map.get(".sysmsg.paymsg.BalanceNotice.route_url");
        a1Var.f95337f = (java.lang.String) map.get(".sysmsg.paymsg.BalanceNotice.left_icon");
        a1Var.f95338g = (java.lang.String) map.get(".sysmsg.paymsg.BalanceNotice.right_icon");
        a1Var.f95334c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.paymsg.BalanceNotice.wording_size"), 14);
        return a1Var;
    }

    public static void c(java.lang.String str) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BALANCE_FREEZE_MESSAGE_STRING_SYNC, str);
    }
}
