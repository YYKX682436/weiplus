package wo;

/* loaded from: classes14.dex */
public abstract class k1 {
    public static void a(int i17) {
        wo.b1 b1Var = wo.n1.f529275f;
        if (b1Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.va) b1Var).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1132L, i17, 1L, false);
        }
    }

    public static void b(int i17, wo.j1 j1Var) {
        if (j1Var == null) {
            j1Var = new wo.j1();
        }
        java.lang.String str = j1Var.f529266f;
        java.lang.String format = java.lang.String.format(java.util.Locale.US, "%d,%d,%d,%d,%d,%b,%s,%s,%s,%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(((java.util.concurrent.ConcurrentHashMap) wo.n1.f529271b).size()), java.lang.Integer.valueOf(((java.util.concurrent.ConcurrentHashMap) wo.n1.f529272c).size()), java.lang.Integer.valueOf(((java.util.concurrent.ConcurrentHashMap) wo.n1.f529273d).size()), java.lang.Integer.valueOf(((java.util.concurrent.ConcurrentHashMap) wo.n1.f529274e).size()), java.lang.Boolean.valueOf(j1Var.f529262b), j1Var.f529264d, j1Var.f529265e, str != null ? str.replace(",", ";") : "", j1Var.f529263c);
        java.util.Map map = wo.n1.f529271b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecProxyUtils", "reportKVImpl xSwitch:[%s], reportKey:[%d], kv:[%s]", java.lang.Boolean.FALSE, java.lang.Integer.valueOf(i17), format);
    }

    public static void c(int i17, java.lang.String str) {
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(((java.util.concurrent.ConcurrentHashMap) wo.n1.f529271b).size());
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(((java.util.concurrent.ConcurrentHashMap) wo.n1.f529272c).size());
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(((java.util.concurrent.ConcurrentHashMap) wo.n1.f529273d).size());
        java.lang.Integer valueOf5 = java.lang.Integer.valueOf(((java.util.concurrent.ConcurrentHashMap) wo.n1.f529274e).size());
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        java.lang.String format = java.lang.String.format(locale, "%d,%d,%d,%d,%d,%b,%s,%s,%s,%s", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, bool, "", "", "", str);
        java.util.Map map = wo.n1.f529271b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecProxyUtils", "reportKVImpl xSwitch:[%s], reportKey:[%d], kv:[%s]", bool, java.lang.Integer.valueOf(i17), format);
    }
}
