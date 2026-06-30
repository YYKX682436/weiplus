package com.tencent.ilink.auth;

/* loaded from: classes8.dex */
public class IlinkFaceExtVerifyRequest extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.auth.IlinkFaceExtVerifyRequest DEFAULT_INSTANCE = new com.tencent.ilink.auth.IlinkFaceExtVerifyRequest();
    private com.tencent.mm.protobuf.g business_req;
    private com.tencent.ilink.auth.BusinessType business_type;
    private final boolean[] hasSetFields = new boolean[6];
    private int retry_count;
    private int timeout_ms;
    private com.tencent.ilink.auth.FaceExtVerifyType type;

    public static com.tencent.ilink.auth.IlinkFaceExtVerifyRequest create() {
        return new com.tencent.ilink.auth.IlinkFaceExtVerifyRequest();
    }

    public static com.tencent.ilink.auth.IlinkFaceExtVerifyRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.auth.IlinkFaceExtVerifyRequest newBuilder() {
        return new com.tencent.ilink.auth.IlinkFaceExtVerifyRequest();
    }

    public com.tencent.ilink.auth.IlinkFaceExtVerifyRequest build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.auth.IlinkFaceExtVerifyRequest)) {
            return false;
        }
        com.tencent.ilink.auth.IlinkFaceExtVerifyRequest ilinkFaceExtVerifyRequest = (com.tencent.ilink.auth.IlinkFaceExtVerifyRequest) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.timeout_ms), java.lang.Integer.valueOf(ilinkFaceExtVerifyRequest.timeout_ms)) && n51.f.a(this.type, ilinkFaceExtVerifyRequest.type) && n51.f.a(this.business_type, ilinkFaceExtVerifyRequest.business_type) && n51.f.a(this.business_req, ilinkFaceExtVerifyRequest.business_req) && n51.f.a(java.lang.Integer.valueOf(this.retry_count), java.lang.Integer.valueOf(ilinkFaceExtVerifyRequest.retry_count));
    }

    public com.tencent.mm.protobuf.g getBusinessReq() {
        return this.hasSetFields[4] ? this.business_req : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.ilink.auth.BusinessType getBusinessType() {
        return this.hasSetFields[3] ? this.business_type : com.tencent.ilink.auth.BusinessType.kBusinessTypeUnknown;
    }

    public int getRetryCount() {
        return this.retry_count;
    }

    public int getTimeoutMs() {
        return this.timeout_ms;
    }

    public com.tencent.ilink.auth.FaceExtVerifyType getType() {
        return this.hasSetFields[2] ? this.type : com.tencent.ilink.auth.FaceExtVerifyType.kFaceExtVerifyType_WxBase_Begin;
    }

    public boolean hasBusinessReq() {
        return hasFieldNumber(4);
    }

    public boolean hasBusinessType() {
        return hasFieldNumber(3);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasRetryCount() {
        return hasFieldNumber(5);
    }

    public boolean hasTimeoutMs() {
        return hasFieldNumber(1);
    }

    public boolean hasType() {
        return hasFieldNumber(2);
    }

    public com.tencent.ilink.auth.IlinkFaceExtVerifyRequest mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.auth.IlinkFaceExtVerifyRequest();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.timeout_ms);
            }
            com.tencent.ilink.auth.FaceExtVerifyType faceExtVerifyType = this.type;
            if (faceExtVerifyType != null && this.hasSetFields[2]) {
                fVar.e(2, faceExtVerifyType.value);
            }
            com.tencent.ilink.auth.BusinessType businessType = this.business_type;
            if (businessType != null && this.hasSetFields[3]) {
                fVar.e(3, businessType.value);
            }
            com.tencent.mm.protobuf.g gVar = this.business_req;
            if (gVar != null && this.hasSetFields[4]) {
                fVar.b(4, gVar);
            }
            if (this.hasSetFields[5]) {
                fVar.e(5, this.retry_count);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.timeout_ms) : 0;
            com.tencent.ilink.auth.FaceExtVerifyType faceExtVerifyType2 = this.type;
            if (faceExtVerifyType2 != null && this.hasSetFields[2]) {
                e17 += b36.f.e(2, faceExtVerifyType2.value);
            }
            com.tencent.ilink.auth.BusinessType businessType2 = this.business_type;
            if (businessType2 != null && this.hasSetFields[3]) {
                e17 += b36.f.e(3, businessType2.value);
            }
            com.tencent.mm.protobuf.g gVar2 = this.business_req;
            if (gVar2 != null && this.hasSetFields[4]) {
                e17 += b36.f.b(4, gVar2);
            }
            return this.hasSetFields[5] ? e17 + b36.f.e(5, this.retry_count) : e17;
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
            this.type = com.tencent.ilink.auth.FaceExtVerifyType.forNumber(aVar2.g(intValue));
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.business_type = com.tencent.ilink.auth.BusinessType.forNumber(aVar2.g(intValue));
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.business_req = aVar2.d(intValue);
            this.hasSetFields[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.retry_count = aVar2.g(intValue);
        this.hasSetFields[5] = true;
        return 0;
    }

    public com.tencent.ilink.auth.IlinkFaceExtVerifyRequest setBusinessReq(com.tencent.mm.protobuf.g gVar) {
        this.business_req = gVar;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkFaceExtVerifyRequest setBusinessType(com.tencent.ilink.auth.BusinessType businessType) {
        this.business_type = businessType;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkFaceExtVerifyRequest setRetryCount(int i17) {
        this.retry_count = i17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkFaceExtVerifyRequest setTimeoutMs(int i17) {
        this.timeout_ms = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkFaceExtVerifyRequest setType(com.tencent.ilink.auth.FaceExtVerifyType faceExtVerifyType) {
        this.type = faceExtVerifyType;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkFaceExtVerifyRequest mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.auth.IlinkFaceExtVerifyRequest parseFrom(byte[] bArr) {
        return (com.tencent.ilink.auth.IlinkFaceExtVerifyRequest) super.parseFrom(bArr);
    }
}
