package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class SnsUploadOptions extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.SnsUploadOptions DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.SnsUploadOptions();
    private com.tencent.mm.protobuf.g emoji_data;
    private final boolean[] hasSetFields = new boolean[2];

    public static com.tencent.mars.cdn.proto.SnsUploadOptions create() {
        return new com.tencent.mars.cdn.proto.SnsUploadOptions();
    }

    public static com.tencent.mars.cdn.proto.SnsUploadOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.SnsUploadOptions newBuilder() {
        return new com.tencent.mars.cdn.proto.SnsUploadOptions();
    }

    public com.tencent.mars.cdn.proto.SnsUploadOptions build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.mars.cdn.proto.SnsUploadOptions) && n51.f.a(this.emoji_data, ((com.tencent.mars.cdn.proto.SnsUploadOptions) fVar).emoji_data);
    }

    public com.tencent.mm.protobuf.g getEmojiData() {
        return this.hasSetFields[1] ? this.emoji_data : com.tencent.mm.protobuf.g.f192155b;
    }

    public boolean hasEmojiData() {
        return hasFieldNumber(1);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public com.tencent.mars.cdn.proto.SnsUploadOptions mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.SnsUploadOptions();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.emoji_data;
            if (gVar != null && this.hasSetFields[1]) {
                fVar.b(1, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar2 = this.emoji_data;
            if (gVar2 == null || !this.hasSetFields[1]) {
                return 0;
            }
            return 0 + b36.f.b(1, gVar2);
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
        this.emoji_data = aVar2.d(intValue);
        this.hasSetFields[1] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.SnsUploadOptions setEmojiData(com.tencent.mm.protobuf.g gVar) {
        this.emoji_data = gVar;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.SnsUploadOptions mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.SnsUploadOptions parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.SnsUploadOptions) super.parseFrom(bArr);
    }
}
