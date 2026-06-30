package com.tencent.mm.modelbase;

/* loaded from: classes8.dex */
public final class n extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.protobuf.f f70700a;

    /* renamed from: b, reason: collision with root package name */
    public final int f70701b;

    public n(com.tencent.mm.protobuf.f fVar, int i17, boolean z17) {
        this.f70700a = fVar;
        this.f70701b = i17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o45.yg
    public int fromProtoBuf(byte[] bArr) {
        com.tencent.mm.protobuf.f parseFrom = this.f70700a.parseFrom(bArr);
        this.f70700a = parseFrom;
        if (parseFrom instanceof r45.k66) {
            return ((r45.k66) parseFrom).getRet();
        }
        if (parseFrom instanceof r45.ny3) {
            o45.bh.b(this, ((r45.ny3) parseFrom).getBaseResponse());
            return ((r45.ny3) this.f70700a).getBaseResponse().f376959d;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CommReqResp", "[fromProtoBuf] return 0; cmdId=%d", java.lang.Integer.valueOf(this.f70701b));
        return 0;
    }

    @Override // o45.ah
    public int getCmdId() {
        return this.f70701b;
    }
}
