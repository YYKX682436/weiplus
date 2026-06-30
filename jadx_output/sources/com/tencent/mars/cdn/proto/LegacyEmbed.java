package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class LegacyEmbed extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.LegacyEmbed DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.LegacyEmbed();
    private final boolean[] hasSetFields = new boolean[5];
    private com.tencent.mars.cdn.proto.FileItem main;
    private com.tencent.mars.cdn.proto.FileIdParam main_fileid;
    private com.tencent.mars.cdn.proto.FileItem mid;
    private com.tencent.mars.cdn.proto.FileItem thumb;

    public static com.tencent.mars.cdn.proto.LegacyEmbed create() {
        return new com.tencent.mars.cdn.proto.LegacyEmbed();
    }

    public static com.tencent.mars.cdn.proto.LegacyEmbed getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.LegacyEmbed newBuilder() {
        return new com.tencent.mars.cdn.proto.LegacyEmbed();
    }

    public com.tencent.mars.cdn.proto.LegacyEmbed build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.LegacyEmbed)) {
            return false;
        }
        com.tencent.mars.cdn.proto.LegacyEmbed legacyEmbed = (com.tencent.mars.cdn.proto.LegacyEmbed) fVar;
        return n51.f.a(this.main, legacyEmbed.main) && n51.f.a(this.thumb, legacyEmbed.thumb) && n51.f.a(this.mid, legacyEmbed.mid) && n51.f.a(this.main_fileid, legacyEmbed.main_fileid);
    }

    public com.tencent.mars.cdn.proto.FileItem getMain() {
        return this.hasSetFields[1] ? this.main : com.tencent.mars.cdn.proto.FileItem.create();
    }

    public com.tencent.mars.cdn.proto.FileIdParam getMainFileid() {
        return this.hasSetFields[4] ? this.main_fileid : com.tencent.mars.cdn.proto.FileIdParam.create();
    }

    public com.tencent.mars.cdn.proto.FileItem getMid() {
        return this.hasSetFields[3] ? this.mid : com.tencent.mars.cdn.proto.FileItem.create();
    }

    public com.tencent.mars.cdn.proto.FileItem getThumb() {
        return this.hasSetFields[2] ? this.thumb : com.tencent.mars.cdn.proto.FileItem.create();
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasMain() {
        return hasFieldNumber(1);
    }

    public boolean hasMainFileid() {
        return hasFieldNumber(4);
    }

    public boolean hasMid() {
        return hasFieldNumber(3);
    }

    public boolean hasThumb() {
        return hasFieldNumber(2);
    }

    public com.tencent.mars.cdn.proto.LegacyEmbed mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.LegacyEmbed();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mars.cdn.proto.FileItem fileItem = this.main;
            if (fileItem != null && this.hasSetFields[1]) {
                fVar.i(1, fileItem.computeSize());
                this.main.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.FileItem fileItem2 = this.thumb;
            if (fileItem2 != null && this.hasSetFields[2]) {
                fVar.i(2, fileItem2.computeSize());
                this.thumb.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.FileItem fileItem3 = this.mid;
            if (fileItem3 != null && this.hasSetFields[3]) {
                fVar.i(3, fileItem3.computeSize());
                this.mid.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.FileIdParam fileIdParam = this.main_fileid;
            if (fileIdParam != null && this.hasSetFields[4]) {
                fVar.i(4, fileIdParam.computeSize());
                this.main_fileid.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mars.cdn.proto.FileItem fileItem4 = this.main;
            if (fileItem4 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.i(1, fileItem4.computeSize());
            }
            com.tencent.mars.cdn.proto.FileItem fileItem5 = this.thumb;
            if (fileItem5 != null && this.hasSetFields[2]) {
                i18 += b36.f.i(2, fileItem5.computeSize());
            }
            com.tencent.mars.cdn.proto.FileItem fileItem6 = this.mid;
            if (fileItem6 != null && this.hasSetFields[3]) {
                i18 += b36.f.i(3, fileItem6.computeSize());
            }
            com.tencent.mars.cdn.proto.FileIdParam fileIdParam2 = this.main_fileid;
            return (fileIdParam2 == null || !this.hasSetFields[4]) ? i18 : i18 + b36.f.i(4, fileIdParam2.computeSize());
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
                com.tencent.mars.cdn.proto.FileItem fileItem7 = new com.tencent.mars.cdn.proto.FileItem();
                if (bArr != null && bArr.length > 0) {
                    fileItem7.parseFrom(bArr);
                }
                this.main = fileItem7;
            }
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.tencent.mars.cdn.proto.FileItem fileItem8 = new com.tencent.mars.cdn.proto.FileItem();
                if (bArr2 != null && bArr2.length > 0) {
                    fileItem8.parseFrom(bArr2);
                }
                this.thumb = fileItem8;
            }
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                com.tencent.mars.cdn.proto.FileItem fileItem9 = new com.tencent.mars.cdn.proto.FileItem();
                if (bArr3 != null && bArr3.length > 0) {
                    fileItem9.parseFrom(bArr3);
                }
                this.mid = fileItem9;
            }
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            com.tencent.mars.cdn.proto.FileIdParam fileIdParam3 = new com.tencent.mars.cdn.proto.FileIdParam();
            if (bArr4 != null && bArr4.length > 0) {
                fileIdParam3.parseFrom(bArr4);
            }
            this.main_fileid = fileIdParam3;
        }
        this.hasSetFields[4] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.LegacyEmbed setMain(com.tencent.mars.cdn.proto.FileItem fileItem) {
        this.main = fileItem;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.LegacyEmbed setMainFileid(com.tencent.mars.cdn.proto.FileIdParam fileIdParam) {
        this.main_fileid = fileIdParam;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.LegacyEmbed setMid(com.tencent.mars.cdn.proto.FileItem fileItem) {
        this.mid = fileItem;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.LegacyEmbed setThumb(com.tencent.mars.cdn.proto.FileItem fileItem) {
        this.thumb = fileItem;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.LegacyEmbed mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.LegacyEmbed parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.LegacyEmbed) super.parseFrom(bArr);
    }
}
