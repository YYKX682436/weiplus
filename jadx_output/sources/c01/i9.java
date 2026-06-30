package c01;

/* loaded from: classes12.dex */
public class i9 extends com.tencent.mm.modelbase.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final o45.bi f37252a = new o45.bi();

    /* renamed from: b, reason: collision with root package name */
    public final o45.ci f37253b = new o45.ci();

    @Override // com.tencent.mm.modelbase.k1
    public o45.zg getReqObjImp() {
        return this.f37252a;
    }

    @Override // com.tencent.mm.network.v0
    public o45.ah getRespObj() {
        return this.f37253b;
    }

    @Override // com.tencent.mm.network.v0
    public int getType() {
        return 126;
    }

    @Override // com.tencent.mm.network.v0
    public java.lang.String getUri() {
        return "/cgi-bin/micromsg-bin/newreg";
    }
}
