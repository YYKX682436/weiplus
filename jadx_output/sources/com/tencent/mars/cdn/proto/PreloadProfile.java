package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class PreloadProfile extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.PreloadProfile DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.PreloadProfile();
    private long finished;
    private final boolean[] hasSetFields = new boolean[5];
    private long minsize;
    private int percent;
    private long total;

    public static com.tencent.mars.cdn.proto.PreloadProfile create() {
        return new com.tencent.mars.cdn.proto.PreloadProfile();
    }

    public static com.tencent.mars.cdn.proto.PreloadProfile getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.PreloadProfile newBuilder() {
        return new com.tencent.mars.cdn.proto.PreloadProfile();
    }

    public com.tencent.mars.cdn.proto.PreloadProfile build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.PreloadProfile)) {
            return false;
        }
        com.tencent.mars.cdn.proto.PreloadProfile preloadProfile = (com.tencent.mars.cdn.proto.PreloadProfile) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.percent), java.lang.Integer.valueOf(preloadProfile.percent)) && n51.f.a(java.lang.Long.valueOf(this.minsize), java.lang.Long.valueOf(preloadProfile.minsize)) && n51.f.a(java.lang.Long.valueOf(this.finished), java.lang.Long.valueOf(preloadProfile.finished)) && n51.f.a(java.lang.Long.valueOf(this.total), java.lang.Long.valueOf(preloadProfile.total));
    }

    public long getFinished() {
        return this.finished;
    }

    public long getMinsize() {
        return this.minsize;
    }

    public int getPercent() {
        return this.percent;
    }

    public long getTotal() {
        return this.total;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasFinished() {
        return hasFieldNumber(3);
    }

    public boolean hasMinsize() {
        return hasFieldNumber(2);
    }

    public boolean hasPercent() {
        return hasFieldNumber(1);
    }

    public boolean hasTotal() {
        return hasFieldNumber(4);
    }

    public com.tencent.mars.cdn.proto.PreloadProfile mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.PreloadProfile();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.percent);
            }
            if (this.hasSetFields[2]) {
                fVar.h(2, this.minsize);
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
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.percent) : 0;
            if (this.hasSetFields[2]) {
                e17 += b36.f.h(2, this.minsize);
            }
            if (this.hasSetFields[3]) {
                e17 += b36.f.h(3, this.finished);
            }
            return this.hasSetFields[4] ? e17 + b36.f.h(4, this.total) : e17;
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
            this.percent = aVar2.g(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.minsize = aVar2.i(intValue);
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

    public com.tencent.mars.cdn.proto.PreloadProfile setFinished(long j17) {
        this.finished = j17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.PreloadProfile setMinsize(long j17) {
        this.minsize = j17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.PreloadProfile setPercent(int i17) {
        this.percent = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.PreloadProfile setTotal(long j17) {
        this.total = j17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.PreloadProfile mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.PreloadProfile parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.PreloadProfile) super.parseFrom(bArr);
    }
}
