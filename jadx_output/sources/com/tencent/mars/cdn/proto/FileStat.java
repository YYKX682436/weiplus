package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class FileStat extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.FileStat DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.FileStat();
    private int crc;
    private int filetype;
    private final boolean[] hasSetFields = new boolean[6];

    /* renamed from: md5, reason: collision with root package name */
    private java.lang.String f52529md5;
    private java.lang.String mp4md5;
    private long size;

    public static com.tencent.mars.cdn.proto.FileStat create() {
        return new com.tencent.mars.cdn.proto.FileStat();
    }

    public static com.tencent.mars.cdn.proto.FileStat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.FileStat newBuilder() {
        return new com.tencent.mars.cdn.proto.FileStat();
    }

    public com.tencent.mars.cdn.proto.FileStat build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.FileStat)) {
            return false;
        }
        com.tencent.mars.cdn.proto.FileStat fileStat = (com.tencent.mars.cdn.proto.FileStat) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.filetype), java.lang.Integer.valueOf(fileStat.filetype)) && n51.f.a(java.lang.Long.valueOf(this.size), java.lang.Long.valueOf(fileStat.size)) && n51.f.a(this.f52529md5, fileStat.f52529md5) && n51.f.a(this.mp4md5, fileStat.mp4md5) && n51.f.a(java.lang.Integer.valueOf(this.crc), java.lang.Integer.valueOf(fileStat.crc));
    }

    public int getCrc() {
        return this.crc;
    }

    public int getFiletype() {
        return this.filetype;
    }

    public java.lang.String getMd5() {
        return this.hasSetFields[3] ? this.f52529md5 : "";
    }

    public java.lang.String getMp4md5() {
        return this.hasSetFields[4] ? this.mp4md5 : "";
    }

    public long getSize() {
        return this.size;
    }

    public boolean hasCrc() {
        return hasFieldNumber(5);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasFiletype() {
        return hasFieldNumber(1);
    }

    public boolean hasMd5() {
        return hasFieldNumber(3);
    }

    public boolean hasMp4md5() {
        return hasFieldNumber(4);
    }

    public boolean hasSize() {
        return hasFieldNumber(2);
    }

    public com.tencent.mars.cdn.proto.FileStat mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.FileStat();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.filetype);
            }
            if (this.hasSetFields[2]) {
                fVar.h(2, this.size);
            }
            java.lang.String str = this.f52529md5;
            if (str != null && this.hasSetFields[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.mp4md5;
            if (str2 != null && this.hasSetFields[4]) {
                fVar.j(4, str2);
            }
            if (this.hasSetFields[5]) {
                fVar.e(5, this.crc);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.filetype) : 0;
            if (this.hasSetFields[2]) {
                e17 += b36.f.h(2, this.size);
            }
            java.lang.String str3 = this.f52529md5;
            if (str3 != null && this.hasSetFields[3]) {
                e17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.mp4md5;
            if (str4 != null && this.hasSetFields[4]) {
                e17 += b36.f.j(4, str4);
            }
            return this.hasSetFields[5] ? e17 + b36.f.e(5, this.crc) : e17;
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
            this.size = aVar2.i(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f52529md5 = aVar2.k(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.mp4md5 = aVar2.k(intValue);
            this.hasSetFields[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.crc = aVar2.g(intValue);
        this.hasSetFields[5] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.FileStat setCrc(int i17) {
        this.crc = i17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.FileStat setFiletype(int i17) {
        this.filetype = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.FileStat setMd5(java.lang.String str) {
        this.f52529md5 = str;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.FileStat setMp4md5(java.lang.String str) {
        this.mp4md5 = str;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.FileStat setSize(long j17) {
        this.size = j17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.FileStat mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.FileStat parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.FileStat) super.parseFrom(bArr);
    }
}
