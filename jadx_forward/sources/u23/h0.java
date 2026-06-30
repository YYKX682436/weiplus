package u23;

/* loaded from: classes10.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public int f505613a;

    /* renamed from: b, reason: collision with root package name */
    public u23.g0[] f505614b = new u23.g0[16];

    public java.lang.String a(java.lang.String str) {
        int i17;
        if (str == null || str.isEmpty()) {
            return "";
        }
        int hashCode = str.hashCode();
        int i18 = hashCode ^ (hashCode >>> 16);
        u23.g0 g0Var = this.f505614b[(r1.length - 1) & i18];
        while (true) {
            if (g0Var == null) {
                g0Var = null;
                break;
            }
            if (g0Var.f505609a == i18 && g0Var.f505610b.equals(str)) {
                break;
            }
            g0Var = g0Var.f505611c;
        }
        if (g0Var != null) {
            return g0Var.f505610b;
        }
        u23.g0[] g0VarArr = this.f505614b;
        int length = g0VarArr.length;
        if (this.f505613a >= (length >> 2) * 3) {
            int i19 = length << 1;
            int i27 = i19 - 1;
            u23.g0[] g0VarArr2 = new u23.g0[i19];
            for (u23.g0 g0Var2 : g0VarArr) {
                while (g0Var2 != null) {
                    u23.g0 g0Var3 = g0Var2.f505611c;
                    int i28 = g0Var2.f505609a & i27;
                    g0Var2.f505611c = g0VarArr2[i28];
                    g0VarArr2[i28] = g0Var2;
                    g0Var2 = g0Var3;
                }
            }
            this.f505614b = g0VarArr2;
            i17 = i18 & i27;
        } else {
            i17 = i18 & (length - 1);
        }
        u23.g0[] g0VarArr3 = this.f505614b;
        g0VarArr3[i17] = new u23.g0(i18, str, g0VarArr3[i17]);
        this.f505613a++;
        return str;
    }
}
