package j62;

/* loaded from: classes9.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    public static j62.b f379424d;

    /* renamed from: a, reason: collision with root package name */
    public final kk.j f379425a = new kk.l(50);

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f379426b = null;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f379427c = null;

    public static j62.b f() {
        if (f379424d == null) {
            f379424d = new j62.b();
        }
        return f379424d;
    }

    public java.util.List a() {
        java.lang.String[] b17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 d17 = d();
        if (d17 != null && (b17 = d17.b()) != null && b17.length > 0) {
            for (java.lang.String str : b17) {
                java.lang.String string = d17.getString(str, "");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                    j62.a aVar = new j62.a();
                    if (aVar.a(string)) {
                        arrayList.add(aVar);
                    }
                }
            }
        }
        return arrayList;
    }

    public j62.a b(java.lang.String str) {
        j62.a g17;
        int i17 = 0;
        try {
            i17 = e().getInt(str, 0);
        } catch (java.lang.Exception unused) {
        }
        if (i17 > 0) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 d17 = d();
                if (d17 != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) this.f379425a;
                    g17 = (j62.a) r2Var.get(java.lang.Integer.valueOf(i17));
                    if (g17 == null) {
                        java.lang.String string = d17.getString(java.lang.String.valueOf(i17), "");
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                            g17 = new j62.a();
                            if (g17.a(string)) {
                                r2Var.put(java.lang.Integer.valueOf(i17), g17);
                            }
                        }
                    }
                }
                g17 = null;
            } else {
                g17 = g(i17);
            }
            if (g17 != null && g17.c()) {
                return g17;
            }
        }
        return null;
    }

    public int c(java.lang.String str) {
        int i17;
        j62.a g17;
        try {
            i17 = e().getInt(str, 0);
        } catch (java.lang.Exception unused) {
            i17 = 0;
        }
        if (i17 > 0 && (g17 = g(i17)) != null && g17.c()) {
            if (g17.f379415g == 0) {
                return g17.f379412d;
            }
        }
        return 0;
    }

    public com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 d() {
        int n17 = j62.e.g().n();
        if (n17 == 0) {
            return null;
        }
        java.lang.String str = n17 + "_WxExptAppIdMmkv";
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f379426b, str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptAppManager", "%s get exptId mmkv change uin old[%s] new[%s]", hashCode() + "", this.f379426b, str);
            this.f379426b = str;
            ((kk.l) this.f379425a).mo143584x5a5b64d();
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(this.f379426b);
    }

    public com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 e() {
        int n17 = j62.e.g().n();
        if (n17 == 0) {
            return null;
        }
        java.lang.String str = n17 + "_WxExptAppKeyMmkv";
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f379427c, str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptAppManager", "%s get exptKey mmkv change uin old[%s] new[%s]", hashCode() + "", this.f379427c, str);
            this.f379427c = str;
            ((kk.l) this.f379425a).mo143584x5a5b64d();
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(this.f379427c);
    }

    public j62.a g(int i17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 d17 = d();
        if (d17 == null) {
            return null;
        }
        java.lang.String string = d17.getString(java.lang.String.valueOf(i17), "");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            j62.a aVar = new j62.a();
            if (aVar.a(string)) {
                return aVar;
            }
        }
        return null;
    }
}
