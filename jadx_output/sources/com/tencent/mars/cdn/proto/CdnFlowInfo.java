package com.tencent.mars.cdn.proto;

/* loaded from: classes2.dex */
public class CdnFlowInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.CdnFlowInfo DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.CdnFlowInfo();
    private long cellular_bytes;
    private final boolean[] hasSetFields = new boolean[3];
    private long wifi_bytes;

    public static com.tencent.mars.cdn.proto.CdnFlowInfo create() {
        return new com.tencent.mars.cdn.proto.CdnFlowInfo();
    }

    public static com.tencent.mars.cdn.proto.CdnFlowInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.CdnFlowInfo newBuilder() {
        return new com.tencent.mars.cdn.proto.CdnFlowInfo();
    }

    public com.tencent.mars.cdn.proto.CdnFlowInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.CdnFlowInfo)) {
            return false;
        }
        com.tencent.mars.cdn.proto.CdnFlowInfo cdnFlowInfo = (com.tencent.mars.cdn.proto.CdnFlowInfo) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.wifi_bytes), java.lang.Long.valueOf(cdnFlowInfo.wifi_bytes)) && n51.f.a(java.lang.Long.valueOf(this.cellular_bytes), java.lang.Long.valueOf(cdnFlowInfo.cellular_bytes));
    }

    public long getCellularBytes() {
        return this.cellular_bytes;
    }

    public long getWifiBytes() {
        return this.wifi_bytes;
    }

    public boolean hasCellularBytes() {
        return hasFieldNumber(2);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasWifiBytes() {
        return hasFieldNumber(1);
    }

    public com.tencent.mars.cdn.proto.CdnFlowInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.CdnFlowInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.h(1, this.wifi_bytes);
            }
            if (this.hasSetFields[2]) {
                fVar.h(2, this.cellular_bytes);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = this.hasSetFields[1] ? 0 + b36.f.h(1, this.wifi_bytes) : 0;
            return this.hasSetFields[2] ? h17 + b36.f.h(2, this.cellular_bytes) : h17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.wifi_bytes = aVar2.i(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.cellular_bytes = aVar2.i(intValue);
        this.hasSetFields[2] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.CdnFlowInfo setCellularBytes(long j17) {
        this.cellular_bytes = j17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CdnFlowInfo setWifiBytes(long j17) {
        this.wifi_bytes = j17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CdnFlowInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.CdnFlowInfo parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.CdnFlowInfo) super.parseFrom(bArr);
    }
}
