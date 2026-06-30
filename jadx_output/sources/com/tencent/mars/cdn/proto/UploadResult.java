package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class UploadResult extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.UploadResult DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.UploadResult();
    private com.tencent.mars.cdn.proto.AppendPut.Result append;
    private int apptype;
    private com.tencent.mars.cdn.proto.BaseResult base;
    private com.tencent.mars.cdn.proto.BatchUpload.Result batch;
    private int bizid;
    private com.tencent.mars.cdn.proto.C2cResult c2c;
    private com.tencent.mars.cdn.proto.Cost cost;
    private com.tencent.mars.cdn.proto.EmbedUpload.Result embed;
    private int error_code;
    private java.lang.String error_msg;
    private int error_type;
    private java.lang.String filekey;
    private int filetype;
    private com.tencent.mars.cdn.proto.NetworkProfile network;
    private com.tencent.mars.cdn.proto.SnsResult sns;
    private com.tencent.mars.cdn.proto.TransforProfile transfor;
    private java.util.LinkedList<com.tencent.mars.cdn.proto.FileStat> files = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[18];

    public static com.tencent.mars.cdn.proto.UploadResult create() {
        return new com.tencent.mars.cdn.proto.UploadResult();
    }

    public static com.tencent.mars.cdn.proto.UploadResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.UploadResult newBuilder() {
        return new com.tencent.mars.cdn.proto.UploadResult();
    }

    public com.tencent.mars.cdn.proto.UploadResult addAllElementFiles(java.util.Collection<com.tencent.mars.cdn.proto.FileStat> collection) {
        this.files.addAll(collection);
        this.hasSetFields[11] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadResult addElementFiles(com.tencent.mars.cdn.proto.FileStat fileStat) {
        this.files.add(fileStat);
        this.hasSetFields[11] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadResult build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.UploadResult)) {
            return false;
        }
        com.tencent.mars.cdn.proto.UploadResult uploadResult = (com.tencent.mars.cdn.proto.UploadResult) fVar;
        return n51.f.a(this.filekey, uploadResult.filekey) && n51.f.a(java.lang.Integer.valueOf(this.bizid), java.lang.Integer.valueOf(uploadResult.bizid)) && n51.f.a(java.lang.Integer.valueOf(this.apptype), java.lang.Integer.valueOf(uploadResult.apptype)) && n51.f.a(java.lang.Integer.valueOf(this.filetype), java.lang.Integer.valueOf(uploadResult.filetype)) && n51.f.a(java.lang.Integer.valueOf(this.error_type), java.lang.Integer.valueOf(uploadResult.error_type)) && n51.f.a(java.lang.Integer.valueOf(this.error_code), java.lang.Integer.valueOf(uploadResult.error_code)) && n51.f.a(this.error_msg, uploadResult.error_msg) && n51.f.a(this.base, uploadResult.base) && n51.f.a(this.c2c, uploadResult.c2c) && n51.f.a(this.sns, uploadResult.sns) && n51.f.a(this.files, uploadResult.files) && n51.f.a(this.batch, uploadResult.batch) && n51.f.a(this.embed, uploadResult.embed) && n51.f.a(this.append, uploadResult.append) && n51.f.a(this.cost, uploadResult.cost) && n51.f.a(this.network, uploadResult.network) && n51.f.a(this.transfor, uploadResult.transfor);
    }

    public com.tencent.mars.cdn.proto.AppendPut.Result getAppend() {
        return this.hasSetFields[14] ? this.append : com.tencent.mars.cdn.proto.AppendPut.Result.create();
    }

    public int getApptype() {
        return this.apptype;
    }

    public com.tencent.mars.cdn.proto.BaseResult getBase() {
        return this.hasSetFields[8] ? this.base : com.tencent.mars.cdn.proto.BaseResult.create();
    }

    public com.tencent.mars.cdn.proto.BatchUpload.Result getBatch() {
        return this.hasSetFields[12] ? this.batch : com.tencent.mars.cdn.proto.BatchUpload.Result.create();
    }

    public int getBizid() {
        return this.bizid;
    }

    public com.tencent.mars.cdn.proto.C2cResult getC2c() {
        return this.hasSetFields[9] ? this.c2c : com.tencent.mars.cdn.proto.C2cResult.create();
    }

    public com.tencent.mars.cdn.proto.Cost getCost() {
        return this.hasSetFields[15] ? this.cost : com.tencent.mars.cdn.proto.Cost.create();
    }

    public com.tencent.mars.cdn.proto.EmbedUpload.Result getEmbed() {
        return this.hasSetFields[13] ? this.embed : com.tencent.mars.cdn.proto.EmbedUpload.Result.create();
    }

    public int getErrorCode() {
        return this.error_code;
    }

    public java.lang.String getErrorMsg() {
        return this.hasSetFields[7] ? this.error_msg : "";
    }

    public int getErrorType() {
        return this.error_type;
    }

    public java.lang.String getFilekey() {
        return this.hasSetFields[1] ? this.filekey : "";
    }

    public java.util.LinkedList<com.tencent.mars.cdn.proto.FileStat> getFiles() {
        return this.files;
    }

    public int getFiletype() {
        return this.filetype;
    }

    public com.tencent.mars.cdn.proto.NetworkProfile getNetwork() {
        return this.hasSetFields[16] ? this.network : com.tencent.mars.cdn.proto.NetworkProfile.create();
    }

    public com.tencent.mars.cdn.proto.SnsResult getSns() {
        return this.hasSetFields[10] ? this.sns : com.tencent.mars.cdn.proto.SnsResult.create();
    }

    public com.tencent.mars.cdn.proto.TransforProfile getTransfor() {
        return this.hasSetFields[17] ? this.transfor : com.tencent.mars.cdn.proto.TransforProfile.create();
    }

    public boolean hasAppend() {
        return hasFieldNumber(14);
    }

    public boolean hasApptype() {
        return hasFieldNumber(3);
    }

    public boolean hasBase() {
        return hasFieldNumber(8);
    }

    public boolean hasBatch() {
        return hasFieldNumber(12);
    }

    public boolean hasBizid() {
        return hasFieldNumber(2);
    }

    public boolean hasC2c() {
        return hasFieldNumber(9);
    }

    public boolean hasCost() {
        return hasFieldNumber(15);
    }

    public boolean hasEmbed() {
        return hasFieldNumber(13);
    }

    public boolean hasErrorCode() {
        return hasFieldNumber(6);
    }

    public boolean hasErrorMsg() {
        return hasFieldNumber(7);
    }

    public boolean hasErrorType() {
        return hasFieldNumber(5);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasFilekey() {
        return hasFieldNumber(1);
    }

    public boolean hasFiles() {
        return hasFieldNumber(11);
    }

    public boolean hasFiletype() {
        return hasFieldNumber(4);
    }

    public boolean hasNetwork() {
        return hasFieldNumber(16);
    }

    public boolean hasSns() {
        return hasFieldNumber(10);
    }

    public boolean hasTransfor() {
        return hasFieldNumber(17);
    }

    public com.tencent.mars.cdn.proto.UploadResult mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.UploadResult();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.filekey;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.bizid);
            }
            if (this.hasSetFields[3]) {
                fVar.e(3, this.apptype);
            }
            if (this.hasSetFields[4]) {
                fVar.e(4, this.filetype);
            }
            if (this.hasSetFields[5]) {
                fVar.e(5, this.error_type);
            }
            if (this.hasSetFields[6]) {
                fVar.e(6, this.error_code);
            }
            java.lang.String str2 = this.error_msg;
            if (str2 != null && this.hasSetFields[7]) {
                fVar.j(7, str2);
            }
            com.tencent.mars.cdn.proto.BaseResult baseResult = this.base;
            if (baseResult != null && this.hasSetFields[8]) {
                fVar.i(8, baseResult.computeSize());
                this.base.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.C2cResult c2cResult = this.c2c;
            if (c2cResult != null && this.hasSetFields[9]) {
                fVar.i(9, c2cResult.computeSize());
                this.c2c.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.SnsResult snsResult = this.sns;
            if (snsResult != null && this.hasSetFields[10]) {
                fVar.i(10, snsResult.computeSize());
                this.sns.writeFields(fVar);
            }
            fVar.g(11, 8, this.files);
            com.tencent.mars.cdn.proto.BatchUpload.Result result = this.batch;
            if (result != null && this.hasSetFields[12]) {
                fVar.i(12, result.computeSize());
                this.batch.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.EmbedUpload.Result result2 = this.embed;
            if (result2 != null && this.hasSetFields[13]) {
                fVar.i(13, result2.computeSize());
                this.embed.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.AppendPut.Result result3 = this.append;
            if (result3 != null && this.hasSetFields[14]) {
                fVar.i(14, result3.computeSize());
                this.append.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.Cost cost = this.cost;
            if (cost != null && this.hasSetFields[15]) {
                fVar.i(15, cost.computeSize());
                this.cost.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.NetworkProfile networkProfile = this.network;
            if (networkProfile != null && this.hasSetFields[16]) {
                fVar.i(16, networkProfile.computeSize());
                this.network.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.TransforProfile transforProfile = this.transfor;
            if (transforProfile != null && this.hasSetFields[17]) {
                fVar.i(17, transforProfile.computeSize());
                this.transfor.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.filekey;
            if (str3 != null && this.hasSetFields[1]) {
                i18 = b36.f.j(1, str3) + 0;
            }
            if (this.hasSetFields[2]) {
                i18 += b36.f.e(2, this.bizid);
            }
            if (this.hasSetFields[3]) {
                i18 += b36.f.e(3, this.apptype);
            }
            if (this.hasSetFields[4]) {
                i18 += b36.f.e(4, this.filetype);
            }
            if (this.hasSetFields[5]) {
                i18 += b36.f.e(5, this.error_type);
            }
            if (this.hasSetFields[6]) {
                i18 += b36.f.e(6, this.error_code);
            }
            java.lang.String str4 = this.error_msg;
            if (str4 != null && this.hasSetFields[7]) {
                i18 += b36.f.j(7, str4);
            }
            com.tencent.mars.cdn.proto.BaseResult baseResult2 = this.base;
            if (baseResult2 != null && this.hasSetFields[8]) {
                i18 += b36.f.i(8, baseResult2.computeSize());
            }
            com.tencent.mars.cdn.proto.C2cResult c2cResult2 = this.c2c;
            if (c2cResult2 != null && this.hasSetFields[9]) {
                i18 += b36.f.i(9, c2cResult2.computeSize());
            }
            com.tencent.mars.cdn.proto.SnsResult snsResult2 = this.sns;
            if (snsResult2 != null && this.hasSetFields[10]) {
                i18 += b36.f.i(10, snsResult2.computeSize());
            }
            int g17 = i18 + b36.f.g(11, 8, this.files);
            com.tencent.mars.cdn.proto.BatchUpload.Result result4 = this.batch;
            if (result4 != null && this.hasSetFields[12]) {
                g17 += b36.f.i(12, result4.computeSize());
            }
            com.tencent.mars.cdn.proto.EmbedUpload.Result result5 = this.embed;
            if (result5 != null && this.hasSetFields[13]) {
                g17 += b36.f.i(13, result5.computeSize());
            }
            com.tencent.mars.cdn.proto.AppendPut.Result result6 = this.append;
            if (result6 != null && this.hasSetFields[14]) {
                g17 += b36.f.i(14, result6.computeSize());
            }
            com.tencent.mars.cdn.proto.Cost cost2 = this.cost;
            if (cost2 != null && this.hasSetFields[15]) {
                g17 += b36.f.i(15, cost2.computeSize());
            }
            com.tencent.mars.cdn.proto.NetworkProfile networkProfile2 = this.network;
            if (networkProfile2 != null && this.hasSetFields[16]) {
                g17 += b36.f.i(16, networkProfile2.computeSize());
            }
            com.tencent.mars.cdn.proto.TransforProfile transforProfile2 = this.transfor;
            return (transforProfile2 == null || !this.hasSetFields[17]) ? g17 : g17 + b36.f.i(17, transforProfile2.computeSize());
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
        switch (intValue) {
            case 1:
                this.filekey = aVar2.k(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.bizid = aVar2.g(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.apptype = aVar2.g(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.filetype = aVar2.g(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.error_type = aVar2.g(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.error_code = aVar2.g(intValue);
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.error_msg = aVar2.k(intValue);
                this.hasSetFields[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.mars.cdn.proto.BaseResult baseResult3 = new com.tencent.mars.cdn.proto.BaseResult();
                    if (bArr != null && bArr.length > 0) {
                        baseResult3.parseFrom(bArr);
                    }
                    this.base = baseResult3;
                }
                this.hasSetFields[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.mars.cdn.proto.C2cResult c2cResult3 = new com.tencent.mars.cdn.proto.C2cResult();
                    if (bArr2 != null && bArr2.length > 0) {
                        c2cResult3.parseFrom(bArr2);
                    }
                    this.c2c = c2cResult3;
                }
                this.hasSetFields[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.tencent.mars.cdn.proto.SnsResult snsResult3 = new com.tencent.mars.cdn.proto.SnsResult();
                    if (bArr3 != null && bArr3.length > 0) {
                        snsResult3.parseFrom(bArr3);
                    }
                    this.sns = snsResult3;
                }
                this.hasSetFields[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    com.tencent.mars.cdn.proto.FileStat fileStat = new com.tencent.mars.cdn.proto.FileStat();
                    if (bArr4 != null && bArr4.length > 0) {
                        fileStat.parseFrom(bArr4);
                    }
                    this.files.add(fileStat);
                }
                this.hasSetFields[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    com.tencent.mars.cdn.proto.BatchUpload.Result result7 = new com.tencent.mars.cdn.proto.BatchUpload.Result();
                    if (bArr5 != null && bArr5.length > 0) {
                        result7.parseFrom(bArr5);
                    }
                    this.batch = result7;
                }
                this.hasSetFields[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    com.tencent.mars.cdn.proto.EmbedUpload.Result result8 = new com.tencent.mars.cdn.proto.EmbedUpload.Result();
                    if (bArr6 != null && bArr6.length > 0) {
                        result8.parseFrom(bArr6);
                    }
                    this.embed = result8;
                }
                this.hasSetFields[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    com.tencent.mars.cdn.proto.AppendPut.Result result9 = new com.tencent.mars.cdn.proto.AppendPut.Result();
                    if (bArr7 != null && bArr7.length > 0) {
                        result9.parseFrom(bArr7);
                    }
                    this.append = result9;
                }
                this.hasSetFields[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    com.tencent.mars.cdn.proto.Cost cost3 = new com.tencent.mars.cdn.proto.Cost();
                    if (bArr8 != null && bArr8.length > 0) {
                        cost3.parseFrom(bArr8);
                    }
                    this.cost = cost3;
                }
                this.hasSetFields[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    com.tencent.mars.cdn.proto.NetworkProfile networkProfile3 = new com.tencent.mars.cdn.proto.NetworkProfile();
                    if (bArr9 != null && bArr9.length > 0) {
                        networkProfile3.parseFrom(bArr9);
                    }
                    this.network = networkProfile3;
                }
                this.hasSetFields[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    com.tencent.mars.cdn.proto.TransforProfile transforProfile3 = new com.tencent.mars.cdn.proto.TransforProfile();
                    if (bArr10 != null && bArr10.length > 0) {
                        transforProfile3.parseFrom(bArr10);
                    }
                    this.transfor = transforProfile3;
                }
                this.hasSetFields[17] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mars.cdn.proto.UploadResult setAppend(com.tencent.mars.cdn.proto.AppendPut.Result result) {
        this.append = result;
        this.hasSetFields[14] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadResult setApptype(int i17) {
        this.apptype = i17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadResult setBase(com.tencent.mars.cdn.proto.BaseResult baseResult) {
        this.base = baseResult;
        this.hasSetFields[8] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadResult setBatch(com.tencent.mars.cdn.proto.BatchUpload.Result result) {
        this.batch = result;
        this.hasSetFields[12] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadResult setBizid(int i17) {
        this.bizid = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadResult setC2c(com.tencent.mars.cdn.proto.C2cResult c2cResult) {
        this.c2c = c2cResult;
        this.hasSetFields[9] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadResult setCost(com.tencent.mars.cdn.proto.Cost cost) {
        this.cost = cost;
        this.hasSetFields[15] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadResult setEmbed(com.tencent.mars.cdn.proto.EmbedUpload.Result result) {
        this.embed = result;
        this.hasSetFields[13] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadResult setErrorCode(int i17) {
        this.error_code = i17;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadResult setErrorMsg(java.lang.String str) {
        this.error_msg = str;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadResult setErrorType(int i17) {
        this.error_type = i17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadResult setFilekey(java.lang.String str) {
        this.filekey = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadResult setFiles(java.util.LinkedList<com.tencent.mars.cdn.proto.FileStat> linkedList) {
        this.files = linkedList;
        this.hasSetFields[11] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadResult setFiletype(int i17) {
        this.filetype = i17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadResult setNetwork(com.tencent.mars.cdn.proto.NetworkProfile networkProfile) {
        this.network = networkProfile;
        this.hasSetFields[16] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadResult setSns(com.tencent.mars.cdn.proto.SnsResult snsResult) {
        this.sns = snsResult;
        this.hasSetFields[10] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadResult setTransfor(com.tencent.mars.cdn.proto.TransforProfile transforProfile) {
        this.transfor = transforProfile;
        this.hasSetFields[17] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadResult mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.UploadResult parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.UploadResult) super.parseFrom(bArr);
    }
}
