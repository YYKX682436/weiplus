package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class CdnTransferConfig extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.CdnTransferConfig DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.CdnTransferConfig();
    private final boolean[] hasSetFields = new boolean[5];
    private int max_cellular_transfer_mb;
    private int max_cellular_transfer_multiplier;
    private int max_retry_count;
    private int transfor_timeout_seconds;

    public static com.tencent.mars.cdn.proto.CdnTransferConfig create() {
        return new com.tencent.mars.cdn.proto.CdnTransferConfig();
    }

    public static com.tencent.mars.cdn.proto.CdnTransferConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.CdnTransferConfig newBuilder() {
        return new com.tencent.mars.cdn.proto.CdnTransferConfig();
    }

    public com.tencent.mars.cdn.proto.CdnTransferConfig build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.CdnTransferConfig)) {
            return false;
        }
        com.tencent.mars.cdn.proto.CdnTransferConfig cdnTransferConfig = (com.tencent.mars.cdn.proto.CdnTransferConfig) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.transfor_timeout_seconds), java.lang.Integer.valueOf(cdnTransferConfig.transfor_timeout_seconds)) && n51.f.a(java.lang.Integer.valueOf(this.max_retry_count), java.lang.Integer.valueOf(cdnTransferConfig.max_retry_count)) && n51.f.a(java.lang.Integer.valueOf(this.max_cellular_transfer_multiplier), java.lang.Integer.valueOf(cdnTransferConfig.max_cellular_transfer_multiplier)) && n51.f.a(java.lang.Integer.valueOf(this.max_cellular_transfer_mb), java.lang.Integer.valueOf(cdnTransferConfig.max_cellular_transfer_mb));
    }

    public int getMaxCellularTransferMb() {
        return this.max_cellular_transfer_mb;
    }

    public int getMaxCellularTransferMultiplier() {
        return this.max_cellular_transfer_multiplier;
    }

    public int getMaxRetryCount() {
        return this.max_retry_count;
    }

    public int getTransforTimeoutSeconds() {
        return this.transfor_timeout_seconds;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasMaxCellularTransferMb() {
        return hasFieldNumber(4);
    }

    public boolean hasMaxCellularTransferMultiplier() {
        return hasFieldNumber(3);
    }

    public boolean hasMaxRetryCount() {
        return hasFieldNumber(2);
    }

    public boolean hasTransforTimeoutSeconds() {
        return hasFieldNumber(1);
    }

    public com.tencent.mars.cdn.proto.CdnTransferConfig mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.CdnTransferConfig();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.transfor_timeout_seconds);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.max_retry_count);
            }
            if (this.hasSetFields[3]) {
                fVar.e(3, this.max_cellular_transfer_multiplier);
            }
            if (this.hasSetFields[4]) {
                fVar.e(4, this.max_cellular_transfer_mb);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.transfor_timeout_seconds) : 0;
            if (this.hasSetFields[2]) {
                e17 += b36.f.e(2, this.max_retry_count);
            }
            if (this.hasSetFields[3]) {
                e17 += b36.f.e(3, this.max_cellular_transfer_multiplier);
            }
            return this.hasSetFields[4] ? e17 + b36.f.e(4, this.max_cellular_transfer_mb) : e17;
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
            this.transfor_timeout_seconds = aVar2.g(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.max_retry_count = aVar2.g(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.max_cellular_transfer_multiplier = aVar2.g(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.max_cellular_transfer_mb = aVar2.g(intValue);
        this.hasSetFields[4] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.CdnTransferConfig setMaxCellularTransferMb(int i17) {
        this.max_cellular_transfer_mb = i17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CdnTransferConfig setMaxCellularTransferMultiplier(int i17) {
        this.max_cellular_transfer_multiplier = i17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CdnTransferConfig setMaxRetryCount(int i17) {
        this.max_retry_count = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CdnTransferConfig setTransforTimeoutSeconds(int i17) {
        this.transfor_timeout_seconds = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CdnTransferConfig mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.CdnTransferConfig parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.CdnTransferConfig) super.parseFrom(bArr);
    }
}
