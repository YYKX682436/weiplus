package r61;

/* loaded from: classes11.dex */
public class a {

    /* renamed from: r, reason: collision with root package name */
    public byte[] f474335r;

    /* renamed from: t, reason: collision with root package name */
    public int f474337t;
    public int O = -1;

    /* renamed from: a, reason: collision with root package name */
    public int f474318a = 0;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f474319b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f474320c = "";

    /* renamed from: d, reason: collision with root package name */
    public long f474321d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f474322e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f474323f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f474324g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f474325h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f474326i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f474327j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f474328k = "";

    /* renamed from: l, reason: collision with root package name */
    public int f474329l = 0;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f474330m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f474331n = "";

    /* renamed from: o, reason: collision with root package name */
    public int f474332o = 0;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f474333p = "";

    /* renamed from: s, reason: collision with root package name */
    public int f474336s = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f474334q = 0;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f474338u = "";

    /* renamed from: v, reason: collision with root package name */
    public int f474339v = 0;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f474340w = "";

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f474341x = "";

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f474342y = "";

    /* renamed from: z, reason: collision with root package name */
    public int f474343z = 0;
    public java.lang.String A = "";
    public int B = 0;
    public int C = 0;
    public java.lang.String D = "";
    public java.lang.String E = "";
    public java.lang.String F = "";
    public int G = -1;
    public java.lang.String H = "";
    public long I = -1;

    /* renamed from: J, reason: collision with root package name */
    public int f474317J = -1;
    public java.lang.String K = "";
    public java.lang.String L = "";
    public java.lang.String M = "";
    public long N = 0;

    public static int d(java.lang.String str) {
        try {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M("0x" + str.substring(0, 8), 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AddrUpload", e17, "md5: %s", str);
            return 0;
        }
    }

    public int a() {
        char c17;
        java.lang.String str = this.f474323f;
        if (str == null) {
            str = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            java.lang.String str2 = this.f474324g;
            if (str2 == null) {
                str2 = "";
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                c17 = ' ';
            } else {
                java.lang.String str3 = this.f474324g;
                c17 = (str3 != null ? str3 : "").charAt(0);
            }
        } else {
            java.lang.String str4 = this.f474323f;
            c17 = (str4 != null ? str4 : "").charAt(0);
        }
        if (c17 >= 'a' && c17 <= 'z') {
            return (char) (c17 - ' ');
        }
        if (c17 < 'A' || c17 > 'Z') {
            return 123;
        }
        return c17;
    }

    public void b(android.database.Cursor cursor) {
        java.lang.String string = cursor.getString(1);
        this.f474319b = string;
        this.f474318a = d(string);
        this.f474320c = cursor.getString(2);
        this.f474321d = cursor.getLong(3);
        this.f474322e = cursor.getString(4);
        this.f474323f = cursor.getString(5);
        this.f474324g = cursor.getString(6);
        this.f474325h = cursor.getString(7);
        this.f474326i = cursor.getString(8);
        this.f474327j = cursor.getString(9);
        this.f474328k = cursor.getString(10);
        this.f474329l = cursor.getInt(11);
        this.f474330m = cursor.getString(12);
        this.f474331n = cursor.getString(13);
        int i17 = cursor.getInt(14);
        if (i17 == 65536) {
            this.f474332o = 0;
        } else {
            this.f474332o = i17;
        }
        this.f474334q = cursor.getInt(17);
        this.f474333p = cursor.getString(15);
        this.f474336s = cursor.getInt(18);
        byte[] blob = cursor.getBlob(19);
        this.f474335r = blob;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(blob)) {
            byte[] bArr = this.f474335r;
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.e2 e2Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.e2();
                int i18 = e2Var.i(bArr);
                if (i18 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AddrUpload", "parse LVBuffer error:" + i18);
                } else {
                    this.f474338u = e2Var.g();
                    this.f474339v = e2Var.e();
                    this.f474340w = e2Var.g();
                    this.f474341x = e2Var.g();
                    this.f474342y = e2Var.g();
                    this.f474343z = e2Var.e();
                    this.A = e2Var.g();
                    this.B = e2Var.e();
                    this.C = e2Var.e();
                    this.D = e2Var.g();
                    this.E = e2Var.g();
                    this.F = e2Var.g();
                    this.G = e2Var.e();
                    this.H = e2Var.g();
                    this.I = e2Var.f();
                    this.f474317J = e2Var.e();
                    this.K = e2Var.g();
                    this.L = e2Var.g();
                    this.M = e2Var.g();
                    this.N = e2Var.f();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AddrUpload", e17, "", new java.lang.Object[0]);
            }
        }
        this.f474337t = cursor.getInt(20);
    }

