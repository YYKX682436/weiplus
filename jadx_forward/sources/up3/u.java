package up3;

/* loaded from: classes12.dex */
public class u extends up3.f0 {
    @Override // up3.f0
    public boolean a(java.lang.Object obj) {
        java.lang.String str = ((up3.c0) obj).f511355b;
        return str.startsWith(tp3.b.a("áµª¡±±\u0083")) && str.endsWith("$");
    }

    @Override // up3.f0
    public void b(java.lang.Object obj) {
        up3.c0 c0Var = (up3.c0) obj;
        try {
            java.lang.String[] f17 = up3.d0.f(c0Var.f511355b);
            if (f17 != null) {
                up3.b0.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, c0Var.f511354a, f17);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(up3.d0.f511356d, th6, "explained by code.", new java.lang.Object[0]);
        }
    }
}
