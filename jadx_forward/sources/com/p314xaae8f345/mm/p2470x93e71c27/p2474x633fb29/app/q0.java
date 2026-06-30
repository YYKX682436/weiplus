package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes9.dex */
public class q0 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f270576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f270577e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f270578f;

    public q0(long j17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, long j18) {
        this.f270576d = j17;
        this.f270577e = f9Var;
        this.f270578f = j18;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0());
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(i18);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr[3] = str == null ? "" : str;
        objArr[4] = java.lang.Long.valueOf(this.f270576d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgLogic", "sendFileUploadMsgCallback type:%d errType:%d errCode:%d errMsg:%s tempMsgId:%s", objArr);
        r45.yy5 yy5Var = (r45.yy5) oVar.f152243a.f152217a;
        if (yy5Var != null) {
            java.lang.String str2 = yy5Var.f473034e;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f270577e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.m124847x74d37ac6()) : null);
            sb6.append('_');
            sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.mo78012x3fdd41df()) : null);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str2, sb6.toString())) {
                if (i17 == 0 && i18 == 0) {
                    r45.zy5 zy5Var = (r45.zy5) oVar.f152244b.f152233a;
                    if (zy5Var != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgLogic", "FileUploadToken:%s NewMsgId:%s msgId:%s", zy5Var.f474009d, java.lang.Long.valueOf(zy5Var.f474010e), yy5Var.f473034e);
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(this.f270577e.Q0(), this.f270577e.m124847x74d37ac6());
                        if (Li.m124847x74d37ac6() == 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgLogic", "sendFileUploadMsgCallback msg:%s no exist!", yy5Var.f473034e);
                            return 0;
                        }
                        ot0.q v17 = ot0.q.v(Li.j());
                        rt0.b bVar = new rt0.b();
                        java.lang.String str3 = zy5Var.f474009d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str3, "<set-?>");
                        bVar.f480906c = str3;
                        bVar.f480905b = zy5Var.f474010e;
                        v17.f(bVar);
                        Li.d1(ot0.q.u(v17, null, null));
                        Li.r1(2);
                        Li.o1(zy5Var.f474010e);
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(Li.m124847x74d37ac6(), Li, true);
                        ((ku5.t0) ku5.t0.f394148d).g(new ze5.a2(v17, Li, 1));
                    }
                } else {
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.N(this.f270578f, bu.a.c(i18, i17, str, m1Var.mo808xfb85f7b0()));
                }
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Ni().d();
            }
        }
        return 0;
    }
}
