package c72;

/* loaded from: classes8.dex */
public final class e extends com.tencent.mm.modelbase.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final c72.m f39548a = new c72.m();

    /* renamed from: b, reason: collision with root package name */
    public final c72.n f39549b = new c72.n();

    @Override // com.tencent.mm.modelbase.k1, com.tencent.mm.network.v0
    public int getOptions() {
        return 1;
    }

    @Override // com.tencent.mm.modelbase.k1
    public o45.zg getReqObjImp() {
        return this.f39548a;
    }

    @Override // com.tencent.mm.network.v0
    public o45.ah getRespObj() {
        return this.f39549b;
    }

    @Override // com.tencent.mm.network.v0
    public int getType() {
        return 930;
    }

    @Override // com.tencent.mm.network.v0
    public java.lang.String getUri() {
        return "/cgi-bin/micromsg-bin/verifyfacersa";
    }
}
