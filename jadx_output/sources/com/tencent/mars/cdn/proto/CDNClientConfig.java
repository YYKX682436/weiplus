package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class CDNClientConfig extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.CDNClientConfig DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.CDNClientConfig();
    private int C2CRWTimeout;
    private int C2CRetryInterval;
    private int C2CShowErrorDelayMS;
    private int SNSRWTimeout;
    private int SNSRetryInterval;
    private int SNSShowErrorDelayMS;
    private final boolean[] hasSetFields = new boolean[7];

    public static com.tencent.mars.cdn.proto.CDNClientConfig create() {
        return new com.tencent.mars.cdn.proto.CDNClientConfig();
    }

    public static com.tencent.mars.cdn.proto.CDNClientConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.CDNClientConfig newBuilder() {
        return new com.tencent.mars.cdn.proto.CDNClientConfig();
    }

    public com.tencent.mars.cdn.proto.CDNClientConfig build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.CDNClientConfig)) {
            return false;
        }
        com.tencent.mars.cdn.proto.CDNClientConfig cDNClientConfig = (com.tencent.mars.cdn.proto.CDNClientConfig) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.C2CShowErrorDelayMS), java.lang.Integer.valueOf(cDNClientConfig.C2CShowErrorDelayMS)) && n51.f.a(java.lang.Integer.valueOf(this.SNSShowErrorDelayMS), java.lang.Integer.valueOf(cDNClientConfig.SNSShowErrorDelayMS)) && n51.f.a(java.lang.Integer.valueOf(this.C2CRetryInterval), java.lang.Integer.valueOf(cDNClientConfig.C2CRetryInterval)) && n51.f.a(java.lang.Integer.valueOf(this.SNSRetryInterval), java.lang.Integer.valueOf(cDNClientConfig.SNSRetryInterval)) && n51.f.a(java.lang.Integer.valueOf(this.C2CRWTimeout), java.lang.Integer.valueOf(cDNClientConfig.C2CRWTimeout)) && n51.f.a(java.lang.Integer.valueOf(this.SNSRWTimeout), java.lang.Integer.valueOf(cDNClientConfig.SNSRWTimeout));
    }

    public int getC2CRWTimeout() {
        return this.C2CRWTimeout;
    }

    public int getC2CRetryInterval() {
        return this.C2CRetryInterval;
    }

    public int getC2CShowErrorDelayMS() {
        return this.C2CShowErrorDelayMS;
    }

    public int getSNSRWTimeout() {
        return this.SNSRWTimeout;
    }

    public int getSNSRetryInterval() {
        return this.SNSRetryInterval;
    }

    public int getSNSShowErrorDelayMS() {
        return this.SNSShowErrorDelayMS;
    }

    public boolean hasC2CRWTimeout() {
        return hasFieldNumber(5);
    }

    public boolean hasC2CRetryInterval() {
        return hasFieldNumber(3);
    }

    public boolean hasC2CShowErrorDelayMS() {
        return hasFieldNumber(1);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasSNSRWTimeout() {
        return hasFieldNumber(6);
    }

    public boolean hasSNSRetryInterval() {
        return hasFieldNumber(4);
    }

    public boolean hasSNSShowErrorDelayMS() {
        return hasFieldNumber(2);
    }

    public com.tencent.mars.cdn.proto.CDNClientConfig mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.CDNClientConfig();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.C2CShowErrorDelayMS);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.SNSShowErrorDelayMS);
            }
            if (this.hasSetFields[3]) {
                fVar.e(3, this.C2CRetryInterval);
            }
            if (this.hasSetFields[4]) {
                fVar.e(4, this.SNSRetryInterval);
            }
            if (this.hasSetFields[5]) {
                fVar.e(5, this.C2CRWTimeout);
            }
            if (this.hasSetFields[6]) {
                fVar.e(6, this.SNSRWTimeout);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.C2CShowErrorDelayMS) : 0;
            if (this.hasSetFields[2]) {
                e17 += b36.f.e(2, this.SNSShowErrorDelayMS);
            }
            if (this.hasSetFields[3]) {
                e17 += b36.f.e(3, this.C2CRetryInterval);
            }
            if (this.hasSetFields[4]) {
                e17 += b36.f.e(4, this.SNSRetryInterval);
            }
            if (this.hasSetFields[5]) {
                e17 += b36.f.e(5, this.C2CRWTimeout);
            }
            return this.hasSetFields[6] ? e17 + b36.f.e(6, this.SNSRWTimeout) : e17;
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
        switch (intValue) {
            case 1:
                this.C2CShowErrorDelayMS = aVar2.g(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.SNSShowErrorDelayMS = aVar2.g(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.C2CRetryInterval = aVar2.g(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.SNSRetryInterval = aVar2.g(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.C2CRWTimeout = aVar2.g(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.SNSRWTimeout = aVar2.g(intValue);
                this.hasSetFields[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mars.cdn.proto.CDNClientConfig setC2CRWTimeout(int i17) {
        this.C2CRWTimeout = i17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNClientConfig setC2CRetryInterval(int i17) {
        this.C2CRetryInterval = i17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNClientConfig setC2CShowErrorDelayMS(int i17) {
        this.C2CShowErrorDelayMS = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNClientConfig setSNSRWTimeout(int i17) {
        this.SNSRWTimeout = i17;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNClientConfig setSNSRetryInterval(int i17) {
        this.SNSRetryInterval = i17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNClientConfig setSNSShowErrorDelayMS(int i17) {
        this.SNSShowErrorDelayMS = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNClientConfig mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.CDNClientConfig parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.CDNClientConfig) super.parseFrom(bArr);
    }
}
