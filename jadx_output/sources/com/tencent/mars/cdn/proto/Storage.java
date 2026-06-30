package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class Storage extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.Storage DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.Storage();
    private com.tencent.mm.protobuf.g data_;
    private java.lang.String filepath;
    private final boolean[] hasSetFields = new boolean[3];

    public static com.tencent.mars.cdn.proto.Storage create() {
        return new com.tencent.mars.cdn.proto.Storage();
    }

    public static com.tencent.mars.cdn.proto.Storage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.Storage newBuilder() {
        return new com.tencent.mars.cdn.proto.Storage();
    }

    public com.tencent.mars.cdn.proto.Storage build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.Storage)) {
            return false;
        }
        com.tencent.mars.cdn.proto.Storage storage = (com.tencent.mars.cdn.proto.Storage) fVar;
        return n51.f.a(this.filepath, storage.filepath) && n51.f.a(this.data_, storage.data_);
    }

    public com.tencent.mm.protobuf.g getData_() {
        return this.hasSetFields[2] ? this.data_ : com.tencent.mm.protobuf.g.f192155b;
    }

    public java.lang.String getFilepath() {
        return this.hasSetFields[1] ? this.filepath : "";
    }

    public boolean hasData_() {
        return hasFieldNumber(2);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasFilepath() {
        return hasFieldNumber(1);
    }

    public com.tencent.mars.cdn.proto.Storage mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.Storage();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.filepath;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            com.tencent.mm.protobuf.g gVar = this.data_;
            if (gVar != null && this.hasSetFields[2]) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.filepath;
            if (str2 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            com.tencent.mm.protobuf.g gVar2 = this.data_;
            return (gVar2 == null || !this.hasSetFields[2]) ? i18 : i18 + b36.f.b(2, gVar2);
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
            this.filepath = aVar2.k(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.data_ = aVar2.d(intValue);
        this.hasSetFields[2] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.Storage setData_(com.tencent.mm.protobuf.g gVar) {
        this.data_ = gVar;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Storage setFilepath(java.lang.String str) {
        this.filepath = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Storage mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.Storage parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.Storage) super.parseFrom(bArr);
    }
}
