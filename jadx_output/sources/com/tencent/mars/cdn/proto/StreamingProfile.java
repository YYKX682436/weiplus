package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class StreamingProfile extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.StreamingProfile DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.StreamingProfile();
    private int avg_request_cost;
    private long avg_request_size;
    private int first_request_cost;
    private long first_request_download_size;
    private long first_request_size;
    private final boolean[] hasSetFields = new boolean[15];
    private boolean is_first_request_completed;
    private boolean is_moov_completed;
    private int moov_cost;
    private int moov_fail_reason;
    private int moov_request_times;
    private int moov_size;
    private int request_completed_count;
    private int request_timeout_count;
    private int request_total_count;

    public static com.tencent.mars.cdn.proto.StreamingProfile create() {
        return new com.tencent.mars.cdn.proto.StreamingProfile();
    }

    public static com.tencent.mars.cdn.proto.StreamingProfile getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.StreamingProfile newBuilder() {
        return new com.tencent.mars.cdn.proto.StreamingProfile();
    }

    public com.tencent.mars.cdn.proto.StreamingProfile build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.StreamingProfile)) {
            return false;
        }
        com.tencent.mars.cdn.proto.StreamingProfile streamingProfile = (com.tencent.mars.cdn.proto.StreamingProfile) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.first_request_cost), java.lang.Integer.valueOf(streamingProfile.first_request_cost)) && n51.f.a(java.lang.Long.valueOf(this.first_request_size), java.lang.Long.valueOf(streamingProfile.first_request_size)) && n51.f.a(java.lang.Long.valueOf(this.first_request_download_size), java.lang.Long.valueOf(streamingProfile.first_request_download_size)) && n51.f.a(java.lang.Boolean.valueOf(this.is_first_request_completed), java.lang.Boolean.valueOf(streamingProfile.is_first_request_completed)) && n51.f.a(java.lang.Integer.valueOf(this.moov_request_times), java.lang.Integer.valueOf(streamingProfile.moov_request_times)) && n51.f.a(java.lang.Integer.valueOf(this.moov_cost), java.lang.Integer.valueOf(streamingProfile.moov_cost)) && n51.f.a(java.lang.Integer.valueOf(this.moov_size), java.lang.Integer.valueOf(streamingProfile.moov_size)) && n51.f.a(java.lang.Boolean.valueOf(this.is_moov_completed), java.lang.Boolean.valueOf(streamingProfile.is_moov_completed)) && n51.f.a(java.lang.Integer.valueOf(this.moov_fail_reason), java.lang.Integer.valueOf(streamingProfile.moov_fail_reason)) && n51.f.a(java.lang.Long.valueOf(this.avg_request_size), java.lang.Long.valueOf(streamingProfile.avg_request_size)) && n51.f.a(java.lang.Integer.valueOf(this.avg_request_cost), java.lang.Integer.valueOf(streamingProfile.avg_request_cost)) && n51.f.a(java.lang.Integer.valueOf(this.request_total_count), java.lang.Integer.valueOf(streamingProfile.request_total_count)) && n51.f.a(java.lang.Integer.valueOf(this.request_completed_count), java.lang.Integer.valueOf(streamingProfile.request_completed_count)) && n51.f.a(java.lang.Integer.valueOf(this.request_timeout_count), java.lang.Integer.valueOf(streamingProfile.request_timeout_count));
    }

    public int getAvgRequestCost() {
        return this.avg_request_cost;
    }

    public long getAvgRequestSize() {
        return this.avg_request_size;
    }

    public int getFirstRequestCost() {
        return this.first_request_cost;
    }

    public long getFirstRequestDownloadSize() {
        return this.first_request_download_size;
    }

    public long getFirstRequestSize() {
        return this.first_request_size;
    }

    public boolean getIsFirstRequestCompleted() {
        return this.is_first_request_completed;
    }

    public boolean getIsMoovCompleted() {
        return this.is_moov_completed;
    }

    public int getMoovCost() {
        return this.moov_cost;
    }

    public int getMoovFailReason() {
        return this.moov_fail_reason;
    }

    public int getMoovRequestTimes() {
        return this.moov_request_times;
    }

    public int getMoovSize() {
        return this.moov_size;
    }

    public int getRequestCompletedCount() {
        return this.request_completed_count;
    }

    public int getRequestTimeoutCount() {
        return this.request_timeout_count;
    }

    public int getRequestTotalCount() {
        return this.request_total_count;
    }

    public boolean hasAvgRequestCost() {
        return hasFieldNumber(11);
    }

    public boolean hasAvgRequestSize() {
        return hasFieldNumber(10);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasFirstRequestCost() {
        return hasFieldNumber(1);
    }

    public boolean hasFirstRequestDownloadSize() {
        return hasFieldNumber(3);
    }

    public boolean hasFirstRequestSize() {
        return hasFieldNumber(2);
    }

    public boolean hasIsFirstRequestCompleted() {
        return hasFieldNumber(4);
    }

    public boolean hasIsMoovCompleted() {
        return hasFieldNumber(8);
    }

    public boolean hasMoovCost() {
        return hasFieldNumber(6);
    }

    public boolean hasMoovFailReason() {
        return hasFieldNumber(9);
    }

    public boolean hasMoovRequestTimes() {
        return hasFieldNumber(5);
    }

    public boolean hasMoovSize() {
        return hasFieldNumber(7);
    }

    public boolean hasRequestCompletedCount() {
        return hasFieldNumber(13);
    }

    public boolean hasRequestTimeoutCount() {
        return hasFieldNumber(14);
    }

    public boolean hasRequestTotalCount() {
        return hasFieldNumber(12);
    }

    public com.tencent.mars.cdn.proto.StreamingProfile mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.StreamingProfile();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.first_request_cost);
            }
            if (this.hasSetFields[2]) {
                fVar.h(2, this.first_request_size);
            }
            if (this.hasSetFields[3]) {
                fVar.h(3, this.first_request_download_size);
            }
            if (this.hasSetFields[4]) {
                fVar.a(4, this.is_first_request_completed);
            }
            if (this.hasSetFields[5]) {
                fVar.e(5, this.moov_request_times);
            }
            if (this.hasSetFields[6]) {
                fVar.e(6, this.moov_cost);
            }
            if (this.hasSetFields[7]) {
                fVar.e(7, this.moov_size);
            }
            if (this.hasSetFields[8]) {
                fVar.a(8, this.is_moov_completed);
            }
            if (this.hasSetFields[9]) {
                fVar.e(9, this.moov_fail_reason);
            }
            if (this.hasSetFields[10]) {
                fVar.h(10, this.avg_request_size);
            }
            if (this.hasSetFields[11]) {
                fVar.e(11, this.avg_request_cost);
            }
            if (this.hasSetFields[12]) {
                fVar.e(12, this.request_total_count);
            }
            if (this.hasSetFields[13]) {
                fVar.e(13, this.request_completed_count);
            }
            if (!this.hasSetFields[14]) {
                return 0;
            }
            fVar.e(14, this.request_timeout_count);
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? b36.f.e(1, this.first_request_cost) + 0 : 0;
            if (this.hasSetFields[2]) {
                e17 += b36.f.h(2, this.first_request_size);
            }
            if (this.hasSetFields[3]) {
                e17 += b36.f.h(3, this.first_request_download_size);
            }
            if (this.hasSetFields[4]) {
                e17 += b36.f.a(4, this.is_first_request_completed);
            }
            if (this.hasSetFields[5]) {
                e17 += b36.f.e(5, this.moov_request_times);
            }
            if (this.hasSetFields[6]) {
                e17 += b36.f.e(6, this.moov_cost);
            }
            if (this.hasSetFields[7]) {
                e17 += b36.f.e(7, this.moov_size);
            }
            if (this.hasSetFields[8]) {
                e17 += b36.f.a(8, this.is_moov_completed);
            }
            if (this.hasSetFields[9]) {
                e17 += b36.f.e(9, this.moov_fail_reason);
            }
            if (this.hasSetFields[10]) {
                e17 += b36.f.h(10, this.avg_request_size);
            }
            if (this.hasSetFields[11]) {
                e17 += b36.f.e(11, this.avg_request_cost);
            }
            if (this.hasSetFields[12]) {
                e17 += b36.f.e(12, this.request_total_count);
            }
            if (this.hasSetFields[13]) {
                e17 += b36.f.e(13, this.request_completed_count);
            }
            return this.hasSetFields[14] ? e17 + b36.f.e(14, this.request_timeout_count) : e17;
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
                this.first_request_cost = aVar2.g(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.first_request_size = aVar2.i(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.first_request_download_size = aVar2.i(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.is_first_request_completed = aVar2.c(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.moov_request_times = aVar2.g(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.moov_cost = aVar2.g(intValue);
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.moov_size = aVar2.g(intValue);
                this.hasSetFields[7] = true;
                return 0;
            case 8:
                this.is_moov_completed = aVar2.c(intValue);
                this.hasSetFields[8] = true;
                return 0;
            case 9:
                this.moov_fail_reason = aVar2.g(intValue);
                this.hasSetFields[9] = true;
                return 0;
            case 10:
                this.avg_request_size = aVar2.i(intValue);
                this.hasSetFields[10] = true;
                return 0;
            case 11:
                this.avg_request_cost = aVar2.g(intValue);
                this.hasSetFields[11] = true;
                return 0;
            case 12:
                this.request_total_count = aVar2.g(intValue);
                this.hasSetFields[12] = true;
                return 0;
            case 13:
                this.request_completed_count = aVar2.g(intValue);
                this.hasSetFields[13] = true;
                return 0;
            case 14:
                this.request_timeout_count = aVar2.g(intValue);
                this.hasSetFields[14] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mars.cdn.proto.StreamingProfile setAvgRequestCost(int i17) {
        this.avg_request_cost = i17;
        this.hasSetFields[11] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.StreamingProfile setAvgRequestSize(long j17) {
        this.avg_request_size = j17;
        this.hasSetFields[10] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.StreamingProfile setFirstRequestCost(int i17) {
        this.first_request_cost = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.StreamingProfile setFirstRequestDownloadSize(long j17) {
        this.first_request_download_size = j17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.StreamingProfile setFirstRequestSize(long j17) {
        this.first_request_size = j17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.StreamingProfile setIsFirstRequestCompleted(boolean z17) {
        this.is_first_request_completed = z17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.StreamingProfile setIsMoovCompleted(boolean z17) {
        this.is_moov_completed = z17;
        this.hasSetFields[8] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.StreamingProfile setMoovCost(int i17) {
        this.moov_cost = i17;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.StreamingProfile setMoovFailReason(int i17) {
        this.moov_fail_reason = i17;
        this.hasSetFields[9] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.StreamingProfile setMoovRequestTimes(int i17) {
        this.moov_request_times = i17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.StreamingProfile setMoovSize(int i17) {
        this.moov_size = i17;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.StreamingProfile setRequestCompletedCount(int i17) {
        this.request_completed_count = i17;
        this.hasSetFields[13] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.StreamingProfile setRequestTimeoutCount(int i17) {
        this.request_timeout_count = i17;
        this.hasSetFields[14] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.StreamingProfile setRequestTotalCount(int i17) {
        this.request_total_count = i17;
        this.hasSetFields[12] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.StreamingProfile mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.StreamingProfile parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.StreamingProfile) super.parseFrom(bArr);
    }
}
