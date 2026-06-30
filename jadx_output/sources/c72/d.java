package c72;

/* loaded from: classes8.dex */
public final class d extends com.tencent.mm.modelbase.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final c72.i f39544a = new c72.i();

    /* renamed from: b, reason: collision with root package name */
    public final c72.j f39545b = new c72.j();

    @Override // com.tencent.mm.modelbase.k1, com.tencent.mm.network.v0
    public int getOptions() {
        return 1;
    }

    @Override // com.tencent.mm.modelbase.k1
    public o45.zg getReqObjImp() {
        return this.f39544a;
    }

    @Override // com.tencent.mm.network.v0
    public o45.ah getRespObj() {
        return this.f39545b;
    }

    @Override // com.tencent.mm.network.v0
    public int getType() {
        return 931;
    }

    @Override // com.tencent.mm.network.v0
    public java.lang.String getUri() {
        return "/cgi-bin/micromsg-bin/registerfacersa";
    }
}
