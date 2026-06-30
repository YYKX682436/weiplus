package c72;

/* loaded from: classes8.dex */
public class a0 extends c72.a implements com.tencent.mm.network.l0, c72.b {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f39530d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f39531e;

    /* renamed from: f, reason: collision with root package name */
    public long f39532f = -1;

    /* renamed from: g, reason: collision with root package name */
    public float f39533g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f39534h = null;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f39535i = null;

    public a0(int i17, int i18, java.lang.String str, java.lang.String str2, byte[] bArr, r45.ua3 ua3Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.va3();
        lVar.f70665b = new r45.wa3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getbioconfig";
        lVar.f70667d = com.tencent.tmassistantsdk.common.TMAssistantDownloadSDKErrorCode.DownloadSDKErrorCode_CLIENT_PROTOCOL_EXCEPTION;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f39531e = a17;
        r45.va3 va3Var = (r45.va3) a17.f70710a.f70684a;
        va3Var.f388025d = 1;
        va3Var.f388026e = i17;
        va3Var.f388029h = i18;
        va3Var.f388030i = str;
        va3Var.f388031m = str2;
        va3Var.f388032n = com.tencent.mm.protobuf.g.b(bArr);
        va3Var.f388033o = com.tencent.mm.protobuf.g.b(ua3Var.toByteArrayOrNull());
    }

    @Override // c72.b
    public float b() {
        float f17 = this.f39533g;
        if (f17 <= 0.0f || f17 > 1.0f) {
            this.f39533g = 0.5f;
        }
        return this.f39533g;
    }

    @Override // c72.b
    public byte[] c() {
        return this.f39534h;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f39530d = u0Var;
        return dispatch(sVar, this.f39531e, this);
    }

    @Override // c72.b
    public long g() {
        return this.f39532f;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.tmassistantsdk.common.TMAssistantDownloadSDKErrorCode.DownloadSDKErrorCode_CLIENT_PROTOCOL_EXCEPTION;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.wa3 wa3Var = (r45.wa3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i18 == 0 && i19 == 0) {
            long j17 = wa3Var.f389005d;
            this.f39532f = j17;
            com.tencent.mm.protobuf.g gVar = wa3Var.f389006e;
            if (gVar != null) {
                this.f39534h = gVar.f192156a;
            }
            this.f39533g = wa3Var.f389010i;
            com.tencent.mm.protobuf.g gVar2 = wa3Var.f389009h;
            if (gVar2 != null) {
                this.f39535i = gVar2.f192156a;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetBioConfig", "carson logic bioId:%s Config is:%s ratio:%s", java.lang.Long.valueOf(j17), this.f39534h, java.lang.Float.valueOf(this.f39533g));
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f39530d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // c72.b
    public byte[] p() {
        return this.f39535i;
    }
}
