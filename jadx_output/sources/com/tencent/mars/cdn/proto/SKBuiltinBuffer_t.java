package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class SKBuiltinBuffer_t extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.SKBuiltinBuffer_t DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.SKBuiltinBuffer_t();
    private com.tencent.mm.protobuf.g Buffer;
    private final boolean[] hasSetFields = new boolean[3];
    private int iLen;

    public static com.tencent.mars.cdn.proto.SKBuiltinBuffer_t create() {
        return new com.tencent.mars.cdn.proto.SKBuiltinBuffer_t();
    }

    public static com.tencent.mars.cdn.proto.SKBuiltinBuffer_t getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.SKBuiltinBuffer_t newBuilder() {
        return new com.tencent.mars.cdn.proto.SKBuiltinBuffer_t();
    }

    public com.tencent.mars.cdn.proto.SKBuiltinBuffer_t build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.SKBuiltinBuffer_t)) {
            return false;
        }
        com.tencent.mars.cdn.proto.SKBuiltinBuffer_t sKBuiltinBuffer_t = (com.tencent.mars.cdn.proto.SKBuiltinBuffer_t) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.iLen), java.lang.Integer.valueOf(sKBuiltinBuffer_t.iLen)) && n51.f.a(this.Buffer, sKBuiltinBuffer_t.Buffer);
    }

    public com.tencent.mm.protobuf.g getBuffer() {
        return this.hasSetFields[2] ? this.Buffer : com.tencent.mm.protobuf.g.f192155b;
    }

    public int getILen() {
        return this.iLen;
    }

    public boolean hasBuffer() {
        return hasFieldNumber(2);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasILen() {
        return hasFieldNumber(1);
    }

    public com.tencent.mars.cdn.proto.SKBuiltinBuffer_t mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.SKBuiltinBuffer_t();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.iLen);
            }
            com.tencent.mm.protobuf.g gVar = this.Buffer;
            if (gVar != null && this.hasSetFields[2]) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.iLen) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.Buffer;
            return (gVar2 == null || !this.hasSetFields[2]) ? e17 : e17 + b36.f.b(2, gVar2);
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
            this.iLen = aVar2.g(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.Buffer = aVar2.d(intValue);
        this.hasSetFields[2] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.SKBuiltinBuffer_t setBuffer(com.tencent.mm.protobuf.g gVar) {
        this.Buffer = gVar;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.SKBuiltinBuffer_t setILen(int i17) {
        this.iLen = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.SKBuiltinBuffer_t mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.SKBuiltinBuffer_t parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.SKBuiltinBuffer_t) super.parseFrom(bArr);
    }
}