    public android.content.ContentValues c() {
        byte[] bArr;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((this.O & 1) != 0) {
            contentValues.put(dm.i4.f66865x76d1ec5a, java.lang.Integer.valueOf(this.f474318a));
        }
        if ((this.O & 2) != 0) {
            contentValues.put("md5", e());
        }
        if ((this.O & 4) != 0) {
            java.lang.String str = this.f474320c;
            if (str == null) {
                str = "";
            }
            contentValues.put("peopleid", str);
        }
        if ((this.O & 8) != 0) {
            contentValues.put("uploadtime", java.lang.Long.valueOf(this.f474321d));
        }
        if ((this.O & 16) != 0) {
            contentValues.put("realname", h());
        }
        if ((this.O & 32) != 0) {
            java.lang.String str2 = this.f474323f;
            if (str2 == null) {
                str2 = "";
            }
            contentValues.put("realnamepyinitial", str2);
        }
        if ((this.O & 64) != 0) {
            java.lang.String str3 = this.f474324g;
            if (str3 == null) {
                str3 = "";
            }
            contentValues.put("realnamequanpin", str3);
        }
        if ((this.O & 128) != 0) {
            contentValues.put(dm.i4.f66875xa013b0d5, i());
        }
        if ((this.O & 256) != 0) {
            contentValues.put("nickname", g());
        }
        if ((this.O & 512) != 0) {
            java.lang.String str4 = this.f474327j;
            if (str4 == null) {
                str4 = "";
            }
            contentValues.put("nicknamepyinitial", str4);
        }
        if ((this.O & 1024) != 0) {
            java.lang.String str5 = this.f474328k;
            if (str5 == null) {
                str5 = "";
            }
            contentValues.put("nicknamequanpin", str5);
        }
        if ((this.O & 2048) != 0) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f474329l));
        }
        if ((this.O & 4096) != 0) {
            contentValues.put("moblie", f());
        }
        if ((this.O & 8192) != 0) {
            java.lang.String str6 = this.f474331n;
            if (str6 == null) {
                str6 = "";
            }
            contentValues.put(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5852x3f0537c, str6);
        }
        if ((this.O & 16384) != 0) {
            int i17 = this.f474332o;
            if (i17 == 0) {
                contentValues.put("status", (java.lang.Integer) 65536);
            } else {
                contentValues.put("status", java.lang.Integer.valueOf(i17));
            }
        }
        if ((this.O & 32768) != 0) {
            contentValues.put("reserved1", this.f474333p);
        }
        if ((this.O & 131072) != 0) {
            contentValues.put("reserved3", java.lang.Integer.valueOf(this.f474334q));
        }
        if ((this.O & 262144) != 0) {
            contentValues.put("reserved4", java.lang.Integer.valueOf(this.f474336s));
        }
        if ((this.O & 524288) != 0) {
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.e2 e2Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.e2();
                e2Var.h();
                e2Var.m(this.f474338u);
                e2Var.k(this.f474339v);
                e2Var.m(this.f474340w);
                e2Var.m(this.f474341x);
                e2Var.m(this.f474342y);
                e2Var.k(this.f474343z);
                e2Var.m(this.A);
                e2Var.k(this.B);
                e2Var.k(this.C);
                e2Var.m(this.D);
                e2Var.m(this.E);
                e2Var.m(this.F);
                e2Var.k(this.G);
                e2Var.m(this.H);
                e2Var.l(this.I);
                e2Var.k(this.f474317J);
                e2Var.m(this.K);
                e2Var.m(this.L);
                e2Var.m(this.M);
                e2Var.l(this.N);
                bArr = e2Var.a();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AddrUpload", e17, "", new java.lang.Object[0]);
                bArr = null;
            }
            this.f474335r = bArr;
            contentValues.put("lvbuf", bArr);
        }
        if ((this.O & 1048576) != 0) {
            contentValues.put("showhead", java.lang.Integer.valueOf(this.f474337t));
        }
        return contentValues;
    }

    public java.lang.String e() {
        java.lang.String str = this.f474319b;
        return str == null ? "" : str;
    }

    public java.lang.String f() {
        java.lang.String str = this.f474330m;
        return str == null ? "" : str;
    }

    public java.lang.String g() {
        java.lang.String str = this.f474326i;
        return str == null ? "" : str;
    }

    public java.lang.String h() {
        java.lang.String str = this.f474322e;
        return str == null ? "" : str;
    }

    public java.lang.String i() {
        java.lang.String str = this.f474325h;
        return str == null ? "" : str;
    }
}
