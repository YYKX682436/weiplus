package com.tencent.ilink.network;

/* loaded from: classes8.dex */
public class IlinkC2CTlvMeta extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.network.IlinkC2CTlvMeta DEFAULT_INSTANCE = new com.tencent.ilink.network.IlinkC2CTlvMeta();
    private int checksum;
    private final boolean[] hasSetFields = new boolean[5];
    private long length;
    private long offset;
    private int type;

    public static com.tencent.ilink.network.IlinkC2CTlvMeta create() {
        return new com.tencent.ilink.network.IlinkC2CTlvMeta();
    }

    public static com.tencent.ilink.network.IlinkC2CTlvMeta getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.network.IlinkC2CTlvMeta newBuilder() {
        return new com.tencent.ilink.network.IlinkC2CTlvMeta();
    }

    public com.tencent.ilink.network.IlinkC2CTlvMeta build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.network.IlinkC2CTlvMeta)) {
            return false;
        }
        com.tencent.ilink.network.IlinkC2CTlvMeta ilinkC2CTlvMeta = (com.tencent.ilink.network.IlinkC2CTlvMeta) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.type), java.lang.Integer.valueOf(ilinkC2CTlvMeta.type)) && n51.f.a(java.lang.Integer.valueOf(this.checksum), java.lang.Integer.valueOf(ilinkC2CTlvMeta.checksum)) && n51.f.a(java.lang.Long.valueOf(this.offset), java.lang.Long.valueOf(ilinkC2CTlvMeta.offset)) && n51.f.a(java.lang.Long.valueOf(this.length), java.lang.Long.valueOf(ilinkC2CTlvMeta.length));
    }

    public int getChecksum() {
        return this.checksum;
    }

    public long getLength() {
        return this.length;
    }

    public long getOffset() {
        return this.offset;
    }

    public int getType() {
        return this.type;
    }

    public boolean hasChecksum() {
        return hasFieldNumber(2);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasLength() {
        return hasFieldNumber(4);
    }

    public boolean hasOffset() {
        return hasFieldNumber(3);
    }

    public boolean hasType() {
        return hasFieldNumber(1);
    }

    public com.tencent.ilink.network.IlinkC2CTlvMeta mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.network.IlinkC2CTlvMeta();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.type);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.checksum);
            }
            if (this.hasSetFields[3]) {
                fVar.h(3, this.offset);
            }
            if (this.hasSetFields[4]) {
                fVar.h(4, this.length);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.type) : 0;
            if (this.hasSetFields[2]) {
                e17 += b36.f.e(2, this.checksum);
            }
            if (this.hasSetFields[3]) {
                e17 += b36.f.h(3, this.offset);
            }
            return this.hasSetFields[4] ? e17 + b36.f.h(4, this.length) : e17;
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
            this.type = aVar2.g(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.checksum = aVar2.g(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.offset = aVar2.i(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.length = aVar2.i(intValue);
        this.hasSetFields[4] = true;
        return 0;
    }

    public com.tencent.ilink.network.IlinkC2CTlvMeta setChecksum(int i17) {
        this.checksum = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CTlvMeta setLength(long j17) {
        this.length = j17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CTlvMeta setOffset(long j17) {
        this.offset = j17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CTlvMeta setType(int i17) {
        this.type = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CTlvMeta mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.network.IlinkC2CTlvMeta parseFrom(byte[] bArr) {
        return (com.tencent.ilink.network.IlinkC2CTlvMeta) super.parseFrom(bArr);
    }
}
