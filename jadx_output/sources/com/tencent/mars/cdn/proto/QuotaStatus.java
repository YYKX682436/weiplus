package com.tencent.mars.cdn.proto;

/* loaded from: classes2.dex */
public class QuotaStatus extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.QuotaStatus DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.QuotaStatus();
    private final boolean[] hasSetFields = new boolean[3];
    private long left_bytes;
    private int left_msecs;

    public static com.tencent.mars.cdn.proto.QuotaStatus create() {
        return new com.tencent.mars.cdn.proto.QuotaStatus();
    }

    public static com.tencent.mars.cdn.proto.QuotaStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.QuotaStatus newBuilder() {
        return new com.tencent.mars.cdn.proto.QuotaStatus();
    }

    public com.tencent.mars.cdn.proto.QuotaStatus build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.QuotaStatus)) {
            return false;
        }
        com.tencent.mars.cdn.proto.QuotaStatus quotaStatus = (com.tencent.mars.cdn.proto.QuotaStatus) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.left_bytes), java.lang.Long.valueOf(quotaStatus.left_bytes)) && n51.f.a(java.lang.Integer.valueOf(this.left_msecs), java.lang.Integer.valueOf(quotaStatus.left_msecs));
    }

    public long getLeftBytes() {
        return this.left_bytes;
    }

    public int getLeftMsecs() {
        return this.left_msecs;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasLeftBytes() {
        return hasFieldNumber(1);
    }

    public boolean hasLeftMsecs() {
        return hasFieldNumber(2);
    }

    public com.tencent.mars.cdn.proto.QuotaStatus mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.QuotaStatus();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.h(1, this.left_bytes);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.left_msecs);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = this.hasSetFields[1] ? 0 + b36.f.h(1, this.left_bytes) : 0;
            return this.hasSetFields[2] ? h17 + b36.f.e(2, this.left_msecs) : h17;
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
            this.left_bytes = aVar2.i(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.left_msecs = aVar2.g(intValue);
        this.hasSetFields[2] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.QuotaStatus setLeftBytes(long j17) {
        this.left_bytes = j17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.QuotaStatus setLeftMsecs(int i17) {
        this.left_msecs = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.QuotaStatus mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.QuotaStatus parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.QuotaStatus) super.parseFrom(bArr);
    }
}
