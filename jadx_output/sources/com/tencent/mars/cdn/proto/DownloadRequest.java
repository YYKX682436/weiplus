package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class DownloadRequest extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.DownloadRequest DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.DownloadRequest();
    private com.tencent.mars.cdn.proto.AppendGet.Request append_task;
    private int apptype;
    private com.tencent.mars.cdn.proto.Base base;
    private com.tencent.mars.cdn.proto.Behavior behavior;
    private int bizid;
    private com.tencent.mars.cdn.proto.FileIdDownload fileid_task;
    private java.lang.String filekey;
    private com.tencent.mars.cdn.proto.FinderVideoOptions finder_opt;
    private final boolean[] hasSetFields = new boolean[20];
    private com.tencent.mars.cdn.proto.HlsOptions hls_opt;
    private com.tencent.mars.cdn.proto.ImageOptions image_opt;
    private com.tencent.mars.cdn.proto.DownloadMode mode;
    private com.tencent.mars.cdn.proto.PreloadOptions preload_opt;
    private com.tencent.mars.cdn.proto.SnsOptions sns_opt;
    private com.tencent.mars.cdn.proto.Storage storage;
    private java.lang.String uri;
    private com.tencent.mars.cdn.proto.UrlOptions url_opt;
    private com.tencent.mars.cdn.proto.UrlDownload url_task;
    private com.tencent.mars.cdn.proto.DataVerify verify;
    private com.tencent.mars.cdn.proto.VideoOptions video_opt;

    public static com.tencent.mars.cdn.proto.DownloadRequest create() {
        return new com.tencent.mars.cdn.proto.DownloadRequest();
    }

    public static com.tencent.mars.cdn.proto.DownloadRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.DownloadRequest newBuilder() {
        return new com.tencent.mars.cdn.proto.DownloadRequest();
    }

    public com.tencent.mars.cdn.proto.DownloadRequest build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.DownloadRequest)) {
            return false;
        }
        com.tencent.mars.cdn.proto.DownloadRequest downloadRequest = (com.tencent.mars.cdn.proto.DownloadRequest) fVar;
        return n51.f.a(this.filekey, downloadRequest.filekey) && n51.f.a(java.lang.Integer.valueOf(this.bizid), java.lang.Integer.valueOf(downloadRequest.bizid)) && n51.f.a(java.lang.Integer.valueOf(this.apptype), java.lang.Integer.valueOf(downloadRequest.apptype)) && n51.f.a(this.base, downloadRequest.base) && n51.f.a(this.storage, downloadRequest.storage) && n51.f.a(this.mode, downloadRequest.mode) && n51.f.a(this.behavior, downloadRequest.behavior) && n51.f.a(this.image_opt, downloadRequest.image_opt) && n51.f.a(this.video_opt, downloadRequest.video_opt) && n51.f.a(this.sns_opt, downloadRequest.sns_opt) && n51.f.a(this.url_opt, downloadRequest.url_opt) && n51.f.a(this.verify, downloadRequest.verify) && n51.f.a(this.fileid_task, downloadRequest.fileid_task) && n51.f.a(this.url_task, downloadRequest.url_task) && n51.f.a(this.uri, downloadRequest.uri) && n51.f.a(this.append_task, downloadRequest.append_task) && n51.f.a(this.preload_opt, downloadRequest.preload_opt) && n51.f.a(this.hls_opt, downloadRequest.hls_opt) && n51.f.a(this.finder_opt, downloadRequest.finder_opt);
    }

    public com.tencent.mars.cdn.proto.AppendGet.Request getAppendTask() {
        return this.hasSetFields[16] ? this.append_task : com.tencent.mars.cdn.proto.AppendGet.Request.create();
    }

    public int getApptype() {
        return this.apptype;
    }

    public com.tencent.mars.cdn.proto.Base getBase() {
        return this.hasSetFields[4] ? this.base : com.tencent.mars.cdn.proto.Base.create();
    }

    public com.tencent.mars.cdn.proto.Behavior getBehavior() {
        return this.hasSetFields[7] ? this.behavior : com.tencent.mars.cdn.proto.Behavior.create();
    }

    public int getBizid() {
        return this.bizid;
    }

    public com.tencent.mars.cdn.proto.FileIdDownload getFileidTask() {
        return this.hasSetFields[13] ? this.fileid_task : com.tencent.mars.cdn.proto.FileIdDownload.create();
    }

    public java.lang.String getFilekey() {
        return this.hasSetFields[1] ? this.filekey : "";
    }

    public com.tencent.mars.cdn.proto.FinderVideoOptions getFinderOpt() {
        return this.hasSetFields[19] ? this.finder_opt : com.tencent.mars.cdn.proto.FinderVideoOptions.create();
    }

    public com.tencent.mars.cdn.proto.HlsOptions getHlsOpt() {
        return this.hasSetFields[18] ? this.hls_opt : com.tencent.mars.cdn.proto.HlsOptions.create();
    }

    public com.tencent.mars.cdn.proto.ImageOptions getImageOpt() {
        return this.hasSetFields[8] ? this.image_opt : com.tencent.mars.cdn.proto.ImageOptions.create();
    }

    public com.tencent.mars.cdn.proto.DownloadMode getMode() {
        return this.hasSetFields[6] ? this.mode : com.tencent.mars.cdn.proto.DownloadMode.DOWNLOAD_MODE_STORAGE;
    }

    public com.tencent.mars.cdn.proto.PreloadOptions getPreloadOpt() {
        return this.hasSetFields[17] ? this.preload_opt : com.tencent.mars.cdn.proto.PreloadOptions.create();
    }

    public com.tencent.mars.cdn.proto.SnsOptions getSnsOpt() {
        return this.hasSetFields[10] ? this.sns_opt : com.tencent.mars.cdn.proto.SnsOptions.create();
    }

    public com.tencent.mars.cdn.proto.Storage getStorage() {
        return this.hasSetFields[5] ? this.storage : com.tencent.mars.cdn.proto.Storage.create();
    }

    public java.lang.String getUri() {
        return this.hasSetFields[15] ? this.uri : "";
    }

    public com.tencent.mars.cdn.proto.UrlOptions getUrlOpt() {
        return this.hasSetFields[11] ? this.url_opt : com.tencent.mars.cdn.proto.UrlOptions.create();
    }

    public com.tencent.mars.cdn.proto.UrlDownload getUrlTask() {
        return this.hasSetFields[14] ? this.url_task : com.tencent.mars.cdn.proto.UrlDownload.create();
    }

    public com.tencent.mars.cdn.proto.DataVerify getVerify() {
        return this.hasSetFields[12] ? this.verify : com.tencent.mars.cdn.proto.DataVerify.create();
    }

    public com.tencent.mars.cdn.proto.VideoOptions getVideoOpt() {
        return this.hasSetFields[9] ? this.video_opt : com.tencent.mars.cdn.proto.VideoOptions.create();
    }

    public boolean hasAppendTask() {
        return hasFieldNumber(16);
    }

    public boolean hasApptype() {
        return hasFieldNumber(3);
    }

    public boolean hasBase() {
        return hasFieldNumber(4);
    }

    public boolean hasBehavior() {
        return hasFieldNumber(7);
    }

    public boolean hasBizid() {
        return hasFieldNumber(2);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasFileidTask() {
        return hasFieldNumber(13);
    }

    public boolean hasFilekey() {
        return hasFieldNumber(1);
    }

    public boolean hasFinderOpt() {
        return hasFieldNumber(19);
    }

    public boolean hasHlsOpt() {
        return hasFieldNumber(18);
    }

    public boolean hasImageOpt() {
        return hasFieldNumber(8);
    }

    public boolean hasMode() {
        return hasFieldNumber(6);
    }

    public boolean hasPreloadOpt() {
        return hasFieldNumber(17);
    }

    public boolean hasSnsOpt() {
        return hasFieldNumber(10);
    }

    public boolean hasStorage() {
        return hasFieldNumber(5);
    }

    public boolean hasUri() {
        return hasFieldNumber(15);
    }

    public boolean hasUrlOpt() {
        return hasFieldNumber(11);
    }

    public boolean hasUrlTask() {
        return hasFieldNumber(14);
    }

    public boolean hasVerify() {
        return hasFieldNumber(12);
    }

    public boolean hasVideoOpt() {
        return hasFieldNumber(9);
    }

    public com.tencent.mars.cdn.proto.DownloadRequest mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.DownloadRequest();
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
            com.tencent.mars.cdn.proto.Base base = this.base;
            if (base != null && this.hasSetFields[4]) {
                fVar.i(4, base.computeSize());
                this.base.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.Storage storage = this.storage;
            if (storage != null && this.hasSetFields[5]) {
                fVar.i(5, storage.computeSize());
                this.storage.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.DownloadMode downloadMode = this.mode;
            if (downloadMode != null && this.hasSetFields[6]) {
                fVar.e(6, downloadMode.value);
            }
            com.tencent.mars.cdn.proto.Behavior behavior = this.behavior;
            if (behavior != null && this.hasSetFields[7]) {
                fVar.i(7, behavior.computeSize());
                this.behavior.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.ImageOptions imageOptions = this.image_opt;
            if (imageOptions != null && this.hasSetFields[8]) {
                fVar.i(8, imageOptions.computeSize());
                this.image_opt.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.VideoOptions videoOptions = this.video_opt;
            if (videoOptions != null && this.hasSetFields[9]) {
                fVar.i(9, videoOptions.computeSize());
                this.video_opt.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.SnsOptions snsOptions = this.sns_opt;
            if (snsOptions != null && this.hasSetFields[10]) {
                fVar.i(10, snsOptions.computeSize());
                this.sns_opt.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.UrlOptions urlOptions = this.url_opt;
            if (urlOptions != null && this.hasSetFields[11]) {
                fVar.i(11, urlOptions.computeSize());
                this.url_opt.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.DataVerify dataVerify = this.verify;
            if (dataVerify != null && this.hasSetFields[12]) {
                fVar.i(12, dataVerify.computeSize());
                this.verify.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.FileIdDownload fileIdDownload = this.fileid_task;
            if (fileIdDownload != null && this.hasSetFields[13]) {
                fVar.i(13, fileIdDownload.computeSize());
                this.fileid_task.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.UrlDownload urlDownload = this.url_task;
            if (urlDownload != null && this.hasSetFields[14]) {
                fVar.i(14, urlDownload.computeSize());
                this.url_task.writeFields(fVar);
            }
            java.lang.String str2 = this.uri;
            if (str2 != null && this.hasSetFields[15]) {
                fVar.j(15, str2);
            }
            com.tencent.mars.cdn.proto.AppendGet.Request request = this.append_task;
            if (request != null && this.hasSetFields[16]) {
                fVar.i(16, request.computeSize());
                this.append_task.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.PreloadOptions preloadOptions = this.preload_opt;
            if (preloadOptions != null && this.hasSetFields[17]) {
                fVar.i(17, preloadOptions.computeSize());
                this.preload_opt.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.HlsOptions hlsOptions = this.hls_opt;
            if (hlsOptions != null && this.hasSetFields[18]) {
                fVar.i(18, hlsOptions.computeSize());
                this.hls_opt.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.FinderVideoOptions finderVideoOptions = this.finder_opt;
            if (finderVideoOptions != null && this.hasSetFields[19]) {
                fVar.i(19, finderVideoOptions.computeSize());
                this.finder_opt.writeFields(fVar);
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
            com.tencent.mars.cdn.proto.Base base2 = this.base;
            if (base2 != null && this.hasSetFields[4]) {
                i18 += b36.f.i(4, base2.computeSize());
            }
            com.tencent.mars.cdn.proto.Storage storage2 = this.storage;
            if (storage2 != null && this.hasSetFields[5]) {
                i18 += b36.f.i(5, storage2.computeSize());
            }
            com.tencent.mars.cdn.proto.DownloadMode downloadMode2 = this.mode;
            if (downloadMode2 != null && this.hasSetFields[6]) {
                i18 += b36.f.e(6, downloadMode2.value);
            }
            com.tencent.mars.cdn.proto.Behavior behavior2 = this.behavior;
            if (behavior2 != null && this.hasSetFields[7]) {
                i18 += b36.f.i(7, behavior2.computeSize());
            }
            com.tencent.mars.cdn.proto.ImageOptions imageOptions2 = this.image_opt;
            if (imageOptions2 != null && this.hasSetFields[8]) {
                i18 += b36.f.i(8, imageOptions2.computeSize());
            }
            com.tencent.mars.cdn.proto.VideoOptions videoOptions2 = this.video_opt;
            if (videoOptions2 != null && this.hasSetFields[9]) {
                i18 += b36.f.i(9, videoOptions2.computeSize());
            }
            com.tencent.mars.cdn.proto.SnsOptions snsOptions2 = this.sns_opt;
            if (snsOptions2 != null && this.hasSetFields[10]) {
                i18 += b36.f.i(10, snsOptions2.computeSize());
            }
            com.tencent.mars.cdn.proto.UrlOptions urlOptions2 = this.url_opt;
            if (urlOptions2 != null && this.hasSetFields[11]) {
                i18 += b36.f.i(11, urlOptions2.computeSize());
            }
            com.tencent.mars.cdn.proto.DataVerify dataVerify2 = this.verify;
            if (dataVerify2 != null && this.hasSetFields[12]) {
                i18 += b36.f.i(12, dataVerify2.computeSize());
            }
            com.tencent.mars.cdn.proto.FileIdDownload fileIdDownload2 = this.fileid_task;
            if (fileIdDownload2 != null && this.hasSetFields[13]) {
                i18 += b36.f.i(13, fileIdDownload2.computeSize());
            }
            com.tencent.mars.cdn.proto.UrlDownload urlDownload2 = this.url_task;
            if (urlDownload2 != null && this.hasSetFields[14]) {
                i18 += b36.f.i(14, urlDownload2.computeSize());
            }
            java.lang.String str4 = this.uri;
            if (str4 != null && this.hasSetFields[15]) {
                i18 += b36.f.j(15, str4);
            }
            com.tencent.mars.cdn.proto.AppendGet.Request request2 = this.append_task;
            if (request2 != null && this.hasSetFields[16]) {
                i18 += b36.f.i(16, request2.computeSize());
            }
            com.tencent.mars.cdn.proto.PreloadOptions preloadOptions2 = this.preload_opt;
            if (preloadOptions2 != null && this.hasSetFields[17]) {
                i18 += b36.f.i(17, preloadOptions2.computeSize());
            }
            com.tencent.mars.cdn.proto.HlsOptions hlsOptions2 = this.hls_opt;
            if (hlsOptions2 != null && this.hasSetFields[18]) {
                i18 += b36.f.i(18, hlsOptions2.computeSize());
            }
            com.tencent.mars.cdn.proto.FinderVideoOptions finderVideoOptions2 = this.finder_opt;
            return (finderVideoOptions2 == null || !this.hasSetFields[19]) ? i18 : i18 + b36.f.i(19, finderVideoOptions2.computeSize());
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
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.mars.cdn.proto.Storage storage3 = new com.tencent.mars.cdn.proto.Storage();
                    if (bArr2 != null && bArr2.length > 0) {
                        storage3.parseFrom(bArr2);
                    }
                    this.storage = storage3;
                }
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.mode = com.tencent.mars.cdn.proto.DownloadMode.forNumber(aVar2.g(intValue));
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.tencent.mars.cdn.proto.Behavior behavior3 = new com.tencent.mars.cdn.proto.Behavior();
                    if (bArr3 != null && bArr3.length > 0) {
                        behavior3.parseFrom(bArr3);
                    }
                    this.behavior = behavior3;
                }
                this.hasSetFields[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    com.tencent.mars.cdn.proto.ImageOptions imageOptions3 = new com.tencent.mars.cdn.proto.ImageOptions();
                    if (bArr4 != null && bArr4.length > 0) {
                        imageOptions3.parseFrom(bArr4);
                    }
                    this.image_opt = imageOptions3;
                }
                this.hasSetFields[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    com.tencent.mars.cdn.proto.VideoOptions videoOptions3 = new com.tencent.mars.cdn.proto.VideoOptions();
                    if (bArr5 != null && bArr5.length > 0) {
                        videoOptions3.parseFrom(bArr5);
                    }
                    this.video_opt = videoOptions3;
                }
                this.hasSetFields[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    com.tencent.mars.cdn.proto.SnsOptions snsOptions3 = new com.tencent.mars.cdn.proto.SnsOptions();
                    if (bArr6 != null && bArr6.length > 0) {
                        snsOptions3.parseFrom(bArr6);
                    }
                    this.sns_opt = snsOptions3;
                }
                this.hasSetFields[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    com.tencent.mars.cdn.proto.UrlOptions urlOptions3 = new com.tencent.mars.cdn.proto.UrlOptions();
                    if (bArr7 != null && bArr7.length > 0) {
                        urlOptions3.parseFrom(bArr7);
                    }
                    this.url_opt = urlOptions3;
                }
                this.hasSetFields[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    com.tencent.mars.cdn.proto.DataVerify dataVerify3 = new com.tencent.mars.cdn.proto.DataVerify();
                    if (bArr8 != null && bArr8.length > 0) {
                        dataVerify3.parseFrom(bArr8);
                    }
                    this.verify = dataVerify3;
                }
                this.hasSetFields[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    com.tencent.mars.cdn.proto.FileIdDownload fileIdDownload3 = new com.tencent.mars.cdn.proto.FileIdDownload();
                    if (bArr9 != null && bArr9.length > 0) {
                        fileIdDownload3.parseFrom(bArr9);
                    }
                    this.fileid_task = fileIdDownload3;
                }
                this.hasSetFields[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    com.tencent.mars.cdn.proto.UrlDownload urlDownload3 = new com.tencent.mars.cdn.proto.UrlDownload();
                    if (bArr10 != null && bArr10.length > 0) {
                        urlDownload3.parseFrom(bArr10);
                    }
                    this.url_task = urlDownload3;
                }
                this.hasSetFields[14] = true;
                return 0;
            case 15:
                this.uri = aVar2.k(intValue);
                this.hasSetFields[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    com.tencent.mars.cdn.proto.AppendGet.Request request3 = new com.tencent.mars.cdn.proto.AppendGet.Request();
                    if (bArr11 != null && bArr11.length > 0) {
                        request3.parseFrom(bArr11);
                    }
                    this.append_task = request3;
                }
                this.hasSetFields[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr12 = (byte[]) j49.get(i58);
                    com.tencent.mars.cdn.proto.PreloadOptions preloadOptions3 = new com.tencent.mars.cdn.proto.PreloadOptions();
                    if (bArr12 != null && bArr12.length > 0) {
                        preloadOptions3.parseFrom(bArr12);
                    }
                    this.preload_opt = preloadOptions3;
                }
                this.hasSetFields[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr13 = (byte[]) j57.get(i59);
                    com.tencent.mars.cdn.proto.HlsOptions hlsOptions3 = new com.tencent.mars.cdn.proto.HlsOptions();
                    if (bArr13 != null && bArr13.length > 0) {
                        hlsOptions3.parseFrom(bArr13);
                    }
                    this.hls_opt = hlsOptions3;
                }
                this.hasSetFields[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i66 = 0; i66 < size14; i66++) {
                    byte[] bArr14 = (byte[]) j58.get(i66);
                    com.tencent.mars.cdn.proto.FinderVideoOptions finderVideoOptions3 = new com.tencent.mars.cdn.proto.FinderVideoOptions();
                    if (bArr14 != null && bArr14.length > 0) {
                        finderVideoOptions3.parseFrom(bArr14);
                    }
                    this.finder_opt = finderVideoOptions3;
                }
                this.hasSetFields[19] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mars.cdn.proto.DownloadRequest setAppendTask(com.tencent.mars.cdn.proto.AppendGet.Request request) {
        this.append_task = request;
        this.hasSetFields[16] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadRequest setApptype(int i17) {
        this.apptype = i17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadRequest setBase(com.tencent.mars.cdn.proto.Base base) {
        this.base = base;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadRequest setBehavior(com.tencent.mars.cdn.proto.Behavior behavior) {
        this.behavior = behavior;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadRequest setBizid(int i17) {
        this.bizid = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadRequest setFileidTask(com.tencent.mars.cdn.proto.FileIdDownload fileIdDownload) {
        this.fileid_task = fileIdDownload;
        this.hasSetFields[13] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadRequest setFilekey(java.lang.String str) {
        this.filekey = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadRequest setFinderOpt(com.tencent.mars.cdn.proto.FinderVideoOptions finderVideoOptions) {
        this.finder_opt = finderVideoOptions;
        this.hasSetFields[19] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadRequest setHlsOpt(com.tencent.mars.cdn.proto.HlsOptions hlsOptions) {
        this.hls_opt = hlsOptions;
        this.hasSetFields[18] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadRequest setImageOpt(com.tencent.mars.cdn.proto.ImageOptions imageOptions) {
        this.image_opt = imageOptions;
        this.hasSetFields[8] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadRequest setMode(com.tencent.mars.cdn.proto.DownloadMode downloadMode) {
        this.mode = downloadMode;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadRequest setPreloadOpt(com.tencent.mars.cdn.proto.PreloadOptions preloadOptions) {
        this.preload_opt = preloadOptions;
        this.hasSetFields[17] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadRequest setSnsOpt(com.tencent.mars.cdn.proto.SnsOptions snsOptions) {
        this.sns_opt = snsOptions;
        this.hasSetFields[10] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadRequest setStorage(com.tencent.mars.cdn.proto.Storage storage) {
        this.storage = storage;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadRequest setUri(java.lang.String str) {
        this.uri = str;
        this.hasSetFields[15] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadRequest setUrlOpt(com.tencent.mars.cdn.proto.UrlOptions urlOptions) {
        this.url_opt = urlOptions;
        this.hasSetFields[11] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadRequest setUrlTask(com.tencent.mars.cdn.proto.UrlDownload urlDownload) {
        this.url_task = urlDownload;
        this.hasSetFields[14] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadRequest setVerify(com.tencent.mars.cdn.proto.DataVerify dataVerify) {
        this.verify = dataVerify;
        this.hasSetFields[12] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadRequest setVideoOpt(com.tencent.mars.cdn.proto.VideoOptions videoOptions) {
        this.video_opt = videoOptions;
        this.hasSetFields[9] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadRequest mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.DownloadRequest parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.DownloadRequest) super.parseFrom(bArr);
    }
}
