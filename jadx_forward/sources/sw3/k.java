package sw3;

/* loaded from: classes9.dex */
public class k extends sw3.a {

    /* renamed from: t, reason: collision with root package name */
    public r45.rp6 f495009t;

    /* renamed from: u, reason: collision with root package name */
    public final int f495010u;

    /* renamed from: v, reason: collision with root package name */
    public final int f495011v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f495012w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f495013x;

    public k(java.lang.String str, java.lang.String str2, java.lang.String str3, double d17, java.lang.String str4, int i17, java.lang.String str5, java.lang.String str6, boolean z17, java.lang.String str7, boolean z18) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.qp6();
        lVar.f152198b = new r45.rp6();
        lVar.f152200d = 2878;
        lVar.f152199c = "/cgi-bin/mmpay-bin/transferphoneplaceorder";
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f494992r = a17;
        r45.qp6 qp6Var = (r45.qp6) a17.f152243a.f152217a;
        qp6Var.f465725d = str;
        qp6Var.f465726e = str2;
        qp6Var.f465727f = str3;
        qp6Var.f465728g = (int) java.lang.Math.round(100.0d * d17);
        qp6Var.f465729h = str4;
        qp6Var.f465730i = i17;
        qp6Var.f465731m = str5;
        qp6Var.f465732n = str6;
        if (z17) {
            qp6Var.f465733o = str7 == null ? "" : str7;
        }
        java.lang.Object[] objArr = new java.lang.Object[10];
        objArr[0] = str;
        objArr[1] = str2;
        objArr[2] = str3;
        objArr[3] = java.lang.Double.valueOf(d17);
        objArr[4] = str4;
        objArr[5] = java.lang.Integer.valueOf(i17);
        objArr[6] = str5;
        objArr[7] = str6;
        objArr[8] = java.lang.Boolean.valueOf(z17);
        objArr[9] = str7 == null ? "null" : str7;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitPlaceOrder", "do scene NetSceneMobileRemitGetRecord rcvr_openid:%s rcvr_token:%s get_rcvr_ext%s amount:%s desc:%s delay_code:%s real_name_token:%s timestamp_ms:%s isFromForceCheckName:%s replaceorder_token:%s", objArr);
        this.f495010u = qp6Var.f465728g;
        this.f495011v = qp6Var.f465730i;
        this.f495012w = z17;
        this.f495013x = z18;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitPlaceOrder", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.rp6 rp6Var = (r45.rp6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f495009t = rp6Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitPlaceOrder", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(rp6Var.f466613d), this.f495009t.f466614e);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f494993s;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void I(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        r45.rp6 rp6Var = (r45.rp6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f295561f = rp6Var.f466613d;
        this.f295563h = rp6Var.f466614e;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2878;
    }
}
