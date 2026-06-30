package al3;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final al3.a f87378a = new al3.a();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f87379b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Boolean f87380c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.Integer f87381d;

    public static final int b(android.content.Context context) {
        if (!com.p314xaae8f345.mm.ui.bk.u(context, false)) {
            return 0;
        }
        if (f87381d == null) {
            f87381d = java.lang.Integer.valueOf(b(context));
        }
        java.lang.Integer num = f87381d;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final android.graphics.Rect c(android.view.View view) {
        if (view == null) {
            return new android.graphics.Rect();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        int i18 = iArr[1];
        return new android.graphics.Rect(i17, i18, view.getWidth() + i17, view.getHeight() + i18);
    }

    public final boolean a(int i17) {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (f87379b == null) {
            try {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).getClass();
                java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_multitask_disable_snapshot_mode, "", true);
                f87379b = Zi;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseMultiTaskUtil", "disableMultiTaskTypeInfo: %s", Zi);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BaseMultiTaskUtil", e17, "disableMultiTaskTypeInfo", new java.lang.Object[0]);
            }
        }
        java.lang.String str2 = f87379b;
        if (str2 != null) {
            if (r26.n0.B(str2, "" + i17, false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseMultiTaskUtil", "disableMultiTaskTypeInfo ture!!!");
                return true;
            }
        }
        return false;
    }
}
