package cm5;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final cm5.c f124959a = new cm5.c();

    public static void c(cm5.c cVar, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 w1Var, android.content.DialogInterface.OnCancelListener onCancelListener, int i17, java.lang.Object obj) {
        if ((i17 & 32) != 0) {
            w1Var = null;
        }
        if ((i17 & 64) != 0) {
            onCancelListener = null;
        }
        cVar.getClass();
        if (context != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
            if (str == null) {
                str = "";
            }
            u1Var.u(str);
            if (str2 == null) {
                str2 = "";
            }
            u1Var.g(str2);
            if (str3 == null) {
                str3 = "";
            }
            u1Var.n(str3);
            u1Var.a(true);
            u1Var.f293529a.f293354b.G = onCancelListener;
            if (w1Var == null) {
                w1Var = new cm5.b(context, str4);
            }
            u1Var.b(w1Var);
            u1Var.q(false);
        }
    }

    public final void a(android.content.Context context, java.lang.String str) {
        if ((str == null || str.length() == 0) || context == null) {
            return;
        }
        try {
            q80.d0 d0Var = new q80.d0(java.net.URLDecoder.decode(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            d0Var.f442204w = 3000L;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(context, d0Var, new cm5.a(d0Var, context));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BlockFunctionUtil", "open liteApp error:" + e17.getMessage());
        }
    }

    public final boolean b(android.content.Context context, tm.a aVar) {
        tm.j jVar;
        if (aVar == null || aVar.f501933c != 4 || (jVar = aVar.f501937g) == null || jVar.f501972d != 1) {
            return false;
        }
        c(this, context, aVar.f501934d, aVar.f501932b, jVar.f501974f, aVar.f501931a, null, null, 64, null);
        return true;
    }
}
