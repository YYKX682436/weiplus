package com.tencent.ilink.auth;

/* loaded from: classes8.dex */
public class IlinkFaceRecognizeConfigRequest extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.auth.IlinkFaceRecognizeConfigRequest DEFAULT_INSTANCE = new com.tencent.ilink.auth.IlinkFaceRecognizeConfigRequest();
    private com.tencent.mm.protobuf.g env_data;
    private final boolean[] hasSetFields = new boolean[5];
    private com.tencent.ilink.auth.FaceRecognizeType reco_type;
    private int retry_count;
    private int timeout_ms;

    public static com.tencent.ilink.auth.IlinkFaceRecognizeConfigRequest create() {
        return new com.tencent.ilink.auth.IlinkFaceRecognizeConfigRequest();
    }

    public static com.tencent.ilink.auth.IlinkFaceRecognizeConfigRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.auth.IlinkFaceRecognizeConfigRequest newBuilder() {
        return new com.tencent.ilink.auth.IlinkFaceRecognizeConfigRequest();
    }

    public com.tencent.ilink.auth.IlinkFaceRecognizeConfigRequest build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.auth.IlinkFaceRecognizeConfigRequest)) {
            return false;
        }
        com.tencent.ilink.auth.IlinkFaceRecognizeConfigRequest ilinkFaceRecognizeConfigRequest = (com.tencent.ilink.auth.IlinkFaceRecognizeConfigRequest) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.timeout_ms), java.lang.Integer.valueOf(ilinkFaceRecognizeConfigRequest.timeout_ms)) && n51.f.a(this.reco_type, ilinkFaceRecognizeConfigRequest.reco_type) && n51.f.a(this.env_data, ilinkFaceRecognizeConfigRequest.env_data) && n51.f.a(java.lang.Integer.valueOf(this.retry_count), java.lang.Integer.valueOf(ilinkFaceRecognizeConfigRequest.retry_count));
    }

    public com.tencent.mm.protobuf.g getEnvData() {
        return this.hasSetFields[3] ? this.env_data : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.ilink.auth.FaceRecognizeType getRecoType() {
        return this.hasSetFields[2] ? this.reco_type : com.tencent.ilink.auth.FaceRecognizeType.kFaceRecognizeType_WxPayOnly;
    }

    public int getRetryCount() {
        return this.retry_count;
    }

    public int getTimeoutMs() {
        return this.timeout_ms;
    }

    public boolean hasEnvData() {
        return hasFieldNumber(3);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasRecoType() {
        return hasFieldNumber(2);
    }

    public boolean hasRetryCount() {
        return hasFieldNumber(4);
    }

    public boolean hasTimeoutMs() {
        return hasFieldNumber(1);
    }

    public com.tencent.ilink.auth.IlinkFaceRecognizeConfigRequest mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.auth.IlinkFaceRecognizeConfigRequest();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.timeout_ms);
            }
            com.tencent.ilink.auth.FaceRecognizeType faceRecognizeType = this.reco_type;
            if (faceRecognizeType != null && this.hasSetFields[2]) {
                fVar.e(2, faceRecognizeType.value);
            }
            com.tencent.mm.protobuf.g gVar = this.env_data;
            if (gVar != null && this.hasSetFields[3]) {
                fVar.b(3, gVar);
            }
            if (this.hasSetFields[4]) {
                fVar.e(4, this.retry_count);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.timeout_ms) : 0;
            com.tencent.ilink.auth.FaceRecognizeType faceRecognizeType2 = this.reco_type;
            if (faceRecognizeType2 != null && this.hasSetFields[2]) {
                e17 += b36.f.e(2, faceRecognizeType2.value);
            }
            com.tencent.mm.protobuf.g gVar2 = this.env_data;
            if (gVar2 != null && this.hasSetFields[3]) {
                e17 += b36.f.b(3, gVar2);
            }
            return this.hasSetFields[4] ? e17 + b36.f.e(4, this.retry_count) : e17;
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
            this.timeout_ms = aVar2.g(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.reco_type = com.tencent.ilink.auth.FaceRecognizeType.forNumber(aVar2.g(intValue));
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.env_data = aVar2.d(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.retry_count = aVar2.g(intValue);
        this.hasSetFields[4] = true;
        return 0;
    }

    public com.tencent.ilink.auth.IlinkFaceRecognizeConfigRequest setEnvData(com.tencent.mm.protobuf.g gVar) {
        this.env_data = gVar;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkFaceRecognizeConfigRequest setRecoType(com.tencent.ilink.auth.FaceRecognizeType faceRecognizeType) {
        this.reco_type = faceRecognizeType;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkFaceRecognizeConfigRequest setRetryCount(int i17) {
        this.retry_count = i17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkFaceRecognizeConfigRequest setTimeoutMs(int i17) {
        this.timeout_ms = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkFaceRecognizeConfigRequest mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.auth.IlinkFaceRecognizeConfigRequest parseFrom(byte[] bArr) {
        return (com.tencent.ilink.auth.IlinkFaceRecognizeConfigRequest) super.parseFrom(bArr);
    }
}
