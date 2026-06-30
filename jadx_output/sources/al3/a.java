package al3;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final al3.a f5845a = new al3.a();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f5846b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Boolean f5847c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.Integer f5848d;

    public static final int b(android.content.Context context) {
        if (!com.tencent.mm.ui.bk.u(context, false)) {
            return 0;
        }
        if (f5848d == null) {
            f5848d = java.lang.Integer.valueOf(b(context));
        }
        java.lang.Integer num = f5848d;
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
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (f5846b == null) {
            try {
                ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).getClass();
                java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_multitask_disable_snapshot_mode, "", true);
                f5846b = Zi;
                com.tencent.mars.xlog.Log.i("MicroMsg.BaseMultiTaskUtil", "disableMultiTaskTypeInfo: %s", Zi);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BaseMultiTaskUtil", e17, "disableMultiTaskTypeInfo", new java.lang.Object[0]);
            }
        }
        java.lang.String str2 = f5846b;
        if (str2 != null) {
            if (r26.n0.B(str2, "" + i17, false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BaseMultiTaskUtil", "disableMultiTaskTypeInfo ture!!!");
                return true;
            }
        }
        return false;
    }
}
