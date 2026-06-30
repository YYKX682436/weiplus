package com.tencent.ilink.auth;

/* loaded from: classes8.dex */
public class IlinkFaceExtVerifyResponse extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.auth.IlinkFaceExtVerifyResponse DEFAULT_INSTANCE = new com.tencent.ilink.auth.IlinkFaceExtVerifyResponse();
    private com.tencent.mm.protobuf.g business_resp;
    private final boolean[] hasSetFields = new boolean[4];
    private com.tencent.ilink.auth.FaceRecognizeResType pass_type;
    private com.tencent.ilink.auth.FaceExtVerifyType type;

    public static com.tencent.ilink.auth.IlinkFaceExtVerifyResponse create() {
        return new com.tencent.ilink.auth.IlinkFaceExtVerifyResponse();
    }

    public static com.tencent.ilink.auth.IlinkFaceExtVerifyResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.auth.IlinkFaceExtVerifyResponse newBuilder() {
        return new com.tencent.ilink.auth.IlinkFaceExtVerifyResponse();
    }

    public com.tencent.ilink.auth.IlinkFaceExtVerifyResponse build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.auth.IlinkFaceExtVerifyResponse)) {
            return false;
        }
        com.tencent.ilink.auth.IlinkFaceExtVerifyResponse ilinkFaceExtVerifyResponse = (com.tencent.ilink.auth.IlinkFaceExtVerifyResponse) fVar;
        return n51.f.a(this.type, ilinkFaceExtVerifyResponse.type) && n51.f.a(this.pass_type, ilinkFaceExtVerifyResponse.pass_type) && n51.f.a(this.business_resp, ilinkFaceExtVerifyResponse.business_resp);
    }

    public com.tencent.mm.protobuf.g getBusinessResp() {
        return this.hasSetFields[3] ? this.business_resp : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.ilink.auth.FaceRecognizeResType getPassType() {
        return this.hasSetFields[2] ? this.pass_type : com.tencent.ilink.auth.FaceRecognizeResType.kFaceRecognizeTypeRes_Non;
    }

    public com.tencent.ilink.auth.FaceExtVerifyType getType() {
        return this.hasSetFields[1] ? this.type : com.tencent.ilink.auth.FaceExtVerifyType.kFaceExtVerifyType_WxBase_Begin;
    }

    public boolean hasBusinessResp() {
        return hasFieldNumber(3);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasPassType() {
        return hasFieldNumber(2);
    }

    public boolean hasType() {
        return hasFieldNumber(1);
    }

    public com.tencent.ilink.auth.IlinkFaceExtVerifyResponse mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.auth.IlinkFaceExtVerifyResponse();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.ilink.auth.FaceExtVerifyType faceExtVerifyType = this.type;
            if (faceExtVerifyType != null && this.hasSetFields[1]) {
                fVar.e(1, faceExtVerifyType.value);
            }
            com.tencent.ilink.auth.FaceRecognizeResType faceRecognizeResType = this.pass_type;
            if (faceRecognizeResType != null && this.hasSetFields[2]) {
                fVar.e(2, faceRecognizeResType.value);
            }
            com.tencent.mm.protobuf.g gVar = this.business_resp;
            if (gVar != null && this.hasSetFields[3]) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.ilink.auth.FaceExtVerifyType faceExtVerifyType2 = this.type;
            if (faceExtVerifyType2 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.e(1, faceExtVerifyType2.value);
            }
            com.tencent.ilink.auth.FaceRecognizeResType faceRecognizeResType2 = this.pass_type;
            if (faceRecognizeResType2 != null && this.hasSetFields[2]) {
                i18 += b36.f.e(2, faceRecognizeResType2.value);
            }
            com.tencent.mm.protobuf.g gVar2 = this.business_resp;
            return (gVar2 == null || !this.hasSetFields[3]) ? i18 : i18 + b36.f.b(3, gVar2);
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
            this.type = com.tencent.ilink.auth.FaceExtVerifyType.forNumber(aVar2.g(intValue));
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.pass_type = com.tencent.ilink.auth.FaceRecognizeResType.forNumber(aVar2.g(intValue));
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.business_resp = aVar2.d(intValue);
        this.hasSetFields[3] = true;
        return 0;
    }

    public com.tencent.ilink.auth.IlinkFaceExtVerifyResponse setBusinessResp(com.tencent.mm.protobuf.g gVar) {
        this.business_resp = gVar;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkFaceExtVerifyResponse setPassType(com.tencent.ilink.auth.FaceRecognizeResType faceRecognizeResType) {
        this.pass_type = faceRecognizeResType;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkFaceExtVerifyResponse setType(com.tencent.ilink.auth.FaceExtVerifyType faceExtVerifyType) {
        this.type = faceExtVerifyType;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkFaceExtVerifyResponse mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.auth.IlinkFaceExtVerifyResponse parseFrom(byte[] bArr) {
        return (com.tencent.ilink.auth.IlinkFaceExtVerifyResponse) super.parseFrom(bArr);
    }
}
