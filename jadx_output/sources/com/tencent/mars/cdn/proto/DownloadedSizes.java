package com.tencent.mars.cdn.proto;

/* loaded from: classes2.dex */
public class DownloadedSizes extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.DownloadedSizes DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.DownloadedSizes();
    private long continous;
    private long finished;
    private final boolean[] hasSetFields = new boolean[5];
    private long offset;
    private long total;

    public static com.tencent.mars.cdn.proto.DownloadedSizes create() {
        return new com.tencent.mars.cdn.proto.DownloadedSizes();
    }

    public static com.tencent.mars.cdn.proto.DownloadedSizes getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.DownloadedSizes newBuilder() {
        return new com.tencent.mars.cdn.proto.DownloadedSizes();
    }

    public com.tencent.mars.cdn.proto.DownloadedSizes build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.DownloadedSizes)) {
            return false;
        }
        com.tencent.mars.cdn.proto.DownloadedSizes downloadedSizes = (com.tencent.mars.cdn.proto.DownloadedSizes) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.offset), java.lang.Long.valueOf(downloadedSizes.offset)) && n51.f.a(java.lang.Long.valueOf(this.continous), java.lang.Long.valueOf(downloadedSizes.continous)) && n51.f.a(java.lang.Long.valueOf(this.finished), java.lang.Long.valueOf(downloadedSizes.finished)) && n51.f.a(java.lang.Long.valueOf(this.total), java.lang.Long.valueOf(downloadedSizes.total));
    }

    public long getContinous() {
        return this.continous;
    }

    public long getFinished() {
        return this.finished;
    }

    public long getOffset() {
        return this.offset;
    }

    public long getTotal() {
        return this.total;
    }

    public boolean hasContinous() {
        return hasFieldNumber(2);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasFinished() {
        return hasFieldNumber(3);
    }

    public boolean hasOffset() {
        return hasFieldNumber(1);
    }

    public boolean hasTotal() {
        return hasFieldNumber(4);
    }

    public com.tencent.mars.cdn.proto.DownloadedSizes mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.DownloadedSizes();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.h(1, this.offset);
            }
            if (this.hasSetFields[2]) {
                fVar.h(2, this.continous);
            }
            if (this.hasSetFields[3]) {
                fVar.h(3, this.finished);
            }
            if (this.hasSetFields[4]) {
                fVar.h(4, this.total);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = this.hasSetFields[1] ? 0 + b36.f.h(1, this.offset) : 0;
            if (this.hasSetFields[2]) {
                h17 += b36.f.h(2, this.continous);
            }
            if (this.hasSetFields[3]) {
                h17 += b36.f.h(3, this.finished);
            }
            return this.hasSetFields[4] ? h17 + b36.f.h(4, this.total) : h17;
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
            this.continous = aVar2.i(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.finished = aVar2.i(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.total = aVar2.i(intValue);
        this.hasSetFields[4] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.DownloadedSizes setContinous(long j17) {
        this.continous = j17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadedSizes setFinished(long j17) {
        this.finished = j17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadedSizes setOffset(long j17) {
        this.offset = j17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadedSizes setTotal(long j17) {
        this.total = j17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadedSizes mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.DownloadedSizes parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.DownloadedSizes) super.parseFrom(bArr);
    }
}
