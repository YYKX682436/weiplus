package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class TaskControlOptions extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.TaskControlOptions DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.TaskControlOptions();
    private boolean bind_cellular;
    private boolean disable_safecdn;
    private final boolean[] hasSetFields = new boolean[8];
    private int max_cellular_transfer_mb;
    private int max_cellular_transfer_multiplier;
    private int parallel_count;
    private int retry_count;
    private int timeout_seconds;

    public static com.tencent.mars.cdn.proto.TaskControlOptions create() {
        return new com.tencent.mars.cdn.proto.TaskControlOptions();
    }

    public static com.tencent.mars.cdn.proto.TaskControlOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.TaskControlOptions newBuilder() {
        return new com.tencent.mars.cdn.proto.TaskControlOptions();
    }

    public com.tencent.mars.cdn.proto.TaskControlOptions build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.TaskControlOptions)) {
            return false;
        }
        com.tencent.mars.cdn.proto.TaskControlOptions taskControlOptions = (com.tencent.mars.cdn.proto.TaskControlOptions) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.timeout_seconds), java.lang.Integer.valueOf(taskControlOptions.timeout_seconds)) && n51.f.a(java.lang.Integer.valueOf(this.retry_count), java.lang.Integer.valueOf(taskControlOptions.retry_count)) && n51.f.a(java.lang.Integer.valueOf(this.parallel_count), java.lang.Integer.valueOf(taskControlOptions.parallel_count)) && n51.f.a(java.lang.Boolean.valueOf(this.bind_cellular), java.lang.Boolean.valueOf(taskControlOptions.bind_cellular)) && n51.f.a(java.lang.Boolean.valueOf(this.disable_safecdn), java.lang.Boolean.valueOf(taskControlOptions.disable_safecdn)) && n51.f.a(java.lang.Integer.valueOf(this.max_cellular_transfer_multiplier), java.lang.Integer.valueOf(taskControlOptions.max_cellular_transfer_multiplier)) && n51.f.a(java.lang.Integer.valueOf(this.max_cellular_transfer_mb), java.lang.Integer.valueOf(taskControlOptions.max_cellular_transfer_mb));
    }

    public boolean getBindCellular() {
        return this.bind_cellular;
    }

    public boolean getDisableSafecdn() {
        return this.disable_safecdn;
    }

    public int getMaxCellularTransferMb() {
        return this.max_cellular_transfer_mb;
    }

    public int getMaxCellularTransferMultiplier() {
        return this.max_cellular_transfer_multiplier;
    }

    public int getParallelCount() {
        return this.parallel_count;
    }

    public int getRetryCount() {
        return this.retry_count;
    }

    public int getTimeoutSeconds() {
        return this.timeout_seconds;
    }

    public boolean hasBindCellular() {
        return hasFieldNumber(4);
    }

    public boolean hasDisableSafecdn() {
        return hasFieldNumber(5);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasMaxCellularTransferMb() {
        return hasFieldNumber(7);
    }

    public boolean hasMaxCellularTransferMultiplier() {
        return hasFieldNumber(6);
    }

    public boolean hasParallelCount() {
        return hasFieldNumber(3);
    }

    public boolean hasRetryCount() {
        return hasFieldNumber(2);
    }

    public boolean hasTimeoutSeconds() {
        return hasFieldNumber(1);
    }

    public com.tencent.mars.cdn.proto.TaskControlOptions mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.TaskControlOptions();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.timeout_seconds);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.retry_count);
            }
            if (this.hasSetFields[3]) {
                fVar.e(3, this.parallel_count);
            }
            if (this.hasSetFields[4]) {
                fVar.a(4, this.bind_cellular);
            }
            if (this.hasSetFields[5]) {
                fVar.a(5, this.disable_safecdn);
            }
            if (this.hasSetFields[6]) {
                fVar.e(6, this.max_cellular_transfer_multiplier);
            }
            if (this.hasSetFields[7]) {
                fVar.e(7, this.max_cellular_transfer_mb);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.timeout_seconds) : 0;
            if (this.hasSetFields[2]) {
                e17 += b36.f.e(2, this.retry_count);
            }
            if (this.hasSetFields[3]) {
                e17 += b36.f.e(3, this.parallel_count);
            }
            if (this.hasSetFields[4]) {
                e17 += b36.f.a(4, this.bind_cellular);
            }
            if (this.hasSetFields[5]) {
                e17 += b36.f.a(5, this.disable_safecdn);
            }
            if (this.hasSetFields[6]) {
                e17 += b36.f.e(6, this.max_cellular_transfer_multiplier);
            }
            return this.hasSetFields[7] ? e17 + b36.f.e(7, this.max_cellular_transfer_mb) : e17;
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
                this.timeout_seconds = aVar2.g(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.retry_count = aVar2.g(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.parallel_count = aVar2.g(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.bind_cellular = aVar2.c(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.disable_safecdn = aVar2.c(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.max_cellular_transfer_multiplier = aVar2.g(intValue);
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.max_cellular_transfer_mb = aVar2.g(intValue);
                this.hasSetFields[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mars.cdn.proto.TaskControlOptions setBindCellular(boolean z17) {
        this.bind_cellular = z17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.TaskControlOptions setDisableSafecdn(boolean z17) {
        this.disable_safecdn = z17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.TaskControlOptions setMaxCellularTransferMb(int i17) {
        this.max_cellular_transfer_mb = i17;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.TaskControlOptions setMaxCellularTransferMultiplier(int i17) {
        this.max_cellular_transfer_multiplier = i17;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.TaskControlOptions setParallelCount(int i17) {
        this.parallel_count = i17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.TaskControlOptions setRetryCount(int i17) {
        this.retry_count = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.TaskControlOptions setTimeoutSeconds(int i17) {
        this.timeout_seconds = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.TaskControlOptions mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.TaskControlOptions parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.TaskControlOptions) super.parseFrom(bArr);
    }
}
