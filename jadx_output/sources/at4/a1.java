package at4;

/* loaded from: classes9.dex */
public class a1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f13799a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f13800b;

    /* renamed from: c, reason: collision with root package name */
    public int f13801c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f13802d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f13803e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f13804f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f13805g;

    public static at4.a1 a() {
        return b(com.tencent.mm.sdk.platformtools.aa.d((java.lang.String) ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.tencent.mm.storage.u3.USERINFO_BALANCE_FREEZE_MESSAGE_STRING_SYNC, ""), "sysmsg", null));
    }

    public static at4.a1 b(java.util.Map map) {
        if (map == null) {
            return null;
        }
        at4.a1 a1Var = new at4.a1();
        a1Var.f13799a = (java.lang.String) map.get(".sysmsg.paymsg.BalanceNotice.wording");
        a1Var.f13800b = (java.lang.String) map.get(".sysmsg.paymsg.BalanceNotice.wording_color");
        a1Var.f13802d = (java.lang.String) map.get(".sysmsg.paymsg.BalanceNotice.bg_color");
        a1Var.f13803e = (java.lang.String) map.get(".sysmsg.paymsg.BalanceNotice.route_url");
        a1Var.f13804f = (java.lang.String) map.get(".sysmsg.paymsg.BalanceNotice.left_icon");
        a1Var.f13805g = (java.lang.String) map.get(".sysmsg.paymsg.BalanceNotice.right_icon");
        a1Var.f13801c = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.paymsg.BalanceNotice.wording_size"), 14);
        return a1Var;
    }

    public static void c(java.lang.String str) {
        ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.tencent.mm.storage.u3.USERINFO_BALANCE_FREEZE_MESSAGE_STRING_SYNC, str);
    }
}
