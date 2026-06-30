package com.tencent.ilink.auth;

/* loaded from: classes8.dex */
public class IlinkFaceRecognizeResponse extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.auth.IlinkFaceRecognizeResponse DEFAULT_INSTANCE = new com.tencent.ilink.auth.IlinkFaceRecognizeResponse();
    private final boolean[] hasSetFields = new boolean[4];
    private com.tencent.ilink.auth.FaceRecognizeResType pass_type;
    private com.tencent.mm.protobuf.g wxbase_resp;
    private com.tencent.mm.protobuf.g wxpay_resp;

    public static com.tencent.ilink.auth.IlinkFaceRecognizeResponse create() {
        return new com.tencent.ilink.auth.IlinkFaceRecognizeResponse();
    }

    public static com.tencent.ilink.auth.IlinkFaceRecognizeResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.auth.IlinkFaceRecognizeResponse newBuilder() {
        return new com.tencent.ilink.auth.IlinkFaceRecognizeResponse();
    }

    public com.tencent.ilink.auth.IlinkFaceRecognizeResponse build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.auth.IlinkFaceRecognizeResponse)) {
            return false;
        }
        com.tencent.ilink.auth.IlinkFaceRecognizeResponse ilinkFaceRecognizeResponse = (com.tencent.ilink.auth.IlinkFaceRecognizeResponse) fVar;
        return n51.f.a(this.wxbase_resp, ilinkFaceRecognizeResponse.wxbase_resp) && n51.f.a(this.wxpay_resp, ilinkFaceRecognizeResponse.wxpay_resp) && n51.f.a(this.pass_type, ilinkFaceRecognizeResponse.pass_type);
    }

    public com.tencent.ilink.auth.FaceRecognizeResType getPassType() {
        return this.hasSetFields[3] ? this.pass_type : com.tencent.ilink.auth.FaceRecognizeResType.kFaceRecognizeTypeRes_Non;
    }

    public com.tencent.mm.protobuf.g getWxbaseResp() {
        return this.hasSetFields[1] ? this.wxbase_resp : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mm.protobuf.g getWxpayResp() {
        return this.hasSetFields[2] ? this.wxpay_resp : com.tencent.mm.protobuf.g.f192155b;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasPassType() {
        return hasFieldNumber(3);
    }

    public boolean hasWxbaseResp() {
        return hasFieldNumber(1);
    }

    public boolean hasWxpayResp() {
        return hasFieldNumber(2);
    }

    public com.tencent.ilink.auth.IlinkFaceRecognizeResponse mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.auth.IlinkFaceRecognizeResponse();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.wxbase_resp;
            if (gVar != null && this.hasSetFields[1]) {
                fVar.b(1, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.wxpay_resp;
            if (gVar2 != null && this.hasSetFields[2]) {
                fVar.b(2, gVar2);
            }
            com.tencent.ilink.auth.FaceRecognizeResType faceRecognizeResType = this.pass_type;
            if (faceRecognizeResType != null && this.hasSetFields[3]) {
                fVar.e(3, faceRecognizeResType.value);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar3 = this.wxbase_resp;
            if (gVar3 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.b(1, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.wxpay_resp;
            if (gVar4 != null && this.hasSetFields[2]) {
                i18 += b36.f.b(2, gVar4);
            }
            com.tencent.ilink.auth.FaceRecognizeResType faceRecognizeResType2 = this.pass_type;
            return (faceRecognizeResType2 == null || !this.hasSetFields[3]) ? i18 : i18 + b36.f.e(3, faceRecognizeResType2.value);
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
            this.wxbase_resp = aVar2.d(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.wxpay_resp = aVar2.d(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.pass_type = com.tencent.ilink.auth.FaceRecognizeResType.forNumber(aVar2.g(intValue));
        this.hasSetFields[3] = true;
        return 0;
    }

    public com.tencent.ilink.auth.IlinkFaceRecognizeResponse setPassType(com.tencent.ilink.auth.FaceRecognizeResType faceRecognizeResType) {
        this.pass_type = faceRecognizeResType;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkFaceRecognizeResponse setWxbaseResp(com.tencent.mm.protobuf.g gVar) {
        this.wxbase_resp = gVar;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkFaceRecognizeResponse setWxpayResp(com.tencent.mm.protobuf.g gVar) {
        this.wxpay_resp = gVar;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkFaceRecognizeResponse mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.auth.IlinkFaceRecognizeResponse parseFrom(byte[] bArr) {
        return (com.tencent.ilink.auth.IlinkFaceRecognizeResponse) super.parseFrom(bArr);
    }
}
