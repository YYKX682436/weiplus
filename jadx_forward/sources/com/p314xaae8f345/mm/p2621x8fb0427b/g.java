package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public class g implements e95.a {

    /* renamed from: field_alias */
    private java.lang.String f39217x28d276cb;

    /* renamed from: field_conRemark */
    public java.lang.String f39218x4854b29d;

    /* renamed from: field_deleteFlag */
    public int f39219x224e601c;

    /* renamed from: field_descWording */
    public java.lang.String f39220x7afe9902;

    /* renamed from: field_descWordingId */
    public java.lang.String f39221xb5bc69bd;

    /* renamed from: field_descWordingQuanpin */
    public java.lang.String f39222xb8dffb42;

    /* renamed from: field_lvbuff */
    public byte[] f39223x4cbb7c2;

    /* renamed from: field_nickname */
    private java.lang.String f39224x21f9b213;

    /* renamed from: field_openImAppid */
    public java.lang.String f39225xd03b1ec9;

    /* renamed from: field_remarkDesc */
    public java.lang.String f39226xf84aa96;

    /* renamed from: field_showHead */
    public int f39227x98b6022;

    /* renamed from: field_signature */
    public java.lang.String f39228xda9bc3b3;

    /* renamed from: field_username */
    private java.lang.String f39229xdec927b;

    /* renamed from: field_verifyFlag */
    private int f39230x7b8e4bea;

    /* renamed from: field_weiboFlag */
    public int f39231xe22b576f;

    @Override // e95.a
    public void I(int i17, byte[] bArr) {
        if (i17 == 9) {
            this.f39223x4cbb7c2 = bArr;
        }
    }

    @Override // e95.a
    public void L(int i17, long j17) {
        if (i17 == 4) {
            this.f39230x7b8e4bea = (int) j17;
            return;
        }
        if (i17 == 5) {
            this.f39227x98b6022 = (int) j17;
        } else if (i17 == 6) {
            this.f39231xe22b576f = (int) j17;
        } else {
            if (i17 != 8) {
                return;
            }
            this.f39219x224e601c = (int) j17;
        }
    }

    @Override // e95.a
    public void P(int i17, java.lang.String str) {
        if (i17 == 0) {
            this.f39229xdec927b = str;
            return;
        }
        if (i17 == 1) {
            this.f39224x21f9b213 = str;
            return;
        }
        if (i17 == 2) {
            this.f39217x28d276cb = str;
            return;
        }
        if (i17 == 3) {
            this.f39218x4854b29d = str;
            return;
        }
        switch (i17) {
            case 10:
                this.f39221xb5bc69bd = str;
                return;
            case 11:
                this.f39225xd03b1ec9 = str;
                return;
            case 12:
                this.f39220x7afe9902 = str;
                return;
            case 13:
                this.f39222xb8dffb42 = str;
                return;
            default:
                return;
        }
    }

    public void a(android.database.Cursor cursor) {
        this.f39229xdec927b = cursor.getString(0);
        this.f39224x21f9b213 = cursor.getString(1);
        this.f39217x28d276cb = cursor.getString(2);
        this.f39218x4854b29d = cursor.getString(3);
        this.f39230x7b8e4bea = cursor.getInt(4);
        this.f39227x98b6022 = cursor.getInt(5);
        this.f39231xe22b576f = cursor.getInt(6);
        cursor.getLong(7);
        this.f39219x224e601c = cursor.getInt(8);
        this.f39223x4cbb7c2 = cursor.getBlob(9);
        this.f39221xb5bc69bd = cursor.getString(10);
        this.f39225xd03b1ec9 = cursor.getString(11);
        if (cursor.getColumnCount() >= 14) {
            this.f39220x7afe9902 = cursor.getString(12);
            this.f39222xb8dffb42 = cursor.getString(13);
        }
        f();
    }

    public void b(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        this.f39229xdec927b = z3Var.d1();
        this.f39224x21f9b213 = z3Var.P0();
        this.f39217x28d276cb = z3Var.t0();
        this.f39218x4854b29d = z3Var.w0();
        this.f39230x7b8e4bea = z3Var.f1();
        this.f39227x98b6022 = z3Var.W0();
        this.f39231xe22b576f = z3Var.i1();
        this.f39219x224e601c = z3Var.F0();
        this.f39223x4cbb7c2 = z3Var.L0();
        if (((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Di(this.f39229xdec927b)) {
            this.f39220x7afe9902 = ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).aj(this.f39229xdec927b, false);
            this.f39225xd03b1ec9 = ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Vi(this.f39229xdec927b);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Ui(this.f39229xdec927b)) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f39225xd03b1ec9)) {
                vh0.g1 g1Var = (vh0.g1) i95.n0.c(vh0.g1.class);
                java.lang.String str = this.f39229xdec927b;
                vh0.i2 i2Var = (vh0.i2) g1Var;
                java.lang.String Vi = i2Var.Vi(str);
                java.lang.String Ui = i2Var.Ui(str);
                java.lang.String str2 = "";
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Vi) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Ui)) {
                    l41.q2 q2Var = (l41.q2) ((j41.b0) i95.n0.c(j41.b0.class));
                    q2Var.getClass();
                    u41.k kVar = new u41.k();
                    kVar.f69018x28d46377 = Vi;
                    kVar.f69019xbd959cfd = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                    kVar.f69024xd0366ace = Ui;
                    ((i41.l) i95.n0.c(i41.l.class)).Ui().get(kVar, "appid", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, "wordingId");
                    if (kVar.f72763xa3c65b86 == -1) {
                        q2Var.wi(Vi, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), Ui, 0);
                    } else {
                        str2 = kVar.f69021x9b64705f;
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getWordingQuanPinFromID(...)");
                }
                this.f39222xb8dffb42 = str2;
            }
        } else {
            this.f39220x7afe9902 = z3Var.G0();
            this.f39225xd03b1ec9 = z3Var.Q0();
        }
        f();
    }

    public java.lang.String c() {
        java.lang.String str = this.f39218x4854b29d;
        if (str != null && !str.trim().equals("")) {
            return this.f39218x4854b29d;
        }
        java.lang.String str2 = this.f39229xdec927b;
        com.p314xaae8f345.mm.p670x38b72420.q qVar = com.p314xaae8f345.mm.p670x38b72420.s.I2;
        java.lang.String str3 = null;
        java.lang.String a17 = qVar != null ? ((com.p314xaae8f345.mm.app.s7) qVar).a(str2) : null;
        if (a17 != null) {
            return a17;
        }
        java.lang.String str4 = this.f39224x21f9b213;
        if (str4 != null && str4.length() > 0) {
            return this.f39224x21f9b213;
        }
        java.lang.String str5 = this.f39217x28d276cb;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
            return str5;
        }
        java.lang.String str6 = this.f39229xdec927b;
        if (str6 != null) {
            if (str6.toLowerCase().endsWith("@t.qq.com")) {
                str3 = "@" + str6.replace("@t.qq.com", "");
            } else if (str6.toLowerCase().endsWith("@qqim")) {
                str3 = str6.replace("@qqim", "");
                long longValue = java.lang.Long.valueOf(str3).longValue();
                if (longValue < 0) {
                    str3 = new kk.v(longValue).m143587x9616526c();
                }
            } else {
                str3 = str6;
            }
        }
        return (str3 == null || str3.length() == 0) ? this.f39229xdec927b : str3;
    }

    public java.lang.String d() {
        return this.f39224x21f9b213;
    }

    public java.lang.String e() {
        return this.f39229xdec927b;
    }

    public void f() {
        byte[] bArr = this.f39223x4cbb7c2;
        if (bArr == null || bArr == null) {
            return;
        }
        try {
            if (bArr.length == 0) {
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.e2 e2Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.e2();
            if (e2Var.i(bArr) != 0) {
                return;
            }
            e2Var.n(4);
            e2Var.n(4);
            e2Var.o();
            e2Var.n(8);
            e2Var.n(4);
            e2Var.o();
            e2Var.o();
            e2Var.n(4);
            e2Var.n(4);
            e2Var.o();
            e2Var.o();
            e2Var.n(4);
            e2Var.n(4);
            this.f39228xda9bc3b3 = e2Var.g();
            e2Var.o();
            e2Var.o();
            e2Var.o();
            e2Var.n(4);
            e2Var.n(4);
            e2Var.o();
            e2Var.n(4);
            e2Var.o();
            e2Var.o();
            e2Var.n(4);
            e2Var.n(4);
            if (!e2Var.c()) {
                this.f39226xf84aa96 = e2Var.g();
            }
            this.f39223x4cbb7c2 = null;
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AddressUIContact", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // e95.a
    /* renamed from: getKey */
    public java.lang.Object mo78017xb5884f29() {
        return this.f39229xdec927b;
    }

    @Override // e95.a
    public void r(int i17, double d17) {
    }

    @Override // e95.a
    public void s(int i17) {
    }

    @Override // e95.a
    public void v() {
        f();
    }
}
