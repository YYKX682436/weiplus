package com.tencent.mm.contact;

/* loaded from: classes11.dex */
public class s extends dm.e2 {
    public static final l75.e0 G2 = dm.e2.initAutoDBInfo(com.tencent.mm.contact.s.class);
    public static com.tencent.mm.contact.r H2 = null;
    public static com.tencent.mm.contact.q I2 = null;
    public long E2;
    public int F2;

    public s() {
        this.F2 = 0;
        super.X1("");
        super.M1("");
        super.R1("");
        super.S1("");
        super.k1("");
        super.n1("");
        super.p1("");
        super.o1("");
        super.D1("");
        super.a2(0);
        super.b2("");
        super.T1(0);
        super.setType(0);
        super.W1(0L);
        super.Z1(0);
        super.l1(0);
        super.r1("");
        this.I = 0;
        this.Y = "";
        this.Z = 0;
        this.L = 0;
        this.M = "";
        this.N = "";
        this.P = 0;
        this.Q = 0;
        this.R = "";
        this.S = "";
        this.T = 1;
        this.H = 0;
        this.U = 0;
        this.V = "";
        this.W = "";
        this.X = "";
        this.f236575p0 = 0;
        this.f236588y0 = "";
        this.f236585x0 = "";
        this.K = 0L;
        this.f236563J = "";
        this.f236570l1 = "";
        this.f236576p1 = 0;
        this.A1 = "";
        this.B1 = "";
        this.C1 = "";
        this.F1 = "";
        this.f236581u = true;
        C1("");
        super.P1("");
        Y1(0L);
        super.K1("");
        this.G1 = 0;
        this.f236581u = true;
        this.F2 = 0;
    }

    public static java.lang.String q3(java.lang.String str) {
        com.tencent.mm.contact.r rVar;
        if (str == null || str.isEmpty() || (rVar = H2) == null) {
            return str;
        }
        ((com.tencent.mm.app.t7) rVar).getClass();
        return !((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).Ai() ? str : com.tencent.mm.smiley.g.b().a(str);
    }

    public boolean A2() {
        return (128 & c1()) != 0;
    }

    public boolean B2() {
        return (getType() & 1024) == 0;
    }

    public void C2(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(this.F1, str)) {
            return;
        }
        this.F1 = str;
        this.f236581u = true;
        j2();
    }

