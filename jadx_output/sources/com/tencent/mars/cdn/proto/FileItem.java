package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class FileItem extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.FileItem DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.FileItem();
    private com.tencent.mm.protobuf.g buffer;
    private com.tencent.mars.cdn.proto.MediaCompress compress;
    private java.lang.String filepath;
    private int filetype;
    private int format;
    private final boolean[] hasSetFields = new boolean[7];

    /* renamed from: md5, reason: collision with root package name */
    private java.lang.String f52528md5;

    public static com.tencent.mars.cdn.proto.FileItem create() {
        return new com.tencent.mars.cdn.proto.FileItem();
    }

    public static com.tencent.mars.cdn.proto.FileItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.FileItem newBuilder() {
        return new com.tencent.mars.cdn.proto.FileItem();
    }

    public com.tencent.mars.cdn.proto.FileItem build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.FileItem)) {
            return false;
        }
        com.tencent.mars.cdn.proto.FileItem fileItem = (com.tencent.mars.cdn.proto.FileItem) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.filetype), java.lang.Integer.valueOf(fileItem.filetype)) && n51.f.a(this.filepath, fileItem.filepath) && n51.f.a(this.buffer, fileItem.buffer) && n51.f.a(this.f52528md5, fileItem.f52528md5) && n51.f.a(java.lang.Integer.valueOf(this.format), java.lang.Integer.valueOf(fileItem.format)) && n51.f.a(this.compress, fileItem.compress);
    }

    public com.tencent.mm.protobuf.g getBuffer() {
        return this.hasSetFields[3] ? this.buffer : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mars.cdn.proto.MediaCompress getCompress() {
        return this.hasSetFields[6] ? this.compress : com.tencent.mars.cdn.proto.MediaCompress.MEDIA_COMPRESS_UNKNOWN;
    }

    public java.lang.String getFilepath() {
        return this.hasSetFields[2] ? this.filepath : "";
    }

    public int getFiletype() {
        return this.filetype;
    }

    public int getFormat() {
        return this.format;
    }

    public java.lang.String getMd5() {
        return this.hasSetFields[4] ? this.f52528md5 : "";
    }

    public boolean hasBuffer() {
        return hasFieldNumber(3);
    }

    public boolean hasCompress() {
        return hasFieldNumber(6);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasFilepath() {
        return hasFieldNumber(2);
    }

    public boolean hasFiletype() {
        return hasFieldNumber(1);
    }

    public boolean hasFormat() {
        return hasFieldNumber(5);
    }

    public boolean hasMd5() {
        return hasFieldNumber(4);
    }

    public com.tencent.mars.cdn.proto.FileItem mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.FileItem();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.filetype);
            }
            java.lang.String str = this.filepath;
            if (str != null && this.hasSetFields[2]) {
                fVar.j(2, str);
            }
            com.tencent.mm.protobuf.g gVar = this.buffer;
            if (gVar != null && this.hasSetFields[3]) {
                fVar.b(3, gVar);
            }
            java.lang.String str2 = this.f52528md5;
            if (str2 != null && this.hasSetFields[4]) {
                fVar.j(4, str2);
            }
            if (this.hasSetFields[5]) {
                fVar.e(5, this.format);
            }
            com.tencent.mars.cdn.proto.MediaCompress mediaCompress = this.compress;
            if (mediaCompress != null && this.hasSetFields[6]) {
                fVar.e(6, mediaCompress.value);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.filetype) : 0;
            java.lang.String str3 = this.filepath;
            if (str3 != null && this.hasSetFields[2]) {
                e17 += b36.f.j(2, str3);
            }
            com.tencent.mm.protobuf.g gVar2 = this.buffer;
            if (gVar2 != null && this.hasSetFields[3]) {
                e17 += b36.f.b(3, gVar2);
            }
            java.lang.String str4 = this.f52528md5;
            if (str4 != null && this.hasSetFields[4]) {
                e17 += b36.f.j(4, str4);
            }
            if (this.hasSetFields[5]) {
                e17 += b36.f.e(5, this.format);
            }
            com.tencent.mars.cdn.proto.MediaCompress mediaCompress2 = this.compress;
            return (mediaCompress2 == null || !this.hasSetFields[6]) ? e17 : e17 + b36.f.e(6, mediaCompress2.value);
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
        switch (intValue) {
            case 1:
                this.filetype = aVar2.g(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.filepath = aVar2.k(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.buffer = aVar2.d(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.f52528md5 = aVar2.k(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.format = aVar2.g(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.compress = com.tencent.mars.cdn.proto.MediaCompress.forNumber(aVar2.g(intValue));
                this.hasSetFields[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mars.cdn.proto.FileItem setBuffer(com.tencent.mm.protobuf.g gVar) {
        this.buffer = gVar;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.FileItem setCompress(com.tencent.mars.cdn.proto.MediaCompress mediaCompress) {
        this.compress = mediaCompress;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.FileItem setFilepath(java.lang.String str) {
        this.filepath = str;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.FileItem setFiletype(int i17) {
        this.filetype = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.FileItem setFormat(int i17) {
        this.format = i17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.FileItem setMd5(java.lang.String str) {
        this.f52528md5 = str;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.FileItem mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.FileItem parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.FileItem) super.parseFrom(bArr);
    }
}
