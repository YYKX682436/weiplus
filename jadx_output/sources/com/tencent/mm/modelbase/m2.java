package com.tencent.mm.modelbase;

/* loaded from: classes16.dex */
public class m2 implements com.tencent.mm.network.s {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.network.v f70698d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.l2 f70699e;

    public m2(com.tencent.mm.network.v vVar) {
        this.f70698d = vVar;
    }

    @Override // com.tencent.mm.network.s
    public java.lang.String A0() {
        try {
            return this.f70698d.A0();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "query remote network server ip failed, %s", e17);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }

    @Override // com.tencent.mm.network.s
    public void B(java.lang.String str) {
        try {
            this.f70698d.B(str);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public void C(boolean z17) {
        try {
            this.f70698d.C(z17);
        } catch (java.lang.Exception e17) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public int D(int[] iArr, boolean z17, long j17, int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.RDispatcher", "uploadLog: timespans=%s, isLogin=%s, uin=%s, beginHour=%s, endHour=%s, commextraInfo=%s, prefix=%s, suffix=%s", java.util.Arrays.toString(iArr), java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, str2, str3);
        } catch (java.lang.Exception e17) {
            e = e17;
        }
        try {
            return this.f70698d.D(iArr, z17, j17, i17, i18, str, str2, str3);
        } catch (java.lang.Exception e18) {
            e = e18;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e));
            return -1;
        }
    }

