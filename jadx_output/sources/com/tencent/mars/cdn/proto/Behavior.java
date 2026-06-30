package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class Behavior extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.Behavior DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.Behavior();
    private int download_behavior;
    private final boolean[] hasSetFields = new boolean[5];
    private boolean is_autostart;
    private boolean is_silent;
    private boolean prealloc_storage;

    public static com.tencent.mars.cdn.proto.Behavior create() {
        return new com.tencent.mars.cdn.proto.Behavior();
    }

    public static com.tencent.mars.cdn.proto.Behavior getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.Behavior newBuilder() {
        return new com.tencent.mars.cdn.proto.Behavior();
    }

    public com.tencent.mars.cdn.proto.Behavior build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.Behavior)) {
            return false;
        }
        com.tencent.mars.cdn.proto.Behavior behavior = (com.tencent.mars.cdn.proto.Behavior) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.download_behavior), java.lang.Integer.valueOf(behavior.download_behavior)) && n51.f.a(java.lang.Boolean.valueOf(this.is_autostart), java.lang.Boolean.valueOf(behavior.is_autostart)) && n51.f.a(java.lang.Boolean.valueOf(this.is_silent), java.lang.Boolean.valueOf(behavior.is_silent)) && n51.f.a(java.lang.Boolean.valueOf(this.prealloc_storage), java.lang.Boolean.valueOf(behavior.prealloc_storage));
    }

    public int getDownloadBehavior() {
        return this.download_behavior;
    }

    public boolean getIsAutostart() {
        return this.is_autostart;
    }

    public boolean getIsSilent() {
        return this.is_silent;
    }

    public boolean getPreallocStorage() {
        return this.prealloc_storage;
    }

    public boolean hasDownloadBehavior() {
        return hasFieldNumber(1);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasIsAutostart() {
        return hasFieldNumber(2);
    }

    public boolean hasIsSilent() {
        return hasFieldNumber(3);
    }

    public boolean hasPreallocStorage() {
        return hasFieldNumber(4);
    }

    public com.tencent.mars.cdn.proto.Behavior mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.Behavior();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.download_behavior);
            }
            if (this.hasSetFields[2]) {
                fVar.a(2, this.is_autostart);
            }
            if (this.hasSetFields[3]) {
                fVar.a(3, this.is_silent);
            }
            if (this.hasSetFields[4]) {
                fVar.a(4, this.prealloc_storage);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.download_behavior) : 0;
            if (this.hasSetFields[2]) {
                e17 += b36.f.a(2, this.is_autostart);
            }
            if (this.hasSetFields[3]) {
                e17 += b36.f.a(3, this.is_silent);
            }
            return this.hasSetFields[4] ? e17 + b36.f.a(4, this.prealloc_storage) : e17;
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
            this.download_behavior = aVar2.g(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.is_autostart = aVar2.c(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.is_silent = aVar2.c(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.prealloc_storage = aVar2.c(intValue);
        this.hasSetFields[4] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.Behavior setDownloadBehavior(int i17) {
        this.download_behavior = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Behavior setIsAutostart(boolean z17) {
        this.is_autostart = z17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Behavior setIsSilent(boolean z17) {
        this.is_silent = z17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Behavior setPreallocStorage(boolean z17) {
        this.prealloc_storage = z17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Behavior mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.Behavior parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.Behavior) super.parseFrom(bArr);
    }
}
