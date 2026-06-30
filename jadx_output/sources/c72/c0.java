package c72;

/* loaded from: classes12.dex */
public class c0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f39541d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f39542e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f39543f;

    public c0(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.wh4();
        lVar.f70665b = new r45.xh4();
        lVar.f70666c = "/cgi-bin/micromsg-bin/spam_face_video_upload";
        lVar.f70667d = 21081;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f39541d = a17;
        this.f39543f = str;
        r45.wh4 wh4Var = (r45.wh4) a17.f70710a.f70684a;
        wh4Var.f389164i = str2;
        wh4Var.f389161f = java.lang.String.valueOf(j17);
        wh4Var.f389163h = str4;
        wh4Var.f389162g = str3;
        wh4Var.f389159d = str5;
        wh4Var.f389160e = str6;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f39542e = u0Var;
        return dispatch(sVar, this.f39541d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 21081;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f39542e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
