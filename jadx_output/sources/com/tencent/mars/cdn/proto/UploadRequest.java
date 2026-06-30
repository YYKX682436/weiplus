package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class UploadRequest extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.UploadRequest DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.UploadRequest();
    private com.tencent.mars.cdn.proto.AppendPut.Request append_task;
    private int apptype;
    private com.tencent.mars.cdn.proto.Base base;
    private com.tencent.mars.cdn.proto.BatchUpload.Request batch_task;
    private int bizid;
    private com.tencent.mars.cdn.proto.C2cUploadOptions c2c_opt;
    private com.tencent.mars.cdn.proto.EmbedUpload.Request embed_task;
    private java.lang.String filekey;
    private com.tencent.mars.cdn.proto.UploadFrom from;
    private com.tencent.mars.cdn.proto.FtnUploadOptions ftn_opt;
    private final boolean[] hasSetFields = new boolean[15];
    private com.tencent.mars.cdn.proto.SnsUploadOptions sns_opt;
    private com.tencent.mars.cdn.proto.BaseUploadOptions upload_opt;
    private java.lang.String uri;
    private com.tencent.mars.cdn.proto.VideoUploadOptions video_opt;

    public static com.tencent.mars.cdn.proto.UploadRequest create() {
        return new com.tencent.mars.cdn.proto.UploadRequest();
    }

    public static com.tencent.mars.cdn.proto.UploadRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.UploadRequest newBuilder() {
        return new com.tencent.mars.cdn.proto.UploadRequest();
    }

    public com.tencent.mars.cdn.proto.UploadRequest build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.UploadRequest)) {
            return false;
        }
        com.tencent.mars.cdn.proto.UploadRequest uploadRequest = (com.tencent.mars.cdn.proto.UploadRequest) fVar;
        return n51.f.a(this.filekey, uploadRequest.filekey) && n51.f.a(java.lang.Integer.valueOf(this.bizid), java.lang.Integer.valueOf(uploadRequest.bizid)) && n51.f.a(java.lang.Integer.valueOf(this.apptype), java.lang.Integer.valueOf(uploadRequest.apptype)) && n51.f.a(this.base, uploadRequest.base) && n51.f.a(this.from, uploadRequest.from) && n51.f.a(this.c2c_opt, uploadRequest.c2c_opt) && n51.f.a(this.sns_opt, uploadRequest.sns_opt) && n51.f.a(this.ftn_opt, uploadRequest.ftn_opt) && n51.f.a(this.video_opt, uploadRequest.video_opt) && n51.f.a(this.upload_opt, uploadRequest.upload_opt) && n51.f.a(this.embed_task, uploadRequest.embed_task) && n51.f.a(this.batch_task, uploadRequest.batch_task) && n51.f.a(this.append_task, uploadRequest.append_task) && n51.f.a(this.uri, uploadRequest.uri);
    }

    public com.tencent.mars.cdn.proto.AppendPut.Request getAppendTask() {
        return this.hasSetFields[13] ? this.append_task : com.tencent.mars.cdn.proto.AppendPut.Request.create();
    }

    public int getApptype() {
        return this.apptype;
    }

    public com.tencent.mars.cdn.proto.Base getBase() {
        return this.hasSetFields[4] ? this.base : com.tencent.mars.cdn.proto.Base.create();
    }

    public com.tencent.mars.cdn.proto.BatchUpload.Request getBatchTask() {
        return this.hasSetFields[12] ? this.batch_task : com.tencent.mars.cdn.proto.BatchUpload.Request.create();
    }

    public int getBizid() {
        return this.bizid;
    }

    public com.tencent.mars.cdn.proto.C2cUploadOptions getC2cOpt() {
        return this.hasSetFields[6] ? this.c2c_opt : com.tencent.mars.cdn.proto.C2cUploadOptions.create();
    }

    public com.tencent.mars.cdn.proto.EmbedUpload.Request getEmbedTask() {
        return this.hasSetFields[11] ? this.embed_task : com.tencent.mars.cdn.proto.EmbedUpload.Request.create();
    }

    public java.lang.String getFilekey() {
        return this.hasSetFields[1] ? this.filekey : "";
    }

    public com.tencent.mars.cdn.proto.UploadFrom getFrom() {
        return this.hasSetFields[5] ? this.from : com.tencent.mars.cdn.proto.UploadFrom.UPLOAD_FROM_UNSPECIFIED;
    }

    public com.tencent.mars.cdn.proto.FtnUploadOptions getFtnOpt() {
        return this.hasSetFields[8] ? this.ftn_opt : com.tencent.mars.cdn.proto.FtnUploadOptions.create();
    }

    public com.tencent.mars.cdn.proto.SnsUploadOptions getSnsOpt() {
        return this.hasSetFields[7] ? this.sns_opt : com.tencent.mars.cdn.proto.SnsUploadOptions.create();
    }

    public com.tencent.mars.cdn.proto.BaseUploadOptions getUploadOpt() {
        return this.hasSetFields[10] ? this.upload_opt : com.tencent.mars.cdn.proto.BaseUploadOptions.create();
    }

    public java.lang.String getUri() {
        return this.hasSetFields[14] ? this.uri : "";
    }

    public com.tencent.mars.cdn.proto.VideoUploadOptions getVideoOpt() {
        return this.hasSetFields[9] ? this.video_opt : com.tencent.mars.cdn.proto.VideoUploadOptions.create();
    }

    public boolean hasAppendTask() {
        return hasFieldNumber(13);
    }

    public boolean hasApptype() {
        return hasFieldNumber(3);
    }

    public boolean hasBase() {
        return hasFieldNumber(4);
    }

    public boolean hasBatchTask() {
        return hasFieldNumber(12);
    }

    public boolean hasBizid() {
        return hasFieldNumber(2);
    }

    public boolean hasC2cOpt() {
        return hasFieldNumber(6);
    }

    public boolean hasEmbedTask() {
        return hasFieldNumber(11);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasFilekey() {
        return hasFieldNumber(1);
    }

    public boolean hasFrom() {
        return hasFieldNumber(5);
    }

    public boolean hasFtnOpt() {
        return hasFieldNumber(8);
    }

    public boolean hasSnsOpt() {
        return hasFieldNumber(7);
    }

    public boolean hasUploadOpt() {
        return hasFieldNumber(10);
    }

    public boolean hasUri() {
        return hasFieldNumber(14);
    }

    public boolean hasVideoOpt() {
        return hasFieldNumber(9);
    }

    public com.tencent.mars.cdn.proto.UploadRequest mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.UploadRequest();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
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
            com.tencent.mars.cdn.proto.Base base = this.base;
            if (base != null && this.hasSetFields[4]) {
                fVar.i(4, base.computeSize());
                this.base.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.UploadFrom uploadFrom = this.from;
            if (uploadFrom != null && this.hasSetFields[5]) {
                fVar.e(5, uploadFrom.value);
            }
            com.tencent.mars.cdn.proto.C2cUploadOptions c2cUploadOptions = this.c2c_opt;
            if (c2cUploadOptions != null && this.hasSetFields[6]) {
                fVar.i(6, c2cUploadOptions.computeSize());
                this.c2c_opt.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.SnsUploadOptions snsUploadOptions = this.sns_opt;
            if (snsUploadOptions != null && this.hasSetFields[7]) {
                fVar.i(7, snsUploadOptions.computeSize());
                this.sns_opt.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.FtnUploadOptions ftnUploadOptions = this.ftn_opt;
            if (ftnUploadOptions != null && this.hasSetFields[8]) {
                fVar.i(8, ftnUploadOptions.computeSize());
                this.ftn_opt.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.VideoUploadOptions videoUploadOptions = this.video_opt;
            if (videoUploadOptions != null && this.hasSetFields[9]) {
                fVar.i(9, videoUploadOptions.computeSize());
                this.video_opt.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.BaseUploadOptions baseUploadOptions = this.upload_opt;
            if (baseUploadOptions != null && this.hasSetFields[10]) {
                fVar.i(10, baseUploadOptions.computeSize());
                this.upload_opt.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.EmbedUpload.Request request = this.embed_task;
            if (request != null && this.hasSetFields[11]) {
                fVar.i(11, request.computeSize());
                this.embed_task.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.BatchUpload.Request request2 = this.batch_task;
            if (request2 != null && this.hasSetFields[12]) {
                fVar.i(12, request2.computeSize());
                this.batch_task.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.AppendPut.Request request3 = this.append_task;
            if (request3 != null && this.hasSetFields[13]) {
                fVar.i(13, request3.computeSize());
                this.append_task.writeFields(fVar);
            }
            java.lang.String str2 = this.uri;
            if (str2 == null || !this.hasSetFields[14]) {
                return 0;
            }
            fVar.j(14, str2);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.filekey;
            int j17 = (str3 == null || !this.hasSetFields[1]) ? 0 : b36.f.j(1, str3) + 0;
            if (this.hasSetFields[2]) {
                j17 += b36.f.e(2, this.bizid);
            }
            if (this.hasSetFields[3]) {
                j17 += b36.f.e(3, this.apptype);
            }
            com.tencent.mars.cdn.proto.Base base2 = this.base;
            if (base2 != null && this.hasSetFields[4]) {
                j17 += b36.f.i(4, base2.computeSize());
            }
            com.tencent.mars.cdn.proto.UploadFrom uploadFrom2 = this.from;
            if (uploadFrom2 != null && this.hasSetFields[5]) {
                j17 += b36.f.e(5, uploadFrom2.value);
            }
            com.tencent.mars.cdn.proto.C2cUploadOptions c2cUploadOptions2 = this.c2c_opt;
            if (c2cUploadOptions2 != null && this.hasSetFields[6]) {
                j17 += b36.f.i(6, c2cUploadOptions2.computeSize());
            }
            com.tencent.mars.cdn.proto.SnsUploadOptions snsUploadOptions2 = this.sns_opt;
            if (snsUploadOptions2 != null && this.hasSetFields[7]) {
                j17 += b36.f.i(7, snsUploadOptions2.computeSize());
            }
            com.tencent.mars.cdn.proto.FtnUploadOptions ftnUploadOptions2 = this.ftn_opt;
            if (ftnUploadOptions2 != null && this.hasSetFields[8]) {
                j17 += b36.f.i(8, ftnUploadOptions2.computeSize());
            }
            com.tencent.mars.cdn.proto.VideoUploadOptions videoUploadOptions2 = this.video_opt;
            if (videoUploadOptions2 != null && this.hasSetFields[9]) {
                j17 += b36.f.i(9, videoUploadOptions2.computeSize());
            }
            com.tencent.mars.cdn.proto.BaseUploadOptions baseUploadOptions2 = this.upload_opt;
            if (baseUploadOptions2 != null && this.hasSetFields[10]) {
                j17 += b36.f.i(10, baseUploadOptions2.computeSize());
            }
            com.tencent.mars.cdn.proto.EmbedUpload.Request request4 = this.embed_task;
            if (request4 != null && this.hasSetFields[11]) {
                j17 += b36.f.i(11, request4.computeSize());
            }
            com.tencent.mars.cdn.proto.BatchUpload.Request request5 = this.batch_task;
            if (request5 != null && this.hasSetFields[12]) {
                j17 += b36.f.i(12, request5.computeSize());
            }
            com.tencent.mars.cdn.proto.AppendPut.Request request6 = this.append_task;
            if (request6 != null && this.hasSetFields[13]) {
                j17 += b36.f.i(13, request6.computeSize());
            }
            java.lang.String str4 = this.uri;
            return (str4 == null || !this.hasSetFields[14]) ? j17 : j17 + b36.f.j(14, str4);
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
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.tencent.mars.cdn.proto.Base base3 = new com.tencent.mars.cdn.proto.Base();
                    if (bArr != null && bArr.length > 0) {
                        base3.parseFrom(bArr);
                    }
                    this.base = base3;
                }
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.from = com.tencent.mars.cdn.proto.UploadFrom.forNumber(aVar2.g(intValue));
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    com.tencent.mars.cdn.proto.C2cUploadOptions c2cUploadOptions3 = new com.tencent.mars.cdn.proto.C2cUploadOptions();
                    if (bArr2 != null && bArr2.length > 0) {
                        c2cUploadOptions3.parseFrom(bArr2);
                    }
                    this.c2c_opt = c2cUploadOptions3;
                }
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    com.tencent.mars.cdn.proto.SnsUploadOptions snsUploadOptions3 = new com.tencent.mars.cdn.proto.SnsUploadOptions();
                    if (bArr3 != null && bArr3.length > 0) {
                        snsUploadOptions3.parseFrom(bArr3);
                    }
                    this.sns_opt = snsUploadOptions3;
                }
                this.hasSetFields[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j28.get(i28);
                    com.tencent.mars.cdn.proto.FtnUploadOptions ftnUploadOptions3 = new com.tencent.mars.cdn.proto.FtnUploadOptions();
                    if (bArr4 != null && bArr4.length > 0) {
                        ftnUploadOptions3.parseFrom(bArr4);
                    }
                    this.ftn_opt = ftnUploadOptions3;
                }
                this.hasSetFields[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size5 = j29.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j29.get(i29);
                    com.tencent.mars.cdn.proto.VideoUploadOptions videoUploadOptions3 = new com.tencent.mars.cdn.proto.VideoUploadOptions();
                    if (bArr5 != null && bArr5.length > 0) {
                        videoUploadOptions3.parseFrom(bArr5);
                    }
                    this.video_opt = videoUploadOptions3;
                }
                this.hasSetFields[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size6 = j37.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j37.get(i37);
                    com.tencent.mars.cdn.proto.BaseUploadOptions baseUploadOptions3 = new com.tencent.mars.cdn.proto.BaseUploadOptions();
                    if (bArr6 != null && bArr6.length > 0) {
                        baseUploadOptions3.parseFrom(bArr6);
                    }
                    this.upload_opt = baseUploadOptions3;
                }
                this.hasSetFields[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size7 = j38.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j38.get(i38);
                    com.tencent.mars.cdn.proto.EmbedUpload.Request request7 = new com.tencent.mars.cdn.proto.EmbedUpload.Request();
                    if (bArr7 != null && bArr7.length > 0) {
                        request7.parseFrom(bArr7);
                    }
                    this.embed_task = request7;
                }
                this.hasSetFields[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size8 = j39.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j39.get(i39);
                    com.tencent.mars.cdn.proto.BatchUpload.Request request8 = new com.tencent.mars.cdn.proto.BatchUpload.Request();
                    if (bArr8 != null && bArr8.length > 0) {
                        request8.parseFrom(bArr8);
                    }
                    this.batch_task = request8;
                }
                this.hasSetFields[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size9 = j47.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr9 = (byte[]) j47.get(i47);
                    com.tencent.mars.cdn.proto.AppendPut.Request request9 = new com.tencent.mars.cdn.proto.AppendPut.Request();
                    if (bArr9 != null && bArr9.length > 0) {
                        request9.parseFrom(bArr9);
                    }
                    this.append_task = request9;
                }
                this.hasSetFields[13] = true;
                return 0;
            case 14:
                this.uri = aVar2.k(intValue);
                this.hasSetFields[14] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mars.cdn.proto.UploadRequest setAppendTask(com.tencent.mars.cdn.proto.AppendPut.Request request) {
        this.append_task = request;
        this.hasSetFields[13] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadRequest setApptype(int i17) {
        this.apptype = i17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadRequest setBase(com.tencent.mars.cdn.proto.Base base) {
        this.base = base;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadRequest setBatchTask(com.tencent.mars.cdn.proto.BatchUpload.Request request) {
        this.batch_task = request;
        this.hasSetFields[12] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadRequest setBizid(int i17) {
        this.bizid = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadRequest setC2cOpt(com.tencent.mars.cdn.proto.C2cUploadOptions c2cUploadOptions) {
        this.c2c_opt = c2cUploadOptions;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadRequest setEmbedTask(com.tencent.mars.cdn.proto.EmbedUpload.Request request) {
        this.embed_task = request;
        this.hasSetFields[11] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadRequest setFilekey(java.lang.String str) {
        this.filekey = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadRequest setFrom(com.tencent.mars.cdn.proto.UploadFrom uploadFrom) {
        this.from = uploadFrom;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadRequest setFtnOpt(com.tencent.mars.cdn.proto.FtnUploadOptions ftnUploadOptions) {
        this.ftn_opt = ftnUploadOptions;
        this.hasSetFields[8] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadRequest setSnsOpt(com.tencent.mars.cdn.proto.SnsUploadOptions snsUploadOptions) {
        this.sns_opt = snsUploadOptions;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadRequest setUploadOpt(com.tencent.mars.cdn.proto.BaseUploadOptions baseUploadOptions) {
        this.upload_opt = baseUploadOptions;
        this.hasSetFields[10] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadRequest setUri(java.lang.String str) {
        this.uri = str;
        this.hasSetFields[14] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadRequest setVideoOpt(com.tencent.mars.cdn.proto.VideoUploadOptions videoUploadOptions) {
        this.video_opt = videoUploadOptions;
        this.hasSetFields[9] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UploadRequest mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.UploadRequest parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.UploadRequest) super.parseFrom(bArr);
    }
}
