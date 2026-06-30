package cm5;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final cm5.c f43426a = new cm5.c();

    public static void c(cm5.c cVar, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.tencent.mm.ui.widget.dialog.w1 w1Var, android.content.DialogInterface.OnCancelListener onCancelListener, int i17, java.lang.Object obj) {
        if ((i17 & 32) != 0) {
            w1Var = null;
        }
        if ((i17 & 64) != 0) {
            onCancelListener = null;
        }
        cVar.getClass();
        if (context != null) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
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
            u1Var.f211996a.f211821b.G = onCancelListener;
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
            q80.d0 d0Var = new q80.d0(java.net.URLDecoder.decode(str, com.tencent.mapsdk.internal.rv.f51270c));
            d0Var.f360671w = 3000L;
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(context, d0Var, new cm5.a(d0Var, context));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("BlockFunctionUtil", "open liteApp error:" + e17.getMessage());
        }
    }

    public final boolean b(android.content.Context context, tm.a aVar) {
        tm.j jVar;
        if (aVar == null || aVar.f420400c != 4 || (jVar = aVar.f420404g) == null || jVar.f420439d != 1) {
            return false;
        }
        c(this, context, aVar.f420401d, aVar.f420399b, jVar.f420441f, aVar.f420398a, null, null, 64, null);
        return true;
    }
}
