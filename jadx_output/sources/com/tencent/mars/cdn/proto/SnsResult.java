package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class SnsResult extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.SnsResult DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.SnsResult();
    private java.lang.String emoji_md5;
    private final boolean[] hasSetFields = new boolean[3];
    private com.tencent.mars.cdn.proto.FileUrl url;

    public static com.tencent.mars.cdn.proto.SnsResult create() {
        return new com.tencent.mars.cdn.proto.SnsResult();
    }

    public static com.tencent.mars.cdn.proto.SnsResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.SnsResult newBuilder() {
        return new com.tencent.mars.cdn.proto.SnsResult();
    }

    public com.tencent.mars.cdn.proto.SnsResult build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.SnsResult)) {
            return false;
        }
        com.tencent.mars.cdn.proto.SnsResult snsResult = (com.tencent.mars.cdn.proto.SnsResult) fVar;
        return n51.f.a(this.url, snsResult.url) && n51.f.a(this.emoji_md5, snsResult.emoji_md5);
    }

    public java.lang.String getEmojiMd5() {
        return this.hasSetFields[2] ? this.emoji_md5 : "";
    }

    public com.tencent.mars.cdn.proto.FileUrl getUrl() {
        return this.hasSetFields[1] ? this.url : com.tencent.mars.cdn.proto.FileUrl.create();
    }

    public boolean hasEmojiMd5() {
        return hasFieldNumber(2);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasUrl() {
        return hasFieldNumber(1);
    }

    public com.tencent.mars.cdn.proto.SnsResult mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.SnsResult();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mars.cdn.proto.FileUrl fileUrl = this.url;
            if (fileUrl != null && this.hasSetFields[1]) {
                fVar.i(1, fileUrl.computeSize());
                this.url.writeFields(fVar);
            }
            java.lang.String str = this.emoji_md5;
            if (str != null && this.hasSetFields[2]) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mars.cdn.proto.FileUrl fileUrl2 = this.url;
            if (fileUrl2 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.i(1, fileUrl2.computeSize());
            }
            java.lang.String str2 = this.emoji_md5;
            return (str2 == null || !this.hasSetFields[2]) ? i18 : i18 + b36.f.j(2, str2);
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
            if (intValue != 2) {
                return -1;
            }
            this.emoji_md5 = aVar2.k(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.tencent.mars.cdn.proto.FileUrl fileUrl3 = new com.tencent.mars.cdn.proto.FileUrl();
            if (bArr != null && bArr.length > 0) {
                fileUrl3.parseFrom(bArr);
            }
            this.url = fileUrl3;
        }
        this.hasSetFields[1] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.SnsResult setEmojiMd5(java.lang.String str) {
        this.emoji_md5 = str;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.SnsResult setUrl(com.tencent.mars.cdn.proto.FileUrl fileUrl) {
        this.url = fileUrl;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.SnsResult mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.SnsResult parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.SnsResult) super.parseFrom(bArr);
    }
}
