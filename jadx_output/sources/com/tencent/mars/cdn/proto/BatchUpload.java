package com.tencent.mars.cdn.proto;

/* loaded from: classes4.dex */
public class BatchUpload extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.BatchUpload DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.BatchUpload();
    private final boolean[] hasSetFields = new boolean[1];

    /* loaded from: classes8.dex */
    public static class Request extends com.tencent.mm.protobuf.f {
        private static final com.tencent.mars.cdn.proto.BatchUpload.Request DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.BatchUpload.Request();
        private java.util.LinkedList<com.tencent.mars.cdn.proto.FileItem> files = new java.util.LinkedList<>();
        private final boolean[] hasSetFields = new boolean[2];

        public static com.tencent.mars.cdn.proto.BatchUpload.Request create() {
            return new com.tencent.mars.cdn.proto.BatchUpload.Request();
        }

        public static com.tencent.mars.cdn.proto.BatchUpload.Request getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.tencent.mars.cdn.proto.BatchUpload.Request newBuilder() {
            return new com.tencent.mars.cdn.proto.BatchUpload.Request();
        }

        public com.tencent.mars.cdn.proto.BatchUpload.Request addAllElementFiles(java.util.Collection<com.tencent.mars.cdn.proto.FileItem> collection) {
            this.files.addAll(collection);
            this.hasSetFields[1] = true;
            return this;
        }

        public com.tencent.mars.cdn.proto.BatchUpload.Request addElementFiles(com.tencent.mars.cdn.proto.FileItem fileItem) {
            this.files.add(fileItem);
            this.hasSetFields[1] = true;
            return this;
        }

        public com.tencent.mars.cdn.proto.BatchUpload.Request build() {
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
            return fVar != null && (fVar instanceof com.tencent.mars.cdn.proto.BatchUpload.Request) && n51.f.a(this.files, ((com.tencent.mars.cdn.proto.BatchUpload.Request) fVar).files);
        }

        public java.util.LinkedList<com.tencent.mars.cdn.proto.FileItem> getFiles() {
            return this.files;
        }

        public boolean hasFieldNumber(int i17) {
            return this.hasSetFields[i17];
        }

        public boolean hasFiles() {
            return hasFieldNumber(1);
        }

        public com.tencent.mars.cdn.proto.BatchUpload.Request mergeFrom(com.tencent.mm.protobuf.f fVar) {
            parseFrom(fVar.getData());
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.mm.protobuf.f newInstance() {
            return new com.tencent.mars.cdn.proto.BatchUpload.Request();
        }

        @Override // com.tencent.mm.protobuf.f
        public final int op(int i17, java.lang.Object... objArr) {
            if (i17 == 0) {
                ((g36.f) objArr[0]).g(1, 8, this.files);
                return 0;
            }
            if (i17 == 1) {
                return b36.f.g(1, 8, this.files) + 0;
            }
            if (i17 == 2) {
                this.files.clear();
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
                com.tencent.mars.cdn.proto.FileItem fileItem = new com.tencent.mars.cdn.proto.FileItem();
                if (bArr != null && bArr.length > 0) {
                    fileItem.parseFrom(bArr);
                }
                this.files.add(fileItem);
            }
            this.hasSetFields[1] = true;
            return 0;
        }

        public com.tencent.mars.cdn.proto.BatchUpload.Request setFiles(java.util.LinkedList<com.tencent.mars.cdn.proto.FileItem> linkedList) {
            this.files = linkedList;
            this.hasSetFields[1] = true;
            return this;
        }

        public com.tencent.mars.cdn.proto.BatchUpload.Request mergeFrom(byte[] bArr) {
            parseFrom(bArr);
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.mars.cdn.proto.BatchUpload.Request parseFrom(byte[] bArr) {
            return (com.tencent.mars.cdn.proto.BatchUpload.Request) super.parseFrom(bArr);
        }
    }

    /* loaded from: classes8.dex */
    public static class Result extends com.tencent.mm.protobuf.f {
        private static final com.tencent.mars.cdn.proto.BatchUpload.Result DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.BatchUpload.Result();
        private java.util.LinkedList<com.tencent.mars.cdn.proto.FileIdResult> fileid = new java.util.LinkedList<>();
        private java.util.LinkedList<com.tencent.mars.cdn.proto.FileUrl> url = new java.util.LinkedList<>();
        private final boolean[] hasSetFields = new boolean[3];

        public static com.tencent.mars.cdn.proto.BatchUpload.Result create() {
            return new com.tencent.mars.cdn.proto.BatchUpload.Result();
        }

        public static com.tencent.mars.cdn.proto.BatchUpload.Result getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.tencent.mars.cdn.proto.BatchUpload.Result newBuilder() {
            return new com.tencent.mars.cdn.proto.BatchUpload.Result();
        }

        public com.tencent.mars.cdn.proto.BatchUpload.Result addAllElementFileid(java.util.Collection<com.tencent.mars.cdn.proto.FileIdResult> collection) {
            this.fileid.addAll(collection);
            this.hasSetFields[1] = true;
            return this;
        }

        public com.tencent.mars.cdn.proto.BatchUpload.Result addAllElementUrl(java.util.Collection<com.tencent.mars.cdn.proto.FileUrl> collection) {
            this.url.addAll(collection);
            this.hasSetFields[2] = true;
            return this;
        }

        public com.tencent.mars.cdn.proto.BatchUpload.Result addElementFileid(com.tencent.mars.cdn.proto.FileIdResult fileIdResult) {
            this.fileid.add(fileIdResult);
            this.hasSetFields[1] = true;
            return this;
        }

        public com.tencent.mars.cdn.proto.BatchUpload.Result addElementUrl(com.tencent.mars.cdn.proto.FileUrl fileUrl) {
            this.url.add(fileUrl);
            this.hasSetFields[2] = true;
            return this;
        }

        public com.tencent.mars.cdn.proto.BatchUpload.Result build() {
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
            if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.BatchUpload.Result)) {
                return false;
            }
            com.tencent.mars.cdn.proto.BatchUpload.Result result = (com.tencent.mars.cdn.proto.BatchUpload.Result) fVar;
            return n51.f.a(this.fileid, result.fileid) && n51.f.a(this.url, result.url);
        }

        public java.util.LinkedList<com.tencent.mars.cdn.proto.FileIdResult> getFileid() {
            return this.fileid;
        }

        public java.util.LinkedList<com.tencent.mars.cdn.proto.FileUrl> getUrl() {
            return this.url;
        }

        public boolean hasFieldNumber(int i17) {
            return this.hasSetFields[i17];
        }

        public boolean hasFileid() {
            return hasFieldNumber(1);
        }

        public boolean hasUrl() {
            return hasFieldNumber(2);
        }

        public com.tencent.mars.cdn.proto.BatchUpload.Result mergeFrom(com.tencent.mm.protobuf.f fVar) {
            parseFrom(fVar.getData());
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.mm.protobuf.f newInstance() {
            return new com.tencent.mars.cdn.proto.BatchUpload.Result();
        }

        @Override // com.tencent.mm.protobuf.f
        public final int op(int i17, java.lang.Object... objArr) {
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                fVar.g(1, 8, this.fileid);
                fVar.g(2, 8, this.url);
                return 0;
            }
            if (i17 == 1) {
                return b36.f.g(1, 8, this.fileid) + 0 + b36.f.g(2, 8, this.url);
            }
            if (i17 == 2) {
                this.fileid.clear();
                this.url.clear();
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.mars.cdn.proto.FileIdResult fileIdResult = new com.tencent.mars.cdn.proto.FileIdResult();
                    if (bArr != null && bArr.length > 0) {
                        fileIdResult.parseFrom(bArr);
                    }
                    this.fileid.add(fileIdResult);
                }
                this.hasSetFields[1] = true;
                return 0;
            }
            if (intValue != 2) {
                return -1;
            }
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                com.tencent.mars.cdn.proto.FileUrl fileUrl = new com.tencent.mars.cdn.proto.FileUrl();
                if (bArr2 != null && bArr2.length > 0) {
                    fileUrl.parseFrom(bArr2);
                }
                this.url.add(fileUrl);
            }
            this.hasSetFields[2] = true;
            return 0;
        }

        public com.tencent.mars.cdn.proto.BatchUpload.Result setFileid(java.util.LinkedList<com.tencent.mars.cdn.proto.FileIdResult> linkedList) {
            this.fileid = linkedList;
            this.hasSetFields[1] = true;
            return this;
        }

        public com.tencent.mars.cdn.proto.BatchUpload.Result setUrl(java.util.LinkedList<com.tencent.mars.cdn.proto.FileUrl> linkedList) {
            this.url = linkedList;
            this.hasSetFields[2] = true;
            return this;
        }

        public com.tencent.mars.cdn.proto.BatchUpload.Result mergeFrom(byte[] bArr) {
            parseFrom(bArr);
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.mars.cdn.proto.BatchUpload.Result parseFrom(byte[] bArr) {
            return (com.tencent.mars.cdn.proto.BatchUpload.Result) super.parseFrom(bArr);
        }
    }

    public static com.tencent.mars.cdn.proto.BatchUpload create() {
        return new com.tencent.mars.cdn.proto.BatchUpload();
    }

    public static com.tencent.mars.cdn.proto.BatchUpload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.BatchUpload newBuilder() {
        return new com.tencent.mars.cdn.proto.BatchUpload();
    }

    public com.tencent.mars.cdn.proto.BatchUpload build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.BatchUpload)) {
            return false;
        }
        return true;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public com.tencent.mars.cdn.proto.BatchUpload mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.BatchUpload();
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

    public com.tencent.mars.cdn.proto.BatchUpload mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.BatchUpload parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.BatchUpload) super.parseFrom(bArr);
    }
}
