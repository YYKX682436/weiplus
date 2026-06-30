package c72;

/* loaded from: classes9.dex */
public class q extends c72.a implements com.p314xaae8f345.mm.p971x6de15a2e.l0, c72.c {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f121113d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f121114e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f121115f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f121116g = "";

    /* renamed from: h, reason: collision with root package name */
    public boolean f121117h = false;

    public q(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, float f17, int i18, boolean z17, int i19) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ro0();
        lVar.f152198b = new r45.so0();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/usrmsg/faceidentify";
        lVar.f152200d = 1080;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f121114e = a17;
        r45.ua3 ua3Var = new r45.ua3();
        ua3Var.f468698d = i19;
        r45.ro0 ro0Var = (r45.ro0) a17.f152243a.f152217a;
        ro0Var.f466572d = str;
        ro0Var.f466573e = j17;
        ro0Var.f466574f = str2;
        ro0Var.f466576h = str3;
        ro0Var.f466575g = str4;
        ro0Var.f466579n = i17;
        ro0Var.f466580o = f17;
        ro0Var.f466581p = i18;
        ro0Var.f466583r = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(ua3Var.m75963xebb06ba0());
        ro0Var.f466584s = wo.w0.m();
        int i27 = o45.wf.f424556a;
        ro0Var.f466585t = wo.q.f529317e;
        if (!z17) {
            ro0Var.f466577i = 7;
        }
        try {
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(fo3.s.INSTANCE.h());
            k57Var.f459929f = cu5Var;
            ro0Var.f466582q = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(k57Var.mo14344x5f01b1f6());
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneFaceVerifyFace", "NetSceneFacePicThirdVerifyFace, checkAliveType: %s  ,light:%f ,upload_video:%d  appid:%s  bioid:%s json_str:%s picture_cdn_id:%s cdnAesKey:%s uploadVideo:%s", java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(f17), java.lang.Integer.valueOf(i18), str, java.lang.Long.valueOf(j17), str2, str3, str4, java.lang.Integer.valueOf(i18));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f121113d = u0Var;
        return mo9409x10f9447a(sVar, this.f121114e, this);
    }

    @Override // c72.c
    public boolean e() {
        return this.f121117h;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1080;
    }

    @Override // c72.c
    public java.lang.String n() {
        return this.f121115f;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneFaceVerifyFace", "NetSceneFacePicThirdVerifyFace errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.so0 so0Var = (r45.so0) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneFaceVerifyFace", "identity_id: %s canRetry:%b tip:%s bizName:%s", so0Var.f467411d, java.lang.Boolean.valueOf(so0Var.f467412e), so0Var.f467414g, so0Var.f467413f);
        this.f121115f = so0Var.f467411d;
        this.f121117h = so0Var.f467412e;
        this.f121116g = so0Var.f467414g;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f121113d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
