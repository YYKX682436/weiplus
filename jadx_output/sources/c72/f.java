package c72;

/* loaded from: classes8.dex */
public final class f extends com.tencent.mm.modelbase.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final c72.g f39550a = new c72.g();

    /* renamed from: b, reason: collision with root package name */
    public final c72.h f39551b = new c72.h();

    @Override // com.tencent.mm.modelbase.k1, com.tencent.mm.network.v0
    public int getOptions() {
        return 1;
    }

    @Override // com.tencent.mm.modelbase.k1
    public o45.zg getReqObjImp() {
        return this.f39550a;
    }

    @Override // com.tencent.mm.network.v0
    public o45.ah getRespObj() {
        return this.f39551b;
    }

    @Override // com.tencent.mm.network.v0
    public int getType() {
        return 733;
    }

    @Override // com.tencent.mm.network.v0
    public java.lang.String getUri() {
        return "/cgi-bin/micromsg-bin/getbioconfigrsa";
    }
}
