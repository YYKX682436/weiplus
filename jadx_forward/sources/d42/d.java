package d42;

/* loaded from: classes9.dex */
public class d extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f307939d;

    /* renamed from: e, reason: collision with root package name */
    public long f307940e;

    /* renamed from: f, reason: collision with root package name */
    public long f307941f;

    /* renamed from: g, reason: collision with root package name */
    public d42.a f307942g;

    public final r45.je0 H() {
        r45.je0 je0Var = new r45.je0();
        je0Var.f459272d = android.os.Build.MANUFACTURER;
        je0Var.f459273e = wo.w0.m();
        je0Var.f459274f = android.os.Build.VERSION.SDK_INT + "";
        je0Var.f459275g = android.os.Build.CPU_ABI;
        return je0Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f307939d = u0Var;
        this.f307942g = d42.a.a();
        if (gm0.j1.a()) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_REPORT_EXPT_APP_LAST_TIME_SEC_INT, java.lang.Integer.valueOf((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
            long j17 = d42.a.a().f307934a;
            this.f307940e = j17;
            if (j17 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ReportExptAppInfo", "acquisition did not start  [%d]", java.lang.Long.valueOf(j17));
                return -1;
            }
            this.f307941f = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportExptAppInfo", "acquisition beginTime[%d] endTime[%d]", java.lang.Long.valueOf(this.f307940e), java.lang.Long.valueOf(this.f307941f));
            try {
                com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                lVar.f152197a = new r45.tp5();
                lVar.f152198b = new r45.up5();
                lVar.f152199c = "/cgi-bin/mmfddataappsvr/reportexptappinfo";
                lVar.f152200d = com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46407x44d8fa6c;
                lVar.f152201e = 0;
                lVar.f152202f = 0;
                com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
                r45.tp5 tp5Var = (r45.tp5) a17.f152243a.f152217a;
                tp5Var.f468188d = this.f307940e;
                tp5Var.f468189e = this.f307941f;
                tp5Var.f468191g = H();
                if (d42.b.f307935b == null) {
                    d42.b.f307935b = new d42.b();
                }
                java.util.List<r45.im0> b17 = d42.b.f307935b.b();
                if (((java.util.LinkedList) b17).size() > 0) {
                    tp5Var.f468190f = new java.util.LinkedList();
                    for (r45.im0 im0Var : b17) {
                        r45.im0 im0Var2 = new r45.im0();
                        im0Var2.f458677d = im0Var.f458677d;
                        im0Var2.f458678e = im0Var.f458678e;
                        im0Var2.f458679f = im0Var.f458679f;
                        im0Var2.f458680g = im0Var.f458680g;
                        tp5Var.f468190f.add(im0Var2);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportExptAppInfo", "req local appInfoList [%d] ", java.lang.Integer.valueOf(tp5Var.f468190f.size()));
                }
                jx3.f.INSTANCE.mo68477x336bdfd8(863L, 160L, 1L, false);
                return mo9409x10f9447a(sVar, a17, this);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ReportExptAppInfo", e17, "get appInfo error", new java.lang.Object[0]);
            }
        }
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46407x44d8fa6c;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportExptAppInfo", "get appInfo on gy end. errType[%d] erroCode[%d] errMsg[%s]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            r45.up5 up5Var = (r45.up5) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            ((ku5.t0) ku5.t0.f394148d).h(new d42.c(this, up5Var), "netscene_getexpt");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportExptAppInfo", "report change begin time  ok!");
            jx3.f.INSTANCE.mo68477x336bdfd8(863L, 162L, 1L, false);
        }
        this.f307939d.mo815x76e0bfae(i18, i19, str, this);
    }
}
