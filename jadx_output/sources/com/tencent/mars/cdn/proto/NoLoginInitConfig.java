package com.tencent.mars.cdn.proto;

/* loaded from: classes2.dex */
public class NoLoginInitConfig extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.NoLoginInitConfig DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.NoLoginInitConfig();
    private final boolean[] hasSetFields = new boolean[2];
    private java.lang.String history_savepath;

    public static com.tencent.mars.cdn.proto.NoLoginInitConfig create() {
        return new com.tencent.mars.cdn.proto.NoLoginInitConfig();
    }

    public static com.tencent.mars.cdn.proto.NoLoginInitConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.NoLoginInitConfig newBuilder() {
        return new com.tencent.mars.cdn.proto.NoLoginInitConfig();
    }

    public com.tencent.mars.cdn.proto.NoLoginInitConfig build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.mars.cdn.proto.NoLoginInitConfig) && n51.f.a(this.history_savepath, ((com.tencent.mars.cdn.proto.NoLoginInitConfig) fVar).history_savepath);
    }

    public java.lang.String getHistorySavepath() {
        return this.hasSetFields[1] ? this.history_savepath : "";
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasHistorySavepath() {
        return hasFieldNumber(1);
    }

    public com.tencent.mars.cdn.proto.NoLoginInitConfig mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.NoLoginInitConfig();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.history_savepath;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.history_savepath;
            if (str2 == null || !this.hasSetFields[1]) {
                return 0;
            }
            return 0 + b36.f.j(1, str2);
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
        if (intValue != 1) {
            return -1;
        }
        this.history_savepath = aVar2.k(intValue);
        this.hasSetFields[1] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.NoLoginInitConfig setHistorySavepath(java.lang.String str) {
        this.history_savepath = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.NoLoginInitConfig mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.NoLoginInitConfig parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.NoLoginInitConfig) super.parseFrom(bArr);
    }
}
