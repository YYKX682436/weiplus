package com.tencent.mars.cdn.proto;

/* loaded from: classes2.dex */
public class VideoTsRangeItem extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.VideoTsRangeItem DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.VideoTsRangeItem();
    private double begin_ts;
    private double end_ts;
    private final boolean[] hasSetFields = new boolean[5];
    private int length;
    private long offset;

    public static com.tencent.mars.cdn.proto.VideoTsRangeItem create() {
        return new com.tencent.mars.cdn.proto.VideoTsRangeItem();
    }

    public static com.tencent.mars.cdn.proto.VideoTsRangeItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.VideoTsRangeItem newBuilder() {
        return new com.tencent.mars.cdn.proto.VideoTsRangeItem();
    }

    public com.tencent.mars.cdn.proto.VideoTsRangeItem build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.VideoTsRangeItem)) {
            return false;
        }
        com.tencent.mars.cdn.proto.VideoTsRangeItem videoTsRangeItem = (com.tencent.mars.cdn.proto.VideoTsRangeItem) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.begin_ts), java.lang.Double.valueOf(videoTsRangeItem.begin_ts)) && n51.f.a(java.lang.Double.valueOf(this.end_ts), java.lang.Double.valueOf(videoTsRangeItem.end_ts)) && n51.f.a(java.lang.Long.valueOf(this.offset), java.lang.Long.valueOf(videoTsRangeItem.offset)) && n51.f.a(java.lang.Integer.valueOf(this.length), java.lang.Integer.valueOf(videoTsRangeItem.length));
    }

    public double getBeginTs() {
        return this.begin_ts;
    }

    public double getEndTs() {
        return this.end_ts;
    }

    public int getLength() {
        return this.length;
    }

    public long getOffset() {
        return this.offset;
    }

    public boolean hasBeginTs() {
        return hasFieldNumber(1);
    }

    public boolean hasEndTs() {
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

    public com.tencent.mars.cdn.proto.VideoTsRangeItem mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.VideoTsRangeItem();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.c(1, this.begin_ts);
            }
            if (this.hasSetFields[2]) {
                fVar.c(2, this.end_ts);
            }
            if (this.hasSetFields[3]) {
                fVar.h(3, this.offset);
            }
            if (this.hasSetFields[4]) {
                fVar.e(4, this.length);
            }
            return 0;
        }
        if (i17 == 1) {
            int c17 = this.hasSetFields[1] ? 0 + b36.f.c(1, this.begin_ts) : 0;
            if (this.hasSetFields[2]) {
                c17 += b36.f.c(2, this.end_ts);
            }
            if (this.hasSetFields[3]) {
                c17 += b36.f.h(3, this.offset);
            }
            return this.hasSetFields[4] ? c17 + b36.f.e(4, this.length) : c17;
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
            this.begin_ts = aVar2.e(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.end_ts = aVar2.e(intValue);
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
        this.length = aVar2.g(intValue);
        this.hasSetFields[4] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.VideoTsRangeItem setBeginTs(double d17) {
        this.begin_ts = d17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.VideoTsRangeItem setEndTs(double d17) {
        this.end_ts = d17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.VideoTsRangeItem setLength(int i17) {
        this.length = i17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.VideoTsRangeItem setOffset(long j17) {
        this.offset = j17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.VideoTsRangeItem mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.VideoTsRangeItem parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.VideoTsRangeItem) super.parseFrom(bArr);
    }
}
