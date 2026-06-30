package c72;

/* loaded from: classes9.dex */
public class p extends c72.a implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f121095d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f121096e;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f121099h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f121100i;

    /* renamed from: p, reason: collision with root package name */
    public float f121104p;

    /* renamed from: q, reason: collision with root package name */
    public int f121105q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f121106r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f121107s;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f121097f = null;

    /* renamed from: g, reason: collision with root package name */
    public r45.zd5 f121098g = null;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f121101m = null;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f121102n = null;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f121103o = null;

    /* renamed from: t, reason: collision with root package name */
    public float f121108t = 0.0f;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f121109u = "";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f121110v = "";

    /* renamed from: w, reason: collision with root package name */
    public r45.zd5 f121111w = null;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f121112x = "";

    public p(java.lang.String str, java.lang.String str2, int i17, boolean z17, int i18) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.po0();
        lVar.f152198b = new r45.qo0();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/usrmsg/faceidentifyprepage";
        lVar.f152200d = 1147;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f121096e = a17;
        r45.ua3 ua3Var = new r45.ua3();
        ua3Var.f468698d = i18;
        r45.po0 po0Var = (r45.po0) a17.f152243a.f152217a;
        po0Var.f464778d = str;
        po0Var.f464779e = str2;
        po0Var.f464781g = i17;
        po0Var.f464783i = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(ua3Var.m75963xebb06ba0());
        if (!z17) {
            po0Var.f464780f = 7;
        }
        try {
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(fo3.s.INSTANCE.h());
            k57Var.f459929f = cu5Var;
            po0Var.f464782h = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(k57Var.mo14344x5f01b1f6());
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f121095d = u0Var;
        return mo9409x10f9447a(sVar, this.f121096e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1147;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneFaceGetConfirmPageInfo", "errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.qo0 qo0Var = (r45.qo0) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (qo0Var != null) {
            this.f121097f = qo0Var.f465663d;
            this.f121098g = qo0Var.f465664e;
            this.f121101m = qo0Var.f465666g;
            this.f121102n = qo0Var.f465667h;
            this.f121103o = qo0Var.f465668i;
            float f17 = qo0Var.f465669m;
            this.f121104p = f17;
            this.f121105q = qo0Var.f465670n;
            this.f121106r = qo0Var.f465671o;
            this.f121099h = qo0Var.f465672p;
            this.f121100i = qo0Var.f465665f;
            this.f121108t = qo0Var.f465673q;
            this.f121109u = qo0Var.f465674r;
            this.f121110v = qo0Var.f465675s;
            this.f121112x = qo0Var.f465677u;
            this.f121111w = qo0Var.f465678v;
            this.f121107s = qo0Var.f465679w;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneFaceGetConfirmPageInfo", "Light threshold is %f check_alive_type:%d faceRatio:%f errorTip:%s identifyId:%s", java.lang.Float.valueOf(f17), java.lang.Integer.valueOf(this.f121105q), java.lang.Float.valueOf(this.f121108t), this.f121109u, this.f121110v);
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f121095d;
            if (u0Var != null) {
                u0Var.mo815x76e0bfae(i18, i19, str, this);
            }
        }
    }

    /* renamed from: toString */
    public java.lang.String m14487x9616526c() {
        return "NetSceneFaceGetConfirmPageInfo{callback=" + this.f121095d + ", rr=" + this.f121096e + ", mFaceConfirmInfoList=" + this.f121097f + ", mPromptButtonInfo=" + this.f121098g + ", bizHeadUrl='" + this.f121099h + "', bizNickName='" + this.f121100i + "', mHeaderPrompt='" + this.f121101m + "', mFeedbackUrl='" + this.f121102n + "', mComplainUrl='" + this.f121103o + "', mLight_threshold=" + this.f121104p + ", check_alive_type=" + this.f121105q + ", business_tips='" + this.f121106r + "', faceRatio=" + this.f121108t + ", errorTip='" + this.f121109u + "', identifyId='" + this.f121110v + "'}";
    }
}
