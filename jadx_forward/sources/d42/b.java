package d42;

/* loaded from: classes9.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static d42.b f307935b;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f307936a = null;

    public com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a() {
        int n17 = j62.e.g().n();
        if (n17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExptIdMMKV", "uin err [%d]", java.lang.Integer.valueOf(n17));
            return null;
        }
        java.lang.String str = n17 + "_WxExptIdmmkv";
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f307936a, str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptIdMMKV", "%s get mmkv change uin old[%s] new[%s]", hashCode() + "", this.f307936a, str);
            this.f307936a = str;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(this.f307936a);
    }

    public java.util.List b() {
        java.lang.String[] b17;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = a();
        if (a17 != null && (b17 = a17.b()) != null && b17.length > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptIdMMKV", "mmkv keys length is [%d] ", java.lang.Integer.valueOf(b17.length));
            for (int i17 = 0; i17 < b17.length; i17++) {
                r45.im0 im0Var = new r45.im0();
                j62.a g17 = j62.b.f().g(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(b17[i17], 0));
                if (g17 != null) {
                    im0Var.f458677d = g17.f379412d;
                    im0Var.f458678e = g17.f379413e;
                    im0Var.f458679f = g17.f379414f;
                    im0Var.f458680g = a17.n(b17[i17]);
                    linkedList.add(im0Var);
                }
            }
        }
        return linkedList;
    }
}
