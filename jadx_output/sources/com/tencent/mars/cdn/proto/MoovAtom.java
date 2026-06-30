package com.tencent.mars.cdn.proto;

/* loaded from: classes2.dex */
public class MoovAtom extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.MoovAtom DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.MoovAtom();
    private com.tencent.mm.protobuf.g data_;
    private final boolean[] hasSetFields = new boolean[4];
    private int length;
    private long offset;

    public static com.tencent.mars.cdn.proto.MoovAtom create() {
        return new com.tencent.mars.cdn.proto.MoovAtom();
    }

    public static com.tencent.mars.cdn.proto.MoovAtom getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.MoovAtom newBuilder() {
        return new com.tencent.mars.cdn.proto.MoovAtom();
    }

    public com.tencent.mars.cdn.proto.MoovAtom build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.MoovAtom)) {
            return false;
        }
        com.tencent.mars.cdn.proto.MoovAtom moovAtom = (com.tencent.mars.cdn.proto.MoovAtom) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.offset), java.lang.Long.valueOf(moovAtom.offset)) && n51.f.a(java.lang.Integer.valueOf(this.length), java.lang.Integer.valueOf(moovAtom.length)) && n51.f.a(this.data_, moovAtom.data_);
    }

    public com.tencent.mm.protobuf.g getData_() {
        return this.hasSetFields[3] ? this.data_ : com.tencent.mm.protobuf.g.f192155b;
    }

    public int getLength() {
        return this.length;
    }

    public long getOffset() {
        return this.offset;
    }

    public boolean hasData_() {
        return hasFieldNumber(3);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasLength() {
        return hasFieldNumber(2);
    }

    public boolean hasOffset() {
        return hasFieldNumber(1);
    }

    public com.tencent.mars.cdn.proto.MoovAtom mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.MoovAtom();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.h(1, this.offset);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.length);
            }
            com.tencent.mm.protobuf.g gVar = this.data_;
            if (gVar != null && this.hasSetFields[3]) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = this.hasSetFields[1] ? 0 + b36.f.h(1, this.offset) : 0;
            if (this.hasSetFields[2]) {
                h17 += b36.f.e(2, this.length);
            }
            com.tencent.mm.protobuf.g gVar2 = this.data_;
            return (gVar2 == null || !this.hasSetFields[3]) ? h17 : h17 + b36.f.b(3, gVar2);
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
            this.offset = aVar2.i(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.length = aVar2.g(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.data_ = aVar2.d(intValue);
        this.hasSetFields[3] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.MoovAtom setData_(com.tencent.mm.protobuf.g gVar) {
        this.data_ = gVar;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.MoovAtom setLength(int i17) {
        this.length = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.MoovAtom setOffset(long j17) {
        this.offset = j17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.MoovAtom mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.MoovAtom parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.MoovAtom) super.parseFrom(bArr);
    }
}
