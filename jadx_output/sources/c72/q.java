package c72;

/* loaded from: classes9.dex */
public class q extends c72.a implements com.tencent.mm.network.l0, c72.c {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f39580d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f39581e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f39582f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f39583g = "";

    /* renamed from: h, reason: collision with root package name */
    public boolean f39584h = false;

    public q(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, float f17, int i18, boolean z17, int i19) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ro0();
        lVar.f70665b = new r45.so0();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/usrmsg/faceidentify";
        lVar.f70667d = 1080;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f39581e = a17;
        r45.ua3 ua3Var = new r45.ua3();
        ua3Var.f387165d = i19;
        r45.ro0 ro0Var = (r45.ro0) a17.f70710a.f70684a;
        ro0Var.f385039d = str;
        ro0Var.f385040e = j17;
        ro0Var.f385041f = str2;
        ro0Var.f385043h = str3;
        ro0Var.f385042g = str4;
        ro0Var.f385046n = i17;
        ro0Var.f385047o = f17;
        ro0Var.f385048p = i18;
        ro0Var.f385050r = com.tencent.mm.protobuf.g.b(ua3Var.toByteArrayOrNull());
        ro0Var.f385051s = wo.w0.m();
        int i27 = o45.wf.f343023a;
        ro0Var.f385052t = wo.q.f447784e;
        if (!z17) {
            ro0Var.f385044i = 7;
        }
        try {
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(fo3.s.INSTANCE.h());
            k57Var.f378396f = cu5Var;
            ro0Var.f385049q = new com.tencent.mm.protobuf.g(k57Var.toByteArray());
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneFaceVerifyFace", "NetSceneFacePicThirdVerifyFace, checkAliveType: %s  ,light:%f ,upload_video:%d  appid:%s  bioid:%s json_str:%s picture_cdn_id:%s cdnAesKey:%s uploadVideo:%s", java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(f17), java.lang.Integer.valueOf(i18), str, java.lang.Long.valueOf(j17), str2, str3, str4, java.lang.Integer.valueOf(i18));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f39580d = u0Var;
        return dispatch(sVar, this.f39581e, this);
    }

    @Override // c72.c
    public boolean e() {
        return this.f39584h;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1080;
    }

    @Override // c72.c
    public java.lang.String n() {
        return this.f39582f;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneFaceVerifyFace", "NetSceneFacePicThirdVerifyFace errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.so0 so0Var = (r45.so0) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneFaceVerifyFace", "identity_id: %s canRetry:%b tip:%s bizName:%s", so0Var.f385878d, java.lang.Boolean.valueOf(so0Var.f385879e), so0Var.f385881g, so0Var.f385880f);
        this.f39582f = so0Var.f385878d;
        this.f39584h = so0Var.f385879e;
        this.f39583g = so0Var.f385881g;
        com.tencent.mm.modelbase.u0 u0Var = this.f39580d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
