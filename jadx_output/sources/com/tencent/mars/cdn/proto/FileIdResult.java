package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class FileIdResult extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.FileIdResult DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.FileIdResult();
    private java.lang.String aeskey;
    private int filetype;
    private final boolean[] hasSetFields = new boolean[4];

    /* renamed from: id, reason: collision with root package name */
    private java.lang.String f52527id;

    public static com.tencent.mars.cdn.proto.FileIdResult create() {
        return new com.tencent.mars.cdn.proto.FileIdResult();
    }

    public static com.tencent.mars.cdn.proto.FileIdResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.FileIdResult newBuilder() {
        return new com.tencent.mars.cdn.proto.FileIdResult();
    }

    public com.tencent.mars.cdn.proto.FileIdResult build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.FileIdResult)) {
            return false;
        }
        com.tencent.mars.cdn.proto.FileIdResult fileIdResult = (com.tencent.mars.cdn.proto.FileIdResult) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.filetype), java.lang.Integer.valueOf(fileIdResult.filetype)) && n51.f.a(this.f52527id, fileIdResult.f52527id) && n51.f.a(this.aeskey, fileIdResult.aeskey);
    }

    public java.lang.String getAeskey() {
        return this.hasSetFields[3] ? this.aeskey : "";
    }

    public int getFiletype() {
        return this.filetype;
    }

    public java.lang.String getId() {
        return this.hasSetFields[2] ? this.f52527id : "";
    }

    public boolean hasAeskey() {
        return hasFieldNumber(3);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasFiletype() {
        return hasFieldNumber(1);
    }

    public boolean hasId() {
        return hasFieldNumber(2);
    }

    public com.tencent.mars.cdn.proto.FileIdResult mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.FileIdResult();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.filetype);
            }
            java.lang.String str = this.f52527id;
            if (str != null && this.hasSetFields[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.aeskey;
            if (str2 != null && this.hasSetFields[3]) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.filetype) : 0;
            java.lang.String str3 = this.f52527id;
            if (str3 != null && this.hasSetFields[2]) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.aeskey;
            return (str4 == null || !this.hasSetFields[3]) ? e17 : e17 + b36.f.j(3, str4);
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
            this.filetype = aVar2.g(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f52527id = aVar2.k(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.aeskey = aVar2.k(intValue);
        this.hasSetFields[3] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.FileIdResult setAeskey(java.lang.String str) {
        this.aeskey = str;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.FileIdResult setFiletype(int i17) {
        this.filetype = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.FileIdResult setId(java.lang.String str) {
        this.f52527id = str;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.FileIdResult mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.FileIdResult parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.FileIdResult) super.parseFrom(bArr);
    }
}
