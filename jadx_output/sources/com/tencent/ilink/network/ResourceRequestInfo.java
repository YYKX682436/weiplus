package com.tencent.ilink.network;

/* loaded from: classes15.dex */
public class ResourceRequestInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.network.ResourceRequestInfo DEFAULT_INSTANCE = new com.tencent.ilink.network.ResourceRequestInfo();
    private com.tencent.mm.protobuf.g app_req;
    private com.tencent.ilink.network.IlinkCryptoAlgo crypto_algo;
    private final boolean[] hasSetFields = new boolean[9];
    private boolean limit_flow;
    private boolean limit_frequency;
    private com.tencent.ilink.network.IlinkNetType net_type;
    private int retry_count;
    private com.tencent.ilink.network.ResourceRequestScene scene;
    private int timeout_ms;

    public static com.tencent.ilink.network.ResourceRequestInfo create() {
        return new com.tencent.ilink.network.ResourceRequestInfo();
    }

    public static com.tencent.ilink.network.ResourceRequestInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.network.ResourceRequestInfo newBuilder() {
        return new com.tencent.ilink.network.ResourceRequestInfo();
    }

    public com.tencent.ilink.network.ResourceRequestInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.network.ResourceRequestInfo)) {
            return false;
        }
        com.tencent.ilink.network.ResourceRequestInfo resourceRequestInfo = (com.tencent.ilink.network.ResourceRequestInfo) fVar;
        return n51.f.a(this.app_req, resourceRequestInfo.app_req) && n51.f.a(java.lang.Integer.valueOf(this.timeout_ms), java.lang.Integer.valueOf(resourceRequestInfo.timeout_ms)) && n51.f.a(java.lang.Integer.valueOf(this.retry_count), java.lang.Integer.valueOf(resourceRequestInfo.retry_count)) && n51.f.a(java.lang.Boolean.valueOf(this.limit_flow), java.lang.Boolean.valueOf(resourceRequestInfo.limit_flow)) && n51.f.a(java.lang.Boolean.valueOf(this.limit_frequency), java.lang.Boolean.valueOf(resourceRequestInfo.limit_frequency)) && n51.f.a(this.scene, resourceRequestInfo.scene) && n51.f.a(this.crypto_algo, resourceRequestInfo.crypto_algo) && n51.f.a(this.net_type, resourceRequestInfo.net_type);
    }

    public com.tencent.mm.protobuf.g getAppReq() {
        return this.hasSetFields[1] ? this.app_req : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.ilink.network.IlinkCryptoAlgo getCryptoAlgo() {
        return this.hasSetFields[7] ? this.crypto_algo : com.tencent.ilink.network.IlinkCryptoAlgo.kIlinkNoCrypto;
    }

    public boolean getLimitFlow() {
        return this.limit_flow;
    }

    public boolean getLimitFrequency() {
        return this.limit_frequency;
    }

    public com.tencent.ilink.network.IlinkNetType getNetType() {
        return this.hasSetFields[8] ? this.net_type : com.tencent.ilink.network.IlinkNetType.kIlinkShortlink;
    }

    public int getRetryCount() {
        return this.retry_count;
    }

    public com.tencent.ilink.network.ResourceRequestScene getScene() {
        return this.hasSetFields[6] ? this.scene : com.tencent.ilink.network.ResourceRequestScene.kNormal;
    }

    public int getTimeoutMs() {
        return this.timeout_ms;
    }

    public boolean hasAppReq() {
        return hasFieldNumber(1);
    }

    public boolean hasCryptoAlgo() {
        return hasFieldNumber(7);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasLimitFlow() {
        return hasFieldNumber(4);
    }

    public boolean hasLimitFrequency() {
        return hasFieldNumber(5);
    }

    public boolean hasNetType() {
        return hasFieldNumber(8);
    }

    public boolean hasRetryCount() {
        return hasFieldNumber(3);
    }

    public boolean hasScene() {
        return hasFieldNumber(6);
    }

    public boolean hasTimeoutMs() {
        return hasFieldNumber(2);
    }

    public com.tencent.ilink.network.ResourceRequestInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.network.ResourceRequestInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.app_req;
            if (gVar != null && this.hasSetFields[1]) {
                fVar.b(1, gVar);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.timeout_ms);
            }
            if (this.hasSetFields[3]) {
                fVar.e(3, this.retry_count);
            }
            if (this.hasSetFields[4]) {
                fVar.a(4, this.limit_flow);
            }
            if (this.hasSetFields[5]) {
                fVar.a(5, this.limit_frequency);
            }
            com.tencent.ilink.network.ResourceRequestScene resourceRequestScene = this.scene;
            if (resourceRequestScene != null && this.hasSetFields[6]) {
                fVar.e(6, resourceRequestScene.value);
            }
            com.tencent.ilink.network.IlinkCryptoAlgo ilinkCryptoAlgo = this.crypto_algo;
            if (ilinkCryptoAlgo != null && this.hasSetFields[7]) {
                fVar.e(7, ilinkCryptoAlgo.value);
            }
            com.tencent.ilink.network.IlinkNetType ilinkNetType = this.net_type;
            if (ilinkNetType != null && this.hasSetFields[8]) {
                fVar.e(8, ilinkNetType.value);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar2 = this.app_req;
            if (gVar2 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.b(1, gVar2);
            }
            if (this.hasSetFields[2]) {
                i18 += b36.f.e(2, this.timeout_ms);
            }
            if (this.hasSetFields[3]) {
                i18 += b36.f.e(3, this.retry_count);
            }
            if (this.hasSetFields[4]) {
                i18 += b36.f.a(4, this.limit_flow);
            }
            if (this.hasSetFields[5]) {
                i18 += b36.f.a(5, this.limit_frequency);
            }
            com.tencent.ilink.network.ResourceRequestScene resourceRequestScene2 = this.scene;
            if (resourceRequestScene2 != null && this.hasSetFields[6]) {
                i18 += b36.f.e(6, resourceRequestScene2.value);
            }
            com.tencent.ilink.network.IlinkCryptoAlgo ilinkCryptoAlgo2 = this.crypto_algo;
            if (ilinkCryptoAlgo2 != null && this.hasSetFields[7]) {
                i18 += b36.f.e(7, ilinkCryptoAlgo2.value);
            }
            com.tencent.ilink.network.IlinkNetType ilinkNetType2 = this.net_type;
            return (ilinkNetType2 == null || !this.hasSetFields[8]) ? i18 : i18 + b36.f.e(8, ilinkNetType2.value);
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
                this.app_req = aVar2.d(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.timeout_ms = aVar2.g(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.retry_count = aVar2.g(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.limit_flow = aVar2.c(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.limit_frequency = aVar2.c(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.scene = com.tencent.ilink.network.ResourceRequestScene.forNumber(aVar2.g(intValue));
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.crypto_algo = com.tencent.ilink.network.IlinkCryptoAlgo.forNumber(aVar2.g(intValue));
                this.hasSetFields[7] = true;
                return 0;
            case 8:
                this.net_type = com.tencent.ilink.network.IlinkNetType.forNumber(aVar2.g(intValue));
                this.hasSetFields[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.ilink.network.ResourceRequestInfo setAppReq(com.tencent.mm.protobuf.g gVar) {
        this.app_req = gVar;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.network.ResourceRequestInfo setCryptoAlgo(com.tencent.ilink.network.IlinkCryptoAlgo ilinkCryptoAlgo) {
        this.crypto_algo = ilinkCryptoAlgo;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.ilink.network.ResourceRequestInfo setLimitFlow(boolean z17) {
        this.limit_flow = z17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.network.ResourceRequestInfo setLimitFrequency(boolean z17) {
        this.limit_frequency = z17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.ilink.network.ResourceRequestInfo setNetType(com.tencent.ilink.network.IlinkNetType ilinkNetType) {
        this.net_type = ilinkNetType;
        this.hasSetFields[8] = true;
        return this;
    }

    public com.tencent.ilink.network.ResourceRequestInfo setRetryCount(int i17) {
        this.retry_count = i17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.network.ResourceRequestInfo setScene(com.tencent.ilink.network.ResourceRequestScene resourceRequestScene) {
        this.scene = resourceRequestScene;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.ilink.network.ResourceRequestInfo setTimeoutMs(int i17) {
        this.timeout_ms = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.network.ResourceRequestInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.network.ResourceRequestInfo parseFrom(byte[] bArr) {
        return (com.tencent.ilink.network.ResourceRequestInfo) super.parseFrom(bArr);
    }
}
