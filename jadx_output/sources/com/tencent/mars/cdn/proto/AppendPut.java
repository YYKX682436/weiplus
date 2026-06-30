package com.tencent.mars.cdn.proto;

/* loaded from: classes4.dex */
public class AppendPut extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.AppendPut DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.AppendPut();
    private final boolean[] hasSetFields = new boolean[1];

    /* loaded from: classes8.dex */
    public static class Request extends com.tencent.mm.protobuf.f {
        private static final com.tencent.mars.cdn.proto.AppendPut.Request DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.AppendPut.Request();
        private com.tencent.mm.protobuf.g data_;
        private com.tencent.mars.cdn.proto.FileIdParam fileid;
        private int filetype;
        private final boolean[] hasSetFields = new boolean[4];

        public static com.tencent.mars.cdn.proto.AppendPut.Request create() {
            return new com.tencent.mars.cdn.proto.AppendPut.Request();
        }

        public static com.tencent.mars.cdn.proto.AppendPut.Request getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.tencent.mars.cdn.proto.AppendPut.Request newBuilder() {
            return new com.tencent.mars.cdn.proto.AppendPut.Request();
        }

        public com.tencent.mars.cdn.proto.AppendPut.Request build() {
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
            if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.AppendPut.Request)) {
                return false;
            }
            com.tencent.mars.cdn.proto.AppendPut.Request request = (com.tencent.mars.cdn.proto.AppendPut.Request) fVar;
            return n51.f.a(this.data_, request.data_) && n51.f.a(java.lang.Integer.valueOf(this.filetype), java.lang.Integer.valueOf(request.filetype)) && n51.f.a(this.fileid, request.fileid);
        }

        public com.tencent.mm.protobuf.g getData_() {
            return this.hasSetFields[1] ? this.data_ : com.tencent.mm.protobuf.g.f192155b;
        }

        public com.tencent.mars.cdn.proto.FileIdParam getFileid() {
            return this.hasSetFields[3] ? this.fileid : com.tencent.mars.cdn.proto.FileIdParam.create();
        }

        public int getFiletype() {
            return this.filetype;
        }

        public boolean hasData_() {
            return hasFieldNumber(1);
        }

        public boolean hasFieldNumber(int i17) {
            return this.hasSetFields[i17];
        }

        public boolean hasFileid() {
            return hasFieldNumber(3);
        }

        public boolean hasFiletype() {
            return hasFieldNumber(2);
        }

        public com.tencent.mars.cdn.proto.AppendPut.Request mergeFrom(com.tencent.mm.protobuf.f fVar) {
            parseFrom(fVar.getData());
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.mm.protobuf.f newInstance() {
            return new com.tencent.mars.cdn.proto.AppendPut.Request();
        }

        @Override // com.tencent.mm.protobuf.f
        public final int op(int i17, java.lang.Object... objArr) {
            int i18 = 0;
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                com.tencent.mm.protobuf.g gVar = this.data_;
                if (gVar != null && this.hasSetFields[1]) {
                    fVar.b(1, gVar);
                }
                if (this.hasSetFields[2]) {
                    fVar.e(2, this.filetype);
                }
                com.tencent.mars.cdn.proto.FileIdParam fileIdParam = this.fileid;
                if (fileIdParam != null && this.hasSetFields[3]) {
                    fVar.i(3, fileIdParam.computeSize());
                    this.fileid.writeFields(fVar);
                }
                return 0;
            }
            if (i17 == 1) {
                com.tencent.mm.protobuf.g gVar2 = this.data_;
                if (gVar2 != null && this.hasSetFields[1]) {
                    i18 = 0 + b36.f.b(1, gVar2);
                }
                if (this.hasSetFields[2]) {
                    i18 += b36.f.e(2, this.filetype);
                }
                com.tencent.mars.cdn.proto.FileIdParam fileIdParam2 = this.fileid;
                return (fileIdParam2 == null || !this.hasSetFields[3]) ? i18 : i18 + b36.f.i(3, fileIdParam2.computeSize());
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
                this.data_ = aVar2.d(intValue);
                this.hasSetFields[1] = true;
                return 0;
            }
            if (intValue == 2) {
                this.filetype = aVar2.g(intValue);
                this.hasSetFields[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.tencent.mars.cdn.proto.FileIdParam fileIdParam3 = new com.tencent.mars.cdn.proto.FileIdParam();
                if (bArr != null && bArr.length > 0) {
                    fileIdParam3.parseFrom(bArr);
                }
                this.fileid = fileIdParam3;
            }
            this.hasSetFields[3] = true;
            return 0;
        }

        public com.tencent.mars.cdn.proto.AppendPut.Request setData_(com.tencent.mm.protobuf.g gVar) {
            this.data_ = gVar;
            this.hasSetFields[1] = true;
            return this;
        }

        public com.tencent.mars.cdn.proto.AppendPut.Request setFileid(com.tencent.mars.cdn.proto.FileIdParam fileIdParam) {
            this.fileid = fileIdParam;
            this.hasSetFields[3] = true;
            return this;
        }

        public com.tencent.mars.cdn.proto.AppendPut.Request setFiletype(int i17) {
            this.filetype = i17;
            this.hasSetFields[2] = true;
            return this;
        }

        public com.tencent.mars.cdn.proto.AppendPut.Request mergeFrom(byte[] bArr) {
            parseFrom(bArr);
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.mars.cdn.proto.AppendPut.Request parseFrom(byte[] bArr) {
            return (com.tencent.mars.cdn.proto.AppendPut.Request) super.parseFrom(bArr);
        }
    }

    /* loaded from: classes8.dex */
    public static class Result extends com.tencent.mm.protobuf.f {
        private static final com.tencent.mars.cdn.proto.AppendPut.Result DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.AppendPut.Result();
        private com.tencent.mars.cdn.proto.FileIdResult fileid;
        private final boolean[] hasSetFields = new boolean[2];

        public static com.tencent.mars.cdn.proto.AppendPut.Result create() {
            return new com.tencent.mars.cdn.proto.AppendPut.Result();
        }

        public static com.tencent.mars.cdn.proto.AppendPut.Result getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.tencent.mars.cdn.proto.AppendPut.Result newBuilder() {
            return new com.tencent.mars.cdn.proto.AppendPut.Result();
        }

        public com.tencent.mars.cdn.proto.AppendPut.Result build() {
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
            return fVar != null && (fVar instanceof com.tencent.mars.cdn.proto.AppendPut.Result) && n51.f.a(this.fileid, ((com.tencent.mars.cdn.proto.AppendPut.Result) fVar).fileid);
        }

        public com.tencent.mars.cdn.proto.FileIdResult getFileid() {
            return this.hasSetFields[1] ? this.fileid : com.tencent.mars.cdn.proto.FileIdResult.create();
        }

        public boolean hasFieldNumber(int i17) {
            return this.hasSetFields[i17];
        }

        public boolean hasFileid() {
            return hasFieldNumber(1);
        }

        public com.tencent.mars.cdn.proto.AppendPut.Result mergeFrom(com.tencent.mm.protobuf.f fVar) {
            parseFrom(fVar.getData());
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.mm.protobuf.f newInstance() {
            return new com.tencent.mars.cdn.proto.AppendPut.Result();
        }

        @Override // com.tencent.mm.protobuf.f
        public final int op(int i17, java.lang.Object... objArr) {
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                com.tencent.mars.cdn.proto.FileIdResult fileIdResult = this.fileid;
                if (fileIdResult != null && this.hasSetFields[1]) {
                    fVar.i(1, fileIdResult.computeSize());
                    this.fileid.writeFields(fVar);
                }
                return 0;
            }
            if (i17 == 1) {
                com.tencent.mars.cdn.proto.FileIdResult fileIdResult2 = this.fileid;
                if (fileIdResult2 == null || !this.hasSetFields[1]) {
                    return 0;
                }
                return 0 + b36.f.i(1, fileIdResult2.computeSize());
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.tencent.mars.cdn.proto.FileIdResult fileIdResult3 = new com.tencent.mars.cdn.proto.FileIdResult();
                if (bArr != null && bArr.length > 0) {
                    fileIdResult3.parseFrom(bArr);
                }
                this.fileid = fileIdResult3;
            }
            this.hasSetFields[1] = true;
            return 0;
        }

        public com.tencent.mars.cdn.proto.AppendPut.Result setFileid(com.tencent.mars.cdn.proto.FileIdResult fileIdResult) {
            this.fileid = fileIdResult;
            this.hasSetFields[1] = true;
            return this;
        }

        public com.tencent.mars.cdn.proto.AppendPut.Result mergeFrom(byte[] bArr) {
            parseFrom(bArr);
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.mars.cdn.proto.AppendPut.Result parseFrom(byte[] bArr) {
            return (com.tencent.mars.cdn.proto.AppendPut.Result) super.parseFrom(bArr);
        }
    }

    public static com.tencent.mars.cdn.proto.AppendPut create() {
        return new com.tencent.mars.cdn.proto.AppendPut();
    }

    public static com.tencent.mars.cdn.proto.AppendPut getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.AppendPut newBuilder() {
        return new com.tencent.mars.cdn.proto.AppendPut();
    }

    public com.tencent.mars.cdn.proto.AppendPut build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.AppendPut)) {
            return false;
        }
        return true;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public com.tencent.mars.cdn.proto.AppendPut mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.AppendPut();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 0;
        }
        if (i17 == 1) {
            return 0;
        }
        if (i17 != 2) {
            if (i17 == 3) {
                ((java.lang.Integer) objArr[2]).intValue();
            }
            return -1;
        }
        c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
        for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
            if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                aVar.b();
            }
        }
        return 0;
    }

    public com.tencent.mars.cdn.proto.AppendPut mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.AppendPut parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.AppendPut) super.parseFrom(bArr);
    }
}
