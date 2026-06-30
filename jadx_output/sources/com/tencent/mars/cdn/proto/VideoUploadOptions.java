package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class VideoUploadOptions extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.VideoUploadOptions DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.VideoUploadOptions();
    private int duration_seconds;
    private final boolean[] hasSetFields = new boolean[5];
    private boolean is_small;
    private boolean is_snsad;
    private int source;

    public static com.tencent.mars.cdn.proto.VideoUploadOptions create() {
        return new com.tencent.mars.cdn.proto.VideoUploadOptions();
    }

    public static com.tencent.mars.cdn.proto.VideoUploadOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.VideoUploadOptions newBuilder() {
        return new com.tencent.mars.cdn.proto.VideoUploadOptions();
    }

    public com.tencent.mars.cdn.proto.VideoUploadOptions build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.VideoUploadOptions)) {
            return false;
        }
        com.tencent.mars.cdn.proto.VideoUploadOptions videoUploadOptions = (com.tencent.mars.cdn.proto.VideoUploadOptions) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.duration_seconds), java.lang.Integer.valueOf(videoUploadOptions.duration_seconds)) && n51.f.a(java.lang.Integer.valueOf(this.source), java.lang.Integer.valueOf(videoUploadOptions.source)) && n51.f.a(java.lang.Boolean.valueOf(this.is_small), java.lang.Boolean.valueOf(videoUploadOptions.is_small)) && n51.f.a(java.lang.Boolean.valueOf(this.is_snsad), java.lang.Boolean.valueOf(videoUploadOptions.is_snsad));
    }

    public int getDurationSeconds() {
        return this.duration_seconds;
    }

    public boolean getIsSmall() {
        return this.is_small;
    }

    public boolean getIsSnsad() {
        return this.is_snsad;
    }

    public int getSource() {
        return this.source;
    }

    public boolean hasDurationSeconds() {
        return hasFieldNumber(1);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasIsSmall() {
        return hasFieldNumber(3);
    }

    public boolean hasIsSnsad() {
        return hasFieldNumber(4);
    }

    public boolean hasSource() {
        return hasFieldNumber(2);
    }

    public com.tencent.mars.cdn.proto.VideoUploadOptions mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.VideoUploadOptions();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.duration_seconds);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.source);
            }
            if (this.hasSetFields[3]) {
                fVar.a(3, this.is_small);
            }
            if (this.hasSetFields[4]) {
                fVar.a(4, this.is_snsad);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.duration_seconds) : 0;
            if (this.hasSetFields[2]) {
                e17 += b36.f.e(2, this.source);
            }
            if (this.hasSetFields[3]) {
                e17 += b36.f.a(3, this.is_small);
            }
            return this.hasSetFields[4] ? e17 + b36.f.a(4, this.is_snsad) : e17;
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
            this.duration_seconds = aVar2.g(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.source = aVar2.g(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.is_small = aVar2.c(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.is_snsad = aVar2.c(intValue);
        this.hasSetFields[4] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.VideoUploadOptions setDurationSeconds(int i17) {
        this.duration_seconds = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.VideoUploadOptions setIsSmall(boolean z17) {
        this.is_small = z17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.VideoUploadOptions setIsSnsad(boolean z17) {
        this.is_snsad = z17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.VideoUploadOptions setSource(int i17) {
        this.source = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.VideoUploadOptions mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.VideoUploadOptions parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.VideoUploadOptions) super.parseFrom(bArr);
    }
}
