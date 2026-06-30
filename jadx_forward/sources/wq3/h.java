package wq3;

/* loaded from: classes15.dex */
public abstract class h {
    public static java.lang.String a(android.content.Context context, r45.gm0 gm0Var) {
        if (gm0Var.f456895e <= 0) {
            return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gsf);
        }
        return gm0Var.f456894d + " " + b(gm0Var.f456895e, gm0Var.f456896f);
    }

    public static java.lang.String b(double d17, java.lang.String str) {
        return ("CNY".equals(str) || "1".equals(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) ? java.lang.String.format("¥%.2f", java.lang.Double.valueOf(d17 / 100.0d)) : java.lang.String.format("%s%.2f", str, java.lang.Double.valueOf(d17 / 100.0d));
    }

    public static java.lang.String c(int i17, int i18, java.lang.String str) {
        return i17 == i18 ? b(i17, str) : java.lang.String.format("%s~%s", b(i18, str), b(i17, str));
    }
}
