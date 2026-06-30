package com.tencent.ilink.auth;

/* loaded from: classes8.dex */
public class IlinkFaceRecognizeRequest extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.auth.IlinkFaceRecognizeRequest DEFAULT_INSTANCE = new com.tencent.ilink.auth.IlinkFaceRecognizeRequest();
    private com.tencent.ilink.auth.FaceDataType data_type;
    private com.tencent.mm.protobuf.g face_data;
    private final boolean[] hasSetFields = new boolean[8];
    private com.tencent.ilink.auth.FaceRecognizeType recg_type;
    private int retry_count;
    private int timeout_ms;
    private com.tencent.mm.protobuf.g wxbase_req;
    private com.tencent.mm.protobuf.g wxpay_req;

    public static com.tencent.ilink.auth.IlinkFaceRecognizeRequest create() {
        return new com.tencent.ilink.auth.IlinkFaceRecognizeRequest();
    }

    public static com.tencent.ilink.auth.IlinkFaceRecognizeRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.auth.IlinkFaceRecognizeRequest newBuilder() {
        return new com.tencent.ilink.auth.IlinkFaceRecognizeRequest();
    }

    public com.tencent.ilink.auth.IlinkFaceRecognizeRequest build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.auth.IlinkFaceRecognizeRequest)) {
            return false;
        }
        com.tencent.ilink.auth.IlinkFaceRecognizeRequest ilinkFaceRecognizeRequest = (com.tencent.ilink.auth.IlinkFaceRecognizeRequest) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.timeout_ms), java.lang.Integer.valueOf(ilinkFaceRecognizeRequest.timeout_ms)) && n51.f.a(this.recg_type, ilinkFaceRecognizeRequest.recg_type) && n51.f.a(this.data_type, ilinkFaceRecognizeRequest.data_type) && n51.f.a(this.face_data, ilinkFaceRecognizeRequest.face_data) && n51.f.a(this.wxbase_req, ilinkFaceRecognizeRequest.wxbase_req) && n51.f.a(this.wxpay_req, ilinkFaceRecognizeRequest.wxpay_req) && n51.f.a(java.lang.Integer.valueOf(this.retry_count), java.lang.Integer.valueOf(ilinkFaceRecognizeRequest.retry_count));
    }

    public com.tencent.ilink.auth.FaceDataType getDataType() {
        return this.hasSetFields[3] ? this.data_type : com.tencent.ilink.auth.FaceDataType.kFaceDataType_3D;
    }

    public com.tencent.mm.protobuf.g getFaceData() {
        return this.hasSetFields[4] ? this.face_data : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.ilink.auth.FaceRecognizeType getRecgType() {
        return this.hasSetFields[2] ? this.recg_type : com.tencent.ilink.auth.FaceRecognizeType.kFaceRecognizeType_WxPayOnly;
    }

    public int getRetryCount() {
        return this.retry_count;
    }

    public int getTimeoutMs() {
        return this.timeout_ms;
    }

    public com.tencent.mm.protobuf.g getWxbaseReq() {
        return this.hasSetFields[5] ? this.wxbase_req : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mm.protobuf.g getWxpayReq() {
        return this.hasSetFields[6] ? this.wxpay_req : com.tencent.mm.protobuf.g.f192155b;
    }

    public boolean hasDataType() {
        return hasFieldNumber(3);
    }

    public boolean hasFaceData() {
        return hasFieldNumber(4);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasRecgType() {
        return hasFieldNumber(2);
    }

    public boolean hasRetryCount() {
        return hasFieldNumber(7);
    }

    public boolean hasTimeoutMs() {
        return hasFieldNumber(1);
    }

    public boolean hasWxbaseReq() {
        return hasFieldNumber(5);
    }

    public boolean hasWxpayReq() {
        return hasFieldNumber(6);
    }

    public com.tencent.ilink.auth.IlinkFaceRecognizeRequest mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.auth.IlinkFaceRecognizeRequest();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.timeout_ms);
            }
            com.tencent.ilink.auth.FaceRecognizeType faceRecognizeType = this.recg_type;
            if (faceRecognizeType != null && this.hasSetFields[2]) {
                fVar.e(2, faceRecognizeType.value);
            }
            com.tencent.ilink.auth.FaceDataType faceDataType = this.data_type;
            if (faceDataType != null && this.hasSetFields[3]) {
                fVar.e(3, faceDataType.value);
            }
            com.tencent.mm.protobuf.g gVar = this.face_data;
            if (gVar != null && this.hasSetFields[4]) {
                fVar.b(4, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.wxbase_req;
            if (gVar2 != null && this.hasSetFields[5]) {
                fVar.b(5, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.wxpay_req;
            if (gVar3 != null && this.hasSetFields[6]) {
                fVar.b(6, gVar3);
            }
            if (this.hasSetFields[7]) {
                fVar.e(7, this.retry_count);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.timeout_ms) : 0;
            com.tencent.ilink.auth.FaceRecognizeType faceRecognizeType2 = this.recg_type;
            if (faceRecognizeType2 != null && this.hasSetFields[2]) {
                e17 += b36.f.e(2, faceRecognizeType2.value);
            }
            com.tencent.ilink.auth.FaceDataType faceDataType2 = this.data_type;
            if (faceDataType2 != null && this.hasSetFields[3]) {
                e17 += b36.f.e(3, faceDataType2.value);
            }
            com.tencent.mm.protobuf.g gVar4 = this.face_data;
            if (gVar4 != null && this.hasSetFields[4]) {
                e17 += b36.f.b(4, gVar4);
            }
            com.tencent.mm.protobuf.g gVar5 = this.wxbase_req;
            if (gVar5 != null && this.hasSetFields[5]) {
                e17 += b36.f.b(5, gVar5);
            }
            com.tencent.mm.protobuf.g gVar6 = this.wxpay_req;
            if (gVar6 != null && this.hasSetFields[6]) {
                e17 += b36.f.b(6, gVar6);
            }
            return this.hasSetFields[7] ? e17 + b36.f.e(7, this.retry_count) : e17;
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
                this.timeout_ms = aVar2.g(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.recg_type = com.tencent.ilink.auth.FaceRecognizeType.forNumber(aVar2.g(intValue));
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.data_type = com.tencent.ilink.auth.FaceDataType.forNumber(aVar2.g(intValue));
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.face_data = aVar2.d(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.wxbase_req = aVar2.d(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.wxpay_req = aVar2.d(intValue);
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.retry_count = aVar2.g(intValue);
                this.hasSetFields[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.ilink.auth.IlinkFaceRecognizeRequest setDataType(com.tencent.ilink.auth.FaceDataType faceDataType) {
        this.data_type = faceDataType;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkFaceRecognizeRequest setFaceData(com.tencent.mm.protobuf.g gVar) {
        this.face_data = gVar;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkFaceRecognizeRequest setRecgType(com.tencent.ilink.auth.FaceRecognizeType faceRecognizeType) {
        this.recg_type = faceRecognizeType;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkFaceRecognizeRequest setRetryCount(int i17) {
        this.retry_count = i17;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkFaceRecognizeRequest setTimeoutMs(int i17) {
        this.timeout_ms = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkFaceRecognizeRequest setWxbaseReq(com.tencent.mm.protobuf.g gVar) {
        this.wxbase_req = gVar;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkFaceRecognizeRequest setWxpayReq(com.tencent.mm.protobuf.g gVar) {
        this.wxpay_req = gVar;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkFaceRecognizeRequest mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.auth.IlinkFaceRecognizeRequest parseFrom(byte[] bArr) {
        return (com.tencent.ilink.auth.IlinkFaceRecognizeRequest) super.parseFrom(bArr);
    }
}
