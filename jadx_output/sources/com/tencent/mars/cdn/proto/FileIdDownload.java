package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class FileIdDownload extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.FileIdDownload DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.FileIdDownload();
    private com.tencent.mars.cdn.proto.BigfileOptions bigfile;
    private com.tencent.mars.cdn.proto.FileIdParam fileid;
    private final boolean[] hasSetFields = new boolean[3];

    public static com.tencent.mars.cdn.proto.FileIdDownload create() {
        return new com.tencent.mars.cdn.proto.FileIdDownload();
    }

    public static com.tencent.mars.cdn.proto.FileIdDownload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.FileIdDownload newBuilder() {
        return new com.tencent.mars.cdn.proto.FileIdDownload();
    }

    public com.tencent.mars.cdn.proto.FileIdDownload build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.FileIdDownload)) {
            return false;
        }
        com.tencent.mars.cdn.proto.FileIdDownload fileIdDownload = (com.tencent.mars.cdn.proto.FileIdDownload) fVar;
        return n51.f.a(this.fileid, fileIdDownload.fileid) && n51.f.a(this.bigfile, fileIdDownload.bigfile);
    }

    public com.tencent.mars.cdn.proto.BigfileOptions getBigfile() {
        return this.hasSetFields[2] ? this.bigfile : com.tencent.mars.cdn.proto.BigfileOptions.create();
    }

    public com.tencent.mars.cdn.proto.FileIdParam getFileid() {
        return this.hasSetFields[1] ? this.fileid : com.tencent.mars.cdn.proto.FileIdParam.create();
    }

    public boolean hasBigfile() {
        return hasFieldNumber(2);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasFileid() {
        return hasFieldNumber(1);
    }

    public com.tencent.mars.cdn.proto.FileIdDownload mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.FileIdDownload();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mars.cdn.proto.FileIdParam fileIdParam = this.fileid;
            if (fileIdParam != null && this.hasSetFields[1]) {
                fVar.i(1, fileIdParam.computeSize());
                this.fileid.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.BigfileOptions bigfileOptions = this.bigfile;
            if (bigfileOptions != null && this.hasSetFields[2]) {
                fVar.i(2, bigfileOptions.computeSize());
                this.bigfile.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mars.cdn.proto.FileIdParam fileIdParam2 = this.fileid;
            if (fileIdParam2 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.i(1, fileIdParam2.computeSize());
            }
            com.tencent.mars.cdn.proto.BigfileOptions bigfileOptions2 = this.bigfile;
            return (bigfileOptions2 == null || !this.hasSetFields[2]) ? i18 : i18 + b36.f.i(2, bigfileOptions2.computeSize());
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
                com.tencent.mars.cdn.proto.FileIdParam fileIdParam3 = new com.tencent.mars.cdn.proto.FileIdParam();
                if (bArr != null && bArr.length > 0) {
                    fileIdParam3.parseFrom(bArr);
                }
                this.fileid = fileIdParam3;
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
            com.tencent.mars.cdn.proto.BigfileOptions bigfileOptions3 = new com.tencent.mars.cdn.proto.BigfileOptions();
            if (bArr2 != null && bArr2.length > 0) {
                bigfileOptions3.parseFrom(bArr2);
            }
            this.bigfile = bigfileOptions3;
        }
        this.hasSetFields[2] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.FileIdDownload setBigfile(com.tencent.mars.cdn.proto.BigfileOptions bigfileOptions) {
        this.bigfile = bigfileOptions;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.FileIdDownload setFileid(com.tencent.mars.cdn.proto.FileIdParam fileIdParam) {
        this.fileid = fileIdParam;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.FileIdDownload mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.FileIdDownload parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.FileIdDownload) super.parseFrom(bArr);
    }
}
