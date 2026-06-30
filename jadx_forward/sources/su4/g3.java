package su4;

/* loaded from: classes8.dex */
public class g3 {

    /* renamed from: d, reason: collision with root package name */
    public static final su4.g3 f494435d = new su4.g3();

    /* renamed from: a, reason: collision with root package name */
    public su4.f3 f494436a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f494437b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f494438c = null;

    public g3() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FTS_DISCOVERY_RED_XML_STRING, "");
        su4.f3 f3Var = new su4.f3();
        this.f494436a = f3Var;
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            java.lang.String[] split = str.split("&");
            f3Var.f494414a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1(split[0], new java.lang.Object[0]);
            f3Var.f494415b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split[1], 0);
            f3Var.f494416c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split[2], 0);
            f3Var.f494417d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(split[3]);
            f3Var.f494418e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split[4], 0);
            f3Var.f494419f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split[5], 0);
            f3Var.f494420g = split[6];
            f3Var.f494421h = split[7];
            f3Var.f494422i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(split[8]);
            f3Var.f494423j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split[9], 0);
            f3Var.f494424k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(split[10]);
            f3Var.f494425l = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split[11], 0);
            f3Var.f494426m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split[12], 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchRedPointMgr", "parse %s", str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchRedPointMgr", e17, "", new java.lang.Object[0]);
        }
    }

    public void a(int i17) {
        su4.f3 f3Var = this.f494436a;
        if (f3Var != null) {
            boolean a17 = f3Var.a();
            if (this.f494437b && i17 == 1 && !a17) {
                return;
            }
            java.lang.String str = this.f494436a.f494414a;
            if (str == null || str.equals("null")) {
                str = "";
            }
            if (i17 == 1 && !str.trim().isEmpty()) {
                if (str.equals(this.f494438c)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchRedPointMgr", "reportRed, duplicated, redDotId: ".concat(str));
                    return;
                }
                this.f494438c = str;
            }
            java.lang.String format = java.lang.String.format("%d,%d,%s,%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a17 ? 1 : 0), str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchRedPointMgr", "report websearch reddot 17513: " + format);
            jx3.f.INSTANCE.mo68478xbd3cda5f(17513, format);
            if (i17 != 1 || a17) {
                return;
            }
            this.f494437b = true;
        }
    }

    public void b() {
        java.lang.String str;
        su4.f3 f3Var = this.f494436a;
        if (f3Var == null) {
            str = "";
        } else {
            str = f3Var.f494414a + "&" + f3Var.f494415b + "&" + f3Var.f494416c + "&" + f3Var.f494417d + "&" + f3Var.f494418e + "&" + f3Var.f494419f + "&" + f3Var.f494420g + "&" + f3Var.f494421h + "&" + f3Var.f494422i + "&" + f3Var.f494423j + "&" + f3Var.f494424k + "&" + f3Var.f494425l + "&" + f3Var.f494426m;
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FTS_DISCOVERY_RED_XML_STRING, str);
    }
}
