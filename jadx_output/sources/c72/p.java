package c72;

/* loaded from: classes9.dex */
public class p extends c72.a implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f39562d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f39563e;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f39566h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f39567i;

    /* renamed from: p, reason: collision with root package name */
    public float f39571p;

    /* renamed from: q, reason: collision with root package name */
    public int f39572q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f39573r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f39574s;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f39564f = null;

    /* renamed from: g, reason: collision with root package name */
    public r45.zd5 f39565g = null;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f39568m = null;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f39569n = null;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f39570o = null;

    /* renamed from: t, reason: collision with root package name */
    public float f39575t = 0.0f;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f39576u = "";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f39577v = "";

    /* renamed from: w, reason: collision with root package name */
    public r45.zd5 f39578w = null;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f39579x = "";

    public p(java.lang.String str, java.lang.String str2, int i17, boolean z17, int i18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.po0();
        lVar.f70665b = new r45.qo0();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/usrmsg/faceidentifyprepage";
        lVar.f70667d = 1147;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f39563e = a17;
        r45.ua3 ua3Var = new r45.ua3();
        ua3Var.f387165d = i18;
        r45.po0 po0Var = (r45.po0) a17.f70710a.f70684a;
        po0Var.f383245d = str;
        po0Var.f383246e = str2;
        po0Var.f383248g = i17;
        po0Var.f383250i = com.tencent.mm.protobuf.g.b(ua3Var.toByteArrayOrNull());
        if (!z17) {
            po0Var.f383247f = 7;
        }
        try {
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(fo3.s.INSTANCE.h());
            k57Var.f378396f = cu5Var;
            po0Var.f383249h = new com.tencent.mm.protobuf.g(k57Var.toByteArray());
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f39562d = u0Var;
        return dispatch(sVar, this.f39563e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1147;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneFaceGetConfirmPageInfo", "errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.qo0 qo0Var = (r45.qo0) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (qo0Var != null) {
            this.f39564f = qo0Var.f384130d;
            this.f39565g = qo0Var.f384131e;
            this.f39568m = qo0Var.f384133g;
            this.f39569n = qo0Var.f384134h;
            this.f39570o = qo0Var.f384135i;
            float f17 = qo0Var.f384136m;
            this.f39571p = f17;
            this.f39572q = qo0Var.f384137n;
            this.f39573r = qo0Var.f384138o;
            this.f39566h = qo0Var.f384139p;
            this.f39567i = qo0Var.f384132f;
            this.f39575t = qo0Var.f384140q;
            this.f39576u = qo0Var.f384141r;
            this.f39577v = qo0Var.f384142s;
            this.f39579x = qo0Var.f384144u;
            this.f39578w = qo0Var.f384145v;
            this.f39574s = qo0Var.f384146w;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneFaceGetConfirmPageInfo", "Light threshold is %f check_alive_type:%d faceRatio:%f errorTip:%s identifyId:%s", java.lang.Float.valueOf(f17), java.lang.Integer.valueOf(this.f39572q), java.lang.Float.valueOf(this.f39575t), this.f39576u, this.f39577v);
            com.tencent.mm.modelbase.u0 u0Var = this.f39562d;
            if (u0Var != null) {
                u0Var.onSceneEnd(i18, i19, str, this);
            }
        }
    }

    public java.lang.String toString() {
        return "NetSceneFaceGetConfirmPageInfo{callback=" + this.f39562d + ", rr=" + this.f39563e + ", mFaceConfirmInfoList=" + this.f39564f + ", mPromptButtonInfo=" + this.f39565g + ", bizHeadUrl='" + this.f39566h + "', bizNickName='" + this.f39567i + "', mHeaderPrompt='" + this.f39568m + "', mFeedbackUrl='" + this.f39569n + "', mComplainUrl='" + this.f39570o + "', mLight_threshold=" + this.f39571p + ", check_alive_type=" + this.f39572q + ", business_tips='" + this.f39573r + "', faceRatio=" + this.f39575t + ", errorTip='" + this.f39576u + "', identifyId='" + this.f39577v + "'}";
    }
}
