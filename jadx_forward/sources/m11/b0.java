package m11;

/* loaded from: classes12.dex */
public class b0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f404165J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;

    /* renamed from: a, reason: collision with root package name */
    public long f404166a;

    /* renamed from: b, reason: collision with root package name */
    public long f404167b;

    /* renamed from: c, reason: collision with root package name */
    public int f404168c;

    /* renamed from: d, reason: collision with root package name */
    public int f404169d;

    /* renamed from: h, reason: collision with root package name */
    public int f404173h;

    /* renamed from: i, reason: collision with root package name */
    public int f404174i;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f404176k;

    /* renamed from: n, reason: collision with root package name */
    public int f404179n;

    /* renamed from: o, reason: collision with root package name */
    public long f404180o;

    /* renamed from: p, reason: collision with root package name */
    public int f404181p;

    /* renamed from: r, reason: collision with root package name */
    public int f404183r;

    /* renamed from: v, reason: collision with root package name */
    public boolean f404187v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f404188w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f404189x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f404190y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f404191z;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f404170e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f404171f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f404172g = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f404175j = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f404177l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f404178m = "";

    /* renamed from: q, reason: collision with root package name */
    public long f404182q = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f404184s = 0;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f404185t = "";

    /* renamed from: u, reason: collision with root package name */
    public int f404186u = 1;

    public void A(java.lang.String str) {
        this.f404177l = str;
        this.K = true;
    }

    public void B(java.lang.String str) {
        this.f404176k = str;
        this.O = true;
    }

    public void C(int i17) {
        this.f404183r = i17;
        this.G = true;
    }

    public void D(int i17) {
        this.f404181p = i17;
        this.E = true;
    }

    public void E(java.lang.String str) {
        this.f404172g = str;
        this.B = true;
    }

    public void F(int i17) {
        this.f404169d = i17;
        this.f404190y = true;
    }

    public void a() {
        this.f404187v = false;
        this.f404188w = false;
        this.f404189x = false;
        this.f404190y = false;
        this.f404191z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.f404165J = false;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
    }

    public void b(android.database.Cursor cursor, boolean z17) {
        this.f404166a = cursor.getLong(0);
        this.f404167b = cursor.getLong(1);
        this.f404168c = cursor.getInt(2);
        this.f404169d = cursor.getInt(3);
        this.f404170e = cursor.getString(4);
        this.f404172g = cursor.getString(5);
        this.f404179n = cursor.getInt(6);
        this.f404180o = cursor.getLong(7);
        this.f404181p = cursor.getInt(8);
        cursor.getInt(9);
        this.f404182q = cursor.getLong(10);
        this.f404183r = cursor.getInt(11);
        this.f404185t = cursor.getString(12);
        this.f404184s = cursor.getInt(14);
        this.f404186u = cursor.getInt(15);
        this.f404177l = cursor.getString(16);
        this.f404173h = cursor.getInt(17);
        this.f404171f = cursor.getString(18);
        this.f404174i = cursor.getInt(19);
        this.f404175j = cursor.getString(20);
        cursor.getInt(21);
        if (z17) {
            this.f404176k = cursor.getString(23);
            this.f404178m = cursor.getString(22);
        } else {
            this.f404176k = cursor.getString(22);
            this.f404178m = cursor.getString(23);
        }
    }

    public android.content.ContentValues c() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f404187v) {
            contentValues.put(dm.i4.f66865x76d1ec5a, java.lang.Long.valueOf(this.f404166a));
        }
        if (this.f404188w) {
            contentValues.put("msgSvrId", java.lang.Long.valueOf(this.f404167b));
        }
        if (this.f404189x) {
            contentValues.put("offset", java.lang.Integer.valueOf(this.f404168c));
        }
        if (this.f404190y) {
            contentValues.put("totalLen", java.lang.Integer.valueOf(this.f404169d));
        }
        if (this.f404191z) {
            contentValues.put("bigImgPath", this.f404170e);
        }
        if (this.A) {
            contentValues.put("midImgPath", this.f404171f);
        }
        if (this.B) {
            contentValues.put("thumbImgPath", this.f404172g);
        }
        if (this.C) {
            contentValues.put("createtime", java.lang.Integer.valueOf(this.f404179n));
        }
        if (this.D) {
            contentValues.put("msglocalid", java.lang.Long.valueOf(this.f404180o));
        }
        if (this.E) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f404181p));
        }
        if (this.F) {
            contentValues.put("reserved1", java.lang.Long.valueOf(this.f404182q));
        }
        if (this.G) {
            contentValues.put("reserved2", java.lang.Integer.valueOf(this.f404183r));
        }
        if (this.H) {
            contentValues.put("reserved3", this.f404185t);
        }
        if (this.I) {
            contentValues.put("hashdthumb", java.lang.Integer.valueOf(this.f404184s));
        }
        if (this.f404165J) {
            contentValues.put("iscomplete", java.lang.Integer.valueOf(this.f404168c < this.f404169d ? 0 : 1));
        }
        if (this.K) {
            contentValues.put("origImgMD5", this.f404177l);
        }
        if (this.L) {
            contentValues.put("compressType", java.lang.Integer.valueOf(this.f404173h));
        }
        if (this.M) {
            contentValues.put("forwardType", java.lang.Integer.valueOf(this.f404174i));
        }
        if (this.N) {
            contentValues.put("hevcPath", this.f404175j);
        }
        if (this.O) {
            contentValues.put("originSourceMd5", this.f404176k);
        }
        if (this.P) {
            contentValues.put("msgTalker", this.f404178m);
        }
        return contentValues;
    }

    public java.lang.String d() {
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(this.f404185t, "msg", null);
        if (d17 != null) {
            return (java.lang.String) d17.get(".msg.img.$aeskey");
        }
        return null;
    }

    public java.lang.String e() {
        return this.f404170e;
    }

    public java.lang.String f() {
        int i17 = this.f404173h;
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(this.f404185t, "msg", null);
        if (d17 == null) {
            return null;
        }
        return i17 != 1 ? (java.lang.String) d17.get(".msg.img.$cdnmidimgurl") : (java.lang.String) d17.get(".msg.img.$cdnbigimgurl");
    }

    public long g() {
        return this.f404182q;
    }

    public java.lang.String h() {
        return this.f404171f;
    }

    public java.lang.String i() {
        return this.f404172g;
    }

    public boolean j() {
        return this.f404182q > 0;
    }

    public boolean k() {
        int i17 = this.f404169d;
        return i17 != 0 && i17 == this.f404168c;
    }

    public boolean l() {
        return this.f404180o == 0 && this.f404167b == 0;
    }

    public void m(java.lang.String str) {
        this.f404170e = str;
        this.f404191z = true;
    }

    public void n(java.lang.String str) {
        java.lang.String str2 = this.f404185t;
        if ((str2 == null && str != null) || (str2 != null && !str2.equals(str))) {
            this.H = true;
        }
        this.f404185t = str;
    }

    public void o(int i17) {
        this.f404173h = i17;
        this.L = true;
    }

    public void p(int i17) {
        this.f404179n = i17;
        this.C = true;
    }

    public void q(int i17) {
        this.f404174i = i17;
        this.M = true;
    }

    public void r(long j17) {
        this.f404182q = j17;
        this.F = true;
    }

    public void s(java.lang.String str) {
        this.f404175j = str;
        this.N = true;
    }

    public void t(int i17) {
        if (this.f404186u != i17) {
            this.f404165J = true;
        }
        this.f404186u = i17;
    }

    public void u(long j17) {
        this.f404166a = j17;
        this.f404187v = true;
    }

    public void v(java.lang.String str) {
        this.f404171f = str;
        this.A = true;
    }

    public void w(long j17) {
        this.f404180o = j17;
        this.D = true;
    }

    public void x(long j17) {
        if (this.f404167b != j17) {
            this.f404188w = true;
        }
        this.f404167b = j17;
    }

    public void y(java.lang.String str) {
        this.f404178m = str;
        this.P = true;
    }

    public void z(int i17) {
        if (this.f404168c != i17) {
            this.f404189x = true;
        }
        this.f404168c = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Imgfo", "set offset : %d  id:%d total:%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(this.f404180o), java.lang.Integer.valueOf(this.f404169d));
        t(i17 < this.f404169d ? 0 : 1);
    }
}
