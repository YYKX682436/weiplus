package com.tencent.mm.modelbase;

/* loaded from: classes8.dex */
public final class m extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.protobuf.f f70684a;

    /* renamed from: b, reason: collision with root package name */
    public final int f70685b;

    /* renamed from: c, reason: collision with root package name */
    public final int f70686c;

    public m(com.tencent.mm.protobuf.f fVar, int i17, int i18, boolean z17, int i19) {
        this.f70684a = fVar;
        this.f70685b = i17;
        this.f70686c = i18;
        setRouteInfo(i19);
    }

    @Override // o45.zg
    public int getCmdId() {
        return this.f70686c;
    }

    @Override // o45.xg
    public int getFuncId() {
        return this.f70685b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o45.xg
    public byte[] toProtoBuf() {
        com.tencent.mm.protobuf.f fVar = this.f70684a;
        if (fVar instanceof r45.my3) {
            ((r45.my3) fVar).setBaseRequest(o45.bh.a(this));
        }
        return fVar.toByteArray();
    }
}