    @Override // com.tencent.mm.network.s
    public int D0(java.lang.String str, boolean z17, java.util.List list) {
        try {
            return this.f70698d.D0(str, z17, list);
        } catch (java.lang.Exception e17) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return -1;
        }
    }

    @Override // com.tencent.mm.network.s
    public void F() {
        try {
            this.f70698d.F();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public com.tencent.mm.network.o G() {
        try {
            if (this.f70699e == null) {
                this.f70699e = new com.tencent.mm.modelbase.l2(this.f70698d.mo101G());
            }
            return this.f70699e;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "getAccInfo failed, core service down, %s", e17);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }

    @Override // com.tencent.mm.network.s
    public void H(long j17, long j18) {
        try {
            this.f70698d.H(j17, j18);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public void I(java.lang.String str) {
        try {
            this.f70698d.I(str);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public int J(com.tencent.mm.network.z0 z0Var, com.tencent.mm.network.o0 o0Var, int i17) {
        try {
            return this.f70698d.J(z0Var, o0Var, i17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "remote dispatcher lost, send failed, %s", e17);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return -1;
        }
    }

    @Override // com.tencent.mm.network.s
    public void J0() {
        try {
            this.f70698d.J0();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public java.lang.String[] K() {
        try {
            return this.f70698d.K();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }

    @Override // com.tencent.mm.network.s
    public long L() {
        try {
            return this.f70698d.L();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return 0L;
        }
    }

    @Override // com.tencent.mm.network.s
    public byte[] N(int i17, int i18) {
        try {
            return this.f70698d.N(i17, i18);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }

    @Override // com.tencent.mm.network.s
    public int P(java.lang.String str, int i17, int i18, int i19, int i27, byte[] bArr, byte[] bArr2, com.tencent.mm.network.c1 c1Var) {
        try {
            return this.f70698d.P(str, i17, i18, i19, i27, bArr, bArr2, c1Var);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return -1;
        }
    }

    @Override // com.tencent.mm.network.s
    public java.lang.String[] P0(java.lang.String str) {
        try {
            return this.f70698d.P0(str);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }

    @Override // com.tencent.mm.network.s
    public void Q(java.lang.String[] strArr, int[] iArr) {
        try {
            this.f70698d.Q(strArr, iArr);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public int Q0(int i17) {
        try {
            return this.f70698d.Q0(i17);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return -1;
        }
    }

    @Override // com.tencent.mm.network.s
    public void R(boolean z17) {
        try {
            this.f70698d.R(z17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "change active status failed, core service down, %s", e17);
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public int T0(java.lang.String str, int i17, int i18, java.util.List list) {
        try {
            return this.f70698d.T0(str, i17, i18, list);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return 0;
        }
    }

    @Override // com.tencent.mm.network.s
    public void U() {
        try {
            this.f70698d.U();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public void W0(java.lang.String str) {
        try {
            this.f70698d.W0(str);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public void X(boolean z17) {
        try {
            this.f70698d.X(z17);
        } catch (java.lang.Exception e17) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public void Y(boolean z17) {
        try {
            this.f70698d.Y(z17);
        } catch (java.lang.Exception e17) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public int Z0(java.lang.String str, int i17, long j17, java.lang.String str2, java.lang.String str3) {
        try {
            return this.f70698d.Z0(str, i17, j17, str2, str3);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return -1;
        }
    }

    public void a(com.tencent.mm.network.y yVar) {
        try {
            this.f70698d.ke(yVar);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public int ackActionNotify(java.lang.String str, long j17, int i17) {
        try {
            return this.f70698d.ackActionNotify(str, j17, i17);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return -1;
        }
    }

    public void b(com.tencent.mm.network.e0 e0Var) {
        try {
            this.f70698d.hh(e0Var);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    public void c(o45.mi miVar) {
        try {
            this.f70698d.Uh(miVar);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public void d0(int i17) {
        try {
            this.f70698d.d0(i17);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public void d1() {
        try {
            this.f70698d.d1();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public int e0() {
        try {
            return this.f70698d.e0();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return 1;
        }
    }

    @Override // com.tencent.mm.network.s
    public java.lang.String[] e1(boolean z17) {
        try {
            return this.f70698d.e1(z17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "query remote network server ip failed, %s", e17);
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }

    @Override // com.tencent.mm.network.s
    public void f1(com.tencent.mm.network.b0 b0Var) {
        try {
            this.f70698d.f1(b0Var);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public boolean g0() {
        try {
            return this.f70698d.g0();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "core service down, guess network stable, %s", e17);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return true;
        }
    }

    @Override // com.tencent.mm.network.s
    public int getHostByName(java.lang.String str, java.util.List list) {
        try {
            return this.f70698d.getHostByName(str, list);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return -1;
        }
    }

    @Override // com.tencent.mm.network.s
    public void h1(com.tencent.mm.network.b0 b0Var) {
        try {
            this.f70698d.h1(b0Var);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public void i1(int i17) {
        try {
            this.f70698d.i1(i17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "cancel remote rr failed, netid=%d, %s", java.lang.Integer.valueOf(i17), e17);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public void j0(java.lang.String[] strArr, java.lang.String[] strArr2, int[] iArr) {
        try {
            this.f70698d.j0(strArr, strArr2, iArr);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public void j1(u31.c cVar) {
        try {
            this.f70698d.j1(cVar);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public void k1(java.lang.String str, java.lang.String str2, int[] iArr, int[] iArr2) {
        try {
            this.f70698d.k1(str, str2, iArr, iArr2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "dkidc setIDCHostInfo ip failed, core service down, %s", e17);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public void m0() {
        try {
            this.f70698d.m0();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public void n0(boolean z17) {
        try {
            this.f70698d.n0(z17);
        } catch (java.lang.Exception e17) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public void n1(boolean z17) {
        try {
            this.f70698d.n1(z17);
        } catch (java.lang.Exception e17) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public void p1(java.lang.String str, java.lang.String str2, int i17) {
        try {
            this.f70698d.p1(str, str2, i17);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public void q1(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            this.f70698d.q1(str, str2, str3);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public void r1(boolean z17) {
        try {
            this.f70698d.r1(z17);
        } catch (java.lang.Exception e17) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public void reset() {
        try {
            this.f70698d.reset();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "reset failed, core service down, %s", e17);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public void s0(java.lang.String str) {
        try {
            this.f70698d.s0(str);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public com.tencent.mm.network.h0 s1() {
        try {
            return this.f70698d.Ai();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }

    @Override // com.tencent.mm.network.s
    public void simpleTestCommand(java.lang.String str) {
        try {
            this.f70698d.simpleTestCommand(str);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public void u0() {
        try {
            this.f70698d.u0();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public void y() {
        try {
            this.f70698d.y();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public void z(java.lang.String str) {
        try {
            this.f70698d.z(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "ipxxStatistics remote call error, %s", e17);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.mm.network.s
    public java.lang.String z0() {
        try {
            return this.f70698d.z0();
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RDispatcher", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }
}
