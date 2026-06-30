package zs5;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static int f556887a = 6;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f556888b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f556889c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f556890d;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        f556888b = arrayList;
        f556889c = false;
        arrayList.add("weixin://wxpay/");
        arrayList.add("wxp://");
        arrayList.add("https://wx.tenpay.com/");
        arrayList.add("https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fye) + "/");
        arrayList.add("https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fxv) + "/");
        arrayList.add("https://payapp.wechatpay.cn/");
        f556890d = new java.util.ArrayList();
    }

    public static java.util.List a() {
        boolean z17 = f556889c;
        java.util.List list = f556888b;
        if (!z17) {
            try {
                java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_scan_code_white_list_android, "", true);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi)) {
                    for (java.lang.String str : Zi.split(";")) {
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                            ((java.util.ArrayList) list).add(str);
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarAIModHelper", "updateWhiteList whiteListConfigValue: %s, whiteListSize: %d", Zi, java.lang.Integer.valueOf(((java.util.ArrayList) list).size()));
                f556889c = true;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.QBarAIModHelper", e17, "updateWhiteList exception", new java.lang.Object[0]);
            }
        }
        return list;
    }
}
