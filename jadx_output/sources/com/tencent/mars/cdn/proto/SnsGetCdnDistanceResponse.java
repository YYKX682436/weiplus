package com.tencent.mars.cdn.proto;

/* loaded from: classes4.dex */
public class SnsGetCdnDistanceResponse extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.SnsGetCdnDistanceResponse DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.SnsGetCdnDistanceResponse();
    private com.tencent.mars.cdn.proto.BaseResponse BaseResponse;
    private int city_id;
    private com.tencent.mm.protobuf.g data_;
    private final boolean[] hasSetFields = new boolean[6];
    private int province_id;
    private int version;

    public static com.tencent.mars.cdn.proto.SnsGetCdnDistanceResponse create() {
        return new com.tencent.mars.cdn.proto.SnsGetCdnDistanceResponse();
    }

    public static com.tencent.mars.cdn.proto.SnsGetCdnDistanceResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.SnsGetCdnDistanceResponse newBuilder() {
        return new com.tencent.mars.cdn.proto.SnsGetCdnDistanceResponse();
    }

    public com.tencent.mars.cdn.proto.SnsGetCdnDistanceResponse build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.SnsGetCdnDistanceResponse)) {
            return false;
        }
        com.tencent.mars.cdn.proto.SnsGetCdnDistanceResponse snsGetCdnDistanceResponse = (com.tencent.mars.cdn.proto.SnsGetCdnDistanceResponse) fVar;
        return n51.f.a(this.BaseResponse, snsGetCdnDistanceResponse.BaseResponse) && n51.f.a(this.data_, snsGetCdnDistanceResponse.data_) && n51.f.a(java.lang.Integer.valueOf(this.version), java.lang.Integer.valueOf(snsGetCdnDistanceResponse.version)) && n51.f.a(java.lang.Integer.valueOf(this.city_id), java.lang.Integer.valueOf(snsGetCdnDistanceResponse.city_id)) && n51.f.a(java.lang.Integer.valueOf(this.province_id), java.lang.Integer.valueOf(snsGetCdnDistanceResponse.province_id));
    }

    public com.tencent.mars.cdn.proto.BaseResponse getBaseResponse() {
        return this.hasSetFields[1] ? this.BaseResponse : com.tencent.mars.cdn.proto.BaseResponse.create();
    }

    public int getCityId() {
        return this.city_id;
    }

    public com.tencent.mm.protobuf.g getData_() {
        return this.hasSetFields[2] ? this.data_ : com.tencent.mm.protobuf.g.f192155b;
    }

    public int getProvinceId() {
        return this.province_id;
    }

    public int getVersion() {
        return this.version;
    }

    public boolean hasBaseResponse() {
        return hasFieldNumber(1);
    }

    public boolean hasCityId() {
        return hasFieldNumber(4);
    }

    public boolean hasData_() {
        return hasFieldNumber(2);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasProvinceId() {
        return hasFieldNumber(5);
    }

    public boolean hasVersion() {
        return hasFieldNumber(3);
    }

    public com.tencent.mars.cdn.proto.SnsGetCdnDistanceResponse mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.SnsGetCdnDistanceResponse();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mars.cdn.proto.BaseResponse baseResponse = this.BaseResponse;
            if (baseResponse != null && this.hasSetFields[1]) {
                fVar.i(1, baseResponse.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.data_;
            if (gVar != null && this.hasSetFields[2]) {
                fVar.b(2, gVar);
            }
            if (this.hasSetFields[3]) {
                fVar.e(3, this.version);
            }
            if (this.hasSetFields[4]) {
                fVar.e(4, this.city_id);
            }
            if (this.hasSetFields[5]) {
                fVar.e(5, this.province_id);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mars.cdn.proto.BaseResponse baseResponse2 = this.BaseResponse;
            if (baseResponse2 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.i(1, baseResponse2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.data_;
            if (gVar2 != null && this.hasSetFields[2]) {
                i18 += b36.f.b(2, gVar2);
            }
            if (this.hasSetFields[3]) {
                i18 += b36.f.e(3, this.version);
            }
            if (this.hasSetFields[4]) {
                i18 += b36.f.e(4, this.city_id);
            }
            return this.hasSetFields[5] ? i18 + b36.f.e(5, this.province_id) : i18;
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.tencent.mars.cdn.proto.BaseResponse baseResponse3 = new com.tencent.mars.cdn.proto.BaseResponse();
                if (bArr != null && bArr.length > 0) {
                    baseResponse3.parseFrom(bArr);
                }
                this.BaseResponse = baseResponse3;
            }
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.data_ = aVar2.d(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.version = aVar2.g(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.city_id = aVar2.g(intValue);
            this.hasSetFields[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.province_id = aVar2.g(intValue);
        this.hasSetFields[5] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.SnsGetCdnDistanceResponse setBaseResponse(com.tencent.mars.cdn.proto.BaseResponse baseResponse) {
        this.BaseResponse = baseResponse;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.SnsGetCdnDistanceResponse setCityId(int i17) {
        this.city_id = i17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.SnsGetCdnDistanceResponse setData_(com.tencent.mm.protobuf.g gVar) {
        this.data_ = gVar;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.SnsGetCdnDistanceResponse setProvinceId(int i17) {
        this.province_id = i17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.SnsGetCdnDistanceResponse setVersion(int i17) {
        this.version = i17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.SnsGetCdnDistanceResponse mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.SnsGetCdnDistanceResponse parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.SnsGetCdnDistanceResponse) super.parseFrom(bArr);
    }
}