    @Override // dm.e2
    public void D1(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(I0(), str)) {
            return;
        }
        super.D1(str);
        j2();
    }

    public void D2(int i17) {
        int i18 = this.f236586x1;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i18 == i17) {
            return;
        }
        this.f236586x1 = i17;
        this.f236581u = true;
        j2();
    }

    public void E2() {
        setType(getType() | 8);
    }

    public void F2(long j17) {
        if (com.tencent.mm.sdk.platformtools.t8.B0(this.L1, j17)) {
            return;
        }
        this.L1 = j17;
        this.f236581u = true;
        j2();
    }

    public void G2() {
        setType(getType() | 4);
    }

    public void H2(int i17, int i18) {
        int u07 = (i17 & i18) | (u0() & (~i17));
        int u08 = u0();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (u08 == u07) {
            return;
        }
        super.l1(u07);
        j2();
    }

    public void I2(long j17) {
        if (com.tencent.mm.sdk.platformtools.t8.B0(this.M1, j17)) {
            return;
        }
        this.M1 = j17;
        this.f236581u = true;
        j2();
    }

    public void J2(int i17) {
        int i18 = this.T;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i18 == i17) {
            return;
        }
        this.T = i17;
        this.f236581u = true;
        j2();
    }

    @Override // dm.e2
    public void K1(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(J0(), str)) {
            return;
        }
        super.K1(str);
        j2();
    }

    public void K2(int i17) {
        int i18 = this.f236576p1;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i18 == i17) {
            return;
        }
        this.f236576p1 = i17;
        this.f236581u = true;
        j2();
    }

    @Override // dm.e2
    public void L1(byte[] bArr) {
        byte[] L0 = L0();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (java.util.Arrays.equals(L0, bArr)) {
            return;
        }
        super.L1(bArr);
        j2();
    }

    public void L2(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(v0(), str)) {
            return;
        }
        this.X = str;
        this.f236581u = true;
        j2();
    }

    @Override // dm.e2
    public void M1(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(P0(), str)) {
            return;
        }
        super.M1(str);
        j2();
    }

    public void M2(int i17) {
        int i18 = this.Q;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i18 == i17) {
            return;
        }
        this.Q = i17;
        this.f236581u = true;
        j2();
    }

    public void N2() {
        setType(getType() | 1);
    }

    public void O2(r45.o80 o80Var) {
        r45.o80 A0 = A0();
        boolean z17 = (o80Var == null && A0 == null) ? false : true;
        if (o80Var != null && A0 != null) {
            java.util.LinkedList linkedList = A0.f382018d;
            java.util.LinkedList linkedList2 = o80Var.f382018d;
            if (linkedList != null && linkedList2 != null && linkedList.size() > 0 && linkedList2.size() > 0 && linkedList.size() == linkedList2.size()) {
                z17 = false;
                for (int i17 = 0; i17 < linkedList.size(); i17++) {
                    if (!((r45.c5) linkedList.get(i17)).f371292d.equals(((r45.c5) linkedList2.get(i17)).f371292d)) {
                        z17 = true;
                    }
                }
            }
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RContact", "setContactExtraInfo not need Upate!");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RContact", "setContactExtraInfo need Upate!");
        q1(o80Var);
        j2();
    }

    @Override // dm.e2
    public java.lang.String P0() {
        return s2() ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.bbe) : super.P0();
    }

    @Override // dm.e2
    public void P1(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(Q0(), str)) {
            return;
        }
        super.P1(str);
        j2();
    }

    public void P2(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(this.Y, str)) {
            return;
        }
        this.Y = str;
        this.f236581u = true;
        j2();
    }

    @Override // dm.e2
    public void R1(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(T0(), str)) {
            return;
        }
        super.R1(str);
        j2();
    }

    @Override // dm.e2
    public void S1(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(U0(), str)) {
            return;
        }
        super.S1(str);
        j2();
    }

    public void S2(long j17) {
        if (com.tencent.mm.sdk.platformtools.t8.B0(this.K, j17)) {
            return;
        }
        this.K = j17;
        this.f236581u = true;
        j2();
    }

    @Override // dm.e2
    public java.lang.String T0() {
        return s2() ? "YZXDWXYH" : (super.T0() == null || super.T0().length() < 0) ? U0() : super.T0();
    }

    @Override // dm.e2
    public void T1(int i17) {
        int W0 = W0();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (W0 == i17) {
            return;
        }
        super.T1(i17);
        j2();
    }

    public void T2(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(this.f236563J, str)) {
            return;
        }
        this.f236563J = str;
        this.f236581u = true;
        j2();
    }

    @Override // dm.e2
    public java.lang.String U0() {
        return s2() ? "YIZHUXIAODEWEIXINYONGHU" : (super.U0() == null || super.U0().length() < 0) ? P0() : super.U0();
    }

    @Override // dm.e2
    public void U1(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(Z0(), str)) {
            return;
        }
        super.U1(str);
        j2();
    }

    public void U2() {
        setType(getType() | 32);
    }

    @Override // dm.e2
    public void V1(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(a1(), str)) {
            return;
        }
        super.V1(str);
        j2();
    }

    public void V2(int i17) {
        int i18 = this.H;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i18 == i17) {
            return;
        }
        this.H = i17;
        this.f236581u = true;
        j2();
    }

    @Override // dm.e2
    public int W0() {
        return s2() ? c2() : super.W0();
    }

    @Override // dm.e2
    public void W1(long j17) {
        if (com.tencent.mm.sdk.platformtools.t8.B0(c1(), j17)) {
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        java.lang.String d17 = d1();
        if (d17 == null) {
            d17 = "null";
        }
        objArr[0] = d17;
        objArr[1] = java.lang.Long.valueOf(c1());
        objArr[2] = java.lang.Long.valueOf(j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.RContact", "setUiType %s old:%s new:%s", objArr);
        super.W1(j17);
        j2();
    }

    public void W2(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(this.A1, str)) {
            return;
        }
        this.A1 = str;
        this.f236581u = true;
        j2();
    }

    @Override // dm.e2
    public void X1(java.lang.String str) {
        if (!com.tencent.mm.sdk.platformtools.t8.D0(d1(), str)) {
            super.X1(str);
            j2();
        }
        n3(d2());
    }

    public void X2(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(this.B1, str)) {
            return;
        }
        this.B1 = str;
        this.f236581u = true;
        j2();
    }

    public void Y2(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(this.C1, str)) {
            return;
        }
        this.C1 = str;
        this.f236581u = true;
        j2();
    }

    @Override // dm.e2
    public void Z1(int i17) {
        int f17 = f1();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (f17 == i17) {
            return;
        }
        super.Z1(i17);
        j2();
    }

    public void Z2(int i17) {
        int i18 = this.U;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i18 == i17) {
            return;
        }
        this.U = i17;
        this.f236581u = true;
        j2();
    }

    @Override // dm.e2
    public void a2(int i17) {
        int i18 = i1();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i18 == i17) {
            return;
        }
        super.a2(i17);
        j2();
    }

    public void a3(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(this.E1, str)) {
            return;
        }
        this.E1 = str;
        this.f236581u = true;
        j2();
    }

    @Override // dm.e2
    public void b2(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(j1(), str)) {
            return;
        }
        super.b2(str);
        j2();
    }

    public void b3(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(R0(), str)) {
            return;
        }
        this.W = str;
        this.f236581u = true;
        j2();
    }

    public int c2() {
        char c17;
        if (z0() != null && !z0().equals("")) {
            c17 = z0().charAt(0);
        } else if (y0() != null && !y0().equals("")) {
            c17 = y0().charAt(0);
        } else if (s2()) {
            c17 = 'Y';
        } else if (super.T0() != null && !super.T0().equals("")) {
            c17 = super.T0().charAt(0);
        } else if (super.U0() == null || super.U0().equals("")) {
            boolean z17 = true;
            if (super.P0() != null && !super.P0().equals("")) {
                char charAt = super.P0().charAt(0);
                if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
                    c17 = super.P0().charAt(0);
                }
            }
            if (d1() != null && !d1().equals("")) {
                char charAt2 = d1().charAt(0);
                if ((charAt2 < 'A' || charAt2 > 'Z') && (charAt2 < 'a' || charAt2 > 'z')) {
                    z17 = false;
                }
                if (z17) {
                    c17 = d1().charAt(0);
                }
            }
            c17 = ' ';
        } else {
            c17 = super.U0().charAt(0);
        }
        if (c17 >= 'a' && c17 <= 'z') {
            return (char) (c17 - ' ');
        }
        if (c17 < 'A' || c17 > 'Z') {
            return 123;
        }
        return c17;
    }

    public void c3(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(this.f236570l1, str)) {
            return;
        }
        this.f236570l1 = str;
        this.f236581u = true;
        j2();
    }

    @Override // dm.e2, l75.f0
    public void convertFrom(android.database.Cursor cursor) {
        super.convertFrom(cursor);
        this.E2 = this.systemRowid;
        super.L1(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long d2() {
        /*
            r3 = this;
            java.lang.String r0 = r3.d1()
            java.lang.String r1 = com.tencent.mm.storage.v3.f196273a
            if (r0 == 0) goto L20
            int r1 = r0.length()
            if (r1 > 0) goto Lf
            goto L20
        Lf:
            java.lang.String r1 = "@"
            boolean r2 = r0.contains(r1)
            if (r2 == 0) goto L27
            int r1 = r0.indexOf(r1)
            java.lang.String r0 = r0.substring(r1)
            goto L29
        L20:
            java.lang.String r0 = "MicroMsg.ConstantsStorage"
            java.lang.String r1 = "calculateReverseUserName failed"
            com.tencent.mars.xlog.Log.e(r0, r1)
        L27:
            java.lang.String r0 = ""
        L29:
            java.util.HashMap r1 = com.tencent.mm.storage.v3.f196276d
            boolean r2 = r1.containsKey(r0)
            if (r2 == 0) goto L3c
            java.lang.Object r0 = r1.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            goto L48
        L3c:
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r0 != 0) goto L46
            r0 = 33554432(0x2000000, double:1.6578092E-316)
            goto L48
        L46:
            r0 = 0
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.contact.s.d2():long");
    }

    public void d3(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(this.f236589y1, str)) {
            return;
        }
        this.f236589y1 = str;
        this.f236581u = true;
        j2();
    }

    public int e2() {
        return (int) this.E2;
    }

    public void e3(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(this.f236591z1, str)) {
            return;
        }
        this.f236591z1 = str;
        this.f236581u = true;
        j2();
    }

    public java.lang.String f2() {
        com.tencent.mm.contact.q qVar = I2;
        java.lang.String a17 = qVar != null ? ((com.tencent.mm.app.s7) qVar).a(d1()) : null;
        return a17 != null ? a17 : (P0() == null || P0().length() <= 0) ? h2() : q3(P0());
    }

    public java.lang.String g2() {
        return (w0() == null || w0().trim().equals("")) ? f2() : q3(w0());
    }

    public void g3(int i17) {
        int i18 = this.I;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i18 == i17) {
            return;
        }
        this.I = i17;
        this.f236581u = true;
        j2();
    }

    @Override // dm.e2, l75.f0
    public l75.e0 getDBInfo() {
        return G2;
    }

    public int getSource() {
        return this.f236575p0 % 1000000;
    }

    public java.lang.String h2() {
        java.lang.String a17;
        java.lang.String t07 = t0();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(t07)) {
            return t07;
        }
        java.lang.String d17 = d1();
        if (d17 == null) {
            a17 = null;
        } else if (d17.toLowerCase().endsWith("@t.qq.com")) {
            a17 = "@" + d17.replace("@t.qq.com", "");
        } else if (d17.toLowerCase().endsWith("@qqim")) {
            a17 = d17.replace("@qqim", "");
            long longValue = java.lang.Long.valueOf(a17).longValue();
            if (longValue < 0) {
                a17 = new kk.v(longValue).toString();
            }
        } else {
            a17 = com.tencent.mm.contact.u.a();
        }
        return (a17 == null || a17.length() == 0) ? com.tencent.mm.contact.u.a() : a17;
    }

    public void h3(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(this.V, str)) {
            return;
        }
        this.V = str;
        this.f236581u = true;
        j2();
    }

    public java.lang.String i2() {
        com.tencent.mm.contact.q qVar = I2;
        java.lang.String a17 = qVar != null ? ((com.tencent.mm.app.s7) qVar).a(d1()) : null;
        return a17 != null ? a17 : (P0() == null || P0().length() <= 0) ? com.tencent.mm.contact.u.a() : q3(P0());
    }

    public void i3() {
        setType(getType() | 8388608);
    }

    public final int j2() {
        int i17 = this.F2 + 1;
        this.F2 = i17;
        return i17;
    }

    public void j3(int i17) {
        int i18 = this.f236575p0;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i18 == i17) {
            return;
        }
        this.f236575p0 = i17;
        this.f236581u = true;
        j2();
    }

    @Override // dm.e2
    public void k1(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(t0(), str)) {
            return;
        }
        super.k1(str);
        j2();
    }

    public boolean k2() {
        return (f1() & 8) > 0;
    }

    public final void k3(boolean z17) {
        if (z17) {
            setType(getType() | 268435456);
        } else {
            setType(getType() & (-268435457));
        }
    }

    public boolean l2() {
        return com.tencent.mm.storage.z3.F3(d1()) || this.f236586x1 == 5;
    }

    public void l3(int i17) {
        int type = getType();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (type == i17) {
            return;
        }
        super.setType(i17);
        j2();
    }

    public boolean m2() {
        return this.f236586x1 == 1;
    }

    public void m3(int i17) {
        int i18 = this.L;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i18 == i17) {
            return;
        }
        this.L = i17;
        this.f236581u = true;
        j2();
    }

    @Override // dm.e2
    public void n1(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(w0(), str)) {
            return;
        }
        super.n1(str);
        j2();
    }

    public boolean n2() {
        return k2() && this.f236586x1 == 0;
    }

    public void n3(long j17) {
        if (com.tencent.mm.sdk.platformtools.t8.B0(e1(), j17)) {
            return;
        }
        Y1(j17);
        j2();
    }

    @Override // dm.e2
    public void o1(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(y0(), str)) {
            return;
        }
        super.o1(str);
        j2();
    }

    public boolean o2() {
        return (getType() & 8) != 0;
    }

    public void o3(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(this.f236588y0, str)) {
            return;
        }
        this.f236588y0 = str;
        this.f236581u = true;
        j2();
    }

    @Override // dm.e2
    public void p1(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(z0(), str)) {
            return;
        }
        super.p1(str);
        j2();
    }

    public boolean p2() {
        return (32768 & getType()) != 0;
    }

    public void p3(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(this.f236585x0, str)) {
            return;
        }
        this.f236585x0 = str;
        this.f236581u = true;
        j2();
    }

    public boolean q2() {
        return (getType() & 4) != 0;
    }

    @Override // dm.e2
    public void r1(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(D0(), str)) {
            return;
        }
        super.r1(str);
        j2();
    }

    public boolean r2() {
        return (getType() & 1) != 0;
    }

    public void r3() {
        setType(getType() & (-9));
    }

    public boolean s2() {
        return F0() == 1;
    }

    public void s3() {
        java.lang.String d17 = d1();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(getType());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.w("MicroMsg.RContact", "unSetContact!! user:%s oldType:%d [%s]", d17, valueOf, new com.tencent.mm.sdk.platformtools.z3());
        setType(getType() & (-2));
    }

    public void setFromType(int i17) {
        int i18 = this.Z;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i18 == i17) {
            return;
        }
        this.Z = i17;
        this.f236581u = true;
        j2();
    }

    @Override // dm.e2
    public void setType(int i17) {
        int type = getType();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (type == i17) {
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        java.lang.String d17 = d1();
        if (d17 == null) {
            d17 = "null";
        }
        objArr[0] = d17;
        objArr[1] = java.lang.Integer.valueOf(getType());
        objArr[2] = java.lang.Integer.valueOf(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.RContact", "setType %s old:%s new:%s", objArr);
        super.setType(i17);
        j2();
    }

    @Override // dm.e2
    public java.lang.String t0() {
        if (s2()) {
            return "";
        }
        com.tencent.mm.contact.q qVar = I2;
        java.lang.String str = null;
        if (qVar != null) {
            java.lang.String d17 = d1();
            com.tencent.mm.app.s7 s7Var = (com.tencent.mm.app.s7) qVar;
            java.util.HashMap hashMap = (java.util.HashMap) s7Var.f53773b;
            if (hashMap.containsKey(d17)) {
                str = s7Var.f53774c.getString(((java.lang.Integer) hashMap.get(d17)).intValue());
            }
        }
        return str == null ? super.t0() : str;
    }

    public boolean t2() {
        return (getType() & 64) != 0;
    }

    @Override // dm.e2
    public void u1(long j17) {
        if (com.tencent.mm.sdk.platformtools.t8.B0(getCreateTime(), j17)) {
            return;
        }
        super.u1(j17);
        j2();
    }

    public boolean u2() {
        return (getType() & 32) != 0;
    }

    public boolean v2() {
        return com.tencent.mm.storage.z3.R4(d1()) ? z2() : A2();
    }

    public boolean w2() {
        return (getType() & 2048) != 0;
    }

    public boolean x2() {
        return (getType() & 256) != 0;
    }

    public boolean y2() {
        return (8388608 & getType()) != 0;
    }

    @Override // dm.e2
    public void z1(int i17) {
        int F0 = F0();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (F0 == i17) {
            return;
        }
        super.z1(i17);
        j2();
    }

    public boolean z2() {
        return (268435456 & getType()) != 0;
    }
}
