package c72;

/* loaded from: classes12.dex */
public final class o extends com.tencent.mm.modelbase.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final c72.k f39560a = new c72.k();

    /* renamed from: b, reason: collision with root package name */
    public final c72.l f39561b = new c72.l();

    @Override // com.tencent.mm.modelbase.k1, com.tencent.mm.network.v0
    public int getOptions() {
        return 1;
    }

    @Override // com.tencent.mm.modelbase.k1
    public o45.zg getReqObjImp() {
        return this.f39560a;
    }

    @Override // com.tencent.mm.network.v0
    public o45.ah getRespObj() {
        return this.f39561b;
    }

    @Override // com.tencent.mm.network.v0
    public int getType() {
        return 12106;
    }

    @Override // com.tencent.mm.network.v0
    public java.lang.String getUri() {
        return "/cgi-bin/micromsg-bin/spam_face_video_upload_rsa";
    }
}
