package com.tencent.mars.cdn.proto;

/* loaded from: classes4.dex */
public class EmbedUpload extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.EmbedUpload DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.EmbedUpload();
    private final boolean[] hasSetFields = new boolean[1];

    /* loaded from: classes8.dex */
    public static class Request extends com.tencent.mm.protobuf.f {
        private static final com.tencent.mars.cdn.proto.EmbedUpload.Request DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.EmbedUpload.Request();
        private java.util.LinkedList<com.tencent.mars.cdn.proto.FileItem> files = new java.util.LinkedList<>();
        private final boolean[] hasSetFields = new boolean[3];
        private com.tencent.mars.cdn.proto.LegacyEmbed legacy;

        public static com.tencent.mars.cdn.proto.EmbedUpload.Request create() {
            return new com.tencent.mars.cdn.proto.EmbedUpload.Request();
        }

        public static com.tencent.mars.cdn.proto.EmbedUpload.Request getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.tencent.mars.cdn.proto.EmbedUpload.Request newBuilder() {
            return new com.tencent.mars.cdn.proto.EmbedUpload.Request();
        }

        public com.tencent.mars.cdn.proto.EmbedUpload.Request addAllElementFiles(java.util.Collection<com.tencent.mars.cdn.proto.FileItem> collection) {
            this.files.addAll(collection);
            this.hasSetFields[2] = true;
            return this;
        }

        public com.tencent.mars.cdn.proto.EmbedUpload.Request addElementFiles(com.tencent.mars.cdn.proto.FileItem fileItem) {
            this.files.add(fileItem);
            this.hasSetFields[2] = true;
            return this;
        }

        public com.tencent.mars.cdn.proto.EmbedUpload.Request build() {
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
            if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.EmbedUpload.Request)) {
                return false;
            }
            com.tencent.mars.cdn.proto.EmbedUpload.Request request = (com.tencent.mars.cdn.proto.EmbedUpload.Request) fVar;
            return n51.f.a(this.legacy, request.legacy) && n51.f.a(this.files, request.files);
        }

        public java.util.LinkedList<com.tencent.mars.cdn.proto.FileItem> getFiles() {
            return this.files;
        }

        public com.tencent.mars.cdn.proto.LegacyEmbed getLegacy() {
            return this.hasSetFields[1] ? this.legacy : com.tencent.mars.cdn.proto.LegacyEmbed.create();
        }

        public boolean hasFieldNumber(int i17) {
            return this.hasSetFields[i17];
        }

        public boolean hasFiles() {
            return hasFieldNumber(2);
        }

        public boolean hasLegacy() {
            return hasFieldNumber(1);
        }

        public com.tencent.mars.cdn.proto.EmbedUpload.Request mergeFrom(com.tencent.mm.protobuf.f fVar) {
            parseFrom(fVar.getData());
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.mm.protobuf.f newInstance() {
            return new com.tencent.mars.cdn.proto.EmbedUpload.Request();
        }

        @Override // com.tencent.mm.protobuf.f
        public final int op(int i17, java.lang.Object... objArr) {
            int i18 = 0;
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                com.tencent.mars.cdn.proto.LegacyEmbed legacyEmbed = this.legacy;
                if (legacyEmbed != null && this.hasSetFields[1]) {
                    fVar.i(1, legacyEmbed.computeSize());
                    this.legacy.writeFields(fVar);
                }
                fVar.g(2, 8, this.files);
                return 0;
            }
            if (i17 == 1) {
                com.tencent.mars.cdn.proto.LegacyEmbed legacyEmbed2 = this.legacy;
                if (legacyEmbed2 != null && this.hasSetFields[1]) {
                    i18 = 0 + b36.f.i(1, legacyEmbed2.computeSize());
                }
                return i18 + b36.f.g(2, 8, this.files);
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
            if (intValue == 1) {
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.mars.cdn.proto.LegacyEmbed legacyEmbed3 = new com.tencent.mars.cdn.proto.LegacyEmbed();
                    if (bArr != null && bArr.length > 0) {
                        legacyEmbed3.parseFrom(bArr);
                    }
                    this.legacy = legacyEmbed3;
                }
                this.hasSetFields[1] = true;
                return 0;
            }
            if (intValue != 2) {
                return -1;
            }
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.tencent.mars.cdn.proto.FileItem fileItem = new com.tencent.mars.cdn.proto.FileItem();
                if (bArr2 != null && bArr2.length > 0) {
                    fileItem.parseFrom(bArr2);
                }
                this.files.add(fileItem);
            }
            this.hasSetFields[2] = true;
            return 0;
        }

        public com.tencent.mars.cdn.proto.EmbedUpload.Request setFiles(java.util.LinkedList<com.tencent.mars.cdn.proto.FileItem> linkedList) {
            this.files = linkedList;
            this.hasSetFields[2] = true;
            return this;
        }

        public com.tencent.mars.cdn.proto.EmbedUpload.Request setLegacy(com.tencent.mars.cdn.proto.LegacyEmbed legacyEmbed) {
            this.legacy = legacyEmbed;
            this.hasSetFields[1] = true;
            return this;
        }

        public com.tencent.mars.cdn.proto.EmbedUpload.Request mergeFrom(byte[] bArr) {
            parseFrom(bArr);
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.mars.cdn.proto.EmbedUpload.Request parseFrom(byte[] bArr) {
            return (com.tencent.mars.cdn.proto.EmbedUpload.Request) super.parseFrom(bArr);
        }
    }

    /* loaded from: classes8.dex */
    public static class Result extends com.tencent.mm.protobuf.f {
        private static final com.tencent.mars.cdn.proto.EmbedUpload.Result DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.EmbedUpload.Result();
        private com.tencent.mars.cdn.proto.FileIdResult fileid;
        private final boolean[] hasSetFields = new boolean[6];
        private com.tencent.mars.cdn.proto.FileStat main;
        private com.tencent.mars.cdn.proto.FileStat mid;
        private com.tencent.mars.cdn.proto.FileStat thumb;
        private com.tencent.mars.cdn.proto.FileUrl url;

        public static com.tencent.mars.cdn.proto.EmbedUpload.Result create() {
            return new com.tencent.mars.cdn.proto.EmbedUpload.Result();
        }

        public static com.tencent.mars.cdn.proto.EmbedUpload.Result getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.tencent.mars.cdn.proto.EmbedUpload.Result newBuilder() {
            return new com.tencent.mars.cdn.proto.EmbedUpload.Result();
        }

        public com.tencent.mars.cdn.proto.EmbedUpload.Result build() {
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
            if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.EmbedUpload.Result)) {
                return false;
            }
            com.tencent.mars.cdn.proto.EmbedUpload.Result result = (com.tencent.mars.cdn.proto.EmbedUpload.Result) fVar;
            return n51.f.a(this.fileid, result.fileid) && n51.f.a(this.url, result.url) && n51.f.a(this.main, result.main) && n51.f.a(this.thumb, result.thumb) && n51.f.a(this.mid, result.mid);
        }

        public com.tencent.mars.cdn.proto.FileIdResult getFileid() {
            return this.hasSetFields[1] ? this.fileid : com.tencent.mars.cdn.proto.FileIdResult.create();
        }

        public com.tencent.mars.cdn.proto.FileStat getMain() {
            return this.hasSetFields[3] ? this.main : com.tencent.mars.cdn.proto.FileStat.create();
        }

        public com.tencent.mars.cdn.proto.FileStat getMid() {
            return this.hasSetFields[5] ? this.mid : com.tencent.mars.cdn.proto.FileStat.create();
        }

        public com.tencent.mars.cdn.proto.FileStat getThumb() {
            return this.hasSetFields[4] ? this.thumb : com.tencent.mars.cdn.proto.FileStat.create();
        }

        public com.tencent.mars.cdn.proto.FileUrl getUrl() {
            return this.hasSetFields[2] ? this.url : com.tencent.mars.cdn.proto.FileUrl.create();
        }

        public boolean hasFieldNumber(int i17) {
            return this.hasSetFields[i17];
        }

        public boolean hasFileid() {
            return hasFieldNumber(1);
        }

        public boolean hasMain() {
            return hasFieldNumber(3);
        }

        public boolean hasMid() {
            return hasFieldNumber(5);
        }

        public boolean hasThumb() {
            return hasFieldNumber(4);
        }

        public boolean hasUrl() {
            return hasFieldNumber(2);
        }

        public com.tencent.mars.cdn.proto.EmbedUpload.Result mergeFrom(com.tencent.mm.protobuf.f fVar) {
            parseFrom(fVar.getData());
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.mm.protobuf.f newInstance() {
            return new com.tencent.mars.cdn.proto.EmbedUpload.Result();
        }

        @Override // com.tencent.mm.protobuf.f
        public final int op(int i17, java.lang.Object... objArr) {
            int i18 = 0;
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                com.tencent.mars.cdn.proto.FileIdResult fileIdResult = this.fileid;
                if (fileIdResult != null && this.hasSetFields[1]) {
                    fVar.i(1, fileIdResult.computeSize());
                    this.fileid.writeFields(fVar);
                }
                com.tencent.mars.cdn.proto.FileUrl fileUrl = this.url;
                if (fileUrl != null && this.hasSetFields[2]) {
                    fVar.i(2, fileUrl.computeSize());
                    this.url.writeFields(fVar);
                }
                com.tencent.mars.cdn.proto.FileStat fileStat = this.main;
                if (fileStat != null && this.hasSetFields[3]) {
                    fVar.i(3, fileStat.computeSize());
                    this.main.writeFields(fVar);
                }
                com.tencent.mars.cdn.proto.FileStat fileStat2 = this.thumb;
                if (fileStat2 != null && this.hasSetFields[4]) {
                    fVar.i(4, fileStat2.computeSize());
                    this.thumb.writeFields(fVar);
                }
                com.tencent.mars.cdn.proto.FileStat fileStat3 = this.mid;
                if (fileStat3 != null && this.hasSetFields[5]) {
                    fVar.i(5, fileStat3.computeSize());
                    this.mid.writeFields(fVar);
                }
                return 0;
            }
            if (i17 == 1) {
                com.tencent.mars.cdn.proto.FileIdResult fileIdResult2 = this.fileid;
                if (fileIdResult2 != null && this.hasSetFields[1]) {
                    i18 = 0 + b36.f.i(1, fileIdResult2.computeSize());
                }
                com.tencent.mars.cdn.proto.FileUrl fileUrl2 = this.url;
                if (fileUrl2 != null && this.hasSetFields[2]) {
                    i18 += b36.f.i(2, fileUrl2.computeSize());
                }
                com.tencent.mars.cdn.proto.FileStat fileStat4 = this.main;
                if (fileStat4 != null && this.hasSetFields[3]) {
                    i18 += b36.f.i(3, fileStat4.computeSize());
                }
                com.tencent.mars.cdn.proto.FileStat fileStat5 = this.thumb;
                if (fileStat5 != null && this.hasSetFields[4]) {
                    i18 += b36.f.i(4, fileStat5.computeSize());
                }
                com.tencent.mars.cdn.proto.FileStat fileStat6 = this.mid;
                return (fileStat6 == null || !this.hasSetFields[5]) ? i18 : i18 + b36.f.i(5, fileStat6.computeSize());
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.mars.cdn.proto.FileIdResult fileIdResult3 = new com.tencent.mars.cdn.proto.FileIdResult();
                    if (bArr != null && bArr.length > 0) {
                        fileIdResult3.parseFrom(bArr);
                    }
                    this.fileid = fileIdResult3;
                }
                this.hasSetFields[1] = true;
                return 0;
            }
            if (intValue == 2) {
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.mars.cdn.proto.FileUrl fileUrl3 = new com.tencent.mars.cdn.proto.FileUrl();
                    if (bArr2 != null && bArr2.length > 0) {
                        fileUrl3.parseFrom(bArr2);
                    }
                    this.url = fileUrl3;
                }
                this.hasSetFields[2] = true;
                return 0;
            }
            if (intValue == 3) {
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.tencent.mars.cdn.proto.FileStat fileStat7 = new com.tencent.mars.cdn.proto.FileStat();
                    if (bArr3 != null && bArr3.length > 0) {
                        fileStat7.parseFrom(bArr3);
                    }
                    this.main = fileStat7;
                }
                this.hasSetFields[3] = true;
                return 0;
            }
            if (intValue == 4) {
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    com.tencent.mars.cdn.proto.FileStat fileStat8 = new com.tencent.mars.cdn.proto.FileStat();
                    if (bArr4 != null && bArr4.length > 0) {
                        fileStat8.parseFrom(bArr4);
                    }
                    this.thumb = fileStat8;
                }
                this.hasSetFields[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            java.util.LinkedList j28 = aVar2.j(intValue);
            int size5 = j28.size();
            for (int i37 = 0; i37 < size5; i37++) {
                byte[] bArr5 = (byte[]) j28.get(i37);
                com.tencent.mars.cdn.proto.FileStat fileStat9 = new com.tencent.mars.cdn.proto.FileStat();
                if (bArr5 != null && bArr5.length > 0) {
                    fileStat9.parseFrom(bArr5);
                }
                this.mid = fileStat9;
            }
            this.hasSetFields[5] = true;
            return 0;
        }

        public com.tencent.mars.cdn.proto.EmbedUpload.Result setFileid(com.tencent.mars.cdn.proto.FileIdResult fileIdResult) {
            this.fileid = fileIdResult;
            this.hasSetFields[1] = true;
            return this;
        }

        public com.tencent.mars.cdn.proto.EmbedUpload.Result setMain(com.tencent.mars.cdn.proto.FileStat fileStat) {
            this.main = fileStat;
            this.hasSetFields[3] = true;
            return this;
        }

        public com.tencent.mars.cdn.proto.EmbedUpload.Result setMid(com.tencent.mars.cdn.proto.FileStat fileStat) {
            this.mid = fileStat;
            this.hasSetFields[5] = true;
            return this;
        }

        public com.tencent.mars.cdn.proto.EmbedUpload.Result setThumb(com.tencent.mars.cdn.proto.FileStat fileStat) {
            this.thumb = fileStat;
            this.hasSetFields[4] = true;
            return this;
        }

        public com.tencent.mars.cdn.proto.EmbedUpload.Result setUrl(com.tencent.mars.cdn.proto.FileUrl fileUrl) {
            this.url = fileUrl;
            this.hasSetFields[2] = true;
            return this;
        }

        public com.tencent.mars.cdn.proto.EmbedUpload.Result mergeFrom(byte[] bArr) {
            parseFrom(bArr);
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.mars.cdn.proto.EmbedUpload.Result parseFrom(byte[] bArr) {
            return (com.tencent.mars.cdn.proto.EmbedUpload.Result) super.parseFrom(bArr);
        }
    }

    public static com.tencent.mars.cdn.proto.EmbedUpload create() {
        return new com.tencent.mars.cdn.proto.EmbedUpload();
    }

    public static com.tencent.mars.cdn.proto.EmbedUpload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.EmbedUpload newBuilder() {
        return new com.tencent.mars.cdn.proto.EmbedUpload();
    }

    public com.tencent.mars.cdn.proto.EmbedUpload build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.EmbedUpload)) {
            return false;
        }
        return true;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public com.tencent.mars.cdn.proto.EmbedUpload mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.EmbedUpload();
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

    public com.tencent.mars.cdn.proto.EmbedUpload mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.EmbedUpload parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.EmbedUpload) super.parseFrom(bArr);
    }
}
