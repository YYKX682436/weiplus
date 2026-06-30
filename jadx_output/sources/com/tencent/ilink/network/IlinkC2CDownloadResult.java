package com.tencent.ilink.network;

/* loaded from: classes8.dex */
public class IlinkC2CDownloadResult extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.network.IlinkC2CDownloadResult DEFAULT_INSTANCE = new com.tencent.ilink.network.IlinkC2CDownloadResult();
    private long en_queuetime;
    private long end_time;
    private int error_code;
    private long file_size;
    private final boolean[] hasSetFields = new boolean[10];
    private long recved_bytes;
    private long start_time;
    private int svrfallback_count;
    private java.lang.String task_ident;
    private long trace_id;

    public static com.tencent.ilink.network.IlinkC2CDownloadResult create() {
        return new com.tencent.ilink.network.IlinkC2CDownloadResult();
    }

    public static com.tencent.ilink.network.IlinkC2CDownloadResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.network.IlinkC2CDownloadResult newBuilder() {
        return new com.tencent.ilink.network.IlinkC2CDownloadResult();
    }

    public com.tencent.ilink.network.IlinkC2CDownloadResult build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.network.IlinkC2CDownloadResult)) {
            return false;
        }
        com.tencent.ilink.network.IlinkC2CDownloadResult ilinkC2CDownloadResult = (com.tencent.ilink.network.IlinkC2CDownloadResult) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.error_code), java.lang.Integer.valueOf(ilinkC2CDownloadResult.error_code)) && n51.f.a(this.task_ident, ilinkC2CDownloadResult.task_ident) && n51.f.a(java.lang.Long.valueOf(this.file_size), java.lang.Long.valueOf(ilinkC2CDownloadResult.file_size)) && n51.f.a(java.lang.Long.valueOf(this.recved_bytes), java.lang.Long.valueOf(ilinkC2CDownloadResult.recved_bytes)) && n51.f.a(java.lang.Long.valueOf(this.en_queuetime), java.lang.Long.valueOf(ilinkC2CDownloadResult.en_queuetime)) && n51.f.a(java.lang.Long.valueOf(this.start_time), java.lang.Long.valueOf(ilinkC2CDownloadResult.start_time)) && n51.f.a(java.lang.Long.valueOf(this.end_time), java.lang.Long.valueOf(ilinkC2CDownloadResult.end_time)) && n51.f.a(java.lang.Integer.valueOf(this.svrfallback_count), java.lang.Integer.valueOf(ilinkC2CDownloadResult.svrfallback_count)) && n51.f.a(java.lang.Long.valueOf(this.trace_id), java.lang.Long.valueOf(ilinkC2CDownloadResult.trace_id));
    }

    public long getEnQueuetime() {
        return this.en_queuetime;
    }

    public long getEndTime() {
        return this.end_time;
    }

    public int getErrorCode() {
        return this.error_code;
    }

    public long getFileSize() {
        return this.file_size;
    }

    public long getRecvedBytes() {
        return this.recved_bytes;
    }

    public long getStartTime() {
        return this.start_time;
    }

    public int getSvrfallbackCount() {
        return this.svrfallback_count;
    }

    public java.lang.String getTaskIdent() {
        return this.hasSetFields[2] ? this.task_ident : "";
    }

    public long getTraceId() {
        return this.trace_id;
    }

    public boolean hasEnQueuetime() {
        return hasFieldNumber(5);
    }

    public boolean hasEndTime() {
        return hasFieldNumber(7);
    }

    public boolean hasErrorCode() {
        return hasFieldNumber(1);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasFileSize() {
        return hasFieldNumber(3);
    }

    public boolean hasRecvedBytes() {
        return hasFieldNumber(4);
    }

    public boolean hasStartTime() {
        return hasFieldNumber(6);
    }

    public boolean hasSvrfallbackCount() {
        return hasFieldNumber(8);
    }

    public boolean hasTaskIdent() {
        return hasFieldNumber(2);
    }

    public boolean hasTraceId() {
        return hasFieldNumber(9);
    }

    public com.tencent.ilink.network.IlinkC2CDownloadResult mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.network.IlinkC2CDownloadResult();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.error_code);
            }
            java.lang.String str = this.task_ident;
            if (str != null && this.hasSetFields[2]) {
                fVar.j(2, str);
            }
            if (this.hasSetFields[3]) {
                fVar.h(3, this.file_size);
            }
            if (this.hasSetFields[4]) {
                fVar.h(4, this.recved_bytes);
            }
            if (this.hasSetFields[5]) {
                fVar.h(5, this.en_queuetime);
            }
            if (this.hasSetFields[6]) {
                fVar.h(6, this.start_time);
            }
            if (this.hasSetFields[7]) {
                fVar.h(7, this.end_time);
            }
            if (this.hasSetFields[8]) {
                fVar.e(8, this.svrfallback_count);
            }
            if (this.hasSetFields[9]) {
                fVar.h(9, this.trace_id);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.error_code) : 0;
            java.lang.String str2 = this.task_ident;
            if (str2 != null && this.hasSetFields[2]) {
                e17 += b36.f.j(2, str2);
            }
            if (this.hasSetFields[3]) {
                e17 += b36.f.h(3, this.file_size);
            }
            if (this.hasSetFields[4]) {
                e17 += b36.f.h(4, this.recved_bytes);
            }
            if (this.hasSetFields[5]) {
                e17 += b36.f.h(5, this.en_queuetime);
            }
            if (this.hasSetFields[6]) {
                e17 += b36.f.h(6, this.start_time);
            }
            if (this.hasSetFields[7]) {
                e17 += b36.f.h(7, this.end_time);
            }
            if (this.hasSetFields[8]) {
                e17 += b36.f.e(8, this.svrfallback_count);
            }
            return this.hasSetFields[9] ? e17 + b36.f.h(9, this.trace_id) : e17;
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
                this.error_code = aVar2.g(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.task_ident = aVar2.k(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.file_size = aVar2.i(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.recved_bytes = aVar2.i(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.en_queuetime = aVar2.i(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.start_time = aVar2.i(intValue);
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.end_time = aVar2.i(intValue);
                this.hasSetFields[7] = true;
                return 0;
            case 8:
                this.svrfallback_count = aVar2.g(intValue);
                this.hasSetFields[8] = true;
                return 0;
            case 9:
                this.trace_id = aVar2.i(intValue);
                this.hasSetFields[9] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.ilink.network.IlinkC2CDownloadResult setEnQueuetime(long j17) {
        this.en_queuetime = j17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadResult setEndTime(long j17) {
        this.end_time = j17;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadResult setErrorCode(int i17) {
        this.error_code = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadResult setFileSize(long j17) {
        this.file_size = j17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadResult setRecvedBytes(long j17) {
        this.recved_bytes = j17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadResult setStartTime(long j17) {
        this.start_time = j17;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadResult setSvrfallbackCount(int i17) {
        this.svrfallback_count = i17;
        this.hasSetFields[8] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadResult setTaskIdent(java.lang.String str) {
        this.task_ident = str;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadResult setTraceId(long j17) {
        this.trace_id = j17;
        this.hasSetFields[9] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadResult mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.network.IlinkC2CDownloadResult parseFrom(byte[] bArr) {
        return (com.tencent.ilink.network.IlinkC2CDownloadResult) super.parseFrom(bArr);
    }
}
