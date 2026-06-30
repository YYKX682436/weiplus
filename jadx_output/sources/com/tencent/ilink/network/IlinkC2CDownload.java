package com.tencent.ilink.network;

/* loaded from: classes8.dex */
public class IlinkC2CDownload extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.network.IlinkC2CDownload DEFAULT_INSTANCE = new com.tencent.ilink.network.IlinkC2CDownload();
    private com.tencent.mm.protobuf.g aeskey;
    private int app_type;
    private int bizid;
    private int concurrent_count;
    private java.lang.String debugip;
    private int download_mode;
    private java.lang.String file_path;
    private long file_size;
    private int file_type;
    private java.lang.String file_url;
    private com.tencent.mm.protobuf.g fileid;
    private boolean need_report;
    private long sns_decrypt_key;
    private java.lang.String task_ident;
    private java.util.LinkedList<com.tencent.ilink.network.IlinkCustomHttpHeader> custom_headers = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[16];

    public static com.tencent.ilink.network.IlinkC2CDownload create() {
        return new com.tencent.ilink.network.IlinkC2CDownload();
    }

    public static com.tencent.ilink.network.IlinkC2CDownload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.network.IlinkC2CDownload newBuilder() {
        return new com.tencent.ilink.network.IlinkC2CDownload();
    }

    public com.tencent.ilink.network.IlinkC2CDownload addAllElementCustomHeaders(java.util.Collection<com.tencent.ilink.network.IlinkCustomHttpHeader> collection) {
        this.custom_headers.addAll(collection);
        this.hasSetFields[12] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownload addElementCustomHeaders(com.tencent.ilink.network.IlinkCustomHttpHeader ilinkCustomHttpHeader) {
        this.custom_headers.add(ilinkCustomHttpHeader);
        this.hasSetFields[12] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownload build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.network.IlinkC2CDownload)) {
            return false;
        }
        com.tencent.ilink.network.IlinkC2CDownload ilinkC2CDownload = (com.tencent.ilink.network.IlinkC2CDownload) fVar;
        return n51.f.a(this.task_ident, ilinkC2CDownload.task_ident) && n51.f.a(java.lang.Integer.valueOf(this.file_type), java.lang.Integer.valueOf(ilinkC2CDownload.file_type)) && n51.f.a(this.file_path, ilinkC2CDownload.file_path) && n51.f.a(java.lang.Long.valueOf(this.file_size), java.lang.Long.valueOf(ilinkC2CDownload.file_size)) && n51.f.a(this.file_url, ilinkC2CDownload.file_url) && n51.f.a(this.aeskey, ilinkC2CDownload.aeskey) && n51.f.a(this.fileid, ilinkC2CDownload.fileid) && n51.f.a(java.lang.Integer.valueOf(this.concurrent_count), java.lang.Integer.valueOf(ilinkC2CDownload.concurrent_count)) && n51.f.a(java.lang.Integer.valueOf(this.bizid), java.lang.Integer.valueOf(ilinkC2CDownload.bizid)) && n51.f.a(java.lang.Integer.valueOf(this.app_type), java.lang.Integer.valueOf(ilinkC2CDownload.app_type)) && n51.f.a(java.lang.Integer.valueOf(this.download_mode), java.lang.Integer.valueOf(ilinkC2CDownload.download_mode)) && n51.f.a(this.custom_headers, ilinkC2CDownload.custom_headers) && n51.f.a(this.debugip, ilinkC2CDownload.debugip) && n51.f.a(java.lang.Boolean.valueOf(this.need_report), java.lang.Boolean.valueOf(ilinkC2CDownload.need_report)) && n51.f.a(java.lang.Long.valueOf(this.sns_decrypt_key), java.lang.Long.valueOf(ilinkC2CDownload.sns_decrypt_key));
    }

    public com.tencent.mm.protobuf.g getAeskey() {
        return this.hasSetFields[6] ? this.aeskey : com.tencent.mm.protobuf.g.f192155b;
    }

    public int getAppType() {
        return this.app_type;
    }

    public int getBizid() {
        return this.bizid;
    }

    public int getConcurrentCount() {
        return this.concurrent_count;
    }

    public java.util.LinkedList<com.tencent.ilink.network.IlinkCustomHttpHeader> getCustomHeaders() {
        return this.custom_headers;
    }

    public java.lang.String getDebugip() {
        return this.hasSetFields[13] ? this.debugip : "";
    }

    public int getDownloadMode() {
        return this.download_mode;
    }

    public java.lang.String getFilePath() {
        return this.hasSetFields[3] ? this.file_path : "";
    }

    public long getFileSize() {
        return this.file_size;
    }

    public int getFileType() {
        return this.file_type;
    }

    public java.lang.String getFileUrl() {
        return this.hasSetFields[5] ? this.file_url : "";
    }

    public com.tencent.mm.protobuf.g getFileid() {
        return this.hasSetFields[7] ? this.fileid : com.tencent.mm.protobuf.g.f192155b;
    }

    public boolean getNeedReport() {
        return this.need_report;
    }

    public long getSnsDecryptKey() {
        return this.sns_decrypt_key;
    }

    public java.lang.String getTaskIdent() {
        return this.hasSetFields[1] ? this.task_ident : "";
    }

    public boolean hasAeskey() {
        return hasFieldNumber(6);
    }

    public boolean hasAppType() {
        return hasFieldNumber(10);
    }

    public boolean hasBizid() {
        return hasFieldNumber(9);
    }

    public boolean hasConcurrentCount() {
        return hasFieldNumber(8);
    }

    public boolean hasCustomHeaders() {
        return hasFieldNumber(12);
    }

    public boolean hasDebugip() {
        return hasFieldNumber(13);
    }

    public boolean hasDownloadMode() {
        return hasFieldNumber(11);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasFilePath() {
        return hasFieldNumber(3);
    }

    public boolean hasFileSize() {
        return hasFieldNumber(4);
    }

    public boolean hasFileType() {
        return hasFieldNumber(2);
    }

    public boolean hasFileUrl() {
        return hasFieldNumber(5);
    }

    public boolean hasFileid() {
        return hasFieldNumber(7);
    }

    public boolean hasNeedReport() {
        return hasFieldNumber(14);
    }

    public boolean hasSnsDecryptKey() {
        return hasFieldNumber(15);
    }

    public boolean hasTaskIdent() {
        return hasFieldNumber(1);
    }

    public com.tencent.ilink.network.IlinkC2CDownload mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.network.IlinkC2CDownload();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.task_ident;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.file_type);
            }
            java.lang.String str2 = this.file_path;
            if (str2 != null && this.hasSetFields[3]) {
                fVar.j(3, str2);
            }
            if (this.hasSetFields[4]) {
                fVar.h(4, this.file_size);
            }
            java.lang.String str3 = this.file_url;
            if (str3 != null && this.hasSetFields[5]) {
                fVar.j(5, str3);
            }
            com.tencent.mm.protobuf.g gVar = this.aeskey;
            if (gVar != null && this.hasSetFields[6]) {
                fVar.b(6, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.fileid;
            if (gVar2 != null && this.hasSetFields[7]) {
                fVar.b(7, gVar2);
            }
            if (this.hasSetFields[8]) {
                fVar.e(8, this.concurrent_count);
            }
            if (this.hasSetFields[9]) {
                fVar.e(9, this.bizid);
            }
            if (this.hasSetFields[10]) {
                fVar.e(10, this.app_type);
            }
            if (this.hasSetFields[11]) {
                fVar.e(11, this.download_mode);
            }
            fVar.g(12, 8, this.custom_headers);
            java.lang.String str4 = this.debugip;
            if (str4 != null && this.hasSetFields[13]) {
                fVar.j(13, str4);
            }
            if (this.hasSetFields[14]) {
                fVar.a(14, this.need_report);
            }
            if (this.hasSetFields[15]) {
                fVar.h(15, this.sns_decrypt_key);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.task_ident;
            if (str5 != null && this.hasSetFields[1]) {
                i18 = b36.f.j(1, str5) + 0;
            }
            if (this.hasSetFields[2]) {
                i18 += b36.f.e(2, this.file_type);
            }
            java.lang.String str6 = this.file_path;
            if (str6 != null && this.hasSetFields[3]) {
                i18 += b36.f.j(3, str6);
            }
            if (this.hasSetFields[4]) {
                i18 += b36.f.h(4, this.file_size);
            }
            java.lang.String str7 = this.file_url;
            if (str7 != null && this.hasSetFields[5]) {
                i18 += b36.f.j(5, str7);
            }
            com.tencent.mm.protobuf.g gVar3 = this.aeskey;
            if (gVar3 != null && this.hasSetFields[6]) {
                i18 += b36.f.b(6, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.fileid;
            if (gVar4 != null && this.hasSetFields[7]) {
                i18 += b36.f.b(7, gVar4);
            }
            if (this.hasSetFields[8]) {
                i18 += b36.f.e(8, this.concurrent_count);
            }
            if (this.hasSetFields[9]) {
                i18 += b36.f.e(9, this.bizid);
            }
            if (this.hasSetFields[10]) {
                i18 += b36.f.e(10, this.app_type);
            }
            if (this.hasSetFields[11]) {
                i18 += b36.f.e(11, this.download_mode);
            }
            int g17 = i18 + b36.f.g(12, 8, this.custom_headers);
            java.lang.String str8 = this.debugip;
            if (str8 != null && this.hasSetFields[13]) {
                g17 += b36.f.j(13, str8);
            }
            if (this.hasSetFields[14]) {
                g17 += b36.f.a(14, this.need_report);
            }
            return this.hasSetFields[15] ? g17 + b36.f.h(15, this.sns_decrypt_key) : g17;
        }
        if (i17 == 2) {
            this.custom_headers.clear();
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
                this.task_ident = aVar2.k(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.file_type = aVar2.g(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.file_path = aVar2.k(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.file_size = aVar2.i(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.file_url = aVar2.k(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.aeskey = aVar2.d(intValue);
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.fileid = aVar2.d(intValue);
                this.hasSetFields[7] = true;
                return 0;
            case 8:
                this.concurrent_count = aVar2.g(intValue);
                this.hasSetFields[8] = true;
                return 0;
            case 9:
                this.bizid = aVar2.g(intValue);
                this.hasSetFields[9] = true;
                return 0;
            case 10:
                this.app_type = aVar2.g(intValue);
                this.hasSetFields[10] = true;
                return 0;
            case 11:
                this.download_mode = aVar2.g(intValue);
                this.hasSetFields[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.ilink.network.IlinkCustomHttpHeader ilinkCustomHttpHeader = new com.tencent.ilink.network.IlinkCustomHttpHeader();
                    if (bArr != null && bArr.length > 0) {
                        ilinkCustomHttpHeader.parseFrom(bArr);
                    }
                    this.custom_headers.add(ilinkCustomHttpHeader);
                }
                this.hasSetFields[12] = true;
                return 0;
            case 13:
                this.debugip = aVar2.k(intValue);
                this.hasSetFields[13] = true;
                return 0;
            case 14:
                this.need_report = aVar2.c(intValue);
                this.hasSetFields[14] = true;
                return 0;
            case 15:
                this.sns_decrypt_key = aVar2.i(intValue);
                this.hasSetFields[15] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.ilink.network.IlinkC2CDownload setAeskey(com.tencent.mm.protobuf.g gVar) {
        this.aeskey = gVar;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownload setAppType(int i17) {
        this.app_type = i17;
        this.hasSetFields[10] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownload setBizid(int i17) {
        this.bizid = i17;
        this.hasSetFields[9] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownload setConcurrentCount(int i17) {
        this.concurrent_count = i17;
        this.hasSetFields[8] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownload setCustomHeaders(java.util.LinkedList<com.tencent.ilink.network.IlinkCustomHttpHeader> linkedList) {
        this.custom_headers = linkedList;
        this.hasSetFields[12] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownload setDebugip(java.lang.String str) {
        this.debugip = str;
        this.hasSetFields[13] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownload setDownloadMode(int i17) {
        this.download_mode = i17;
        this.hasSetFields[11] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownload setFilePath(java.lang.String str) {
        this.file_path = str;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownload setFileSize(long j17) {
        this.file_size = j17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownload setFileType(int i17) {
        this.file_type = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownload setFileUrl(java.lang.String str) {
        this.file_url = str;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownload setFileid(com.tencent.mm.protobuf.g gVar) {
        this.fileid = gVar;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownload setNeedReport(boolean z17) {
        this.need_report = z17;
        this.hasSetFields[14] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownload setSnsDecryptKey(long j17) {
        this.sns_decrypt_key = j17;
        this.hasSetFields[15] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownload setTaskIdent(java.lang.String str) {
        this.task_ident = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownload mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.network.IlinkC2CDownload parseFrom(byte[] bArr) {
        return (com.tencent.ilink.network.IlinkC2CDownload) super.parseFrom(bArr);
    }
}
