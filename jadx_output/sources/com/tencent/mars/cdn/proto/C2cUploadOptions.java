package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class C2cUploadOptions extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.C2cUploadOptions DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.C2cUploadOptions();
    private java.lang.String aeskey;
    private com.tencent.mars.cdn.proto.BigfileOptions bigfile;
    private boolean enable_hitcheck;
    private java.lang.String filemd5;
    private final boolean[] hasSetFields = new boolean[9];
    private boolean only_hitcheck;
    private com.tencent.mm.protobuf.g sendmsg_data;
    private boolean sendmsg_via_cdn;
    private java.lang.String touser;

    public static com.tencent.mars.cdn.proto.C2cUploadOptions create() {
        return new com.tencent.mars.cdn.proto.C2cUploadOptions();
    }

    public static com.tencent.mars.cdn.proto.C2cUploadOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.C2cUploadOptions newBuilder() {
        return new com.tencent.mars.cdn.proto.C2cUploadOptions();
    }

    public com.tencent.mars.cdn.proto.C2cUploadOptions build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.C2cUploadOptions)) {
            return false;
        }
        com.tencent.mars.cdn.proto.C2cUploadOptions c2cUploadOptions = (com.tencent.mars.cdn.proto.C2cUploadOptions) fVar;
        return n51.f.a(this.touser, c2cUploadOptions.touser) && n51.f.a(java.lang.Boolean.valueOf(this.enable_hitcheck), java.lang.Boolean.valueOf(c2cUploadOptions.enable_hitcheck)) && n51.f.a(this.bigfile, c2cUploadOptions.bigfile) && n51.f.a(java.lang.Boolean.valueOf(this.only_hitcheck), java.lang.Boolean.valueOf(c2cUploadOptions.only_hitcheck)) && n51.f.a(java.lang.Boolean.valueOf(this.sendmsg_via_cdn), java.lang.Boolean.valueOf(c2cUploadOptions.sendmsg_via_cdn)) && n51.f.a(this.sendmsg_data, c2cUploadOptions.sendmsg_data) && n51.f.a(this.filemd5, c2cUploadOptions.filemd5) && n51.f.a(this.aeskey, c2cUploadOptions.aeskey);
    }

    public java.lang.String getAeskey() {
        return this.hasSetFields[8] ? this.aeskey : "";
    }

    public com.tencent.mars.cdn.proto.BigfileOptions getBigfile() {
        return this.hasSetFields[3] ? this.bigfile : com.tencent.mars.cdn.proto.BigfileOptions.create();
    }

    public boolean getEnableHitcheck() {
        return this.enable_hitcheck;
    }

    public java.lang.String getFilemd5() {
        return this.hasSetFields[7] ? this.filemd5 : "";
    }

    public boolean getOnlyHitcheck() {
        return this.only_hitcheck;
    }

    public com.tencent.mm.protobuf.g getSendmsgData() {
        return this.hasSetFields[6] ? this.sendmsg_data : com.tencent.mm.protobuf.g.f192155b;
    }

    public boolean getSendmsgViaCdn() {
        return this.sendmsg_via_cdn;
    }

    public java.lang.String getTouser() {
        return this.hasSetFields[1] ? this.touser : "";
    }

    public boolean hasAeskey() {
        return hasFieldNumber(8);
    }

    public boolean hasBigfile() {
        return hasFieldNumber(3);
    }

    public boolean hasEnableHitcheck() {
        return hasFieldNumber(2);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasFilemd5() {
        return hasFieldNumber(7);
    }

    public boolean hasOnlyHitcheck() {
        return hasFieldNumber(4);
    }

    public boolean hasSendmsgData() {
        return hasFieldNumber(6);
    }

    public boolean hasSendmsgViaCdn() {
        return hasFieldNumber(5);
    }

    public boolean hasTouser() {
        return hasFieldNumber(1);
    }

    public com.tencent.mars.cdn.proto.C2cUploadOptions mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.C2cUploadOptions();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.touser;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            if (this.hasSetFields[2]) {
                fVar.a(2, this.enable_hitcheck);
            }
            com.tencent.mars.cdn.proto.BigfileOptions bigfileOptions = this.bigfile;
            if (bigfileOptions != null && this.hasSetFields[3]) {
                fVar.i(3, bigfileOptions.computeSize());
                this.bigfile.writeFields(fVar);
            }
            if (this.hasSetFields[4]) {
                fVar.a(4, this.only_hitcheck);
            }
            if (this.hasSetFields[5]) {
                fVar.a(5, this.sendmsg_via_cdn);
            }
            com.tencent.mm.protobuf.g gVar = this.sendmsg_data;
            if (gVar != null && this.hasSetFields[6]) {
                fVar.b(6, gVar);
            }
            java.lang.String str2 = this.filemd5;
            if (str2 != null && this.hasSetFields[7]) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.aeskey;
            if (str3 != null && this.hasSetFields[8]) {
                fVar.j(8, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.touser;
            if (str4 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            if (this.hasSetFields[2]) {
                i18 += b36.f.a(2, this.enable_hitcheck);
            }
            com.tencent.mars.cdn.proto.BigfileOptions bigfileOptions2 = this.bigfile;
            if (bigfileOptions2 != null && this.hasSetFields[3]) {
                i18 += b36.f.i(3, bigfileOptions2.computeSize());
            }
            if (this.hasSetFields[4]) {
                i18 += b36.f.a(4, this.only_hitcheck);
            }
            if (this.hasSetFields[5]) {
                i18 += b36.f.a(5, this.sendmsg_via_cdn);
            }
            com.tencent.mm.protobuf.g gVar2 = this.sendmsg_data;
            if (gVar2 != null && this.hasSetFields[6]) {
                i18 += b36.f.b(6, gVar2);
            }
            java.lang.String str5 = this.filemd5;
            if (str5 != null && this.hasSetFields[7]) {
                i18 += b36.f.j(7, str5);
            }
            java.lang.String str6 = this.aeskey;
            return (str6 == null || !this.hasSetFields[8]) ? i18 : i18 + b36.f.j(8, str6);
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
                this.touser = aVar2.k(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.enable_hitcheck = aVar2.c(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.mars.cdn.proto.BigfileOptions bigfileOptions3 = new com.tencent.mars.cdn.proto.BigfileOptions();
                    if (bArr != null && bArr.length > 0) {
                        bigfileOptions3.parseFrom(bArr);
                    }
                    this.bigfile = bigfileOptions3;
                }
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.only_hitcheck = aVar2.c(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.sendmsg_via_cdn = aVar2.c(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.sendmsg_data = aVar2.d(intValue);
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.filemd5 = aVar2.k(intValue);
                this.hasSetFields[7] = true;
                return 0;
            case 8:
                this.aeskey = aVar2.k(intValue);
                this.hasSetFields[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mars.cdn.proto.C2cUploadOptions setAeskey(java.lang.String str) {
        this.aeskey = str;
        this.hasSetFields[8] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.C2cUploadOptions setBigfile(com.tencent.mars.cdn.proto.BigfileOptions bigfileOptions) {
        this.bigfile = bigfileOptions;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.C2cUploadOptions setEnableHitcheck(boolean z17) {
        this.enable_hitcheck = z17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.C2cUploadOptions setFilemd5(java.lang.String str) {
        this.filemd5 = str;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.C2cUploadOptions setOnlyHitcheck(boolean z17) {
        this.only_hitcheck = z17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.C2cUploadOptions setSendmsgData(com.tencent.mm.protobuf.g gVar) {
        this.sendmsg_data = gVar;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.C2cUploadOptions setSendmsgViaCdn(boolean z17) {
        this.sendmsg_via_cdn = z17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.C2cUploadOptions setTouser(java.lang.String str) {
        this.touser = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.C2cUploadOptions mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.C2cUploadOptions parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.C2cUploadOptions) super.parseFrom(bArr);
    }
}
