package c01;

/* loaded from: classes11.dex */
public class fb {

    /* renamed from: a, reason: collision with root package name */
    public int f118720a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f118721b = 0;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f118722c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f118723d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f118724e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f118725f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f118726g = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f118728i = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f118727h = "";

    public static c01.fb a() {
        c01.fb fbVar = new c01.fb();
        fbVar.f118720a = 1;
        fbVar.f118721b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) gm0.j1.u().c().l(12290, null), 0);
        fbVar.f118722c = (java.lang.String) gm0.j1.u().c().l(12293, null);
        fbVar.f118723d = (java.lang.String) gm0.j1.u().c().l(12292, null);
        fbVar.f118724e = (java.lang.String) gm0.j1.u().c().l(12291, null);
        fbVar.f118725f = (java.lang.String) gm0.j1.u().c().l(12307, null);
        fbVar.f118726g = (java.lang.String) gm0.j1.u().c().l(12324, null);
        fbVar.f118728i = (java.lang.String) gm0.j1.u().c().l(12325, null);
        fbVar.f118727h = (java.lang.String) gm0.j1.u().c().l(12326, null);
        return fbVar;
    }

    public static c01.fb b() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) gm0.j1.u().c().l(12289, null), 0) == 0) {
            return null;
        }
        return a();
    }

    public static r45.fp4 e(c01.fb fbVar) {
        gm0.j1.u().c().w(12289, java.lang.Integer.valueOf(fbVar.f118720a));
        gm0.j1.u().c().w(12290, java.lang.Integer.valueOf(fbVar.f118721b));
        if (c01.eb.a((java.lang.String) gm0.j1.u().c().l(12293, null), fbVar.d())) {
            gm0.j1.u().c().w(12293, fbVar.d());
        }
        if (c01.eb.a((java.lang.String) gm0.j1.u().c().l(12292, null), fbVar.c())) {
            gm0.j1.u().c().w(12292, fbVar.c());
        }
        if (c01.eb.a((java.lang.String) gm0.j1.u().c().l(12291, null), fbVar.f118724e)) {
            gm0.j1.u().c().w(12291, fbVar.f118724e);
        }
        if (c01.eb.a((java.lang.String) gm0.j1.u().c().l(12307, null), fbVar.f118725f)) {
            gm0.j1.u().c().w(12307, fbVar.f118725f);
        }
        if (c01.eb.a((java.lang.String) gm0.j1.u().c().l(12324, null), fbVar.f118726g)) {
            gm0.j1.u().c().w(12324, fbVar.f118726g);
        }
        if (c01.eb.a((java.lang.String) gm0.j1.u().c().l(12325, null), fbVar.f118728i)) {
            gm0.j1.u().c().w(12325, fbVar.f118728i);
        }
        if (c01.eb.a((java.lang.String) gm0.j1.u().c().l(12326, null), fbVar.f118727h)) {
            gm0.j1.u().c().w(12326, fbVar.f118727h);
        }
        r45.fp4 fp4Var = new r45.fp4();
        fp4Var.f456041d = 128;
        r45.du5 du5Var = new r45.du5();
        du5Var.f454289d = "";
        du5Var.f454290e = true;
        fp4Var.f456042e = du5Var;
        r45.du5 du5Var2 = new r45.du5();
        du5Var2.f454289d = "";
        du5Var2.f454290e = true;
        fp4Var.f456043f = du5Var2;
        fp4Var.f456044g = 0;
        r45.du5 du5Var3 = new r45.du5();
        du5Var3.f454289d = "";
        du5Var3.f454290e = true;
        fp4Var.f456045h = du5Var3;
        r45.du5 du5Var4 = new r45.du5();
        du5Var4.f454289d = "";
        du5Var4.f454290e = true;
        fp4Var.f456046i = du5Var4;
        fp4Var.f456047m = 0;
        byte[] N = com.p314xaae8f345.mm.vfs.w6.N("", 0, -1);
        byte[] bArr = N == null ? new byte[0] : N;
        fp4Var.f456049o = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr, 0, bArr.length);
        fp4Var.f456048n = N == null ? 0 : N.length;
        fp4Var.f456050p = fbVar.f118721b;
        fp4Var.f456054t = fbVar.f118720a;
        java.lang.String str = fbVar.f118724e;
        if (str == null) {
            str = "";
        }
        fp4Var.f456053s = str;
        java.lang.String str2 = fbVar.f118727h;
        if (str2 == null) {
            str2 = "";
        }
        fp4Var.f456052r = str2;
        java.lang.String str3 = fbVar.f118728i;
        if (str3 == null) {
            str3 = "";
        }
        fp4Var.f456051q = str3;
        fp4Var.f456056v = 0;
        java.lang.String str4 = fbVar.f118725f;
        if (str4 == null) {
            str4 = "";
        }
        fp4Var.D = str4;
        fp4Var.E = 0;
        fp4Var.G = "";
        fp4Var.I = 0;
        fp4Var.H = "";
        java.lang.String str5 = fbVar.f118726g;
        fp4Var.S = str5 != null ? str5 : "";
        return fp4Var;
    }

    public java.lang.String c() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f118726g)) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f118728i)) {
                this.f118723d = "";
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f118727h)) {
                this.f118723d = com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().j(this.f118726g, this.f118728i);
            } else {
                this.f118723d = com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().h(this.f118726g, this.f118728i, this.f118727h);
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f118723d)) {
            return this.f118723d;
        }
        java.lang.String str = this.f118727h;
        return str == null ? "" : str;
    }

    public java.lang.String d() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f118726g)) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f118728i) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f118727h) || !com.p314xaae8f345.mm.p2621x8fb0427b.ha.r(this.f118726g)) {
                this.f118722c = com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().i(this.f118726g);
            } else {
                this.f118722c = com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().j(this.f118726g, this.f118728i);
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f118722c)) {
            return this.f118722c;
        }
        java.lang.String str = this.f118728i;
        return str == null ? "" : str;
    }

    /* renamed from: toString */
    public java.lang.String m13824x9616526c() {
        return "SelfPersonCard{personalCard=" + this.f118720a + ", sex=" + this.f118721b + ", oldProvince='" + this.f118722c + "', oldCity='" + this.f118723d + "', signature='" + this.f118724e + "', weibo='" + this.f118725f + "', countryCode='" + this.f118726g + "', cityCode='" + this.f118727h + "', provinceCode='" + this.f118728i + "'}";
    }
}
