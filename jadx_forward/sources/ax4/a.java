package ax4;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f96647a = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/__tmpl__/";

    public static void a(int i17) {
        b(908, i17, 1, true);
    }

    public static void b(int i17, int i18, int i19, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ConstantsPreload", "id:%d, key:%d, valye:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i17 > 0) {
            jx3.f.INSTANCE.mo68477x336bdfd8(i17, i18, i19, false);
        }
        if (z17 && i17 != 908 && i17 != 0) {
            jx3.f.INSTANCE.mo68477x336bdfd8(908L, i18, i19, false);
        }
        jx3.f.INSTANCE.d(15792, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public static void c(int i17) {
        d(i17, 1L);
    }

    public static void d(int i17, long j17) {
        jx3.f.INSTANCE.w(1009L, i17, j17);
    }
}
