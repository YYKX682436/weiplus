package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class Cost extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.Cost DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.Cost();
    private long begin_unix_timestamp;
    private int connect_ms;
    private long connect_unix_timestamp;
    private int dns_ms;
    private long end_unix_timestamp;
    private final boolean[] hasSetFields = new boolean[10];
    private int queue_ms;
    private int response_all_ms;
    private int response_wait_ms;
    private int total_ms;

    public static com.tencent.mars.cdn.proto.Cost create() {
        return new com.tencent.mars.cdn.proto.Cost();
    }

    public static com.tencent.mars.cdn.proto.Cost getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.Cost newBuilder() {
        return new com.tencent.mars.cdn.proto.Cost();
    }

    public com.tencent.mars.cdn.proto.Cost build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.Cost)) {
            return false;
        }
        com.tencent.mars.cdn.proto.Cost cost = (com.tencent.mars.cdn.proto.Cost) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.queue_ms), java.lang.Integer.valueOf(cost.queue_ms)) && n51.f.a(java.lang.Integer.valueOf(this.dns_ms), java.lang.Integer.valueOf(cost.dns_ms)) && n51.f.a(java.lang.Integer.valueOf(this.connect_ms), java.lang.Integer.valueOf(cost.connect_ms)) && n51.f.a(java.lang.Integer.valueOf(this.response_wait_ms), java.lang.Integer.valueOf(cost.response_wait_ms)) && n51.f.a(java.lang.Integer.valueOf(this.response_all_ms), java.lang.Integer.valueOf(cost.response_all_ms)) && n51.f.a(java.lang.Long.valueOf(this.begin_unix_timestamp), java.lang.Long.valueOf(cost.begin_unix_timestamp)) && n51.f.a(java.lang.Long.valueOf(this.connect_unix_timestamp), java.lang.Long.valueOf(cost.connect_unix_timestamp)) && n51.f.a(java.lang.Long.valueOf(this.end_unix_timestamp), java.lang.Long.valueOf(cost.end_unix_timestamp)) && n51.f.a(java.lang.Integer.valueOf(this.total_ms), java.lang.Integer.valueOf(cost.total_ms));
    }

    public long getBeginUnixTimestamp() {
        return this.begin_unix_timestamp;
    }

    public int getConnectMs() {
        return this.connect_ms;
    }

    public long getConnectUnixTimestamp() {
        return this.connect_unix_timestamp;
    }

    public int getDnsMs() {
        return this.dns_ms;
    }

    public long getEndUnixTimestamp() {
        return this.end_unix_timestamp;
    }

    public int getQueueMs() {
        return this.queue_ms;
    }

    public int getResponseAllMs() {
        return this.response_all_ms;
    }

    public int getResponseWaitMs() {
        return this.response_wait_ms;
    }

    public int getTotalMs() {
        return this.total_ms;
    }

    public boolean hasBeginUnixTimestamp() {
        return hasFieldNumber(6);
    }

    public boolean hasConnectMs() {
        return hasFieldNumber(3);
    }

    public boolean hasConnectUnixTimestamp() {
        return hasFieldNumber(7);
    }

    public boolean hasDnsMs() {
        return hasFieldNumber(2);
    }

    public boolean hasEndUnixTimestamp() {
        return hasFieldNumber(8);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasQueueMs() {
        return hasFieldNumber(1);
    }

    public boolean hasResponseAllMs() {
        return hasFieldNumber(5);
    }

    public boolean hasResponseWaitMs() {
        return hasFieldNumber(4);
    }

    public boolean hasTotalMs() {
        return hasFieldNumber(9);
    }

    public com.tencent.mars.cdn.proto.Cost mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.Cost();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.queue_ms);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.dns_ms);
            }
            if (this.hasSetFields[3]) {
                fVar.e(3, this.connect_ms);
            }
            if (this.hasSetFields[4]) {
                fVar.e(4, this.response_wait_ms);
            }
            if (this.hasSetFields[5]) {
                fVar.e(5, this.response_all_ms);
            }
            if (this.hasSetFields[6]) {
                fVar.h(6, this.begin_unix_timestamp);
            }
            if (this.hasSetFields[7]) {
                fVar.h(7, this.connect_unix_timestamp);
            }
            if (this.hasSetFields[8]) {
                fVar.h(8, this.end_unix_timestamp);
            }
            if (this.hasSetFields[9]) {
                fVar.e(9, this.total_ms);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.queue_ms) : 0;
            if (this.hasSetFields[2]) {
                e17 += b36.f.e(2, this.dns_ms);
            }
            if (this.hasSetFields[3]) {
                e17 += b36.f.e(3, this.connect_ms);
            }
            if (this.hasSetFields[4]) {
                e17 += b36.f.e(4, this.response_wait_ms);
            }
            if (this.hasSetFields[5]) {
                e17 += b36.f.e(5, this.response_all_ms);
            }
            if (this.hasSetFields[6]) {
                e17 += b36.f.h(6, this.begin_unix_timestamp);
            }
            if (this.hasSetFields[7]) {
                e17 += b36.f.h(7, this.connect_unix_timestamp);
            }
            if (this.hasSetFields[8]) {
                e17 += b36.f.h(8, this.end_unix_timestamp);
            }
            return this.hasSetFields[9] ? e17 + b36.f.e(9, this.total_ms) : e17;
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
                this.queue_ms = aVar2.g(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.dns_ms = aVar2.g(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.connect_ms = aVar2.g(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.response_wait_ms = aVar2.g(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.response_all_ms = aVar2.g(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.begin_unix_timestamp = aVar2.i(intValue);
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.connect_unix_timestamp = aVar2.i(intValue);
                this.hasSetFields[7] = true;
                return 0;
            case 8:
                this.end_unix_timestamp = aVar2.i(intValue);
                this.hasSetFields[8] = true;
                return 0;
            case 9:
                this.total_ms = aVar2.g(intValue);
                this.hasSetFields[9] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mars.cdn.proto.Cost setBeginUnixTimestamp(long j17) {
        this.begin_unix_timestamp = j17;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Cost setConnectMs(int i17) {
        this.connect_ms = i17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Cost setConnectUnixTimestamp(long j17) {
        this.connect_unix_timestamp = j17;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Cost setDnsMs(int i17) {
        this.dns_ms = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Cost setEndUnixTimestamp(long j17) {
        this.end_unix_timestamp = j17;
        this.hasSetFields[8] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Cost setQueueMs(int i17) {
        this.queue_ms = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Cost setResponseAllMs(int i17) {
        this.response_all_ms = i17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Cost setResponseWaitMs(int i17) {
        this.response_wait_ms = i17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Cost setTotalMs(int i17) {
        this.total_ms = i17;
        this.hasSetFields[9] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Cost mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.Cost parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.Cost) super.parseFrom(bArr);
    }
}
