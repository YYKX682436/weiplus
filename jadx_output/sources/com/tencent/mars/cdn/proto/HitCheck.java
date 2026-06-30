package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class HitCheck extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.HitCheck DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.HitCheck();
    private com.tencent.mars.cdn.proto.Base base;
    private com.tencent.mars.cdn.proto.FileIdParam fileid;
    private int filetype;
    private final boolean[] hasSetFields = new boolean[4];

    public static com.tencent.mars.cdn.proto.HitCheck create() {
        return new com.tencent.mars.cdn.proto.HitCheck();
    }

    public static com.tencent.mars.cdn.proto.HitCheck getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.HitCheck newBuilder() {
        return new com.tencent.mars.cdn.proto.HitCheck();
    }

    public com.tencent.mars.cdn.proto.HitCheck build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.HitCheck)) {
            return false;
        }
        com.tencent.mars.cdn.proto.HitCheck hitCheck = (com.tencent.mars.cdn.proto.HitCheck) fVar;
        return n51.f.a(this.base, hitCheck.base) && n51.f.a(java.lang.Integer.valueOf(this.filetype), java.lang.Integer.valueOf(hitCheck.filetype)) && n51.f.a(this.fileid, hitCheck.fileid);
    }

    public com.tencent.mars.cdn.proto.Base getBase() {
        return this.hasSetFields[1] ? this.base : com.tencent.mars.cdn.proto.Base.create();
    }

    public com.tencent.mars.cdn.proto.FileIdParam getFileid() {
        return this.hasSetFields[3] ? this.fileid : com.tencent.mars.cdn.proto.FileIdParam.create();
    }

    public int getFiletype() {
        return this.filetype;
    }

    public boolean hasBase() {
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

    public com.tencent.mars.cdn.proto.HitCheck mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.HitCheck();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mars.cdn.proto.Base base = this.base;
            if (base != null && this.hasSetFields[1]) {
                fVar.i(1, base.computeSize());
                this.base.writeFields(fVar);
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
            com.tencent.mars.cdn.proto.Base base2 = this.base;
            if (base2 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.i(1, base2.computeSize());
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.tencent.mars.cdn.proto.Base base3 = new com.tencent.mars.cdn.proto.Base();
                if (bArr != null && bArr.length > 0) {
                    base3.parseFrom(bArr);
                }
                this.base = base3;
            }
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
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.tencent.mars.cdn.proto.FileIdParam fileIdParam3 = new com.tencent.mars.cdn.proto.FileIdParam();
            if (bArr2 != null && bArr2.length > 0) {
                fileIdParam3.parseFrom(bArr2);
            }
            this.fileid = fileIdParam3;
        }
        this.hasSetFields[3] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.HitCheck setBase(com.tencent.mars.cdn.proto.Base base) {
        this.base = base;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.HitCheck setFileid(com.tencent.mars.cdn.proto.FileIdParam fileIdParam) {
        this.fileid = fileIdParam;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.HitCheck setFiletype(int i17) {
        this.filetype = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.HitCheck mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.HitCheck parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.HitCheck) super.parseFrom(bArr);
    }
}
