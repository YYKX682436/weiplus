package w11;

/* loaded from: classes12.dex */
public class b0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f523504d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.v0 f523505e;

    /* renamed from: f, reason: collision with root package name */
    public final int f523506f;

    /* renamed from: g, reason: collision with root package name */
    public int f523507g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f523508h;

    /* renamed from: i, reason: collision with root package name */
    public final int f523509i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f523510m;

    /* renamed from: n, reason: collision with root package name */
    public final int f523511n;

    /* renamed from: o, reason: collision with root package name */
    public final r45.cu5 f523512o;

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f523513p;

    /* renamed from: q, reason: collision with root package name */
    public final long f523514q;

    public b0(int i17, int i18, java.lang.String str, int i19, r45.cu5 cu5Var, byte[] bArr, int i27, long j17) {
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(i18);
        objArr[1] = str;
        objArr[2] = java.lang.Integer.valueOf(i19);
        objArr[3] = java.lang.Integer.valueOf(cu5Var == null ? -1 : cu5Var.f453372d);
        objArr[4] = java.lang.Integer.valueOf(bArr != null ? bArr.length : -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetAxAuth", "summerauthax NetsceneAxAuth funcId[%d] uri[%s], bType[%d] ticket[%d] randomKey[%d]", objArr);
        this.f523506f = i17;
        this.f523509i = i18;
        this.f523510m = str;
        this.f523511n = i19;
        this.f523512o = cu5Var;
        this.f523513p = bArr;
        w11.y yVar = new w11.y(i18, str, i19, cu5Var, bArr);
        this.f523505e = yVar;
        this.f523507g = i27;
        this.f523508h = str;
        this.f523514q = j17;
        yVar.mo47979x2d63726f().m150619xa36f0263(bArr);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f523504d = u0Var;
        int i17 = this.f523507g + 1;
        this.f523507g = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetAxAuth", "summerauthax doScene callback[%s] retry count %d , uri %s ", u0Var, java.lang.Integer.valueOf(i17), this.f523508h);
        int i18 = this.f523509i;
        com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var = this.f523505e;
        if (i18 == 799) {
            v0Var.mo47987xb512c125(2);
        }
        jx3.f.INSTANCE.mo68477x336bdfd8(148L, 129L, 1L, false);
        return mo9409x10f9447a(sVar, v0Var, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return ((w11.y) this.f523505e).f523704c;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetAxAuth", "summerauthax type [%d], onGYNetEnd [%d, %d, %s], retry count %d, uri %s ", java.lang.Integer.valueOf(mo808xfb85f7b0()), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Integer.valueOf(this.f523507g), this.f523508h);
        if (i18 == 0 && i19 == 0) {
            r45.uc ucVar = ((w11.x) v0Var.mo13821x7f35c2d1()).f523695a;
            try {
                com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153526n.R1(this.f523506f, ucVar.mo14344x5f01b1f6(), bArr, this.f523514q);
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = java.lang.Integer.valueOf(this.f523506f);
                byte[] mo14344x5f01b1f6 = ucVar.mo14344x5f01b1f6();
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                objArr[1] = java.lang.Integer.valueOf(mo14344x5f01b1f6 == null ? -1 : mo14344x5f01b1f6.length);
                objArr[2] = java.lang.Integer.valueOf(bArr == null ? -1 : bArr.length);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetAxAuth", "set axauth session btype[%d], session length [%d], cookie length[%d]", objArr);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetAxAuth", e17, "", new java.lang.Object[0]);
            }
            if (this.f523509i == 799) {
                com.p314xaae8f345.mm.p971x6de15a2e.x2.c().k();
            }
            com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153526n.Y0(this.f523506f, false, this.f523514q);
        } else {
            int i27 = this.f523507g;
            if (i27 >= 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetAxAuth", "axauth retry reach max times %d, uri is %s ", java.lang.Integer.valueOf(i27), this.f523508h);
                com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153526n.Y0(this.f523506f, false, this.f523514q);
            } else if (v0Var == null || v0Var.mo13821x7f35c2d1() == null || !(v0Var.mo13821x7f35c2d1().mo150578x7f2fddf8() == -1 || v0Var.mo13821x7f35c2d1().mo150578x7f2fddf8() == -446)) {
                com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153526n.Y0(this.f523506f, false, this.f523514q);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetAxAuth", "summerauth retry NetsceneAxAuth:%d", java.lang.Integer.valueOf(this.f523507g));
                ((ku5.t0) ku5.t0.f394148d).l(new java.lang.Runnable() { // from class: w11.b0$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        w11.b0 b0Var = w11.b0.this;
                        b0Var.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetAxAuth", "summerauth do NetsceneAxAuth");
                        if (new w11.b0(b0Var.f523506f, b0Var.f523509i, b0Var.f523510m, b0Var.f523511n, b0Var.f523512o, b0Var.f523513p, b0Var.f523507g, b0Var.f523514q).mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.x2.c(), new w11.C30662x57b5d14()) < 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetAxAuth", "send axauth failed %s ", b0Var.f523508h);
                            b0Var.f523504d.mo815x76e0bfae(3, -1, "", b0Var);
                            com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153526n.Y0(b0Var.f523506f, false, b0Var.f523514q);
                        }
                    }
                }, 30000L, "axauth");
            }
        }
        this.f523504d.mo815x76e0bfae(i18, i19, str, this);
        if (i19 == -446) {
            jx3.f.INSTANCE.mo68477x336bdfd8(148L, 137L, 1L, false);
        } else if (i19 == -104) {
            jx3.f.INSTANCE.mo68477x336bdfd8(148L, 136L, 1L, false);
        } else if (i19 == -13) {
            jx3.f.INSTANCE.mo68477x336bdfd8(148L, 135L, 1L, false);
        } else if (i19 == -3) {
            jx3.f.INSTANCE.mo68477x336bdfd8(148L, 134L, 1L, false);
        } else if (i19 == -2) {
            jx3.f.INSTANCE.mo68477x336bdfd8(148L, 133L, 1L, false);
        } else if (i19 == -1) {
            jx3.f.INSTANCE.mo68477x336bdfd8(148L, 132L, 1L, false);
        } else if (i19 != 0) {
            jx3.f.INSTANCE.mo68477x336bdfd8(148L, 138L, 1L, false);
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(148L, 130L, 1L, false);
        }
        if (i18 != 0) {
            jx3.f.INSTANCE.mo68477x336bdfd8(148L, 131L, 1L, false);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 3;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }
}
