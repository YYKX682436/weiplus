package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes16.dex */
public class m2 implements com.p314xaae8f345.mm.p971x6de15a2e.s {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.v f152231d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.l2 f152232e;

    public m2(com.p314xaae8f345.mm.p971x6de15a2e.v vVar) {
        this.f152231d = vVar;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public java.lang.String A0() {
        try {
            return this.f152231d.A0();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "query remote network server ip failed, %s", e17);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public void B(java.lang.String str) {
        try {
            this.f152231d.B(str);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public void C(boolean z17) {
        try {
            this.f152231d.C(z17);
        } catch (java.lang.Exception e17) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public int D(int[] iArr, boolean z17, long j17, int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RDispatcher", "uploadLog: timespans=%s, isLogin=%s, uin=%s, beginHour=%s, endHour=%s, commextraInfo=%s, prefix=%s, suffix=%s", java.util.Arrays.toString(iArr), java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, str2, str3);
        } catch (java.lang.Exception e17) {
            e = e17;
        }
        try {
            return this.f152231d.D(iArr, z17, j17, i17, i18, str, str2, str3);
        } catch (java.lang.Exception e18) {
            e = e18;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e));
            return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public int D0(java.lang.String str, boolean z17, java.util.List list) {
        try {
            return this.f152231d.D0(str, z17, list);
        } catch (java.lang.Exception e17) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public void F() {
        try {
            this.f152231d.F();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public com.p314xaae8f345.mm.p971x6de15a2e.o G() {
        try {
            if (this.f152232e == null) {
                this.f152232e = new com.p314xaae8f345.mm.p944x882e457a.l2(this.f152231d.mo180101G());
            }
            return this.f152232e;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "getAccInfo failed, core service down, %s", e17);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public void H(long j17, long j18) {
        try {
            this.f152231d.H(j17, j18);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public void I(java.lang.String str) {
        try {
            this.f152231d.I(str);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public int J(com.p314xaae8f345.mm.p971x6de15a2e.z0 z0Var, com.p314xaae8f345.mm.p971x6de15a2e.o0 o0Var, int i17) {
        try {
            return this.f152231d.J(z0Var, o0Var, i17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "remote dispatcher lost, send failed, %s", e17);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public void J0() {
        try {
            this.f152231d.J0();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public java.lang.String[] K() {
        try {
            return this.f152231d.K();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public long L() {
        try {
            return this.f152231d.L();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return 0L;
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public byte[] N(int i17, int i18) {
        try {
            return this.f152231d.N(i17, i18);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public int P(java.lang.String str, int i17, int i18, int i19, int i27, byte[] bArr, byte[] bArr2, com.p314xaae8f345.mm.p971x6de15a2e.c1 c1Var) {
        try {
            return this.f152231d.P(str, i17, i18, i19, i27, bArr, bArr2, c1Var);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public java.lang.String[] P0(java.lang.String str) {
        try {
            return this.f152231d.P0(str);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public void Q(java.lang.String[] strArr, int[] iArr) {
        try {
            this.f152231d.Q(strArr, iArr);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public int Q0(int i17) {
        try {
            return this.f152231d.Q0(i17);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public void R(boolean z17) {
        try {
            this.f152231d.R(z17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "change active status failed, core service down, %s", e17);
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public int T0(java.lang.String str, int i17, int i18, java.util.List list) {
        try {
            return this.f152231d.T0(str, i17, i18, list);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return 0;
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public void U() {
        try {
            this.f152231d.U();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public void W0(java.lang.String str) {
        try {
            this.f152231d.W0(str);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public void X(boolean z17) {
        try {
            this.f152231d.X(z17);
        } catch (java.lang.Exception e17) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public void Y(boolean z17) {
        try {
            this.f152231d.Y(z17);
        } catch (java.lang.Exception e17) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public int Z0(java.lang.String str, int i17, long j17, java.lang.String str2, java.lang.String str3) {
        try {
            return this.f152231d.Z0(str, i17, j17, str2, str3);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return -1;
        }
    }

    public void a(com.p314xaae8f345.mm.p971x6de15a2e.y yVar) {
        try {
            this.f152231d.ke(yVar);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    /* renamed from: ackActionNotify */
    public int mo48026x708d4848(java.lang.String str, long j17, int i17) {
        try {
            return this.f152231d.mo48026x708d4848(str, j17, i17);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return -1;
        }
    }

    public void b(com.p314xaae8f345.mm.p971x6de15a2e.e0 e0Var) {
        try {
            this.f152231d.hh(e0Var);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    public void c(o45.mi miVar) {
        try {
            this.f152231d.Uh(miVar);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public void d0(int i17) {
        try {
            this.f152231d.d0(i17);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public void d1() {
        try {
            this.f152231d.d1();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public int e0() {
        try {
            return this.f152231d.e0();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return 1;
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public java.lang.String[] e1(boolean z17) {
        try {
            return this.f152231d.e1(z17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "query remote network server ip failed, %s", e17);
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public void f1(com.p314xaae8f345.mm.p971x6de15a2e.b0 b0Var) {
        try {
            this.f152231d.f1(b0Var);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public boolean g0() {
        try {
            return this.f152231d.g0();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "core service down, guess network stable, %s", e17);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return true;
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    /* renamed from: getHostByName */
    public int mo48027x8faab340(java.lang.String str, java.util.List list) {
        try {
            return this.f152231d.mo48027x8faab340(str, list);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public void h1(com.p314xaae8f345.mm.p971x6de15a2e.b0 b0Var) {
        try {
            this.f152231d.h1(b0Var);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public void i1(int i17) {
        try {
            this.f152231d.i1(i17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "cancel remote rr failed, netid=%d, %s", java.lang.Integer.valueOf(i17), e17);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public void j0(java.lang.String[] strArr, java.lang.String[] strArr2, int[] iArr) {
        try {
            this.f152231d.j0(strArr, strArr2, iArr);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public void j1(u31.c cVar) {
        try {
            this.f152231d.j1(cVar);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public void k1(java.lang.String str, java.lang.String str2, int[] iArr, int[] iArr2) {
        try {
            this.f152231d.k1(str, str2, iArr, iArr2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "dkidc setIDCHostInfo ip failed, core service down, %s", e17);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public void m0() {
        try {
            this.f152231d.m0();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public void n0(boolean z17) {
        try {
            this.f152231d.n0(z17);
        } catch (java.lang.Exception e17) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public void n1(boolean z17) {
        try {
            this.f152231d.n1(z17);
        } catch (java.lang.Exception e17) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public void p1(java.lang.String str, java.lang.String str2, int i17) {
        try {
            this.f152231d.p1(str, str2, i17);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public void q1(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            this.f152231d.q1(str, str2, str3);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public void r1(boolean z17) {
        try {
            this.f152231d.r1(z17);
        } catch (java.lang.Exception e17) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    /* renamed from: reset */
    public void mo48028x6761d4f() {
        try {
            this.f152231d.mo48028x6761d4f();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "reset failed, core service down, %s", e17);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public void s0(java.lang.String str) {
        try {
            this.f152231d.s0(str);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public com.p314xaae8f345.mm.p971x6de15a2e.h0 s1() {
        try {
            return this.f152231d.Ai();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    /* renamed from: simpleTestCommand */
    public void mo48029x19d1d47(java.lang.String str) {
        try {
            this.f152231d.mo48029x19d1d47(str);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public void u0() {
        try {
            this.f152231d.u0();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public void y() {
        try {
            this.f152231d.y();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public void z(java.lang.String str) {
        try {
            this.f152231d.z(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "ipxxStatistics remote call error, %s", e17);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public java.lang.String z0() {
        try {
            return this.f152231d.z0();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RDispatcher", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return null;
        }
    }
}
