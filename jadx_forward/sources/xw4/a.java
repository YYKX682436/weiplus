package xw4;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f539269a = {"cache", "publicCache"};

    public static boolean a(nw4.y2 y2Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var) {
        if (c1Var != null && y2Var != null && !android.text.TextUtils.isEmpty(y2Var.f422552i)) {
            java.lang.String[] strArr = f539269a;
            for (int i17 = 0; i17 < 2; i17++) {
                java.lang.String str = strArr[i17];
                if (str.equalsIgnoreCase(y2Var.f422552i)) {
                    c1Var.i5(y2Var, str.concat(":not in white list"), null);
                    return true;
                }
            }
        }
        return false;
    }
}
