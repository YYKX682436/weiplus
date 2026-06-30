package c01;

/* loaded from: classes11.dex */
public class fb {

    /* renamed from: a, reason: collision with root package name */
    public int f37187a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f37188b = 0;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f37189c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f37190d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f37191e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f37192f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f37193g = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f37195i = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f37194h = "";

    public static c01.fb a() {
        c01.fb fbVar = new c01.fb();
        fbVar.f37187a = 1;
        fbVar.f37188b = com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) gm0.j1.u().c().l(12290, null), 0);
        fbVar.f37189c = (java.lang.String) gm0.j1.u().c().l(12293, null);
        fbVar.f37190d = (java.lang.String) gm0.j1.u().c().l(12292, null);
        fbVar.f37191e = (java.lang.String) gm0.j1.u().c().l(12291, null);
        fbVar.f37192f = (java.lang.String) gm0.j1.u().c().l(12307, null);
        fbVar.f37193g = (java.lang.String) gm0.j1.u().c().l(12324, null);
        fbVar.f37195i = (java.lang.String) gm0.j1.u().c().l(12325, null);
        fbVar.f37194h = (java.lang.String) gm0.j1.u().c().l(12326, null);
        return fbVar;
    }

    public static c01.fb b() {
        if (com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) gm0.j1.u().c().l(12289, null), 0) == 0) {
            return null;
        }
        return a();
    }

    public static r45.fp4 e(c01.fb fbVar) {
        gm0.j1.u().c().w(12289, java.lang.Integer.valueOf(fbVar.f37187a));
        gm0.j1.u().c().w(12290, java.lang.Integer.valueOf(fbVar.f37188b));
        if (c01.eb.a((java.lang.String) gm0.j1.u().c().l(12293, null), fbVar.d())) {
            gm0.j1.u().c().w(12293, fbVar.d());
        }
        if (c01.eb.a((java.lang.String) gm0.j1.u().c().l(12292, null), fbVar.c())) {
            gm0.j1.u().c().w(12292, fbVar.c());
        }
        if (c01.eb.a((java.lang.String) gm0.j1.u().c().l(12291, null), fbVar.f37191e)) {
            gm0.j1.u().c().w(12291, fbVar.f37191e);
        }
        if (c01.eb.a((java.lang.String) gm0.j1.u().c().l(12307, null), fbVar.f37192f)) {
            gm0.j1.u().c().w(12307, fbVar.f37192f);
        }
        if (c01.eb.a((java.lang.String) gm0.j1.u().c().l(12324, null), fbVar.f37193g)) {
            gm0.j1.u().c().w(12324, fbVar.f37193g);
        }
        if (c01.eb.a((java.lang.String) gm0.j1.u().c().l(12325, null), fbVar.f37195i)) {
            gm0.j1.u().c().w(12325, fbVar.f37195i);
        }
        if (c01.eb.a((java.lang.String) gm0.j1.u().c().l(12326, null), fbVar.f37194h)) {
            gm0.j1.u().c().w(12326, fbVar.f37194h);
        }
        r45.fp4 fp4Var = new r45.fp4();
        fp4Var.f374508d = 128;
        r45.du5 du5Var = new r45.du5();
        du5Var.f372756d = "";
        du5Var.f372757e = true;
        fp4Var.f374509e = du5Var;
        r45.du5 du5Var2 = new r45.du5();
        du5Var2.f372756d = "";
        du5Var2.f372757e = true;
        fp4Var.f374510f = du5Var2;
        fp4Var.f374511g = 0;
        r45.du5 du5Var3 = new r45.du5();
        du5Var3.f372756d = "";
        du5Var3.f372757e = true;
        fp4Var.f374512h = du5Var3;
        r45.du5 du5Var4 = new r45.du5();
        du5Var4.f372756d = "";
        du5Var4.f372757e = true;
        fp4Var.f374513i = du5Var4;
        fp4Var.f374514m = 0;
        byte[] N = com.tencent.mm.vfs.w6.N("", 0, -1);
        byte[] bArr = N == null ? new byte[0] : N;
        fp4Var.f374516o = new com.tencent.mm.protobuf.g(bArr, 0, bArr.length);
        fp4Var.f374515n = N == null ? 0 : N.length;
        fp4Var.f374517p = fbVar.f37188b;
        fp4Var.f374521t = fbVar.f37187a;
        java.lang.String str = fbVar.f37191e;
        if (str == null) {
            str = "";
        }
        fp4Var.f374520s = str;
        java.lang.String str2 = fbVar.f37194h;
        if (str2 == null) {
            str2 = "";
        }
        fp4Var.f374519r = str2;
        java.lang.String str3 = fbVar.f37195i;
        if (str3 == null) {
            str3 = "";
        }
        fp4Var.f374518q = str3;
        fp4Var.f374523v = 0;
        java.lang.String str4 = fbVar.f37192f;
        if (str4 == null) {
            str4 = "";
        }
        fp4Var.D = str4;
        fp4Var.E = 0;
        fp4Var.G = "";
        fp4Var.I = 0;
        fp4Var.H = "";
        java.lang.String str5 = fbVar.f37193g;
        fp4Var.S = str5 != null ? str5 : "";
        return fp4Var;
    }

    public java.lang.String c() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f37193g)) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f37195i)) {
                this.f37190d = "";
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.f37194h)) {
                this.f37190d = com.tencent.mm.storage.ha.k().j(this.f37193g, this.f37195i);
            } else {
                this.f37190d = com.tencent.mm.storage.ha.k().h(this.f37193g, this.f37195i, this.f37194h);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f37190d)) {
            return this.f37190d;
        }
        java.lang.String str = this.f37194h;
        return str == null ? "" : str;
    }

    public java.lang.String d() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f37193g)) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f37195i) || com.tencent.mm.sdk.platformtools.t8.K0(this.f37194h) || !com.tencent.mm.storage.ha.r(this.f37193g)) {
                this.f37189c = com.tencent.mm.storage.ha.k().i(this.f37193g);
            } else {
                this.f37189c = com.tencent.mm.storage.ha.k().j(this.f37193g, this.f37195i);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f37189c)) {
            return this.f37189c;
        }
        java.lang.String str = this.f37195i;
        return str == null ? "" : str;
    }

    public java.lang.String toString() {
        return "SelfPersonCard{personalCard=" + this.f37187a + ", sex=" + this.f37188b + ", oldProvince='" + this.f37189c + "', oldCity='" + this.f37190d + "', signature='" + this.f37191e + "', weibo='" + this.f37192f + "', countryCode='" + this.f37193g + "', cityCode='" + this.f37194h + "', provinceCode='" + this.f37195i + "'}";
    }
}
