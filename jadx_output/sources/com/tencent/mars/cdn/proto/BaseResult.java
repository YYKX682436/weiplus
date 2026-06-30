package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class BaseResult extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.BaseResult DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.BaseResult();
    private com.tencent.mm.protobuf.g bizdata;
    private com.tencent.mars.cdn.proto.CipherContext cipher;
    private final boolean[] hasSetFields = new boolean[7];
    private com.tencent.mars.cdn.proto.DownloadMode mode;
    private int sub_tasktype;
    private long taskid;
    private int tasktype;

    public static com.tencent.mars.cdn.proto.BaseResult create() {
        return new com.tencent.mars.cdn.proto.BaseResult();
    }

    public static com.tencent.mars.cdn.proto.BaseResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.BaseResult newBuilder() {
        return new com.tencent.mars.cdn.proto.BaseResult();
    }

    public com.tencent.mars.cdn.proto.BaseResult build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.BaseResult)) {
            return false;
        }
        com.tencent.mars.cdn.proto.BaseResult baseResult = (com.tencent.mars.cdn.proto.BaseResult) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.taskid), java.lang.Long.valueOf(baseResult.taskid)) && n51.f.a(this.mode, baseResult.mode) && n51.f.a(this.bizdata, baseResult.bizdata) && n51.f.a(java.lang.Integer.valueOf(this.tasktype), java.lang.Integer.valueOf(baseResult.tasktype)) && n51.f.a(java.lang.Integer.valueOf(this.sub_tasktype), java.lang.Integer.valueOf(baseResult.sub_tasktype)) && n51.f.a(this.cipher, baseResult.cipher);
    }

    public com.tencent.mm.protobuf.g getBizdata() {
        return this.hasSetFields[3] ? this.bizdata : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mars.cdn.proto.CipherContext getCipher() {
        return this.hasSetFields[6] ? this.cipher : com.tencent.mars.cdn.proto.CipherContext.create();
    }

    public com.tencent.mars.cdn.proto.DownloadMode getMode() {
        return this.hasSetFields[2] ? this.mode : com.tencent.mars.cdn.proto.DownloadMode.DOWNLOAD_MODE_STORAGE;
    }

    public int getSubTasktype() {
        return this.sub_tasktype;
    }

    public long getTaskid() {
        return this.taskid;
    }

    public int getTasktype() {
        return this.tasktype;
    }

    public boolean hasBizdata() {
        return hasFieldNumber(3);
    }

    public boolean hasCipher() {
        return hasFieldNumber(6);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasMode() {
        return hasFieldNumber(2);
    }

    public boolean hasSubTasktype() {
        return hasFieldNumber(5);
    }

    public boolean hasTaskid() {
        return hasFieldNumber(1);
    }

    public boolean hasTasktype() {
        return hasFieldNumber(4);
    }

    public com.tencent.mars.cdn.proto.BaseResult mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.BaseResult();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.h(1, this.taskid);
            }
            com.tencent.mars.cdn.proto.DownloadMode downloadMode = this.mode;
            if (downloadMode != null && this.hasSetFields[2]) {
                fVar.e(2, downloadMode.value);
            }
            com.tencent.mm.protobuf.g gVar = this.bizdata;
            if (gVar != null && this.hasSetFields[3]) {
                fVar.b(3, gVar);
            }
            if (this.hasSetFields[4]) {
                fVar.e(4, this.tasktype);
            }
            if (this.hasSetFields[5]) {
                fVar.e(5, this.sub_tasktype);
            }
            com.tencent.mars.cdn.proto.CipherContext cipherContext = this.cipher;
            if (cipherContext != null && this.hasSetFields[6]) {
                fVar.i(6, cipherContext.computeSize());
                this.cipher.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = this.hasSetFields[1] ? 0 + b36.f.h(1, this.taskid) : 0;
            com.tencent.mars.cdn.proto.DownloadMode downloadMode2 = this.mode;
            if (downloadMode2 != null && this.hasSetFields[2]) {
                h17 += b36.f.e(2, downloadMode2.value);
            }
            com.tencent.mm.protobuf.g gVar2 = this.bizdata;
            if (gVar2 != null && this.hasSetFields[3]) {
                h17 += b36.f.b(3, gVar2);
            }
            if (this.hasSetFields[4]) {
                h17 += b36.f.e(4, this.tasktype);
            }
            if (this.hasSetFields[5]) {
                h17 += b36.f.e(5, this.sub_tasktype);
            }
            com.tencent.mars.cdn.proto.CipherContext cipherContext2 = this.cipher;
            return (cipherContext2 == null || !this.hasSetFields[6]) ? h17 : h17 + b36.f.i(6, cipherContext2.computeSize());
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
                this.taskid = aVar2.i(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.mode = com.tencent.mars.cdn.proto.DownloadMode.forNumber(aVar2.g(intValue));
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.bizdata = aVar2.d(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.tasktype = aVar2.g(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.sub_tasktype = aVar2.g(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.mars.cdn.proto.CipherContext cipherContext3 = new com.tencent.mars.cdn.proto.CipherContext();
                    if (bArr != null && bArr.length > 0) {
                        cipherContext3.parseFrom(bArr);
                    }
                    this.cipher = cipherContext3;
                }
                this.hasSetFields[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mars.cdn.proto.BaseResult setBizdata(com.tencent.mm.protobuf.g gVar) {
        this.bizdata = gVar;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.BaseResult setCipher(com.tencent.mars.cdn.proto.CipherContext cipherContext) {
        this.cipher = cipherContext;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.BaseResult setMode(com.tencent.mars.cdn.proto.DownloadMode downloadMode) {
        this.mode = downloadMode;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.BaseResult setSubTasktype(int i17) {
        this.sub_tasktype = i17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.BaseResult setTaskid(long j17) {
        this.taskid = j17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.BaseResult setTasktype(int i17) {
        this.tasktype = i17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.BaseResult mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.BaseResult parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.BaseResult) super.parseFrom(bArr);
    }
}
