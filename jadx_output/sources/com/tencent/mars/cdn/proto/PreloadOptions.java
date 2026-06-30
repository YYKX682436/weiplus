package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class PreloadOptions extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.PreloadOptions DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.PreloadOptions();
    private final boolean[] hasSetFields = new boolean[3];
    private long minsize;
    private int ratio;

    public static com.tencent.mars.cdn.proto.PreloadOptions create() {
        return new com.tencent.mars.cdn.proto.PreloadOptions();
    }

    public static com.tencent.mars.cdn.proto.PreloadOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.PreloadOptions newBuilder() {
        return new com.tencent.mars.cdn.proto.PreloadOptions();
    }

    public com.tencent.mars.cdn.proto.PreloadOptions build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.PreloadOptions)) {
            return false;
        }
        com.tencent.mars.cdn.proto.PreloadOptions preloadOptions = (com.tencent.mars.cdn.proto.PreloadOptions) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.ratio), java.lang.Integer.valueOf(preloadOptions.ratio)) && n51.f.a(java.lang.Long.valueOf(this.minsize), java.lang.Long.valueOf(preloadOptions.minsize));
    }

    public long getMinsize() {
        return this.minsize;
    }

    public int getRatio() {
        return this.ratio;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasMinsize() {
        return hasFieldNumber(2);
    }

    public boolean hasRatio() {
        return hasFieldNumber(1);
    }

    public com.tencent.mars.cdn.proto.PreloadOptions mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.PreloadOptions();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.ratio);
            }
            if (this.hasSetFields[2]) {
                fVar.h(2, this.minsize);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.ratio) : 0;
            return this.hasSetFields[2] ? e17 + b36.f.h(2, this.minsize) : e17;
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
            this.ratio = aVar2.g(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.minsize = aVar2.i(intValue);
        this.hasSetFields[2] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.PreloadOptions setMinsize(long j17) {
        this.minsize = j17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.PreloadOptions setRatio(int i17) {
        this.ratio = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.PreloadOptions mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.PreloadOptions parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.PreloadOptions) super.parseFrom(bArr);
    }
}
