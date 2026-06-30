package com.tencent.mars.cdn.proto;

/* loaded from: classes4.dex */
public class BaseResponse extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.BaseResponse DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.BaseResponse();
    private com.tencent.mars.cdn.proto.SKBuiltinString_t ErrMsg;
    private int Ret;
    private final boolean[] hasSetFields = new boolean[3];

    public static com.tencent.mars.cdn.proto.BaseResponse create() {
        return new com.tencent.mars.cdn.proto.BaseResponse();
    }

    public static com.tencent.mars.cdn.proto.BaseResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.BaseResponse newBuilder() {
        return new com.tencent.mars.cdn.proto.BaseResponse();
    }

    public com.tencent.mars.cdn.proto.BaseResponse build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.BaseResponse)) {
            return false;
        }
        com.tencent.mars.cdn.proto.BaseResponse baseResponse = (com.tencent.mars.cdn.proto.BaseResponse) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.Ret), java.lang.Integer.valueOf(baseResponse.Ret)) && n51.f.a(this.ErrMsg, baseResponse.ErrMsg);
    }

    public com.tencent.mars.cdn.proto.SKBuiltinString_t getErrMsg() {
        return this.hasSetFields[2] ? this.ErrMsg : new com.tencent.mars.cdn.proto.SKBuiltinString_t();
    }

    public int getRet() {
        return this.Ret;
    }

    public boolean hasErrMsg() {
        return hasFieldNumber(2);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasRet() {
        return hasFieldNumber(1);
    }

    public com.tencent.mars.cdn.proto.BaseResponse mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.BaseResponse();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.Ret);
            }
            com.tencent.mars.cdn.proto.SKBuiltinString_t sKBuiltinString_t = this.ErrMsg;
            if (sKBuiltinString_t != null && this.hasSetFields[2]) {
                fVar.i(2, sKBuiltinString_t.computeSize());
                this.ErrMsg.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.Ret) : 0;
            com.tencent.mars.cdn.proto.SKBuiltinString_t sKBuiltinString_t2 = this.ErrMsg;
            return (sKBuiltinString_t2 == null || !this.hasSetFields[2]) ? e17 : e17 + b36.f.i(2, sKBuiltinString_t2.computeSize());
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
            this.Ret = aVar2.g(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.mars.cdn.proto.SKBuiltinString_t sKBuiltinString_t3 = new com.tencent.mars.cdn.proto.SKBuiltinString_t();
            if (bArr != null && bArr.length > 0) {
                sKBuiltinString_t3.parseFrom(bArr);
            }
            this.ErrMsg = sKBuiltinString_t3;
        }
        this.hasSetFields[2] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.BaseResponse setErrMsg(com.tencent.mars.cdn.proto.SKBuiltinString_t sKBuiltinString_t) {
        this.ErrMsg = sKBuiltinString_t;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.BaseResponse setRet(int i17) {
        this.Ret = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.BaseResponse mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.BaseResponse parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.BaseResponse) super.parseFrom(bArr);
    }
}
